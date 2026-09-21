package androidx.media3.extractor.ogg;

/* JADX INFO: loaded from: classes.dex */
abstract class StreamReader {
    private static final int STATE_END_OF_INPUT = 3;
    private static final int STATE_READ_HEADERS = 0;
    private static final int STATE_READ_PAYLOAD = 2;
    private static final int STATE_SKIP_HEADERS = 1;
    private long currentGranule;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private boolean formatSet;
    private long lengthOfReadPacket;
    private androidx.media3.extractor.ogg.OggSeeker oggSeeker;
    private long payloadStartPosition;
    private int sampleRate;
    private boolean seekMapSet;
    private int state;
    private long targetGranule;
    private androidx.media3.extractor.TrackOutput trackOutput;
    private final androidx.media3.extractor.ogg.OggPacket oggPacket = new androidx.media3.extractor.ogg.OggPacket();
    private androidx.media3.extractor.ogg.StreamReader.SetupData setupData = new androidx.media3.extractor.ogg.StreamReader.SetupData();

    public static class SetupData {
        androidx.media3.common.Format format;
        androidx.media3.extractor.ogg.OggSeeker oggSeeker;
    }

    public static final class UnseekableOggSeeker implements androidx.media3.extractor.ogg.OggSeeker {
        private UnseekableOggSeeker() {
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public androidx.media3.extractor.SeekMap createSeekMap() {
            return new androidx.media3.extractor.SeekMap.Unseekable(androidx.media3.common.C.TIME_UNSET);
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public long read(androidx.media3.extractor.ExtractorInput extractorInput) {
            return -1L;
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public void startSeek(long j) {
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackOutput", "extractorOutput"})
    private void assertInitialized() {
        this.trackOutput.getClass();
        androidx.media3.common.util.Util.castNonNull(this.extractorOutput);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    private boolean readHeaders(androidx.media3.extractor.ExtractorInput extractorInput) {
        while (this.oggPacket.populate(extractorInput)) {
            this.lengthOfReadPacket = extractorInput.getPosition() - this.payloadStartPosition;
            if (!readHeaders(this.oggPacket.getPayload(), this.payloadStartPosition, this.setupData)) {
                return true;
            }
            this.payloadStartPosition = extractorInput.getPosition();
        }
        this.state = 3;
        return false;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput"})
    private int readHeadersAndUpdateState(androidx.media3.extractor.ExtractorInput extractorInput) {
        if (!readHeaders(extractorInput)) {
            return -1;
        }
        androidx.media3.common.Format format = this.setupData.format;
        this.sampleRate = format.sampleRate;
        if (!this.formatSet) {
            this.trackOutput.format(format);
            this.formatSet = true;
        }
        androidx.media3.extractor.ogg.OggSeeker oggSeeker = this.setupData.oggSeeker;
        if (oggSeeker != null) {
            this.oggSeeker = oggSeeker;
        } else if (extractorInput.getLength() == -1) {
            this.oggSeeker = new androidx.media3.extractor.ogg.StreamReader.UnseekableOggSeeker();
        } else {
            androidx.media3.extractor.ogg.OggPageHeader pageHeader = this.oggPacket.getPageHeader();
            this.oggSeeker = new androidx.media3.extractor.ogg.DefaultOggSeeker(this, this.payloadStartPosition, extractorInput.getLength(), pageHeader.headerSize + pageHeader.bodySize, pageHeader.granulePosition, (pageHeader.type & 4) != 0);
        }
        this.state = 2;
        this.oggPacket.trimPayload();
        return 0;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    private int readPayload(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) {
        long j = this.oggSeeker.read(extractorInput);
        if (j >= 0) {
            positionHolder.position = j;
            return 1;
        }
        if (j < -1) {
            onSeekEnd(-(j + 2));
        }
        if (!this.seekMapSet) {
            androidx.media3.extractor.SeekMap seekMapCreateSeekMap = this.oggSeeker.createSeekMap();
            seekMapCreateSeekMap.getClass();
            this.extractorOutput.seekMap(seekMapCreateSeekMap);
            this.trackOutput.durationUs(seekMapCreateSeekMap.getDurationUs());
            this.seekMapSet = true;
        }
        if (this.lengthOfReadPacket <= 0 && !this.oggPacket.populate(extractorInput)) {
            this.state = 3;
            return -1;
        }
        this.lengthOfReadPacket = 0L;
        androidx.media3.common.util.ParsableByteArray payload = this.oggPacket.getPayload();
        long jPreparePayload = preparePayload(payload);
        if (jPreparePayload >= 0) {
            long j9 = this.currentGranule;
            if (j9 + jPreparePayload >= this.targetGranule) {
                long jConvertGranuleToTime = convertGranuleToTime(j9);
                this.trackOutput.sampleData(payload, payload.limit());
                this.trackOutput.sampleMetadata(jConvertGranuleToTime, 1, payload.limit(), 0, null);
                this.targetGranule = -1L;
            }
        }
        this.currentGranule += jPreparePayload;
        return 0;
    }

    public long convertGranuleToTime(long j) {
        return (j * 1000000) / ((long) this.sampleRate);
    }

    public long convertTimeToGranule(long j) {
        return (((long) this.sampleRate) * j) / 1000000;
    }

    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.TrackOutput trackOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = trackOutput;
        reset(true);
    }

    public void onSeekEnd(long j) {
        this.currentGranule = j;
    }

    public abstract long preparePayload(androidx.media3.common.util.ParsableByteArray parsableByteArray);

    public final int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) {
        assertInitialized();
        int i3 = this.state;
        if (i3 == 0) {
            return readHeadersAndUpdateState(extractorInput);
        }
        if (i3 == 1) {
            extractorInput.skipFully((int) this.payloadStartPosition);
            this.state = 2;
            return 0;
        }
        if (i3 == 2) {
            androidx.media3.common.util.Util.castNonNull(this.oggSeeker);
            return readPayload(extractorInput, positionHolder);
        }
        if (i3 == 3) {
            return -1;
        }
        throw new java.lang.IllegalStateException();
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean readHeaders(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j, androidx.media3.extractor.ogg.StreamReader.SetupData setupData);

    public void reset(boolean z6) {
        if (z6) {
            this.setupData = new androidx.media3.extractor.ogg.StreamReader.SetupData();
            this.payloadStartPosition = 0L;
            this.state = 0;
        } else {
            this.state = 1;
        }
        this.targetGranule = -1L;
        this.currentGranule = 0L;
    }

    public final void seek(long j, long j9) {
        this.oggPacket.reset();
        if (j == 0) {
            reset(!this.seekMapSet);
        } else if (this.state != 0) {
            this.targetGranule = convertTimeToGranule(j9);
            ((androidx.media3.extractor.ogg.OggSeeker) androidx.media3.common.util.Util.castNonNull(this.oggSeeker)).startSeek(this.targetGranule);
            this.state = 2;
        }
    }
}
