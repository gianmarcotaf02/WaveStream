package D8;

import M8.C0685m;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class e {

    public static final C0273b[] f2524a;

    public static final Map f2525b;

    static {
        C0273b c0273b = new C0273b(C0273b.f2507i, "");
        C0685m c0685m = C0273b.f2505f;
        C0273b c0273b2 = new C0273b(c0685m, "GET");
        C0273b c0273b3 = new C0273b(c0685m, HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST);
        C0685m c0685m2 = C0273b.g;
        C0273b c0273b4 = new C0273b(c0685m2, "/");
        C0273b c0273b5 = new C0273b(c0685m2, "/index.html");
        C0685m c0685m3 = C0273b.f2506h;
        C0273b c0273b6 = new C0273b(c0685m3, "http");
        C0273b c0273b7 = new C0273b(c0685m3, "https");
        C0685m c0685m4 = C0273b.f2504e;
        C0273b[] c0273bArr = {c0273b, c0273b2, c0273b3, c0273b4, c0273b5, c0273b6, c0273b7, new C0273b(c0685m4, "200"), new C0273b(c0685m4, "204"), new C0273b(c0685m4, "206"), new C0273b(c0685m4, "304"), new C0273b(c0685m4, "400"), new C0273b(c0685m4, "404"), new C0273b(c0685m4, "500"), new C0273b("accept-charset", ""), new C0273b("accept-encoding", "gzip, deflate"), new C0273b("accept-language", ""), new C0273b("accept-ranges", ""), new C0273b("accept", ""), new C0273b("access-control-allow-origin", ""), new C0273b("age", ""), new C0273b("allow", ""), new C0273b("authorization", ""), new C0273b("cache-control", ""), new C0273b("content-disposition", ""), new C0273b("content-encoding", ""), new C0273b("content-language", ""), new C0273b("content-length", ""), new C0273b("content-location", ""), new C0273b("content-range", ""), new C0273b("content-type", ""), new C0273b("cookie", ""), new C0273b("date", ""), new C0273b("etag", ""), new C0273b("expect", ""), new C0273b("expires", ""), new C0273b("from", ""), new C0273b(DiagnosticsTracker.HOST_KEY, ""), new C0273b("if-match", ""), new C0273b("if-modified-since", ""), new C0273b("if-none-match", ""), new C0273b("if-range", ""), new C0273b("if-unmodified-since", ""), new C0273b("last-modified", ""), new C0273b("link", ""), new C0273b("location", ""), new C0273b("max-forwards", ""), new C0273b("proxy-authenticate", ""), new C0273b("proxy-authorization", ""), new C0273b("range", ""), new C0273b("referer", ""), new C0273b("refresh", ""), new C0273b("retry-after", ""), new C0273b("server", ""), new C0273b("set-cookie", ""), new C0273b("strict-transport-security", ""), new C0273b("transfer-encoding", ""), new C0273b("user-agent", ""), new C0273b("vary", ""), new C0273b("via", ""), new C0273b("www-authenticate", "")};
        f2524a = c0273bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i3 = 0; i3 < 61; i3++) {
            if (!linkedHashMap.containsKey(c0273bArr[i3].f2508a)) {
                linkedHashMap.put(c0273bArr[i3].f2508a, Integer.valueOf(i3));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.m.d(mapUnmodifiableMap, "unmodifiableMap(result)");
        f2525b = mapUnmodifiableMap;
    }

    public static void a(C0685m name) throws IOException {
        kotlin.jvm.internal.m.e(name, "name");
        int iD = name.d();
        for (int i3 = 0; i3 < iD; i3++) {
            byte bI = name.i(i3);
            if (65 <= bI && bI < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.r()));
            }
        }
    }
}
