package androidx.media3.ui;

public final class n implements p068h4.l {

    public final int f17171h;

    public n(int i3) {
        this.f17171h = i3;
    }

    @Override
    public final boolean apply(Object obj) {
        switch (this.f17171h) {
            case 0:
                return SubtitleViewUtils.lambda$removeAllEmbeddedStyling$0(obj);
            default:
                return SubtitleViewUtils.lambda$removeEmbeddedFontSizes$1(obj);
        }
    }
}
