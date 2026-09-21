package p041e3;

import F3.q;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import k3.a;
import k3.d;
import p013b3.c;
import p058g3.b;

public final class m implements b {

    public final int f21406a;

    @Override
    public final Object get() {
        switch (this.f21406a) {
            case 0:
                return new q(1, Executors.newSingleThreadExecutor());
            default:
                V1.b bVar = new V1.b(24);
                HashMap map = new HashMap();
                c cVar = c.f17869h;
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(cVar, new k3.b(30000L, 86400000L, set));
                c cVar2 = c.j;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(cVar2, new k3.b(1000L, 86400000L, set));
                c cVar3 = c.f17870i;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(d.f24447i)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(cVar3, new k3.b(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() < c.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new a(bVar, map);
        }
    }
}
