package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/sentry/android/replay/ReplayFrame;", "", "screenshot", "Ljava/io/File;", "timestamp", "", "screen", "", "(Ljava/io/File;JLjava/lang/String;)V", "getScreen", "()Ljava/lang/String;", "getScreenshot", "()Ljava/io/File;", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class ReplayFrame {
    public static final int $stable = 8;
    private final java.lang.String screen;
    private final java.io.File screenshot;
    private final long timestamp;

    public ReplayFrame(java.io.File screenshot, long j, java.lang.String str) {
        kotlin.jvm.internal.m.e(screenshot, "screenshot");
        this.screenshot = screenshot;
        this.timestamp = j;
        this.screen = str;
    }

    public static /* synthetic */ io.sentry.android.replay.ReplayFrame copy$default(io.sentry.android.replay.ReplayFrame replayFrame, java.io.File file, long j, java.lang.String str, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            file = replayFrame.screenshot;
        }
        if ((i3 & 2) != 0) {
            j = replayFrame.timestamp;
        }
        if ((i3 & 4) != 0) {
            str = replayFrame.screen;
        }
        return replayFrame.copy(file, j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.io.File getScreenshot() {
        return this.screenshot;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getScreen() {
        return this.screen;
    }

    public final io.sentry.android.replay.ReplayFrame copy(java.io.File screenshot, long timestamp, java.lang.String screen) {
        kotlin.jvm.internal.m.e(screenshot, "screenshot");
        return new io.sentry.android.replay.ReplayFrame(screenshot, timestamp, screen);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.sentry.android.replay.ReplayFrame)) {
            return false;
        }
        io.sentry.android.replay.ReplayFrame replayFrame = (io.sentry.android.replay.ReplayFrame) other;
        return kotlin.jvm.internal.m.a(this.screenshot, replayFrame.screenshot) && this.timestamp == replayFrame.timestamp && kotlin.jvm.internal.m.a(this.screen, replayFrame.screen);
    }

    public final java.lang.String getScreen() {
        return this.screen;
    }

    public final java.io.File getScreenshot() {
        return this.screenshot;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iE = p121o0.p.e(this.screenshot.hashCode() * 31, 31, this.timestamp);
        java.lang.String str = this.screen;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReplayFrame(screenshot=");
        sb.append(this.screenshot);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", screen=");
        return Y6.f.l(sb, this.screen, ')');
    }

    public /* synthetic */ ReplayFrame(java.io.File file, long j, java.lang.String str, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(file, j, (i3 & 4) != 0 ? null : str);
    }
}
