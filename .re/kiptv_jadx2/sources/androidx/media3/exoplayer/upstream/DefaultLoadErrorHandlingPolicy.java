package androidx.media3.exoplayer.upstream;

import androidx.media3.common.C;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DefaultLoadErrorHandlingPolicy implements LoadErrorHandlingPolicy {
    private static final int DEFAULT_BEHAVIOR_MIN_LOADABLE_RETRY_COUNT = -1;
    public static final long DEFAULT_LOCATION_EXCLUSION_MS = 300000;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_PROGRESSIVE_LIVE = 6;

    @Deprecated
    public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000;
    public static final long DEFAULT_TRACK_EXCLUSION_MS = 60000;
    private final int minimumLoadableRetryCount;

    public DefaultLoadErrorHandlingPolicy() {
        this(-1);
    }

    private boolean isAnyCauseNonRetriable(Throwable th) {
        while (th != null) {
            if (isNonRetriableException(th)) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    private boolean isNonRetriableException(Throwable th) {
        if ((th instanceof ParserException) || (th instanceof FileNotFoundException) || (th instanceof HttpDataSource.CleartextNotPermittedException) || (th instanceof Loader.UnexpectedLoaderException)) {
            return true;
        }
        return (th instanceof DataSourceException) && ((DataSourceException) th).reason == 2008;
    }

    @Override
    public LoadErrorHandlingPolicy.FallbackSelection getFallbackSelectionFor(LoadErrorHandlingPolicy.FallbackOptions fallbackOptions, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        if (!isEligibleForFallback(loadErrorInfo.exception)) {
            return null;
        }
        if (fallbackOptions.isFallbackAvailable(1)) {
            return new LoadErrorHandlingPolicy.FallbackSelection(1, 300000L);
        }
        if (fallbackOptions.isFallbackAvailable(2)) {
            return new LoadErrorHandlingPolicy.FallbackSelection(2, 60000L);
        }
        return null;
    }

    @Override
    public int getMinimumLoadableRetryCount(int i3) {
        int i9 = this.minimumLoadableRetryCount;
        if (i9 == -1) {
            return i3 == 7 ? 6 : 3;
        }
        return i9;
    }

    @Override
    public long getRetryDelayMsFor(LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        return isAnyCauseNonRetriable(loadErrorInfo.exception) ? C.TIME_UNSET : Math.min((loadErrorInfo.errorCount - 1) * 1000, 5000);
    }

    public boolean isEligibleForFallback(IOException iOException) {
        if (!(iOException instanceof HttpDataSource.InvalidResponseCodeException)) {
            return false;
        }
        int i3 = ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode;
        return i3 == 403 || i3 == 404 || i3 == 410 || i3 == 416 || i3 == 500 || i3 == 503;
    }

    public DefaultLoadErrorHandlingPolicy(int i3) {
        this.minimumLoadableRetryCount = i3;
    }
}
