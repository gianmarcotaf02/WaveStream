package p039e1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends android.text.style.MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21341a;

    public e(float f9) {
        this.f21341a = f9;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f21341a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f21341a);
    }
}
