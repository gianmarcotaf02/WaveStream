package V7;

import W7.AbstractC1008b;
import W7.AbstractC1009c;
import W7.AbstractC1010d;
import java.util.concurrent.atomic.AtomicReference;

public final class o0 extends AbstractC1010d {

    public final AtomicReference f10497a = new AtomicReference(null);

    @Override
    public final boolean a(AbstractC1008b abstractC1008b) {
        AtomicReference atomicReference = this.f10497a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(r.f10509c);
        return true;
    }

    @Override
    public final p100l6.c[] b(AbstractC1008b abstractC1008b) {
        this.f10497a.set(null);
        return AbstractC1009c.f10730a;
    }
}
