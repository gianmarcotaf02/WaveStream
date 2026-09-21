package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public interface TransferListener {
    void onBytesTransferred(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, boolean z6, int i3);

    void onTransferEnd(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, boolean z6);

    void onTransferInitializing(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, boolean z6);

    void onTransferStart(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, boolean z6);
}
