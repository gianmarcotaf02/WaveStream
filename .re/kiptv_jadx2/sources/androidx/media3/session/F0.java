package androidx.media3.session;

public final class F0 implements Runnable {

    public final int f16885h;

    public final MediaSessionImpl f16886i;

    public F0(MediaSessionImpl mediaSessionImpl, int i3) {
        this.f16885h = i3;
        this.f16886i = mediaSessionImpl;
    }

    @Override
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
