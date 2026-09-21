package H2;

/* JADX INFO: loaded from: classes.dex */
public final class m extends java.io.InputStream implements java.lang.AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.io.InputStream f3895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3896i = 1073741824;

    public m(java.io.InputStream inputStream) {
        this.f3895h = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f3896i;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.f3895h.close();
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        int i3 = this.f3895h.read();
        if (i3 == -1) {
            this.f3896i = 0;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.f3895h.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws java.io.IOException {
        int i3 = this.f3895h.read(bArr);
        if (i3 == -1) {
            this.f3896i = 0;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i9) throws java.io.IOException {
        int i10 = this.f3895h.read(bArr, i3, i9);
        if (i10 == -1) {
            this.f3896i = 0;
        }
        return i10;
    }
}
