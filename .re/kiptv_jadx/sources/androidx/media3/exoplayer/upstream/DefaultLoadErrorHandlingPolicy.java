package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public class DefaultLoadErrorHandlingPolicy implements androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy {
    private static final int DEFAULT_BEHAVIOR_MIN_LOADABLE_RETRY_COUNT = -1;
    public static final long DEFAULT_LOCATION_EXCLUSION_MS = 300000;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_PROGRESSIVE_LIVE = 6;

    @java.lang.Deprecated
    public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000;
    public static final long DEFAULT_TRACK_EXCLUSION_MS = 60000;
    private final int minimumLoadableRetryCount;

    public DefaultLoadErrorHandlingPolicy() {
        this(-1);
    }

    private boolean isAnyCauseNonRetriable(java.lang.Throwable th) {
        while (th != null) {
            if (isNonRetriableException(th)) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    private boolean isNonRetriableException(java.lang.Throwable th) {
        if ((th instanceof androidx.media3.common.ParserException) || (th instanceof java.io.FileNotFoundException) || (th instanceof androidx.media3.datasource.HttpDataSource.CleartextNotPermittedException) || (th instanceof androidx.media3.exoplayer.upstream.Loader.UnexpectedLoaderException)) {
            return true;
        }
        return (th instanceof androidx.media3.datasource.DataSourceException) && ((androidx.media3.datasource.DataSourceException) th).reason == 2008;
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackSelection getFallbackSelectionFor(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackOptions fallbackOptions, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        if (!isEligibleForFallback(loadErrorInfo.exception)) {
            return null;
        }
        if (fallbackOptions.isFallbackAvailable(1)) {
            return new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackSelection(1, 300000L);
        }
        if (fallbackOptions.isFallbackAvailable(2)) {
            return new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackSelection(2, 60000L);
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public int getMinimumLoadableRetryCount(int i3) {
        int i9 = this.minimumLoadableRetryCount;
        if (i9 == -1) {
            return i3 == 7 ? 6 : 3;
        }
        return i9;
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public long getRetryDelayMsFor(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        return isAnyCauseNonRetriable(loadErrorInfo.exception) ? androidx.media3.common.C.TIME_UNSET : java.lang.Math.min((loadErrorInfo.errorCount - 1) * 1000, 5000);
    }

    public boolean isEligibleForFallback(java.io.IOException iOException) {
        if (!(iOException instanceof androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException)) {
            return false;
        }
        int i3 = ((androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException) iOException).responseCode;
        return i3 == 403 || i3 == 404 || i3 == 410 || i3 == 416 || i3 == 500 || i3 == 503;
    }

    public DefaultLoadErrorHandlingPolicy(int i3) {
        this.minimumLoadableRetryCount = i3;
    }
}
