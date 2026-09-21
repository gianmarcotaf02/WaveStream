package androidx.media3.extractor.heif;

/* JADX INFO: loaded from: classes.dex */
final class HeicMotionPhotoExtractor implements androidx.media3.extractor.Extractor {
    private static final int STATE_ENDED = 4;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_MOTION_PHOTO_VIDEO = 3;
    private static final int STATE_SNIFFING_MOTION_PHOTO_VIDEO = 2;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private androidx.media3.extractor.ExtractorInput lastExtractorInput;
    private androidx.media3.extractor.metadata.MotionPhotoMetadata motionPhotoMetadata;
    private androidx.media3.extractor.mp4.Mp4Extractor mp4Extractor;
    private androidx.media3.extractor.StartOffsetExtractorInput mp4ExtractorStartOffsetExtractorInput;
    private final androidx.media3.common.util.ParsableByteArray scratch = new androidx.media3.common.util.ParsableByteArray(16);
    private long mp4StartPosition = -1;
    private int state = 0;

    private void endReading() {
        androidx.media3.extractor.ExtractorOutput extractorOutput = this.extractorOutput;
        extractorOutput.getClass();
        extractorOutput.endTracks();
        this.extractorOutput.seekMap(new androidx.media3.extractor.SeekMap.Unseekable(androidx.media3.common.C.TIME_UNSET));
        this.state = 4;
    }

    private void outputImageTrack(androidx.media3.extractor.metadata.MotionPhotoMetadata motionPhotoMetadata) {
        androidx.media3.extractor.ExtractorOutput extractorOutput = this.extractorOutput;
        extractorOutput.getClass();
        extractorOutput.track(1024, 4).format(new androidx.media3.common.Format.Builder().setContainerMimeType(androidx.media3.common.MimeTypes.IMAGE_HEIC).setMetadata(new androidx.media3.common.Metadata(motionPhotoMetadata)).build());
    }

    private boolean readAtomHeader(androidx.media3.extractor.ExtractorInput extractorInput) {
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.scratch.getData(), 0, 8, true)) {
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.scratch.setPosition(0);
            this.atomSize = this.scratch.readUnsignedInt();
            this.atomType = this.scratch.readInt();
        }
        if (this.atomSize == 1) {
            extractorInput.readFully(this.scratch.getData(), 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.scratch.readUnsignedLongToLong();
        }
        if (this.atomType == 1836086884) {
            long position = extractorInput.getPosition();
            this.mp4StartPosition = position;
            int i3 = this.atomHeaderBytesRead;
            androidx.media3.extractor.metadata.MotionPhotoMetadata motionPhotoMetadata = new androidx.media3.extractor.metadata.MotionPhotoMetadata(0L, position - ((long) i3), androidx.media3.common.C.TIME_UNSET, position, this.atomSize - ((long) i3));
            this.motionPhotoMetadata = motionPhotoMetadata;
            outputImageTrack(motionPhotoMetadata);
            this.state = 2;
        } else {
            this.state = 1;
        }
        return true;
    }

    private void readAtomPayload(androidx.media3.extractor.ExtractorInput extractorInput) {
        extractorInput.skipFully((int) (this.atomSize - ((long) this.atomHeaderBytesRead)));
        this.atomHeaderBytesRead = 0;
        this.state = 0;
    }

    private int readMotionPhotoVideo(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) {
        if (this.mp4ExtractorStartOffsetExtractorInput == null || extractorInput != this.lastExtractorInput) {
            this.lastExtractorInput = extractorInput;
            this.mp4ExtractorStartOffsetExtractorInput = new androidx.media3.extractor.StartOffsetExtractorInput(extractorInput, this.mp4StartPosition);
        }
        androidx.media3.extractor.mp4.Mp4Extractor mp4Extractor = this.mp4Extractor;
        mp4Extractor.getClass();
        int i3 = mp4Extractor.read(this.mp4ExtractorStartOffsetExtractorInput, positionHolder);
        if (i3 == 1) {
            positionHolder.position += this.mp4StartPosition;
        }
        return i3;
    }

    private void sniffMotionPhotoVideo(androidx.media3.extractor.ExtractorInput extractorInput) {
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
        this.state = 3;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) {
        while (true) {
            int i3 = this.state;
            if (i3 != 0) {
                if (i3 == 1) {
                    readAtomPayload(extractorInput);
                } else {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            return readMotionPhotoVideo(extractorInput, positionHolder);
                        }
                        if (i3 == 4) {
                            return -1;
                        }
                        throw new java.lang.IllegalStateException();
                    }
                    sniffMotionPhotoVideo(extractorInput);
                }
            } else if (!readAtomHeader(extractorInput)) {
                endReading();
                return -1;
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        androidx.media3.extractor.mp4.Mp4Extractor mp4Extractor = this.mp4Extractor;
        if (mp4Extractor != null) {
            mp4Extractor.release();
            this.mp4Extractor = null;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j9) {
        if (j != 0) {
            if (this.state == 3) {
                androidx.media3.extractor.mp4.Mp4Extractor mp4Extractor = this.mp4Extractor;
                mp4Extractor.getClass();
                mp4Extractor.seek(j, j9);
                return;
            }
            return;
        }
        this.state = 0;
        this.atomHeaderBytesRead = 0;
        this.mp4StartPosition = -1L;
        androidx.media3.extractor.mp4.Mp4Extractor mp4Extractor2 = this.mp4Extractor;
        if (mp4Extractor2 != null) {
            mp4Extractor2.release();
            this.mp4Extractor = null;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) {
        return androidx.media3.extractor.heif.HeifSniffer.sniff(extractorInput, true);
    }
}
