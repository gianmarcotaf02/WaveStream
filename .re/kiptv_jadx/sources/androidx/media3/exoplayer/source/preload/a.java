package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.preload.BasePreloadManager f16752i;
    public final /* synthetic */ androidx.media3.exoplayer.source.MediaSource j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p068h4.l f16753k;

    public /* synthetic */ a(androidx.media3.exoplayer.source.preload.BasePreloadManager basePreloadManager, androidx.media3.exoplayer.source.MediaSource mediaSource, p068h4.l lVar, int i3) {
        this.f16751h = i3;
        this.f16752i = basePreloadManager;
        this.j = mediaSource;
        this.f16753k = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16751h) {
            case 0:
                this.f16752i.lambda$onSkipped$8(this.j, this.f16753k);
                break;
            default:
                this.f16752i.lambda$onCompleted$1(this.j, this.f16753k);
                break;
        }
    }
}
