package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import java.util.List;

public final class FixedTrackSelection extends BaseTrackSelection {
    private final Object data;
    private final int reason;

    public FixedTrackSelection(TrackGroup trackGroup, int i3) {
        this(trackGroup, i3, 0);
    }

    @Override
    public int getSelectedIndex() {
        return 0;
    }

    @Override
    public Object getSelectionData() {
        return this.data;
    }

    @Override
    public int getSelectionReason() {
        return this.reason;
    }

    @Override
    public void updateSelectedTrack(long j, long j9, long j10, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
    }

    public FixedTrackSelection(TrackGroup trackGroup, int i3, int i9) {
        this(trackGroup, i3, i9, 0, null);
    }

    public FixedTrackSelection(TrackGroup trackGroup, int i3, int i9, int i10, Object obj) {
        super(trackGroup, new int[]{i3}, i9);
        this.reason = i10;
        this.data = obj;
    }
}
