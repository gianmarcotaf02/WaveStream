package S7;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class n0 implements InterfaceC0881c0 {

    public static final AtomicIntegerFieldUpdater f9602i = AtomicIntegerFieldUpdater.newUpdater(n0.class, "_isCompleting$volatile");
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(n0.class, Object.class, "_rootCause$volatile");

    public static final AtomicReferenceFieldUpdater f9603k = AtomicReferenceFieldUpdater.newUpdater(n0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile Object _exceptionsHolder$volatile;
    private volatile int _isCompleting$volatile = 0;
    private volatile Object _rootCause$volatile;

    public final r0 f9604h;

    public n0(r0 r0Var, Throwable th) {
        this.f9604h = r0Var;
        this._rootCause$volatile = th;
    }

    @Override
    public final r0 a() {
        return this.f9604h;
    }

    public final void b(Throwable th) {
        Throwable thC = c();
        if (thC == null) {
            j.set(this, th);
            return;
        }
        if (th == thC) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9603k;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(p121o0.p.n(obj, "State is "));
            }
            ((ArrayList) obj).add(th);
        } else {
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }
    }

    public final Throwable c() {
        return (Throwable) j.get(this);
    }

    public final boolean d() {
        return c() != null;
    }

    public final ArrayList e(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9603k;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(p121o0.p.n(obj, "State is "));
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thC = c();
        if (thC != null) {
            arrayList.add(0, thC);
        }
        if (th != null && !th.equals(thC)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, C.f9532h);
        return arrayList;
    }

    @Override
    public final boolean isActive() {
        return c() == null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
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
