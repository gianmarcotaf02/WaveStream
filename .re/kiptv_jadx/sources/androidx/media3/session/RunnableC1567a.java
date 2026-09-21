package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1567a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.AndroidAutoConnectionStateObserver f16976i;

    public /* synthetic */ RunnableC1567a(androidx.media3.session.AndroidAutoConnectionStateObserver androidAutoConnectionStateObserver, int i3) {
        this.f16975h = i3;
        this.f16976i = androidAutoConnectionStateObserver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16975h) {
            case 0:
                this.f16976i.lambda$release$1();
                break;
            case 1:
                this.f16976i.lambda$new$0();
                break;
            default:
                androidx.media3.session.AndroidAutoConnectionStateObserver.access$200(this.f16976i);
                break;
        }
    }
}
