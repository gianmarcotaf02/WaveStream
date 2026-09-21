package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class FlacMetadataReader {
    private static final int SEEK_POINT_SIZE = 18;
    private static final int STREAM_MARKER = 1716281667;
    private static final int SYNC_CODE = 16382;

    public static final class FlacStreamMetadataHolder {
        public androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata;

        public FlacStreamMetadataHolder(androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata) {
            this.flacStreamMetadata = flacStreamMetadata;
        }
    }

    private FlacMetadataReader() {
    }

    public static boolean checkAndPeekStreamMarker(androidx.media3.extractor.ExtractorInput extractorInput) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(4);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 4);
        return parsableByteArray.readUnsignedInt() == 1716281667;
    }

    public static int getFrameStartMarker(androidx.media3.extractor.ExtractorInput extractorInput) throws androidx.media3.common.ParserException {
        extractorInput.resetPeekPosition();
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(2);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 2);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        if ((unsignedShort >> 2) == SYNC_CODE) {
            extractorInput.resetPeekPosition();
            return unsignedShort;
        }
        extractorInput.resetPeekPosition();
        throw androidx.media3.common.ParserException.createForMalformedContainer("First frame does not start with sync code.", null);
    }

    public static androidx.media3.common.Metadata peekId3Metadata(androidx.media3.extractor.ExtractorInput extractorInput, boolean z6) {
        androidx.media3.common.Metadata metadataPeekId3Data = new androidx.media3.extractor.Id3Peeker().peekId3Data(extractorInput, z6 ? null : androidx.media3.extractor.metadata.id3.Id3Decoder.NO_FRAMES_PREDICATE, 0);
        if (metadataPeekId3Data == null || metadataPeekId3Data.length() == 0) {
            return null;
        }
        return metadataPeekId3Data;
    }

    public static androidx.media3.common.Metadata readId3Metadata(androidx.media3.extractor.ExtractorInput extractorInput, boolean z6) {
        extractorInput.resetPeekPosition();
        long peekPosition = extractorInput.getPeekPosition();
        androidx.media3.common.Metadata metadataPeekId3Metadata = peekId3Metadata(extractorInput, z6);
        extractorInput.skipFully((int) (extractorInput.getPeekPosition() - peekPosition));
        return metadataPeekId3Metadata;
    }

    public static boolean readMetadataBlock(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.FlacMetadataReader.FlacStreamMetadataHolder flacStreamMetadataHolder) {
        extractorInput.resetPeekPosition();
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray(new byte[4]);
        extractorInput.peekFully(parsableBitArray.data, 0, 4);
        boolean bit = parsableBitArray.readBit();
        int bits = parsableBitArray.readBits(7);
        int bits2 = parsableBitArray.readBits(24) + 4;
        if (bits == 0) {
            flacStreamMetadataHolder.flacStreamMetadata = readStreamInfoBlock(extractorInput);
            return bit;
        }
        androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata = flacStreamMetadataHolder.flacStreamMetadata;
        if (flacStreamMetadata == null) {
            throw new java.lang.IllegalArgumentException();
        }
        if (bits == 3) {
            flacStreamMetadataHolder.flacStreamMetadata = flacStreamMetadata.copyWithSeekTable(readSeekTableMetadataBlock(extractorInput, bits2));
            return bit;
        }
        if (bits == 4) {
            flacStreamMetadataHolder.flacStreamMetadata = flacStreamMetadata.copyWithVorbisComments(readVorbisCommentMetadataBlock(extractorInput, bits2));
            return bit;
        }
        if (bits != 6) {
            extractorInput.skipFully(bits2);
            return bit;
        }
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bits2);
        extractorInput.readFully(parsableByteArray.getData(), 0, bits2);
        parsableByteArray.skipBytes(4);
        flacStreamMetadataHolder.flacStreamMetadata = flacStreamMetadata.copyWithPictureFrames(p076i4.AbstractC2186b0.y(androidx.media3.extractor.metadata.flac.PictureFrame.fromPictureBlock(parsableByteArray)));
        return bit;
    }

    public static androidx.media3.extractor.FlacStreamMetadata.SeekTable readSeekTableMetadataBlock(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(1);
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        long position = ((long) parsableByteArray.getPosition()) + ((long) unsignedInt24);
        int i3 = unsignedInt24 / 18;
        long[] jArrCopyOf = new long[i3];
        long[] jArrCopyOf2 = new long[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            long j = parsableByteArray.readLong();
            if (j == -1) {
                jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i9);
                jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf2, i9);
                break;
            }
            jArrCopyOf[i9] = j;
            jArrCopyOf2[i9] = parsableByteArray.readLong();
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes((int) (position - ((long) parsableByteArray.getPosition())));
        return new androidx.media3.extractor.FlacStreamMetadata.SeekTable(jArrCopyOf, jArrCopyOf2);
    }

    private static androidx.media3.extractor.FlacStreamMetadata readStreamInfoBlock(androidx.media3.extractor.ExtractorInput extractorInput) {
        byte[] bArr = new byte[38];
        extractorInput.readFully(bArr, 0, 38);
        return new androidx.media3.extractor.FlacStreamMetadata(bArr, 4);
    }

    public static void readStreamMarker(androidx.media3.extractor.ExtractorInput extractorInput) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(4);
        extractorInput.readFully(parsableByteArray.getData(), 0, 4);
        if (parsableByteArray.readUnsignedInt() != 1716281667) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Failed to read FLAC stream marker.", null);
        }
    }

    private static java.util.List<java.lang.String> readVorbisCommentMetadataBlock(androidx.media3.extractor.ExtractorInput extractorInput, int i3) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(i3);
        extractorInput.readFully(parsableByteArray.getData(), 0, i3);
        parsableByteArray.skipBytes(4);
        return java.util.Arrays.asList(androidx.media3.extractor.VorbisUtil.readVorbisCommentHeader(parsableByteArray, false, false).comments);
    }

    private static androidx.media3.extractor.FlacStreamMetadata.SeekTable readSeekTableMetadataBlock(androidx.media3.extractor.ExtractorInput extractorInput, int i3) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(i3);
        extractorInput.readFully(parsableByteArray.getData(), 0, i3);
        return readSeekTableMetadataBlock(parsableByteArray);
    }
}
