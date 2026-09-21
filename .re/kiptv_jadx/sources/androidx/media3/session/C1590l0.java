package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1590l0 implements androidx.media3.session.MediaControllerStub.ControllerTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17069i;
    public final /* synthetic */ p076i4.AbstractC2186b0 j;

    public /* synthetic */ C1590l0(int i3, int i9, p076i4.AbstractC2186b0 abstractC2186b0) {
        this.f17068h = i9;
        this.f17069i = i3;
        this.j = abstractC2186b0;
    }

    @Override // androidx.media3.session.MediaControllerStub.ControllerTask
    public final void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
        switch (this.f17068h) {
            case 0:
                mediaControllerImplBase.onSetCustomLayout(this.f17069i, this.j);
                break;
            default:
                mediaControllerImplBase.onSetMediaButtonPreferences(this.f17069i, this.j);
                break;
        }
    }
}
