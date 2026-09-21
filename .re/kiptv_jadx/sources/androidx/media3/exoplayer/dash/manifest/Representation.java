package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public abstract class Representation {
    public static final long REVISION_ID_DEFAULT = -1;
    public final p076i4.AbstractC2186b0 baseUrls;
    public final java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> essentialProperties;
    public final androidx.media3.common.Format format;
    public final java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> inbandEventStreams;
    private final androidx.media3.exoplayer.dash.manifest.RangedUri initializationUri;
    public final long presentationTimeOffsetUs;
    public final long revisionId;
    public final java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> supplementalProperties;

    public static class MultiSegmentRepresentation extends androidx.media3.exoplayer.dash.manifest.Representation implements androidx.media3.exoplayer.dash.DashSegmentIndex {
        final androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase segmentBase;

        public MultiSegmentRepresentation(long j, androidx.media3.common.Format format, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list, androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase multiSegmentBase, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list2, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list3, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list4) {
            super(j, format, list, multiSegmentBase, list2, list3, list4);
            this.segmentBase = multiSegmentBase;
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getAvailableSegmentCount(long j, long j9) {
            return this.segmentBase.getAvailableSegmentCount(j, j9);
        }

        @Override // androidx.media3.exoplayer.dash.manifest.Representation
        public java.lang.String getCacheKey() {
            return null;
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getDurationUs(long j, long j9) {
            return this.segmentBase.getSegmentDurationUs(j, j9);
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getFirstAvailableSegmentNum(long j, long j9) {
            return this.segmentBase.getFirstAvailableSegmentNum(j, j9);
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getFirstSegmentNum() {
            return this.segmentBase.getFirstSegmentNum();
        }

        @Override // androidx.media3.exoplayer.dash.manifest.Representation
        public androidx.media3.exoplayer.dash.DashSegmentIndex getIndex() {
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.Representation
        public androidx.media3.exoplayer.dash.manifest.RangedUri getIndexUri() {
            return null;
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getNextSegmentAvailableTimeUs(long j, long j9) {
            return this.segmentBase.getNextSegmentAvailableTimeUs(j, j9);
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getSegmentCount(long j) {
            return this.segmentBase.getSegmentCount(j);
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getSegmentNum(long j, long j9) {
            return this.segmentBase.getSegmentNum(j, j9);
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public androidx.media3.exoplayer.dash.manifest.RangedUri getSegmentUrl(long j) {
            return this.segmentBase.getSegmentUrl(this, j);
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getTimeUs(long j) {
            return this.segmentBase.getSegmentTimeUs(j);
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public boolean isExplicit() {
            return this.segmentBase.isExplicit();
        }
    }

    public static class SingleSegmentRepresentation extends androidx.media3.exoplayer.dash.manifest.Representation {
        private final java.lang.String cacheKey;
        public final long contentLength;
        private final androidx.media3.exoplayer.dash.manifest.RangedUri indexUri;
        private final androidx.media3.exoplayer.dash.manifest.SingleSegmentIndex segmentIndex;
        public final android.net.Uri uri;

        public SingleSegmentRepresentation(long j, androidx.media3.common.Format format, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list, androidx.media3.exoplayer.dash.manifest.SegmentBase.SingleSegmentBase singleSegmentBase, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list2, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list3, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list4, java.lang.String str, long j9) {
            super(j, format, list, singleSegmentBase, list2, list3, list4);
            this.uri = android.net.Uri.parse(list.get(0).url);
            androidx.media3.exoplayer.dash.manifest.RangedUri index = singleSegmentBase.getIndex();
            this.indexUri = index;
            this.cacheKey = str;
            this.contentLength = j9;
            this.segmentIndex = index != null ? null : new androidx.media3.exoplayer.dash.manifest.SingleSegmentIndex(new androidx.media3.exoplayer.dash.manifest.RangedUri(null, 0L, j9));
        }

        public static androidx.media3.exoplayer.dash.manifest.Representation.SingleSegmentRepresentation newInstance(long j, androidx.media3.common.Format format, java.lang.String str, long j9, long j10, long j11, long j12, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list, java.lang.String str2, long j13) {
            androidx.media3.exoplayer.dash.manifest.SegmentBase.SingleSegmentBase singleSegmentBase = new androidx.media3.exoplayer.dash.manifest.SegmentBase.SingleSegmentBase(new androidx.media3.exoplayer.dash.manifest.RangedUri(null, j9, (j10 - j9) + 1), 1L, 0L, j11, (j12 - j11) + 1);
            p076i4.S0 s0Y = p076i4.AbstractC2186b0.y(new androidx.media3.exoplayer.dash.manifest.BaseUrl(str));
            p076i4.S0 s9 = p076i4.S0.f22832l;
            return new androidx.media3.exoplayer.dash.manifest.Representation.SingleSegmentRepresentation(j, format, s0Y, singleSegmentBase, list, s9, s9, str2, j13);
        }

        @Override // androidx.media3.exoplayer.dash.manifest.Representation
        public java.lang.String getCacheKey() {
            return this.cacheKey;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.Representation
        public androidx.media3.exoplayer.dash.DashSegmentIndex getIndex() {
            return this.segmentIndex;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.Representation
        public androidx.media3.exoplayer.dash.manifest.RangedUri getIndexUri() {
            return this.indexUri;
        }
    }

    public static androidx.media3.exoplayer.dash.manifest.Representation newInstance(long j, androidx.media3.common.Format format, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list, androidx.media3.exoplayer.dash.manifest.SegmentBase segmentBase) {
        p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        p076i4.S0 s9 = p076i4.S0.f22832l;
        return newInstance(j, format, list, segmentBase, null, s9, s9, null);
    }

    public abstract java.lang.String getCacheKey();

    public abstract androidx.media3.exoplayer.dash.DashSegmentIndex getIndex();

    public abstract androidx.media3.exoplayer.dash.manifest.RangedUri getIndexUri();

    public androidx.media3.exoplayer.dash.manifest.RangedUri getInitializationUri() {
        return this.initializationUri;
    }

    private Representation(long j, androidx.media3.common.Format format, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list, androidx.media3.exoplayer.dash.manifest.SegmentBase segmentBase, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list2, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list3, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list4) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(!list.isEmpty());
        this.revisionId = j;
        this.format = format;
        this.baseUrls = p076i4.AbstractC2186b0.u(list);
        this.inbandEventStreams = list2 == null ? java.util.Collections.EMPTY_LIST : java.util.Collections.unmodifiableList(list2);
        this.essentialProperties = list3;
        this.supplementalProperties = list4;
        this.initializationUri = segmentBase.getInitialization(this);
        this.presentationTimeOffsetUs = segmentBase.getPresentationTimeOffsetUs();
    }

    public static androidx.media3.exoplayer.dash.manifest.Representation newInstance(long j, androidx.media3.common.Format format, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list, androidx.media3.exoplayer.dash.manifest.SegmentBase segmentBase, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list2, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list3, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list4, java.lang.String str) {
        if (segmentBase instanceof androidx.media3.exoplayer.dash.manifest.SegmentBase.SingleSegmentBase) {
            return new androidx.media3.exoplayer.dash.manifest.Representation.SingleSegmentRepresentation(j, format, list, (androidx.media3.exoplayer.dash.manifest.SegmentBase.SingleSegmentBase) segmentBase, list2, list3, list4, str, -1L);
        }
        if (segmentBase instanceof androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase) {
            return new androidx.media3.exoplayer.dash.manifest.Representation.MultiSegmentRepresentation(j, format, list, (androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase) segmentBase, list2, list3, list4);
        }
        throw new java.lang.IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }
}
