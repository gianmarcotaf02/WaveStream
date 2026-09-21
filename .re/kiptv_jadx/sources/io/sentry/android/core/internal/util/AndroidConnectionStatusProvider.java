package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidConnectionStatusProvider implements io.sentry.IConnectionStatusProvider {
    private final io.sentry.android.core.BuildInfoProvider buildInfoProvider;
    private final android.content.Context context;
    private final io.sentry.ILogger logger;
    private volatile android.net.ConnectivityManager.NetworkCallback networkCallback;
    private final io.sentry.util.AutoClosableReentrantLock lock = new io.sentry.util.AutoClosableReentrantLock();
    private final java.util.List<io.sentry.IConnectionStatusProvider.IConnectionStatusObserver> connectionStatusObservers = new java.util.ArrayList();

    public AndroidConnectionStatusProvider(android.content.Context context, io.sentry.ILogger iLogger, io.sentry.android.core.BuildInfoProvider buildInfoProvider) {
        this.context = io.sentry.android.core.ContextUtils.getApplicationContext(context);
        this.logger = iLogger;
        this.buildInfoProvider = buildInfoProvider;
    }

    private static android.net.ConnectivityManager getConnectivityManager(android.content.Context context, io.sentry.ILogger iLogger) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            iLogger.log(io.sentry.SentryLevel.INFO, "ConnectivityManager is null and cannot check network status", new java.lang.Object[0]);
        }
        return connectivityManager;
    }

    public static boolean registerNetworkCallback(android.content.Context context, io.sentry.ILogger iLogger, io.sentry.android.core.BuildInfoProvider buildInfoProvider, android.net.ConnectivityManager.NetworkCallback networkCallback) {
        if (buildInfoProvider.getSdkInfoVersion() < 24) {
            iLogger.log(io.sentry.SentryLevel.DEBUG, "NetworkCallbacks need Android N+.", new java.lang.Object[0]);
            return false;
        }
        android.net.ConnectivityManager connectivityManager = getConnectivityManager(context, iLogger);
        if (connectivityManager == null) {
            return false;
        }
        if (!io.sentry.android.core.internal.util.Permissions.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.log(io.sentry.SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new java.lang.Object[0]);
            return false;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (java.lang.Throwable th) {
            iLogger.log(io.sentry.SentryLevel.WARNING, "registerDefaultNetworkCallback failed", th);
            return false;
        }
    }

    public static void unregisterNetworkCallback(android.content.Context context, io.sentry.ILogger iLogger, android.net.ConnectivityManager.NetworkCallback networkCallback) {
        android.net.ConnectivityManager connectivityManager = getConnectivityManager(context, iLogger);
        if (connectivityManager == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(networkCallback);
        } catch (java.lang.Throwable th) {
            iLogger.log(io.sentry.SentryLevel.WARNING, "unregisterNetworkCallback failed", th);
        }
    }

    @Override // io.sentry.IConnectionStatusProvider
    public boolean addConnectionStatusObserver(io.sentry.IConnectionStatusProvider.IConnectionStatusObserver iConnectionStatusObserver) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.connectionStatusObservers.add(iConnectionStatusObserver);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            if (this.networkCallback == null) {
                io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire2 = this.lock.acquire();
                try {
                    if (this.networkCallback == null) {
                        android.net.ConnectivityManager.NetworkCallback networkCallback = new android.net.ConnectivityManager.NetworkCallback() { // from class: io.sentry.android.core.internal.util.AndroidConnectionStatusProvider.1
                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public void onAvailable(android.net.Network network) {
                                updateObservers();
                            }

                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public void onLost(android.net.Network network) {
                                updateObservers();
                            }

                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public void onUnavailable() {
                                updateObservers();
                            }

                            public void updateObservers() {
                                io.sentry.IConnectionStatusProvider.ConnectionStatus connectionStatus = io.sentry.android.core.internal.util.AndroidConnectionStatusProvider.this.getConnectionStatus();
                                io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire3 = io.sentry.android.core.internal.util.AndroidConnectionStatusProvider.this.lock.acquire();
                                try {
                                    java.util.Iterator it = io.sentry.android.core.internal.util.AndroidConnectionStatusProvider.this.connectionStatusObservers.iterator();
                                    while (it.hasNext()) {
                                        ((io.sentry.IConnectionStatusProvider.IConnectionStatusObserver) it.next()).onConnectionStatusChanged(connectionStatus);
                                    }
                                    if (iSentryLifecycleTokenAcquire3 != null) {
                                        iSentryLifecycleTokenAcquire3.close();
                                    }
                                } catch (java.lang.Throwable th) {
                                    if (iSentryLifecycleTokenAcquire3 != null) {
                                        try {
                                            iSentryLifecycleTokenAcquire3.close();
                                        } catch (java.lang.Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                        };
                        if (!registerNetworkCallback(this.context, this.logger, this.buildInfoProvider, networkCallback)) {
                            if (iSentryLifecycleTokenAcquire2 != null) {
                                iSentryLifecycleTokenAcquire2.close();
                            }
                            return false;
                        }
                        this.networkCallback = networkCallback;
                        if (iSentryLifecycleTokenAcquire2 != null) {
                            iSentryLifecycleTokenAcquire2.close();
                        }
                        return true;
                    }
                    if (iSentryLifecycleTokenAcquire2 != null) {
                        iSentryLifecycleTokenAcquire2.close();
                    }
                } catch (java.lang.Throwable th) {
                    if (iSentryLifecycleTokenAcquire2 != null) {
                        try {
                            iSentryLifecycleTokenAcquire2.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            return true;
        } catch (java.lang.Throwable th3) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // io.sentry.IConnectionStatusProvider
    public io.sentry.IConnectionStatusProvider.ConnectionStatus getConnectionStatus() {
        android.net.ConnectivityManager connectivityManager = getConnectivityManager(this.context, this.logger);
        return connectivityManager == null ? io.sentry.IConnectionStatusProvider.ConnectionStatus.UNKNOWN : getConnectionStatus(this.context, connectivityManager, this.logger);
    }

    @Override // io.sentry.IConnectionStatusProvider
    public java.lang.String getConnectionType() {
        return getConnectionType(this.context, this.logger, this.buildInfoProvider);
    }

    public android.net.ConnectivityManager.NetworkCallback getNetworkCallback() {
        return this.networkCallback;
    }

    public java.util.List<io.sentry.IConnectionStatusProvider.IConnectionStatusObserver> getStatusObservers() {
        return this.connectionStatusObservers;
    }

    @Override // io.sentry.IConnectionStatusProvider
    public void removeConnectionStatusObserver(io.sentry.IConnectionStatusProvider.IConnectionStatusObserver iConnectionStatusObserver) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.connectionStatusObservers.remove(iConnectionStatusObserver);
            if (this.connectionStatusObservers.isEmpty() && this.networkCallback != null) {
                unregisterNetworkCallback(this.context, this.logger, this.networkCallback);
                this.networkCallback = null;
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static java.lang.String getConnectionType(android.content.Context context, io.sentry.ILogger iLogger, io.sentry.android.core.BuildInfoProvider buildInfoProvider) {
        android.net.ConnectivityManager connectivityManager = getConnectivityManager(context, iLogger);
        if (connectivityManager == null) {
            return null;
        }
        boolean zHasTransport = false;
        if (!io.sentry.android.core.internal.util.Permissions.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.log(io.sentry.SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new java.lang.Object[0]);
            return null;
        }
        try {
            boolean zHasTransport2 = true;
            if (buildInfoProvider.getSdkInfoVersion() >= 23) {
                android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork == null) {
                    iLogger.log(io.sentry.SentryLevel.INFO, "Network is null and cannot check network status", new java.lang.Object[0]);
                    return null;
                }
                android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    iLogger.log(io.sentry.SentryLevel.INFO, "NetworkCapabilities is null and cannot check network type", new java.lang.Object[0]);
                    return null;
                }
                boolean zHasTransport3 = networkCapabilities.hasTransport(3);
                zHasTransport = networkCapabilities.hasTransport(1);
                zHasTransport2 = networkCapabilities.hasTransport(0);
                zHasTransport = zHasTransport3;
            } else {
                android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    iLogger.log(io.sentry.SentryLevel.INFO, "NetworkInfo is null, there's no active network.", new java.lang.Object[0]);
                    return null;
                }
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    zHasTransport = false;
                } else if (type != 1) {
                    if (type == 9) {
                        zHasTransport = true;
                    }
                    zHasTransport2 = zHasTransport;
                } else {
                    zHasTransport = true;
                    zHasTransport2 = false;
                }
            }
            if (zHasTransport) {
                return "ethernet";
            }
            if (zHasTransport) {
                return "wifi";
            }
            if (zHasTransport2) {
                return "cellular";
            }
            return null;
        } catch (java.lang.Throwable th) {
            iLogger.log(io.sentry.SentryLevel.ERROR, "Failed to retrieve network info", th);
        }
    }

    private static io.sentry.IConnectionStatusProvider.ConnectionStatus getConnectionStatus(android.content.Context context, android.net.ConnectivityManager connectivityManager, io.sentry.ILogger iLogger) {
        if (!io.sentry.android.core.internal.util.Permissions.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.log(io.sentry.SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new java.lang.Object[0]);
            return io.sentry.IConnectionStatusProvider.ConnectionStatus.NO_PERMISSION;
        }
        try {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                iLogger.log(io.sentry.SentryLevel.INFO, "NetworkInfo is null, there's no active network.", new java.lang.Object[0]);
                return io.sentry.IConnectionStatusProvider.ConnectionStatus.DISCONNECTED;
            }
            if (activeNetworkInfo.isConnected()) {
                return io.sentry.IConnectionStatusProvider.ConnectionStatus.CONNECTED;
            }
            return io.sentry.IConnectionStatusProvider.ConnectionStatus.DISCONNECTED;
        } catch (java.lang.Throwable th) {
            iLogger.log(io.sentry.SentryLevel.WARNING, "Could not retrieve Connection Status", th);
            return io.sentry.IConnectionStatusProvider.ConnectionStatus.UNKNOWN;
        }
    }

    public static java.lang.String getConnectionType(android.net.NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }
}
