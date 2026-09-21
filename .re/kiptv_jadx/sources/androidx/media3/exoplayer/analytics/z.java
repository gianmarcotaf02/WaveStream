package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class z {
    public static /* bridge */ /* synthetic */ android.media.AudioDescriptor d(java.lang.Object obj) {
        return (android.media.AudioDescriptor) obj;
    }

    public static /* bridge */ /* synthetic */ android.media.AudioProfile e(java.lang.Object obj) {
        return (android.media.AudioProfile) obj;
    }

    public static /* synthetic */ android.media.metrics.NetworkEvent.Builder g() {
        return new android.media.metrics.NetworkEvent.Builder();
    }

    public static /* synthetic */ android.media.metrics.PlaybackErrorEvent.Builder h() {
        return new android.media.metrics.PlaybackErrorEvent.Builder();
    }

    public static /* synthetic */ android.media.metrics.PlaybackMetrics.Builder i() {
        return new android.media.metrics.PlaybackMetrics.Builder();
    }

    public static /* synthetic */ android.media.metrics.PlaybackStateEvent.Builder k() {
        return new android.media.metrics.PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ android.media.metrics.TrackChangeEvent.Builder o(int i3) {
        return new android.media.metrics.TrackChangeEvent.Builder(i3);
    }
}
