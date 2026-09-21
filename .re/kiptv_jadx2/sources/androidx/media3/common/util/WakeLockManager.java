package androidx.media3.common.util;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import java.util.concurrent.atomic.AtomicBoolean;

public final class WakeLockManager {
    private static final String TAG = "WakeLockManager";
    private static final int UNREACTIVE_WAKELOCK_HANDLER_RELEASE_DELAY_MS = 1000;
    private static final String WAKE_LOCK_TAG = "ExoPlayer:WakeLockManager";
    private boolean enabled;
    private final HandlerWrapper mainHandler;
    private boolean stayAwake;
    private final HandlerWrapper wakeLockHandler;
    private final WakeLockManagerInternal wakeLockManagerInternal;

    public static final class WakeLockManagerInternal {
        private final Context applicationContext;
        private PowerManager.WakeLock wakeLock;

        public WakeLockManagerInternal(Context context) {
            this.applicationContext = context;
        }

        public void forceReleaseWakeLock(AtomicBoolean atomicBoolean) {
            if (atomicBoolean.get()) {
                new Thread(new f(this, atomicBoolean, 1), WakeLockManager.WAKE_LOCK_TAG).start();
            }
        }

        public synchronized void lambda$forceReleaseWakeLock$0(AtomicBoolean atomicBoolean) {
            PowerManager.WakeLock wakeLock;
            if (atomicBoolean.get() && (wakeLock = this.wakeLock) != null) {
                wakeLock.release();
            }
        }

        public synchronized void updateWakeLock(boolean z6, boolean z9) {
            if (z6) {
                if (this.wakeLock == null) {
                    if (this.applicationContext.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        Log.w(WakeLockManager.TAG, "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) this.applicationContext.getSystemService("power");
                    if (powerManager == null) {
                        Log.w(WakeLockManager.TAG, "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, WakeLockManager.WAKE_LOCK_TAG);
                        this.wakeLock = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            if (this.wakeLock == null) {
                return;
            }
            if (WakeLockManager.shouldAcquireWakelock(z6, z9)) {
                this.wakeLock.acquire();
            } else {
                this.wakeLock.release();
            }
        }
    }

    public WakeLockManager(Context context, Looper looper, Clock clock) {
        this.wakeLockManagerInternal = new WakeLockManagerInternal(context.getApplicationContext());
        this.wakeLockHandler = clock.createHandler(looper, null);
        this.mainHandler = clock.createHandler(Looper.getMainLooper(), null);
    }

    public void lambda$postUpdateWakeLock$0(boolean z6, boolean z9) {
        this.wakeLockManagerInternal.updateWakeLock(z6, z9);
    }

    public void lambda$postUpdateWakeLock$1(AtomicBoolean atomicBoolean) {
        this.wakeLockManagerInternal.forceReleaseWakeLock(atomicBoolean);
    }

    public void lambda$postUpdateWakeLock$2(AtomicBoolean atomicBoolean, boolean z6, boolean z9) {
        atomicBoolean.set(false);
        this.wakeLockManagerInternal.updateWakeLock(z6, z9);
    }

    private void postUpdateWakeLock(boolean z6, boolean z9) {
        if (shouldAcquireWakelock(z6, z9)) {
            this.wakeLockHandler.post(new h(this, z6, z9, 0));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.mainHandler.postDelayed(new f(this, atomicBoolean, 6), 1000L);
        this.wakeLockHandler.post(new i(this, atomicBoolean, z6, z9, 0));
    }

    public static boolean shouldAcquireWakelock(boolean z6, boolean z9) {
        return z6 && z9;
    }

    public void setEnabled(boolean z6) {
        if (this.enabled == z6) {
            return;
        }
        this.enabled = z6;
        postUpdateWakeLock(z6, this.stayAwake);
    }

    public void setStayAwake(boolean z6) {
        if (this.stayAwake == z6) {
            return;
        }
        this.stayAwake = z6;
        if (this.enabled) {
            postUpdateWakeLock(true, z6);
        }
    }
}
