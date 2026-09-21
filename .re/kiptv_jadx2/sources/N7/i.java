package N7;

import java.util.Iterator;

public final class i implements m {

    public final m f7447a;

    public final boolean f7448b;

    public final p194x6.j f7449c;

    public i(m mVar, boolean z6, p194x6.j predicate) {
        kotlin.jvm.internal.m.e(predicate, "predicate");
        this.f7447a = mVar;
        this.f7448b = z6;
        this.f7449c = predicate;
    }

    @Override
    public final Iterator iterator() {
        return new h(this);
    }
}
