package androidx.media3.decoder;

/* JADX INFO: loaded from: classes.dex */
public final class CryptoInfo {
    public int clearBlocks;
    public int encryptedBlocks;
    private final android.media.MediaCodec.CryptoInfo frameworkCryptoInfo;
    public byte[] iv;
    public byte[] key;
    public int mode;
    public int[] numBytesOfClearData;
    public int[] numBytesOfEncryptedData;
    public int numSubSamples;
    private final androidx.media3.decoder.CryptoInfo.PatternHolderV24 patternHolder;

    public static final class PatternHolderV24 {
        private final android.media.MediaCodec.CryptoInfo frameworkCryptoInfo;
        private final android.media.MediaCodec.CryptoInfo.Pattern pattern;

        /* JADX INFO: Access modifiers changed from: private */
        public void set(int i3, int i9) {
            this.pattern.set(i3, i9);
            this.frameworkCryptoInfo.setPattern(this.pattern);
        }

        private PatternHolderV24(android.media.MediaCodec.CryptoInfo cryptoInfo) {
            this.frameworkCryptoInfo = cryptoInfo;
            this.pattern = new android.media.MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public CryptoInfo() {
        android.media.MediaCodec.CryptoInfo cryptoInfo = new android.media.MediaCodec.CryptoInfo();
        this.frameworkCryptoInfo = cryptoInfo;
        this.patternHolder = new androidx.media3.decoder.CryptoInfo.PatternHolderV24(cryptoInfo);
    }

    public android.media.MediaCodec.CryptoInfo getFrameworkCryptoInfo() {
        return this.frameworkCryptoInfo;
    }

    public void increaseClearDataFirstSubSampleBy(int i3) {
        if (i3 == 0) {
            return;
        }
        if (this.numBytesOfClearData == null) {
            int[] iArr = new int[1];
            this.numBytesOfClearData = iArr;
            this.frameworkCryptoInfo.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.numBytesOfClearData;
        iArr2[0] = iArr2[0] + i3;
    }

    public void set(int i3, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i9, int i10, int i11) {
        this.numSubSamples = i3;
        this.numBytesOfClearData = iArr;
        this.numBytesOfEncryptedData = iArr2;
        this.key = bArr;
        this.iv = bArr2;
        this.mode = i9;
        this.encryptedBlocks = i10;
        this.clearBlocks = i11;
        android.media.MediaCodec.CryptoInfo cryptoInfo = this.frameworkCryptoInfo;
        cryptoInfo.numSubSamples = i3;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i9;
        androidx.media3.decoder.CryptoInfo.PatternHolderV24 patternHolderV24 = this.patternHolder;
        patternHolderV24.getClass();
        patternHolderV24.set(i10, i11);
    }
}
