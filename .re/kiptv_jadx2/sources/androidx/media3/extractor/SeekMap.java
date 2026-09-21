package androidx.media3.extractor;

import Y6.f;

public interface SeekMap {

    public static final class SeekPoints {
        public final SeekPoint first;
        public final SeekPoint second;

        public SeekPoints(SeekPoint seekPoint) {
            this(seekPoint, seekPoint);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SeekPoints.class == obj.getClass()) {
                SeekPoints seekPoints = (SeekPoints) obj;
                if (this.first.equals(seekPoints.first) && this.second.equals(seekPoints.second)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.second.hashCode() + (this.first.hashCode() * 31);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.first);
            if (this.first.equals(this.second)) {
                str = "";
            } else {
                str = ", " + this.second;
            }
            return f.m(sb, str, "]");
        }

        public SeekPoints(SeekPoint seekPoint, SeekPoint seekPoint2) {
            seekPoint.getClass();
            this.first = seekPoint;
            seekPoint2.getClass();
            this.second = seekPoint2;
        }
    }

    public static class Unseekable implements SeekMap {
        private final long durationUs;
        private final SeekPoints startSeekPoints;

        public Unseekable(long j) {
            this(j, 0L);
        }

        @Override
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override
        public SeekPoints getSeekPoints(long j) {
            return this.startSeekPoints;
        }

        @Override
        public boolean isSeekable() {
            return false;
        }

        public Unseekable(long j, long j9) {
            this.durationUs = j;
            this.startSeekPoints = new SeekPoints(j9 == 0 ? SeekPoint.START : new SeekPoint(0L, j9));
        }
    }

    long getDurationUs();

    SeekPoints getSeekPoints(long j);

    default boolean isEstimated() {
        return false;
    }

    boolean isSeekable();
}
