package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class WakeLockManager {
    private static final java.lang.String TAG = "WakeLockManager";
    private static final int UNREACTIVE_WAKELOCK_HANDLER_RELEASE_DELAY_MS = 1000;
    private static final java.lang.String WAKE_LOCK_TAG = "ExoPlayer:WakeLockManager";
    private boolean enabled;
    private final androidx.media3.common.util.HandlerWrapper mainHandler;
    private boolean stayAwake;
    private final androidx.media3.common.util.HandlerWrapper wakeLockHandler;
    private final androidx.media3.common.util.WakeLockManager.WakeLockManagerInternal wakeLockManagerInternal;

    public static final class WakeLockManagerInternal {
        private final android.content.Context applicationContext;
        private android.os.PowerManager.WakeLock wakeLock;

        public WakeLockManagerInternal(android.content.Context context) {
            this.applicationContext = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void forceReleaseWakeLock(java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
            if (atomicBoolean.get()) {
                new java.lang.Thread(new androidx.media3.common.util.f(this, atomicBoolean, 1), androidx.media3.common.util.WakeLockManager.WAKE_LOCK_TAG).start();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: forceReleaseWakeLockInternal, reason: merged with bridge method [inline-methods] */
        public synchronized void lambda$forceReleaseWakeLock$0(java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
            android.os.PowerManager.WakeLock wakeLock;
            if (atomicBoolean.get() && (wakeLock = this.wakeLock) != null) {
                wakeLock.release();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void updateWakeLock(boolean z6, boolean z9) {
            if (z6) {
                if (this.wakeLock == null) {
                    if (this.applicationContext.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        androidx.media3.common.util.Log.w(androidx.media3.common.util.WakeLockManager.TAG, "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    android.os.PowerManager powerManager = (android.os.PowerManager) this.applicationContext.getSystemService("power");
                    if (powerManager == null) {
                        androidx.media3.common.util.Log.w(androidx.media3.common.util.WakeLockManager.TAG, "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        android.os.PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, androidx.media3.common.util.WakeLockManager.WAKE_LOCK_TAG);
                        this.wakeLock = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            if (this.wakeLock == null) {
                return;
            }
            if (androidx.media3.common.util.WakeLockManager.shouldAcquireWakelock(z6, z9)) {
                this.wakeLock.acquire();
            } else {
                this.wakeLock.release();
            }
        }
    }

    public WakeLockManager(android.content.Context context, android.os.Looper looper, androidx.media3.common.util.Clock clock) {
        this.wakeLockManagerInternal = new androidx.media3.common.util.WakeLockManager.WakeLockManagerInternal(context.getApplicationContext());
        this.wakeLockHandler = clock.createHandler(looper, null);
        this.mainHandler = clock.createHandler(android.os.Looper.getMainLooper(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWakeLock$0(boolean z6, boolean z9) {
        this.wakeLockManagerInternal.updateWakeLock(z6, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWakeLock$1(java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        this.wakeLockManagerInternal.forceReleaseWakeLock(atomicBoolean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWakeLock$2(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, boolean z6, boolean z9) {
        atomicBoolean.set(false);
        this.wakeLockManagerInternal.updateWakeLock(z6, z9);
    }

    private void postUpdateWakeLock(boolean z6, boolean z9) {
        if (shouldAcquireWakelock(z6, z9)) {
            this.wakeLockHandler.post(new androidx.media3.common.util.h(this, z6, z9, 0));
            return;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.mainHandler.postDelayed(new androidx.media3.common.util.f(this, atomicBoolean, 6), 1000L);
        this.wakeLockHandler.post(new androidx.media3.common.util.i(this, atomicBoolean, z6, z9, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
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
