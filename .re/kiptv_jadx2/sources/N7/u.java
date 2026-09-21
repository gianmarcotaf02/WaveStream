package N7;

import D1.B;
import java.util.Iterator;

public final class u implements m {

    public final m f7470a;

    public final p194x6.j f7471b;

    public u(m sequence, p194x6.j transformer) {
        kotlin.jvm.internal.m.e(sequence, "sequence");
        kotlin.jvm.internal.m.e(transformer, "transformer");
        this.f7470a = sequence;
        this.f7471b = transformer;
    }

    @Override
    public final Iterator iterator() {
        return new B(this);
    }
}
