package W1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends android.media.MediaDataSource implements java.lang.AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ W1.f f10542i;

    public a(W1.f fVar) {
        this.f10542i = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i3, int i9) {
        if (i9 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j9 = this.f10541h;
            W1.f fVar = this.f10542i;
            if (j9 != j) {
                if (j9 >= 0 && j >= j9 + ((long) fVar.f10543h.available())) {
                    return -1;
                }
                fVar.e(j);
                this.f10541h = j;
            }
            if (i9 > fVar.f10543h.available()) {
                i9 = fVar.f10543h.available();
            }
            int i10 = fVar.read(bArr, i3, i9);
            if (i10 >= 0) {
                this.f10541h += (long) i10;
                return i10;
            }
        } catch (java.io.IOException unused) {
        }
        this.f10541h = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
