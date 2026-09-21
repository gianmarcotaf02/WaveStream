package androidx.media3.exoplayer.analytics;

import android.media.AudioDescriptor;
import android.media.AudioProfile;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;

public abstract class z {
    public static AudioDescriptor d(Object obj) {
        return (AudioDescriptor) obj;
    }

    public static AudioProfile e(Object obj) {
        return (AudioProfile) obj;
    }

    public static NetworkEvent.Builder g() {
        return new NetworkEvent.Builder();
    }

    public static PlaybackErrorEvent.Builder h() {
        return new PlaybackErrorEvent.Builder();
    }

    public static PlaybackMetrics.Builder i() {
        return new PlaybackMetrics.Builder();
    }

    public static PlaybackStateEvent.Builder k() {
        return new PlaybackStateEvent.Builder();
    }

    public static TrackChangeEvent.Builder o(int i3) {
        return new TrackChangeEvent.Builder(i3);
    }
}
