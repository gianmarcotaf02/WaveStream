package androidx.media3.extractor.text.webvtt;

import java.util.Comparator;

public final class a implements Comparator {

    public final int f16859h;

    public a(int i3) {
        this.f16859h = i3;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f16859h) {
            case 0:
                return WebvttCueParser.Element.lambda$static$0((WebvttCueParser.Element) obj, (WebvttCueParser.Element) obj2);
            default:
                return WebvttSubtitle.lambda$getCues$0((WebvttCueInfo) obj, (WebvttCueInfo) obj2);
        }
    }
}
