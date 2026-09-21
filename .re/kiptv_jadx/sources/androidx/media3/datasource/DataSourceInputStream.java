package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class DataSourceInputStream extends java.io.InputStream implements java.lang.AutoCloseable {
    private final androidx.media3.datasource.DataSource dataSource;
    private final androidx.media3.datasource.DataSpec dataSpec;
    private long totalBytesRead;
    private boolean opened = false;
    private boolean closed = false;
    private final byte[] singleByteArray = new byte[1];

    public DataSourceInputStream(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec) {
        this.dataSource = dataSource;
        this.dataSpec = dataSpec;
    }

    private void checkOpened() {
        if (this.opened) {
            return;
        }
        this.dataSource.open(this.dataSpec);
        this.opened = true;
    }

    public long bytesRead() {
        return this.totalBytesRead;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.dataSource.close();
        this.closed = true;
    }

    public void open() {
        checkOpened();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.singleByteArray) == -1) {
            return -1;
        }
        return this.singleByteArray[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i3, int i9) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.closed);
        checkOpened();
        int i10 = this.dataSource.read(bArr, i3, i9);
        if (i10 == -1) {
            return -1;
        }
        this.totalBytesRead += (long) i10;
        return i10;
    }
}
