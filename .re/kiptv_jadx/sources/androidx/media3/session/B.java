package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements androidx.media3.session.MediaControllerImplBase.RemoteSessionTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaControllerImplBase f16867i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.MediaItem f16868k;

    public /* synthetic */ B(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase, int i3, androidx.media3.common.MediaItem mediaItem, int i9) {
        this.f16866h = i9;
        this.f16867i = mediaControllerImplBase;
        this.j = i3;
        this.f16868k = mediaItem;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public final void run(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        switch (this.f16866h) {
            case 0:
                this.f16867i.lambda$replaceMediaItem$45(this.j, this.f16868k, iMediaSession, i3);
                break;
            default:
                this.f16867i.lambda$addMediaItem$35(this.j, this.f16868k, iMediaSession, i3);
                break;
        }
    }
}
