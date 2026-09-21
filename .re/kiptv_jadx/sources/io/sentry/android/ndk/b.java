package io.sentry.android.ndk;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.sentry.android.ndk.NdkScopeObserver f23459i;
    public final /* synthetic */ java.lang.String j;

    public /* synthetic */ b(io.sentry.android.ndk.NdkScopeObserver ndkScopeObserver, java.lang.String str, int i3) {
        this.f23458h = i3;
        this.f23459i = ndkScopeObserver;
        this.j = str;
    }

    @Override // java.lang.Runnable
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
