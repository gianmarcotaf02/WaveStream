package w8;

import java.util.LinkedHashMap;
import java.util.Map;

public final class v {

    public final o f30659a;

    public final String f30660b;

    public final m f30661c;

    public final z f30662d;

    public final Map f30663e;

    public C3023c f30664f;

    public v(o url, String method, m mVar, z zVar, Map map) {
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(method, "method");
        this.f30659a = url;
        this.f30660b = method;
        this.f30661c = mVar;
        this.f30662d = zVar;
        this.f30663e = map;
    }

    public final u a() {
        u uVar = new u();
        uVar.f30658e = new LinkedHashMap();
        uVar.f30654a = this.f30659a;
        uVar.f30655b = this.f30660b;
        uVar.f30657d = this.f30662d;
        Map map = this.f30663e;
        uVar.f30658e = map.isEmpty() ? new LinkedHashMap() : p078i6.C.Z0(map);
        uVar.f30656c = this.f30661c.n();
        return uVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f30660b);
        sb.append(", url=");
        sb.append(this.f30659a);
        m mVar = this.f30661c;
        if (mVar.size() != 0) {
            sb.append(", headers=[");
            int i3 = 0;
            for (Object obj : mVar) {
                int i9 = i3 + 1;
                if (i3 < 0) {
                    p078i6.p.H0();
                    throw null;
                }
                p070h6.k kVar = (p070h6.k) obj;
                String str = (String) kVar.f22539h;
                String str2 = (String) kVar.f22540i;
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i3 = i9;
            }
            sb.append(']');
        }
        Map map = this.f30663e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
