package androidx.media3.common;

public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final Timeline timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(Timeline timeline, int i3, long j) {
        this.timeline = timeline;
        this.windowIndex = i3;
        this.positionMs = j;
    }
}
