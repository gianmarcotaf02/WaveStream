package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1608u0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaLibrarySessionImpl f17116i;
    public final /* synthetic */ com.google.common.util.concurrent.J j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaSession.ControllerInfo f17117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17118l;

    public /* synthetic */ RunnableC1608u0(androidx.media3.session.MediaLibrarySessionImpl mediaLibrarySessionImpl, com.google.common.util.concurrent.J j, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i3, int i9) {
        this.f17115h = i9;
        this.f17116i = mediaLibrarySessionImpl;
        this.j = j;
        this.f17117k = controllerInfo;
        this.f17118l = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17115h) {
            case 0:
                this.f17116i.lambda$onGetChildrenOnHandler$0(this.j, this.f17117k, this.f17118l);
                break;
            default:
                this.f17116i.lambda$onGetSearchResultOnHandler$6(this.j, this.f17117k, this.f17118l);
                break;
        }
    }
}
