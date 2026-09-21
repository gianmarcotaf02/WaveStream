package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkTypeObserver {
    private static androidx.media3.common.util.NetworkTypeObserver staticInstance;
    private final java.util.concurrent.Executor backgroundExecutor;
    private boolean isInitialized;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.media3.common.util.NetworkTypeObserver.ListenerHolder> listeners;
    private final java.lang.Object lock;
    private int networkType;

    public static final class Api31 {

        public static final class DisplayInfoCallback extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.DisplayInfoListener {
            private final androidx.media3.common.util.NetworkTypeObserver instance;

            public DisplayInfoCallback(androidx.media3.common.util.NetworkTypeObserver networkTypeObserver) {
                this.instance = networkTypeObserver;
            }

            public void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.instance.updateNetworkType(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        private Api31() {
        }

        public static void disambiguate4gAnd5gNsa(android.content.Context context, androidx.media3.common.util.NetworkTypeObserver networkTypeObserver) {
            try {
                android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
                telephonyManager.getClass();
                androidx.media3.common.util.NetworkTypeObserver.Api31.DisplayInfoCallback displayInfoCallback = new androidx.media3.common.util.NetworkTypeObserver.Api31.DisplayInfoCallback(networkTypeObserver);
                telephonyManager.registerTelephonyCallback(networkTypeObserver.backgroundExecutor, displayInfoCallback);
                telephonyManager.unregisterTelephonyCallback(displayInfoCallback);
            } catch (java.lang.RuntimeException unused) {
                networkTypeObserver.updateNetworkType(5);
            }
        }
    }

    public interface Listener {
        void onNetworkTypeChanged(int i3);
    }

    public final class ListenerHolder {
        private final java.util.concurrent.Executor executor;
        private final java.lang.ref.WeakReference<androidx.media3.common.util.NetworkTypeObserver.Listener> listener;

        public ListenerHolder(androidx.media3.common.util.NetworkTypeObserver.Listener listener, java.util.concurrent.Executor executor) {
            this.listener = new java.lang.ref.WeakReference<>(listener);
            this.executor = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$callOnNetworkTypeChanged$0() {
            androidx.media3.common.util.NetworkTypeObserver.Listener listener = this.listener.get();
            if (listener != null) {
                listener.onNetworkTypeChanged(androidx.media3.common.util.NetworkTypeObserver.this.getNetworkType());
            }
        }

        public void callOnNetworkTypeChanged() {
            this.executor.execute(new java.lang.Runnable() { // from class: androidx.media3.common.util.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16459h.lambda$callOnNetworkTypeChanged$0();
                }
            });
        }

        public boolean canBeRemoved() {
            return this.listener.get() == null;
        }
    }

    public final class Receiver extends android.content.BroadcastReceiver {
        private Receiver() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$0(android.content.Context context) {
            androidx.media3.common.util.NetworkTypeObserver.this.handleConnectivityActionBroadcast(context);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            androidx.media3.common.util.NetworkTypeObserver.this.backgroundExecutor.execute(new androidx.media3.common.util.f(this, context, 0));
        }
    }

    private NetworkTypeObserver(android.content.Context context) {
        java.util.concurrent.Executor executor = androidx.media3.common.util.BackgroundExecutor.get();
        this.backgroundExecutor = executor;
        this.listeners = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.lock = new java.lang.Object();
        this.networkType = 0;
        executor.execute(new androidx.media3.common.util.f(this, context, 4));
    }

    public static synchronized androidx.media3.common.util.NetworkTypeObserver getInstance(android.content.Context context) {
        try {
            if (staticInstance == null) {
                staticInstance = new androidx.media3.common.util.NetworkTypeObserver(context);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return staticInstance;
    }

    private static int getMobileNetworkType(android.net.NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return android.os.Build.VERSION.SDK_INT >= 29 ? 9 : 0;
        }
    }

    private static int getNetworkTypeFromConnectivityManager(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        int i3 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i3 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return getMobileNetworkType(activeNetworkInfo);
            }
        } catch (java.lang.SecurityException unused) {
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleConnectivityActionBroadcast(android.content.Context context) {
        int networkTypeFromConnectivityManager = getNetworkTypeFromConnectivityManager(context);
        if (android.os.Build.VERSION.SDK_INT < 31 || networkTypeFromConnectivityManager != 5) {
            updateNetworkType(networkTypeFromConnectivityManager);
        } else {
            androidx.media3.common.util.NetworkTypeObserver.Api31.disambiguate4gAnd5gNsa(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init, reason: merged with bridge method [inline-methods] */
    public void lambda$new$0(android.content.Context context) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new androidx.media3.common.util.NetworkTypeObserver.Receiver(), intentFilter);
    }

    private void removeClearedReferences() {
        for (androidx.media3.common.util.NetworkTypeObserver.ListenerHolder listenerHolder : this.listeners) {
            if (listenerHolder.canBeRemoved()) {
                this.listeners.remove(listenerHolder);
            }
        }
    }

    public static synchronized void resetForTests() {
        staticInstance = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNetworkType(int i3) {
        removeClearedReferences();
        synchronized (this.lock) {
            try {
                if (this.isInitialized && this.networkType == i3) {
                    return;
                }
                this.isInitialized = true;
                this.networkType = i3;
                java.util.Iterator<androidx.media3.common.util.NetworkTypeObserver.ListenerHolder> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().callOnNetworkTypeChanged();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public int getNetworkType() {
        int i3;
        synchronized (this.lock) {
            i3 = this.networkType;
        }
        return i3;
    }

    @java.lang.Deprecated
    public void register(androidx.media3.common.util.NetworkTypeObserver.Listener listener) {
        register(listener, new androidx.media3.common.util.d(new android.os.Handler(android.os.Looper.getMainLooper())));
    }

    public void register(androidx.media3.common.util.NetworkTypeObserver.Listener listener, java.util.concurrent.Executor executor) {
        boolean z6;
        removeClearedReferences();
        androidx.media3.common.util.NetworkTypeObserver.ListenerHolder listenerHolder = new androidx.media3.common.util.NetworkTypeObserver.ListenerHolder(listener, executor);
        synchronized (this.lock) {
            this.listeners.add(listenerHolder);
            z6 = this.isInitialized;
        }
        if (z6) {
            listenerHolder.callOnNetworkTypeChanged();
        }
    }
}
