package X7;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f10924e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(X7.l.class, java.lang.Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f10925f = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(X7.l.class, "_state$volatile");
    public static final N6.A g = new N6.A("REMOVE_FROZEN", 2);
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f10929d;

    public l(int i3, boolean z6) {
        this.f10926a = i3;
        this.f10927b = z6;
        int i9 = i3 - 1;
        this.f10928c = i9;
        this.f10929d = new java.util.concurrent.atomic.AtomicReferenceArray(i3);
        if (i9 > 1073741823) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if ((i3 & i9) != 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
    }

    public final int a(java.lang.Runnable runnable) {
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f10925f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i3 = (int) (1073741823 & j);
            int i9 = (int) ((1152921503533105152L & j) >> 30);
            int i10 = this.f10928c;
            if (((i9 + 2) & i10) == (i3 & i10)) {
                return 1;
            }
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f10929d;
            if (!this.f10927b && atomicReferenceArray.get(i9 & i10) != null) {
                int i11 = this.f10926a;
                if (i11 < 1024 || ((i9 - i3) & 1073741823) > (i11 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i9 + 1) & 1073741823)) << 30))) {
                atomicReferenceArray.set(i9 & i10, runnable);
                X7.l lVarC = this;
                while ((atomicLongFieldUpdater.get(lVarC) & 1152921504606846976L) != 0) {
                    lVarC = lVarC.c();
                    java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray2 = lVarC.f10929d;
                    int i12 = lVarC.f10928c & i9;
                    java.lang.Object obj = atomicReferenceArray2.get(i12);
                    if ((obj instanceof X7.k) && ((X7.k) obj).f10923a == i9) {
                        atomicReferenceArray2.set(i12, runnable);
                    } else {
                        lVarC = null;
                    }
                    if (lVarC == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f10925f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final X7.l c() {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        X7.l lVar;
        while (true) {
            atomicLongFieldUpdater = f10925f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                lVar = this;
                break;
            }
            long j9 = 1152921504606846976L | j;
            lVar = this;
            if (atomicLongFieldUpdater.compareAndSet(lVar, j, j9)) {
                j = j9;
                break;
            }
        }
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10924e;
            X7.l lVar2 = (X7.l) atomicReferenceFieldUpdater.get(this);
            if (lVar2 != null) {
                return lVar2;
            }
            X7.l lVar3 = new X7.l(lVar.f10926a * 2, lVar.f10927b);
            int i3 = (int) (1073741823 & j);
            int i9 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i10 = lVar.f10928c;
                int i11 = i3 & i10;
                if (i11 == (i10 & i9)) {
                    break;
                }
                java.lang.Object kVar = lVar.f10929d.get(i11);
                if (kVar == null) {
                    kVar = new X7.k(i3);
                }
                lVar3.f10929d.set(lVar3.f10928c & i3, kVar);
                i3++;
            }
            atomicLongFieldUpdater.set(lVar3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final java.lang.Object d() {
        X7.l lVarC = this;
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f10925f;
            long j = atomicLongFieldUpdater.get(lVarC);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i3 = (int) (j & 1073741823);
            int i9 = lVarC.f10928c;
            int i10 = ((int) ((1152921503533105152L & j) >> 30)) & i9;
            int i11 = i9 & i3;
            if (i10 != i11) {
                java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = lVarC.f10929d;
                java.lang.Object obj = atomicReferenceArray.get(i11);
                boolean z6 = lVarC.f10927b;
                if (obj == null) {
                    if (z6) {
                    }
                } else if (!(obj instanceof X7.k)) {
                    long j9 = (i3 + 1) & 1073741823;
                    if (atomicLongFieldUpdater.compareAndSet(lVarC, j, (j & (-1073741824)) | j9)) {
                        atomicReferenceArray.set(i11, null);
                        return obj;
                    }
                    lVarC = this;
                    if (z6) {
                        while (true) {
                            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10925f;
                            long j10 = atomicLongFieldUpdater2.get(lVarC);
                            int i12 = (int) (j10 & 1073741823);
                            if ((j10 & 1152921504606846976L) != 0) {
                                lVarC = lVarC.c();
                            } else {
                                X7.l lVar = lVarC;
                                lVarC = lVar;
                                if (atomicLongFieldUpdater2.compareAndSet(lVar, j10, (j10 & (-1073741824)) | j9)) {
                                    lVarC.f10929d.set(lVarC.f10928c & i12, null);
                                    lVarC = null;
                                } else {
                                    continue;
                                }
                            }
                            if (lVarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
