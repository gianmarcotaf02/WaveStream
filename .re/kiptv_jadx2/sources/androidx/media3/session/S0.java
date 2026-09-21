package androidx.media3.session;

public final class S0 implements Runnable {

    public final int f16944h;

    public final PlayerWrapper f16945i;
    public final int j;

    public final int f16946k;

    public S0(int i3, int i9, int i10, PlayerWrapper playerWrapper) {
        this.f16944h = i10;
        this.f16945i = playerWrapper;
        this.j = i3;
        this.f16946k = i9;
    }

    @Override
    public final void run() {
        switch (this.f16944h) {
            case 0:
                MediaSessionLegacyStub.AnonymousClass3.lambda$onSetVolumeTo$0(this.f16945i, this.j, this.f16946k);
                break;
            default:
                MediaSessionLegacyStub.AnonymousClass3.lambda$onAdjustVolume$1(this.f16945i, this.j, this.f16946k);
                break;
        }
    }
}
