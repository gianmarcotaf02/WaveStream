package p021c1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f18458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.text.TextPaint f18459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18461d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18462e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.text.BoringLayout.Metrics f18463f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f18464h;

    public e(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i3) {
        this.f18458a = charSequence;
        this.f18459b = textPaint;
        this.f18460c = i3;
    }

    public final android.text.BoringLayout.Metrics a() {
        android.text.BoringLayout.Metrics metricsIsBoring;
        if (!this.g) {
            android.text.TextDirectionHeuristic textDirectionHeuristicB = p021c1.j.b(this.f18460c);
            int i3 = android.os.Build.VERSION.SDK_INT;
            java.lang.CharSequence charSequence = this.f18458a;
            android.text.TextPaint textPaint = this.f18459b;
            if (i3 >= 33) {
                metricsIsBoring = android.text.BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicB, true, null);
            } else {
                metricsIsBoring = !textDirectionHeuristicB.isRtl(charSequence, 0, charSequence.length()) ? android.text.BoringLayout.isBoring(charSequence, textPaint, null) : null;
            }
            this.f18463f = metricsIsBoring;
            this.g = true;
        }
        return this.f18463f;
    }

    public final java.lang.CharSequence b() {
        java.lang.CharSequence charSequence = this.f18464h;
        if (charSequence != null) {
            kotlin.jvm.internal.m.b(charSequence);
            return charSequence;
        }
        java.lang.CharSequence charSequence2 = this.f18458a;
        if (charSequence2 instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence2;
            if (p021c1.f.f(spanned, android.text.style.CharacterStyle.class)) {
                android.text.style.CharacterStyle[] characterStyleArr = (android.text.style.CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), android.text.style.CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    android.text.SpannableString spannableString = null;
                    for (android.text.style.CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof android.text.style.MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new android.text.SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.f18464h = charSequence2;
        return charSequence2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    public final float c() {
        if (!java.lang.Float.isNaN(this.f18461d)) {
            return this.f18461d;
        }
        android.text.BoringLayout.Metrics metricsA = a();
        float fCeil = metricsA != null ? metricsA.width : -1;
        android.text.TextPaint textPaint = this.f18459b;
        if (fCeil < 0.0f) {
            fCeil = (float) java.lang.Math.ceil(android.text.Layout.getDesiredWidth(b(), 0, b().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            java.lang.CharSequence charSequence = this.f18458a;
            if (charSequence instanceof android.text.Spanned) {
                android.text.Spanned spanned = (android.text.Spanned) charSequence;
                if (p021c1.f.f(spanned, p039e1.f.class) || p021c1.f.f(spanned, p039e1.e.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fCeil += 0.5f;
            }
        }
        this.f18461d = fCeil;
        return fCeil;
    }
}
