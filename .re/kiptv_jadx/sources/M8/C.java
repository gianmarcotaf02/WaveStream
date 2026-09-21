package M8;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends java.io.OutputStream implements java.lang.AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ M8.D f7214h;

    public C(M8.D d4) {
        this.f7214h = d4;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.lang.Throwable {
        this.f7214h.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        M8.D d4 = this.f7214h;
        if (d4.j) {
            return;
        }
        d4.flush();
    }

    public final java.lang.String toString() {
        return this.f7214h + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i3) throws java.io.IOException {
        M8.D d4 = this.f7214h;
        if (d4.j) {
            throw new java.io.IOException("closed");
        }
        d4.f7216i.Z((byte) i3);
        d4.b();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i3, int i9) throws java.io.IOException {
        kotlin.jvm.internal.m.e(data, "data");
        M8.D d4 = this.f7214h;
        if (!d4.j) {
            d4.f7216i.write(data, i3, i9);
            d4.b();
            return;
        }
        throw new java.io.IOException("closed");
    }
}
