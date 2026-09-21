package p039e1;

/* JADX INFO: loaded from: classes.dex */
public final class g implements android.text.style.LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21343a;

    public g(float f9) {
        this.f21343a = f9;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(java.lang.CharSequence charSequence, int i3, int i9, int i10, int i11, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        int i12 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i12 <= 0) {
            return;
        }
        int iCeil = (int) java.lang.Math.ceil(this.f21343a);
        int iCeil2 = (int) java.lang.Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / i12)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
