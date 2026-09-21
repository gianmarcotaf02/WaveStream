package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class PesReader implements androidx.media3.extractor.ts.TsPayloadReader {
    private static final int HEADER_SIZE = 9;
    private static final int MAX_HEADER_EXTENSION_SIZE = 10;
    private static final int PES_SCRATCH_SIZE = 10;
    private static final int STATE_FINDING_HEADER = 0;
    private static final int STATE_READING_BODY = 3;
    private static final int STATE_READING_HEADER = 1;
    private static final int STATE_READING_HEADER_EXTENSION = 2;
    private static final java.lang.String TAG = "PesReader";
    private int bytesRead;
    private boolean dataAlignmentIndicator;
    private boolean dtsFlag;
    private int extendedHeaderLength;
    private int payloadSize;
    private boolean ptsFlag;
    private final androidx.media3.extractor.ts.ElementaryStreamReader reader;
    private boolean seenFirstDts;
    private long timeUs;
    private androidx.media3.common.util.TimestampAdjuster timestampAdjuster;
    private final androidx.media3.common.util.ParsableBitArray pesScratch = new androidx.media3.common.util.ParsableBitArray(new byte[10]);
    private int state = 0;

    public PesReader(androidx.media3.extractor.ts.ElementaryStreamReader elementaryStreamReader) {
        this.reader = elementaryStreamReader;
    }

    private boolean continueRead(androidx.media3.common.util.ParsableByteArray parsableByteArray, byte[] bArr, int i3) {
        int iMin = java.lang.Math.min(parsableByteArray.bytesLeft(), i3 - this.bytesRead);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            parsableByteArray.skipBytes(iMin);
        } else {
            parsableByteArray.readBytes(bArr, this.bytesRead, iMin);
        }
        int i9 = this.bytesRead + iMin;
        this.bytesRead = i9;
        return i9 == i3;
    }

    private boolean parseHeader() {
        this.pesScratch.setPosition(0);
        int bits = this.pesScratch.readBits(24);
        if (bits != 1) {
            Y6.f.p(bits, "Unexpected start code prefix: ", TAG);
            this.payloadSize = -1;
            return false;
        }
        this.pesScratch.skipBits(8);
        int bits2 = this.pesScratch.readBits(16);
        this.pesScratch.skipBits(5);
        this.dataAlignmentIndicator = this.pesScratch.readBit();
        this.pesScratch.skipBits(2);
        this.ptsFlag = this.pesScratch.readBit();
        this.dtsFlag = this.pesScratch.readBit();
        this.pesScratch.skipBits(6);
        int bits3 = this.pesScratch.readBits(8);
        this.extendedHeaderLength = bits3;
        if (bits2 == 0) {
            this.payloadSize = -1;
        } else {
            int i3 = (bits2 - 3) - bits3;
            this.payloadSize = i3;
            if (i3 < 0) {
                androidx.media3.common.util.Log.w(TAG, "Found negative packet payload size: " + this.payloadSize);
                this.payloadSize = -1;
            }
        }
        return true;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"timestampAdjuster"})
    private void parseHeaderExtension() {
        this.pesScratch.setPosition(0);
        this.timeUs = androidx.media3.common.C.TIME_UNSET;
        if (this.ptsFlag) {
            this.pesScratch.skipBits(4);
            long bits = ((long) this.pesScratch.readBits(3)) << 30;
            this.pesScratch.skipBits(1);
            long bits2 = bits | ((long) (this.pesScratch.readBits(15) << 15));
            this.pesScratch.skipBits(1);
            long bits3 = bits2 | ((long) this.pesScratch.readBits(15));
            this.pesScratch.skipBits(1);
            if (!this.seenFirstDts && this.dtsFlag) {
                this.pesScratch.skipBits(4);
                long bits4 = ((long) this.pesScratch.readBits(3)) << 30;
                this.pesScratch.skipBits(1);
                long bits5 = bits4 | ((long) (this.pesScratch.readBits(15) << 15));
                this.pesScratch.skipBits(1);
                long bits6 = bits5 | ((long) this.pesScratch.readBits(15));
                this.pesScratch.skipBits(1);
                this.timestampAdjuster.adjustTsTimestamp(bits6);
                this.seenFirstDts = true;
            }
            this.timeUs = this.timestampAdjuster.adjustTsTimestamp(bits3);
        }
    }

    private void setState(int i3) {
        this.state = i3;
        this.bytesRead = 0;
    }

    public boolean canConsumeSynthesizedEmptyPusi(boolean z6) {
        return this.state == 3 && this.payloadSize == -1 && !(z6 && (this.reader instanceof androidx.media3.extractor.ts.H262Reader)) && (!z6 || parseHeader());
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        this.timestampAdjuster.getClass();
        if ((i3 & 1) != 0) {
            int i9 = this.state;
            if (i9 != 0 && i9 != 1) {
                if (i9 == 2) {
                    androidx.media3.common.util.Log.w(TAG, "Unexpected start indicator reading extended header");
                } else {
                    if (i9 != 3) {
                        throw new java.lang.IllegalStateException();
                    }
                    if (this.payloadSize != -1) {
                        androidx.media3.common.util.Log.w(TAG, "Unexpected start indicator: expected " + this.payloadSize + " more bytes");
                    }
                    this.reader.packetFinished(parsableByteArray.limit() == 0);
                }
            }
            setState(1);
        }
        while (parsableByteArray.bytesLeft() > 0) {
            int i10 = this.state;
            if (i10 == 0) {
                parsableByteArray.skipBytes(parsableByteArray.bytesLeft());
            } else if (i10 != 1) {
                if (i10 == 2) {
                    if (continueRead(parsableByteArray, this.pesScratch.data, java.lang.Math.min(10, this.extendedHeaderLength)) && continueRead(parsableByteArray, null, this.extendedHeaderLength)) {
                        parseHeaderExtension();
                        i3 |= this.dataAlignmentIndicator ? 4 : 0;
                        this.reader.packetStarted(this.timeUs, i3);
                        setState(3);
                    }
                } else {
                    if (i10 != 3) {
                        throw new java.lang.IllegalStateException();
                    }
                    int iBytesLeft = parsableByteArray.bytesLeft();
                    int i11 = this.payloadSize;
                    int i12 = i11 == -1 ? 0 : iBytesLeft - i11;
                    if (i12 > 0) {
                        iBytesLeft -= i12;
                        parsableByteArray.setLimit(parsableByteArray.getPosition() + iBytesLeft);
                    }
                    this.reader.consume(parsableByteArray);
                    int i13 = this.payloadSize;
                    if (i13 != -1) {
                        int i14 = i13 - iBytesLeft;
                        this.payloadSize = i14;
                        if (i14 == 0) {
                            this.reader.packetFinished(false);
                            setState(1);
                        }
                    }
                }
            } else if (continueRead(parsableByteArray, this.pesScratch.data, 9)) {
                setState(parseHeader() ? 2 : 0);
            }
        }
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public void init(androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.timestampAdjuster = timestampAdjuster;
        this.reader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.seenFirstDts = false;
        this.reader.seek();
    }
}
