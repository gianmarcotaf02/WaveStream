package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
public abstract class SubtitleOutputBuffer extends androidx.media3.decoder.DecoderOutputBuffer implements androidx.media3.extractor.text.Subtitle {
    private long subsampleOffsetUs;
    private androidx.media3.extractor.text.Subtitle subtitle;

    @Override // androidx.media3.decoder.DecoderOutputBuffer, androidx.media3.decoder.Buffer
    public void clear() {
        super.clear();
        this.subtitle = null;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public java.util.List<androidx.media3.common.text.Cue> getCues(long j) {
        androidx.media3.extractor.text.Subtitle subtitle = this.subtitle;
        subtitle.getClass();
        return subtitle.getCues(j - this.subsampleOffsetUs);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i3) {
        androidx.media3.extractor.text.Subtitle subtitle = this.subtitle;
        subtitle.getClass();
        return subtitle.getEventTime(i3) + this.subsampleOffsetUs;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        androidx.media3.extractor.text.Subtitle subtitle = this.subtitle;
        subtitle.getClass();
        return subtitle.getEventTimeCount();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        androidx.media3.extractor.text.Subtitle subtitle = this.subtitle;
        subtitle.getClass();
        return subtitle.getNextEventTimeIndex(j - this.subsampleOffsetUs);
    }

    public void setContent(long j, androidx.media3.extractor.text.Subtitle subtitle, long j9) {
        this.timeUs = j;
        this.subtitle = subtitle;
        if (j9 != Long.MAX_VALUE) {
            j = j9;
        }
        this.subsampleOffsetUs = j;
    }
}
