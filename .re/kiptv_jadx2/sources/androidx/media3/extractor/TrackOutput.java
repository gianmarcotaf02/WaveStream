package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

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

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && CryptoData.class == obj.getClass()) {
                CryptoData cryptoData = (CryptoData) obj;
                if (this.cryptoMode == cryptoData.cryptoMode && this.encryptedBlocks == cryptoData.encryptedBlocks && this.clearBlocks == cryptoData.clearBlocks && Arrays.equals(this.encryptionKey, cryptoData.encryptionKey)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.encryptionKey) + (this.cryptoMode * 31)) * 31) + this.encryptedBlocks) * 31) + this.clearBlocks;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SampleDataPart {
    }

    default void durationUs(long j) {
    }

    void format(Format format);

    default int sampleData(DataReader dataReader, int i3, boolean z6) {
        return sampleData(dataReader, i3, z6, 0);
    }

    int sampleData(DataReader dataReader, int i3, boolean z6, int i9);

    void sampleData(ParsableByteArray parsableByteArray, int i3, int i9);

    void sampleMetadata(long j, int i3, int i9, int i10, CryptoData cryptoData);

    default void sampleData(ParsableByteArray parsableByteArray, int i3) {
        sampleData(parsableByteArray, i3, 0);
    }
}
