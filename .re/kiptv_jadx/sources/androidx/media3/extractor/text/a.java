package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p068h4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16855a;

    public /* synthetic */ a(int i3) {
        this.f16855a = i3;
    }

    @Override // p068h4.j
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.f16855a) {
            case 0:
                return androidx.media3.extractor.text.CuesWithTimingSubtitle.lambda$static$0((androidx.media3.extractor.text.CuesWithTiming) obj);
            default:
                return ((androidx.media3.common.text.Cue) obj).toSerializableBundle();
        }
    }
}
