package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16479i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ C(java.lang.Object obj, int i3, int i9) {
        this.f16478h = i9;
        this.j = obj;
        this.f16479i = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16478h) {
            case 0:
                ((androidx.media3.exoplayer.ExoPlayerImplInternal) this.j).lambda$setScrubbingModeEnabledInternal$3(this.f16479i);
                break;
            default:
                ((androidx.media3.exoplayer.StreamVolumeManager) this.j).lambda$new$0(this.f16479i);
                break;
        }
    }
}
