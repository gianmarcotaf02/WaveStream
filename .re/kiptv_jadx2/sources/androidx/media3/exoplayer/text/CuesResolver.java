package androidx.media3.exoplayer.text;

import androidx.media3.extractor.text.CuesWithTiming;
import p076i4.AbstractC2186b0;

interface CuesResolver {
    boolean addCues(CuesWithTiming cuesWithTiming, long j);

    void clear();

    void discardCuesBeforeTimeUs(long j);

    AbstractC2186b0 getCuesAtTimeUs(long j);

    long getNextCueChangeTimeUs(long j);

    long getPreviousCueChangeTimeUs(long j);
}
