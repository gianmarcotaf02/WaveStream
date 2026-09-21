package M8;

/* JADX INFO: loaded from: classes4.dex */
public class M {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M8.L f7231d = new M8.L();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f7233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7234c;

    public M8.M a() {
        this.f7232a = false;
        return this;
    }

    public M8.M b() {
        this.f7234c = 0L;
        return this;
    }

    public long c() {
        if (this.f7232a) {
            return this.f7233b;
        }
        throw new java.lang.IllegalStateException("No deadline");
    }

    public M8.M d(long j) {
        this.f7232a = true;
        this.f7233b = j;
        return this;
    }

    public boolean e() {
        return this.f7232a;
    }

    public void f() throws java.io.InterruptedIOException {
        if (java.lang.Thread.currentThread().isInterrupted()) {
            throw new java.io.InterruptedIOException("interrupted");
        }
        if (this.f7232a && this.f7233b - java.lang.System.nanoTime() <= 0) {
            throw new java.io.InterruptedIOException("deadline reached");
        }
    }

    public M8.M g(long j, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.m.e(unit, "unit");
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(B2.a.j(j, "timeout < 0: ").toString());
        }
        this.f7234c = unit.toNanos(j);
        return this;
    }

    public long h() {
        return this.f7234c;
    }
}
