package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTrackSelection implements androidx.media3.exoplayer.trackselection.ExoTrackSelection {
    private final long[] excludeUntilTimes;
    private final androidx.media3.common.Format[] formats;
    protected final androidx.media3.common.TrackGroup group;
    private int hashCode;
    protected final int length;
    private boolean playWhenReady;
    protected final int[] tracks;
    private final int type;

    public BaseTrackSelection(androidx.media3.common.TrackGroup trackGroup, int... iArr) {
        this(trackGroup, iArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(androidx.media3.common.Format format, androidx.media3.common.Format format2) {
        return format2.bitrate - format.bitrate;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void disable() {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void enable() {
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            androidx.media3.exoplayer.trackselection.BaseTrackSelection baseTrackSelection = (androidx.media3.exoplayer.trackselection.BaseTrackSelection) obj;
            if (this.group.equals(baseTrackSelection.group) && java.util.Arrays.equals(this.tracks, baseTrackSelection.tracks)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list) {
        return list.size();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean excludeTrack(int i3, long j) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean zIsTrackExcluded = isTrackExcluded(i3, jElapsedRealtime);
        int i9 = 0;
        while (i9 < this.length && !zIsTrackExcluded) {
            zIsTrackExcluded = (i9 == i3 || isTrackExcluded(i9, jElapsedRealtime)) ? false : true;
            i9++;
        }
        if (!zIsTrackExcluded) {
            return false;
        }
        long[] jArr = this.excludeUntilTimes;
        jArr[i3] = java.lang.Math.max(jArr[i3], androidx.media3.common.util.Util.addWithOverflowDefault(jElapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final androidx.media3.common.Format getFormat(int i3) {
        return this.formats[i3];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i3) {
        return this.tracks[i3];
    }

    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final androidx.media3.common.Format getSelectedFormat() {
        return this.formats[getSelectedIndex()];
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final int getSelectedIndexInTrackGroup() {
        return this.tracks[getSelectedIndex()];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final androidx.media3.common.TrackGroup getTrackGroup() {
        return this.group;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = java.util.Arrays.hashCode(this.tracks) + (java.lang.System.identityHashCode(this.group) * 31);
        }
        return this.hashCode;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(androidx.media3.common.Format format) {
        for (int i3 = 0; i3 < this.length; i3++) {
            if (this.formats[i3] == format) {
                return i3;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean isTrackExcluded(int i3, long j) {
        return this.excludeUntilTimes[i3] > j;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int length() {
        return this.tracks.length;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlayWhenReadyChanged(boolean z6) {
        this.playWhenReady = z6;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f9) {
    }

    public BaseTrackSelection(androidx.media3.common.TrackGroup trackGroup, int[] iArr, int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(iArr.length > 0);
        this.type = i3;
        trackGroup.getClass();
        this.group = trackGroup;
        int length = iArr.length;
        this.length = length;
        this.formats = new androidx.media3.common.Format[length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            this.formats[i9] = trackGroup.getFormat(iArr[i9]);
        }
        java.util.Arrays.sort(this.formats, new androidx.media3.exoplayer.trackselection.a(6));
        this.tracks = new int[this.length];
        int i10 = 0;
        while (true) {
            int i11 = this.length;
            if (i10 >= i11) {
                this.excludeUntilTimes = new long[i11];
                this.playWhenReady = false;
                return;
            } else {
                this.tracks[i10] = trackGroup.indexOf(this.formats[i10]);
                i10++;
            }
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(int i3) {
        for (int i9 = 0; i9 < this.length; i9++) {
            if (this.tracks[i9] == i3) {
                return i9;
            }
        }
        return -1;
    }
}
