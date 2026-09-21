package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public interface TrackAwareSeekMap extends androidx.media3.extractor.SeekMap {
    androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j, int i3);

    boolean isSeekable(int i3);
}
