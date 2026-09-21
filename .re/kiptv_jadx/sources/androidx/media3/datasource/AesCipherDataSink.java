package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class AesCipherDataSink implements androidx.media3.datasource.DataSink {
    private androidx.media3.datasource.AesFlushingCipher cipher;
    private final byte[] scratch;
    private final byte[] secretKey;
    private final androidx.media3.datasource.DataSink wrappedDataSink;

    public AesCipherDataSink(byte[] bArr, androidx.media3.datasource.DataSink dataSink) {
        this(bArr, dataSink, null);
    }

    @Override // androidx.media3.datasource.DataSink
    public void close() {
        this.cipher = null;
        this.wrappedDataSink.close();
    }

    @Override // androidx.media3.datasource.DataSink
    public void open(androidx.media3.datasource.DataSpec dataSpec) {
        this.wrappedDataSink.open(dataSpec);
        this.cipher = new androidx.media3.datasource.AesFlushingCipher(1, this.secretKey, dataSpec.key, dataSpec.uriPositionOffset + dataSpec.position);
    }

    @Override // androidx.media3.datasource.DataSink
    public void write(byte[] bArr, int i3, int i9) {
        if (this.scratch == null) {
            ((androidx.media3.datasource.AesFlushingCipher) androidx.media3.common.util.Util.castNonNull(this.cipher)).updateInPlace(bArr, i3, i9);
            this.wrappedDataSink.write(bArr, i3, i9);
            return;
        }
        int i10 = 0;
        while (i10 < i9) {
            int iMin = java.lang.Math.min(i9 - i10, this.scratch.length);
            byte[] bArr2 = bArr;
            ((androidx.media3.datasource.AesFlushingCipher) androidx.media3.common.util.Util.castNonNull(this.cipher)).update(bArr2, i3 + i10, iMin, this.scratch, 0);
            this.wrappedDataSink.write(this.scratch, 0, iMin);
            i10 += iMin;
            bArr = bArr2;
        }
    }

    public AesCipherDataSink(byte[] bArr, androidx.media3.datasource.DataSink dataSink, byte[] bArr2) {
        this.wrappedDataSink = dataSink;
        this.secretKey = bArr;
        this.scratch = bArr2;
    }
}
