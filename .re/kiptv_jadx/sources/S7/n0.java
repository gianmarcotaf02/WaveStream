package S7;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements S7.InterfaceC0881c0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f9602i = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(S7.n0.class, "_isCompleting$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater j = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(S7.n0.class, java.lang.Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9603k = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(S7.n0.class, java.lang.Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ java.lang.Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ java.lang.Object _rootCause$volatile;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S7.r0 f9604h;

    public n0(S7.r0 r0Var, java.lang.Throwable th) {
        this.f9604h = r0Var;
        this._rootCause$volatile = th;
    }

    @Override // S7.InterfaceC0881c0
    public final S7.r0 a() {
        return this.f9604h;
    }

    public final void b(java.lang.Throwable th) {
        java.lang.Throwable thC = c();
        if (thC == null) {
            j.set(this, th);
            return;
        }
        if (th == thC) {
            return;
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9603k;
        java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof java.lang.Throwable)) {
            if (!(obj instanceof java.util.ArrayList)) {
                throw new java.lang.IllegalStateException(p121o0.p.n(obj, "State is "));
            }
            ((java.util.ArrayList) obj).add(th);
        } else {
            if (th == obj) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }
    }

    public final java.lang.Throwable c() {
        return (java.lang.Throwable) j.get(this);
    }

    public final boolean d() {
        return c() != null;
    }

    public final java.util.ArrayList e(java.lang.Throwable th) {
        java.util.ArrayList arrayList;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9603k;
        java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new java.util.ArrayList(4);
        } else if (obj instanceof java.lang.Throwable) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof java.util.ArrayList)) {
                throw new java.lang.IllegalStateException(p121o0.p.n(obj, "State is "));
            }
            arrayList = (java.util.ArrayList) obj;
        }
        java.lang.Throwable thC = c();
        if (thC != null) {
            arrayList.add(0, thC);
        }
        if (th != null && !th.equals(thC)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, S7.C.f9532h);
        return arrayList;
    }

    @Override // S7.InterfaceC0881c0
    public final boolean isActive() {
        return c() == null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Finishing[cancelling=");
        sb.append(d());
        sb.append(", completing=");
        sb.append(f9602i.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(c());
        sb.append(", exceptions=");
        sb.append(f9603k.get(this));
        sb.append(", list=");
        sb.append(this.f9604h);
        sb.append(']');
        return sb.toString();
    }
}
