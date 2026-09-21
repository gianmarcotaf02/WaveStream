package androidx.media3.extractor;

public interface TrackAwareSeekMap extends SeekMap {
    SeekMap.SeekPoints getSeekPoints(long j, int i3);

    boolean isSeekable(int i3);
}
