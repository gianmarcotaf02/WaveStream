package androidx.media3.extractor.ogg;

/* JADX INFO: loaded from: classes.dex */
final class FlacReader extends androidx.media3.extractor.ogg.StreamReader {
    private static final byte AUDIO_PACKET_TYPE = -1;
    private static final int FRAME_HEADER_SAMPLE_NUMBER_OFFSET = 4;
    private androidx.media3.extractor.ogg.FlacReader.FlacOggSeeker flacOggSeeker;
    private androidx.media3.extractor.FlacStreamMetadata streamMetadata;

    public static final class FlacOggSeeker implements androidx.media3.extractor.ogg.OggSeeker {
        private long firstFrameOffset = -1;
        private long pendingSeekGranule = -1;
        private androidx.media3.extractor.FlacStreamMetadata.SeekTable seekTable;
        private androidx.media3.extractor.FlacStreamMetadata streamMetadata;

        public FlacOggSeeker(androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, androidx.media3.extractor.FlacStreamMetadata.SeekTable seekTable) {
            this.streamMetadata = flacStreamMetadata;
            this.seekTable = seekTable;
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public androidx.media3.extractor.SeekMap createSeekMap() {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.firstFrameOffset != -1);
            return new androidx.media3.extractor.FlacSeekTableSeekMap(this.streamMetadata, this.firstFrameOffset);
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public long read(androidx.media3.extractor.ExtractorInput extractorInput) {
            long j = this.pendingSeekGranule;
            if (j < 0) {
                return -1L;
            }
            long j9 = -(j + 2);
            this.pendingSeekGranule = -1L;
            return j9;
        }

        public void setFirstFrameOffset(long j) {
            this.firstFrameOffset = j;
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public void startSeek(long j) {
            long[] jArr = this.seekTable.pointSampleNumbers;
            this.pendingSeekGranule = jArr[androidx.media3.common.util.Util.binarySearchFloor(jArr, j, true, true)];
        }
    }

    private int getFlacFrameBlockSize(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int i3 = (parsableByteArray.getData()[2] & AUDIO_PACKET_TYPE) >> 4;
        if (i3 == 6 || i3 == 7) {
            parsableByteArray.skipBytes(4);
            parsableByteArray.readUtf8EncodedLong();
        }
        int frameBlockSizeSamplesFromKey = androidx.media3.extractor.FlacFrameReader.readFrameBlockSizeSamplesFromKey(parsableByteArray, i3);
        parsableByteArray.setPosition(0);
        return frameBlockSizeSamplesFromKey;
    }

    private static boolean isAudioPacket(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean verifyBitstreamType(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        return parsableByteArray.bytesLeft() >= 5 && parsableByteArray.readUnsignedByte() == 127 && parsableByteArray.readUnsignedInt() == 1179402563;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public long preparePayload(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        if (isAudioPacket(parsableByteArray.getData())) {
            return getFlacFrameBlockSize(parsableByteArray);
        }
        return -1L;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean readHeaders(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j, androidx.media3.extractor.ogg.StreamReader.SetupData setupData) {
        byte[] data = parsableByteArray.getData();
        androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata = this.streamMetadata;
        if (flacStreamMetadata == null) {
            androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata2 = new androidx.media3.extractor.FlacStreamMetadata(data, 17);
            this.streamMetadata = flacStreamMetadata2;
            setupData.format = flacStreamMetadata2.getFormat(java.util.Arrays.copyOfRange(data, 9, parsableByteArray.limit()), null).buildUpon().setContainerMimeType(androidx.media3.common.MimeTypes.AUDIO_OGG).build();
            return true;
        }
        if ((data[0] & 127) == 3) {
            androidx.media3.extractor.FlacStreamMetadata.SeekTable seekTableMetadataBlock = androidx.media3.extractor.FlacMetadataReader.readSeekTableMetadataBlock(parsableByteArray);
            androidx.media3.extractor.FlacStreamMetadata flacStreamMetadataCopyWithSeekTable = flacStreamMetadata.copyWithSeekTable(seekTableMetadataBlock);
            this.streamMetadata = flacStreamMetadataCopyWithSeekTable;
            this.flacOggSeeker = new androidx.media3.extractor.ogg.FlacReader.FlacOggSeeker(flacStreamMetadataCopyWithSeekTable, seekTableMetadataBlock);
            return true;
        }
        if (!isAudioPacket(data)) {
            return true;
        }
        androidx.media3.extractor.ogg.FlacReader.FlacOggSeeker flacOggSeeker = this.flacOggSeeker;
        if (flacOggSeeker != null) {
            flacOggSeeker.setFirstFrameOffset(j);
            setupData.oggSeeker = this.flacOggSeeker;
        }
        setupData.format.getClass();
        return false;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public void reset(boolean z6) {
        super.reset(z6);
        if (z6) {
            this.streamMetadata = null;
            this.flacOggSeeker = null;
        }
    }
}
