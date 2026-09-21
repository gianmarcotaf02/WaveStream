package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements androidx.media3.extractor.ExtractorsFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16850a;

    public /* synthetic */ a(int i3) {
        this.f16850a = i3;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final androidx.media3.extractor.Extractor[] createExtractors() {
        switch (this.f16850a) {
            case 0:
                return androidx.media3.extractor.ExtractorsFactory.lambda$static$0();
            case 1:
                return androidx.media3.extractor.amr.AmrExtractor.lambda$static$0();
            case 2:
                return androidx.media3.extractor.flac.FlacExtractor.lambda$static$0();
            case 3:
                return androidx.media3.extractor.flv.FlvExtractor.lambda$static$0();
            case 4:
                return androidx.media3.extractor.mkv.MatroskaExtractor.lambda$static$1();
            case 5:
                return androidx.media3.extractor.mp3.Mp3Extractor.lambda$static$0();
            case 6:
                return androidx.media3.extractor.mp4.FragmentedMp4Extractor.lambda$static$1();
            case 7:
                return androidx.media3.extractor.mp4.Mp4Extractor.lambda$static$1();
            case 8:
                return androidx.media3.extractor.ogg.OggExtractor.lambda$static$0();
            case 9:
                return androidx.media3.extractor.ts.Ac3Extractor.lambda$static$0();
            case 10:
                return androidx.media3.extractor.ts.Ac4Extractor.lambda$static$0();
            case 11:
                return androidx.media3.extractor.ts.AdtsExtractor.lambda$static$0();
            case 12:
                return androidx.media3.extractor.ts.PsExtractor.lambda$static$0();
            case 13:
                return androidx.media3.extractor.ts.TsExtractor.lambda$static$1();
            default:
                return androidx.media3.extractor.wav.WavExtractor.lambda$static$0();
        }
    }
}
