package androidx.media3.extractor.wav;

/* JADX INFO: loaded from: classes.dex */
final class WavFormat {
    public final int averageBytesPerSecond;
    public final int bitsPerSample;
    public final int blockSize;
    public final byte[] extraData;
    public final int formatType;
    public final int frameRateHz;
    public final int numChannels;

    public WavFormat(int i3, int i9, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.formatType = i3;
        this.numChannels = i9;
        this.frameRateHz = i10;
        this.averageBytesPerSecond = i11;
        this.blockSize = i12;
        this.bitsPerSample = i13;
        this.extraData = bArr;
    }
}
