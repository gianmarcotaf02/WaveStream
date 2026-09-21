package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class ResolvingDataSource implements androidx.media3.datasource.DataSource {
    private final androidx.media3.datasource.ResolvingDataSource.Resolver resolver;
    private final androidx.media3.datasource.DataSource upstreamDataSource;
    private boolean upstreamOpened;

    public static final class Factory implements androidx.media3.datasource.DataSource.Factory {
        private final androidx.media3.datasource.ResolvingDataSource.Resolver resolver;
        private final androidx.media3.datasource.DataSource.Factory upstreamFactory;

        public Factory(androidx.media3.datasource.DataSource.Factory factory, androidx.media3.datasource.ResolvingDataSource.Resolver resolver) {
            this.upstreamFactory = factory;
            this.resolver = resolver;
        }

        @Override // androidx.media3.datasource.DataSource.Factory
        public androidx.media3.datasource.ResolvingDataSource createDataSource() {
            return new androidx.media3.datasource.ResolvingDataSource(this.upstreamFactory.createDataSource(), this.resolver);
        }
    }

    public interface Resolver {
        androidx.media3.datasource.DataSpec resolveDataSpec(androidx.media3.datasource.DataSpec dataSpec);

        default android.net.Uri resolveReportedUri(android.net.Uri uri) {
            return uri;
        }
    }

    public ResolvingDataSource(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.ResolvingDataSource.Resolver resolver) {
        this.upstreamDataSource = dataSource;
        this.resolver = resolver;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
        transferListener.getClass();
        this.upstreamDataSource.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        if (this.upstreamOpened) {
            this.upstreamOpened = false;
            this.upstreamDataSource.close();
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return this.upstreamDataSource.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        android.net.Uri uri = this.upstreamDataSource.getUri();
        if (uri == null) {
            return null;
        }
        return this.resolver.resolveReportedUri(uri);
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) {
        androidx.media3.datasource.DataSpec dataSpecResolveDataSpec = this.resolver.resolveDataSpec(dataSpec);
        this.upstreamOpened = true;
        return this.upstreamDataSource.open(dataSpecResolveDataSpec);
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i3, int i9) {
        return this.upstreamDataSource.read(bArr, i3, i9);
    }
}
