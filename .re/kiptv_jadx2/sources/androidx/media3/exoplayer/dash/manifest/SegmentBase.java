package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import p091k4.a;

public abstract class SegmentBase {
    final RangedUri initialization;
    final long presentationTimeOffset;
    final long timescale;

    public static abstract class MultiSegmentBase extends SegmentBase {
        final long availabilityTimeOffsetUs;
        final long duration;
        private final long periodStartUnixTimeUs;
        final List<SegmentTimelineElement> segmentTimeline;
        final long startNumber;
        private final long timeShiftBufferDepthUs;

        public MultiSegmentBase(RangedUri rangedUri, long j, long j9, long j10, long j11, List<SegmentTimelineElement> list, long j12, long j13, long j14) {
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
                if (j10 != C.TIME_UNSET) {
                    return Math.max(getFirstSegmentNum(), getSegmentNum((j9 - this.periodStartUnixTimeUs) - j10, j));
                }
            }
            return getFirstSegmentNum();
        }

        public long getFirstSegmentNum() {
            return this.startNumber;
        }

        public long getNextSegmentAvailableTimeUs(long j, long j9) {
            if (this.segmentTimeline != null) {
                return C.TIME_UNSET;
            }
            long availableSegmentCount = getAvailableSegmentCount(j, j9) + getFirstAvailableSegmentNum(j, j9);
            return (getSegmentDurationUs(availableSegmentCount, j) + getSegmentTimeUs(availableSegmentCount)) - this.availabilityTimeOffsetUs;
        }

        public abstract long getSegmentCount(long j);

        public final long getSegmentDurationUs(long j, long j9) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
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
                    return segmentCount == -1 ? j13 : Math.min(j13, (firstSegmentNum + segmentCount) - 1);
                }
            }
            return firstSegmentNum;
        }

        public final long getSegmentTimeUs(long j) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            return Util.scaleLargeTimestamp(list != null ? list.get((int) (j - this.startNumber)).startTime - this.presentationTimeOffset : (j - this.startNumber) * this.duration, 1000000L, this.timescale);
        }

        public abstract RangedUri getSegmentUrl(Representation representation, long j);

        public boolean isExplicit() {
            return this.segmentTimeline != null;
        }
    }

    public static final class SegmentList extends MultiSegmentBase {
        final List<RangedUri> mediaSegments;

        public SegmentList(RangedUri rangedUri, long j, long j9, long j10, long j11, List<SegmentTimelineElement> list, long j12, List<RangedUri> list2, long j13, long j14) {
            super(rangedUri, j, j9, j10, j11, list, j12, j13, j14);
            this.mediaSegments = list2;
        }

        @Override
        public long getSegmentCount(long j) {
            return this.mediaSegments.size();
        }

        @Override
        public RangedUri getSegmentUrl(Representation representation, long j) {
            return this.mediaSegments.get((int) (j - this.startNumber));
        }

        @Override
        public boolean isExplicit() {
            return true;
        }
    }

    public static final class SegmentTemplate extends MultiSegmentBase {
        final long endNumber;
        final UrlTemplate initializationTemplate;
        final UrlTemplate mediaTemplate;

        public SegmentTemplate(RangedUri rangedUri, long j, long j9, long j10, long j11, long j12, List<SegmentTimelineElement> list, long j13, UrlTemplate urlTemplate, UrlTemplate urlTemplate2, long j14, long j15) {
            super(rangedUri, j, j9, j10, j12, list, j13, j14, j15);
            this.initializationTemplate = urlTemplate;
            this.mediaTemplate = urlTemplate2;
            this.endNumber = j11;
        }

        @Override
        public RangedUri getInitialization(Representation representation) {
            UrlTemplate urlTemplate = this.initializationTemplate;
            if (urlTemplate == null) {
                return super.getInitialization(representation);
            }
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.id, 0L, format.bitrate, 0L), 0L, -1L);
        }

        @Override
        public long getSegmentCount(long j) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            if (list != null) {
                return list.size();
            }
            long j9 = this.endNumber;
            if (j9 != -1) {
                return (j9 - this.startNumber) + 1;
            }
            if (j == C.TIME_UNSET) {
                return -1L;
            }
            BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.timescale));
            BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.duration).multiply(BigInteger.valueOf(1000000L));
            RoundingMode roundingMode = RoundingMode.CEILING;
            int i3 = a.f24481a;
            return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
        }

        @Override
        public RangedUri getSegmentUrl(Representation representation, long j) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            long j9 = list != null ? list.get((int) (j - this.startNumber)).startTime : (j - this.startNumber) * this.duration;
            UrlTemplate urlTemplate = this.mediaTemplate;
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.id, j, format.bitrate, j9), 0L, -1L);
        }
    }

    public static final class SegmentTimelineElement {
        final long duration;
        final long startTime;

        public SegmentTimelineElement(long j, long j9) {
            this.startTime = j;
            this.duration = j9;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SegmentTimelineElement.class == obj.getClass()) {
                SegmentTimelineElement segmentTimelineElement = (SegmentTimelineElement) obj;
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

    public SegmentBase(RangedUri rangedUri, long j, long j9) {
        this.initialization = rangedUri;
        this.timescale = j;
        this.presentationTimeOffset = j9;
    }

    public RangedUri getInitialization(Representation representation) {
        return this.initialization;
    }

    public long getPresentationTimeOffsetUs() {
        return Util.scaleLargeTimestamp(this.presentationTimeOffset, 1000000L, this.timescale);
    }

    public static class SingleSegmentBase extends SegmentBase {
        final long indexLength;
        final long indexStart;

        public SingleSegmentBase(RangedUri rangedUri, long j, long j9, long j10, long j11) {
            super(rangedUri, j, j9);
            this.indexStart = j10;
            this.indexLength = j11;
        }

        public RangedUri getIndex() {
            long j = this.indexLength;
            if (j <= 0) {
                return null;
            }
            return new RangedUri(null, this.indexStart, j);
        }

        public SingleSegmentBase() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
