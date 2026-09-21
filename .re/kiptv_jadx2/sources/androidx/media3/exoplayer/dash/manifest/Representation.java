package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.Collections;
import java.util.List;
import p076i4.AbstractC2186b0;
import p076i4.S0;
import p076i4.Z;

public abstract class Representation {
    public static final long REVISION_ID_DEFAULT = -1;
    public final AbstractC2186b0 baseUrls;
    public final List<Descriptor> essentialProperties;
    public final Format format;
    public final List<Descriptor> inbandEventStreams;
    private final RangedUri initializationUri;
    public final long presentationTimeOffsetUs;
    public final long revisionId;
    public final List<Descriptor> supplementalProperties;

    public static class MultiSegmentRepresentation extends Representation implements DashSegmentIndex {
        final SegmentBase.MultiSegmentBase segmentBase;

        public MultiSegmentRepresentation(long j, Format format, List<BaseUrl> list, SegmentBase.MultiSegmentBase multiSegmentBase, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
            super(j, format, list, multiSegmentBase, list2, list3, list4);
            this.segmentBase = multiSegmentBase;
        }

        @Override
        public long getAvailableSegmentCount(long j, long j9) {
            return this.segmentBase.getAvailableSegmentCount(j, j9);
        }

        @Override
        public String getCacheKey() {
            return null;
        }

        @Override
        public long getDurationUs(long j, long j9) {
            return this.segmentBase.getSegmentDurationUs(j, j9);
        }

        @Override
        public long getFirstAvailableSegmentNum(long j, long j9) {
            return this.segmentBase.getFirstAvailableSegmentNum(j, j9);
        }

        @Override
        public long getFirstSegmentNum() {
            return this.segmentBase.getFirstSegmentNum();
        }

        @Override
        public DashSegmentIndex getIndex() {
            return this;
        }

        @Override
        public RangedUri getIndexUri() {
            return null;
        }

        @Override
        public long getNextSegmentAvailableTimeUs(long j, long j9) {
            return this.segmentBase.getNextSegmentAvailableTimeUs(j, j9);
        }

        @Override
        public long getSegmentCount(long j) {
            return this.segmentBase.getSegmentCount(j);
        }

        @Override
        public long getSegmentNum(long j, long j9) {
            return this.segmentBase.getSegmentNum(j, j9);
        }

        @Override
        public RangedUri getSegmentUrl(long j) {
            return this.segmentBase.getSegmentUrl(this, j);
        }

        @Override
        public long getTimeUs(long j) {
            return this.segmentBase.getSegmentTimeUs(j);
        }

        @Override
        public boolean isExplicit() {
            return this.segmentBase.isExplicit();
        }
    }

    public static class SingleSegmentRepresentation extends Representation {
        private final String cacheKey;
        public final long contentLength;
        private final RangedUri indexUri;
        private final SingleSegmentIndex segmentIndex;
        public final Uri uri;

        public SingleSegmentRepresentation(long j, Format format, List<BaseUrl> list, SegmentBase.SingleSegmentBase singleSegmentBase, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4, String str, long j9) {
            super(j, format, list, singleSegmentBase, list2, list3, list4);
            this.uri = Uri.parse(list.get(0).url);
            RangedUri index = singleSegmentBase.getIndex();
            this.indexUri = index;
            this.cacheKey = str;
            this.contentLength = j9;
            this.segmentIndex = index != null ? null : new SingleSegmentIndex(new RangedUri(null, 0L, j9));
        }

        public static SingleSegmentRepresentation newInstance(long j, Format format, String str, long j9, long j10, long j11, long j12, List<Descriptor> list, String str2, long j13) {
            SegmentBase.SingleSegmentBase singleSegmentBase = new SegmentBase.SingleSegmentBase(new RangedUri(null, j9, (j10 - j9) + 1), 1L, 0L, j11, (j12 - j11) + 1);
            S0 s0Y = AbstractC2186b0.y(new BaseUrl(str));
            S0 s9 = S0.f22832l;
            return new SingleSegmentRepresentation(j, format, s0Y, singleSegmentBase, list, s9, s9, str2, j13);
        }

        @Override
        public String getCacheKey() {
            return this.cacheKey;
        }

        @Override
        public DashSegmentIndex getIndex() {
            return this.segmentIndex;
        }

        @Override
        public RangedUri getIndexUri() {
            return this.indexUri;
        }
    }

    public static Representation newInstance(long j, Format format, List<BaseUrl> list, SegmentBase segmentBase) {
        Z z6 = AbstractC2186b0.f22868i;
        S0 s9 = S0.f22832l;
        return newInstance(j, format, list, segmentBase, null, s9, s9, null);
    }

    public abstract String getCacheKey();

    public abstract DashSegmentIndex getIndex();

    public abstract RangedUri getIndexUri();

    public RangedUri getInitializationUri() {
        return this.initializationUri;
    }

    private Representation(long j, Format format, List<BaseUrl> list, SegmentBase segmentBase, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
        AbstractC1864o0.L(!list.isEmpty());
        this.revisionId = j;
        this.format = format;
        this.baseUrls = AbstractC2186b0.u(list);
        this.inbandEventStreams = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.essentialProperties = list3;
        this.supplementalProperties = list4;
        this.initializationUri = segmentBase.getInitialization(this);
        this.presentationTimeOffsetUs = segmentBase.getPresentationTimeOffsetUs();
    }

    public static Representation newInstance(long j, Format format, List<BaseUrl> list, SegmentBase segmentBase, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4, String str) {
        if (segmentBase instanceof SegmentBase.SingleSegmentBase) {
            return new SingleSegmentRepresentation(j, format, list, (SegmentBase.SingleSegmentBase) segmentBase, list2, list3, list4, str, -1L);
        }
        if (segmentBase instanceof SegmentBase.MultiSegmentBase) {
            return new MultiSegmentRepresentation(j, format, list, (SegmentBase.MultiSegmentBase) segmentBase, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }
}
