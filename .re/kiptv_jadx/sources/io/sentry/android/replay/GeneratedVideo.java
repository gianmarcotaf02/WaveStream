package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/sentry/android/replay/GeneratedVideo;", "", "video", "Ljava/io/File;", io.sentry.rrweb.RRWebVideoEvent.JsonKeys.FRAME_COUNT, "", "duration", "", "(Ljava/io/File;IJ)V", "getDuration", "()J", "getFrameCount", "()I", "getVideo", "()Ljava/io/File;", "component1", "component2", "component3", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "toString", "", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class GeneratedVideo {
    public static final int $stable = 8;
    private final long duration;
    private final int frameCount;
    private final java.io.File video;

    public GeneratedVideo(java.io.File video, int i3, long j) {
        kotlin.jvm.internal.m.e(video, "video");
        this.video = video;
        this.frameCount = i3;
        this.duration = j;
    }

    public static /* synthetic */ io.sentry.android.replay.GeneratedVideo copy$default(io.sentry.android.replay.GeneratedVideo generatedVideo, java.io.File file, int i3, long j, int i9, java.lang.Object obj) {
        if ((i9 & 1) != 0) {
            file = generatedVideo.video;
        }
        if ((i9 & 2) != 0) {
            i3 = generatedVideo.frameCount;
        }
        if ((i9 & 4) != 0) {
            j = generatedVideo.duration;
        }
        return generatedVideo.copy(file, i3, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.io.File getVideo() {
        return this.video;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFrameCount() {
        return this.frameCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    public final io.sentry.android.replay.GeneratedVideo copy(java.io.File video, int frameCount, long duration) {
        kotlin.jvm.internal.m.e(video, "video");
        return new io.sentry.android.replay.GeneratedVideo(video, frameCount, duration);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.sentry.android.replay.GeneratedVideo)) {
            return false;
        }
        io.sentry.android.replay.GeneratedVideo generatedVideo = (io.sentry.android.replay.GeneratedVideo) other;
        return kotlin.jvm.internal.m.a(this.video, generatedVideo.video) && this.frameCount == generatedVideo.frameCount && this.duration == generatedVideo.duration;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getFrameCount() {
        return this.frameCount;
    }

    public final java.io.File getVideo() {
        return this.video;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.duration) + p121o0.p.d(this.frameCount, this.video.hashCode() * 31, 31);
    }

    public java.lang.String toString() {
        return "GeneratedVideo(video=" + this.video + ", frameCount=" + this.frameCount + ", duration=" + this.duration + ')';
    }
}
