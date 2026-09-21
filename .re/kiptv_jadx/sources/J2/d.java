package J2;

/* JADX INFO: loaded from: classes.dex */
public final class d implements M8.K {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.nio.ByteBuffer f6004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6005i;

    public d(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.f6004h = byteBufferSlice;
        this.f6005i = byteBufferSlice.capacity();
    }

    @Override // M8.K
    public final M8.M c() {
        return M8.M.f7231d;
    }

    @Override // M8.K
    public final long m(long j, M8.C0682j c0682j) {
        java.nio.ByteBuffer byteBuffer = this.f6004h;
        int iPosition = byteBuffer.position();
        int i3 = this.f6005i;
        if (iPosition == i3) {
            return -1L;
        }
        int iPosition2 = (int) (((long) byteBuffer.position()) + j);
        if (iPosition2 <= i3) {
            i3 = iPosition2;
        }
        byteBuffer.limit(i3);
        return c0682j.write(byteBuffer);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
