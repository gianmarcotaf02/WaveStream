package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class PriorityDataSource implements androidx.media3.datasource.DataSource {
    private final int priority;
    private final androidx.media3.common.PriorityTaskManager priorityTaskManager;
    private final androidx.media3.datasource.DataSource upstream;

    public static final class Factory implements androidx.media3.datasource.DataSource.Factory {
        private final int priority;
        private final androidx.media3.common.PriorityTaskManager priorityTaskManager;
        private final androidx.media3.datasource.DataSource.Factory upstreamFactory;

        public Factory(androidx.media3.datasource.DataSource.Factory factory, androidx.media3.common.PriorityTaskManager priorityTaskManager, int i3) {
            this.upstreamFactory = factory;
            this.priorityTaskManager = priorityTaskManager;
            this.priority = i3;
        }

        @Override // androidx.media3.datasource.DataSource.Factory
        public androidx.media3.datasource.PriorityDataSource createDataSource() {
            return new androidx.media3.datasource.PriorityDataSource(this.upstreamFactory.createDataSource(), this.priorityTaskManager, this.priority);
        }
    }

    public PriorityDataSource(androidx.media3.datasource.DataSource dataSource, androidx.media3.common.PriorityTaskManager priorityTaskManager, int i3) {
        dataSource.getClass();
        this.upstream = dataSource;
        priorityTaskManager.getClass();
        this.priorityTaskManager = priorityTaskManager;
        this.priority = i3;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
        transferListener.getClass();
        this.upstream.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.upstream.close();
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
        this.priorityTaskManager.proceedOrThrow(this.priority);
        return this.upstream.open(dataSpec);
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i3, int i9) {
        this.priorityTaskManager.proceedOrThrow(this.priority);
        return this.upstream.read(bArr, i3, i9);
    }
}
