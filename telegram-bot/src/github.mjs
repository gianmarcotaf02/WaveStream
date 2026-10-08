const DEFAULT_API = 'https://api.github.com'

export class GitHubError extends Error {
  constructor(message, { status, url } = {}) {
    super(message)
    this.name = 'GitHubError'
    this.status = status
    this.url = url
  }
}

/** Client minimalista (zero dipendenze) per la REST API pubblica di GitHub. */
export class GitHub {
  #repo
  #token
  #logger

  constructor({ repo, token = '', logger = console }) {
    this.#repo = repo
    this.#token = token
    this.#logger = logger
  }

  get repo() {
    return this.#repo
  }

  async #request(endpoint, { accept = 'application/vnd.github+json' } = {}) {
    const url = `${DEFAULT_API}/repos/${this.#repo}${endpoint}`
    const headers = {
      accept,
      'user-agent': 'wavestream-telegram-bot',
      'x-github-api-version': '2022-11-28',
    }
    if (this.#token) headers.authorization = `Bearer ${this.#token}`

    const controller = new AbortController()
    const timer = setTimeout(() => controller.abort(), 20000)
    let res
    try {
      res = await fetch(url, { headers, signal: controller.signal })
    } catch (err) {
      throw new GitHubError(`richiesta GitHub fallita: ${err.message}`, { url })
    } finally {
      clearTimeout(timer)
    }

    if (res.status === 404) return null
    if (!res.ok) {
      const text = await res.text().catch(() => '')
      throw new GitHubError(`GitHub ha risposto ${res.status}: ${text.slice(0, 300)}`, { status: res.status, url })
    }
    return res.json()
  }

  /** Normalizza la release in un oggetto stabile per il bot. */
  static normalize(json, { apkAssetName = 'WaveStream.apk', repo = '' } = {}) {
    if (!json) return null
    const assets = (json.assets ?? []).map((a) => ({
      name: a.name,
      size: a.size ?? 0,
      downloadUrl: a.browser_download_url,
      contentType: a.content_type,
    }))
    const apk = assets.find((a) => a.name.toLowerCase() === apkAssetName.toLowerCase())
    const apkLike = apk ?? assets.find((a) => a.name.toLowerCase().endsWith('.apk')) ?? null
    return {
      tag: json.tag_name,
      title: (json.name || json.tag_name || '').trim(),
      body: json.body ?? '',
      url: json.html_url,
      publishedAt: json.published_at ?? json.created_at ?? null,
      isPrerelease: Boolean(json.prerelease),
      isDraft: Boolean(json.draft),
      assets,
      apk: apkLike,
      apkUrl: apkLike?.downloadUrl ?? (repo ? `https://github.com/${repo}/releases/latest` : json.html_url),
    }
  }

  async getReleaseByTag(tag) {
    const json = await this.#request(`/releases/tags/${encodeURIComponent(tag)}`)
    return GitHub.normalize(json, { repo: this.#repo })
  }

  /** Ultima release (esclude draft e, di default, le prerelease). */
  async getLatestRelease({ includePrerelease = false, apkAssetName } = {}) {
    const list = await this.#request('/releases?per_page=15')
    if (!Array.isArray(list) || !list.length) return null
    const release = list.find(
      (r) => !r.draft && (includePrerelease || !r.prerelease) && r.tag_name
    )
    return release ? GitHub.normalize(release, { apkAssetName, repo: this.#repo }) : null
  }

  /** Ritorna la release per tag oppure l'ultima disponibile. */
  async resolve(tag, options = {}) {
    if (!tag || tag === 'latest' || tag === 'ultima') {
      return this.getLatestRelease(options)
    }
    return this.getReleaseByTag(tag.replace(/^v(?=\d)/, ''))
  }
}
