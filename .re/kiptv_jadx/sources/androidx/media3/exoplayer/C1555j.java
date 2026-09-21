package androidx.media3.exoplayer;

/* JADX INFO: renamed from: androidx.media3.exoplayer.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1555j implements p068h4.v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory f16680i;

    public /* synthetic */ C1555j(androidx.media3.exoplayer.source.MediaSource.Factory factory, int i3) {
        this.f16679h = i3;
        this.f16680i = factory;
    }

    @Override // p068h4.v
    public final java.lang.Object get() {
        switch (this.f16679h) {
            case 0:
                return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$7(this.f16680i);
            case 1:
                return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$9(this.f16680i);
            case 2:
                return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$5(this.f16680i);
            default:
                return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$setMediaSourceFactory$17(this.f16680i);
        }
    }
}
