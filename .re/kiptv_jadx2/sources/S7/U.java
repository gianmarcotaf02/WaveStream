package S7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class U implements Runnable, Comparable, O {
    private volatile Object _heap;

    public long f9556h;

    public int f9557i = -1;

    public U(long j) {
        this.f9556h = j;
    }

    public final int a(long j, V v6, W w6) {
        synchronized (this) {
            if (this._heap == C.f9527b) {
                return 2;
            }
            synchronized (v6) {
                try {
                    U[] uArr = v6.f10938a;
                    U u6 = uArr != null ? uArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = W.f9559m;
                    w6.getClass();
                    if (W.f9561o.get(w6) == 1) {
                        return 1;
                    }
                    if (u6 == null) {
                        v6.f9558c = j;
                    } else {
                        long j9 = u6.f9556h;
                        if (j9 - j < 0) {
                            j = j9;
                        }
                        if (j - v6.f9558c > 0) {
                            v6.f9558c = j;
                        }
                    }
                    long j10 = this.f9556h;
                    long j11 = v6.f9558c;
                    if (j10 - j11 < 0) {
                        this.f9556h = j11;
                    }
                    v6.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(V v6) {
        if (this._heap == C.f9527b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = v6;
    }

    @Override
    public final int compareTo(Object obj) {
        long j = this.f9556h - ((U) obj).f9556h;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                N6.A a2 = C.f9527b;
                if (obj == a2) {
                    return;
                }
                V v6 = obj instanceof V ? (V) obj : null;
                if (v6 != null) {
                    synchronized (v6) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof X7.u ? (X7.u) obj2 : null) != null) {
                            v6.b(this.f9557i);
                        }
                    }
                }
                this._heap = a2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f9556h + ']';
    }
}
