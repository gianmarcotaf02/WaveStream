package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;

public final class PlaceholderDataSource implements DataSource {
    public static final PlaceholderDataSource INSTANCE = new PlaceholderDataSource();
    public static final DataSource.Factory FACTORY = new f();

    private PlaceholderDataSource() {
    }

    public static PlaceholderDataSource b() {
        return new PlaceholderDataSource();
    }

    @Override
    public void addTransferListener(TransferListener transferListener) {
    }

    @Override
    public void close() {
    }

    @Override
    public Uri getUri() {
        return null;
    }

    @Override
    public long open(DataSpec dataSpec) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override
    public int read(byte[] bArr, int i3, int i9) {
        throw new UnsupportedOperationException();
    }
}
