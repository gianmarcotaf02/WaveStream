package androidx.media3.extractor.mkv;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements androidx.media3.extractor.ExtractorsFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.extractor.text.SubtitleParser.Factory f16853b;

    public /* synthetic */ a(androidx.media3.extractor.text.SubtitleParser.Factory factory, int i3) {
        this.f16852a = i3;
        this.f16853b = factory;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final androidx.media3.extractor.Extractor[] createExtractors() {
        switch (this.f16852a) {
            case 0:
                return androidx.media3.extractor.mkv.MatroskaExtractor.lambda$newFactory$0(this.f16853b);
            case 1:
                return androidx.media3.extractor.mp4.FragmentedMp4Extractor.lambda$newFactory$0(this.f16853b);
            default:
                return androidx.media3.extractor.mp4.Mp4Extractor.lambda$newFactory$0(this.f16853b);
        }
    }
}
