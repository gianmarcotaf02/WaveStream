package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaControllerImplBase f16872i;

    public /* synthetic */ C(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase, int i3) {
        this.f16871h = i3;
        this.f16872i = mediaControllerImplBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16871h) {
            case 0:
                this.f16872i.lambda$setFutureResult$112();
                break;
            default:
                this.f16872i.lambda$release$4();
                break;
        }
    }
}
