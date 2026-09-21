package S7;

/* JADX INFO: loaded from: classes4.dex */
public final class C0 extends X7.p implements java.lang.Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f9534l;

    public C0(long j, S7.D0 d4) {
        super(d4, d4.getContext());
        this.f9534l = j;
    }

    @Override // S7.p0
    public final java.lang.String L() {
        return super.L() + "(timeMillis=" + this.f9534l + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        S7.C.r(this.j);
        l(new S7.B0(Y6.f.g(this.f9534l, " ms", new java.lang.StringBuilder("Timed out waiting for ")), this));
    }
}
