package W1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends W1.b {
    public f(byte[] bArr) {
        super(bArr);
        this.f10543h.mark(androidx.media3.common.util.Log.LOG_LEVEL_OFF);
    }

    public final void e(long j) throws java.io.IOException {
        int i3 = this.f10544i;
        if (i3 > j) {
            this.f10544i = 0;
            this.f10543h.reset();
        } else {
            j -= (long) i3;
        }
        b((int) j);
    }

    public f(java.io.InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f10543h.mark(androidx.media3.common.util.Log.LOG_LEVEL_OFF);
            return;
        }
        throw new java.lang.IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
