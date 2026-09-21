package androidx.media3.exoplayer;

/* JADX INFO: renamed from: androidx.media3.exoplayer.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1546a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16523i;

    public /* synthetic */ RunnableC1546a(int i3, java.lang.Object obj) {
        this.f16522h = i3;
        this.f16523i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16522h) {
            case 0:
                ((androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi23) this.f16523i).lambda$disable$2();
                break;
            case 1:
                ((androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi35) this.f16523i).lambda$disable$2();
                break;
            case 2:
                ((androidx.media3.exoplayer.ExoPlayerImpl) this.f16523i).lambda$new$3();
                break;
            case 3:
                ((androidx.media3.exoplayer.StreamVolumeManager.VolumeChangeReceiver) this.f16523i).lambda$onReceive$0();
                break;
            default:
                ((androidx.media3.exoplayer.MetadataRetrieverInternal) this.f16523i).lambda$close$0();
                break;
        }
    }
}
