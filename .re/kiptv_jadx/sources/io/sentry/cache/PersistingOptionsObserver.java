package io.sentry.cache;

/* JADX INFO: loaded from: classes4.dex */
public final class PersistingOptionsObserver implements io.sentry.IOptionsObserver {
    public static final java.lang.String DIST_FILENAME = "dist.json";
    public static final java.lang.String ENVIRONMENT_FILENAME = "environment.json";
    public static final java.lang.String OPTIONS_CACHE = ".options-cache";
    public static final java.lang.String PROGUARD_UUID_FILENAME = "proguard-uuid.json";
    public static final java.lang.String RELEASE_FILENAME = "release.json";
    public static final java.lang.String REPLAY_ERROR_SAMPLE_RATE_FILENAME = "replay-error-sample-rate.json";
    public static final java.lang.String SDK_VERSION_FILENAME = "sdk-version.json";
    public static final java.lang.String TAGS_FILENAME = "tags.json";
    private final io.sentry.SentryOptions options;

    public PersistingOptionsObserver(io.sentry.SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    private void delete(java.lang.String str) {
        io.sentry.cache.CacheUtils.delete(this.options, OPTIONS_CACHE, str);
    }

    public static <T> T read(io.sentry.SentryOptions sentryOptions, java.lang.String str, java.lang.Class<T> cls) {
        return (T) read(sentryOptions, str, cls, null);
    }

    private <T> void store(T t9, java.lang.String str) {
        io.sentry.cache.CacheUtils.store(this.options, t9, OPTIONS_CACHE, str);
    }

    @Override // io.sentry.IOptionsObserver
    public void setDist(java.lang.String str) {
        if (str == null) {
            delete(DIST_FILENAME);
        } else {
            store(str, DIST_FILENAME);
        }
    }

    @Override // io.sentry.IOptionsObserver
    public void setEnvironment(java.lang.String str) {
        if (str == null) {
            delete(ENVIRONMENT_FILENAME);
        } else {
            store(str, ENVIRONMENT_FILENAME);
        }
    }

    @Override // io.sentry.IOptionsObserver
    public void setProguardUuid(java.lang.String str) {
        if (str == null) {
            delete(PROGUARD_UUID_FILENAME);
        } else {
            store(str, PROGUARD_UUID_FILENAME);
        }
    }

    @Override // io.sentry.IOptionsObserver
    public void setRelease(java.lang.String str) {
        if (str == null) {
            delete(RELEASE_FILENAME);
        } else {
            store(str, RELEASE_FILENAME);
        }
    }

    @Override // io.sentry.IOptionsObserver
    public void setReplayErrorSampleRate(java.lang.Double d4) {
        if (d4 == null) {
            delete(REPLAY_ERROR_SAMPLE_RATE_FILENAME);
        } else {
            store(d4.toString(), REPLAY_ERROR_SAMPLE_RATE_FILENAME);
        }
    }

    @Override // io.sentry.IOptionsObserver
    public void setSdkVersion(io.sentry.protocol.SdkVersion sdkVersion) {
        if (sdkVersion == null) {
            delete(SDK_VERSION_FILENAME);
        } else {
            store(sdkVersion, SDK_VERSION_FILENAME);
        }
    }

    @Override // io.sentry.IOptionsObserver
    public void setTags(java.util.Map<java.lang.String, java.lang.String> map) {
        store(map, "tags.json");
    }

    public static <T, R> T read(io.sentry.SentryOptions sentryOptions, java.lang.String str, java.lang.Class<T> cls, io.sentry.JsonDeserializer<R> jsonDeserializer) {
        return (T) io.sentry.cache.CacheUtils.read(sentryOptions, OPTIONS_CACHE, str, cls, jsonDeserializer);
    }
}
