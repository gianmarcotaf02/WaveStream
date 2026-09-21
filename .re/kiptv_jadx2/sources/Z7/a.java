package Z7;

import androidx.media3.common.util.Log;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.A;

public final class a extends Thread {

    public static final AtomicIntegerFieldUpdater f13021p = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    public final m f13022h;

    public final A f13023i;
    private volatile int indexInArray;
    public b j;

    public long f13024k;

    public long f13025l;

    public int f13026m;

    public boolean f13027n;
    private volatile Object nextParkedWorker;

    public final c f13028o;
    private volatile int workerCtl$volatile;

    public a(c cVar, int i3) {
        this.f13028o = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f13022h = new m();
        this.f13023i = new A();
        this.j = b.f13031k;
        this.nextParkedWorker = c.f13037r;
        int iNanoTime = (int) System.nanoTime();
        this.f13026m = iNanoTime == 0 ? 42 : iNanoTime;
        f(i3);
    }

    public final i a(boolean z6) {
        i iVarE;
        i iVarE2;
        c cVar;
        long j;
        b bVar = this.j;
        b bVar2 = b.f13029h;
        i iVar = null;
        m mVar = this.f13022h;
        c cVar2 = this.f13028o;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f13035p;
            do {
                cVar = this.f13028o;
                j = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f13056b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || !iVar2.f13048i) {
                            int i3 = m.f13058d.get(mVar);
                            int i9 = m.f13057c.get(mVar);
                            while (i3 != i9 && m.f13059e.get(mVar) != 0) {
                                i9--;
                                i iVarC = mVar.c(i9, true);
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
                    i iVar3 = (i) cVar2.f13042m.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f13035p.compareAndSet(cVar, j, j - 4398046511104L));
            this.j = b.f13029h;
        }
        if (z6) {
            boolean z9 = d(cVar2.f13038h * 2) == 0;
            if (z9 && (iVarE2 = e()) != null) {
                return iVarE2;
            }
            mVar.getClass();
            i iVarB = (i) m.f13056b.getAndSet(mVar, null);
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
            i iVarE3 = e();
            if (iVarE3 != null) {
                return iVarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i3) {
        int i9 = this.f13026m;
        int i10 = i9 ^ (i9 << 13);
        int i11 = i10 ^ (i10 >> 17);
        int i12 = i11 ^ (i11 << 5);
        this.f13026m = i12;
        int i13 = i3 - 1;
        return (i13 & i3) == 0 ? i12 & i13 : (i12 & Log.LOG_LEVEL_OFF) % i3;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.f13028o;
        if (iD == 0) {
            i iVar = (i) cVar.f13041l.d();
            return iVar != null ? iVar : (i) cVar.f13042m.d();
        }
        i iVar2 = (i) cVar.f13042m.d();
        return iVar2 != null ? iVar2 : (i) cVar.f13041l.d();
    }

    public final void f(int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13028o.f13040k);
        sb.append("-worker-");
        sb.append(i3 == 0 ? "TERMINATED" : String.valueOf(i3));
        setName(sb.toString());
        this.indexInArray = i3;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.j;
        boolean z6 = bVar2 == b.f13029h;
        if (z6) {
            c.f13035p.addAndGet(this.f13028o, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.j = bVar;
        }
        return z6;
    }

    public final i i(int i3) {
        int i9;
        long j;
        i iVarC;
        long j9;
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f13035p;
        c cVar = this.f13028o;
        int i10 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar = null;
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
            a aVar = (a) cVar.f13043n.b(i12);
            if (aVar == null || aVar == this) {
                i9 = i12;
            } else {
                m mVar = aVar.f13022h;
                if (i3 != 3) {
                    mVar.getClass();
                    int i13 = m.f13058d.get(mVar);
                    int i14 = m.f13057c.get(mVar);
                    boolean z6 = i3 == 1;
                    while (true) {
                        if (i13 != i14) {
                            j = 0;
                            if (!z6 || m.f13059e.get(mVar) != 0) {
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
                A a2 = this.f13023i;
                if (iVarC == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f13056b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null) {
                            j9 = -1;
                        } else {
                            j9 = -1;
                            if (((iVar2.f13048i ? 1 : 2) & i3) != 0) {
                                k.f13054f.getClass();
                                i9 = i12;
                                long jNanoTime = System.nanoTime() - iVar2.f13047h;
                                long j11 = k.f13050b;
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
                    i iVar3 = (i) a2.f24539h;
                    a2.f24539h = iVar;
                    return iVar3;
                }
                if (j10 > j) {
                    jMin = Math.min(jMin, j10);
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

    @Override
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        long j9;
        int i3;
        loop0: while (true) {
            boolean z6 = false;
            while (true) {
                c cVar = this.f13028o;
                cVar.getClass();
                if (c.f13036q.get(cVar) != 1) {
                    b bVar = this.j;
                    b bVar2 = b.f13032l;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i iVarA = a(this.f13027n);
                    if (iVarA == null) {
                        this.f13027n = false;
                        if (this.f13025l == 0) {
                            Object obj = this.nextParkedWorker;
                            N6.A a2 = c.f13037r;
                            long j10 = 2097151;
                            if (obj != a2) {
                                f13021p.set(this, -1);
                                while (this.nextParkedWorker != c.f13037r) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13021p;
                                    if (atomicIntegerFieldUpdater.get(this) != -1) {
                                        break;
                                    }
                                    c cVar2 = this.f13028o;
                                    cVar2.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f13036q;
                                    if (atomicIntegerFieldUpdater2.get(cVar2) == 1) {
                                        break;
                                    }
                                    b bVar3 = this.j;
                                    b bVar4 = b.f13032l;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.j);
                                    Thread.interrupted();
                                    if (this.f13024k == 0) {
                                        this.f13024k = System.nanoTime() + this.f13028o.j;
                                    }
                                    LockSupport.parkNanos(this.f13028o.j);
                                    if (System.nanoTime() - this.f13024k >= 0) {
                                        this.f13024k = 0L;
                                        c cVar3 = this.f13028o;
                                        synchronized (cVar3.f13043n) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(cVar3) == 1)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f13035p;
                                                    if (((int) (atomicLongFieldUpdater2.get(cVar3) & j10)) > cVar3.f13038h) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i9 = this.indexInArray;
                                                            f(0);
                                                            cVar3.j(this, i9, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(cVar3) & j10);
                                                            if (andDecrement != i9) {
                                                                Object objB = cVar3.f13043n.b(andDecrement);
                                                                kotlin.jvm.internal.m.b(objB);
                                                                a aVar = (a) objB;
                                                                cVar3.f13043n.c(i9, aVar);
                                                                aVar.f(i9);
                                                                cVar3.j(aVar, andDecrement, i9);
                                                            }
                                                            cVar3.f13043n.c(andDecrement, null);
                                                            this.j = bVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                    j10 = j10;
                                }
                            } else {
                                c cVar4 = this.f13028o;
                                cVar4.getClass();
                                if (this.nextParkedWorker == a2) {
                                    do {
                                        atomicLongFieldUpdater = c.f13034o;
                                        j = atomicLongFieldUpdater.get(cVar4);
                                        j9 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
                                        i3 = this.indexInArray;
                                        this.nextParkedWorker = cVar4.f13043n.b((int) (j & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(cVar4, j, j9 | ((long) i3)));
                                }
                            }
                        } else {
                            if (z6) {
                                h(b.j);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f13025l);
                                this.f13025l = 0L;
                                break;
                            }
                            z6 = true;
                        }
                    } else {
                        this.f13025l = 0L;
                        this.f13024k = 0L;
                        if (this.j == b.j) {
                            this.j = b.f13030i;
                        }
                        boolean z9 = iVarA.f13048i;
                        c cVar5 = this.f13028o;
                        if (!z9) {
                            cVar5.getClass();
                            try {
                                iVarA.run();
                                break;
                            } catch (Throwable th2) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                                break;
                            }
                        }
                        if (h(b.f13030i) && !cVar5.u() && !cVar5.t(c.f13035p.get(cVar5))) {
                            cVar5.u();
                        }
                        cVar5.getClass();
                        try {
                            iVarA.run();
                        } catch (Throwable th3) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th3);
                        }
                        c.f13035p.addAndGet(cVar5, -2097152L);
                        if (this.j == bVar2) {
                            break;
                        }
                        this.j = b.f13031k;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f13032l);
    }
}
