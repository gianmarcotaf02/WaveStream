package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public interface TrackOutput {
    public static final int SAMPLE_DATA_PART_ENCRYPTION = 1;
    public static final int SAMPLE_DATA_PART_MAIN = 0;
    public static final int SAMPLE_DATA_PART_SUPPLEMENTAL = 2;

    public static final class CryptoData {
        public final int clearBlocks;
        public final int cryptoMode;
        public final int encryptedBlocks;
        public final byte[] encryptionKey;

        public CryptoData(int i3, byte[] bArr, int i9, int i10) {
            this.cryptoMode = i3;
            this.encryptionKey = bArr;
            this.encryptedBlocks = i9;
            this.clearBlocks = i10;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && androidx.media3.extractor.TrackOutput.CryptoData.class == obj.getClass()) {
                androidx.media3.extractor.TrackOutput.CryptoData cryptoData = (androidx.media3.extractor.TrackOutput.CryptoData) obj;
                if (this.cryptoMode == cryptoData.cryptoMode && this.encryptedBlocks == cryptoData.encryptedBlocks && this.clearBlocks == cryptoData.clearBlocks && java.util.Arrays.equals(this.encryptionKey, cryptoData.encryptionKey)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((java.util.Arrays.hashCode(this.encryptionKey) + (this.cryptoMode * 31)) * 31) + this.encryptedBlocks) * 31) + this.clearBlocks;
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SampleDataPart {
    }

    default void durationUs(long j) {
    }

    void format(androidx.media3.common.Format format);

    default int sampleData(androidx.media3.common.DataReader dataReader, int i3, boolean z6) {
        return sampleData(dataReader, i3, z6, 0);
    }

    int sampleData(androidx.media3.common.DataReader dataReader, int i3, boolean z6, int i9);

    void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9);

    void sampleMetadata(long j, int i3, int i9, int i10, androidx.media3.extractor.TrackOutput.CryptoData cryptoData);

    default void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        sampleData(parsableByteArray, i3, 0);
    }
}
