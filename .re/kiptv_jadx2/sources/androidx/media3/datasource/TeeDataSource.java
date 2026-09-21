package androidx.media3.datasource;

import android.net.Uri;
import java.util.List;
import java.util.Map;

public final class TeeDataSource implements DataSource {
    private long bytesRemaining;
    private final DataSink dataSink;
    private boolean dataSinkNeedsClosing;
    private final DataSource upstream;

    public TeeDataSource(DataSource dataSource, DataSink dataSink) {
        dataSource.getClass();
        this.upstream = dataSource;
        dataSink.getClass();
        this.dataSink = dataSink;
    }

    @Override
    public void addTransferListener(TransferListener transferListener) {
        transferListener.getClass();
        this.upstream.addTransferListener(transferListener);
    }

    @Override
    public void close() {
        try {
            this.upstream.close();
        } finally {
            if (this.dataSinkNeedsClosing) {
                this.dataSinkNeedsClosing = false;
                this.dataSink.close();
            }
        }
    }

    @Override
    public Map<String, List<String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override
    public Uri getUri() {
        return this.upstream.getUri();
    }

    @Override
    public long open(DataSpec dataSpec) {
        long jOpen = this.upstream.open(dataSpec);
        this.bytesRemaining = jOpen;
        if (jOpen == 0) {
            return 0L;
        }
        if (dataSpec.length == -1 && jOpen != -1) {
            dataSpec = dataSpec.subrange(0L, jOpen);
        }
        this.dataSinkNeedsClosing = true;
        this.dataSink.open(dataSpec);
        return this.bytesRemaining;
    }

    @Override
    public int read(byte[] bArr, int i3, int i9) {
        if (this.bytesRemaining == 0) {
            return -1;
        }
        int i10 = this.upstream.read(bArr, i3, i9);
        if (i10 > 0) {
            this.dataSink.write(bArr, i3, i10);
            long j = this.bytesRemaining;
            if (j != -1) {
                this.bytesRemaining = j - ((long) i10);
            }
        }
        return i10;
    }
}
