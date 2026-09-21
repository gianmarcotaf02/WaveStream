package Z7;

import N6.A;
import S7.C;
import X7.o;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.session.legacy.PlaybackStateCompat;
import com.google.android.gms.internal.play_billing.M0;
import io.ktor.util.date.GMTDateParser;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public final class c implements Executor, Closeable, AutoCloseable {

    public static final AtomicLongFieldUpdater f13034o = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    public static final AtomicLongFieldUpdater f13035p = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    public static final AtomicIntegerFieldUpdater f13036q = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    public static final A f13037r = new A("NOT_IN_STACK", 2);
    private volatile int _isTerminated$volatile;
    private volatile long controlState$volatile;

    public final int f13038h;

    public final int f13039i;
    public final long j;

    public final String f13040k;

    public final f f13041l;

    public final f f13042m;

    public final o f13043n;
    private volatile long parkedWorkersStack$volatile;

    public c(int i3, int i9, long j, String str) {
        this.f13038h = i3;
        this.f13039i = i9;
        this.j = j;
        this.f13040k = str;
        if (i3 < 1) {
            throw new IllegalArgumentException(Y6.f.f(i3, "Core pool size ", " should be at least 1").toString());
        }
        if (i9 < i3) {
            throw new IllegalArgumentException(M0.k(i9, i3, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i9 > 2097150) {
            throw new IllegalArgumentException(Y6.f.f(i9, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(B2.a.k(j, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.f13041l = new f();
        this.f13042m = new f();
        this.f13043n = new o((i3 + 1) * 2);
        this.controlState$volatile = ((long) i3) << 42;
    }

    public static void i(c cVar, Runnable runnable, int i3) {
        cVar.e(runnable, false, (i3 & 4) == 0);
    }

    public final int b() {
        synchronized (this.f13043n) {
            try {
                if (f13036q.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f13035p;
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
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i10);
                this.f13043n.c(i10, aVar);
                if (i10 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i11 = i9 + 1;
                aVar.start();
                return i11;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void close() throws InterruptedException {
        int i3;
        i iVarA;
        if (f13036q.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !kotlin.jvm.internal.m.a(aVar.f13028o, this)) {
                aVar = null;
            }
            synchronized (this.f13043n) {
                i3 = (int) (f13035p.get(this) & 2097151);
            }
            if (1 <= i3) {
                int i9 = 1;
                while (true) {
                    Object objB = this.f13043n.b(i9);
                    kotlin.jvm.internal.m.b(objB);
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
                        }
                        m mVar = aVar2.f13022h;
                        f fVar = this.f13042m;
                        mVar.getClass();
                        i iVar = (i) m.f13056b.getAndSet(mVar, null);
                        if (iVar != null) {
                            fVar.a(iVar);
                        }
                        while (true) {
                            i iVarB = mVar.b();
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
                        iVarA = (i) this.f13041l.d();
                        if (iVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    iVarA = (i) this.f13041l.d();
                    if (iVarA == null && (iVarA = (i) this.f13042m.d()) == null) {
                        break;
                    }
                }
                try {
                    iVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(b.f13032l);
            }
            f13034o.set(this, 0L);
            f13035p.set(this, 0L);
        }
    }

    public final void e(Runnable runnable, boolean z6, boolean z9) {
        i jVar;
        b bVar;
        k.f13054f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f13047h = jNanoTime;
            jVar.f13048i = z6;
        } else {
            jVar = new j(runnable, jNanoTime, z6);
        }
        boolean z10 = jVar.f13048i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f13035p;
        long jAddAndGet = z10 ? atomicLongFieldUpdater.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !kotlin.jvm.internal.m.a(aVar.f13028o, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.j) != b.f13032l && (jVar.f13048i || bVar != b.f13030i)) {
            aVar.f13027n = true;
            m mVar = aVar.f13022h;
            if (z9) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f13056b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f13048i ? this.f13042m.a(jVar) : this.f13041l.a(jVar))) {
                throw new RejectedExecutionException(Y6.f.m(new StringBuilder(), this.f13040k, " was terminated"));
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

    @Override
    public final void execute(Runnable runnable) {
        i(this, runnable, 6);
    }

    public final void j(a aVar, int i3, int i9) {
        while (true) {
            long j = f13034o.get(this);
            int i10 = (int) (2097151 & j);
            long j9 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            if (i10 == i3) {
                if (i9 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f13037r) {
                            i10 = -1;
                            break;
                        }
                        if (objC == null) {
                            i10 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
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

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        o oVar = this.f13043n;
        int iA = oVar.a();
        int i3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i13 < iA; i13++) {
            a aVar = (a) oVar.b(i13);
            if (aVar != null) {
                m mVar = aVar.f13022h;
                mVar.getClass();
                int i14 = m.f13056b.get(mVar) != null ? (m.f13057c.get(mVar) - m.f13058d.get(mVar)) + 1 : m.f13057c.get(mVar) - m.f13058d.get(mVar);
                int iOrdinal = aVar.j.ordinal();
                if (iOrdinal == 0) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i14);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i9++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i14);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i10++;
                } else if (iOrdinal == 3) {
                    i11++;
                    if (i14 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i14);
                        sb3.append(GMTDateParser.DAY_OF_MONTH);
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
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f13040k);
        sb4.append('@');
        sb4.append(C.s(this));
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
        A a2;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f13034o;
            long j = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f13043n.b((int) (2097151 & j));
            if (aVar == null) {
                aVar = null;
            } else {
                long j9 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
                Object objC = aVar.c();
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
                    a aVar2 = (a) objC;
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
            if (a.f13021p.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }
}
