package androidx.media3.extractor;

import androidx.media3.common.C;
import androidx.media3.common.util.Util;

public abstract class BinarySearchSeeker {
    private static final long MAX_SKIP_BYTES = 262144;
    private final int minimumSearchRange;
    protected final BinarySearchSeekMap seekMap;
    protected SeekOperationParams seekOperationParams;
    protected final TimestampSeeker timestampSeeker;

    public static class BinarySearchSeekMap implements SeekMap {
        private final long approxBytesPerFrame;
        private final long ceilingBytePosition;
        private final long ceilingTimePosition;
        private final long durationUs;
        private final long floorBytePosition;
        private final long floorTimePosition;
        private final SeekTimestampConverter seekTimestampConverter;

        public BinarySearchSeekMap(SeekTimestampConverter seekTimestampConverter, long j, long j9, long j10, long j11, long j12, long j13) {
            this.seekTimestampConverter = seekTimestampConverter;
            this.durationUs = j;
            this.floorTimePosition = j9;
            this.ceilingTimePosition = j10;
            this.floorBytePosition = j11;
            this.ceilingBytePosition = j12;
            this.approxBytesPerFrame = j13;
        }

        @Override
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override
        public SeekMap.SeekPoints getSeekPoints(long j) {
            return new SeekMap.SeekPoints(new SeekPoint(j, SeekOperationParams.calculateNextSearchBytePosition(this.seekTimestampConverter.timeUsToTargetTime(j), this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame)));
        }

        @Override
        public boolean isSeekable() {
            return true;
        }

        public long timeUsToTargetTime(long j) {
            return this.seekTimestampConverter.timeUsToTargetTime(j);
        }
    }

    public static final class DefaultSeekTimestampConverter implements SeekTimestampConverter {
        @Override
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
            return Util.constrainValue(((j14 + j11) - j13) - (j14 / 20), j11, j12 - 1);
        }

        public long getCeilingBytePosition() {
            return this.ceilingBytePosition;
        }

        public long getFloorBytePosition() {
            return this.floorBytePosition;
        }

        public long getNextSearchBytePosition() {
            return this.nextSearchBytePosition;
        }

        public long getSeekTimeUs() {
            return this.seekTimeUs;
        }

        public long getTargetTimePosition() {
            return this.targetTimePosition;
        }

        private void updateNextSearchBytePosition() {
            this.nextSearchBytePosition = calculateNextSearchBytePosition(this.targetTimePosition, this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame);
        }

        public void updateSeekCeiling(long j, long j9) {
            this.ceilingTimePosition = j;
            this.ceilingBytePosition = j9;
            updateNextSearchBytePosition();
        }

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
        public static final TimestampSearchResult NO_TIMESTAMP_IN_RANGE_RESULT = new TimestampSearchResult(-3, C.TIME_UNSET, -1);
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

        public static TimestampSearchResult overestimatedResult(long j, long j9) {
            return new TimestampSearchResult(-1, j, j9);
        }

        public static TimestampSearchResult targetFoundResult(long j) {
            return new TimestampSearchResult(0, C.TIME_UNSET, j);
        }

        public static TimestampSearchResult underestimatedResult(long j, long j9) {
            return new TimestampSearchResult(-2, j, j9);
        }
    }

    public interface TimestampSeeker {
        default void onSeekFinished() {
        }

        TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j);
    }

    public BinarySearchSeeker(SeekTimestampConverter seekTimestampConverter, TimestampSeeker timestampSeeker, long j, long j9, long j10, long j11, long j12, long j13, int i3) {
        this.timestampSeeker = timestampSeeker;
        this.minimumSearchRange = i3;
        this.seekMap = new BinarySearchSeekMap(seekTimestampConverter, j, j9, j10, j11, j12, j13);
    }

    public SeekOperationParams createSeekParamsForTargetTimeUs(long j) {
        return new SeekOperationParams(j, this.seekMap.timeUsToTargetTime(j), this.seekMap.floorTimePosition, this.seekMap.ceilingTimePosition, this.seekMap.floorBytePosition, this.seekMap.ceilingBytePosition, this.seekMap.approxBytesPerFrame);
    }

    public final SeekMap getSeekMap() {
        return this.seekMap;
    }

    public int handlePendingSeek(ExtractorInput extractorInput, PositionHolder positionHolder) {
        while (true) {
            SeekOperationParams seekOperationParams = this.seekOperationParams;
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
            TimestampSearchResult timestampSearchResultSearchForTimestamp = this.timestampSeeker.searchForTimestamp(extractorInput, seekOperationParams.getTargetTimePosition());
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
                        throw new IllegalStateException("Invalid case");
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

    public final int seekToPosition(ExtractorInput extractorInput, long j, PositionHolder positionHolder) {
        if (j == extractorInput.getPosition()) {
            return 0;
        }
        positionHolder.position = j;
        return 1;
    }

    public final void setSeekTargetUs(long j) {
        SeekOperationParams seekOperationParams = this.seekOperationParams;
        if (seekOperationParams == null || seekOperationParams.getSeekTimeUs() != j) {
            this.seekOperationParams = createSeekParamsForTargetTimeUs(j);
        }
    }

    public final boolean skipInputUntilPosition(ExtractorInput extractorInput, long j) {
        long position = j - extractorInput.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        extractorInput.skipFully((int) position);
        return true;
    }
}
