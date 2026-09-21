package androidx.media3.exoplayer.offline;

import androidx.media3.exoplayer.trackselection.TrackSelector;

public final class b implements TrackSelector.InvalidationListener {
    @Override
    public final void onTrackSelectionsInvalidated() {
        DownloadHelper.lambda$new$0();
    }
}
