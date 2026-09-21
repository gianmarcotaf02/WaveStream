package androidx.media3.exoplayer;

/* JADX INFO: renamed from: androidx.media3.exoplayer.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1548c implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16613i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ RunnableC1548c(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f16612h = i3;
        this.j = obj;
        this.f16613i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16612h) {
            case 0:
                ((androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi23) this.j).lambda$enable$1((android.content.Context) this.f16613i);
                break;
            case 1:
                ((androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi35) this.j).lambda$enable$1((android.content.Context) this.f16613i);
                break;
            case 2:
                ((androidx.media3.exoplayer.ExoPlayerImpl) this.j).lambda$new$1((androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate) this.f16613i);
                break;
            default:
                ((androidx.media3.exoplayer.ExoPlayerImplInternal) this.j).lambda$sendMessageToTargetThread$4((androidx.media3.exoplayer.PlayerMessage) this.f16613i);
                break;
        }
    }
}
