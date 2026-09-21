package M8;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends M8.M {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public M8.M f7278e;

    public s(M8.M delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.f7278e = delegate;
    }

    @Override // M8.M
    public final M8.M a() {
        return this.f7278e.a();
    }

    @Override // M8.M
    public final M8.M b() {
        return this.f7278e.b();
    }

    @Override // M8.M
    public final long c() {
        return this.f7278e.c();
    }

    @Override // M8.M
    public final M8.M d(long j) {
        return this.f7278e.d(j);
    }

    @Override // M8.M
    public final boolean e() {
        return this.f7278e.e();
    }

    @Override // M8.M
    public final void f() throws java.io.InterruptedIOException {
        this.f7278e.f();
    }

    @Override // M8.M
    public final M8.M g(long j, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.m.e(unit, "unit");
        return this.f7278e.g(j, unit);
    }

    @Override // M8.M
    public final long h() {
        return this.f7278e.h();
    }
}
