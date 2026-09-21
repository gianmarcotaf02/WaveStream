package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import io.sentry.IConnectionStatusProvider;
import io.sentry.ILogger;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.android.core.ContextUtils;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class AndroidConnectionStatusProvider implements IConnectionStatusProvider {
    private final BuildInfoProvider buildInfoProvider;
    private final Context context;
    private final ILogger logger;
    private volatile ConnectivityManager.NetworkCallback networkCallback;
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();
    private final List<IConnectionStatusProvider.IConnectionStatusObserver> connectionStatusObservers = new ArrayList();

    public AndroidConnectionStatusProvider(Context context, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        this.context = ContextUtils.getApplicationContext(context);
        this.logger = iLogger;
        this.buildInfoProvider = buildInfoProvider;
    }

    private static ConnectivityManager getConnectivityManager(Context context, ILogger iLogger) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            iLogger.log(SentryLevel.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
        }
        return connectivityManager;
    }

    public static boolean registerNetworkCallback(Context context, ILogger iLogger, BuildInfoProvider buildInfoProvider, ConnectivityManager.NetworkCallback networkCallback) {
        if (buildInfoProvider.getSdkInfoVersion() < 24) {
            iLogger.log(SentryLevel.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager connectivityManager = getConnectivityManager(context, iLogger);
        if (connectivityManager == null) {
            return false;
        }
        if (!Permissions.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.log(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (Throwable th) {
            iLogger.log(SentryLevel.WARNING, "registerDefaultNetworkCallback failed", th);
            return false;
        }
    }

    public static void unregisterNetworkCallback(Context context, ILogger iLogger, ConnectivityManager.NetworkCallback networkCallback) {
        ConnectivityManager connectivityManager = getConnectivityManager(context, iLogger);
        if (connectivityManager == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(networkCallback);
        } catch (Throwable th) {
            iLogger.log(SentryLevel.WARNING, "unregisterNetworkCallback failed", th);
        }
    }

    @Override
    public boolean addConnectionStatusObserver(IConnectionStatusProvider.IConnectionStatusObserver iConnectionStatusObserver) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.connectionStatusObservers.add(iConnectionStatusObserver);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            if (this.networkCallback == null) {
                ISentryLifecycleToken iSentryLifecycleTokenAcquire2 = this.lock.acquire();
                try {
                    if (this.networkCallback == null) {
                        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() {
                            @Override
                            public void onAvailable(Network network) {
                                updateObservers();
                            }

                            @Override
                            public void onLost(Network network) {
                                updateObservers();
                            }

                            @Override
                            public void onUnavailable() {
                                updateObservers();
                            }

                            public void updateObservers() {
                                IConnectionStatusProvider.ConnectionStatus connectionStatus = AndroidConnectionStatusProvider.this.getConnectionStatus();
                                ISentryLifecycleToken iSentryLifecycleTokenAcquire3 = AndroidConnectionStatusProvider.this.lock.acquire();
                                try {
                                    Iterator it = AndroidConnectionStatusProvider.this.connectionStatusObservers.iterator();
                                    while (it.hasNext()) {
                                        ((IConnectionStatusProvider.IConnectionStatusObserver) it.next()).onConnectionStatusChanged(connectionStatus);
                                    }
                                    if (iSentryLifecycleTokenAcquire3 != null) {
                                        iSentryLifecycleTokenAcquire3.close();
                                    }
                                } catch (Throwable th) {
                                    if (iSentryLifecycleTokenAcquire3 != null) {
                                        try {
                                            iSentryLifecycleTokenAcquire3.close();
                                        } catch (Throwable th2) {
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
                } catch (Throwable th) {
                    if (iSentryLifecycleTokenAcquire2 != null) {
                        try {
                            iSentryLifecycleTokenAcquire2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            return true;
        } catch (Throwable th3) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override
    public IConnectionStatusProvider.ConnectionStatus getConnectionStatus() {
        ConnectivityManager connectivityManager = getConnectivityManager(this.context, this.logger);
        return connectivityManager == null ? IConnectionStatusProvider.ConnectionStatus.UNKNOWN : getConnectionStatus(this.context, connectivityManager, this.logger);
    }

    @Override
    public String getConnectionType() {
        return getConnectionType(this.context, this.logger, this.buildInfoProvider);
    }

    public ConnectivityManager.NetworkCallback getNetworkCallback() {
        return this.networkCallback;
    }

    public List<IConnectionStatusProvider.IConnectionStatusObserver> getStatusObservers() {
        return this.connectionStatusObservers;
    }

    @Override
    public void removeConnectionStatusObserver(IConnectionStatusProvider.IConnectionStatusObserver iConnectionStatusObserver) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.connectionStatusObservers.remove(iConnectionStatusObserver);
            if (this.connectionStatusObservers.isEmpty() && this.networkCallback != null) {
                unregisterNetworkCallback(this.context, this.logger, this.networkCallback);
                this.networkCallback = null;
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static String getConnectionType(Context context, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        ConnectivityManager connectivityManager = getConnectivityManager(context, iLogger);
        if (connectivityManager == null) {
            return null;
        }
        boolean zHasTransport = false;
        if (!Permissions.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.log(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        try {
            boolean zHasTransport2 = true;
            if (buildInfoProvider.getSdkInfoVersion() >= 23) {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork == null) {
                    iLogger.log(SentryLevel.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    iLogger.log(SentryLevel.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport3 = networkCapabilities.hasTransport(3);
                zHasTransport = networkCapabilities.hasTransport(1);
                zHasTransport2 = networkCapabilities.hasTransport(0);
                zHasTransport = zHasTransport3;
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    iLogger.log(SentryLevel.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
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
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Failed to retrieve network info", th);
        }
    }

    private static IConnectionStatusProvider.ConnectionStatus getConnectionStatus(Context context, ConnectivityManager connectivityManager, ILogger iLogger) {
        if (!Permissions.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.log(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return IConnectionStatusProvider.ConnectionStatus.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                iLogger.log(SentryLevel.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                return IConnectionStatusProvider.ConnectionStatus.DISCONNECTED;
            }
            if (activeNetworkInfo.isConnected()) {
                return IConnectionStatusProvider.ConnectionStatus.CONNECTED;
            }
            return IConnectionStatusProvider.ConnectionStatus.DISCONNECTED;
        } catch (Throwable th) {
            iLogger.log(SentryLevel.WARNING, "Could not retrieve Connection Status", th);
            return IConnectionStatusProvider.ConnectionStatus.UNKNOWN;
        }
    }

    public static String getConnectionType(NetworkCapabilities networkCapabilities) {
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
