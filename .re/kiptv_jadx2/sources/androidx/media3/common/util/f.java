package androidx.media3.common.util;

import android.content.Context;
import com.google.common.util.concurrent.J;
import com.google.common.util.concurrent.Q;
import java.util.concurrent.atomic.AtomicBoolean;
import p068h4.j;

public final class f implements Runnable {

    public final int f16460h;

    public final Object f16461i;
    public final Object j;

    public f(Object obj, Object obj2, int i3) {
        this.f16460h = i3;
        this.f16461i = obj;
        this.j = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16460h) {
            case 0:
                ((NetworkTypeObserver.Receiver) this.f16461i).lambda$onReceive$0((Context) this.j);
                break;
            case 1:
                ((WakeLockManager.WakeLockManagerInternal) this.f16461i).lambda$forceReleaseWakeLock$0((AtomicBoolean) this.j);
                break;
            case 2:
                ((WifiLockManager.WifiLockManagerInternal) this.f16461i).lambda$forceReleaseWifiLock$0((AtomicBoolean) this.j);
                break;
            case 3:
                ((BackgroundThreadStateHandler) this.f16461i).lambda$updateStateAsync$1((j) this.j);
                break;
            case 4:
                ((NetworkTypeObserver) this.f16461i).lambda$new$0((Context) this.j);
                break;
            case 5:
                Util.lambda$transformFutureAsync$1((Q) this.f16461i, (J) this.j);
                break;
            case 6:
                ((WakeLockManager) this.f16461i).lambda$postUpdateWakeLock$1((AtomicBoolean) this.j);
                break;
            default:
                ((WifiLockManager) this.f16461i).lambda$postUpdateWifiLock$1((AtomicBoolean) this.j);
                break;
        }
    }
}
