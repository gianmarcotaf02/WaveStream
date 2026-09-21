package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.Util;
import java.util.List;
import java.util.Map;

public final class AesCipherDataSource implements DataSource {
    private AesFlushingCipher cipher;
    private final byte[] secretKey;
    private final DataSource upstream;

    public AesCipherDataSource(byte[] bArr, DataSource dataSource) {
        this.upstream = dataSource;
        this.secretKey = bArr;
    }

    @Override
    public void addTransferListener(TransferListener transferListener) {
        transferListener.getClass();
        this.upstream.addTransferListener(transferListener);
    }

    @Override
    public void close() {
        this.cipher = null;
        this.upstream.close();
    }

    @Override
    public Map<String, List<String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override
    public Uri getUri() {
        return this.upstream.getUri();
    }

    @Override
    public long open(DataSpec dataSpec) {
        long jOpen = this.upstream.open(dataSpec);
        this.cipher = new AesFlushingCipher(2, this.secretKey, dataSpec.key, dataSpec.uriPositionOffset + dataSpec.position);
        return jOpen;
    }

    @Override
    public int read(byte[] bArr, int i3, int i9) {
        if (i9 == 0) {
            return 0;
        }
        int i10 = this.upstream.read(bArr, i3, i9);
        if (i10 == -1) {
            return -1;
        }
        ((AesFlushingCipher) Util.castNonNull(this.cipher)).updateInPlace(bArr, i3, i10);
        return i10;
    }
}
