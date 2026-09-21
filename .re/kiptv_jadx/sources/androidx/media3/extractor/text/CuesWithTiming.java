package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
public class CuesWithTiming {
    public final p076i4.AbstractC2186b0 cues;
    public final long durationUs;
    public final long endTimeUs;
    public final long startTimeUs;

    public CuesWithTiming(java.util.List<androidx.media3.common.text.Cue> list, long j, long j9) {
        this.cues = p076i4.AbstractC2186b0.u(list);
        this.startTimeUs = j;
        this.durationUs = j9;
        long j10 = androidx.media3.common.C.TIME_UNSET;
        if (j != androidx.media3.common.C.TIME_UNSET && j9 != androidx.media3.common.C.TIME_UNSET) {
            j10 = j + j9;
        }
        this.endTimeUs = j10;
    }
}
