package androidx.media3.extractor.metadata.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class SlowMotionData implements androidx.media3.common.Metadata.Entry {
    public final java.util.List<androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment> segments;

    public static final class Segment {
        public static final java.util.Comparator<androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment> BY_START_THEN_END_THEN_DIVISOR = new A1.b(7);
        public final long endTimeMs;
        public final int speedDivisor;
        public final long startTimeMs;

        public Segment(long j, long j9, int i3) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j < j9);
            this.startTimeMs = j;
            this.endTimeMs = j9;
            this.speedDivisor = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment segment, androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment segment2) {
            return p076i4.J.f22802a.b(segment.startTimeMs, segment2.startTimeMs).b(segment.endTimeMs, segment2.endTimeMs).a(segment.speedDivisor, segment2.speedDivisor).f();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment.class == obj.getClass()) {
                androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment segment = (androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment) obj;
                if (this.startTimeMs == segment.startTimeMs && this.endTimeMs == segment.endTimeMs && this.speedDivisor == segment.speedDivisor) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return java.util.Objects.hash(java.lang.Long.valueOf(this.startTimeMs), java.lang.Long.valueOf(this.endTimeMs), java.lang.Integer.valueOf(this.speedDivisor));
        }

        public java.lang.String toString() {
            return androidx.media3.common.util.Util.formatInvariant("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", java.lang.Long.valueOf(this.startTimeMs), java.lang.Long.valueOf(this.endTimeMs), java.lang.Integer.valueOf(this.speedDivisor));
        }
    }

    public SlowMotionData(java.util.List<androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment> list) {
        this.segments = list;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(!doSegmentsOverlap(list));
    }

    private static boolean doSegmentsOverlap(java.util.List<androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).endTimeMs;
        for (int i3 = 1; i3 < list.size(); i3++) {
            if (list.get(i3).startTimeMs < j) {
                return true;
            }
            j = list.get(i3).endTimeMs;
        }
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.media3.extractor.metadata.mp4.SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.segments.equals(((androidx.media3.extractor.metadata.mp4.SlowMotionData) obj).segments);
    }

    public int hashCode() {
        return this.segments.hashCode();
    }

    public java.lang.String toString() {
        return "SlowMotion: segments=" + this.segments;
    }
}
