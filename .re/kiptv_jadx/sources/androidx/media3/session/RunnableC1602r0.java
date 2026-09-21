package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1602r0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17099h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaLibraryServiceLegacyStub f17100i;
    public final /* synthetic */ java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaSession.ControllerInfo f17101k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.legacy.MediaBrowserServiceCompat.Result f17102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f17103m;

    public /* synthetic */ RunnableC1602r0(androidx.media3.session.MediaLibraryServiceLegacyStub mediaLibraryServiceLegacyStub, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result result, android.os.Bundle bundle, java.lang.String str) {
        this.f17100i = mediaLibraryServiceLegacyStub;
        this.f17101k = controllerInfo;
        this.f17102l = result;
        this.f17103m = bundle;
        this.j = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17099h) {
            case 0:
                this.f17100i.lambda$onSearch$5(this.f17101k, this.f17102l, this.j, this.f17103m);
                break;
            case 1:
                androidx.media3.session.legacy.MediaBrowserServiceCompat.Result result = this.f17102l;
                this.f17100i.lambda$onCustomAction$6(this.j, this.f17101k, result, this.f17103m);
                break;
            default:
                this.f17100i.lambda$onLoadChildren$3(this.f17101k, this.f17102l, this.f17103m, this.j);
                break;
        }
    }

    public /* synthetic */ RunnableC1602r0(androidx.media3.session.MediaLibraryServiceLegacyStub mediaLibraryServiceLegacyStub, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result result, java.lang.String str, android.os.Bundle bundle) {
        this.f17100i = mediaLibraryServiceLegacyStub;
        this.f17101k = controllerInfo;
        this.f17102l = result;
        this.j = str;
        this.f17103m = bundle;
    }

    public /* synthetic */ RunnableC1602r0(androidx.media3.session.MediaLibraryServiceLegacyStub mediaLibraryServiceLegacyStub, java.lang.String str, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result result, android.os.Bundle bundle) {
        this.f17100i = mediaLibraryServiceLegacyStub;
        this.j = str;
        this.f17101k = controllerInfo;
        this.f17102l = result;
        this.f17103m = bundle;
    }
}
