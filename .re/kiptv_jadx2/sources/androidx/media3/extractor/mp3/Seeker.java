package androidx.media3.extractor.mp3;

import androidx.media3.common.C;
import androidx.media3.extractor.SeekMap;

interface Seeker extends SeekMap {

    public static class UnseekableSeeker extends SeekMap.Unseekable implements Seeker {
        public UnseekableSeeker() {
            super(C.TIME_UNSET);
        }

        @Override
        public int getAverageBitrate() {
            return C.RATE_UNSET_INT;
        }

        @Override
        public long getDataEndPosition() {
            return -1L;
        }

        @Override
        public long getDataStartPosition() {
            return 0L;
        }

        @Override
        public long getTimeUs(long j) {
            return 0L;
        }
    }

    int getAverageBitrate();

    long getDataEndPosition();

    long getDataStartPosition();

    long getTimeUs(long j);
}
