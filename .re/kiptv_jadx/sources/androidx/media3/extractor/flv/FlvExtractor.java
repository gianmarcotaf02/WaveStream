package androidx.media3.extractor.flv;

/* JADX INFO: loaded from: classes.dex */
public final class FlvExtractor implements androidx.media3.extractor.Extractor {
    public static final androidx.media3.extractor.ExtractorsFactory FACTORY = new androidx.media3.extractor.a(3);
    private static final int FLV_HEADER_SIZE = 9;
    private static final int FLV_TAG = 4607062;
    private static final int FLV_TAG_HEADER_SIZE = 11;
    private static final int STATE_READING_FLV_HEADER = 1;
    private static final int STATE_READING_TAG_DATA = 4;
    private static final int STATE_READING_TAG_HEADER = 3;
    private static final int STATE_SKIPPING_TO_TAG_HEADER = 2;
    private static final int TAG_TYPE_AUDIO = 8;
    private static final int TAG_TYPE_SCRIPT_DATA = 18;
    private static final int TAG_TYPE_VIDEO = 9;
    private androidx.media3.extractor.flv.AudioTagPayloadReader audioReader;
    private int bytesToNextTagHeader;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private long mediaTagTimestampOffsetUs;
    private boolean outputFirstSample;
    private boolean outputSeekMap;
    private int tagDataSize;
    private long tagTimestampUs;
    private int tagType;
    private androidx.media3.extractor.flv.VideoTagPayloadReader videoReader;
    private final androidx.media3.common.util.ParsableByteArray scratch = new androidx.media3.common.util.ParsableByteArray(4);
    private final androidx.media3.common.util.ParsableByteArray headerBuffer = new androidx.media3.common.util.ParsableByteArray(9);
    private final androidx.media3.common.util.ParsableByteArray tagHeaderBuffer = new androidx.media3.common.util.ParsableByteArray(11);
    private final androidx.media3.common.util.ParsableByteArray tagData = new androidx.media3.common.util.ParsableByteArray();
    private final androidx.media3.extractor.flv.ScriptTagPayloadReader metadataReader = new androidx.media3.extractor.flv.ScriptTagPayloadReader();
    private int state = 1;

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    private void ensureReadyForMediaOutput() {
        if (this.outputSeekMap) {
            return;
        }
        this.extractorOutput.seekMap(new androidx.media3.extractor.SeekMap.Unseekable(androidx.media3.common.C.TIME_UNSET));
        this.outputSeekMap = true;
    }

    private long getCurrentTimestampUs() {
        if (this.outputFirstSample) {
            return this.mediaTagTimestampOffsetUs + this.tagTimestampUs;
        }
        if (this.metadataReader.getDurationUs() == androidx.media3.common.C.TIME_UNSET) {
            return 0L;
        }
        return this.tagTimestampUs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$0() {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.flv.FlvExtractor()};
    }

    private androidx.media3.common.util.ParsableByteArray prepareTagData(androidx.media3.extractor.ExtractorInput extractorInput) {
        if (this.tagDataSize > this.tagData.capacity()) {
            androidx.media3.common.util.ParsableByteArray parsableByteArray = this.tagData;
            parsableByteArray.reset(new byte[java.lang.Math.max(parsableByteArray.capacity() * 2, this.tagDataSize)], 0);
        } else {
            this.tagData.setPosition(0);
        }
        this.tagData.setLimit(this.tagDataSize);
        extractorInput.readFully(this.tagData.getData(), 0, this.tagDataSize);
        return this.tagData;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    private boolean readFlvHeader(androidx.media3.extractor.ExtractorInput extractorInput) {
        if (!extractorInput.readFully(this.headerBuffer.getData(), 0, 9, true)) {
            return false;
        }
        this.headerBuffer.setPosition(0);
        this.headerBuffer.skipBytes(4);
        int unsignedByte = this.headerBuffer.readUnsignedByte();
        boolean z6 = (unsignedByte & 4) != 0;
        boolean z9 = (unsignedByte & 1) != 0;
        if (z6 && this.audioReader == null) {
            this.audioReader = new androidx.media3.extractor.flv.AudioTagPayloadReader(this.extractorOutput.track(8, 1));
        }
        if (z9 && this.videoReader == null) {
            this.videoReader = new androidx.media3.extractor.flv.VideoTagPayloadReader(this.extractorOutput.track(9, 2));
        }
        this.extractorOutput.endTracks();
        this.bytesToNextTagHeader = this.headerBuffer.readInt() - 5;
        this.state = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    private boolean readTagData(androidx.media3.extractor.ExtractorInput extractorInput) {
        boolean zConsume;
        boolean z6;
        long j;
        long currentTimestampUs = getCurrentTimestampUs();
        int i3 = this.tagType;
        if (i3 == 8 && this.audioReader != null) {
            ensureReadyForMediaOutput();
            zConsume = this.audioReader.consume(prepareTagData(extractorInput), currentTimestampUs);
        } else {
            if (i3 != 9 || this.videoReader == null) {
                if (i3 != 18 || this.outputSeekMap) {
                    extractorInput.skipFully(this.tagDataSize);
                    zConsume = false;
                    z6 = false;
                } else {
                    zConsume = this.metadataReader.consume(prepareTagData(extractorInput), currentTimestampUs);
                    long durationUs = this.metadataReader.getDurationUs();
                    if (durationUs != androidx.media3.common.C.TIME_UNSET) {
                        this.extractorOutput.seekMap(new androidx.media3.extractor.IndexSeekMap(this.metadataReader.getKeyFrameTagPositions(), this.metadataReader.getKeyFrameTimesUs(), durationUs));
                        this.outputSeekMap = true;
                    }
                }
                if (!this.outputFirstSample && zConsume) {
                    this.outputFirstSample = true;
                    if (this.metadataReader.getDurationUs() == androidx.media3.common.C.TIME_UNSET) {
                        j = -this.tagTimestampUs;
                    } else {
                        j = 0;
                    }
                    this.mediaTagTimestampOffsetUs = j;
                }
                this.bytesToNextTagHeader = 4;
                this.state = 2;
                return z6;
            }
            ensureReadyForMediaOutput();
            zConsume = this.videoReader.consume(prepareTagData(extractorInput), currentTimestampUs);
        }
        z6 = true;
        if (!this.outputFirstSample) {
            this.outputFirstSample = true;
            if (this.metadataReader.getDurationUs() == androidx.media3.common.C.TIME_UNSET) {
                j = -this.tagTimestampUs;
            } else {
                j = 0;
            }
            this.mediaTagTimestampOffsetUs = j;
        }
        this.bytesToNextTagHeader = 4;
        this.state = 2;
        return z6;
    }

    private boolean readTagHeader(androidx.media3.extractor.ExtractorInput extractorInput) {
        if (!extractorInput.readFully(this.tagHeaderBuffer.getData(), 0, 11, true)) {
            return false;
        }
        this.tagHeaderBuffer.setPosition(0);
        this.tagType = this.tagHeaderBuffer.readUnsignedByte();
        this.tagDataSize = this.tagHeaderBuffer.readUnsignedInt24();
        this.tagTimestampUs = this.tagHeaderBuffer.readUnsignedInt24();
        this.tagTimestampUs = (((long) (this.tagHeaderBuffer.readUnsignedByte() << 24)) | this.tagTimestampUs) * 1000;
        this.tagHeaderBuffer.skipBytes(3);
        this.state = 4;
        return true;
    }

    private void skipToTagHeader(androidx.media3.extractor.ExtractorInput extractorInput) {
        extractorInput.skipFully(this.bytesToNextTagHeader);
        this.bytesToNextTagHeader = 0;
        this.state = 3;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) {
        this.extractorOutput.getClass();
        while (true) {
            int i3 = this.state;
            if (i3 != 1) {
                if (i3 == 2) {
                    skipToTagHeader(extractorInput);
                } else if (i3 != 3) {
                    if (i3 != 4) {
                        throw new java.lang.IllegalStateException();
                    }
                    if (readTagData(extractorInput)) {
                        return 0;
                    }
                } else if (!readTagHeader(extractorInput)) {
                    return -1;
                }
            } else if (!readFlvHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j9) {
        if (j == 0) {
            this.state = 1;
            this.outputFirstSample = false;
        } else {
            this.state = 3;
        }
        this.bytesToNextTagHeader = 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) {
        extractorInput.peekFully(this.scratch.getData(), 0, 3);
        this.scratch.setPosition(0);
        if (this.scratch.readUnsignedInt24() != FLV_TAG) {
            return false;
        }
        extractorInput.peekFully(this.scratch.getData(), 0, 2);
        this.scratch.setPosition(0);
        if ((this.scratch.readUnsignedShort() & 250) != 0) {
            return false;
        }
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        this.scratch.setPosition(0);
        int i3 = this.scratch.readInt();
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i3);
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        this.scratch.setPosition(0);
        return this.scratch.readInt() == 0;
    }
}
