package androidx.media3.extractor.text;

import androidx.media3.common.text.Cue;
import androidx.media3.decoder.DecoderOutputBuffer;
import java.util.List;

public abstract class SubtitleOutputBuffer extends DecoderOutputBuffer implements Subtitle {
    private long subsampleOffsetUs;
    private Subtitle subtitle;

    @Override
    public void clear() {
        super.clear();
        this.subtitle = null;
    }

    @Override
    public List<Cue> getCues(long j) {
        Subtitle subtitle = this.subtitle;
        subtitle.getClass();
        return subtitle.getCues(j - this.subsampleOffsetUs);
    }

    @Override
    public long getEventTime(int i3) {
        Subtitle subtitle = this.subtitle;
        subtitle.getClass();
        return subtitle.getEventTime(i3) + this.subsampleOffsetUs;
    }

    @Override
    public int getEventTimeCount() {
        Subtitle subtitle = this.subtitle;
        subtitle.getClass();
        return subtitle.getEventTimeCount();
    }

    @Override
    public int getNextEventTimeIndex(long j) {
        Subtitle subtitle = this.subtitle;
        subtitle.getClass();
        return subtitle.getNextEventTimeIndex(j - this.subsampleOffsetUs);
    }

    public void setContent(long j, Subtitle subtitle, long j9) {
        this.timeUs = j;
        this.subtitle = subtitle;
        if (j9 != Long.MAX_VALUE) {
            j = j9;
        }
        this.subsampleOffsetUs = j;
    }
}
