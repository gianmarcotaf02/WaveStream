package p041e3;

import D4.d;
import D4.e;
import G4.a;
import io.sentry.clientreport.DiscardedEvent;
import java.util.Collections;
import java.util.HashMap;

public final class c implements d {

    public static final c f21376a = new c();

    public static final D4.c f21377b;

    public static final D4.c f21378c;

    static {
        a aVar = new a(1);
        HashMap map = new HashMap();
        map.put(G4.d.class, aVar);
        f21377b = new D4.c("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(map)));
        a aVar2 = new a(3);
        HashMap map2 = new HashMap();
        map2.put(G4.d.class, aVar2);
        f21378c = new D4.c(DiscardedEvent.JsonKeys.REASON, Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override
    public final void a(Object obj, Object obj2) {
        p067h3.d dVar = (p067h3.d) obj;
        e eVar = (e) obj2;
        eVar.a(f21377b, dVar.f22475a);
        eVar.b(f21378c, dVar.f22476b);
    }
}
