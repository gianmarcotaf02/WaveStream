package M8;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public final class s extends M {

    public M f7278e;

    public s(M delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.f7278e = delegate;
    }

    @Override
    public final M a() {
        return this.f7278e.a();
    }

    @Override
    public final M b() {
        return this.f7278e.b();
    }

    @Override
    public final long c() {
        return this.f7278e.c();
    }

    @Override
    public final M d(long j) {
        return this.f7278e.d(j);
    }

    @Override
    public final boolean e() {
        return this.f7278e.e();
    }

    @Override
    public final void f() throws InterruptedIOException {
        this.f7278e.f();
    }

    @Override
    public final M g(long j, TimeUnit unit) {
        kotlin.jvm.internal.m.e(unit, "unit");
        return this.f7278e.g(j, unit);
    }

    @Override
    public final long h() {
        return this.f7278e.h();
    }
}
