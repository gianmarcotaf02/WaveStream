package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class MpeghReader implements androidx.media3.extractor.ts.ElementaryStreamReader {
    private static final int MAX_MHAS_PACKET_HEADER_SIZE = 15;
    private static final int MHAS_SYNC_WORD_LENGTH = 3;
    private static final int MIN_MHAS_PACKET_HEADER_SIZE = 2;
    private static final int STATE_FINDING_SYNC = 0;
    private static final int STATE_READING_PACKET_HEADER = 1;
    private static final int STATE_READING_PACKET_PAYLOAD = 2;
    private boolean configFound;
    private final java.lang.String containerMimeType;
    private boolean dataPending;
    private int flags;
    private java.lang.String formatId;
    private int frameBytes;
    private androidx.media3.extractor.TrackOutput output;
    private int payloadBytesRead;
    private int syncBytes;
    private int truncationSamples;
    private int state = 0;
    private final androidx.media3.common.util.ParsableByteArray headerScratchBytes = new androidx.media3.common.util.ParsableByteArray(new byte[15], 2);
    private final androidx.media3.common.util.ParsableBitArray headerScratchBits = new androidx.media3.common.util.ParsableBitArray();
    private final androidx.media3.common.util.ParsableByteArray dataScratchBytes = new androidx.media3.common.util.ParsableByteArray();
    private androidx.media3.extractor.ts.MpeghUtil.MhasPacketHeader header = new androidx.media3.extractor.ts.MpeghUtil.MhasPacketHeader();
    private int samplingRate = androidx.media3.common.C.RATE_UNSET_INT;
    private int standardFrameLength = -1;
    private long mainStreamLabel = -1;
    private boolean rapPending = true;
    private boolean headerDataFinished = true;
    private double timeUs = -9.223372036854776E18d;
    private double timeUsPending = -9.223372036854776E18d;

    public MpeghReader(java.lang.String str) {
        this.containerMimeType = str;
    }

    private void copyData(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.common.util.ParsableByteArray parsableByteArray2, boolean z6) {
        int position = parsableByteArray.getPosition();
        int iMin = java.lang.Math.min(parsableByteArray.bytesLeft(), parsableByteArray2.bytesLeft());
        parsableByteArray.readBytes(parsableByteArray2.getData(), parsableByteArray2.getPosition(), iMin);
        parsableByteArray2.skipBytes(iMin);
        if (z6) {
            parsableByteArray.setPosition(position);
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void finalizeFrame() {
        int i3;
        if (this.configFound) {
            this.rapPending = false;
            i3 = 1;
        } else {
            i3 = 0;
        }
        double d4 = (((double) (this.standardFrameLength - this.truncationSamples)) * 1000000.0d) / ((double) this.samplingRate);
        long jRound = java.lang.Math.round(this.timeUs);
        if (this.dataPending) {
            this.dataPending = false;
            this.timeUs = this.timeUsPending;
        } else {
            this.timeUs += d4;
        }
        this.output.sampleMetadata(jRound, i3, this.frameBytes, 0, null);
        this.configFound = false;
        this.truncationSamples = 0;
        this.frameBytes = 0;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void parseConfig(androidx.media3.common.util.ParsableBitArray parsableBitArray) throws androidx.media3.common.ParserException {
        androidx.media3.extractor.ts.MpeghUtil.Mpegh3daConfig mpegh3daConfig = androidx.media3.extractor.ts.MpeghUtil.parseMpegh3daConfig(parsableBitArray);
        this.samplingRate = mpegh3daConfig.samplingFrequency;
        this.standardFrameLength = mpegh3daConfig.standardFrameLength;
        long j = this.mainStreamLabel;
        long j9 = this.header.packetLabel;
        if (j != j9) {
            this.mainStreamLabel = j9;
            int i3 = mpegh3daConfig.profileLevelIndication;
            java.lang.String strConcat = i3 != -1 ? "mhm1".concat(java.lang.String.format(".%02X", java.lang.Integer.valueOf(i3))) : "mhm1";
            byte[] bArr = mpegh3daConfig.compatibleProfileLevelSet;
            this.output.format(new androidx.media3.common.Format.Builder().setId(this.formatId).setContainerMimeType(this.containerMimeType).setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_MPEGH_MHM1).setSampleRate(this.samplingRate).setCodecs(strConcat).setInitializationData((bArr == null || bArr.length <= 0) ? null : p076i4.AbstractC2186b0.z(androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY, bArr)).build());
        }
        this.configFound = true;
    }

    private boolean parseHeader() throws androidx.media3.common.ParserException {
        int iLimit = this.headerScratchBytes.limit();
        this.headerScratchBits.reset(this.headerScratchBytes.getData(), iLimit);
        boolean mhasPacketHeader = androidx.media3.extractor.ts.MpeghUtil.parseMhasPacketHeader(this.headerScratchBits, this.header);
        if (mhasPacketHeader) {
            this.payloadBytesRead = 0;
            this.frameBytes = this.header.packetLength + iLimit + this.frameBytes;
        }
        return mhasPacketHeader;
    }

    private boolean shouldParsePacket(int i3) {
        return i3 == 1 || i3 == 17;
    }

    private boolean skipToNextSync(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int i3 = this.flags;
        if ((i3 & 2) == 0) {
            parsableByteArray.setPosition(parsableByteArray.limit());
            return false;
        }
        if ((i3 & 4) != 0) {
            return true;
        }
        while (parsableByteArray.bytesLeft() > 0) {
            int i9 = this.syncBytes << 8;
            this.syncBytes = i9;
            int unsignedByte = i9 | parsableByteArray.readUnsignedByte();
            this.syncBytes = unsignedByte;
            if (androidx.media3.extractor.ts.MpeghUtil.isSyncWord(unsignedByte)) {
                parsableByteArray.setPosition(parsableByteArray.getPosition() - 3);
                this.syncBytes = 0;
                return true;
            }
        }
        return false;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void writeSampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int iMin = java.lang.Math.min(parsableByteArray.bytesLeft(), this.header.packetLength - this.payloadBytesRead);
        this.output.sampleData(parsableByteArray, iMin);
        this.payloadBytesRead += iMin;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
        this.output.getClass();
        while (parsableByteArray.bytesLeft() > 0) {
            int i3 = this.state;
            if (i3 != 0) {
                if (i3 == 1) {
                    copyData(parsableByteArray, this.headerScratchBytes, false);
                    if (this.headerScratchBytes.bytesLeft() != 0) {
                        this.headerDataFinished = false;
                    } else if (parseHeader()) {
                        this.headerScratchBytes.setPosition(0);
                        androidx.media3.extractor.TrackOutput trackOutput = this.output;
                        androidx.media3.common.util.ParsableByteArray parsableByteArray2 = this.headerScratchBytes;
                        trackOutput.sampleData(parsableByteArray2, parsableByteArray2.limit());
                        this.headerScratchBytes.reset(2);
                        this.dataScratchBytes.reset(this.header.packetLength);
                        this.headerDataFinished = true;
                        this.state = 2;
                    } else if (this.headerScratchBytes.limit() < 15) {
                        androidx.media3.common.util.ParsableByteArray parsableByteArray3 = this.headerScratchBytes;
                        parsableByteArray3.setLimit(parsableByteArray3.limit() + 1);
                        this.headerDataFinished = false;
                    }
                } else {
                    if (i3 != 2) {
                        throw new java.lang.IllegalStateException();
                    }
                    if (shouldParsePacket(this.header.packetType)) {
                        copyData(parsableByteArray, this.dataScratchBytes, true);
                    }
                    writeSampleData(parsableByteArray);
                    int i9 = this.payloadBytesRead;
                    androidx.media3.extractor.ts.MpeghUtil.MhasPacketHeader mhasPacketHeader = this.header;
                    if (i9 == mhasPacketHeader.packetLength) {
                        int i10 = mhasPacketHeader.packetType;
                        if (i10 == 1) {
                            parseConfig(new androidx.media3.common.util.ParsableBitArray(this.dataScratchBytes.getData()));
                        } else if (i10 == 17) {
                            this.truncationSamples = androidx.media3.extractor.ts.MpeghUtil.parseAudioTruncationInfo(new androidx.media3.common.util.ParsableBitArray(this.dataScratchBytes.getData()));
                        } else if (i10 == 2) {
                            finalizeFrame();
                        }
                        this.state = 1;
                    }
                }
            } else if (skipToNextSync(parsableByteArray)) {
                this.state = 1;
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
        this.flags = i3;
        if (!this.rapPending && (this.frameBytes != 0 || !this.headerDataFinished)) {
            this.dataPending = true;
        }
        if (j != androidx.media3.common.C.TIME_UNSET) {
            if (this.dataPending) {
                this.timeUsPending = j;
            } else {
                this.timeUs = j;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.state = 0;
        this.syncBytes = 0;
        this.headerScratchBytes.reset(2);
        this.payloadBytesRead = 0;
        this.frameBytes = 0;
        this.samplingRate = androidx.media3.common.C.RATE_UNSET_INT;
        this.standardFrameLength = -1;
        this.truncationSamples = 0;
        this.mainStreamLabel = -1L;
        this.configFound = false;
        this.dataPending = false;
        this.headerDataFinished = true;
        this.rapPending = true;
        this.timeUs = -9.223372036854776E18d;
        this.timeUsPending = -9.223372036854776E18d;
    }
}
