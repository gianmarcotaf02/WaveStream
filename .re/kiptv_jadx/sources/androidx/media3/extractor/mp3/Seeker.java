package androidx.media3.extractor.mp3;

/* JADX INFO: loaded from: classes.dex */
interface Seeker extends androidx.media3.extractor.SeekMap {

    public static class UnseekableSeeker extends androidx.media3.extractor.SeekMap.Unseekable implements androidx.media3.extractor.mp3.Seeker {
        public UnseekableSeeker() {
            super(androidx.media3.common.C.TIME_UNSET);
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public int getAverageBitrate() {
            return androidx.media3.common.C.RATE_UNSET_INT;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public long getDataEndPosition() {
            return -1L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public long getDataStartPosition() {
            return 0L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public long getTimeUs(long j) {
            return 0L;
        }
    }

    int getAverageBitrate();

    long getDataEndPosition();

    long getDataStartPosition();

    long getTimeUs(long j);
}
