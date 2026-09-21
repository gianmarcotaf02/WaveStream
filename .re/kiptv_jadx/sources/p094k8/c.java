package p094k8;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements p094k8.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.io.OutputStream f24511h;

    public c(java.io.OutputStream outputStream) {
        this.f24511h = outputStream;
    }

    @Override // p094k8.e, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.f24511h.close();
    }

    @Override // p094k8.e, java.io.Flushable
    public final void flush() throws java.io.IOException {
        this.f24511h.flush();
    }

    public final java.lang.String toString() {
        return "RawSink(" + this.f24511h + ')';
    }

    @Override // p094k8.e
    public final void write(p094k8.a source, long j) throws java.io.IOException {
        kotlin.jvm.internal.m.e(source, "source");
        p094k8.p.b(source.j, 0L, j);
        while (j > 0) {
            if (source.o()) {
                throw new java.lang.IllegalArgumentException("Buffer is empty");
            }
            p094k8.j jVar = source.f24508h;
            kotlin.jvm.internal.m.b(jVar);
            int i3 = jVar.f24524b;
            int iMin = (int) java.lang.Math.min(j, jVar.f24525c - i3);
            this.f24511h.write(jVar.f24523a, i3, iMin);
            long j9 = iMin;
            j -= j9;
            if (iMin != 0) {
                if (iMin < 0) {
                    throw new java.lang.IllegalStateException("Returned negative read bytes count");
                }
                if (iMin > jVar.b()) {
                    throw new java.lang.IllegalStateException("Returned too many bytes");
                }
                source.C(j9);
            }
        }
    }
}
