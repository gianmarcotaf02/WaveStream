package androidx.media3.extractor.mp3;

/* JADX INFO: loaded from: classes.dex */
final class ConstantBitrateSeeker extends androidx.media3.extractor.ConstantBitrateSeekMap implements androidx.media3.extractor.mp3.Seeker {
    private final boolean allowSeeksIfLengthUnknown;
    private final int bitrate;
    private final long dataEndPosition;
    private final long firstFramePosition;
    private final int frameSize;

    public ConstantBitrateSeeker(long j, long j9, androidx.media3.extractor.MpegAudioUtil.Header header, boolean z6) {
        this(j, j9, header.bitrate, header.frameSize, z6, true);
    }

    public androidx.media3.extractor.mp3.ConstantBitrateSeeker copyWithNewDataEndPosition(long j) {
        return new androidx.media3.extractor.mp3.ConstantBitrateSeeker(j, this.firstFramePosition, this.bitrate, this.frameSize, this.allowSeeksIfLengthUnknown, false);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataStartPosition() {
        return this.firstFramePosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return getTimeUsAtPosition(j);
    }

    public ConstantBitrateSeeker(long j, long j9, int i3, int i9, boolean z6) {
        this(j, j9, i3, i9, z6, true);
    }

    private ConstantBitrateSeeker(long j, long j9, int i3, int i9, boolean z6, boolean z9) {
        super(j, j9, i3, i9, z6, z9);
        long j10 = j;
        this.firstFramePosition = j9;
        this.bitrate = i3;
        this.frameSize = i9;
        this.allowSeeksIfLengthUnknown = z6;
        this.dataEndPosition = j10 == -1 ? -1L : j10;
    }
}
