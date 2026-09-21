package androidx.media3.common.audio;

public final class a implements Runnable {

    public final int f16392h;

    public final Object f16393i;

    public a(int i3, Object obj) {
        this.f16392h = i3;
        this.f16393i = obj;
    }

    @Override
    public final void run() {
        switch (this.f16392h) {
            case 0:
                ((AudioBecomingNoisyManager) this.f16393i).lambda$setEnabled$0();
                break;
            case 1:
                ((AudioBecomingNoisyManager) this.f16393i).lambda$setEnabled$1();
                break;
            default:
                ((AudioBecomingNoisyManager.AudioBecomingNoisyReceiver) this.f16393i).callListenerIfEnabled();
                break;
        }
    }
}
