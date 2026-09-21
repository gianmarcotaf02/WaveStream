package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class PlaceholderDataSource implements androidx.media3.datasource.DataSource {
    public static final androidx.media3.datasource.PlaceholderDataSource INSTANCE = new androidx.media3.datasource.PlaceholderDataSource();
    public static final androidx.media3.datasource.DataSource.Factory FACTORY = new androidx.media3.datasource.f();

    private PlaceholderDataSource() {
    }

    public static /* synthetic */ androidx.media3.datasource.PlaceholderDataSource b() {
        return new androidx.media3.datasource.PlaceholderDataSource();
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        throw new java.io.IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i3, int i9) {
        throw new java.lang.UnsupportedOperationException();
    }
}
