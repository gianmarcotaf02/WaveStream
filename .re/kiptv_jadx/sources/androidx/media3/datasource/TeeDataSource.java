package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class TeeDataSource implements androidx.media3.datasource.DataSource {
    private long bytesRemaining;
    private final androidx.media3.datasource.DataSink dataSink;
    private boolean dataSinkNeedsClosing;
    private final androidx.media3.datasource.DataSource upstream;

    public TeeDataSource(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSink dataSink) {
        dataSource.getClass();
        this.upstream = dataSource;
        dataSink.getClass();
        this.dataSink = dataSink;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
        transferListener.getClass();
        this.upstream.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
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

    @Override // androidx.media3.datasource.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) {
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

    @Override // androidx.media3.common.DataReader
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
