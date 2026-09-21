package Z7;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements java.util.concurrent.Executor, java.io.Closeable, java.lang.AutoCloseable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f13034o = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(Z7.c.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f13035p = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(Z7.c.class, "controlState$volatile");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f13036q = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(Z7.c.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final N6.A f13037r = new N6.A("NOT_IN_STACK", 2);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13039i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f13040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Z7.f f13041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Z7.f f13042m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final X7.o f13043n;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i3, int i9, long j, java.lang.String str) {
        this.f13038h = i3;
        this.f13039i = i9;
        this.j = j;
        this.f13040k = str;
        if (i3 < 1) {
            throw new java.lang.IllegalArgumentException(Y6.f.f(i3, "Core pool size ", " should be at least 1").toString());
        }
        if (i9 < i3) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.k(i9, i3, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i9 > 2097150) {
            throw new java.lang.IllegalArgumentException(Y6.f.f(i9, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException(B2.a.k(j, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.f13041l = new Z7.f();
        this.f13042m = new Z7.f();
        this.f13043n = new X7.o((i3 + 1) * 2);
        this.controlState$volatile = ((long) i3) << 42;
    }

    public static /* synthetic */ void i(Z7.c cVar, java.lang.Runnable runnable, int i3) {
        cVar.e(runnable, false, (i3 & 4) == 0);
    }

    public final int b() {
        synchronized (this.f13043n) {
            try {
                if (f13036q.get(this) == 1) {
                    return -1;
                }
                java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f13035p;
                long j = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j & 2097151);
                int i9 = i3 - ((int) ((j & 4398044413952L) >> 21));
                if (i9 < 0) {
                    i9 = 0;
                }
                if (i9 >= this.f13038h) {
                    return 0;
                }
                if (i3 >= this.f13039i) {
                    return 0;
                }
                int i10 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i10 <= 0 || this.f13043n.b(i10) != null) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.");
                }
                Z7.a aVar = new Z7.a(this, i10);
                this.f13043n.c(i10, aVar);
                if (i10 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.");
                }
                int i11 = i9 + 1;
                aVar.start();
                return i11;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.lang.InterruptedException {
        int i3;
        Z7.i iVarA;
        if (f13036q.compareAndSet(this, 0, 1)) {
            java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
            Z7.a aVar = threadCurrentThread instanceof Z7.a ? (Z7.a) threadCurrentThread : null;
            if (aVar == null || !kotlin.jvm.internal.m.a(aVar.f13028o, this)) {
                aVar = null;
            }
            synchronized (this.f13043n) {
                i3 = (int) (f13035p.get(this) & 2097151);
            }
            if (1 <= i3) {
                int i9 = 1;
                while (true) {
                    java.lang.Object objB = this.f13043n.b(i9);
                    kotlin.jvm.internal.m.b(objB);
                    Z7.a aVar2 = (Z7.a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != java.lang.Thread.State.TERMINATED) {
                            java.util.concurrent.locks.LockSupport.unpark(aVar2);
                            aVar2.join(androidx.media3.exoplayer.Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
                        }
                        Z7.m mVar = aVar2.f13022h;
                        Z7.f fVar = this.f13042m;
                        mVar.getClass();
                        Z7.i iVar = (Z7.i) Z7.m.f13056b.getAndSet(mVar, null);
                        if (iVar != null) {
                            fVar.a(iVar);
                        }
                        while (true) {
                            Z7.i iVarB = mVar.b();
                            if (iVarB == null) {
                                break;
                            } else {
                                fVar.a(iVarB);
                            }
                        }
                    }
                    if (i9 == i3) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.f13042m.b();
            this.f13041l.b();
            while (true) {
                if (aVar != null) {
                    iVarA = aVar.a(true);
                    if (iVarA == null) {
                        iVarA = (Z7.i) this.f13041l.d();
                        if (iVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    iVarA = (Z7.i) this.f13041l.d();
                    if (iVarA == null && (iVarA = (Z7.i) this.f13042m.d()) == null) {
                        break;
                    }
                }
                try {
                    iVarA.run();
                } catch (java.lang.Throwable th) {
                    java.lang.Thread threadCurrentThread2 = java.lang.Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(Z7.b.f13032l);
            }
            f13034o.set(this, 0L);
            f13035p.set(this, 0L);
        }
    }

    public final void e(java.lang.Runnable runnable, boolean z6, boolean z9) {
        Z7.i jVar;
        Z7.b bVar;
        Z7.k.f13054f.getClass();
        long jNanoTime = java.lang.System.nanoTime();
        if (runnable instanceof Z7.i) {
            jVar = (Z7.i) runnable;
            jVar.f13047h = jNanoTime;
            jVar.f13048i = z6;
        } else {
            jVar = new Z7.j(runnable, jNanoTime, z6);
        }
        boolean z10 = jVar.f13048i;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f13035p;
        long jAddAndGet = z10 ? atomicLongFieldUpdater.addAndGet(this, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        Z7.a aVar = threadCurrentThread instanceof Z7.a ? (Z7.a) threadCurrentThread : null;
        if (aVar == null || !kotlin.jvm.internal.m.a(aVar.f13028o, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.j) != Z7.b.f13032l && (jVar.f13048i || bVar != Z7.b.f13030i)) {
            aVar.f13027n = true;
            Z7.m mVar = aVar.f13022h;
            if (z9) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                Z7.i iVar = (Z7.i) Z7.m.f13056b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f13048i ? this.f13042m.a(jVar) : this.f13041l.a(jVar))) {
                throw new java.util.concurrent.RejectedExecutionException(Y6.f.m(new java.lang.StringBuilder(), this.f13040k, " was terminated"));
            }
        }
        if (z10) {
            if (u() || t(jAddAndGet)) {
                return;
            }
            u();
            return;
        }
        if (u() || t(atomicLongFieldUpdater.get(this))) {
            return;
        }
        u();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        i(this, runnable, 6);
    }

    public final void j(Z7.a aVar, int i3, int i9) {
        while (true) {
            long j = f13034o.get(this);
            int i10 = (int) (2097151 & j);
            long j9 = (androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            if (i10 == i3) {
                if (i9 == 0) {
                    java.lang.Object objC = aVar.c();
                    while (true) {
                        if (objC == f13037r) {
                            i10 = -1;
                            break;
                        }
                        if (objC == null) {
                            i10 = 0;
                            break;
                        }
                        Z7.a aVar2 = (Z7.a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i10 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i10 = i9;
                }
            }
            if (i10 >= 0) {
                if (f13034o.compareAndSet(this, j, ((long) i10) | j9)) {
                    return;
                }
            }
        }
    }

    public final boolean t(long j) {
        int i3 = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i3 < 0) {
            i3 = 0;
        }
        int i9 = this.f13038h;
        if (i3 < i9) {
            int iB = b();
            if (iB == 1 && i9 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        X7.o oVar = this.f13043n;
        int iA = oVar.a();
        int i3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i13 < iA; i13++) {
            Z7.a aVar = (Z7.a) oVar.b(i13);
            if (aVar != null) {
                Z7.m mVar = aVar.f13022h;
                mVar.getClass();
                int i14 = Z7.m.f13056b.get(mVar) != null ? (Z7.m.f13057c.get(mVar) - Z7.m.f13058d.get(mVar)) + 1 : Z7.m.f13057c.get(mVar) - Z7.m.f13058d.get(mVar);
                int iOrdinal = aVar.j.ordinal();
                if (iOrdinal == 0) {
                    i3++;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(i14);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i9++;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(i14);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i10++;
                } else if (iOrdinal == 3) {
                    i11++;
                    if (i14 > 0) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(i14);
                        sb3.append(io.ktor.util.date.GMTDateParser.DAY_OF_MONTH);
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new I3.b();
                    }
                    i12++;
                }
            }
        }
        long j = f13035p.get(this);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(this.f13040k);
        sb4.append('@');
        sb4.append(S7.C.s(this));
        sb4.append("[Pool Size {core = ");
        int i15 = this.f13038h;
        sb4.append(i15);
        sb4.append(", max = ");
        Y6.f.w(sb4, this.f13039i, "}, Worker States {CPU = ", i3, ", blocking = ");
        Y6.f.w(sb4, i9, ", parked = ", i10, ", dormant = ");
        Y6.f.w(sb4, i11, ", terminated = ", i12, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f13041l.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f13042m.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i15 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean u() {
        N6.A a2;
        int iB;
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f13034o;
            long j = atomicLongFieldUpdater.get(this);
            Z7.a aVar = (Z7.a) this.f13043n.b((int) (2097151 & j));
            if (aVar == null) {
                aVar = null;
            } else {
                long j9 = (androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
                java.lang.Object objC = aVar.c();
                while (true) {
                    a2 = f13037r;
                    if (objC == a2) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    Z7.a aVar2 = (Z7.a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j9 | ((long) iB))) {
                    aVar.g(a2);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (Z7.a.f13021p.compareAndSet(aVar, -1, 0)) {
                java.util.concurrent.locks.LockSupport.unpark(aVar);
                return true;
            }
        }
    }
}
