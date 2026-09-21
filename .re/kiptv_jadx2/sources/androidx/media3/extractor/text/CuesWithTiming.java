package androidx.media3.extractor.text;

import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import java.util.List;
import p076i4.AbstractC2186b0;

public class CuesWithTiming {
    public final AbstractC2186b0 cues;
    public final long durationUs;
    public final long endTimeUs;
    public final long startTimeUs;

    public CuesWithTiming(List<Cue> list, long j, long j9) {
        this.cues = AbstractC2186b0.u(list);
        this.startTimeUs = j;
        this.durationUs = j9;
        long j10 = C.TIME_UNSET;
        if (j != C.TIME_UNSET && j9 != C.TIME_UNSET) {
            j10 = j + j9;
        }
        this.endTimeUs = j10;
    }
}
