package androidx.media3.extractor.text;

import androidx.media3.common.text.Cue;
import p068h4.j;

public final class a implements j {

    public final int f16855a;

    public a(int i3) {
        this.f16855a = i3;
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.f16855a) {
            case 0:
                return CuesWithTimingSubtitle.lambda$static$0((CuesWithTiming) obj);
            default:
                return ((Cue) obj).toSerializableBundle();
        }
    }
}
