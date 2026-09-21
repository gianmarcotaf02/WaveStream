package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B5\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\""}, d2 = {"Lio/sentry/android/replay/ScreenshotRecorderConfig;", "", "scaleFactorX", "", "scaleFactorY", "(FF)V", "recordingWidth", "", "recordingHeight", io.sentry.rrweb.RRWebVideoEvent.JsonKeys.FRAME_RATE, "bitRate", "(IIFFII)V", "getBitRate", "()I", "getFrameRate", "getRecordingHeight", "getRecordingWidth", "getScaleFactorX", "()F", "getScaleFactorY", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "toString", "", "Companion", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class ScreenshotRecorderConfig {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.sentry.android.replay.ScreenshotRecorderConfig.Companion INSTANCE = new io.sentry.android.replay.ScreenshotRecorderConfig.Companion(null);
    private final int bitRate;
    private final int frameRate;
    private final int recordingHeight;
    private final int recordingWidth;
    private final float scaleFactorX;
    private final float scaleFactorY;

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\f\u0010\t\u001a\u00020\n*\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"Lio/sentry/android/replay/ScreenshotRecorderConfig$Companion;", "", "()V", "from", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "context", "Landroid/content/Context;", "sessionReplay", "Lio/sentry/SentryReplayOptions;", "adjustToBlockSize", "", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        private final int adjustToBlockSize(int i3) {
            int i9 = i3 % 16;
            return i9 <= 8 ? i3 - i9 : (16 - i9) + i3;
        }

        public final io.sentry.android.replay.ScreenshotRecorderConfig from(android.content.Context context, io.sentry.SentryReplayOptions sessionReplay) {
            android.graphics.Rect rect;
            kotlin.jvm.internal.m.e(context, "context");
            kotlin.jvm.internal.m.e(sessionReplay, "sessionReplay");
            java.lang.Object systemService = context.getSystemService("window");
            kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.view.WindowManager windowManager = (android.view.WindowManager) systemService;
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                rect = windowManager.getCurrentWindowMetrics().getBounds();
            } else {
                android.graphics.Point point = new android.graphics.Point();
                windowManager.getDefaultDisplay().getRealSize(point);
                rect = new android.graphics.Rect(0, 0, point.x, point.y);
            }
            kotlin.jvm.internal.m.d(rect, "if (VERSION.SDK_INT >= V…enBounds.y)\n            }");
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(adjustToBlockSize(O7.r.Q((rect.height() / context.getResources().getDisplayMetrics().density) * sessionReplay.getQuality().sizeScale)));
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(adjustToBlockSize(O7.r.Q((rect.width() / context.getResources().getDisplayMetrics().density) * sessionReplay.getQuality().sizeScale)));
            int iIntValue = numValueOf.intValue();
            int iIntValue2 = numValueOf2.intValue();
            return new io.sentry.android.replay.ScreenshotRecorderConfig(iIntValue2, iIntValue, iIntValue2 / rect.width(), iIntValue / rect.height(), sessionReplay.getFrameRate(), sessionReplay.getQuality().bitRate);
        }

        private Companion() {
        }
    }

    public ScreenshotRecorderConfig(int i3, int i9, float f9, float f10, int i10, int i11) {
        this.recordingWidth = i3;
        this.recordingHeight = i9;
        this.scaleFactorX = f9;
        this.scaleFactorY = f10;
        this.frameRate = i10;
        this.bitRate = i11;
    }

    public static /* synthetic */ io.sentry.android.replay.ScreenshotRecorderConfig copy$default(io.sentry.android.replay.ScreenshotRecorderConfig screenshotRecorderConfig, int i3, int i9, float f9, float f10, int i10, int i11, int i12, java.lang.Object obj) {
        if ((i12 & 1) != 0) {
            i3 = screenshotRecorderConfig.recordingWidth;
        }
        if ((i12 & 2) != 0) {
            i9 = screenshotRecorderConfig.recordingHeight;
        }
        if ((i12 & 4) != 0) {
            f9 = screenshotRecorderConfig.scaleFactorX;
        }
        if ((i12 & 8) != 0) {
            f10 = screenshotRecorderConfig.scaleFactorY;
        }
        if ((i12 & 16) != 0) {
            i10 = screenshotRecorderConfig.frameRate;
        }
        if ((i12 & 32) != 0) {
            i11 = screenshotRecorderConfig.bitRate;
        }
        int i13 = i10;
        int i14 = i11;
        return screenshotRecorderConfig.copy(i3, i9, f9, f10, i13, i14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getScaleFactorX() {
        return this.scaleFactorX;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getScaleFactorY() {
        return this.scaleFactorY;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFrameRate() {
        return this.frameRate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBitRate() {
        return this.bitRate;
    }

    public final io.sentry.android.replay.ScreenshotRecorderConfig copy(int recordingWidth, int recordingHeight, float scaleFactorX, float scaleFactorY, int frameRate, int bitRate) {
        return new io.sentry.android.replay.ScreenshotRecorderConfig(recordingWidth, recordingHeight, scaleFactorX, scaleFactorY, frameRate, bitRate);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.sentry.android.replay.ScreenshotRecorderConfig)) {
            return false;
        }
        io.sentry.android.replay.ScreenshotRecorderConfig screenshotRecorderConfig = (io.sentry.android.replay.ScreenshotRecorderConfig) other;
        return this.recordingWidth == screenshotRecorderConfig.recordingWidth && this.recordingHeight == screenshotRecorderConfig.recordingHeight && java.lang.Float.compare(this.scaleFactorX, screenshotRecorderConfig.scaleFactorX) == 0 && java.lang.Float.compare(this.scaleFactorY, screenshotRecorderConfig.scaleFactorY) == 0 && this.frameRate == screenshotRecorderConfig.frameRate && this.bitRate == screenshotRecorderConfig.bitRate;
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    public final float getScaleFactorX() {
        return this.scaleFactorX;
    }

    public final float getScaleFactorY() {
        return this.scaleFactorY;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.bitRate) + p121o0.p.d(this.frameRate, p121o0.p.c(this.scaleFactorY, p121o0.p.c(this.scaleFactorX, p121o0.p.d(this.recordingHeight, java.lang.Integer.hashCode(this.recordingWidth) * 31, 31), 31), 31), 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
        sb.append(this.recordingWidth);
        sb.append(", recordingHeight=");
        sb.append(this.recordingHeight);
        sb.append(", scaleFactorX=");
        sb.append(this.scaleFactorX);
        sb.append(", scaleFactorY=");
        sb.append(this.scaleFactorY);
        sb.append(", frameRate=");
        sb.append(this.frameRate);
        sb.append(", bitRate=");
        return Y6.f.j(sb, this.bitRate, ')');
    }

    public ScreenshotRecorderConfig(float f9, float f10) {
        this(0, 0, f9, f10, 0, 0);
    }
}
