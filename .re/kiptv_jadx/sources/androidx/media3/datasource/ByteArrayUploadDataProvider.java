package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
final class ByteArrayUploadDataProvider extends android.net.http.UploadDataProvider {
    private final byte[] data;
    private int position;

    public ByteArrayUploadDataProvider(byte[] bArr) {
        this.data = bArr;
    }

    public long getLength() {
        return this.data.length;
    }

    public void read(android.net.http.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) {
        int iMin = java.lang.Math.min(byteBuffer.remaining(), this.data.length - this.position);
        byteBuffer.put(this.data, this.position, iMin);
        this.position += iMin;
        uploadDataSink.onReadSucceeded(false);
    }

    public void rewind(android.net.http.UploadDataSink uploadDataSink) {
        this.position = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
