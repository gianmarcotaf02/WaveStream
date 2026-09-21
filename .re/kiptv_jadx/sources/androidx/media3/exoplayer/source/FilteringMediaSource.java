package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public class FilteringMediaSource extends androidx.media3.exoplayer.source.WrappingMediaSource {
    private final p076i4.AbstractC2214p0 trackTypes;

    public static final class FilteringMediaPeriod implements androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.MediaPeriod.Callback {
        private androidx.media3.exoplayer.source.MediaPeriod.Callback callback;
        private androidx.media3.exoplayer.source.TrackGroupArray filteredTrackGroups;
        public final androidx.media3.exoplayer.source.MediaPeriod mediaPeriod;
        private final p076i4.AbstractC2214p0 trackTypes;

        public FilteringMediaPeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod, p076i4.AbstractC2214p0 abstractC2214p0) {
            this.mediaPeriod = mediaPeriod;
            this.trackTypes = abstractC2214p0;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
            return this.mediaPeriod.continueLoading(loadingInfo);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void discardBuffer(long j, boolean z6) {
            this.mediaPeriod.discardBuffer(j, z6);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
            return this.mediaPeriod.getAdjustedSeekPositionUs(j, seekParameters);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return this.mediaPeriod.getBufferedPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return this.mediaPeriod.getNextLoadPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public java.util.List<androidx.media3.common.StreamKey> getStreamKeys(java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection> list) {
            return this.mediaPeriod.getStreamKeys(list);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
            androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray = this.filteredTrackGroups;
            trackGroupArray.getClass();
            return trackGroupArray;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return this.mediaPeriod.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void maybeThrowPrepareError() {
            this.mediaPeriod.maybeThrowPrepareError();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
            androidx.media3.exoplayer.source.TrackGroupArray trackGroups = mediaPeriod.getTrackGroups();
            p076i4.Y yS = p076i4.AbstractC2186b0.s();
            for (int i3 = 0; i3 < trackGroups.length; i3++) {
                androidx.media3.common.TrackGroup trackGroup = trackGroups.get(i3);
                if (this.trackTypes.contains(java.lang.Integer.valueOf(trackGroup.type))) {
                    yS.c(trackGroup);
                }
            }
            this.filteredTrackGroups = new androidx.media3.exoplayer.source.TrackGroupArray((androidx.media3.common.TrackGroup[]) yS.f().toArray(new androidx.media3.common.TrackGroup[0]));
            androidx.media3.exoplayer.source.MediaPeriod.Callback callback = this.callback;
            callback.getClass();
            callback.onPrepared(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
            this.callback = callback;
            this.mediaPeriod.prepare(this, j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long readDiscontinuity() {
            return this.mediaPeriod.readDiscontinuity();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j) {
            this.mediaPeriod.reevaluateBuffer(j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long seekToUs(long j) {
            return this.mediaPeriod.seekToUs(j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            return this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long setEndPositionUs(long j) {
            return this.mediaPeriod.setEndPositionUs(j);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
            androidx.media3.exoplayer.source.MediaPeriod.Callback callback = this.callback;
            callback.getClass();
            callback.onContinueLoadingRequested(this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FilteringMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, int i3) {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
        int i9 = p076i4.AbstractC2214p0.j;
        this(mediaSource, new p076i4.f1(numValueOf));
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        return new androidx.media3.exoplayer.source.FilteringMediaSource.FilteringMediaPeriod(super.createPeriod(mediaPeriodId, allocator, j), this.trackTypes);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        super.releasePeriod(((androidx.media3.exoplayer.source.FilteringMediaSource.FilteringMediaPeriod) mediaPeriod).mediaPeriod);
    }

    public FilteringMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, java.util.Set<java.lang.Integer> set) {
        super(mediaSource);
        this.trackTypes = p076i4.AbstractC2214p0.t(set);
    }
}
