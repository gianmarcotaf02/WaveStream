package M8;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class C0678f extends M {

    public static final ReentrantLock f7245h;

    public static final Condition f7246i;
    public static final long j;

    public static final long f7247k;

    public static C0678f f7248l;

    public int f7249e;

    public C0678f f7250f;
    public long g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f7245h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.m.d(conditionNewCondition, "newCondition(...)");
        f7246i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        j = millis;
        f7247k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void i() {
        long j9 = this.f7234c;
        boolean z6 = this.f7232a;
        if (j9 != 0 || z6) {
            ReentrantLock reentrantLock = f7245h;
            reentrantLock.lock();
            try {
                if (this.f7249e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f7249e = 1;
                B3.o.d(this, j9, z6);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = f7245h;
        reentrantLock.lock();
        try {
            int i3 = this.f7249e;
            this.f7249e = 0;
            if (i3 != 1) {
                boolean z6 = i3 == 2;
                reentrantLock.unlock();
                return z6;
            }
            C0678f c0678f = f7248l;
            while (c0678f != null) {
                C0678f c0678f2 = c0678f.f7250f;
                if (c0678f2 == this) {
                    c0678f.f7250f = this.f7250f;
                    this.f7250f = null;
                    reentrantLock.unlock();
                    return false;
                }
                c0678f = c0678f2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void k() {
    }
}
