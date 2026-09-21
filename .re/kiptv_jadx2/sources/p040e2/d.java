package p040e2;

import V1.b;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;

public final class d extends b {
    public d(b initialExtras) {
        m.e(initialExtras, "initialExtras");
        LinkedHashMap initialExtras2 = initialExtras.f21365a;
        m.e(initialExtras2, "initialExtras");
        this.f21365a.putAll(initialExtras2);
    }

    @Override
    public final Object a(b bVar) {
        return this.f21365a.get(bVar);
    }

    public d(int i3) {
        this(a.f21364b);
    }
}
