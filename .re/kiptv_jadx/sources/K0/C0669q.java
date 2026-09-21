package K0;

/* JADX INFO: renamed from: K0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0669q extends java.util.concurrent.CancellationException {
    public C0669q(long j) {
        super(B2.a.k(j, "Timed out waiting for ", " ms"));
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(K0.w.f6737c);
        return this;
    }
}
