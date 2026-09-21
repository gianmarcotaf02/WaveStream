package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1589l implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaControllerHolder f17067i;
    public final /* synthetic */ androidx.media3.session.MediaController j;

    public /* synthetic */ RunnableC1589l(androidx.media3.session.MediaControllerHolder mediaControllerHolder, androidx.media3.session.MediaController mediaController, int i3) {
        this.f17066h = i3;
        this.f17067i = mediaControllerHolder;
        this.j = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17066h) {
            case 0:
                this.f17067i.setController(this.j);
                break;
            default:
                this.f17067i.lambda$setController$0(this.j);
                break;
        }
    }
}
