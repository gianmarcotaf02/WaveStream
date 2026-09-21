package io.sentry.ndk;

/* JADX INFO: loaded from: classes4.dex */
public final class NdkOptions {
    private final java.lang.String dist;
    private final java.lang.String dsn;
    private final java.lang.String environment;
    private final boolean isDebug;
    private final int maxBreadcrumbs;
    private io.sentry.ndk.NdkHandlerStrategy ndkHandlerStrategy = io.sentry.ndk.NdkHandlerStrategy.SENTRY_HANDLER_STRATEGY_DEFAULT;
    private final java.lang.String outboxPath;
    private final java.lang.String release;
    private final java.lang.String sdkName;

    public NdkOptions(java.lang.String str, boolean z6, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i3, java.lang.String str6) {
        this.dsn = str;
        this.isDebug = z6;
        this.outboxPath = str2;
        this.release = str3;
        this.environment = str4;
        this.dist = str5;
        this.maxBreadcrumbs = i3;
        this.sdkName = str6;
    }

    public java.lang.String getDist() {
        return this.dist;
    }

    public java.lang.String getDsn() {
        return this.dsn;
    }

    public java.lang.String getEnvironment() {
        return this.environment;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    public java.lang.String getOutboxPath() {
        return this.outboxPath;
    }

    public java.lang.String getRelease() {
        return this.release;
    }

    public java.lang.String getSdkName() {
        return this.sdkName;
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public void setNdkHandlerStrategy(io.sentry.ndk.NdkHandlerStrategy ndkHandlerStrategy) {
        this.ndkHandlerStrategy = ndkHandlerStrategy;
    }
}
