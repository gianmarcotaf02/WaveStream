package S7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class U implements java.lang.Runnable, java.lang.Comparable, S7.O {
    private volatile java.lang.Object _heap;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9557i = -1;

    public U(long j) {
        this.f9556h = j;
    }

    public final int a(long j, S7.V v6, S7.W w6) {
        synchronized (this) {
            if (this._heap == S7.C.f9527b) {
                return 2;
            }
            synchronized (v6) {
                try {
                    S7.U[] uArr = v6.f10938a;
                    S7.U u6 = uArr != null ? uArr[0] : null;
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = S7.W.f9559m;
                    w6.getClass();
                    if (S7.W.f9561o.get(w6) == 1) {
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
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(S7.V v6) {
        if (this._heap == S7.C.f9527b) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        this._heap = v6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        long j = this.f9556h - ((S7.U) obj).f9556h;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // S7.O
    public final void dispose() {
        synchronized (this) {
            try {
                java.lang.Object obj = this._heap;
                N6.A a2 = S7.C.f9527b;
                if (obj == a2) {
                    return;
                }
                S7.V v6 = obj instanceof S7.V ? (S7.V) obj : null;
                if (v6 != null) {
                    synchronized (v6) {
                        java.lang.Object obj2 = this._heap;
                        if ((obj2 instanceof X7.u ? (X7.u) obj2 : null) != null) {
                            v6.b(this.f9557i);
                        }
                    }
                }
                this._heap = a2;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public java.lang.String toString() {
        return "Delayed[nanos=" + this.f9556h + ']';
    }
}
