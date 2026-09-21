package androidx.media3.exoplayer.scheduler;

/* JADX INFO: loaded from: classes.dex */
public final class RequirementsWatcher {
    private final android.content.Context context;
    private final android.os.Handler handler = androidx.media3.common.util.Util.createHandlerForCurrentOrMainLooper();
    private final androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener listener;
    private androidx.media3.exoplayer.scheduler.RequirementsWatcher.NetworkCallback networkCallback;
    private int notMetRequirements;
    private androidx.media3.exoplayer.scheduler.RequirementsWatcher.DeviceStatusChangeReceiver receiver;
    private final androidx.media3.exoplayer.scheduler.Requirements requirements;

    public class DeviceStatusChangeReceiver extends android.content.BroadcastReceiver {
        private DeviceStatusChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            androidx.media3.exoplayer.scheduler.RequirementsWatcher.this.checkRequirements();
        }
    }

    public interface Listener {
        void onRequirementsStateChanged(androidx.media3.exoplayer.scheduler.RequirementsWatcher requirementsWatcher, int i3);
    }

    public final class NetworkCallback extends android.net.ConnectivityManager.NetworkCallback {
        private boolean networkValidated;
        private boolean receivedCapabilitiesChange;

        private NetworkCallback() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$postCheckRequirements$0() {
            if (androidx.media3.exoplayer.scheduler.RequirementsWatcher.this.networkCallback != null) {
                androidx.media3.exoplayer.scheduler.RequirementsWatcher.this.checkRequirements();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$postRecheckNotMetNetworkRequirements$1() {
            if (androidx.media3.exoplayer.scheduler.RequirementsWatcher.this.networkCallback != null) {
                androidx.media3.exoplayer.scheduler.RequirementsWatcher.this.recheckNotMetNetworkRequirements();
            }
        }

        private void postCheckRequirements() {
            androidx.media3.exoplayer.scheduler.RequirementsWatcher.this.handler.post(new androidx.media3.exoplayer.scheduler.b(this, 0));
        }

        private void postRecheckNotMetNetworkRequirements() {
            androidx.media3.exoplayer.scheduler.RequirementsWatcher.this.handler.post(new androidx.media3.exoplayer.scheduler.b(this, 1));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network network) {
            postCheckRequirements();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(android.net.Network network, boolean z6) {
            if (z6) {
                return;
            }
            postRecheckNotMetNetworkRequirements();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.receivedCapabilitiesChange && this.networkValidated == zHasCapability) {
                if (zHasCapability) {
                    postRecheckNotMetNetworkRequirements();
                }
            } else {
                this.receivedCapabilitiesChange = true;
                this.networkValidated = zHasCapability;
                postCheckRequirements();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network network) {
            postCheckRequirements();
        }
    }

    public RequirementsWatcher(android.content.Context context, androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener listener, androidx.media3.exoplayer.scheduler.Requirements requirements) {
        this.context = context.getApplicationContext();
        this.listener = listener;
        this.requirements = requirements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkRequirements() {
        int notMetRequirements = this.requirements.getNotMetRequirements(this.context);
        if (this.notMetRequirements != notMetRequirements) {
            this.notMetRequirements = notMetRequirements;
            this.listener.onRequirementsStateChanged(this, notMetRequirements);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recheckNotMetNetworkRequirements() {
        if ((this.notMetRequirements & 3) == 0) {
            return;
        }
        checkRequirements();
    }

    private void registerNetworkCallbackV24() {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) this.context.getSystemService("connectivity");
        connectivityManager.getClass();
        androidx.media3.exoplayer.scheduler.RequirementsWatcher.NetworkCallback networkCallback = new androidx.media3.exoplayer.scheduler.RequirementsWatcher.NetworkCallback();
        this.networkCallback = networkCallback;
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }

    private void unregisterNetworkCallbackV24() {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) this.context.getSystemService("connectivity");
        connectivityManager.getClass();
        androidx.media3.exoplayer.scheduler.RequirementsWatcher.NetworkCallback networkCallback = this.networkCallback;
        networkCallback.getClass();
        connectivityManager.unregisterNetworkCallback(networkCallback);
        this.networkCallback = null;
    }

    public androidx.media3.exoplayer.scheduler.Requirements getRequirements() {
        return this.requirements;
    }

    public int start() {
        this.notMetRequirements = this.requirements.getNotMetRequirements(this.context);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        if (this.requirements.isNetworkRequired()) {
            registerNetworkCallbackV24();
        }
        if (this.requirements.isChargingRequired()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.requirements.isIdleRequired()) {
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        if (this.requirements.isStorageNotLowRequired()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        androidx.media3.exoplayer.scheduler.RequirementsWatcher.DeviceStatusChangeReceiver deviceStatusChangeReceiver = new androidx.media3.exoplayer.scheduler.RequirementsWatcher.DeviceStatusChangeReceiver();
        this.receiver = deviceStatusChangeReceiver;
        this.context.registerReceiver(deviceStatusChangeReceiver, intentFilter, null, this.handler);
        return this.notMetRequirements;
    }

    public void stop() {
        android.content.Context context = this.context;
        androidx.media3.exoplayer.scheduler.RequirementsWatcher.DeviceStatusChangeReceiver deviceStatusChangeReceiver = this.receiver;
        deviceStatusChangeReceiver.getClass();
        context.unregisterReceiver(deviceStatusChangeReceiver);
        this.receiver = null;
        if (this.networkCallback != null) {
            unregisterNetworkCallbackV24();
        }
    }
}
