package U7;

import S7.H0;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class s extends X7.q {

    public final j f10220l;

    public final AtomicReferenceArray f10221m;

    public s(long j, s sVar, j jVar, int i3) {
        super(j, sVar, i3);
        this.f10220l = jVar;
        this.f10221m = new AtomicReferenceArray(l.f10197b * 2);
    }

    @Override
    public final int g() {
        return l.f10197b;
    }

    @Override
    public final void h(int i3, p100l6.h hVar) {
        j jVar;
        int i9 = l.f10197b;
        boolean z6 = i3 >= i9;
        if (z6) {
            i3 -= i9;
        }
        this.f10221m.get(i3 * 2);
        while (true) {
            Object objL = l(i3);
            boolean z9 = objL instanceof H0;
            jVar = this.f10220l;
            if (z9 || (objL instanceof E)) {
                if (k(objL, i3, z6 ? l.j : l.f10204k)) {
                    n(i3, null);
                    m(i3, !z6);
                    if (z6) {
                        kotlin.jvm.internal.m.b(jVar);
                        return;
                    }
                    return;
                }
            } else {
                if (objL == l.j || objL == l.f10204k) {
                    break;
                }
                if (objL != l.g && objL != l.f10201f) {
                    if (objL != l.f10203i && objL != l.f10199d && objL != l.f10205l) {
                        throw new IllegalStateException(p121o0.p.n(objL, "unexpected state: "));
                    }
                    return;
                }
            }
        }
        n(i3, null);
        if (z6) {
            kotlin.jvm.internal.m.b(jVar);
        }
    }

    public final boolean k(Object obj, int i3, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f10221m;
        int i9 = (i3 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i9, obj, obj2)) {
            if (atomicReferenceArray.get(i9) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object l(int i3) {
        return this.f10221m.get((i3 * 2) + 1);
    }

    public final void m(int i3, boolean z6) {
        if (z6) {
            j jVar = this.f10220l;
            kotlin.jvm.internal.m.b(jVar);
            jVar.F((this.j * ((long) l.f10197b)) + ((long) i3));
        }
        i();
    }

    public final void n(int i3, Object obj) {
        this.f10221m.set(i3 * 2, obj);
    }

    public final void o(int i3, N6.A a2) {
        this.f10221m.set((i3 * 2) + 1, a2);
    }
}
