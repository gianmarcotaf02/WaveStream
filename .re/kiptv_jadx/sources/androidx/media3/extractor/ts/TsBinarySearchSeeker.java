package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
final class TsBinarySearchSeeker extends androidx.media3.extractor.BinarySearchSeeker {
    private static final int MINIMUM_SEARCH_RANGE_BYTES = 940;
    private static final long SEEK_TOLERANCE_US = 100000;

    public static final class TsPcrSeeker implements androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker {
        private final androidx.media3.common.util.ParsableByteArray packetBuffer = new androidx.media3.common.util.ParsableByteArray();
        private final int pcrPid;
        private final androidx.media3.common.util.TimestampAdjuster pcrTimestampAdjuster;
        private final int timestampSearchBytes;

        public TsPcrSeeker(int i3, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, int i9) {
            this.pcrPid = i3;
            this.pcrTimestampAdjuster = timestampAdjuster;
            this.timestampSearchBytes = i9;
        }

        private androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult searchForPcrValueInBuffer(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j, long j9) {
            int iFindSyncBytePosition;
            int iFindSyncBytePosition2;
            int iLimit = parsableByteArray.limit();
            long j10 = -1;
            long j11 = -1;
            long j12 = -9223372036854775807L;
            while (parsableByteArray.bytesLeft() >= 188 && (iFindSyncBytePosition2 = (iFindSyncBytePosition = androidx.media3.extractor.ts.TsUtil.findSyncBytePosition(parsableByteArray.getData(), parsableByteArray.getPosition(), iLimit)) + androidx.media3.extractor.ts.TsExtractor.TS_PACKET_SIZE) <= iLimit) {
                long pcrFromPacket = androidx.media3.extractor.ts.TsUtil.readPcrFromPacket(parsableByteArray, iFindSyncBytePosition, this.pcrPid);
                if (pcrFromPacket != androidx.media3.common.C.TIME_UNSET) {
                    long jAdjustTsTimestamp = this.pcrTimestampAdjuster.adjustTsTimestamp(pcrFromPacket);
                    if (jAdjustTsTimestamp > j) {
                        return j12 == androidx.media3.common.C.TIME_UNSET ? androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.overestimatedResult(jAdjustTsTimestamp, j9) : androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j9 + j11);
                    }
                    if (100000 + jAdjustTsTimestamp > j) {
                        return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j9 + ((long) iFindSyncBytePosition));
                    }
                    j11 = iFindSyncBytePosition;
                    j12 = jAdjustTsTimestamp;
                }
                parsableByteArray.setPosition(iFindSyncBytePosition2);
                j10 = iFindSyncBytePosition2;
            }
            return j12 != androidx.media3.common.C.TIME_UNSET ? androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.underestimatedResult(j12, j9 + j10) : androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public void onSeekFinished() {
            this.packetBuffer.reset(androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY);
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult searchForTimestamp(androidx.media3.extractor.ExtractorInput extractorInput, long j) {
            long position = extractorInput.getPosition();
            int iMin = (int) java.lang.Math.min(this.timestampSearchBytes, extractorInput.getLength() - position);
            this.packetBuffer.reset(iMin);
            extractorInput.peekFully(this.packetBuffer.getData(), 0, iMin);
            return searchForPcrValueInBuffer(this.packetBuffer, j, position);
        }
    }

    public TsBinarySearchSeeker(androidx.media3.common.util.TimestampAdjuster timestampAdjuster, long j, long j9, int i3, int i9) {
        super(new androidx.media3.extractor.BinarySearchSeeker.DefaultSeekTimestampConverter(), new androidx.media3.extractor.ts.TsBinarySearchSeeker.TsPcrSeeker(i3, timestampAdjuster, i9), j, 0L, j + 1, 0L, j9, 188L, MINIMUM_SEARCH_RANGE_BYTES);
    }
}
