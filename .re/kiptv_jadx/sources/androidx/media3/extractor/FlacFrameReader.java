package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class FlacFrameReader {
    private static final java.lang.String TAG = "FlacFrameReader";

    public static final class SampleNumberHolder {
        public long sampleNumber;
    }

    private FlacFrameReader() {
    }

    private static boolean checkAndReadBlockSizeSamples(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, int i3, long j) {
        int frameBlockSizeSamplesFromKey = readFrameBlockSizeSamplesFromKey(parsableByteArray, i3);
        long j9 = flacStreamMetadata.totalSamples;
        return frameBlockSizeSamplesFromKey != -1 && (((j9 > 0L ? 1 : (j9 == 0L ? 0 : -1)) == 0 || ((j + ((long) frameBlockSizeSamplesFromKey)) > j9 ? 1 : ((j + ((long) frameBlockSizeSamplesFromKey)) == j9 ? 0 : -1)) >= 0) || frameBlockSizeSamplesFromKey >= flacStreamMetadata.minBlockSizeSamples) && frameBlockSizeSamplesFromKey <= flacStreamMetadata.maxBlockSizeSamples;
    }

    private static boolean checkAndReadCrc(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        return parsableByteArray.readUnsignedByte() == androidx.media3.common.util.Util.crc8(parsableByteArray.getData(), i3, parsableByteArray.getPosition() - 1, 0);
    }

    private static boolean checkAndReadFirstSampleNumber(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, boolean z6, androidx.media3.extractor.FlacFrameReader.SampleNumberHolder sampleNumberHolder) {
        try {
            long utf8EncodedLong = parsableByteArray.readUtf8EncodedLong();
            if (!z6) {
                utf8EncodedLong *= (long) flacStreamMetadata.maxBlockSizeSamples;
            }
            long j = flacStreamMetadata.totalSamples;
            if (j != 0 && utf8EncodedLong > j) {
                return false;
            }
            sampleNumberHolder.sampleNumber = utf8EncodedLong;
            return true;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }

    public static boolean checkAndReadFrameHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, int i3, androidx.media3.extractor.FlacFrameReader.SampleNumberHolder sampleNumberHolder) {
        int position = parsableByteArray.getPosition();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long j = unsignedInt >>> 16;
        if (j != i3) {
            return false;
        }
        return checkChannelAssignment((int) ((unsignedInt >> 4) & 15), flacStreamMetadata) && checkBitsPerSample((int) ((unsignedInt >> 1) & 7), flacStreamMetadata) && !(((unsignedInt & 1) > 1L ? 1 : ((unsignedInt & 1) == 1L ? 0 : -1)) == 0) && checkAndReadFirstSampleNumber(parsableByteArray, flacStreamMetadata, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, sampleNumberHolder) && checkAndReadBlockSizeSamples(parsableByteArray, flacStreamMetadata, (int) ((unsignedInt >> 12) & 15), sampleNumberHolder.sampleNumber) && checkAndReadSampleRate(parsableByteArray, flacStreamMetadata, (int) ((unsignedInt >> 8) & 15)) && checkAndReadCrc(parsableByteArray, position) && checkFirstSubframeHeaderFromPeek(parsableByteArray);
    }

    private static boolean checkAndReadSampleRate(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, int i3) {
        int i9 = flacStreamMetadata.sampleRate;
        if (i3 == 0) {
            return true;
        }
        if (i3 <= 11) {
            return i3 == flacStreamMetadata.sampleRateLookupKey;
        }
        if (i3 == 12) {
            return parsableByteArray.readUnsignedByte() * 1000 == i9;
        }
        if (i3 <= 14) {
            int unsignedShort = parsableByteArray.readUnsignedShort();
            if (i3 == 14) {
                unsignedShort *= 10;
            }
            if (unsignedShort == i9) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkBitsPerSample(int i3, androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata) {
        return i3 == 0 || i3 == flacStreamMetadata.bitsPerSampleLookupKey;
    }

    private static boolean checkChannelAssignment(int i3, androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata) {
        if (i3 <= 7) {
            return i3 == flacStreamMetadata.channels - 1;
        }
        return i3 <= 10 && flacStreamMetadata.channels == 2;
    }

    private static boolean checkFirstSubframeHeaderFromPeek(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() == 0) {
            return true;
        }
        int iPeekUnsignedByte = parsableByteArray.peekUnsignedByte();
        if ((iPeekUnsignedByte & 128) != 0) {
            return false;
        }
        int i3 = (iPeekUnsignedByte & 126) >> 1;
        if ((i3 < 2 || i3 > 7) && (i3 < 13 || i3 > 31)) {
            return true;
        }
        androidx.media3.common.util.Log.i(TAG, "Ignoring frame where first subframe has a reserved type: " + i3);
        return false;
    }

    public static boolean checkFrameHeaderFromPeek(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, int i3, androidx.media3.extractor.FlacFrameReader.SampleNumberHolder sampleNumberHolder) {
        long peekPosition = extractorInput.getPeekPosition();
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(17);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 2);
        if (parsableByteArray.peekChar() != i3) {
            extractorInput.resetPeekPosition();
            extractorInput.advancePeekPosition((int) (peekPosition - extractorInput.getPosition()));
            return false;
        }
        parsableByteArray.setLimit(androidx.media3.extractor.ExtractorUtil.peekToLength(extractorInput, parsableByteArray.getData(), 2, 15) + 2);
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition((int) (peekPosition - extractorInput.getPosition()));
        return checkAndReadFrameHeader(parsableByteArray, flacStreamMetadata, i3, sampleNumberHolder);
    }

    public static long getFirstSampleNumber(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata) throws androidx.media3.common.ParserException {
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(1);
        byte[] bArr = new byte[1];
        extractorInput.peekFully(bArr, 0, 1);
        boolean z6 = (bArr[0] & 1) == 1;
        extractorInput.advancePeekPosition(2);
        int i3 = z6 ? 7 : 6;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(i3);
        parsableByteArray.setLimit(androidx.media3.extractor.ExtractorUtil.peekToLength(extractorInput, parsableByteArray.getData(), 0, i3));
        extractorInput.resetPeekPosition();
        androidx.media3.extractor.FlacFrameReader.SampleNumberHolder sampleNumberHolder = new androidx.media3.extractor.FlacFrameReader.SampleNumberHolder();
        if (checkAndReadFirstSampleNumber(parsableByteArray, flacStreamMetadata, z6, sampleNumberHolder)) {
            return sampleNumberHolder.sampleNumber;
        }
        throw androidx.media3.common.ParserException.createForMalformedContainer(null, null);
    }

    public static int readFrameBlockSizeSamplesFromKey(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        switch (i3) {
            case 1:
                return androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i3 - 2);
            case 6:
                return parsableByteArray.readUnsignedByte() + 1;
            case 7:
                return parsableByteArray.readUnsignedShort() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i3 - 8);
            default:
                return -1;
        }
    }
}
