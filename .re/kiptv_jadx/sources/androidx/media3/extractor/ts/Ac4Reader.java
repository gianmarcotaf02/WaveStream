package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class Ac4Reader implements androidx.media3.extractor.ts.ElementaryStreamReader {
    private static final int STATE_FINDING_SYNC = 0;
    private static final int STATE_READING_HEADER = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private int bytesRead;
    private final java.lang.String containerMimeType;
    private androidx.media3.common.Format format;
    private java.lang.String formatId;
    private boolean hasCRC;
    private final androidx.media3.common.util.ParsableBitArray headerScratchBits;
    private final androidx.media3.common.util.ParsableByteArray headerScratchBytes;
    private final java.lang.String language;
    private boolean lastByteWasAC;
    private androidx.media3.extractor.TrackOutput output;
    private final int roleFlags;
    private long sampleDurationUs;
    private int sampleSize;
    private int state;
    private long timeUs;

    public Ac4Reader(java.lang.String str) {
        this(null, 0, str);
    }

    private boolean continueRead(androidx.media3.common.util.ParsableByteArray parsableByteArray, byte[] bArr, int i3) {
        int iMin = java.lang.Math.min(parsableByteArray.bytesLeft(), i3 - this.bytesRead);
        parsableByteArray.readBytes(bArr, this.bytesRead, iMin);
        int i9 = this.bytesRead + iMin;
        this.bytesRead = i9;
        return i9 == i3;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void parseHeader() {
        this.headerScratchBits.setPosition(0);
        androidx.media3.extractor.Ac4Util.SyncFrameInfo ac4SyncframeInfo = androidx.media3.extractor.Ac4Util.parseAc4SyncframeInfo(this.headerScratchBits);
        androidx.media3.common.Format format = this.format;
        if (format == null || ac4SyncframeInfo.channelCount != format.channelCount || ac4SyncframeInfo.sampleRate != format.sampleRate || !androidx.media3.common.MimeTypes.AUDIO_AC4.equals(format.sampleMimeType)) {
            androidx.media3.common.Format formatBuild = new androidx.media3.common.Format.Builder().setId(this.formatId).setContainerMimeType(this.containerMimeType).setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_AC4).setChannelCount(ac4SyncframeInfo.channelCount).setSampleRate(ac4SyncframeInfo.sampleRate).setLanguage(this.language).setRoleFlags(this.roleFlags).build();
            this.format = formatBuild;
            this.output.format(formatBuild);
        }
        this.sampleSize = ac4SyncframeInfo.frameSize;
        this.sampleDurationUs = (((long) ac4SyncframeInfo.sampleCount) * 1000000) / ((long) this.format.sampleRate);
    }

    private boolean skipToNextSync(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        while (true) {
            if (parsableByteArray.bytesLeft() <= 0) {
                return false;
            }
            if (this.lastByteWasAC) {
                int unsignedByte = parsableByteArray.readUnsignedByte();
                this.lastByteWasAC = unsignedByte == 172;
                if (unsignedByte == 64 || unsignedByte == 65) {
                    this.hasCRC = unsignedByte == 65;
                    return true;
                }
            } else {
                this.lastByteWasAC = parsableByteArray.readUnsignedByte() == 172;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        this.output.getClass();
        while (parsableByteArray.bytesLeft() > 0) {
            int i3 = this.state;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        int iMin = java.lang.Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                        this.output.sampleData(parsableByteArray, iMin);
                        int i9 = this.bytesRead + iMin;
                        this.bytesRead = i9;
                        if (i9 == this.sampleSize) {
                            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.timeUs != androidx.media3.common.C.TIME_UNSET);
                            this.output.sampleMetadata(this.timeUs, 1, this.sampleSize, 0, null);
                            this.timeUs += this.sampleDurationUs;
                            this.state = 0;
                        }
                    }
                } else if (continueRead(parsableByteArray, this.headerScratchBytes.getData(), 16)) {
                    parseHeader();
                    this.headerScratchBytes.setPosition(0);
                    this.output.sampleData(this.headerScratchBytes, 16);
                    this.state = 2;
                }
            } else if (skipToNextSync(parsableByteArray)) {
                this.state = 1;
                this.headerScratchBytes.getData()[0] = -84;
                this.headerScratchBytes.getData()[1] = (byte) (this.hasCRC ? 65 : 64);
                this.bytesRead = 2;
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
        this.bytesRead = 0;
        this.lastByteWasAC = false;
        this.hasCRC = false;
        this.timeUs = androidx.media3.common.C.TIME_UNSET;
    }

    public Ac4Reader(java.lang.String str, int i3, java.lang.String str2) {
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray(new byte[16]);
        this.headerScratchBits = parsableBitArray;
        this.headerScratchBytes = new androidx.media3.common.util.ParsableByteArray(parsableBitArray.data);
        this.state = 0;
        this.bytesRead = 0;
        this.lastByteWasAC = false;
        this.hasCRC = false;
        this.timeUs = androidx.media3.common.C.TIME_UNSET;
        this.language = str;
        this.roleFlags = i3;
        this.containerMimeType = str2;
    }
}
