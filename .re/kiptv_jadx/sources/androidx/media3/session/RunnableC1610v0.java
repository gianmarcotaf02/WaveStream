package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1610v0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaLibrarySessionImpl f17123i;
    public final /* synthetic */ com.google.common.util.concurrent.J j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaSession.ControllerInfo f17124k;

    public /* synthetic */ RunnableC1610v0(androidx.media3.session.MediaLibrarySessionImpl mediaLibrarySessionImpl, com.google.common.util.concurrent.J j, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i3) {
        this.f17122h = i3;
        this.f17123i = mediaLibrarySessionImpl;
        this.j = j;
        this.f17124k = controllerInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17122h) {
            case 0:
                this.f17123i.lambda$onGetItemOnHandler$1(this.j, this.f17124k);
                break;
            default:
                this.f17123i.lambda$onSearchOnHandler$5(this.j, this.f17124k);
                break;
        }
    }
}
