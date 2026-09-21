package p041e3;

import D4.c;
import D4.d;
import D4.e;
import G4.a;
import java.util.Collections;
import java.util.HashMap;

public final class f implements d {

    public static final f f21383a = new f();

    public static final c f21384b;

    public static final c f21385c;

    static {
        a aVar = new a(1);
        HashMap map = new HashMap();
        map.put(G4.d.class, aVar);
        f21384b = new c("currentCacheSizeBytes", Collections.unmodifiableMap(new HashMap(map)));
        a aVar2 = new a(2);
        HashMap map2 = new HashMap();
        map2.put(G4.d.class, aVar2);
        f21385c = new c("maxCacheSizeBytes", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override
    public final void a(Object obj, Object obj2) {
        p067h3.f fVar = (p067h3.f) obj;
        e eVar = (e) obj2;
        eVar.a(f21384b, fVar.f22480a);
        eVar.a(f21385c, fVar.f22481b);
    }
}
