package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements p068h4.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17171h;

    public /* synthetic */ n(int i3) {
        this.f17171h = i3;
    }

    @Override // p068h4.l
    public final boolean apply(java.lang.Object obj) {
        switch (this.f17171h) {
            case 0:
                return androidx.media3.ui.SubtitleViewUtils.lambda$removeAllEmbeddedStyling$0(obj);
            default:
                return androidx.media3.ui.SubtitleViewUtils.lambda$removeEmbeddedFontSizes$1(obj);
        }
    }
}
