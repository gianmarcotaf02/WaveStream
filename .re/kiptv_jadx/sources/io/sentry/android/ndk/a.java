package io.sentry.android.ndk;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.sentry.android.ndk.NdkScopeObserver f23456i;
    public final /* synthetic */ java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f23457k;

    public /* synthetic */ a(io.sentry.android.ndk.NdkScopeObserver ndkScopeObserver, java.lang.String str, java.lang.String str2, int i3) {
        this.f23455h = i3;
        this.f23456i = ndkScopeObserver;
        this.j = str;
        this.f23457k = str2;
    }

    @Override // java.lang.Runnable
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
