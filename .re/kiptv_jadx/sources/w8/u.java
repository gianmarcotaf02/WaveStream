package w8;

/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w8.o f30654a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w8.z f30657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.util.LinkedHashMap f30658e = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f30655b = "GET";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Z2.C1202m f30656c = new Z2.C1202m(2);

    public final w8.v a() {
        java.util.Map mapUnmodifiableMap;
        w8.o oVar = this.f30654a;
        if (oVar == null) {
            throw new java.lang.IllegalStateException("url == null");
        }
        java.lang.String str = this.f30655b;
        w8.m mVarE = this.f30656c.e();
        w8.z zVar = this.f30657d;
        java.util.LinkedHashMap linkedHashMap = this.f30658e;
        byte[] bArr = x8.b.f31716a;
        kotlin.jvm.internal.m.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = p078i6.x.f23206h;
        } else {
            mapUnmodifiableMap = java.util.Collections.unmodifiableMap(new java.util.LinkedHashMap(linkedHashMap));
            kotlin.jvm.internal.m.d(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new w8.v(oVar, str, mVarE, zVar, mapUnmodifiableMap);
    }

    public final void b(java.lang.String str, java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
        Z2.C1202m c1202m = this.f30656c;
        c1202m.getClass();
        com.google.common.util.concurrent.U.i0(str);
        com.google.common.util.concurrent.U.k0(value, str);
        c1202m.f(str);
        c1202m.d(str, value);
    }

    public final void c(java.lang.String method, w8.z zVar) {
        kotlin.jvm.internal.m.e(method, "method");
        if (method.length() <= 0) {
            throw new java.lang.IllegalArgumentException("method.isEmpty() == true");
        }
        if (zVar == null) {
            if (method.equals(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST) || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                throw new java.lang.IllegalArgumentException(Y6.f.h("method ", method, " must have a request body.").toString());
            }
        } else if (!p199y3.e.C(method)) {
            throw new java.lang.IllegalArgumentException(Y6.f.h("method ", method, " must not have a request body.").toString());
        }
        this.f30655b = method;
        this.f30657d = zVar;
    }

    public final void d(java.lang.String url) {
        kotlin.jvm.internal.m.e(url, "url");
        if (O7.x.x0(url, "ws:", true)) {
            java.lang.String strSubstring = url.substring(3);
            kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            url = "http:".concat(strSubstring);
        } else if (O7.x.x0(url, "wss:", true)) {
            java.lang.String strSubstring2 = url.substring(4);
            kotlin.jvm.internal.m.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
            url = "https:".concat(strSubstring2);
        }
        kotlin.jvm.internal.m.e(url, "<this>");
        w8.n nVar = new w8.n();
        nVar.c(null, url);
        this.f30654a = nVar.a();
    }
}
