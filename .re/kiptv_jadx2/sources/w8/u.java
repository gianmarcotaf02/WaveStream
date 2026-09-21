package w8;

import Z2.C1202m;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import com.google.common.util.concurrent.U;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class u {

    public o f30654a;

    public z f30657d;

    public LinkedHashMap f30658e = new LinkedHashMap();

    public String f30655b = "GET";

    public C1202m f30656c = new C1202m(2);

    public final v a() {
        Map mapUnmodifiableMap;
        o oVar = this.f30654a;
        if (oVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = this.f30655b;
        m mVarE = this.f30656c.e();
        z zVar = this.f30657d;
        LinkedHashMap linkedHashMap = this.f30658e;
        byte[] bArr = x8.b.f31716a;
        kotlin.jvm.internal.m.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = p078i6.x.f23206h;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            kotlin.jvm.internal.m.d(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new v(oVar, str, mVarE, zVar, mapUnmodifiableMap);
    }

    public final void b(String str, String value) {
        kotlin.jvm.internal.m.e(value, "value");
        C1202m c1202m = this.f30656c;
        c1202m.getClass();
        U.i0(str);
        U.k0(value, str);
        c1202m.f(str);
        c1202m.d(str, value);
    }

    public final void c(String method, z zVar) {
        kotlin.jvm.internal.m.e(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (zVar == null) {
            if (method.equals(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST) || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                throw new IllegalArgumentException(Y6.f.h("method ", method, " must have a request body.").toString());
            }
        } else if (!p199y3.e.C(method)) {
            throw new IllegalArgumentException(Y6.f.h("method ", method, " must not have a request body.").toString());
        }
        this.f30655b = method;
        this.f30657d = zVar;
    }

    public final void d(String url) {
        kotlin.jvm.internal.m.e(url, "url");
        if (O7.x.x0(url, "ws:", true)) {
            String strSubstring = url.substring(3);
            kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            url = "http:".concat(strSubstring);
        } else if (O7.x.x0(url, "wss:", true)) {
            String strSubstring2 = url.substring(4);
            kotlin.jvm.internal.m.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
            url = "https:".concat(strSubstring2);
        }
        kotlin.jvm.internal.m.e(url, "<this>");
        n nVar = new n();
        nVar.c(null, url);
        this.f30654a = nVar.a();
    }
}
