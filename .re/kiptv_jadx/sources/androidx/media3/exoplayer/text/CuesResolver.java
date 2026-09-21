package androidx.media3.exoplayer.text;

/* JADX INFO: loaded from: classes.dex */
interface CuesResolver {
    boolean addCues(androidx.media3.extractor.text.CuesWithTiming cuesWithTiming, long j);

    void clear();

    void discardCuesBeforeTimeUs(long j);

    p076i4.AbstractC2186b0 getCuesAtTimeUs(long j);

    long getNextCueChangeTimeUs(long j);

    long getPreviousCueChangeTimeUs(long j);
}
