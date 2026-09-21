package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import java.util.List;

public class ForwardingTrackSelection implements ExoTrackSelection {
    private final ExoTrackSelection trackSelection;

    public ForwardingTrackSelection(ExoTrackSelection exoTrackSelection) {
        this.trackSelection = exoTrackSelection;
    }

    @Override
    public void disable() {
        this.trackSelection.disable();
    }

    @Override
    public void enable() {
        this.trackSelection.enable();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ForwardingTrackSelection) {
            return this.trackSelection.equals(((ForwardingTrackSelection) obj).trackSelection);
        }
        return false;
    }

    @Override
    public int evaluateQueueSize(long j, List<? extends MediaChunk> list) {
        return this.trackSelection.evaluateQueueSize(j, list);
    }

    @Override
    public boolean excludeTrack(int i3, long j) {
        return this.trackSelection.excludeTrack(i3, j);
    }

    @Override
    public Format getFormat(int i3) {
        return this.trackSelection.getFormat(i3);
    }

    @Override
    public int getIndexInTrackGroup(int i3) {
        return this.trackSelection.getIndexInTrackGroup(i3);
    }

    @Override
    public long getLatestBitrateEstimate() {
        return this.trackSelection.getLatestBitrateEstimate();
    }

    @Override
    public Format getSelectedFormat() {
        return this.trackSelection.getSelectedFormat();
    }

    @Override
    public int getSelectedIndex() {
        return this.trackSelection.getSelectedIndex();
    }

    @Override
    public int getSelectedIndexInTrackGroup() {
        return this.trackSelection.getSelectedIndexInTrackGroup();
    }

    @Override
    public Object getSelectionData() {
        return this.trackSelection.getSelectionData();
    }

    @Override
    public int getSelectionReason() {
        return this.trackSelection.getSelectionReason();
    }

    @Override
    public TrackGroup getTrackGroup() {
        return this.trackSelection.getTrackGroup();
    }

    @Override
    public int getType() {
        return this.trackSelection.getType();
    }

    public ExoTrackSelection getWrappedInstance() {
        return this.trackSelection;
    }

    public int hashCode() {
        return this.trackSelection.hashCode();
    }

    @Override
    public int indexOf(Format format) {
        return this.trackSelection.indexOf(format);
    }

    @Override
    public boolean isTrackExcluded(int i3, long j) {
        return this.trackSelection.isTrackExcluded(i3, j);
    }

    @Override
    public int length() {
        return this.trackSelection.length();
    }

    @Override
    public void onDiscontinuity() {
        this.trackSelection.onDiscontinuity();
    }

    @Override
    public void onPlayWhenReadyChanged(boolean z6) {
        this.trackSelection.onPlayWhenReadyChanged(z6);
    }

    @Override
    public void onPlaybackSpeed(float f9) {
        this.trackSelection.onPlaybackSpeed(f9);
    }

    @Override
    public void onRebuffer() {
        this.trackSelection.onRebuffer();
    }

    @Override
    public boolean shouldCancelChunkLoad(long j, Chunk chunk, List<? extends MediaChunk> list) {
        return this.trackSelection.shouldCancelChunkLoad(j, chunk, list);
    }

    @Override
    public void updateSelectedTrack(long j, long j9, long j10, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        this.trackSelection.updateSelectedTrack(j, j9, j10, list, mediaChunkIteratorArr);
    }

    @Override
    public int indexOf(int i3) {
        return this.trackSelection.indexOf(i3);
    }
}
