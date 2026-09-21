package androidx.media3.exoplayer;

public final class C implements Runnable {

    public final int f16478h;

    public final int f16479i;
    public final Object j;

    public C(Object obj, int i3, int i9) {
        this.f16478h = i9;
        this.j = obj;
        this.f16479i = i3;
    }

    @Override
    public final void run() {
        switch (this.f16478h) {
            case 0:
                ((ExoPlayerImplInternal) this.j).lambda$setScrubbingModeEnabledInternal$3(this.f16479i);
                break;
            default:
                ((StreamVolumeManager) this.j).lambda$new$0(this.f16479i);
                break;
        }
    }
}
