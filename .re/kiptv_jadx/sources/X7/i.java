package X7;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f10920h = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(X7.i.class, java.lang.Object.class, "_next$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f10921i = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(X7.i.class, java.lang.Object.class, "_prev$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater j = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(X7.i.class, java.lang.Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ java.lang.Object _next$volatile = this;
    private volatile /* synthetic */ java.lang.Object _prev$volatile = this;
    private volatile /* synthetic */ java.lang.Object _removedRef$volatile;

    public final boolean c(X7.i iVar, int i3) {
        while (true) {
            X7.i iVarD = d();
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10921i;
            if (iVarD == null) {
                java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    iVarD = (X7.i) obj;
                    if (!iVarD.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVarD);
                }
            }
            if (iVarD instanceof X7.h) {
                return (((X7.h) iVarD).f10919k & i3) == 0 && iVarD.c(iVar, i3);
            }
            atomicReferenceFieldUpdater.set(iVar, iVarD);
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10920h;
            atomicReferenceFieldUpdater2.set(iVar, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(iVarD, this, iVar)) {
                    iVar.e(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(iVarD) == this);
        }
    }

    public final X7.i d() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        java.lang.Object obj;
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10921i;
            X7.i iVar = (X7.i) atomicReferenceFieldUpdater2.get(this);
            X7.i iVar2 = iVar;
            while (true) {
                X7.i iVar3 = null;
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
                    if (!(obj instanceof X7.n)) {
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        iVar3 = iVar2;
                        iVar2 = (X7.i) obj;
                    } else {
                        if (iVar3 != null) {
                            break;
                        }
                        iVar2 = (X7.i) atomicReferenceFieldUpdater2.get(iVar2);
                    }
                }
                X7.i iVar4 = ((X7.n) obj).f10931a;
                while (!atomicReferenceFieldUpdater.compareAndSet(iVar3, iVar2, iVar4)) {
                    if (atomicReferenceFieldUpdater.get(iVar3) != iVar2) {
                        break;
                    }
                }
                iVar2 = iVar3;
            }
        }
    }

    public final void e(X7.i iVar) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10921i;
            X7.i iVar2 = (X7.i) atomicReferenceFieldUpdater.get(iVar);
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

    public final X7.i f() {
        X7.i iVar;
        java.lang.Object obj = f10920h.get(this);
        X7.n nVar = obj instanceof X7.n ? (X7.n) obj : null;
        if (nVar != null && (iVar = nVar.f10931a) != null) {
            return iVar;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (X7.i) obj;
    }

    public boolean g() {
        return f10920h.get(this) instanceof X7.n;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i3 = 2;
        sb.append(new D.o(1, i3, S7.C.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"));
        sb.append('@');
        sb.append(S7.C.s(this));
        return sb.toString();
    }
}
