package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaSessionImpl f16886i;

    public /* synthetic */ F0(androidx.media3.session.MediaSessionImpl mediaSessionImpl, int i3) {
        this.f16885h = i3;
        this.f16886i = mediaSessionImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16885h) {
            case 0:
                this.f16886i.lambda$onNotificationRefreshRequired$20();
                break;
            case 1:
                this.f16886i.notifyPeriodicSessionPositionInfoChangesOnHandler();
                break;
            case 2:
                this.f16886i.schedulePeriodicSessionPositionInfoChanges();
                break;
            default:
                this.f16886i.lambda$release$2();
                break;
        }
    }
}
