package io.sentry.android.ndk;

public final class a implements Runnable {

    public final int f23455h;

    public final NdkScopeObserver f23456i;
    public final String j;

    public final String f23457k;

    public a(NdkScopeObserver ndkScopeObserver, String str, String str2, int i3) {
        this.f23455h = i3;
        this.f23456i = ndkScopeObserver;
        this.j = str;
        this.f23457k = str2;
    }

    @Override
    public final void run() {
        switch (this.f23455h) {
            case 0:
                this.f23456i.lambda$setExtra$4(this.j, this.f23457k);
                break;
            default:
                this.f23456i.lambda$setTag$2(this.j, this.f23457k);
                break;
        }
    }
}
