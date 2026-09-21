package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class ExternalOptions {
    private static final java.lang.String PROXY_PORT_DEFAULT = "80";
    private java.lang.Boolean captureOpenTelemetryEvents;
    private io.sentry.SentryOptions.Cron cron;
    private java.lang.Boolean debug;
    private java.lang.String dist;
    private java.lang.String dsn;
    private java.lang.Boolean enableBackpressureHandling;
    private java.lang.Boolean enableDeduplication;
    private java.lang.Boolean enablePrettySerializationOutput;
    private java.lang.Boolean enableSpotlight;
    private java.lang.Boolean enableUncaughtExceptionHandler;
    private java.lang.Boolean enabled;
    private java.lang.String environment;
    private java.lang.Boolean forceInit;
    private java.lang.Boolean globalHubMode;
    private java.lang.Long idleTimeout;
    private java.util.List<java.lang.String> ignoredCheckIns;
    private java.util.List<java.lang.String> ignoredErrors;
    private java.util.List<java.lang.String> ignoredTransactions;
    private io.sentry.SentryOptions.RequestSize maxRequestBodySize;
    private java.lang.Boolean printUncaughtStackTrace;
    private java.lang.Double profilesSampleRate;
    private java.lang.String proguardUuid;
    private io.sentry.SentryOptions.Proxy proxy;
    private java.lang.String release;
    private java.lang.Boolean sendClientReports;
    private java.lang.Boolean sendDefaultPii;
    private java.lang.Boolean sendModules;
    private java.lang.String serverName;
    private java.lang.String spotlightConnectionUrl;
    private java.lang.Double tracesSampleRate;
    private final java.util.Map<java.lang.String, java.lang.String> tags = new java.util.concurrent.ConcurrentHashMap();
    private final java.util.List<java.lang.String> inAppExcludes = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.util.List<java.lang.String> inAppIncludes = new java.util.concurrent.CopyOnWriteArrayList();
    private java.util.List<java.lang.String> tracePropagationTargets = null;
    private final java.util.List<java.lang.String> contextTags = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.util.Set<java.lang.Class<? extends java.lang.Throwable>> ignoredExceptionsForType = new java.util.concurrent.CopyOnWriteArraySet();
    private java.util.Set<java.lang.String> bundleIds = new java.util.concurrent.CopyOnWriteArraySet();

    /* JADX WARN: Multi-variable type inference failed */
    public static io.sentry.ExternalOptions from(io.sentry.config.PropertiesProvider propertiesProvider, io.sentry.ILogger iLogger) {
        io.sentry.ExternalOptions externalOptions = new io.sentry.ExternalOptions();
        externalOptions.setDsn(propertiesProvider.getProperty("dsn"));
        externalOptions.setEnvironment(propertiesProvider.getProperty("environment"));
        externalOptions.setRelease(propertiesProvider.getProperty("release"));
        externalOptions.setDist(propertiesProvider.getProperty(io.sentry.SentryBaseEvent.JsonKeys.DIST));
        externalOptions.setServerName(propertiesProvider.getProperty("servername"));
        externalOptions.setEnableUncaughtExceptionHandler(propertiesProvider.getBooleanProperty("uncaught.handler.enabled"));
        externalOptions.setPrintUncaughtStackTrace(propertiesProvider.getBooleanProperty("uncaught.handler.print-stacktrace"));
        externalOptions.setTracesSampleRate(propertiesProvider.getDoubleProperty("traces-sample-rate"));
        externalOptions.setProfilesSampleRate(propertiesProvider.getDoubleProperty("profiles-sample-rate"));
        externalOptions.setDebug(propertiesProvider.getBooleanProperty("debug"));
        externalOptions.setEnableDeduplication(propertiesProvider.getBooleanProperty("enable-deduplication"));
        externalOptions.setSendClientReports(propertiesProvider.getBooleanProperty("send-client-reports"));
        externalOptions.setForceInit(propertiesProvider.getBooleanProperty("force-init"));
        java.lang.String property = propertiesProvider.getProperty("max-request-body-size");
        if (property != null) {
            externalOptions.setMaxRequestBodySize(io.sentry.SentryOptions.RequestSize.valueOf(property.toUpperCase(java.util.Locale.ROOT)));
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : propertiesProvider.getMap("tags").entrySet()) {
            externalOptions.setTag(entry.getKey(), entry.getValue());
        }
        java.lang.String property2 = propertiesProvider.getProperty("proxy.host");
        java.lang.String property3 = propertiesProvider.getProperty("proxy.user");
        java.lang.String property4 = propertiesProvider.getProperty("proxy.pass");
        java.lang.String property5 = propertiesProvider.getProperty("proxy.port", PROXY_PORT_DEFAULT);
        if (property2 != null) {
            externalOptions.setProxy(new io.sentry.SentryOptions.Proxy(property2, property5, property3, property4));
        }
        java.util.Iterator<java.lang.String> it = propertiesProvider.getList("in-app-includes").iterator();
        while (it.hasNext()) {
            externalOptions.addInAppInclude(it.next());
        }
        java.util.Iterator<java.lang.String> it2 = propertiesProvider.getList("in-app-excludes").iterator();
        while (it2.hasNext()) {
            externalOptions.addInAppExclude(it2.next());
        }
        java.util.List<java.lang.String> list = propertiesProvider.getProperty("trace-propagation-targets") != null ? propertiesProvider.getList("trace-propagation-targets") : null;
        if (list == null && propertiesProvider.getProperty("tracing-origins") != null) {
            list = propertiesProvider.getList("tracing-origins");
        }
        if (list != null) {
            java.util.Iterator<java.lang.String> it3 = list.iterator();
            while (it3.hasNext()) {
                externalOptions.addTracePropagationTarget(it3.next());
            }
        }
        java.util.Iterator<java.lang.String> it4 = propertiesProvider.getList("context-tags").iterator();
        while (it4.hasNext()) {
            externalOptions.addContextTag(it4.next());
        }
        externalOptions.setProguardUuid(propertiesProvider.getProperty("proguard-uuid"));
        java.util.Iterator<java.lang.String> it5 = propertiesProvider.getList("bundle-ids").iterator();
        while (it5.hasNext()) {
            externalOptions.addBundleId(it5.next());
        }
        externalOptions.setIdleTimeout(propertiesProvider.getLongProperty("idle-timeout"));
        externalOptions.setIgnoredErrors(propertiesProvider.getListOrNull("ignored-errors"));
        externalOptions.setEnabled(propertiesProvider.getBooleanProperty("enabled"));
        externalOptions.setEnablePrettySerializationOutput(propertiesProvider.getBooleanProperty("enable-pretty-serialization-output"));
        externalOptions.setSendModules(propertiesProvider.getBooleanProperty("send-modules"));
        externalOptions.setSendDefaultPii(propertiesProvider.getBooleanProperty("send-default-pii"));
        externalOptions.setIgnoredCheckIns(propertiesProvider.getListOrNull("ignored-checkins"));
        externalOptions.setIgnoredTransactions(propertiesProvider.getListOrNull("ignored-transactions"));
        externalOptions.setEnableBackpressureHandling(propertiesProvider.getBooleanProperty("enable-backpressure-handling"));
        externalOptions.setGlobalHubMode(propertiesProvider.getBooleanProperty("global-hub-mode"));
        externalOptions.setCaptureOpenTelemetryEvents(propertiesProvider.getBooleanProperty("capture-open-telemetry-events"));
        for (java.lang.String str : propertiesProvider.getList("ignored-exceptions-for-type")) {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName(str);
                if (java.lang.Throwable.class.isAssignableFrom(cls)) {
                    externalOptions.addIgnoredExceptionForType(cls);
                } else {
                    iLogger.log(io.sentry.SentryLevel.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str, str);
                }
            } catch (java.lang.ClassNotFoundException unused) {
                iLogger.log(io.sentry.SentryLevel.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str, str);
            }
        }
        java.lang.Long longProperty = propertiesProvider.getLongProperty("cron.default-checkin-margin");
        java.lang.Long longProperty2 = propertiesProvider.getLongProperty("cron.default-max-runtime");
        java.lang.String property6 = propertiesProvider.getProperty("cron.default-timezone");
        java.lang.Long longProperty3 = propertiesProvider.getLongProperty("cron.default-failure-issue-threshold");
        java.lang.Long longProperty4 = propertiesProvider.getLongProperty("cron.default-recovery-threshold");
        if (longProperty != null || longProperty2 != null || property6 != null || longProperty3 != null || longProperty4 != null) {
            io.sentry.SentryOptions.Cron cron = new io.sentry.SentryOptions.Cron();
            cron.setDefaultCheckinMargin(longProperty);
            cron.setDefaultMaxRuntime(longProperty2);
            cron.setDefaultTimezone(property6);
            cron.setDefaultFailureIssueThreshold(longProperty3);
            cron.setDefaultRecoveryThreshold(longProperty4);
            externalOptions.setCron(cron);
        }
        externalOptions.setEnableSpotlight(propertiesProvider.getBooleanProperty("enable-spotlight"));
        externalOptions.setSpotlightConnectionUrl(propertiesProvider.getProperty("spotlight-connection-url"));
        return externalOptions;
    }

    public void addBundleId(java.lang.String str) {
        this.bundleIds.add(str);
    }

    public void addContextTag(java.lang.String str) {
        this.contextTags.add(str);
    }

    public void addIgnoredExceptionForType(java.lang.Class<? extends java.lang.Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addInAppExclude(java.lang.String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(java.lang.String str) {
        this.inAppIncludes.add(str);
    }

    public void addTracePropagationTarget(java.lang.String str) {
        if (this.tracePropagationTargets == null) {
            this.tracePropagationTargets = new java.util.concurrent.CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.tracePropagationTargets.add(str);
    }

    public java.util.Set<java.lang.String> getBundleIds() {
        return this.bundleIds;
    }

    public java.util.List<java.lang.String> getContextTags() {
        return this.contextTags;
    }

    public io.sentry.SentryOptions.Cron getCron() {
        return this.cron;
    }

    public java.lang.Boolean getDebug() {
        return this.debug;
    }

    public java.lang.String getDist() {
        return this.dist;
    }

    public java.lang.String getDsn() {
        return this.dsn;
    }

    public java.lang.Boolean getEnableDeduplication() {
        return this.enableDeduplication;
    }

    public java.lang.Boolean getEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public java.lang.String getEnvironment() {
        return this.environment;
    }

    public java.lang.Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public java.util.List<java.lang.String> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public java.util.List<java.lang.String> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    public java.util.Set<java.lang.Class<? extends java.lang.Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public java.util.List<java.lang.String> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    public java.util.List<java.lang.String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public java.util.List<java.lang.String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public io.sentry.SentryOptions.RequestSize getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public java.lang.Boolean getPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public java.lang.Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public java.lang.String getProguardUuid() {
        return this.proguardUuid;
    }

    public io.sentry.SentryOptions.Proxy getProxy() {
        return this.proxy;
    }

    public java.lang.String getRelease() {
        return this.release;
    }

    public java.lang.Boolean getSendClientReports() {
        return this.sendClientReports;
    }

    public java.lang.String getServerName() {
        return this.serverName;
    }

    public java.lang.String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public java.util.Map<java.lang.String, java.lang.String> getTags() {
        return this.tags;
    }

    public java.util.List<java.lang.String> getTracePropagationTargets() {
        return this.tracePropagationTargets;
    }

    public java.lang.Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public java.lang.Boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    public java.lang.Boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public java.lang.Boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public java.lang.Boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public java.lang.Boolean isEnabled() {
        return this.enabled;
    }

    public java.lang.Boolean isForceInit() {
        return this.forceInit;
    }

    public java.lang.Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public java.lang.Boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public java.lang.Boolean isSendModules() {
        return this.sendModules;
    }

    public void setCaptureOpenTelemetryEvents(java.lang.Boolean bool) {
        this.captureOpenTelemetryEvents = bool;
    }

    public void setCron(io.sentry.SentryOptions.Cron cron) {
        this.cron = cron;
    }

    public void setDebug(java.lang.Boolean bool) {
        this.debug = bool;
    }

    public void setDist(java.lang.String str) {
        this.dist = str;
    }

    public void setDsn(java.lang.String str) {
        this.dsn = str;
    }

    public void setEnableBackpressureHandling(java.lang.Boolean bool) {
        this.enableBackpressureHandling = bool;
    }

    public void setEnableDeduplication(java.lang.Boolean bool) {
        this.enableDeduplication = bool;
    }

    public void setEnablePrettySerializationOutput(java.lang.Boolean bool) {
        this.enablePrettySerializationOutput = bool;
    }

    public void setEnableSpotlight(java.lang.Boolean bool) {
        this.enableSpotlight = bool;
    }

    public void setEnableUncaughtExceptionHandler(java.lang.Boolean bool) {
        this.enableUncaughtExceptionHandler = bool;
    }

    public void setEnabled(java.lang.Boolean bool) {
        this.enabled = bool;
    }

    public void setEnvironment(java.lang.String str) {
        this.environment = str;
    }

    public void setForceInit(java.lang.Boolean bool) {
        this.forceInit = bool;
    }

    public void setGlobalHubMode(java.lang.Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(java.lang.Long l2) {
        this.idleTimeout = l2;
    }

    public void setIgnoredCheckIns(java.util.List<java.lang.String> list) {
        this.ignoredCheckIns = list;
    }

    public void setIgnoredErrors(java.util.List<java.lang.String> list) {
        this.ignoredErrors = list;
    }

    public void setIgnoredTransactions(java.util.List<java.lang.String> list) {
        this.ignoredTransactions = list;
    }

    public void setMaxRequestBodySize(io.sentry.SentryOptions.RequestSize requestSize) {
        this.maxRequestBodySize = requestSize;
    }

    public void setPrintUncaughtStackTrace(java.lang.Boolean bool) {
        this.printUncaughtStackTrace = bool;
    }

    public void setProfilesSampleRate(java.lang.Double d4) {
        this.profilesSampleRate = d4;
    }

    public void setProguardUuid(java.lang.String str) {
        this.proguardUuid = str;
    }

    public void setProxy(io.sentry.SentryOptions.Proxy proxy) {
        this.proxy = proxy;
    }

    public void setRelease(java.lang.String str) {
        this.release = str;
    }

    public void setSendClientReports(java.lang.Boolean bool) {
        this.sendClientReports = bool;
    }

    public void setSendDefaultPii(java.lang.Boolean bool) {
        this.sendDefaultPii = bool;
    }

    public void setSendModules(java.lang.Boolean bool) {
        this.sendModules = bool;
    }

    public void setServerName(java.lang.String str) {
        this.serverName = str;
    }

    public void setSpotlightConnectionUrl(java.lang.String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setTag(java.lang.String str, java.lang.String str2) {
        this.tags.put(str, str2);
    }

    public void setTracesSampleRate(java.lang.Double d4) {
        this.tracesSampleRate = d4;
    }
}
