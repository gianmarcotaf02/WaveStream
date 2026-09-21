package X7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b {

    public static final AtomicReferenceFieldUpdater f10904h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_next$volatile");

    public static final AtomicReferenceFieldUpdater f10905i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_prev$volatile");
    private volatile Object _next$volatile;
    private volatile Object _prev$volatile;

    public b(q qVar) {
        this._prev$volatile = qVar;
    }

    public final void a() {
        f10905i.set(this, null);
    }

    public final b c() {
        Object obj = f10904h.get(this);
        if (obj == a.f10898a) {
            return null;
        }
        return (b) obj;
    }

    public abstract boolean d();

    public final void e() {
        b bVarC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10905i;
            b bVar = (b) atomicReferenceFieldUpdater.get(this);
            while (bVar != null && bVar.d()) {
                bVar = (b) atomicReferenceFieldUpdater.get(bVar);
            }
            b bVarC2 = c();
            kotlin.jvm.internal.m.b(bVarC2);
            while (bVarC2.d() && (bVarC = bVarC2.c()) != null) {
                bVarC2 = bVarC;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(bVarC2);
                b bVar2 = ((b) obj) == null ? null : bVar;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(bVarC2, obj, bVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(bVarC2) != obj) {
                    }
                }
            }
            if (bVar != null) {
                f10904h.set(bVar, bVarC2);
            }
            if (!bVarC2.d() || bVarC2.c() == null) {
                if (bVar == null || !bVar.d()) {
                    return;
                }
            }
        }
    }
}
