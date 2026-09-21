package androidx.media3.exoplayer;

/* JADX INFO: renamed from: androidx.media3.exoplayer.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1554i implements p068h4.v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.RenderersFactory f16678i;

    public /* synthetic */ C1554i(androidx.media3.exoplayer.RenderersFactory renderersFactory, int i3) {
        this.f16677h = i3;
        this.f16678i = renderersFactory;
    }

    @Override // p068h4.v
    public final java.lang.Object get() {
        switch (this.f16677h) {
            case 0:
                return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$setRenderersFactory$16(this.f16678i);
            case 1:
                return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$6(this.f16678i);
            case 2:
                return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$2(this.f16678i);
            default:
                return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$8(this.f16678i);
        }
    }
}
