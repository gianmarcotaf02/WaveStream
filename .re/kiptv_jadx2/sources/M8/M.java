package M8;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class M {

    public static final L f7231d = new L();

    public boolean f7232a;

    public long f7233b;

    public long f7234c;

    public M a() {
        this.f7232a = false;
        return this;
    }

    public M b() {
        this.f7234c = 0L;
        return this;
    }

    public long c() {
        if (this.f7232a) {
            return this.f7233b;
        }
        throw new IllegalStateException("No deadline");
    }

    public M d(long j) {
        this.f7232a = true;
        this.f7233b = j;
        return this;
    }

    public boolean e() {
        return this.f7232a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f7232a && this.f7233b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public M g(long j, TimeUnit unit) {
        kotlin.jvm.internal.m.e(unit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(B2.a.j(j, "timeout < 0: ").toString());
        }
        this.f7234c = unit.toNanos(j);
        return this;
    }

    public long h() {
        return this.f7234c;
    }
}
