package androidx.media3.session;

public final class RunnableC1567a implements Runnable {

    public final int f16975h;

    public final AndroidAutoConnectionStateObserver f16976i;

    public RunnableC1567a(AndroidAutoConnectionStateObserver androidAutoConnectionStateObserver, int i3) {
        this.f16975h = i3;
        this.f16976i = androidAutoConnectionStateObserver;
    }

    @Override
    public final void run() {
        switch (this.f16975h) {
            case 0:
                this.f16976i.lambda$release$1();
                break;
            case 1:
                this.f16976i.lambda$new$0();
                break;
            default:
                AndroidAutoConnectionStateObserver.access$200(this.f16976i);
                break;
        }
    }
}
