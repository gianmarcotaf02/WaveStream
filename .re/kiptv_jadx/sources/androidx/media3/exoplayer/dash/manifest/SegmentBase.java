package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public abstract class SegmentBase {
    final androidx.media3.exoplayer.dash.manifest.RangedUri initialization;
    final long presentationTimeOffset;
    final long timescale;

    public static abstract class MultiSegmentBase extends androidx.media3.exoplayer.dash.manifest.SegmentBase {
        final long availabilityTimeOffsetUs;
        final long duration;
        private final long periodStartUnixTimeUs;
        final java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> segmentTimeline;
        final long startNumber;
        private final long timeShiftBufferDepthUs;

        public MultiSegmentBase(androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri, long j, long j9, long j10, long j11, java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> list, long j12, long j13, long j14) {
            super(rangedUri, j, j9);
            this.startNumber = j10;
            this.duration = j11;
            this.segmentTimeline = list;
            this.availabilityTimeOffsetUs = j12;
            this.timeShiftBufferDepthUs = j13;
            this.periodStartUnixTimeUs = j14;
        }

        public long getAvailableSegmentCount(long j, long j9) {
            long segmentCount = getSegmentCount(j);
            return segmentCount != -1 ? segmentCount : (int) (getSegmentNum((j9 - this.periodStartUnixTimeUs) + this.availabilityTimeOffsetUs, j) - getFirstAvailableSegmentNum(j, j9));
        }

        public long getFirstAvailableSegmentNum(long j, long j9) {
            if (getSegmentCount(j) == -1) {
                long j10 = this.timeShiftBufferDepthUs;
                if (j10 != androidx.media3.common.C.TIME_UNSET) {
                    return java.lang.Math.max(getFirstSegmentNum(), getSegmentNum((j9 - this.periodStartUnixTimeUs) - j10, j));
                }
            }
            return getFirstSegmentNum();
        }

        public long getFirstSegmentNum() {
            return this.startNumber;
        }

        public long getNextSegmentAvailableTimeUs(long j, long j9) {
            if (this.segmentTimeline != null) {
                return androidx.media3.common.C.TIME_UNSET;
            }
            long availableSegmentCount = getAvailableSegmentCount(j, j9) + getFirstAvailableSegmentNum(j, j9);
            return (getSegmentDurationUs(availableSegmentCount, j) + getSegmentTimeUs(availableSegmentCount)) - this.availabilityTimeOffsetUs;
        }

        public abstract long getSegmentCount(long j);

        public final long getSegmentDurationUs(long j, long j9) {
            java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> list = this.segmentTimeline;
            if (list != null) {
                return (list.get((int) (j - this.startNumber)).duration * 1000000) / this.timescale;
            }
            long segmentCount = getSegmentCount(j9);
            return (segmentCount == -1 || j != (getFirstSegmentNum() + segmentCount) - 1) ? (this.duration * 1000000) / this.timescale : j9 - getSegmentTimeUs(j);
        }

        public long getSegmentNum(long j, long j9) {
            long firstSegmentNum = getFirstSegmentNum();
            long segmentCount = getSegmentCount(j9);
            if (segmentCount != 0) {
                if (this.segmentTimeline != null) {
                    long j10 = (segmentCount + firstSegmentNum) - 1;
                    long j11 = firstSegmentNum;
                    while (j11 <= j10) {
                        long j12 = ((j10 - j11) / 2) + j11;
                        long segmentTimeUs = getSegmentTimeUs(j12);
                        if (segmentTimeUs < j) {
                            j11 = j12 + 1;
                        } else {
                            if (segmentTimeUs <= j) {
                                return j12;
                            }
                            j10 = j12 - 1;
                        }
                    }
                    return j11 == firstSegmentNum ? j11 : j10;
                }
                long j13 = (j / ((this.duration * 1000000) / this.timescale)) + this.startNumber;
                if (j13 >= firstSegmentNum) {
                    return segmentCount == -1 ? j13 : java.lang.Math.min(j13, (firstSegmentNum + segmentCount) - 1);
                }
            }
            return firstSegmentNum;
        }

        public final long getSegmentTimeUs(long j) {
            java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> list = this.segmentTimeline;
            return androidx.media3.common.util.Util.scaleLargeTimestamp(list != null ? list.get((int) (j - this.startNumber)).startTime - this.presentationTimeOffset : (j - this.startNumber) * this.duration, 1000000L, this.timescale);
        }

        public abstract androidx.media3.exoplayer.dash.manifest.RangedUri getSegmentUrl(androidx.media3.exoplayer.dash.manifest.Representation representation, long j);

        public boolean isExplicit() {
            return this.segmentTimeline != null;
        }
    }

    public static final class SegmentList extends androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase {
        final java.util.List<androidx.media3.exoplayer.dash.manifest.RangedUri> mediaSegments;

        public SegmentList(androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri, long j, long j9, long j10, long j11, java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> list, long j12, java.util.List<androidx.media3.exoplayer.dash.manifest.RangedUri> list2, long j13, long j14) {
            super(rangedUri, j, j9, j10, j11, list, j12, j13, j14);
            this.mediaSegments = list2;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long j) {
            return this.mediaSegments.size();
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public androidx.media3.exoplayer.dash.manifest.RangedUri getSegmentUrl(androidx.media3.exoplayer.dash.manifest.Representation representation, long j) {
            return this.mediaSegments.get((int) (j - this.startNumber));
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public boolean isExplicit() {
            return true;
        }
    }

    public static final class SegmentTemplate extends androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase {
        final long endNumber;
        final androidx.media3.exoplayer.dash.manifest.UrlTemplate initializationTemplate;
        final androidx.media3.exoplayer.dash.manifest.UrlTemplate mediaTemplate;

        public SegmentTemplate(androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri, long j, long j9, long j10, long j11, long j12, java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> list, long j13, androidx.media3.exoplayer.dash.manifest.UrlTemplate urlTemplate, androidx.media3.exoplayer.dash.manifest.UrlTemplate urlTemplate2, long j14, long j15) {
            super(rangedUri, j, j9, j10, j12, list, j13, j14, j15);
            this.initializationTemplate = urlTemplate;
            this.mediaTemplate = urlTemplate2;
            this.endNumber = j11;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase
        public androidx.media3.exoplayer.dash.manifest.RangedUri getInitialization(androidx.media3.exoplayer.dash.manifest.Representation representation) {
            androidx.media3.exoplayer.dash.manifest.UrlTemplate urlTemplate = this.initializationTemplate;
            if (urlTemplate == null) {
                return super.getInitialization(representation);
            }
            androidx.media3.common.Format format = representation.format;
            return new androidx.media3.exoplayer.dash.manifest.RangedUri(urlTemplate.buildUri(format.id, 0L, format.bitrate, 0L), 0L, -1L);
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long j) {
            java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> list = this.segmentTimeline;
            if (list != null) {
                return list.size();
            }
            long j9 = this.endNumber;
            if (j9 != -1) {
                return (j9 - this.startNumber) + 1;
            }
            if (j == androidx.media3.common.C.TIME_UNSET) {
                return -1L;
            }
            java.math.BigInteger bigIntegerMultiply = java.math.BigInteger.valueOf(j).multiply(java.math.BigInteger.valueOf(this.timescale));
            java.math.BigInteger bigIntegerMultiply2 = java.math.BigInteger.valueOf(this.duration).multiply(java.math.BigInteger.valueOf(1000000L));
            java.math.RoundingMode roundingMode = java.math.RoundingMode.CEILING;
            int i3 = p091k4.a.f24481a;
            return new java.math.BigDecimal(bigIntegerMultiply).divide(new java.math.BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public androidx.media3.exoplayer.dash.manifest.RangedUri getSegmentUrl(androidx.media3.exoplayer.dash.manifest.Representation representation, long j) {
            java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> list = this.segmentTimeline;
            long j9 = list != null ? list.get((int) (j - this.startNumber)).startTime : (j - this.startNumber) * this.duration;
            androidx.media3.exoplayer.dash.manifest.UrlTemplate urlTemplate = this.mediaTemplate;
            androidx.media3.common.Format format = representation.format;
            return new androidx.media3.exoplayer.dash.manifest.RangedUri(urlTemplate.buildUri(format.id, j, format.bitrate, j9), 0L, -1L);
        }
    }

    public static final class SegmentTimelineElement {
        final long duration;
        final long startTime;

        public SegmentTimelineElement(long j, long j9) {
            this.startTime = j;
            this.duration = j9;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement.class == obj.getClass()) {
                androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement segmentTimelineElement = (androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement) obj;
                if (this.startTime == segmentTimelineElement.startTime && this.duration == segmentTimelineElement.duration) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.startTime) * 31) + ((int) this.duration);
        }
    }

    public SegmentBase(androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri, long j, long j9) {
        this.initialization = rangedUri;
        this.timescale = j;
        this.presentationTimeOffset = j9;
    }

    public androidx.media3.exoplayer.dash.manifest.RangedUri getInitialization(androidx.media3.exoplayer.dash.manifest.Representation representation) {
        return this.initialization;
    }

    public long getPresentationTimeOffsetUs() {
        return androidx.media3.common.util.Util.scaleLargeTimestamp(this.presentationTimeOffset, 1000000L, this.timescale);
    }

    public static class SingleSegmentBase extends androidx.media3.exoplayer.dash.manifest.SegmentBase {
        final long indexLength;
        final long indexStart;

        public SingleSegmentBase(androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri, long j, long j9, long j10, long j11) {
            super(rangedUri, j, j9);
            this.indexStart = j10;
            this.indexLength = j11;
        }

        public androidx.media3.exoplayer.dash.manifest.RangedUri getIndex() {
            long j = this.indexLength;
            if (j <= 0) {
                return null;
            }
            return new androidx.media3.exoplayer.dash.manifest.RangedUri(null, this.indexStart, j);
        }

        public SingleSegmentBase() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
