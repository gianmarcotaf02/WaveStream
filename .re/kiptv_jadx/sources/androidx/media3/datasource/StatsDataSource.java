package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class StatsDataSource implements androidx.media3.datasource.DataSource {
    private long bytesRead;
    private final androidx.media3.datasource.DataSource dataSource;
    private android.net.Uri lastOpenedUri;
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> lastResponseHeaders;

    public StatsDataSource(androidx.media3.datasource.DataSource dataSource) {
        dataSource.getClass();
        this.dataSource = dataSource;
        this.lastOpenedUri = android.net.Uri.EMPTY;
        this.lastResponseHeaders = java.util.Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
        transferListener.getClass();
        this.dataSource.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.dataSource.close();
    }

    public long getBytesRead() {
        return this.bytesRead;
    }

    public android.net.Uri getLastOpenedUri() {
        return this.lastOpenedUri;
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getLastResponseHeaders() {
        return this.lastResponseHeaders;
    }

    @Override // androidx.media3.datasource.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return this.dataSource.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        return this.dataSource.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) {
        this.lastOpenedUri = dataSpec.uri;
        this.lastResponseHeaders = java.util.Collections.EMPTY_MAP;
        try {
            return this.dataSource.open(dataSpec);
        } finally {
            android.net.Uri uri = getUri();
            if (uri != null) {
                this.lastOpenedUri = uri;
            }
            this.lastResponseHeaders = getResponseHeaders();
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i3, int i9) {
        int i10 = this.dataSource.read(bArr, i3, i9);
        if (i10 != -1) {
            this.bytesRead += (long) i10;
        }
        return i10;
    }

    public void resetBytesRead() {
        this.bytesRead = 0L;
    }
}
