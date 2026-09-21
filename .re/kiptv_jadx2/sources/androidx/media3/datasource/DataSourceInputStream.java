package androidx.media3.datasource;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.io.InputStream;

public final class DataSourceInputStream extends InputStream implements AutoCloseable {
    private final DataSource dataSource;
    private final DataSpec dataSpec;
    private long totalBytesRead;
    private boolean opened = false;
    private boolean closed = false;
    private final byte[] singleByteArray = new byte[1];

    public DataSourceInputStream(DataSource dataSource, DataSpec dataSpec) {
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

    @Override
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

    @Override
    public int read() {
        if (read(this.singleByteArray) == -1) {
            return -1;
        }
        return this.singleByteArray[0] & 255;
    }

    @Override
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override
    public int read(byte[] bArr, int i3, int i9) {
        AbstractC1864o0.Y(!this.closed);
        checkOpened();
        int i10 = this.dataSource.read(bArr, i3, i9);
        if (i10 == -1) {
            return -1;
        }
        this.totalBytesRead += (long) i10;
        return i10;
    }
}
