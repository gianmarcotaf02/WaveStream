package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1569b implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16985i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16986k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16988m;

    public /* synthetic */ RunnableC1569b(androidx.media3.session.ConnectedControllersManager connectedControllersManager, androidx.media3.session.ConnectedControllersManager.AsyncCommand asyncCommand, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord, java.util.concurrent.atomic.AtomicBoolean atomicBoolean2) {
        this.f16984h = 0;
        this.f16985i = connectedControllersManager;
        this.j = asyncCommand;
        this.f16986k = atomicBoolean;
        this.f16988m = connectedControllerRecord;
        this.f16987l = atomicBoolean2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16984h) {
            case 0:
                ((androidx.media3.session.ConnectedControllersManager) this.f16985i).lambda$flushCommandQueue$3((androidx.media3.session.ConnectedControllersManager.AsyncCommand) this.j, (java.util.concurrent.atomic.AtomicBoolean) this.f16986k, (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.f16988m, (java.util.concurrent.atomic.AtomicBoolean) this.f16987l);
                break;
            case 1:
                ((androidx.media3.session.MediaLibraryServiceLegacyStub) this.f16985i).lambda$createMediaItemsToBrowserItemsAsyncFunction$11((java.util.concurrent.atomic.AtomicInteger) this.j, (p076i4.AbstractC2186b0) this.f16986k, (java.util.ArrayList) this.f16987l, (com.google.common.util.concurrent.Q) this.f16988m);
                break;
            case 2:
                ((androidx.media3.session.MediaLibraryServiceLegacyStub) this.f16985i).lambda$onGetRoot$0((java.util.concurrent.atomic.AtomicReference) this.j, (androidx.media3.session.MediaSession.ControllerInfo) this.f16986k, (androidx.media3.session.MediaLibraryService.LibraryParams) this.f16987l, (androidx.media3.common.util.ConditionVariable) this.f16988m);
                break;
            default:
                ((androidx.media3.session.MediaNotificationManager) this.f16985i).lambda$onCustomAction$3((androidx.media3.session.MediaSession) this.j, (java.lang.String) this.f16986k, (android.os.Bundle) this.f16987l, (androidx.media3.session.MediaController) this.f16988m);
                break;
        }
    }

    public /* synthetic */ RunnableC1569b(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, int i3) {
        this.f16984h = i3;
        this.f16985i = obj;
        this.j = obj2;
        this.f16986k = obj3;
        this.f16987l = obj4;
        this.f16988m = obj5;
    }
}
