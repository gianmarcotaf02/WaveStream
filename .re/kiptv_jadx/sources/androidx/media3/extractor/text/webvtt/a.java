package androidx.media3.extractor.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.util.Comparator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16859h;

    public /* synthetic */ a(int i3) {
        this.f16859h = i3;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f16859h) {
            case 0:
                return androidx.media3.extractor.text.webvtt.WebvttCueParser.Element.lambda$static$0((androidx.media3.extractor.text.webvtt.WebvttCueParser.Element) obj, (androidx.media3.extractor.text.webvtt.WebvttCueParser.Element) obj2);
            default:
                return androidx.media3.extractor.text.webvtt.WebvttSubtitle.lambda$getCues$0((androidx.media3.extractor.text.webvtt.WebvttCueInfo) obj, (androidx.media3.extractor.text.webvtt.WebvttCueInfo) obj2);
        }
    }
}
