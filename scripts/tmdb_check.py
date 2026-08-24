"""
Fase 0 — Verifica TMDB end-to-end
Testa la chiave API hardcoded in TMDBService.kt:35
con gli endpoint trending/movie/week e trending/tv/week.
"""
import json, sys, urllib.request, urllib.error

API_KEY = "5f275659e4e6975d78d510255857dbf8"
BASE = "https://api.themoviedb.org/3"
TIMEOUT = 15

EXPECTED_MOVIE = ["id", "title", "original_title", "poster_path", "vote_average"]
EXPECTED_TV    = ["id", "name", "original_name", "poster_path", "vote_average"]

def hit(path, expect_fields):
    url = f"{BASE}{path}?api_key={API_KEY}&language=it-IT&page=1"
    print(f"GET {url}")
    try:
        with urllib.request.urlopen(url, timeout=TIMEOUT) as r:
            body = json.loads(r.read())
    except urllib.error.HTTPError as e:
        print(f"  FAIL HTTP {e.code} on {path}")
        return None
    except Exception as e:
        print(f"  FAIL network on {path}: {e}")
        return None
    if not body.get("results"):
        print(f"  FAIL empty results on {path}")
        return None
    first = body["results"][0]
    missing = [f for f in expect_fields if f not in first]
    if missing:
        print(f"  FAIL missing fields {missing} on first item of {path}")
        return None
    title = first.get("title") or first.get("name") or "(no title)"
    print(f"  OK  {path} -> {len(body['results'])} items, sample: id={first['id']}, title={title}")
    return body

print("=" * 60)
print("TMDB API SMOKE TEST")
print("=" * 60)

ok_m = hit("/trending/movie/week", EXPECTED_MOVIE)
print()
ok_t = hit("/trending/tv/week", EXPECTED_TV)

print()
print("=" * 60)
if ok_m and ok_t:
    with open("scripts/tmdb_trending_movie.json", "w", encoding="utf-8") as f:
        json.dump(ok_m, f, indent=2, ensure_ascii=False)
    with open("scripts/tmdb_trending_tv.json", "w", encoding="utf-8") as f:
        json.dump(ok_t, f, indent=2, ensure_ascii=False)
    print("RESULT: OK — saved samples to scripts/")
    sys.exit(0)
else:
    print("RESULT: FAIL — one or both endpoints failed")
    sys.exit(1)
