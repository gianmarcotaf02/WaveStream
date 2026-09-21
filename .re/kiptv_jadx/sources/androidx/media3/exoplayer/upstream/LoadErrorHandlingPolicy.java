package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public interface LoadErrorHandlingPolicy {
    public static final int FALLBACK_TYPE_LOCATION = 1;
    public static final int FALLBACK_TYPE_TRACK = 2;

    public static final class FallbackOptions {
        public final int numberOfExcludedLocations;
        public final int numberOfExcludedTracks;
        public final int numberOfLocations;
        public final int numberOfTracks;

        public FallbackOptions(int i3, int i9, int i10, int i11) {
            this.numberOfLocations = i3;
            this.numberOfExcludedLocations = i9;
            this.numberOfTracks = i10;
            this.numberOfExcludedTracks = i11;
        }

        public boolean isFallbackAvailable(int i3) {
            if (i3 == 1) {
                return this.numberOfLocations - this.numberOfExcludedLocations > 1;
            }
            return this.numberOfTracks - this.numberOfExcludedTracks > 1;
        }
    }

    public static final class FallbackSelection {
        public final long exclusionDurationMs;
        public final int type;

        public FallbackSelection(int i3, long j) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j >= 0);
            this.type = i3;
            this.exclusionDurationMs = j;
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FallbackType {
    }

    public static final class LoadErrorInfo {
        public final int errorCount;
        public final java.io.IOException exception;
        public final androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo;
        public final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData;

        public LoadErrorInfo(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, int i3) {
            this.loadEventInfo = loadEventInfo;
            this.mediaLoadData = mediaLoadData;
            this.exception = iOException;
            this.errorCount = i3;
        }
    }

    androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackSelection getFallbackSelectionFor(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackOptions fallbackOptions, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo);

    int getMinimumLoadableRetryCount(int i3);

    long getRetryDelayMsFor(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo);

    default void onLoadTaskConcluded(long j) {
    }
}
