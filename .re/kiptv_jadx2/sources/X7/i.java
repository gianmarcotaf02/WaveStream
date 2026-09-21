package X7;

import S7.C;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class i {

    public static final AtomicReferenceFieldUpdater f10920h = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next$volatile");

    public static final AtomicReferenceFieldUpdater f10921i = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_prev$volatile");
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_removedRef$volatile");
    private volatile Object _next$volatile = this;
    private volatile Object _prev$volatile = this;
    private volatile Object _removedRef$volatile;

    public final boolean c(i iVar, int i3) {
        while (true) {
            i iVarD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10921i;
            if (iVarD == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    iVarD = (i) obj;
                    if (!iVarD.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVarD);
                }
            }
            if (iVarD instanceof h) {
                return (((h) iVarD).f10919k & i3) == 0 && iVarD.c(iVar, i3);
            }
            atomicReferenceFieldUpdater.set(iVar, iVarD);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10920h;
            atomicReferenceFieldUpdater2.set(iVar, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(iVarD, this, iVar)) {
                    iVar.e(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(iVarD) == this);
        }
    }

    public final i d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10921i;
            i iVar = (i) atomicReferenceFieldUpdater2.get(this);
            i iVar2 = iVar;
            while (true) {
                i iVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f10920h;
                    obj = atomicReferenceFieldUpdater.get(iVar2);
                    if (obj == this) {
                        if (iVar == iVar2) {
                            return iVar2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, iVar, iVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != iVar) {
                                break;
                            }
                        }
                        return iVar2;
                    }
                    if (g()) {
                        return null;
                    }
                    if (!(obj instanceof n)) {
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        iVar3 = iVar2;
                        iVar2 = (i) obj;
                    } else {
                        if (iVar3 != null) {
                            break;
                        }
                        iVar2 = (i) atomicReferenceFieldUpdater2.get(iVar2);
                    }
                }
                i iVar4 = ((n) obj).f10931a;
                while (!atomicReferenceFieldUpdater.compareAndSet(iVar3, iVar2, iVar4)) {
                    if (atomicReferenceFieldUpdater.get(iVar3) != iVar2) {
                        break;
                    }
                }
                iVar2 = iVar3;
            }
        }
    }

    public final void e(i iVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10921i;
            i iVar2 = (i) atomicReferenceFieldUpdater.get(iVar);
            if (f10920h.get(this) != iVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(iVar, iVar2, this)) {
                    if (g()) {
                        iVar.d();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(iVar) == iVar2);
        }
    }

    public final i f() {
        i iVar;
        Object obj = f10920h.get(this);
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar != null && (iVar = nVar.f10931a) != null) {
            return iVar;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (i) obj;
    }

    public boolean g() {
        return f10920h.get(this) instanceof n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i3 = 2;
        sb.append(new D.o(1, i3, C.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"));
        sb.append('@');
        sb.append(C.s(this));
        return sb.toString();
    }
}
