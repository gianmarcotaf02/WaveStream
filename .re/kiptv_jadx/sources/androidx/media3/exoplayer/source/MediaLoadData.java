package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class MediaLoadData {
    public final int dataType;
    public final long mediaEndTimeMs;
    public final long mediaStartTimeMs;
    public final androidx.media3.common.Format trackFormat;
    public final java.lang.Object trackSelectionData;
    public final int trackSelectionReason;
    public final int trackType;

    public MediaLoadData(int i3) {
        this(i3, -1, null, 0, null, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
    }

    public MediaLoadData(int i3, int i9, androidx.media3.common.Format format, int i10, java.lang.Object obj, long j, long j9) {
        this.dataType = i3;
        this.trackType = i9;
        this.trackFormat = format;
        this.trackSelectionReason = i10;
        this.trackSelectionData = obj;
        this.mediaStartTimeMs = j;
        this.mediaEndTimeMs = j9;
    }
}
