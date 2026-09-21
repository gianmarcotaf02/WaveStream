package androidx.media3.common.util;

import java.util.concurrent.atomic.AtomicBoolean;

public final class i implements Runnable {

    public final int f16467h;

    public final AtomicBoolean f16468i;
    public final boolean j;

    public final boolean f16469k;

    public final Object f16470l;

    public i(Object obj, AtomicBoolean atomicBoolean, boolean z6, boolean z9, int i3) {
        this.f16467h = i3;
        this.f16470l = obj;
        this.f16468i = atomicBoolean;
        this.j = z6;
        this.f16469k = z9;
    }

    @Override
    public final void run() {
        switch (this.f16467h) {
            case 0:
                ((WakeLockManager) this.f16470l).lambda$postUpdateWakeLock$2(this.f16468i, this.j, this.f16469k);
                break;
            default:
                ((WifiLockManager) this.f16470l).lambda$postUpdateWifiLock$2(this.f16468i, this.j, this.f16469k);
                break;
        }
    }
}
