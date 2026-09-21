package androidx.media3.datasource;

public interface TransferListener {
    void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z6, int i3);

    void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z6);

    void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z6);

    void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z6);
}
