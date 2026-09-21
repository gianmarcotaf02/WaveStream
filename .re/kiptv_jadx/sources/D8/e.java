package D8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D8.C0273b[] f2524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.Map f2525b;

    static {
        D8.C0273b c0273b = new D8.C0273b(D8.C0273b.f2507i, "");
        M8.C0685m c0685m = D8.C0273b.f2505f;
        D8.C0273b c0273b2 = new D8.C0273b(c0685m, "GET");
        D8.C0273b c0273b3 = new D8.C0273b(c0685m, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST);
        M8.C0685m c0685m2 = D8.C0273b.g;
        D8.C0273b c0273b4 = new D8.C0273b(c0685m2, "/");
        D8.C0273b c0273b5 = new D8.C0273b(c0685m2, "/index.html");
        M8.C0685m c0685m3 = D8.C0273b.f2506h;
        D8.C0273b c0273b6 = new D8.C0273b(c0685m3, "http");
        D8.C0273b c0273b7 = new D8.C0273b(c0685m3, "https");
        M8.C0685m c0685m4 = D8.C0273b.f2504e;
        D8.C0273b[] c0273bArr = {c0273b, c0273b2, c0273b3, c0273b4, c0273b5, c0273b6, c0273b7, new D8.C0273b(c0685m4, "200"), new D8.C0273b(c0685m4, "204"), new D8.C0273b(c0685m4, "206"), new D8.C0273b(c0685m4, "304"), new D8.C0273b(c0685m4, "400"), new D8.C0273b(c0685m4, "404"), new D8.C0273b(c0685m4, "500"), new D8.C0273b("accept-charset", ""), new D8.C0273b("accept-encoding", "gzip, deflate"), new D8.C0273b("accept-language", ""), new D8.C0273b("accept-ranges", ""), new D8.C0273b("accept", ""), new D8.C0273b("access-control-allow-origin", ""), new D8.C0273b("age", ""), new D8.C0273b("allow", ""), new D8.C0273b("authorization", ""), new D8.C0273b("cache-control", ""), new D8.C0273b("content-disposition", ""), new D8.C0273b("content-encoding", ""), new D8.C0273b("content-language", ""), new D8.C0273b("content-length", ""), new D8.C0273b("content-location", ""), new D8.C0273b("content-range", ""), new D8.C0273b("content-type", ""), new D8.C0273b("cookie", ""), new D8.C0273b("date", ""), new D8.C0273b("etag", ""), new D8.C0273b("expect", ""), new D8.C0273b("expires", ""), new D8.C0273b("from", ""), new D8.C0273b(com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.HOST_KEY, ""), new D8.C0273b("if-match", ""), new D8.C0273b("if-modified-since", ""), new D8.C0273b("if-none-match", ""), new D8.C0273b("if-range", ""), new D8.C0273b("if-unmodified-since", ""), new D8.C0273b("last-modified", ""), new D8.C0273b("link", ""), new D8.C0273b("location", ""), new D8.C0273b("max-forwards", ""), new D8.C0273b("proxy-authenticate", ""), new D8.C0273b("proxy-authorization", ""), new D8.C0273b("range", ""), new D8.C0273b("referer", ""), new D8.C0273b("refresh", ""), new D8.C0273b("retry-after", ""), new D8.C0273b("server", ""), new D8.C0273b("set-cookie", ""), new D8.C0273b("strict-transport-security", ""), new D8.C0273b("transfer-encoding", ""), new D8.C0273b("user-agent", ""), new D8.C0273b("vary", ""), new D8.C0273b("via", ""), new D8.C0273b("www-authenticate", "")};
        f2524a = c0273bArr;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(61);
        for (int i3 = 0; i3 < 61; i3++) {
            if (!linkedHashMap.containsKey(c0273bArr[i3].f2508a)) {
                linkedHashMap.put(c0273bArr[i3].f2508a, java.lang.Integer.valueOf(i3));
            }
        }
        java.util.Map mapUnmodifiableMap = java.util.Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.m.d(mapUnmodifiableMap, "unmodifiableMap(result)");
        f2525b = mapUnmodifiableMap;
    }

    public static void a(M8.C0685m name) throws java.io.IOException {
        kotlin.jvm.internal.m.e(name, "name");
        int iD = name.d();
        for (int i3 = 0; i3 < iD; i3++) {
            byte bI = name.i(i3);
            if (65 <= bI && bI < 91) {
                throw new java.io.IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.r()));
            }
        }
    }
}
