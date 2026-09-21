package p041e3;

import D4.c;
import D4.d;
import D4.e;
import G4.a;
import java.util.Collections;
import java.util.HashMap;

public final class b implements d {

    public static final b f21374a = new b();

    public static final c f21375b;

    static {
        a aVar = new a(1);
        HashMap map = new HashMap();
        map.put(G4.d.class, aVar);
        f21375b = new c("storageMetrics", Collections.unmodifiableMap(new HashMap(map)));
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ((e) obj2).b(f21375b, ((p067h3.b) obj).f22466a);
    }
}
