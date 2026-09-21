package androidx.media3.exoplayer;

/* JADX INFO: renamed from: androidx.media3.exoplayer.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1551f implements p068h4.v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.LoadControl f16642i;

    public /* synthetic */ C1551f(androidx.media3.exoplayer.LoadControl loadControl, int i3) {
        this.f16641h = i3;
        this.f16642i = loadControl;
    }

    @Override // p068h4.v
    public final java.lang.Object get() {
        switch (this.f16641h) {
            case 0:
                return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$setLoadControl$19(this.f16642i);
            default:
                return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$11(this.f16642i);
        }
    }
}
