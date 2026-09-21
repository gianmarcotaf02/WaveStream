package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G implements androidx.media3.session.MediaControllerImplBase.RemoteSessionTask, androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16888i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16890l;

    public /* synthetic */ G(int i3, int i9, int i10, java.lang.Object obj, java.lang.Object obj2) {
        this.f16887h = i10;
        this.f16888i = obj;
        this.f16890l = obj2;
        this.j = i3;
        this.f16889k = i9;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        ((androidx.media3.session.MediaSessionStub) this.f16888i).lambda$setVideoSurfaceWithSize$61((android.view.Surface) this.f16890l, this.j, this.f16889k, (androidx.media3.session.PlayerWrapper) obj);
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        switch (this.f16887h) {
            case 0:
                ((androidx.media3.session.MediaControllerImplBase) this.f16888i).lambda$setVideoSurfaceWithSize$80((android.view.Surface) this.f16890l, this.j, this.f16889k, iMediaSession, i3);
                break;
            default:
                ((androidx.media3.session.MediaControllerImplBase) this.f16888i).lambda$replaceMediaItems$47((java.util.List) this.f16890l, this.j, this.f16889k, iMediaSession, i3);
                break;
        }
    }
}
