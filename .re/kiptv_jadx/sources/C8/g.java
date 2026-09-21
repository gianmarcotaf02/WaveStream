package C8;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends C8.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1632k;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1620i) {
            return;
        }
        if (!this.f1632k) {
            b();
        }
        this.f1620i = true;
    }

    @Override // C8.b, M8.K
    public final long m(long j, M8.C0682j sink) throws java.io.IOException {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(B2.a.j(j, "byteCount < 0: ").toString());
        }
        if (this.f1620i) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (this.f1632k) {
            return -1L;
        }
        long jM = super.m(j, sink);
        if (jM != -1) {
            return jM;
        }
        this.f1632k = true;
        b();
        return -1L;
    }
}
