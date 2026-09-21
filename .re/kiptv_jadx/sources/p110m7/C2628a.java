package p110m7;

/* JADX INFO: renamed from: m7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2628a extends java.io.FilterInputStream {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25470h;

    public C2628a(java.io.ByteArrayInputStream byteArrayInputStream, int i3) {
        super(byteArrayInputStream);
        this.f25470h = i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return java.lang.Math.min(super.available(), this.f25470h);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        if (this.f25470h <= 0) {
            return -1;
        }
        int i3 = super.read();
        if (i3 >= 0) {
            this.f25470h--;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        long jSkip = super.skip(java.lang.Math.min(j, this.f25470h));
        if (jSkip >= 0) {
            this.f25470h = (int) (((long) this.f25470h) - jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i3, int i9) throws java.io.IOException {
        int i10 = this.f25470h;
        if (i10 <= 0) {
            return -1;
        }
        int i11 = super.read(bArr, i3, java.lang.Math.min(i9, i10));
        if (i11 >= 0) {
            this.f25470h -= i11;
        }
        return i11;
    }
}
