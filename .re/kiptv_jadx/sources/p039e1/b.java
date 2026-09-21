package p039e1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends android.text.style.MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f21339b;

    public /* synthetic */ b(int i3, java.lang.Object obj) {
        this.f21338a = i3;
        this.f21339b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        switch (this.f21338a) {
            case 0:
                textPaint.setFontFeatureSettings((java.lang.String) this.f21339b);
                break;
            default:
                textPaint.setTypeface((android.graphics.Typeface) this.f21339b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint textPaint) {
        switch (this.f21338a) {
            case 0:
                textPaint.setFontFeatureSettings((java.lang.String) this.f21339b);
                break;
            default:
                textPaint.setTypeface((android.graphics.Typeface) this.f21339b);
                break;
        }
    }
}
