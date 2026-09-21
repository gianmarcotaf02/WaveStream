package androidx.media3.extractor.jpeg;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.StartOffsetExtractorInput;
import androidx.media3.extractor.StartOffsetExtractorOutput;
import androidx.media3.extractor.metadata.MotionPhotoMetadata;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.Objects;

final class JpegMotionPhotoExtractor implements Extractor {
    private static final String HEADER_XMP_APP1 = "http://ns.adobe.com/xap/1.0/";
    private static final int MARKER_APP1 = 65505;
    private static final int MARKER_SIZE = 2;
    private static final int MARKER_SOI = 65496;
    private static final int MARKER_SOS = 65498;
    private static final int SEGMENT_LENGTH_SIZE = 2;
    private static final int STATE_ENDED = 6;
    private static final int STATE_READING_MARKER = 0;
    private static final int STATE_READING_MOTION_PHOTO_VIDEO = 5;
    private static final int STATE_READING_SEGMENT = 2;
    private static final int STATE_READING_SEGMENT_LENGTH = 1;
    private static final int STATE_SNIFFING_MOTION_PHOTO_VIDEO = 4;
    private ExtractorOutput extractorOutput;
    private ExtractorInput lastExtractorInput;
    private int marker;
    private MotionPhotoMetadata motionPhotoMetadata;
    private Mp4Extractor mp4Extractor;
    private StartOffsetExtractorInput mp4ExtractorStartOffsetExtractorInput;
    private int segmentLength;
    private int state;
    private final ParsableByteArray scratch = new ParsableByteArray(2);
    private long mp4StartPosition = -1;

    private void endReading() {
        ExtractorOutput extractorOutput = this.extractorOutput;
        extractorOutput.getClass();
        extractorOutput.endTracks();
        this.extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
        this.state = 6;
    }

    private static MotionPhotoMetadata getMotionPhotoMetadata(String str, long j) {
        MotionPhotoDescription motionPhotoDescription;
        if (j == -1 || (motionPhotoDescription = XmpMotionPhotoDescriptionParser.parse(str)) == null) {
            return null;
        }
        return motionPhotoDescription.getMotionPhotoMetadata(j);
    }

    private boolean isMotionPhotoXmp(ParsableByteArray parsableByteArray) {
        if (Objects.equals(parsableByteArray.readNullTerminatedString(), HEADER_XMP_APP1)) {
            return XmpMotionPhotoDescriptionParser.isMotionPhotoXmp(parsableByteArray.readNullTerminatedString());
        }
        return false;
    }

    private void outputImageTrack(MotionPhotoMetadata motionPhotoMetadata) {
        ExtractorOutput extractorOutput = this.extractorOutput;
        extractorOutput.getClass();
        extractorOutput.track(1024, 4).format(new Format.Builder().setContainerMimeType(MimeTypes.IMAGE_JPEG).setMetadata(new Metadata(motionPhotoMetadata)).build());
    }

    private int peekMarker(ExtractorInput extractorInput) {
        this.scratch.reset(2);
        extractorInput.peekFully(this.scratch.getData(), 0, 2);
        return this.scratch.readUnsignedShort();
    }

    private int peekSegmentLength(ExtractorInput extractorInput) {
        this.scratch.reset(2);
        extractorInput.peekFully(this.scratch.getData(), 0, 2);
        return this.scratch.readUnsignedShort() - 2;
    }

    private void readMarker(ExtractorInput extractorInput) {
        this.scratch.reset(2);
        extractorInput.readFully(this.scratch.getData(), 0, 2);
        int unsignedShort = this.scratch.readUnsignedShort();
        this.marker = unsignedShort;
        if (unsignedShort == MARKER_SOS) {
            if (this.mp4StartPosition != -1) {
                this.state = 4;
                return;
            } else {
                endReading();
                return;
            }
        }
        if ((unsignedShort < 65488 || unsignedShort > 65497) && unsignedShort != 65281) {
            this.state = 1;
        }
    }

    private void readSegment(ExtractorInput extractorInput) {
        String nullTerminatedString;
        if (this.marker == MARKER_APP1) {
            ParsableByteArray parsableByteArray = new ParsableByteArray(this.segmentLength);
            extractorInput.readFully(parsableByteArray.getData(), 0, this.segmentLength);
            if (this.motionPhotoMetadata == null && HEADER_XMP_APP1.equals(parsableByteArray.readNullTerminatedString()) && (nullTerminatedString = parsableByteArray.readNullTerminatedString()) != null) {
                MotionPhotoMetadata motionPhotoMetadata = getMotionPhotoMetadata(nullTerminatedString, extractorInput.getLength());
                this.motionPhotoMetadata = motionPhotoMetadata;
                if (motionPhotoMetadata != null) {
                    this.mp4StartPosition = motionPhotoMetadata.videoStartPosition;
                }
            }
        } else {
            extractorInput.skipFully(this.segmentLength);
        }
        this.state = 0;
    }

    private void readSegmentLength(ExtractorInput extractorInput) {
        this.segmentLength = peekSegmentLength(extractorInput);
        extractorInput.skipFully(2);
        this.state = 2;
    }

    private void sniffMotionPhotoVideo(ExtractorInput extractorInput) {
        if (!extractorInput.peekFully(this.scratch.getData(), 0, 1, true)) {
            endReading();
            return;
        }
        extractorInput.resetPeekPosition();
        if (this.mp4Extractor == null) {
            this.mp4Extractor = new Mp4Extractor(SubtitleParser.Factory.UNSUPPORTED, 8);
        }
        StartOffsetExtractorInput startOffsetExtractorInput = new StartOffsetExtractorInput(extractorInput, this.mp4StartPosition);
        this.mp4ExtractorStartOffsetExtractorInput = startOffsetExtractorInput;
        if (!this.mp4Extractor.sniff(startOffsetExtractorInput)) {
            endReading();
            return;
        }
        Mp4Extractor mp4Extractor = this.mp4Extractor;
        long j = this.mp4StartPosition;
        ExtractorOutput extractorOutput = this.extractorOutput;
        extractorOutput.getClass();
        mp4Extractor.init(new StartOffsetExtractorOutput(j, extractorOutput));
        startReadingMotionPhoto();
    }

    private void startReadingMotionPhoto() {
        MotionPhotoMetadata motionPhotoMetadata = this.motionPhotoMetadata;
        motionPhotoMetadata.getClass();
        outputImageTrack(motionPhotoMetadata);
        this.state = 5;
    }

    @Override
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @Override
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int i3 = this.state;
        if (i3 == 0) {
            readMarker(extractorInput);
            return 0;
        }
        if (i3 == 1) {
            readSegmentLength(extractorInput);
            return 0;
        }
        if (i3 == 2) {
            readSegment(extractorInput);
            return 0;
        }
        if (i3 == 4) {
            long position = extractorInput.getPosition();
            long j = this.mp4StartPosition;
            if (position != j) {
                positionHolder.position = j;
                return 1;
            }
            sniffMotionPhotoVideo(extractorInput);
            return 0;
        }
        if (i3 != 5) {
            if (i3 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.mp4ExtractorStartOffsetExtractorInput == null || extractorInput != this.lastExtractorInput) {
            this.lastExtractorInput = extractorInput;
            this.mp4ExtractorStartOffsetExtractorInput = new StartOffsetExtractorInput(extractorInput, this.mp4StartPosition);
        }
        Mp4Extractor mp4Extractor = this.mp4Extractor;
        mp4Extractor.getClass();
        int i9 = mp4Extractor.read(this.mp4ExtractorStartOffsetExtractorInput, positionHolder);
        if (i9 == 1) {
            positionHolder.position += this.mp4StartPosition;
        }
        return i9;
    }

    @Override
    public void release() {
        Mp4Extractor mp4Extractor = this.mp4Extractor;
        if (mp4Extractor != null) {
            mp4Extractor.release();
        }
    }

    @Override
    public void seek(long j, long j9) {
        if (j == 0) {
            this.state = 0;
            this.mp4Extractor = null;
        } else if (this.state == 5) {
            Mp4Extractor mp4Extractor = this.mp4Extractor;
            mp4Extractor.getClass();
            mp4Extractor.seek(j, j9);
        }
    }

    @Override
    public boolean sniff(ExtractorInput extractorInput) {
        int iPeekSegmentLength;
        if (peekMarker(extractorInput) != MARKER_SOI) {
            return false;
        }
        while (true) {
            int iPeekMarker = peekMarker(extractorInput);
            this.marker = iPeekMarker;
            if (iPeekMarker == MARKER_SOS || (iPeekSegmentLength = peekSegmentLength(extractorInput)) < 0) {
                break;
            }
            if (this.marker != MARKER_APP1) {
                extractorInput.advancePeekPosition(iPeekSegmentLength);
            } else {
                this.scratch.reset(iPeekSegmentLength);
                extractorInput.peekFully(this.scratch.getData(), 0, iPeekSegmentLength);
                if (isMotionPhotoXmp(this.scratch)) {
                    return true;
                }
            }
        }
        return false;
    }
}
