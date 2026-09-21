package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryIntegrationPackageStorage {
    private static volatile io.sentry.SentryIntegrationPackageStorage INSTANCE;
    private static final io.sentry.util.AutoClosableReentrantLock staticLock = new io.sentry.util.AutoClosableReentrantLock();
    private final java.util.Set<java.lang.String> integrations = new java.util.concurrent.CopyOnWriteArraySet();
    private final java.util.Set<io.sentry.protocol.SentryPackage> packages = new java.util.concurrent.CopyOnWriteArraySet();

    private SentryIntegrationPackageStorage() {
    }

    public static io.sentry.SentryIntegrationPackageStorage getInstance() {
        if (INSTANCE == null) {
            io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
            try {
                if (INSTANCE == null) {
                    INSTANCE = new io.sentry.SentryIntegrationPackageStorage();
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
        return INSTANCE;
    }

    public void addIntegration(java.lang.String str) {
        io.sentry.util.Objects.requireNonNull(str, "integration is required.");
        this.integrations.add(str);
    }

    public void addPackage(java.lang.String str, java.lang.String str2) {
        io.sentry.util.Objects.requireNonNull(str, "name is required.");
        io.sentry.util.Objects.requireNonNull(str2, "version is required.");
        this.packages.add(new io.sentry.protocol.SentryPackage(str, str2));
    }

    public void clearStorage() {
        this.integrations.clear();
        this.packages.clear();
    }

    public java.util.Set<java.lang.String> getIntegrations() {
        return this.integrations;
    }

    public java.util.Set<io.sentry.protocol.SentryPackage> getPackages() {
        return this.packages;
    }
}
