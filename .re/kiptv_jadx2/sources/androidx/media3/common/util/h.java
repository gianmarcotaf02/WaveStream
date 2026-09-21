package androidx.media3.common.util;

public final class h implements Runnable {

    public final int f16464h;

    public final boolean f16465i;
    public final boolean j;

    public final Object f16466k;

    public h(Object obj, boolean z6, boolean z9, int i3) {
        this.f16464h = i3;
        this.f16466k = obj;
        this.f16465i = z6;
        this.j = z9;
    }

    @Override
    public final void run() {
        switch (this.f16464h) {
            case 0:
                ((WakeLockManager) this.f16466k).lambda$postUpdateWakeLock$0(this.f16465i, this.j);
                break;
            default:
                ((WifiLockManager) this.f16466k).lambda$postUpdateWifiLock$0(this.f16465i, this.j);
                break;
        }
    }
}
