package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.util.Comparator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16794h;

    public /* synthetic */ a(int i3) {
        this.f16794h = i3;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f16794h) {
            case 0:
                return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo.compareSelections((java.util.List) obj, (java.util.List) obj2);
            case 1:
                return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo.compareSelections((java.util.List) obj, (java.util.List) obj2);
            case 2:
                return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo.compareSelections((java.util.List) obj, (java.util.List) obj2);
            case 3:
                return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo.compareSelections((java.util.List) obj, (java.util.List) obj2);
            case 4:
                return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) obj, (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) obj2);
            case 5:
                return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) obj, (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) obj2);
            case 6:
                return androidx.media3.exoplayer.trackselection.BaseTrackSelection.lambda$new$0((androidx.media3.common.Format) obj, (androidx.media3.common.Format) obj2);
            default:
                return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.lambda$static$0((java.lang.Integer) obj, (java.lang.Integer) obj2);
        }
    }
}
