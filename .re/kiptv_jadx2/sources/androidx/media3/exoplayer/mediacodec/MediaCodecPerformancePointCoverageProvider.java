package androidx.media3.exoplayer.mediacodec;

import android.os.Build;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import java.util.List;

final class MediaCodecPerformancePointCoverageProvider {
    static final int COVERAGE_RESULT_NO = 1;
    static final int COVERAGE_RESULT_NO_PERFORMANCE_POINTS_UNSUPPORTED = 0;
    static final int COVERAGE_RESULT_YES = 2;
    private static Boolean shouldIgnorePerformancePoints;

    public static final class Api29 {
        private Api29() {
        }

        public static int areResolutionAndFrameRateCovered(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i3, int i9, double d4) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            androidx.media3.common.a.i();
            int iEvaluatePerformancePointCoverage = evaluatePerformancePointCoverage(supportedPerformancePoints, androidx.media3.common.a.e(i3, i9, (int) d4));
            if (iEvaluatePerformancePointCoverage == 1 && MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints == null) {
                Boolean unused = MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints = Boolean.valueOf(shouldIgnorePerformancePoints());
                if (MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints.booleanValue()) {
                    return 0;
                }
            }
            return iEvaluatePerformancePointCoverage;
        }

        private static int evaluateH264RequiredSupport(boolean z6) {
            android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
            List supportedPerformancePoints;
            try {
                Format formatBuild = new Format.Builder().setSampleMimeType(MimeTypes.VIDEO_H264).build();
                if (formatBuild.sampleMimeType != null) {
                    List<MediaCodecInfo> decoderInfosSoftMatch = MediaCodecUtil.getDecoderInfosSoftMatch(MediaCodecSelector.DEFAULT, formatBuild, z6, false);
                    for (int i3 = 0; i3 < decoderInfosSoftMatch.size(); i3++) {
                        if (decoderInfosSoftMatch.get(i3).capabilities != null && (videoCapabilities = decoderInfosSoftMatch.get(i3).capabilities.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            androidx.media3.common.a.i();
                            return evaluatePerformancePointCoverage(supportedPerformancePoints, androidx.media3.common.a.d());
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return 0;
        }

        private static int evaluatePerformancePointCoverage(List<android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint> list, android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                if (androidx.media3.common.a.f(list.get(i3)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean shouldIgnorePerformancePoints() {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 37) {
                return false;
            }
            int iEvaluateH264RequiredSupport = evaluateH264RequiredSupport(true);
            if (i3 >= 35) {
                return iEvaluateH264RequiredSupport == 1;
            }
            return evaluateH264RequiredSupport(false) != 2 || iEvaluateH264RequiredSupport == 1;
        }
    }

    private MediaCodecPerformancePointCoverageProvider() {
    }

    public static int areResolutionAndFrameRateCovered(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i3, int i9, double d4) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = shouldIgnorePerformancePoints;
        if (bool == null || !bool.booleanValue()) {
            return Api29.areResolutionAndFrameRateCovered(videoCapabilities, i3, i9, d4);
        }
        return 0;
    }
}
