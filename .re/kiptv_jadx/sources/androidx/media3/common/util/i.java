package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f16468i;
    public final /* synthetic */ boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f16469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16470l;

    public /* synthetic */ i(java.lang.Object obj, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, boolean z6, boolean z9, int i3) {
        this.f16467h = i3;
        this.f16470l = obj;
        this.f16468i = atomicBoolean;
        this.j = z6;
        this.f16469k = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16467h) {
            case 0:
                ((androidx.media3.common.util.WakeLockManager) this.f16470l).lambda$postUpdateWakeLock$2(this.f16468i, this.j, this.f16469k);
                break;
            default:
                ((androidx.media3.common.util.WifiLockManager) this.f16470l).lambda$postUpdateWifiLock$2(this.f16468i, this.j, this.f16469k);
                break;
        }
    }
}
