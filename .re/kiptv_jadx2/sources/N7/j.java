package N7;

import java.util.Iterator;

public final class j implements m {

    public final m f7450a;

    public final p194x6.j f7451b;

    public final p194x6.j f7452c;

    public j(m sequence, p194x6.j transformer, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(sequence, "sequence");
        kotlin.jvm.internal.m.e(transformer, "transformer");
        this.f7450a = sequence;
        this.f7451b = transformer;
        this.f7452c = jVar;
    }

    @Override
    public final Iterator iterator() {
        return new h(this);
    }
}
