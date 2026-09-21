package androidx.media3.extractor.amr;

/* JADX INFO: loaded from: classes.dex */
public final class AmrExtractor implements androidx.media3.extractor.Extractor {
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    public static final int FLAG_ENABLE_INDEX_SEEKING = 4;
    private static final int NUM_SAME_SIZE_CONSTANT_BIT_RATE_THRESHOLD = 20;
    private static final int SAMPLE_RATE_NB = 8000;
    private static final int SAMPLE_RATE_WB = 16000;
    private static final int SAMPLE_TIME_PER_FRAME_US = 20000;
    private int currentSampleBytesRemaining;
    private int currentSampleSize;
    private long currentSampleTimeUs;
    private androidx.media3.extractor.TrackOutput currentTrackOutput;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private long firstSamplePosition;
    private int firstSampleSize;
    private final int flags;
    private boolean hasOutputFormat;
    private boolean isSeekInProgress;
    private boolean isWideBand;
    private int numSamplesWithSameSize;
    private androidx.media3.extractor.TrackOutput realTrackOutput;
    private final byte[] scratch;
    private androidx.media3.extractor.SeekMap seekMap;
    private long seekTimeUs;
    private final androidx.media3.extractor.TrackOutput skippingTrackOutput;
    private long timeOffsetUs;
    public static final androidx.media3.extractor.ExtractorsFactory FACTORY = new androidx.media3.extractor.a(1);
    private static final int[] frameSizeBytesByTypeNb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] frameSizeBytesByTypeWb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] amrSignatureNb = androidx.media3.common.util.Util.getUtf8Bytes("#!AMR\n");
    private static final byte[] amrSignatureWb = androidx.media3.common.util.Util.getUtf8Bytes("#!AMR-WB\n");

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AmrExtractor() {
        this(0);
    }

    public static byte[] amrSignatureNb() {
        byte[] bArr = amrSignatureNb;
        return java.util.Arrays.copyOf(bArr, bArr.length);
    }

    public static byte[] amrSignatureWb() {
        byte[] bArr = amrSignatureWb;
        return java.util.Arrays.copyOf(bArr, bArr.length);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void assertInitialized() {
        this.realTrackOutput.getClass();
        androidx.media3.common.util.Util.castNonNull(this.extractorOutput);
    }

    public static int frameSizeBytesByTypeNb(int i3) {
        return frameSizeBytesByTypeNb[i3];
    }

    public static int frameSizeBytesByTypeWb(int i3) {
        return frameSizeBytesByTypeWb[i3];
    }

    private static int getBitrateFromFrameSize(int i3, long j) {
        return (int) ((((long) i3) * 8000000) / j);
    }

    private androidx.media3.extractor.SeekMap getConstantBitrateSeekMap(long j, boolean z6) {
        return new androidx.media3.extractor.ConstantBitrateSeekMap(j, this.firstSamplePosition, getBitrateFromFrameSize(this.firstSampleSize, 20000L), this.firstSampleSize, z6);
    }

    private int getFrameSizeInBytes(int i3) throws androidx.media3.common.ParserException {
        if (isValidFrameType(i3)) {
            return this.isWideBand ? frameSizeBytesByTypeWb[i3] : frameSizeBytesByTypeNb[i3];
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal AMR ");
        sb.append(this.isWideBand ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i3);
        throw androidx.media3.common.ParserException.createForMalformedContainer(sb.toString(), null);
    }

    private boolean isNarrowBandValidFrameType(int i3) {
        if (this.isWideBand) {
            return false;
        }
        return i3 < 12 || i3 > 14;
    }

    private boolean isSeekTimeUsWithinRange(long j, long j9) {
        return java.lang.Math.abs(j9 - j) < 20000;
    }

    private boolean isValidFrameType(int i3) {
        if (i3 < 0 || i3 > 15) {
            return false;
        }
        return isWideBandValidFrameType(i3) || isNarrowBandValidFrameType(i3);
    }

    private boolean isWideBandValidFrameType(int i3) {
        if (this.isWideBand) {
            return i3 < 10 || i3 > 13;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$0() {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.amr.AmrExtractor()};
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"realTrackOutput"})
    private void maybeOutputFormat() {
        if (this.hasOutputFormat) {
            return;
        }
        this.hasOutputFormat = true;
        boolean z6 = this.isWideBand;
        java.lang.String str = androidx.media3.common.MimeTypes.AUDIO_AMR_WB;
        java.lang.String str2 = z6 ? androidx.media3.common.MimeTypes.AUDIO_AMR_WB : androidx.media3.common.MimeTypes.AUDIO_AMR;
        if (!z6) {
            str = androidx.media3.common.MimeTypes.AUDIO_AMR_NB;
        }
        this.realTrackOutput.format(new androidx.media3.common.Format.Builder().setContainerMimeType(str2).setSampleMimeType(str).setMaxInputSize(z6 ? frameSizeBytesByTypeWb[8] : frameSizeBytesByTypeNb[7]).setChannelCount(1).setSampleRate(z6 ? 16000 : 8000).build());
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private void maybeOutputSeekMap(long j, int i3) {
        int i9;
        if (this.seekMap != null) {
            return;
        }
        int i10 = this.flags;
        if ((i10 & 4) != 0) {
            this.seekMap = new androidx.media3.extractor.IndexSeekMap(new long[]{this.firstSamplePosition}, new long[]{0}, androidx.media3.common.C.TIME_UNSET);
        } else if ((i10 & 1) == 0 || !((i9 = this.firstSampleSize) == -1 || i9 == this.currentSampleSize)) {
            this.seekMap = new androidx.media3.extractor.SeekMap.Unseekable(androidx.media3.common.C.TIME_UNSET);
        } else if (this.numSamplesWithSameSize >= 20 || i3 == -1) {
            androidx.media3.extractor.SeekMap constantBitrateSeekMap = getConstantBitrateSeekMap(j, (i10 & 2) != 0);
            this.seekMap = constantBitrateSeekMap;
            this.realTrackOutput.durationUs(constantBitrateSeekMap.getDurationUs());
        }
        androidx.media3.extractor.SeekMap seekMap = this.seekMap;
        if (seekMap != null) {
            this.extractorOutput.seekMap(seekMap);
        }
    }

    private static boolean peekAmrSignature(androidx.media3.extractor.ExtractorInput extractorInput, byte[] bArr) {
        extractorInput.resetPeekPosition();
        byte[] bArr2 = new byte[bArr.length];
        extractorInput.peekFully(bArr2, 0, bArr.length);
        return java.util.Arrays.equals(bArr2, bArr);
    }

    private int peekNextSampleSize(androidx.media3.extractor.ExtractorInput extractorInput) throws androidx.media3.common.ParserException {
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.scratch, 0, 1);
        byte b9 = this.scratch[0];
        if ((b9 & 131) <= 0) {
            return getFrameSizeInBytes((b9 >> 3) & 15);
        }
        throw androidx.media3.common.ParserException.createForMalformedContainer("Invalid padding bits for frame header " + ((int) b9), null);
    }

    private boolean readAmrHeader(androidx.media3.extractor.ExtractorInput extractorInput) {
        byte[] bArr = amrSignatureNb;
        if (peekAmrSignature(extractorInput, bArr)) {
            this.isWideBand = false;
            extractorInput.skipFully(bArr.length);
            return true;
        }
        byte[] bArr2 = amrSignatureWb;
        if (!peekAmrSignature(extractorInput, bArr2)) {
            return false;
        }
        this.isWideBand = true;
        extractorInput.skipFully(bArr2.length);
        return true;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"realTrackOutput"})
    private int readSample(androidx.media3.extractor.ExtractorInput extractorInput) throws androidx.media3.common.ParserException {
        if (this.currentSampleBytesRemaining == 0) {
            try {
                int iPeekNextSampleSize = peekNextSampleSize(extractorInput);
                this.currentSampleSize = iPeekNextSampleSize;
                this.currentSampleBytesRemaining = iPeekNextSampleSize;
                if (this.firstSampleSize == -1) {
                    this.firstSamplePosition = extractorInput.getPosition();
                    this.firstSampleSize = this.currentSampleSize;
                }
                if (this.firstSampleSize == this.currentSampleSize) {
                    this.numSamplesWithSameSize++;
                }
                androidx.media3.extractor.SeekMap seekMap = this.seekMap;
                if (seekMap instanceof androidx.media3.extractor.IndexSeekMap) {
                    androidx.media3.extractor.IndexSeekMap indexSeekMap = (androidx.media3.extractor.IndexSeekMap) seekMap;
                    long j = this.timeOffsetUs + this.currentSampleTimeUs + 20000;
                    long position = extractorInput.getPosition() + ((long) this.currentSampleSize);
                    if (!indexSeekMap.isTimeUsInIndex(j, androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US)) {
                        indexSeekMap.addSeekPoint(j, position);
                    }
                    if (this.isSeekInProgress && isSeekTimeUsWithinRange(j, this.seekTimeUs)) {
                        this.isSeekInProgress = false;
                        this.currentTrackOutput = this.realTrackOutput;
                    }
                }
            } catch (java.io.EOFException unused) {
                return -1;
            }
        }
        int iSampleData = this.currentTrackOutput.sampleData((androidx.media3.common.DataReader) extractorInput, this.currentSampleBytesRemaining, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i3 = this.currentSampleBytesRemaining - iSampleData;
        this.currentSampleBytesRemaining = i3;
        if (i3 > 0) {
            return 0;
        }
        this.currentTrackOutput.sampleMetadata(this.timeOffsetUs + this.currentSampleTimeUs, 1, this.currentSampleSize, 0, null);
        this.currentSampleTimeUs += 20000;
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        androidx.media3.extractor.TrackOutput trackOutputTrack = extractorOutput.track(0, 1);
        this.realTrackOutput = trackOutputTrack;
        this.currentTrackOutput = trackOutputTrack;
        extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws androidx.media3.common.ParserException {
        assertInitialized();
        if (extractorInput.getPosition() == 0 && !readAmrHeader(extractorInput)) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Could not find AMR header.", null);
        }
        maybeOutputFormat();
        int sample = readSample(extractorInput);
        maybeOutputSeekMap(extractorInput.getLength(), sample);
        if (sample == -1) {
            androidx.media3.extractor.SeekMap seekMap = this.seekMap;
            if (seekMap instanceof androidx.media3.extractor.IndexSeekMap) {
                long j = this.timeOffsetUs + this.currentSampleTimeUs;
                ((androidx.media3.extractor.IndexSeekMap) seekMap).setDurationUs(j);
                this.extractorOutput.seekMap(this.seekMap);
                this.realTrackOutput.durationUs(j);
            }
        }
        return sample;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j9) {
        this.currentSampleTimeUs = 0L;
        this.currentSampleSize = 0;
        this.currentSampleBytesRemaining = 0;
        this.seekTimeUs = j9;
        androidx.media3.extractor.SeekMap seekMap = this.seekMap;
        if (!(seekMap instanceof androidx.media3.extractor.IndexSeekMap)) {
            if (j == 0 || !(seekMap instanceof androidx.media3.extractor.ConstantBitrateSeekMap)) {
                this.timeOffsetUs = 0L;
                return;
            } else {
                this.timeOffsetUs = ((androidx.media3.extractor.ConstantBitrateSeekMap) seekMap).getTimeUsAtPosition(j);
                return;
            }
        }
        long timeUs = ((androidx.media3.extractor.IndexSeekMap) seekMap).getTimeUs(j);
        this.timeOffsetUs = timeUs;
        if (isSeekTimeUsWithinRange(timeUs, this.seekTimeUs)) {
            return;
        }
        this.isSeekInProgress = true;
        this.currentTrackOutput = this.skippingTrackOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) {
        return readAmrHeader(extractorInput);
    }

    public AmrExtractor(int i3) {
        this.flags = (i3 & 2) != 0 ? i3 | 1 : i3;
        this.scratch = new byte[1];
        this.firstSampleSize = -1;
        androidx.media3.extractor.DiscardingTrackOutput discardingTrackOutput = new androidx.media3.extractor.DiscardingTrackOutput();
        this.skippingTrackOutput = discardingTrackOutput;
        this.currentTrackOutput = discardingTrackOutput;
    }
}
