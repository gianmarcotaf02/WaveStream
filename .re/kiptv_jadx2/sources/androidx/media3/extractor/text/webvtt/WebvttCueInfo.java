package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.Cue;

public final class WebvttCueInfo {
    public final Cue cue;
    public final long endTimeUs;
    public final long startTimeUs;

    public WebvttCueInfo(Cue cue, long j, long j9) {
        this.cue = cue;
        this.startTimeUs = j;
        this.endTimeUs = j9;
    }
}
