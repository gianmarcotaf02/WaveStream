package Z7;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends java.lang.Thread {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f13021p = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(Z7.a.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Z7.m f13022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kotlin.jvm.internal.A f13023i;
    private volatile int indexInArray;
    public Z7.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f13024k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f13025l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13026m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13027n;
    private volatile java.lang.Object nextParkedWorker;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z7.c f13028o;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(Z7.c cVar, int i3) {
        this.f13028o = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f13022h = new Z7.m();
        this.f13023i = new kotlin.jvm.internal.A();
        this.j = Z7.b.f13031k;
        this.nextParkedWorker = Z7.c.f13037r;
        int iNanoTime = (int) java.lang.System.nanoTime();
        this.f13026m = iNanoTime == 0 ? 42 : iNanoTime;
        f(i3);
    }

    public final Z7.i a(boolean z6) {
        Z7.i iVarE;
        Z7.i iVarE2;
        Z7.c cVar;
        long j;
        Z7.b bVar = this.j;
        Z7.b bVar2 = Z7.b.f13029h;
        Z7.i iVar = null;
        Z7.m mVar = this.f13022h;
        Z7.c cVar2 = this.f13028o;
        if (bVar != bVar2) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = Z7.c.f13035p;
            do {
                cVar = this.f13028o;
                j = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z7.m.f13056b;
                        Z7.i iVar2 = (Z7.i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || !iVar2.f13048i) {
                            int i3 = Z7.m.f13058d.get(mVar);
                            int i9 = Z7.m.f13057c.get(mVar);
                            while (i3 != i9 && Z7.m.f13059e.get(mVar) != 0) {
                                i9--;
                                Z7.i iVarC = mVar.c(i9, true);
                                if (iVarC != null) {
                                    iVar = iVarC;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                iVar = iVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == iVar2);
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    Z7.i iVar3 = (Z7.i) cVar2.f13042m.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!Z7.c.f13035p.compareAndSet(cVar, j, j - 4398046511104L));
            this.j = Z7.b.f13029h;
        }
        if (z6) {
            boolean z9 = d(cVar2.f13038h * 2) == 0;
            if (z9 && (iVarE2 = e()) != null) {
                return iVarE2;
            }
            mVar.getClass();
            Z7.i iVarB = (Z7.i) Z7.m.f13056b.getAndSet(mVar, null);
            if (iVarB == null) {
                iVarB = mVar.b();
            }
            if (iVarB != null) {
                return iVarB;
            }
            if (!z9 && (iVarE = e()) != null) {
                return iVarE;
            }
        } else {
            Z7.i iVarE3 = e();
            if (iVarE3 != null) {
                return iVarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final java.lang.Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i3) {
        int i9 = this.f13026m;
        int i10 = i9 ^ (i9 << 13);
        int i11 = i10 ^ (i10 >> 17);
        int i12 = i11 ^ (i11 << 5);
        this.f13026m = i12;
        int i13 = i3 - 1;
        return (i13 & i3) == 0 ? i12 & i13 : (i12 & androidx.media3.common.util.Log.LOG_LEVEL_OFF) % i3;
    }

    public final Z7.i e() {
        int iD = d(2);
        Z7.c cVar = this.f13028o;
        if (iD == 0) {
            Z7.i iVar = (Z7.i) cVar.f13041l.d();
            return iVar != null ? iVar : (Z7.i) cVar.f13042m.d();
        }
        Z7.i iVar2 = (Z7.i) cVar.f13042m.d();
        return iVar2 != null ? iVar2 : (Z7.i) cVar.f13041l.d();
    }

    public final void f(int i3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f13028o.f13040k);
        sb.append("-worker-");
        sb.append(i3 == 0 ? "TERMINATED" : java.lang.String.valueOf(i3));
        setName(sb.toString());
        this.indexInArray = i3;
    }

    public final void g(java.lang.Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(Z7.b bVar) {
        Z7.b bVar2 = this.j;
        boolean z6 = bVar2 == Z7.b.f13029h;
        if (z6) {
            Z7.c.f13035p.addAndGet(this.f13028o, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.j = bVar;
        }
        return z6;
    }

    public final Z7.i i(int i3) {
        int i9;
        long j;
        Z7.i iVarC;
        long j9;
        long j10;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = Z7.c.f13035p;
        Z7.c cVar = this.f13028o;
        int i10 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        Z7.i iVar = null;
        if (i10 < 2) {
            return null;
        }
        int iD = d(i10);
        int i11 = 0;
        long jMin = Long.MAX_VALUE;
        while (i11 < i10) {
            int i12 = iD + 1;
            if (i12 > i10) {
                i12 = 1;
            }
            Z7.a aVar = (Z7.a) cVar.f13043n.b(i12);
            if (aVar == null || aVar == this) {
                i9 = i12;
            } else {
                Z7.m mVar = aVar.f13022h;
                if (i3 != 3) {
                    mVar.getClass();
                    int i13 = Z7.m.f13058d.get(mVar);
                    int i14 = Z7.m.f13057c.get(mVar);
                    boolean z6 = i3 == 1;
                    while (true) {
                        if (i13 != i14) {
                            j = 0;
                            if (!z6 || Z7.m.f13059e.get(mVar) != 0) {
                                int i15 = i13 + 1;
                                iVarC = mVar.c(i13, z6);
                                if (iVarC != null) {
                                    break;
                                }
                                i13 = i15;
                            }
                        } else {
                            j = 0;
                        }
                        iVarC = iVar;
                        break;
                    }
                } else {
                    iVarC = mVar.b();
                    j = 0;
                }
                kotlin.jvm.internal.A a2 = this.f13023i;
                if (iVarC == null) {
                    while (true) {
                        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z7.m.f13056b;
                        Z7.i iVar2 = (Z7.i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null) {
                            j9 = -1;
                        } else {
                            j9 = -1;
                            if (((iVar2.f13048i ? 1 : 2) & i3) != 0) {
                                Z7.k.f13054f.getClass();
                                i9 = i12;
                                long jNanoTime = java.lang.System.nanoTime() - iVar2.f13047h;
                                long j11 = Z7.k.f13050b;
                                if (jNanoTime < j11) {
                                    j10 = j11 - jNanoTime;
                                    iVar = null;
                                    break;
                                }
                                do {
                                    iVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                        a2.f24539h = iVar2;
                                        j10 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(mVar) == iVar2);
                                i12 = i9;
                                iVar = null;
                            }
                        }
                        j10 = -2;
                        i9 = i12;
                        break;
                    }
                } else {
                    a2.f24539h = iVarC;
                    i9 = i12;
                    j10 = -1;
                    j9 = -1;
                }
                if (j10 == j9) {
                    Z7.i iVar3 = (Z7.i) a2.f24539h;
                    a2.f24539h = iVar;
                    return iVar3;
                }
                if (j10 > j) {
                    jMin = java.lang.Math.min(jMin, j10);
                }
            }
            i11++;
            iD = i9;
            iVar = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f13025l = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        long j9;
        int i3;
        loop0: while (true) {
            boolean z6 = false;
            while (true) {
                Z7.c cVar = this.f13028o;
                cVar.getClass();
                if (Z7.c.f13036q.get(cVar) != 1) {
                    Z7.b bVar = this.j;
                    Z7.b bVar2 = Z7.b.f13032l;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    Z7.i iVarA = a(this.f13027n);
                    if (iVarA == null) {
                        this.f13027n = false;
                        if (this.f13025l == 0) {
                            java.lang.Object obj = this.nextParkedWorker;
                            N6.A a2 = Z7.c.f13037r;
                            long j10 = 2097151;
                            if (obj != a2) {
                                f13021p.set(this, -1);
                                while (this.nextParkedWorker != Z7.c.f13037r) {
                                    java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13021p;
                                    if (atomicIntegerFieldUpdater.get(this) != -1) {
                                        break;
                                    }
                                    Z7.c cVar2 = this.f13028o;
                                    cVar2.getClass();
                                    java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = Z7.c.f13036q;
                                    if (atomicIntegerFieldUpdater2.get(cVar2) == 1) {
                                        break;
                                    }
                                    Z7.b bVar3 = this.j;
                                    Z7.b bVar4 = Z7.b.f13032l;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(Z7.b.j);
                                    java.lang.Thread.interrupted();
                                    if (this.f13024k == 0) {
                                        this.f13024k = java.lang.System.nanoTime() + this.f13028o.j;
                                    }
                                    java.util.concurrent.locks.LockSupport.parkNanos(this.f13028o.j);
                                    if (java.lang.System.nanoTime() - this.f13024k >= 0) {
                                        this.f13024k = 0L;
                                        Z7.c cVar3 = this.f13028o;
                                        synchronized (cVar3.f13043n) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(cVar3) == 1)) {
                                                    java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = Z7.c.f13035p;
                                                    if (((int) (atomicLongFieldUpdater2.get(cVar3) & j10)) > cVar3.f13038h) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i9 = this.indexInArray;
                                                            f(0);
                                                            cVar3.j(this, i9, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(cVar3) & j10);
                                                            if (andDecrement != i9) {
                                                                java.lang.Object objB = cVar3.f13043n.b(andDecrement);
                                                                kotlin.jvm.internal.m.b(objB);
                                                                Z7.a aVar = (Z7.a) objB;
                                                                cVar3.f13043n.c(i9, aVar);
                                                                aVar.f(i9);
                                                                cVar3.j(aVar, andDecrement, i9);
                                                            }
                                                            cVar3.f13043n.c(andDecrement, null);
                                                            this.j = bVar4;
                                                        }
                                                    }
                                                }
                                            } catch (java.lang.Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                    j10 = j10;
                                }
                            } else {
                                Z7.c cVar4 = this.f13028o;
                                cVar4.getClass();
                                if (this.nextParkedWorker == a2) {
                                    do {
                                        atomicLongFieldUpdater = Z7.c.f13034o;
                                        j = atomicLongFieldUpdater.get(cVar4);
                                        j9 = (androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
                                        i3 = this.indexInArray;
                                        this.nextParkedWorker = cVar4.f13043n.b((int) (j & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(cVar4, j, j9 | ((long) i3)));
                                }
                            }
                        } else {
                            if (z6) {
                                h(Z7.b.j);
                                java.lang.Thread.interrupted();
                                java.util.concurrent.locks.LockSupport.parkNanos(this.f13025l);
                                this.f13025l = 0L;
                                break;
                            }
                            z6 = true;
                        }
                    } else {
                        this.f13025l = 0L;
                        this.f13024k = 0L;
                        if (this.j == Z7.b.j) {
                            this.j = Z7.b.f13030i;
                        }
                        boolean z9 = iVarA.f13048i;
                        Z7.c cVar5 = this.f13028o;
                        if (!z9) {
                            cVar5.getClass();
                            try {
                                iVarA.run();
                                break;
                            } catch (java.lang.Throwable th2) {
                                java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                                break;
                            }
                        }
                        if (h(Z7.b.f13030i) && !cVar5.u() && !cVar5.t(Z7.c.f13035p.get(cVar5))) {
                            cVar5.u();
                        }
                        cVar5.getClass();
                        try {
                            iVarA.run();
                        } catch (java.lang.Throwable th3) {
                            java.lang.Thread threadCurrentThread2 = java.lang.Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th3);
                        }
                        Z7.c.f13035p.addAndGet(cVar5, -2097152L);
                        if (this.j == bVar2) {
                            break;
                        }
                        this.j = Z7.b.f13031k;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(Z7.b.f13032l);
    }
}
