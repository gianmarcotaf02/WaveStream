package androidx.media3.datasource;

import androidx.media3.common.util.Util;

public final class AesCipherDataSink implements DataSink {
    private AesFlushingCipher cipher;
    private final byte[] scratch;
    private final byte[] secretKey;
    private final DataSink wrappedDataSink;

    public AesCipherDataSink(byte[] bArr, DataSink dataSink) {
        this(bArr, dataSink, null);
    }

    @Override
    public void close() {
        this.cipher = null;
        this.wrappedDataSink.close();
    }

    @Override
    public void open(DataSpec dataSpec) {
        this.wrappedDataSink.open(dataSpec);
        this.cipher = new AesFlushingCipher(1, this.secretKey, dataSpec.key, dataSpec.uriPositionOffset + dataSpec.position);
    }

    @Override
    public void write(byte[] bArr, int i3, int i9) {
        if (this.scratch == null) {
            ((AesFlushingCipher) Util.castNonNull(this.cipher)).updateInPlace(bArr, i3, i9);
            this.wrappedDataSink.write(bArr, i3, i9);
            return;
        }
        int i10 = 0;
        while (i10 < i9) {
            int iMin = Math.min(i9 - i10, this.scratch.length);
            byte[] bArr2 = bArr;
            ((AesFlushingCipher) Util.castNonNull(this.cipher)).update(bArr2, i3 + i10, iMin, this.scratch, 0);
            this.wrappedDataSink.write(this.scratch, 0, iMin);
            i10 += iMin;
            bArr = bArr2;
        }
    }

    public AesCipherDataSink(byte[] bArr, DataSink dataSink, byte[] bArr2) {
        this.wrappedDataSink = dataSink;
        this.secretKey = bArr;
        this.scratch = bArr2;
    }
}
