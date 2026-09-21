package androidx.media3.session;

public final class P0 implements Runnable {

    public final int f16930h;

    public final MediaSessionLegacyStub f16931i;

    public P0(MediaSessionLegacyStub mediaSessionLegacyStub, int i3) {
        this.f16930h = i3;
        this.f16931i = mediaSessionLegacyStub;
    }

    @Override
    public final void run() {
        switch (this.f16930h) {
            case 0:
                this.f16931i.updateCustomLayoutAndLegacyExtrasForMediaButtonPreferencesAndInformExtrasChanged();
                break;
            default:
                this.f16931i.onAndroidAutoConnectionStateChanged();
                break;
        }
    }
}
