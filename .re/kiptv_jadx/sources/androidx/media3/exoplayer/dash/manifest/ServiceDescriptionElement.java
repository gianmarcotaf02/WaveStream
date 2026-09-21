package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public final class ServiceDescriptionElement {
    public final long maxOffsetMs;
    public final float maxPlaybackSpeed;
    public final long minOffsetMs;
    public final float minPlaybackSpeed;
    public final long targetOffsetMs;

    public ServiceDescriptionElement(long j, long j9, long j10, float f9, float f10) {
        this.targetOffsetMs = j;
        this.minOffsetMs = j9;
        this.maxOffsetMs = j10;
        this.minPlaybackSpeed = f9;
        this.maxPlaybackSpeed = f10;
    }
}
