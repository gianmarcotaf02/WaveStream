package t5;

/* JADX INFO: loaded from: classes4.dex */
public final class A1 extends android.webkit.WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f27808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f27809b;

    public A1(p020c0.X x9, p020c0.X x10) {
        this.f27808a = x9;
        this.f27809b = x10;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(android.webkit.WebView view, java.lang.String url) {
        kotlin.jvm.internal.m.e(view, "view");
        kotlin.jvm.internal.m.e(url, "url");
        if (url.equals("about:blank") || t5.O1.g(this.f27808a)) {
            return;
        }
        view.evaluateJavascript("\n(function() {\n  try {\n    var head = document.head || document.documentElement;\n    if (!head) return 'no-head';\n    var existing = document.getElementById('kiptv-clean');\n    // \"Still there\" means attached AND still carrying its rule: a re-created\n    // <head> leaves an orphan node behind that hides nothing, and the old\n    // id-only check reported that orphan as 'present' forever.\n    if (existing && existing.parentNode && existing.sheet && existing.sheet.cssRules.length) {\n      return 'present';\n    }\n    if (existing && existing.parentNode) existing.parentNode.removeChild(existing);\n    // Scoped by CLASS, not by the `movie_player` id: the id is not guaranteed\n    // on every embed build, and the previous version ABORTED the injection when\n    // it was missing ('no-player'), which left YouTube's chrome fully painted.\n    // No waiting for the player either — a stylesheet applies to nodes created\n    // later, so injecting early is what keeps the title header from flashing.\n    var notAd = ':not(.ad-showing):not(.ad-interrupting)';\n    // Both spellings of the player root, so neither the id nor the class going\n    // away on its own takes the whole cleanup down with it.\n    var scopes = ['.html5-video-player' + notAd, '#movie_player' + notAd];\n    // Structural rule: keep the video itself (plus captions, watermark and the\n    // ad module) and drop every other layer the player stacks on top. Survives\n    // YouTube renaming its ytp-* classes, which a fixed list does not.\n    var keep = ':not(video):not(.html5-video-container):not(.ytp-watermark)' +\n      ':not(.ytp-caption-window-container):not(.video-ads):not(.ytp-ad-module)' +\n      ':not(.ytp-spinner)';\n    var named = [\n      '.ytp-chrome-top', '.ytp-chrome-bottom', '.ytp-gradient-top', '.ytp-gradient-bottom',\n      '.ytp-large-play-button', '.ytp-bezel', '.ytp-bezel-text-wrapper',\n      '.ytp-pause-overlay', '.ytp-pause-overlay-container',\n      '.html5-endscreen', '.ytp-endscreen-content', '.ytp-ce-element',\n      '.ytp-cued-thumbnail-overlay', '.ytp-tooltip', '.ytp-doubletap-ui-legacy'\n    ];\n    var parts = [];\n    scopes.forEach(function(scope) {\n      parts.push(scope + ' > *' + keep);\n      named.forEach(function(s) { parts.push(scope + ' ' + s); });\n    });\n    var selector = parts.join(',');\n    var style = document.createElement('style');\n    style.id = 'kiptv-clean';\n    style.textContent = selector + '{display:none !important;opacity:0 !important;}';\n    head.appendChild(style);\n    // Reported back so the log shows what the player actually stacks on the\n    // video — the ground truth if something still shows through. `player` may\n    // legitimately be absent here (injected ahead of it), hence the guard.\n    var player = document.querySelector('.html5-video-player') ||\n      document.getElementById('movie_player');\n    var kids = [];\n    if (player) {\n      for (var i = 0; i < player.children.length; i++) {\n        var child = player.children[i];\n        var cls = child.className ? String(child.className) : child.tagName;\n        kids.push(cls.split(' ')[0]);\n      }\n    }\n    return 'injected id=' + (document.getElementById('movie_player') ? 'y' : 'n') +\n      ' player=' + (player ? 'y' : 'n') +\n      ' matches=' + document.querySelectorAll(selector).length +\n      ' kids=' + kids.join('|');\n  } catch (e) {\n    return 'error ' + String(e);\n  }\n})();\n", new t5.z1(1));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView view, java.lang.String url) {
        kotlin.jvm.internal.m.e(view, "view");
        kotlin.jvm.internal.m.e(url, "url");
        if (url.equals("about:blank")) {
            return;
        }
        android.util.Log.d("TvYouTube", "loaded url=" + url + " title=" + view.getTitle());
        if (t5.O1.g(this.f27808a)) {
            return;
        }
        view.evaluateJavascript("\n(function() {\n  try {\n    var head = document.head || document.documentElement;\n    if (!head) return 'no-head';\n    var existing = document.getElementById('kiptv-clean');\n    // \"Still there\" means attached AND still carrying its rule: a re-created\n    // <head> leaves an orphan node behind that hides nothing, and the old\n    // id-only check reported that orphan as 'present' forever.\n    if (existing && existing.parentNode && existing.sheet && existing.sheet.cssRules.length) {\n      return 'present';\n    }\n    if (existing && existing.parentNode) existing.parentNode.removeChild(existing);\n    // Scoped by CLASS, not by the `movie_player` id: the id is not guaranteed\n    // on every embed build, and the previous version ABORTED the injection when\n    // it was missing ('no-player'), which left YouTube's chrome fully painted.\n    // No waiting for the player either — a stylesheet applies to nodes created\n    // later, so injecting early is what keeps the title header from flashing.\n    var notAd = ':not(.ad-showing):not(.ad-interrupting)';\n    // Both spellings of the player root, so neither the id nor the class going\n    // away on its own takes the whole cleanup down with it.\n    var scopes = ['.html5-video-player' + notAd, '#movie_player' + notAd];\n    // Structural rule: keep the video itself (plus captions, watermark and the\n    // ad module) and drop every other layer the player stacks on top. Survives\n    // YouTube renaming its ytp-* classes, which a fixed list does not.\n    var keep = ':not(video):not(.html5-video-container):not(.ytp-watermark)' +\n      ':not(.ytp-caption-window-container):not(.video-ads):not(.ytp-ad-module)' +\n      ':not(.ytp-spinner)';\n    var named = [\n      '.ytp-chrome-top', '.ytp-chrome-bottom', '.ytp-gradient-top', '.ytp-gradient-bottom',\n      '.ytp-large-play-button', '.ytp-bezel', '.ytp-bezel-text-wrapper',\n      '.ytp-pause-overlay', '.ytp-pause-overlay-container',\n      '.html5-endscreen', '.ytp-endscreen-content', '.ytp-ce-element',\n      '.ytp-cued-thumbnail-overlay', '.ytp-tooltip', '.ytp-doubletap-ui-legacy'\n    ];\n    var parts = [];\n    scopes.forEach(function(scope) {\n      parts.push(scope + ' > *' + keep);\n      named.forEach(function(s) { parts.push(scope + ' ' + s); });\n    });\n    var selector = parts.join(',');\n    var style = document.createElement('style');\n    style.id = 'kiptv-clean';\n    style.textContent = selector + '{display:none !important;opacity:0 !important;}';\n    head.appendChild(style);\n    // Reported back so the log shows what the player actually stacks on the\n    // video — the ground truth if something still shows through. `player` may\n    // legitimately be absent here (injected ahead of it), hence the guard.\n    var player = document.querySelector('.html5-video-player') ||\n      document.getElementById('movie_player');\n    var kids = [];\n    if (player) {\n      for (var i = 0; i < player.children.length; i++) {\n        var child = player.children[i];\n        var cls = child.className ? String(child.className) : child.tagName;\n        kids.push(cls.split(' ')[0]);\n      }\n    }\n    return 'injected id=' + (document.getElementById('movie_player') ? 'y' : 'n') +\n      ' player=' + (player ? 'y' : 'n') +\n      ' matches=' + document.querySelectorAll(selector).length +\n      ' kids=' + kids.join('|');\n  } catch (e) {\n    return 'error ' + String(e);\n  }\n})();\n", new t5.z1(0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
        kotlin.jvm.internal.m.e(view, "view");
        kotlin.jvm.internal.m.e(request, "request");
        kotlin.jvm.internal.m.e(error, "error");
        if (request.isForMainFrame()) {
            android.util.Log.e("TvYouTube", "main-frame error " + error.getErrorCode() + ": " + ((java.lang.Object) error.getDescription()));
            java.util.Map map = t5.O1.f28024a;
            this.f27809b.setValue(java.lang.Boolean.TRUE);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceResponse errorResponse) {
        kotlin.jvm.internal.m.e(view, "view");
        kotlin.jvm.internal.m.e(request, "request");
        kotlin.jvm.internal.m.e(errorResponse, "errorResponse");
        if (request.isForMainFrame()) {
            android.util.Log.e("TvYouTube", "main-frame HTTP " + errorResponse.getStatusCode() + io.ktor.sse.ServerSentEventKt.SPACE + request.getUrl());
        }
    }
}
