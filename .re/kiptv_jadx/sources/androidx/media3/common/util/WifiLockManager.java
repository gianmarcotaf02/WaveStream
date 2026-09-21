package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class WifiLockManager {
    private static final java.lang.String TAG = "WifiLockManager";
    private static final int UNREACTIVE_WIFILOCK_HANDLER_RELEASE_DELAY_MS = 1000;
    private static final java.lang.String WIFI_LOCK_TAG = "ExoPlayer:WifiLockManager";
    private boolean enabled;
    private final androidx.media3.common.util.HandlerWrapper mainHandler;
    private boolean stayAwake;
    private final androidx.media3.common.util.HandlerWrapper wifiLockHandler;
    private final androidx.media3.common.util.WifiLockManager.WifiLockManagerInternal wifiLockManagerInternal;

    public static final class WifiLockManagerInternal {
        private final android.content.Context applicationContext;
        private android.net.wifi.WifiManager.WifiLock wifiLock;

        public WifiLockManagerInternal(android.content.Context context) {
            this.applicationContext = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void forceReleaseWifiLock(java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
            if (atomicBoolean.get()) {
                new java.lang.Thread(new androidx.media3.common.util.f(this, atomicBoolean, 2), androidx.media3.common.util.WifiLockManager.WIFI_LOCK_TAG).start();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: forceReleaseWifiLockInternal, reason: merged with bridge method [inline-methods] */
        public synchronized void lambda$forceReleaseWifiLock$0(java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
            android.net.wifi.WifiManager.WifiLock wifiLock;
            if (atomicBoolean.get() && (wifiLock = this.wifiLock) != null) {
                wifiLock.release();
            }
        }

        public void updateWifiLock(boolean z6, boolean z9) {
            if (z6 && this.wifiLock == null) {
                if (this.applicationContext.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    androidx.media3.common.util.Log.w(androidx.media3.common.util.WifiLockManager.TAG, "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) this.applicationContext.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    androidx.media3.common.util.Log.w(androidx.media3.common.util.WifiLockManager.TAG, "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    android.net.wifi.WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, androidx.media3.common.util.WifiLockManager.WIFI_LOCK_TAG);
                    this.wifiLock = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            if (this.wifiLock == null) {
                return;
            }
            if (androidx.media3.common.util.WifiLockManager.shouldAcquireWifilock(z6, z9)) {
                this.wifiLock.acquire();
            } else {
                this.wifiLock.release();
            }
        }
    }

    public WifiLockManager(android.content.Context context, android.os.Looper looper, androidx.media3.common.util.Clock clock) {
        this.wifiLockManagerInternal = new androidx.media3.common.util.WifiLockManager.WifiLockManagerInternal(context.getApplicationContext());
        this.wifiLockHandler = clock.createHandler(looper, null);
        this.mainHandler = clock.createHandler(android.os.Looper.getMainLooper(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWifiLock$0(boolean z6, boolean z9) {
        this.wifiLockManagerInternal.updateWifiLock(z6, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWifiLock$1(java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        this.wifiLockManagerInternal.forceReleaseWifiLock(atomicBoolean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWifiLock$2(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, boolean z6, boolean z9) {
        atomicBoolean.set(false);
        this.wifiLockManagerInternal.updateWifiLock(z6, z9);
    }

    private void postUpdateWifiLock(boolean z6, boolean z9) {
        if (shouldAcquireWifilock(z6, z9)) {
            this.wifiLockHandler.post(new androidx.media3.common.util.h(this, z6, z9, 1));
            return;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.mainHandler.postDelayed(new androidx.media3.common.util.f(this, atomicBoolean, 7), 1000L);
        this.wifiLockHandler.post(new androidx.media3.common.util.i(this, atomicBoolean, z6, z9, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldAcquireWifilock(boolean z6, boolean z9) {
        return z6 && z9;
    }

    public void setEnabled(boolean z6) {
        if (this.enabled == z6) {
            return;
        }
        this.enabled = z6;
        postUpdateWifiLock(z6, this.stayAwake);
    }

    public void setStayAwake(boolean z6) {
        if (this.stayAwake == z6) {
            return;
        }
        this.stayAwake = z6;
        if (this.enabled) {
            postUpdateWifiLock(true, z6);
        }
    }
}
