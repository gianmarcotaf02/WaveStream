package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I implements androidx.media3.session.MediaControllerImplBase.RemoteSessionTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaControllerImplBase f16898i;
    public final /* synthetic */ androidx.media3.common.MediaItem j;

    public /* synthetic */ I(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase, androidx.media3.common.MediaItem mediaItem, int i3) {
        this.f16897h = i3;
        this.f16898i = mediaControllerImplBase;
        this.j = mediaItem;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public final void run(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        switch (this.f16897h) {
            case 0:
                this.f16898i.lambda$setMediaItem$23(this.j, iMediaSession, i3);
                break;
            default:
                this.f16898i.lambda$addMediaItem$34(this.j, iMediaSession, i3);
                break;
        }
    }
}
