package p028c8;

import X7.q;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p100l6.h;

public final class l extends q {

    public final AtomicReferenceArray f18536l;

    public l(long j, l lVar, int i3) {
        super(j, lVar, i3);
        this.f18536l = new AtomicReferenceArray(k.f18535f);
    }

    @Override
    public final int g() {
        return k.f18535f;
    }

    @Override
    public final void h(int i3, h hVar) {
        this.f18536l.set(i3, k.f18534e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.j + ", hashCode=" + hashCode() + ']';
    }
}
