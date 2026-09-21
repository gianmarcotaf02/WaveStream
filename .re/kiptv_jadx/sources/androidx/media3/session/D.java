package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D implements androidx.media3.session.MediaControllerImplBase.RemoteSessionTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaControllerImplBase f16876i;
    public final /* synthetic */ java.util.List j;

    public /* synthetic */ D(int i3, java.util.List list, androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
        this.f16875h = i3;
        this.f16876i = mediaControllerImplBase;
        this.j = list;
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public final void run(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        switch (this.f16875h) {
            case 0:
                this.f16876i.lambda$addMediaItems$37(this.j, iMediaSession, i3);
                break;
            default:
                this.f16876i.lambda$setMediaItems$27(this.j, iMediaSession, i3);
                break;
        }
    }
}
