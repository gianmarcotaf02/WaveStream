package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class S implements androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaControllerImplBase f16941i;
    public final /* synthetic */ boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f16942k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f16943l;

    public /* synthetic */ S(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase, boolean z6, boolean z9, int i3, int i9) {
        this.f16940h = i9;
        this.f16941i = mediaControllerImplBase;
        this.j = z6;
        this.f16942k = z9;
        this.f16943l = i3;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(java.lang.Object obj) {
        androidx.media3.session.MediaController.Listener listener = (androidx.media3.session.MediaController.Listener) obj;
        switch (this.f16940h) {
            case 0:
                this.f16941i.lambda$onSetMediaButtonPreferences$124(this.j, this.f16942k, this.f16943l, listener);
                break;
            default:
                this.f16941i.lambda$onSetCustomLayout$123(this.j, this.f16942k, this.f16943l, listener);
                break;
        }
    }
}
