package p041e3;

import D4.c;
import D4.d;
import D4.e;
import G4.a;
import java.util.Collections;
import java.util.HashMap;

public final class g implements d {

    public static final g f21386a = new g();

    public static final c f21387b;

    public static final c f21388c;

    static {
        a aVar = new a(1);
        HashMap map = new HashMap();
        map.put(G4.d.class, aVar);
        f21387b = new c("startMs", Collections.unmodifiableMap(new HashMap(map)));
        a aVar2 = new a(2);
        HashMap map2 = new HashMap();
        map2.put(G4.d.class, aVar2);
        f21388c = new c("endMs", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override
    public final void a(Object obj, Object obj2) {
        p067h3.g gVar = (p067h3.g) obj;
        e eVar = (e) obj2;
        eVar.a(f21387b, gVar.f22482a);
        eVar.a(f21388c, gVar.f22483b);
    }
}
