package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public abstract class BinarySearchSeeker {
    private static final long MAX_SKIP_BYTES = 262144;
    private final int minimumSearchRange;
    protected final androidx.media3.extractor.BinarySearchSeeker.BinarySearchSeekMap seekMap;
    protected androidx.media3.extractor.BinarySearchSeeker.SeekOperationParams seekOperationParams;
    protected final androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker timestampSeeker;

    public static class BinarySearchSeekMap implements androidx.media3.extractor.SeekMap {
        private final long approxBytesPerFrame;
        private final long ceilingBytePosition;
        private final long ceilingTimePosition;
        private final long durationUs;
        private final long floorBytePosition;
        private final long floorTimePosition;
        private final androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter seekTimestampConverter;

        public BinarySearchSeekMap(androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter seekTimestampConverter, long j, long j9, long j10, long j11, long j12, long j13) {
            this.seekTimestampConverter = seekTimestampConverter;
            this.durationUs = j;
            this.floorTimePosition = j9;
            this.ceilingTimePosition = j10;
            this.floorBytePosition = j11;
            this.ceilingBytePosition = j12;
            this.approxBytesPerFrame = j13;
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // androidx.media3.extractor.SeekMap
        public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(new androidx.media3.extractor.SeekPoint(j, androidx.media3.extractor.BinarySearchSeeker.SeekOperationParams.calculateNextSearchBytePosition(this.seekTimestampConverter.timeUsToTargetTime(j), this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame)));
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        public long timeUsToTargetTime(long j) {
            return this.seekTimestampConverter.timeUsToTargetTime(j);
        }
    }

    public static final class DefaultSeekTimestampConverter implements androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter {
        @Override // androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter
        public long timeUsToTargetTime(long j) {
            return j;
        }
    }

    public static class SeekOperationParams {
        private final long approxBytesPerFrame;
        private long ceilingBytePosition;
        private long ceilingTimePosition;
        private long floorBytePosition;
        private long floorTimePosition;
        private long nextSearchBytePosition;
        private final long seekTimeUs;
        private final long targetTimePosition;

        public SeekOperationParams(long j, long j9, long j10, long j11, long j12, long j13, long j14) {
            this.seekTimeUs = j;
            this.targetTimePosition = j9;
            this.floorTimePosition = j10;
            this.ceilingTimePosition = j11;
            this.floorBytePosition = j12;
            this.ceilingBytePosition = j13;
            this.approxBytesPerFrame = j14;
            this.nextSearchBytePosition = calculateNextSearchBytePosition(j9, j10, j11, j12, j13, j14);
        }

        public static long calculateNextSearchBytePosition(long j, long j9, long j10, long j11, long j12, long j13) {
            if (j11 + 1 >= j12 || j9 + 1 >= j10) {
                return j11;
            }
            long j14 = (long) ((j - j9) * ((j12 - j11) / (j10 - j9)));
            return androidx.media3.common.util.Util.constrainValue(((j14 + j11) - j13) - (j14 / 20), j11, j12 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getCeilingBytePosition() {
            return this.ceilingBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getFloorBytePosition() {
            return this.floorBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getNextSearchBytePosition() {
            return this.nextSearchBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getSeekTimeUs() {
            return this.seekTimeUs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getTargetTimePosition() {
            return this.targetTimePosition;
        }

        private void updateNextSearchBytePosition() {
            this.nextSearchBytePosition = calculateNextSearchBytePosition(this.targetTimePosition, this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekCeiling(long j, long j9) {
            this.ceilingTimePosition = j;
            this.ceilingBytePosition = j9;
            updateNextSearchBytePosition();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekFloor(long j, long j9) {
            this.floorTimePosition = j;
            this.floorBytePosition = j9;
            updateNextSearchBytePosition();
        }
    }

    public interface SeekTimestampConverter {
        long timeUsToTargetTime(long j);
    }

    public static final class TimestampSearchResult {
        public static final androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult NO_TIMESTAMP_IN_RANGE_RESULT = new androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult(-3, androidx.media3.common.C.TIME_UNSET, -1);
        public static final int TYPE_NO_TIMESTAMP = -3;
        public static final int TYPE_POSITION_OVERESTIMATED = -1;
        public static final int TYPE_POSITION_UNDERESTIMATED = -2;
        public static final int TYPE_TARGET_TIMESTAMP_FOUND = 0;
        private final long bytePositionToUpdate;
        private final long timestampToUpdate;
        private final int type;

        private TimestampSearchResult(int i3, long j, long j9) {
            this.type = i3;
            this.timestampToUpdate = j;
            this.bytePositionToUpdate = j9;
        }

        public static androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult overestimatedResult(long j, long j9) {
            return new androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult(-1, j, j9);
        }

        public static androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult targetFoundResult(long j) {
            return new androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult(0, androidx.media3.common.C.TIME_UNSET, j);
        }

        public static androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult underestimatedResult(long j, long j9) {
            return new androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult(-2, j, j9);
        }
    }

    public interface TimestampSeeker {
        default void onSeekFinished() {
        }

        androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult searchForTimestamp(androidx.media3.extractor.ExtractorInput extractorInput, long j);
    }

    public BinarySearchSeeker(androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter seekTimestampConverter, androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker timestampSeeker, long j, long j9, long j10, long j11, long j12, long j13, int i3) {
        this.timestampSeeker = timestampSeeker;
        this.minimumSearchRange = i3;
        this.seekMap = new androidx.media3.extractor.BinarySearchSeeker.BinarySearchSeekMap(seekTimestampConverter, j, j9, j10, j11, j12, j13);
    }

    public androidx.media3.extractor.BinarySearchSeeker.SeekOperationParams createSeekParamsForTargetTimeUs(long j) {
        return new androidx.media3.extractor.BinarySearchSeeker.SeekOperationParams(j, this.seekMap.timeUsToTargetTime(j), this.seekMap.floorTimePosition, this.seekMap.ceilingTimePosition, this.seekMap.floorBytePosition, this.seekMap.ceilingBytePosition, this.seekMap.approxBytesPerFrame);
    }

    public final androidx.media3.extractor.SeekMap getSeekMap() {
        return this.seekMap;
    }

    public int handlePendingSeek(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) {
        while (true) {
            androidx.media3.extractor.BinarySearchSeeker.SeekOperationParams seekOperationParams = this.seekOperationParams;
            seekOperationParams.getClass();
            long floorBytePosition = seekOperationParams.getFloorBytePosition();
            long ceilingBytePosition = seekOperationParams.getCeilingBytePosition();
            long nextSearchBytePosition = seekOperationParams.getNextSearchBytePosition();
            if (ceilingBytePosition - floorBytePosition <= this.minimumSearchRange) {
                markSeekOperationFinished(false, floorBytePosition);
                return seekToPosition(extractorInput, floorBytePosition, positionHolder);
            }
            if (!skipInputUntilPosition(extractorInput, nextSearchBytePosition)) {
                return seekToPosition(extractorInput, nextSearchBytePosition, positionHolder);
            }
            extractorInput.resetPeekPosition();
            androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult timestampSearchResultSearchForTimestamp = this.timestampSeeker.searchForTimestamp(extractorInput, seekOperationParams.getTargetTimePosition());
            int i3 = timestampSearchResultSearchForTimestamp.type;
            if (i3 == -3) {
                markSeekOperationFinished(false, nextSearchBytePosition);
                return seekToPosition(extractorInput, nextSearchBytePosition, positionHolder);
            }
            if (i3 == -2) {
                seekOperationParams.updateSeekFloor(timestampSearchResultSearchForTimestamp.timestampToUpdate, timestampSearchResultSearchForTimestamp.bytePositionToUpdate);
            } else {
                if (i3 != -1) {
                    if (i3 != 0) {
                        throw new java.lang.IllegalStateException("Invalid case");
                    }
                    skipInputUntilPosition(extractorInput, timestampSearchResultSearchForTimestamp.bytePositionToUpdate);
                    markSeekOperationFinished(true, timestampSearchResultSearchForTimestamp.bytePositionToUpdate);
                    return seekToPosition(extractorInput, timestampSearchResultSearchForTimestamp.bytePositionToUpdate, positionHolder);
                }
                seekOperationParams.updateSeekCeiling(timestampSearchResultSearchForTimestamp.timestampToUpdate, timestampSearchResultSearchForTimestamp.bytePositionToUpdate);
            }
        }
    }

    public final boolean isSeeking() {
        return this.seekOperationParams != null;
    }

    public final void markSeekOperationFinished(boolean z6, long j) {
        this.seekOperationParams = null;
        this.timestampSeeker.onSeekFinished();
        onSeekOperationFinished(z6, j);
    }

    public void onSeekOperationFinished(boolean z6, long j) {
    }

    public final int seekToPosition(androidx.media3.extractor.ExtractorInput extractorInput, long j, androidx.media3.extractor.PositionHolder positionHolder) {
        if (j == extractorInput.getPosition()) {
            return 0;
        }
        positionHolder.position = j;
        return 1;
    }

    public final void setSeekTargetUs(long j) {
        androidx.media3.extractor.BinarySearchSeeker.SeekOperationParams seekOperationParams = this.seekOperationParams;
        if (seekOperationParams == null || seekOperationParams.getSeekTimeUs() != j) {
            this.seekOperationParams = createSeekParamsForTargetTimeUs(j);
        }
    }

    public final boolean skipInputUntilPosition(androidx.media3.extractor.ExtractorInput extractorInput, long j) {
        long position = j - extractorInput.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        extractorInput.skipFully((int) position);
        return true;
    }
}
