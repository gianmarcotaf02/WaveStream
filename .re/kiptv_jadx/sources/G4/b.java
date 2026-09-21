package G4;

/* JADX INFO: loaded from: classes.dex */
public final class b extends java.io.OutputStream {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3788h;

    @Override // java.io.OutputStream
    public final void write(int i3) {
        this.f3788h++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f3788h += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i9) {
        int i10;
        if (i3 >= 0 && i3 <= bArr.length && i9 >= 0 && (i10 = i3 + i9) <= bArr.length && i10 >= 0) {
            this.f3788h += (long) i9;
            return;
        }
        throw new java.lang.IndexOutOfBoundsException();
    }
}
