package androidx.media3.extractor.mkv;

import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;

public final class a implements ExtractorsFactory {

    public final int f16852a;

    public final SubtitleParser.Factory f16853b;

    public a(SubtitleParser.Factory factory, int i3) {
        this.f16852a = i3;
        this.f16853b = factory;
    }

    @Override
    public final Extractor[] createExtractors() {
        switch (this.f16852a) {
            case 0:
                return MatroskaExtractor.lambda$newFactory$0(this.f16853b);
            case 1:
                return FragmentedMp4Extractor.lambda$newFactory$0(this.f16853b);
            default:
                return Mp4Extractor.lambda$newFactory$0(this.f16853b);
        }
    }
}
