package androidx.media3.extractor.flv;

import androidx.media3.common.C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.a;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class FlvExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new a(3);
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
    private AudioTagPayloadReader audioReader;
    private int bytesToNextTagHeader;
    private ExtractorOutput extractorOutput;
    private long mediaTagTimestampOffsetUs;
    private boolean outputFirstSample;
    private boolean outputSeekMap;
    private int tagDataSize;
    private long tagTimestampUs;
    private int tagType;
    private VideoTagPayloadReader videoReader;
    private final ParsableByteArray scratch = new ParsableByteArray(4);
    private final ParsableByteArray headerBuffer = new ParsableByteArray(9);
    private final ParsableByteArray tagHeaderBuffer = new ParsableByteArray(11);
    private final ParsableByteArray tagData = new ParsableByteArray();
    private final ScriptTagPayloadReader metadataReader = new ScriptTagPayloadReader();
    private int state = 1;

    @RequiresNonNull({"extractorOutput"})
    private void ensureReadyForMediaOutput() {
        if (this.outputSeekMap) {
            return;
        }
        this.extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
        this.outputSeekMap = true;
    }

    private long getCurrentTimestampUs() {
        if (this.outputFirstSample) {
            return this.mediaTagTimestampOffsetUs + this.tagTimestampUs;
        }
        if (this.metadataReader.getDurationUs() == C.TIME_UNSET) {
            return 0L;
        }
        return this.tagTimestampUs;
    }

    public static Extractor[] lambda$static$0() {
        return new Extractor[]{new FlvExtractor()};
    }

    private ParsableByteArray prepareTagData(ExtractorInput extractorInput) {
        if (this.tagDataSize > this.tagData.capacity()) {
            ParsableByteArray parsableByteArray = this.tagData;
            parsableByteArray.reset(new byte[Math.max(parsableByteArray.capacity() * 2, this.tagDataSize)], 0);
        } else {
            this.tagData.setPosition(0);
        }
        this.tagData.setLimit(this.tagDataSize);
        extractorInput.readFully(this.tagData.getData(), 0, this.tagDataSize);
        return this.tagData;
    }

    @RequiresNonNull({"extractorOutput"})
    private boolean readFlvHeader(ExtractorInput extractorInput) {
        if (!extractorInput.readFully(this.headerBuffer.getData(), 0, 9, true)) {
            return false;
        }
        this.headerBuffer.setPosition(0);
        this.headerBuffer.skipBytes(4);
        int unsignedByte = this.headerBuffer.readUnsignedByte();
        boolean z6 = (unsignedByte & 4) != 0;
        boolean z9 = (unsignedByte & 1) != 0;
        if (z6 && this.audioReader == null) {
            this.audioReader = new AudioTagPayloadReader(this.extractorOutput.track(8, 1));
        }
        if (z9 && this.videoReader == null) {
            this.videoReader = new VideoTagPayloadReader(this.extractorOutput.track(9, 2));
        }
        this.extractorOutput.endTracks();
        this.bytesToNextTagHeader = this.headerBuffer.readInt() - 5;
        this.state = 2;
        return true;
    }

    @RequiresNonNull({"extractorOutput"})
    private boolean readTagData(ExtractorInput extractorInput) {
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
                    if (durationUs != C.TIME_UNSET) {
                        this.extractorOutput.seekMap(new IndexSeekMap(this.metadataReader.getKeyFrameTagPositions(), this.metadataReader.getKeyFrameTimesUs(), durationUs));
                        this.outputSeekMap = true;
                    }
                }
                if (!this.outputFirstSample && zConsume) {
                    this.outputFirstSample = true;
                    if (this.metadataReader.getDurationUs() == C.TIME_UNSET) {
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
            if (this.metadataReader.getDurationUs() == C.TIME_UNSET) {
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

    private boolean readTagHeader(ExtractorInput extractorInput) {
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

    private void skipToTagHeader(ExtractorInput extractorInput) {
        extractorInput.skipFully(this.bytesToNextTagHeader);
        this.bytesToNextTagHeader = 0;
        this.state = 3;
    }

    @Override
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @Override
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        this.extractorOutput.getClass();
        while (true) {
            int i3 = this.state;
            if (i3 != 1) {
                if (i3 == 2) {
                    skipToTagHeader(extractorInput);
                } else if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException();
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

    @Override
    public void release() {
    }

    @Override
    public void seek(long j, long j9) {
        if (j == 0) {
            this.state = 1;
            this.outputFirstSample = false;
        } else {
            this.state = 3;
        }
        this.bytesToNextTagHeader = 0;
    }

    @Override
    public boolean sniff(ExtractorInput extractorInput) {
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
