package androidx.media3.extractor.ts;

import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import java.io.EOFException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class AdtsExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new androidx.media3.extractor.a(11);
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    private static final int MAX_PACKET_SIZE = 2048;
    private static final int MAX_SNIFF_BYTES = 8192;
    private static final int NUM_FRAMES_FOR_AVERAGE_FRAME_SIZE = 1000;
    private int averageFrameSize;
    private ExtractorOutput extractorOutput;
    private long firstFramePosition;
    private long firstSampleTimestampUs;
    private final int flags;
    private boolean hasCalculatedAverageFrameSize;
    private boolean hasOutputSeekMap;
    private final ParsableByteArray packetBuffer;
    private final AdtsReader reader;
    private final ParsableByteArray scratch;
    private final ParsableBitArray scratchBits;
    private boolean startedPacket;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AdtsExtractor() {
        this(0);
    }

    private void calculateAverageFrameSize(ExtractorInput extractorInput) throws ParserException {
        if (this.hasCalculatedAverageFrameSize) {
            return;
        }
        this.averageFrameSize = -1;
        extractorInput.resetPeekPosition();
        long j = 0;
        if (extractorInput.getPosition() == 0) {
            peekId3Header(extractorInput);
        }
        int i3 = 0;
        int i9 = 0;
        while (true) {
            try {
                if (extractorInput.peekFully(this.scratch.getData(), 0, 2, true)) {
                    this.scratch.setPosition(0);
                    if (!AdtsReader.isAdtsSyncWord(this.scratch.readUnsignedShort())) {
                        break;
                    }
                    if (extractorInput.peekFully(this.scratch.getData(), 0, 4, true)) {
                        this.scratchBits.setPosition(14);
                        int bits = this.scratchBits.readBits(13);
                        if (bits <= 6) {
                            this.hasCalculatedAverageFrameSize = true;
                            throw ParserException.createForMalformedContainer("Malformed ADTS stream", null);
                        }
                        j += (long) bits;
                        i9++;
                        if (i9 != 1000 && extractorInput.advancePeekPosition(bits - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i3 = i9;
            break;
        }
        extractorInput.resetPeekPosition();
        if (i3 > 0) {
            this.averageFrameSize = (int) (j / ((long) i3));
        } else {
            this.averageFrameSize = -1;
        }
        this.hasCalculatedAverageFrameSize = true;
    }

    private static int getBitrateFromFrameSize(int i3, long j) {
        return (int) ((((long) i3) * 8000000) / j);
    }

    private SeekMap getConstantBitrateSeekMap(long j, boolean z6) {
        return new ConstantBitrateSeekMap(j, this.firstFramePosition, getBitrateFromFrameSize(this.averageFrameSize, this.reader.getSampleDurationUs()), this.averageFrameSize, z6);
    }

    public static Extractor[] lambda$static$0() {
        return new Extractor[]{new AdtsExtractor()};
    }

    @RequiresNonNull({"extractorOutput"})
    private void maybeOutputSeekMap(long j, boolean z6) {
        if (this.hasOutputSeekMap) {
            return;
        }
        boolean z9 = (this.flags & 1) != 0 && this.averageFrameSize > 0;
        if (z9 && this.reader.getSampleDurationUs() == C.TIME_UNSET && !z6) {
            return;
        }
        if (!z9 || this.reader.getSampleDurationUs() == C.TIME_UNSET) {
            this.extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
        } else {
            this.extractorOutput.seekMap(getConstantBitrateSeekMap(j, (this.flags & 2) != 0));
        }
        this.hasOutputSeekMap = true;
    }

    private int peekId3Header(ExtractorInput extractorInput) {
        int i3 = 0;
        while (true) {
            extractorInput.peekFully(this.scratch.getData(), 0, 10);
            this.scratch.setPosition(0);
            if (this.scratch.readUnsignedInt24() != 4801587) {
                break;
            }
            this.scratch.skipBytes(3);
            int synchSafeInt = this.scratch.readSynchSafeInt();
            i3 += synchSafeInt + 10;
            extractorInput.advancePeekPosition(synchSafeInt);
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i3);
        if (this.firstFramePosition == -1) {
            this.firstFramePosition = i3;
        }
        return i3;
    }

    @Override
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.reader.createTracks(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
    }

    @Override
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException {
        this.extractorOutput.getClass();
        long length = extractorInput.getLength();
        int i3 = this.flags;
        if ((i3 & 2) != 0 || ((i3 & 1) != 0 && length != -1)) {
            calculateAverageFrameSize(extractorInput);
        }
        int i9 = extractorInput.read(this.packetBuffer.getData(), 0, 2048);
        boolean z6 = i9 == -1;
        maybeOutputSeekMap(length, z6);
        if (z6) {
            return -1;
        }
        this.packetBuffer.setPosition(0);
        this.packetBuffer.setLimit(i9);
        if (!this.startedPacket) {
            this.reader.packetStarted(this.firstSampleTimestampUs, 4);
            this.startedPacket = true;
        }
        this.reader.consume(this.packetBuffer);
        return 0;
    }

    @Override
    public void release() {
    }

    @Override
    public void seek(long j, long j9) {
        this.startedPacket = false;
        this.reader.seek();
        this.firstSampleTimestampUs = j9;
    }

    @Override
    public boolean sniff(ExtractorInput extractorInput) {
        int iPeekId3Header = peekId3Header(extractorInput);
        int i3 = iPeekId3Header;
        int i9 = 0;
        int i10 = 0;
        do {
            extractorInput.peekFully(this.scratch.getData(), 0, 2);
            this.scratch.setPosition(0);
            if (AdtsReader.isAdtsSyncWord(this.scratch.readUnsignedShort())) {
                i9++;
                if (i9 >= 4 && i10 > 188) {
                    return true;
                }
                extractorInput.peekFully(this.scratch.getData(), 0, 4);
                this.scratchBits.setPosition(14);
                int bits = this.scratchBits.readBits(13);
                if (bits <= 6) {
                    i3++;
                    extractorInput.resetPeekPosition();
                    extractorInput.advancePeekPosition(i3);
                } else {
                    extractorInput.advancePeekPosition(bits - 6);
                    i10 += bits;
                }
            } else {
                i3++;
                extractorInput.resetPeekPosition();
                extractorInput.advancePeekPosition(i3);
            }
            i9 = 0;
            i10 = 0;
        } while (i3 - iPeekId3Header < 8192);
        return false;
    }

    public AdtsExtractor(int i3) {
        this.flags = (i3 & 2) != 0 ? i3 | 1 : i3;
        this.reader = new AdtsReader(true, MimeTypes.AUDIO_AAC);
        this.packetBuffer = new ParsableByteArray(2048);
        this.averageFrameSize = -1;
        this.firstFramePosition = -1L;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        this.scratch = parsableByteArray;
        this.scratchBits = new ParsableBitArray(parsableByteArray.getData());
    }
}
