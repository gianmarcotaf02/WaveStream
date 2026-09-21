package M8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r implements M8.K {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M8.K f7277h;

    public r(M8.K delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.f7277h = delegate;
    }

    @Override // M8.K
    public final M8.M c() {
        return this.f7277h.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.f7277h.close();
    }

    @Override // M8.K
    public long m(long j, M8.C0682j sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        return this.f7277h.m(j, sink);
    }

    public final java.lang.String toString() {
        return getClass().getSimpleName() + '(' + this.f7277h + ')';
    }
}
