package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1609v implements androidx.media3.session.MediaControllerImplBase.RemoteSessionTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaControllerImplBase f17120i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17121k;

    public /* synthetic */ C1609v(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase, int i3, int i9, int i10) {
        this.f17119h = i10;
        this.f17120i = mediaControllerImplBase;
        this.j = i3;
        this.f17121k = i9;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public final void run(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        switch (this.f17119h) {
            case 0:
                this.f17120i.lambda$moveMediaItem$43(this.j, this.f17121k, iMediaSession, i3);
                break;
            case 1:
                this.f17120i.lambda$removeMediaItems$41(this.j, this.f17121k, iMediaSession, i3);
                break;
            default:
                this.f17120i.lambda$setDeviceVolume$64(this.j, this.f17121k, iMediaSession, i3);
                break;
        }
    }
}
