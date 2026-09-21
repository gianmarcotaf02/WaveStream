package androidx.media3.extractor.jpeg;

/* JADX INFO: loaded from: classes.dex */
final class JpegMotionPhotoExtractor implements androidx.media3.extractor.Extractor {
    private static final java.lang.String HEADER_XMP_APP1 = "http://ns.adobe.com/xap/1.0/";
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
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private androidx.media3.extractor.ExtractorInput lastExtractorInput;
    private int marker;
    private androidx.media3.extractor.metadata.MotionPhotoMetadata motionPhotoMetadata;
    private androidx.media3.extractor.mp4.Mp4Extractor mp4Extractor;
    private androidx.media3.extractor.StartOffsetExtractorInput mp4ExtractorStartOffsetExtractorInput;
    private int segmentLength;
    private int state;
    private final androidx.media3.common.util.ParsableByteArray scratch = new androidx.media3.common.util.ParsableByteArray(2);
    private long mp4StartPosition = -1;

    private void endReading() {
        androidx.media3.extractor.ExtractorOutput extractorOutput = this.extractorOutput;
        extractorOutput.getClass();
        extractorOutput.endTracks();
        this.extractorOutput.seekMap(new androidx.media3.extractor.SeekMap.Unseekable(androidx.media3.common.C.TIME_UNSET));
        this.state = 6;
    }

    private static androidx.media3.extractor.metadata.MotionPhotoMetadata getMotionPhotoMetadata(java.lang.String str, long j) {
        androidx.media3.extractor.jpeg.MotionPhotoDescription motionPhotoDescription;
        if (j == -1 || (motionPhotoDescription = androidx.media3.extractor.jpeg.XmpMotionPhotoDescriptionParser.parse(str)) == null) {
            return null;
        }
        return motionPhotoDescription.getMotionPhotoMetadata(j);
    }

    private boolean isMotionPhotoXmp(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        if (java.util.Objects.equals(parsableByteArray.readNullTerminatedString(), HEADER_XMP_APP1)) {
            return androidx.media3.extractor.jpeg.XmpMotionPhotoDescriptionParser.isMotionPhotoXmp(parsableByteArray.readNullTerminatedString());
        }
        return false;
    }

    private void outputImageTrack(androidx.media3.extractor.metadata.MotionPhotoMetadata motionPhotoMetadata) {
        androidx.media3.extractor.ExtractorOutput extractorOutput = this.extractorOutput;
        extractorOutput.getClass();
        extractorOutput.track(1024, 4).format(new androidx.media3.common.Format.Builder().setContainerMimeType(androidx.media3.common.MimeTypes.IMAGE_JPEG).setMetadata(new androidx.media3.common.Metadata(motionPhotoMetadata)).build());
    }

    private int peekMarker(androidx.media3.extractor.ExtractorInput extractorInput) {
        this.scratch.reset(2);
        extractorInput.peekFully(this.scratch.getData(), 0, 2);
        return this.scratch.readUnsignedShort();
    }

    private int peekSegmentLength(androidx.media3.extractor.ExtractorInput extractorInput) {
        this.scratch.reset(2);
        extractorInput.peekFully(this.scratch.getData(), 0, 2);
        return this.scratch.readUnsignedShort() - 2;
    }

    private void readMarker(androidx.media3.extractor.ExtractorInput extractorInput) {
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

    private void readSegment(androidx.media3.extractor.ExtractorInput extractorInput) {
        java.lang.String nullTerminatedString;
        if (this.marker == MARKER_APP1) {
            androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(this.segmentLength);
            extractorInput.readFully(parsableByteArray.getData(), 0, this.segmentLength);
            if (this.motionPhotoMetadata == null && HEADER_XMP_APP1.equals(parsableByteArray.readNullTerminatedString()) && (nullTerminatedString = parsableByteArray.readNullTerminatedString()) != null) {
                androidx.media3.extractor.metadata.MotionPhotoMetadata motionPhotoMetadata = getMotionPhotoMetadata(nullTerminatedString, extractorInput.getLength());
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

    private void readSegmentLength(androidx.media3.extractor.ExtractorInput extractorInput) {
        this.segmentLength = peekSegmentLength(extractorInput);
        extractorInput.skipFully(2);
        this.state = 2;
    }

    private void sniffMotionPhotoVideo(androidx.media3.extractor.ExtractorInput extractorInput) {
        if (!extractorInput.peekFully(this.scratch.getData(), 0, 1, true)) {
            endReading();
            return;
        }
        extractorInput.resetPeekPosition();
        if (this.mp4Extractor == null) {
            this.mp4Extractor = new androidx.media3.extractor.mp4.Mp4Extractor(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, 8);
        }
        androidx.media3.extractor.StartOffsetExtractorInput startOffsetExtractorInput = new androidx.media3.extractor.StartOffsetExtractorInput(extractorInput, this.mp4StartPosition);
        this.mp4ExtractorStartOffsetExtractorInput = startOffsetExtractorInput;
        if (!this.mp4Extractor.sniff(startOffsetExtractorInput)) {
            endReading();
            return;
        }
        androidx.media3.extractor.mp4.Mp4Extractor mp4Extractor = this.mp4Extractor;
        long j = this.mp4StartPosition;
        androidx.media3.extractor.ExtractorOutput extractorOutput = this.extractorOutput;
        extractorOutput.getClass();
        mp4Extractor.init(new androidx.media3.extractor.StartOffsetExtractorOutput(j, extractorOutput));
        startReadingMotionPhoto();
    }

    private void startReadingMotionPhoto() {
        androidx.media3.extractor.metadata.MotionPhotoMetadata motionPhotoMetadata = this.motionPhotoMetadata;
        motionPhotoMetadata.getClass();
        outputImageTrack(motionPhotoMetadata);
        this.state = 5;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) {
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
            throw new java.lang.IllegalStateException();
        }
        if (this.mp4ExtractorStartOffsetExtractorInput == null || extractorInput != this.lastExtractorInput) {
            this.lastExtractorInput = extractorInput;
            this.mp4ExtractorStartOffsetExtractorInput = new androidx.media3.extractor.StartOffsetExtractorInput(extractorInput, this.mp4StartPosition);
        }
        androidx.media3.extractor.mp4.Mp4Extractor mp4Extractor = this.mp4Extractor;
        mp4Extractor.getClass();
        int i9 = mp4Extractor.read(this.mp4ExtractorStartOffsetExtractorInput, positionHolder);
        if (i9 == 1) {
            positionHolder.position += this.mp4StartPosition;
        }
        return i9;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        androidx.media3.extractor.mp4.Mp4Extractor mp4Extractor = this.mp4Extractor;
        if (mp4Extractor != null) {
            mp4Extractor.release();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j9) {
        if (j == 0) {
            this.state = 0;
            this.mp4Extractor = null;
        } else if (this.state == 5) {
            androidx.media3.extractor.mp4.Mp4Extractor mp4Extractor = this.mp4Extractor;
            mp4Extractor.getClass();
            mp4Extractor.seek(j, j9);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) {
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
