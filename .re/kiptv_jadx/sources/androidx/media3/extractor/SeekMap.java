package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public interface SeekMap {

    public static final class SeekPoints {
        public final androidx.media3.extractor.SeekPoint first;
        public final androidx.media3.extractor.SeekPoint second;

        public SeekPoints(androidx.media3.extractor.SeekPoint seekPoint) {
            this(seekPoint, seekPoint);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && androidx.media3.extractor.SeekMap.SeekPoints.class == obj.getClass()) {
                androidx.media3.extractor.SeekMap.SeekPoints seekPoints = (androidx.media3.extractor.SeekMap.SeekPoints) obj;
                if (this.first.equals(seekPoints.first) && this.second.equals(seekPoints.second)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.second.hashCode() + (this.first.hashCode() * 31);
        }

        public java.lang.String toString() {
            java.lang.String str;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(this.first);
            if (this.first.equals(this.second)) {
                str = "";
            } else {
                str = ", " + this.second;
            }
            return Y6.f.m(sb, str, "]");
        }

        public SeekPoints(androidx.media3.extractor.SeekPoint seekPoint, androidx.media3.extractor.SeekPoint seekPoint2) {
            seekPoint.getClass();
            this.first = seekPoint;
            seekPoint2.getClass();
            this.second = seekPoint2;
        }
    }

    public static class Unseekable implements androidx.media3.extractor.SeekMap {
        private final long durationUs;
        private final androidx.media3.extractor.SeekMap.SeekPoints startSeekPoints;

        public Unseekable(long j) {
            this(j, 0L);
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // androidx.media3.extractor.SeekMap
        public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
            return this.startSeekPoints;
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return false;
        }

        public Unseekable(long j, long j9) {
            this.durationUs = j;
            this.startSeekPoints = new androidx.media3.extractor.SeekMap.SeekPoints(j9 == 0 ? androidx.media3.extractor.SeekPoint.START : new androidx.media3.extractor.SeekPoint(0L, j9));
        }
    }

    long getDurationUs();

    androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j);

    default boolean isEstimated() {
        return false;
    }

    boolean isSeekable();
}
