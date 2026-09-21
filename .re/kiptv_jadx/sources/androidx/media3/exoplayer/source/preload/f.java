package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener, androidx.media3.exoplayer.trackselection.TrackSelector.Factory {
    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.Factory
    public androidx.media3.exoplayer.trackselection.TrackSelector createTrackSelector(android.content.Context context) {
        return new androidx.media3.exoplayer.trackselection.DefaultTrackSelector(context);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        androidx.media3.exoplayer.source.preload.DefaultPreloadManager.lambda$new$0();
    }
}
