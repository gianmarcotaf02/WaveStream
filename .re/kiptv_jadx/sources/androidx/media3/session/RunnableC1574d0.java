package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1574d0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaControllerImplLegacy f17005i;

    public /* synthetic */ RunnableC1574d0(androidx.media3.session.MediaControllerImplLegacy mediaControllerImplLegacy, int i3) {
        this.f17004h = i3;
        this.f17005i = mediaControllerImplLegacy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17004h) {
            case 0:
                this.f17005i.lambda$connectToSession$2();
                break;
            default:
                this.f17005i.lambda$connectToService$3();
                break;
        }
    }
}
