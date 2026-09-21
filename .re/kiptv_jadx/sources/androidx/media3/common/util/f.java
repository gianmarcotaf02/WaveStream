package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16461i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ f(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f16460h = i3;
        this.f16461i = obj;
        this.j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16460h) {
            case 0:
                ((androidx.media3.common.util.NetworkTypeObserver.Receiver) this.f16461i).lambda$onReceive$0((android.content.Context) this.j);
                break;
            case 1:
                ((androidx.media3.common.util.WakeLockManager.WakeLockManagerInternal) this.f16461i).lambda$forceReleaseWakeLock$0((java.util.concurrent.atomic.AtomicBoolean) this.j);
                break;
            case 2:
                ((androidx.media3.common.util.WifiLockManager.WifiLockManagerInternal) this.f16461i).lambda$forceReleaseWifiLock$0((java.util.concurrent.atomic.AtomicBoolean) this.j);
                break;
            case 3:
                ((androidx.media3.common.util.BackgroundThreadStateHandler) this.f16461i).lambda$updateStateAsync$1((p068h4.j) this.j);
                break;
            case 4:
                ((androidx.media3.common.util.NetworkTypeObserver) this.f16461i).lambda$new$0((android.content.Context) this.j);
                break;
            case 5:
                androidx.media3.common.util.Util.lambda$transformFutureAsync$1((com.google.common.util.concurrent.Q) this.f16461i, (com.google.common.util.concurrent.J) this.j);
                break;
            case 6:
                ((androidx.media3.common.util.WakeLockManager) this.f16461i).lambda$postUpdateWakeLock$1((java.util.concurrent.atomic.AtomicBoolean) this.j);
                break;
            default:
                ((androidx.media3.common.util.WifiLockManager) this.f16461i).lambda$postUpdateWifiLock$1((java.util.concurrent.atomic.AtomicBoolean) this.j);
                break;
        }
    }
}
