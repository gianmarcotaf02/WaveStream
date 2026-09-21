package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public final class FixedTrackSelection extends androidx.media3.exoplayer.trackselection.BaseTrackSelection {
    private final java.lang.Object data;
    private final int reason;

    public FixedTrackSelection(androidx.media3.common.TrackGroup trackGroup, int i3) {
        this(trackGroup, i3, 0);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public java.lang.Object getSelectionData() {
        return this.data;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j, long j9, long j10, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list, androidx.media3.exoplayer.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr) {
    }

    public FixedTrackSelection(androidx.media3.common.TrackGroup trackGroup, int i3, int i9) {
        this(trackGroup, i3, i9, 0, null);
    }

    public FixedTrackSelection(androidx.media3.common.TrackGroup trackGroup, int i3, int i9, int i10, java.lang.Object obj) {
        super(trackGroup, new int[]{i3}, i9);
        this.reason = i10;
        this.data = obj;
    }
}
