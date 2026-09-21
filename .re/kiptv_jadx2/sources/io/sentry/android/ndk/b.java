package io.sentry.android.ndk;

public final class b implements Runnable {

    public final int f23458h;

    public final NdkScopeObserver f23459i;
    public final String j;

    public b(NdkScopeObserver ndkScopeObserver, String str, int i3) {
        this.f23458h = i3;
        this.f23459i = ndkScopeObserver;
        this.j = str;
    }

    @Override
    public final void run() {
        switch (this.f23458h) {
            case 0:
                this.f23459i.lambda$removeTag$3(this.j);
                break;
            default:
                this.f23459i.lambda$removeExtra$5(this.j);
                break;
        }
    }
}
