package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f16465i;
    public final /* synthetic */ boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16466k;

    public /* synthetic */ h(java.lang.Object obj, boolean z6, boolean z9, int i3) {
        this.f16464h = i3;
        this.f16466k = obj;
        this.f16465i = z6;
        this.j = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16464h) {
            case 0:
                ((androidx.media3.common.util.WakeLockManager) this.f16466k).lambda$postUpdateWakeLock$0(this.f16465i, this.j);
                break;
            default:
                ((androidx.media3.common.util.WifiLockManager) this.f16466k).lambda$postUpdateWifiLock$0(this.f16465i, this.j);
                break;
        }
    }
}
