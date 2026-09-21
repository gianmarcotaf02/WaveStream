package androidx.media3.extractor;

import androidx.media3.extractor.amr.AmrExtractor;
import androidx.media3.extractor.flac.FlacExtractor;
import androidx.media3.extractor.flv.FlvExtractor;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.ogg.OggExtractor;
import androidx.media3.extractor.ts.Ac3Extractor;
import androidx.media3.extractor.ts.Ac4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.media3.extractor.wav.WavExtractor;

public final class a implements ExtractorsFactory {

    public final int f16850a;

    public a(int i3) {
        this.f16850a = i3;
    }

    @Override
    public final Extractor[] createExtractors() {
        switch (this.f16850a) {
            case 0:
                return ExtractorsFactory.lambda$static$0();
            case 1:
                return AmrExtractor.lambda$static$0();
            case 2:
                return FlacExtractor.lambda$static$0();
            case 3:
                return FlvExtractor.lambda$static$0();
            case 4:
                return MatroskaExtractor.lambda$static$1();
            case 5:
                return Mp3Extractor.lambda$static$0();
            case 6:
                return FragmentedMp4Extractor.lambda$static$1();
            case 7:
                return Mp4Extractor.lambda$static$1();
            case 8:
                return OggExtractor.lambda$static$0();
            case 9:
                return Ac3Extractor.lambda$static$0();
            case 10:
                return Ac4Extractor.lambda$static$0();
            case 11:
                return AdtsExtractor.lambda$static$0();
            case 12:
                return PsExtractor.lambda$static$0();
            case 13:
                return TsExtractor.lambda$static$1();
            default:
                return WavExtractor.lambda$static$0();
        }
    }
}
