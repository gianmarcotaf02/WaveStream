package androidx.media3.exoplayer;

/* JADX INFO: renamed from: androidx.media3.exoplayer.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1557l implements p068h4.v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.trackselection.TrackSelector f16684i;

    public /* synthetic */ C1557l(androidx.media3.exoplayer.trackselection.TrackSelector trackSelector, int i3) {
        this.f16683h = i3;
        this.f16684i = trackSelector;
    }

    @Override // p068h4.v
    public final java.lang.Object get() {
        switch (this.f16683h) {
            case 0:
                return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$10(this.f16684i);
            default:
                return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$setTrackSelector$18(this.f16684i);
        }
    }
}
