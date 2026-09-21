package androidx.media3.datasource;

import androidx.media3.common.util.Util;
import java.util.ArrayList;

public abstract class BaseDataSource implements DataSource {
    private DataSpec dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<TransferListener> listeners = new ArrayList<>(1);

    public BaseDataSource(boolean z6) {
        this.isNetwork = z6;
    }

    @Override
    public final void addTransferListener(TransferListener transferListener) {
        transferListener.getClass();
        if (this.listeners.contains(transferListener)) {
            return;
        }
        this.listeners.add(transferListener);
        this.listenerCount++;
    }

    public final void bytesTransferred(int i3) {
        DataSpec dataSpec = (DataSpec) Util.castNonNull(this.dataSpec);
        for (int i9 = 0; i9 < this.listenerCount; i9++) {
            this.listeners.get(i9).onBytesTransferred(this, dataSpec, this.isNetwork, i3);
        }
    }

    public final void transferEnded() {
        DataSpec dataSpec = (DataSpec) Util.castNonNull(this.dataSpec);
        for (int i3 = 0; i3 < this.listenerCount; i3++) {
            this.listeners.get(i3).onTransferEnd(this, dataSpec, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(DataSpec dataSpec) {
        for (int i3 = 0; i3 < this.listenerCount; i3++) {
            this.listeners.get(i3).onTransferInitializing(this, dataSpec, this.isNetwork);
        }
    }

    public final void transferStarted(DataSpec dataSpec) {
        this.dataSpec = dataSpec;
        for (int i3 = 0; i3 < this.listenerCount; i3++) {
            this.listeners.get(i3).onTransferStart(this, dataSpec, this.isNetwork);
        }
    }
}
