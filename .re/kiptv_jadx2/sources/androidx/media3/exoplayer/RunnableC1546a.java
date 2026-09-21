package androidx.media3.exoplayer;

public final class RunnableC1546a implements Runnable {

    public final int f16522h;

    public final Object f16523i;

    public RunnableC1546a(int i3, Object obj) {
        this.f16522h = i3;
        this.f16523i = obj;
    }

    @Override
    public final void run() {
        switch (this.f16522h) {
            case 0:
                ((DefaultSuitableOutputChecker.ImplApi23) this.f16523i).lambda$disable$2();
                break;
            case 1:
                ((DefaultSuitableOutputChecker.ImplApi35) this.f16523i).lambda$disable$2();
                break;
            case 2:
                ((ExoPlayerImpl) this.f16523i).lambda$new$3();
                break;
            case 3:
                ((StreamVolumeManager.VolumeChangeReceiver) this.f16523i).lambda$onReceive$0();
                break;
            default:
                ((MetadataRetrieverInternal) this.f16523i).lambda$close$0();
                break;
        }
    }
}
