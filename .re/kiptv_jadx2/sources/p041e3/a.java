package p041e3;

import D4.c;
import D4.d;
import D4.e;
import java.util.Collections;
import java.util.HashMap;

public final class a implements d {

    public static final a f21369a = new a();

    public static final c f21370b;

    public static final c f21371c;

    public static final c f21372d;

    public static final c f21373e;

    static {
        G4.a aVar = new G4.a(1);
        HashMap map = new HashMap();
        map.put(G4.d.class, aVar);
        f21370b = new c("window", Collections.unmodifiableMap(new HashMap(map)));
        G4.a aVar2 = new G4.a(2);
        HashMap map2 = new HashMap();
        map2.put(G4.d.class, aVar2);
        f21371c = new c("logSourceMetrics", Collections.unmodifiableMap(new HashMap(map2)));
        G4.a aVar3 = new G4.a(3);
        HashMap map3 = new HashMap();
        map3.put(G4.d.class, aVar3);
        f21372d = new c("globalMetrics", Collections.unmodifiableMap(new HashMap(map3)));
        G4.a aVar4 = new G4.a(4);
        HashMap map4 = new HashMap();
        map4.put(G4.d.class, aVar4);
        f21373e = new c("appNamespace", Collections.unmodifiableMap(new HashMap(map4)));
    }

    @Override
    public final void a(Object obj, Object obj2) {
        p067h3.a aVar = (p067h3.a) obj;
        e eVar = (e) obj2;
        eVar.b(f21370b, aVar.f22462a);
        eVar.b(f21371c, aVar.f22463b);
        eVar.b(f21372d, aVar.f22464c);
        eVar.b(f21373e, aVar.f22465d);
    }
}
