package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseDataSource implements androidx.media3.datasource.DataSource {
    private androidx.media3.datasource.DataSpec dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final java.util.ArrayList<androidx.media3.datasource.TransferListener> listeners = new java.util.ArrayList<>(1);

    public BaseDataSource(boolean z6) {
        this.isNetwork = z6;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
        transferListener.getClass();
        if (this.listeners.contains(transferListener)) {
            return;
        }
        this.listeners.add(transferListener);
        this.listenerCount++;
    }

    public final void bytesTransferred(int i3) {
        androidx.media3.datasource.DataSpec dataSpec = (androidx.media3.datasource.DataSpec) androidx.media3.common.util.Util.castNonNull(this.dataSpec);
        for (int i9 = 0; i9 < this.listenerCount; i9++) {
            this.listeners.get(i9).onBytesTransferred(this, dataSpec, this.isNetwork, i3);
        }
    }

    public final void transferEnded() {
        androidx.media3.datasource.DataSpec dataSpec = (androidx.media3.datasource.DataSpec) androidx.media3.common.util.Util.castNonNull(this.dataSpec);
        for (int i3 = 0; i3 < this.listenerCount; i3++) {
            this.listeners.get(i3).onTransferEnd(this, dataSpec, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(androidx.media3.datasource.DataSpec dataSpec) {
        for (int i3 = 0; i3 < this.listenerCount; i3++) {
            this.listeners.get(i3).onTransferInitializing(this, dataSpec, this.isNetwork);
        }
    }

    public final void transferStarted(androidx.media3.datasource.DataSpec dataSpec) {
        this.dataSpec = dataSpec;
        for (int i3 = 0; i3 < this.listenerCount; i3++) {
            this.listeners.get(i3).onTransferStart(this, dataSpec, this.isNetwork);
        }
    }
}
