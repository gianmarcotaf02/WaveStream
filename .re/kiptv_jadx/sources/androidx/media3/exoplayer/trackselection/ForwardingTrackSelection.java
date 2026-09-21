package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingTrackSelection implements androidx.media3.exoplayer.trackselection.ExoTrackSelection {
    private final androidx.media3.exoplayer.trackselection.ExoTrackSelection trackSelection;

    public ForwardingTrackSelection(androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection) {
        this.trackSelection = exoTrackSelection;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void disable() {
        this.trackSelection.disable();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void enable() {
        this.trackSelection.enable();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.media3.exoplayer.trackselection.ForwardingTrackSelection) {
            return this.trackSelection.equals(((androidx.media3.exoplayer.trackselection.ForwardingTrackSelection) obj).trackSelection);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list) {
        return this.trackSelection.evaluateQueueSize(j, list);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean excludeTrack(int i3, long j) {
        return this.trackSelection.excludeTrack(i3, j);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public androidx.media3.common.Format getFormat(int i3) {
        return this.trackSelection.getFormat(i3);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public int getIndexInTrackGroup(int i3) {
        return this.trackSelection.getIndexInTrackGroup(i3);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public long getLatestBitrateEstimate() {
        return this.trackSelection.getLatestBitrateEstimate();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public androidx.media3.common.Format getSelectedFormat() {
        return this.trackSelection.getSelectedFormat();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.trackSelection.getSelectedIndex();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectedIndexInTrackGroup() {
        return this.trackSelection.getSelectedIndexInTrackGroup();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public java.lang.Object getSelectionData() {
        return this.trackSelection.getSelectionData();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.trackSelection.getSelectionReason();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public androidx.media3.common.TrackGroup getTrackGroup() {
        return this.trackSelection.getTrackGroup();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public int getType() {
        return this.trackSelection.getType();
    }

    public androidx.media3.exoplayer.trackselection.ExoTrackSelection getWrappedInstance() {
        return this.trackSelection;
    }

    public int hashCode() {
        return this.trackSelection.hashCode();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public int indexOf(androidx.media3.common.Format format) {
        return this.trackSelection.indexOf(format);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean isTrackExcluded(int i3, long j) {
        return this.trackSelection.isTrackExcluded(i3, j);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public int length() {
        return this.trackSelection.length();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onDiscontinuity() {
        this.trackSelection.onDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlayWhenReadyChanged(boolean z6) {
        this.trackSelection.onPlayWhenReadyChanged(z6);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f9) {
        this.trackSelection.onPlaybackSpeed(f9);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onRebuffer() {
        this.trackSelection.onRebuffer();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean shouldCancelChunkLoad(long j, androidx.media3.exoplayer.source.chunk.Chunk chunk, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list) {
        return this.trackSelection.shouldCancelChunkLoad(j, chunk, list);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j, long j9, long j10, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list, androidx.media3.exoplayer.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr) {
        this.trackSelection.updateSelectedTrack(j, j9, j10, list, mediaChunkIteratorArr);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public int indexOf(int i3) {
        return this.trackSelection.indexOf(i3);
    }
}
