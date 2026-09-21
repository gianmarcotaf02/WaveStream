package p039e1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends android.text.style.MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21337b;

    public /* synthetic */ a(float f9, int i3) {
        this.f21336a = i3;
        this.f21337b = f9;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        switch (this.f21336a) {
            case 0:
                textPaint.baselineShift += (int) java.lang.Math.ceil(textPaint.ascent() * this.f21337b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f21337b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint textPaint) {
        switch (this.f21336a) {
            case 0:
                textPaint.baselineShift += (int) java.lang.Math.ceil(textPaint.ascent() * this.f21337b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f21337b);
                break;
        }
    }
}
