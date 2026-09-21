package io.sentry.android.replay.video;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u0015¨\u0006$"}, d2 = {"Lio/sentry/android/replay/video/MuxerConfig;", "", "file", "Ljava/io/File;", "recordingWidth", "", "recordingHeight", io.sentry.rrweb.RRWebVideoEvent.JsonKeys.FRAME_RATE, "bitRate", "mimeType", "", "(Ljava/io/File;IIIILjava/lang/String;)V", "getBitRate", "()I", "getFile", "()Ljava/io/File;", "getFrameRate", "getMimeType", "()Ljava/lang/String;", "getRecordingHeight", "setRecordingHeight", "(I)V", "getRecordingWidth", "setRecordingWidth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "toString", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class MuxerConfig {
    public static final int $stable = 8;
    private final int bitRate;
    private final java.io.File file;
    private final int frameRate;
    private final java.lang.String mimeType;
    private int recordingHeight;
    private int recordingWidth;

    public MuxerConfig(java.io.File file, int i3, int i9, int i10, int i11, java.lang.String mimeType) {
        kotlin.jvm.internal.m.e(file, "file");
        kotlin.jvm.internal.m.e(mimeType, "mimeType");
        this.file = file;
        this.recordingWidth = i3;
        this.recordingHeight = i9;
        this.frameRate = i10;
        this.bitRate = i11;
        this.mimeType = mimeType;
    }

    public static /* synthetic */ io.sentry.android.replay.video.MuxerConfig copy$default(io.sentry.android.replay.video.MuxerConfig muxerConfig, java.io.File file, int i3, int i9, int i10, int i11, java.lang.String str, int i12, java.lang.Object obj) {
        if ((i12 & 1) != 0) {
            file = muxerConfig.file;
        }
        if ((i12 & 2) != 0) {
            i3 = muxerConfig.recordingWidth;
        }
        if ((i12 & 4) != 0) {
            i9 = muxerConfig.recordingHeight;
        }
        if ((i12 & 8) != 0) {
            i10 = muxerConfig.frameRate;
        }
        if ((i12 & 16) != 0) {
            i11 = muxerConfig.bitRate;
        }
        if ((i12 & 32) != 0) {
            str = muxerConfig.mimeType;
        }
        int i13 = i11;
        java.lang.String str2 = str;
        return muxerConfig.copy(file, i3, i9, i10, i13, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.io.File getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFrameRate() {
        return this.frameRate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBitRate() {
        return this.bitRate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    public final io.sentry.android.replay.video.MuxerConfig copy(java.io.File file, int recordingWidth, int recordingHeight, int frameRate, int bitRate, java.lang.String mimeType) {
        kotlin.jvm.internal.m.e(file, "file");
        kotlin.jvm.internal.m.e(mimeType, "mimeType");
        return new io.sentry.android.replay.video.MuxerConfig(file, recordingWidth, recordingHeight, frameRate, bitRate, mimeType);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.sentry.android.replay.video.MuxerConfig)) {
            return false;
        }
        io.sentry.android.replay.video.MuxerConfig muxerConfig = (io.sentry.android.replay.video.MuxerConfig) other;
        return kotlin.jvm.internal.m.a(this.file, muxerConfig.file) && this.recordingWidth == muxerConfig.recordingWidth && this.recordingHeight == muxerConfig.recordingHeight && this.frameRate == muxerConfig.frameRate && this.bitRate == muxerConfig.bitRate && kotlin.jvm.internal.m.a(this.mimeType, muxerConfig.mimeType);
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final java.io.File getFile() {
        return this.file;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    public int hashCode() {
        return this.mimeType.hashCode() + p121o0.p.d(this.bitRate, p121o0.p.d(this.frameRate, p121o0.p.d(this.recordingHeight, p121o0.p.d(this.recordingWidth, this.file.hashCode() * 31, 31), 31), 31), 31);
    }

    public final void setRecordingHeight(int i3) {
        this.recordingHeight = i3;
    }

    public final void setRecordingWidth(int i3) {
        this.recordingWidth = i3;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MuxerConfig(file=");
        sb.append(this.file);
        sb.append(", recordingWidth=");
        sb.append(this.recordingWidth);
        sb.append(", recordingHeight=");
        sb.append(this.recordingHeight);
        sb.append(", frameRate=");
        sb.append(this.frameRate);
        sb.append(", bitRate=");
        sb.append(this.bitRate);
        sb.append(", mimeType=");
        return Y6.f.l(sb, this.mimeType, ')');
    }

    public /* synthetic */ MuxerConfig(java.io.File file, int i3, int i9, int i10, int i11, java.lang.String str, int i12, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(file, i3, i9, i10, i11, (i12 & 32) != 0 ? androidx.media3.common.MimeTypes.VIDEO_H264 : str);
    }
}
