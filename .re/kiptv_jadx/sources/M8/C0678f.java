package M8;

/* JADX INFO: renamed from: M8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0678f extends M8.M {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f7245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.locks.Condition f7246i;
    public static final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f7247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static M8.C0678f f7248l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public M8.C0678f f7250f;
    public long g;

    static {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        f7245h = reentrantLock;
        java.util.concurrent.locks.Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.m.d(conditionNewCondition, "newCondition(...)");
        f7246i = conditionNewCondition;
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(60L);
        j = millis;
        f7247k = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void i() {
        long j9 = this.f7234c;
        boolean z6 = this.f7232a;
        if (j9 != 0 || z6) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = f7245h;
            reentrantLock.lock();
            try {
                if (this.f7249e != 0) {
                    throw new java.lang.IllegalStateException("Unbalanced enter/exit");
                }
                this.f7249e = 1;
                B3.o.d(this, j9, z6);
                reentrantLock.unlock();
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean j() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = f7245h;
        reentrantLock.lock();
        try {
            int i3 = this.f7249e;
            this.f7249e = 0;
            if (i3 != 1) {
                boolean z6 = i3 == 2;
                reentrantLock.unlock();
                return z6;
            }
            M8.C0678f c0678f = f7248l;
            while (c0678f != null) {
                M8.C0678f c0678f2 = c0678f.f7250f;
                if (c0678f2 == this) {
                    c0678f.f7250f = this.f7250f;
                    this.f7250f = null;
                    reentrantLock.unlock();
                    return false;
                }
                c0678f = c0678f2;
            }
            throw new java.lang.IllegalStateException("node was not found in the queue");
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void k() {
    }
}
