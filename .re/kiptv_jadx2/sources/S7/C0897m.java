package S7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class C0897m extends k0 {

    public final int f9596l;

    public final C0895k f9597m;

    public C0897m(C0895k c0895k, int i3) {
        this.f9596l = i3;
        this.f9597m = c0895k;
    }

    @Override
    public final boolean i() {
        switch (this.f9596l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override
    public final void j(Throwable th) {
        switch (this.f9596l) {
            case 0:
                p0 p0VarH = h();
                C0895k c0895k = this.f9597m;
                Throwable thP = c0895k.p(p0VarH);
                if (c0895k.v()) {
                    X7.f fVar = (X7.f) c0895k.f9591k;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X7.f.f10909o;
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        N6.A a2 = X7.a.f10900c;
                        if (kotlin.jvm.internal.m.a(obj, a2)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, a2, thP)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != a2) {
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    }
                                }
                            }
                        }
                    }
                }
                c0895k.cancel(thP);
                if (!c0895k.v()) {
                    c0895k.l();
                }
                break;
            default:
                this.f9597m.resumeWith(p070h6.A.f22523a);
                break;
        }
    }
}
