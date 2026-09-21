package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public final class RandomTrackSelection extends androidx.media3.exoplayer.trackselection.BaseTrackSelection {
    private final java.util.Random random;
    private int selectedIndex;

    public RandomTrackSelection(androidx.media3.common.TrackGroup trackGroup, int[] iArr, int i3, java.util.Random random) {
        super(trackGroup, iArr, i3);
        this.random = random;
        this.selectedIndex = random.nextInt(this.length);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public java.lang.Object getSelectionData() {
        return null;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return 3;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j, long j9, long j10, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list, androidx.media3.exoplayer.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i3 = 0;
        for (int i9 = 0; i9 < this.length; i9++) {
            if (!isTrackExcluded(i9, jElapsedRealtime)) {
                i3++;
            }
        }
        this.selectedIndex = this.random.nextInt(i3);
        if (i3 != this.length) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.length; i11++) {
                if (!isTrackExcluded(i11, jElapsedRealtime)) {
                    int i12 = i10 + 1;
                    if (this.selectedIndex == i10) {
                        this.selectedIndex = i11;
                        return;
                    }
                    i10 = i12;
                }
            }
        }
    }

    public static final class Factory implements androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory {
        private final java.util.Random random;

        public Factory() {
            this.random = new java.util.Random();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ androidx.media3.exoplayer.trackselection.ExoTrackSelection lambda$createTrackSelections$0(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition definition) {
            return new androidx.media3.exoplayer.trackselection.RandomTrackSelection(definition.group, definition.tracks, definition.type, this.random);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory
        public androidx.media3.exoplayer.trackselection.ExoTrackSelection[] createTrackSelections(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr, androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Timeline timeline) {
            return androidx.media3.exoplayer.trackselection.TrackSelectionUtil.createTrackSelectionsForDefinitions(definitionArr, new F1.e(9, this));
        }

        public Factory(int i3) {
            this.random = new java.util.Random(i3);
        }
    }
}
