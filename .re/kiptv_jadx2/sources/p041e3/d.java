package p041e3;

import D4.c;
import G4.a;
import java.util.Collections;
import java.util.HashMap;
import p067h3.e;

public final class d implements D4.d {

    public static final d f21379a = new d();

    public static final c f21380b;

    public static final c f21381c;

    static {
        a aVar = new a(1);
        HashMap map = new HashMap();
        map.put(G4.d.class, aVar);
        f21380b = new c("logSource", Collections.unmodifiableMap(new HashMap(map)));
        a aVar2 = new a(2);
        HashMap map2 = new HashMap();
        map2.put(G4.d.class, aVar2);
        f21381c = new c("logEventDropped", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj;
        D4.e eVar2 = (D4.e) obj2;
        eVar2.b(f21380b, eVar.f22478a);
        eVar2.b(f21381c, eVar.f22479b);
    }
}
