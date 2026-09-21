package androidx.media3.common.util;

public final class a implements Runnable {

    public final int f16451h;

    public final BackgroundThreadStateHandler f16452i;
    public final Object j;

    public a(BackgroundThreadStateHandler backgroundThreadStateHandler, Object obj, int i3) {
        this.f16451h = i3;
        this.f16452i = backgroundThreadStateHandler;
        this.j = obj;
    }

    @Override
    public final void run() {
        switch (this.f16451h) {
            case 0:
                this.f16452i.lambda$setStateInBackground$2(this.j);
                break;
            default:
                this.f16452i.lambda$updateStateAsync$0(this.j);
                break;
        }
    }
}
