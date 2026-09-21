package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class MpegAudioReader implements androidx.media3.extractor.ts.ElementaryStreamReader {
    private static final int HEADER_SIZE = 4;
    private static final int STATE_FINDING_HEADER = 0;
    private static final int STATE_READING_FRAME = 2;
    private static final int STATE_READING_HEADER = 1;
    private final java.lang.String containerMimeType;
    private java.lang.String formatId;
    private int frameBytesRead;
    private long frameDurationUs;
    private int frameSize;
    private boolean hasOutputFormat;
    private final androidx.media3.extractor.MpegAudioUtil.Header header;
    private final androidx.media3.common.util.ParsableByteArray headerScratch;
    private final java.lang.String language;
    private boolean lastByteWasFF;
    private androidx.media3.extractor.TrackOutput output;
    private final int roleFlags;
    private int state;
    private long timeUs;

    public MpegAudioReader(java.lang.String str) {
        this(null, 0, str);
    }

    private void findHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        byte[] data = parsableByteArray.getData();
        int iLimit = parsableByteArray.limit();
        for (int position = parsableByteArray.getPosition(); position < iLimit; position++) {
            byte b9 = data[position];
            boolean z6 = (b9 & 255) == 255;
            boolean z9 = this.lastByteWasFF && (b9 & 224) == 224;
            this.lastByteWasFF = z6;
            if (z9) {
                parsableByteArray.setPosition(position + 1);
                this.lastByteWasFF = false;
                this.headerScratch.getData()[1] = data[position];
                this.frameBytesRead = 2;
                this.state = 1;
                return;
            }
        }
        parsableByteArray.setPosition(iLimit);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void readFrameRemainder(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int iMin = java.lang.Math.min(parsableByteArray.bytesLeft(), this.frameSize - this.frameBytesRead);
        this.output.sampleData(parsableByteArray, iMin);
        int i3 = this.frameBytesRead + iMin;
        this.frameBytesRead = i3;
        if (i3 < this.frameSize) {
            return;
        }
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.timeUs != androidx.media3.common.C.TIME_UNSET);
        this.output.sampleMetadata(this.timeUs, 1, this.frameSize, 0, null);
        this.timeUs += this.frameDurationUs;
        this.frameBytesRead = 0;
        this.state = 0;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void readHeaderRemainder(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int iMin = java.lang.Math.min(parsableByteArray.bytesLeft(), 4 - this.frameBytesRead);
        parsableByteArray.readBytes(this.headerScratch.getData(), this.frameBytesRead, iMin);
        int i3 = this.frameBytesRead + iMin;
        this.frameBytesRead = i3;
        if (i3 < 4) {
            return;
        }
        this.headerScratch.setPosition(0);
        if (!this.header.setForHeaderData(this.headerScratch.readInt())) {
            this.frameBytesRead = 0;
            this.state = 1;
            return;
        }
        androidx.media3.extractor.MpegAudioUtil.Header header = this.header;
        this.frameSize = header.frameSize;
        if (!this.hasOutputFormat) {
            this.frameDurationUs = (((long) header.samplesPerFrame) * 1000000) / ((long) header.sampleRate);
            this.output.format(new androidx.media3.common.Format.Builder().setId(this.formatId).setContainerMimeType(this.containerMimeType).setSampleMimeType(this.header.mimeType).setMaxInputSize(4096).setChannelCount(this.header.channels).setSampleRate(this.header.sampleRate).setLanguage(this.language).setRoleFlags(this.roleFlags).build());
            this.hasOutputFormat = true;
        }
        this.headerScratch.setPosition(0);
        this.output.sampleData(this.headerScratch, 4);
        this.state = 2;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        this.output.getClass();
        while (parsableByteArray.bytesLeft() > 0) {
            int i3 = this.state;
            if (i3 == 0) {
                findHeader(parsableByteArray);
            } else if (i3 == 1) {
                readHeaderRemainder(parsableByteArray);
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException();
                }
                readFrameRemainder(parsableByteArray);
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z6) {
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j, int i3) {
        this.timeUs = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.state = 0;
        this.frameBytesRead = 0;
        this.lastByteWasFF = false;
        this.timeUs = androidx.media3.common.C.TIME_UNSET;
    }

    public MpegAudioReader(java.lang.String str, int i3, java.lang.String str2) {
        this.state = 0;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(4);
        this.headerScratch = parsableByteArray;
        parsableByteArray.getData()[0] = -1;
        this.header = new androidx.media3.extractor.MpegAudioUtil.Header();
        this.timeUs = androidx.media3.common.C.TIME_UNSET;
        this.language = str;
        this.roleFlags = i3;
        this.containerMimeType = str2;
    }
}
