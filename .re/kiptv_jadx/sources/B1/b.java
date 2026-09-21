package B1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.text.TextPaint f583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.text.TextDirectionHeuristic f584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f586d;

    public b(android.text.TextPaint textPaint, android.text.TextDirectionHeuristic textDirectionHeuristic, int i3, int i9) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            A0.q.g(textPaint).setBreakStrategy(i3).setHyphenationFrequency(i9).setTextDirection(textDirectionHeuristic).build();
        }
        this.f583a = textPaint;
        this.f584b = textDirectionHeuristic;
        this.f585c = i3;
        this.f586d = i9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B1.b)) {
            return false;
        }
        B1.b bVar = (B1.b) obj;
        if (this.f585c != bVar.f585c || this.f586d != bVar.f586d) {
            return false;
        }
        android.text.TextPaint textPaint = this.f583a;
        float textSize = textPaint.getTextSize();
        android.text.TextPaint textPaint2 = bVar.f583a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !android.text.TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f584b == bVar.f584b;
    }

    public final int hashCode() {
        android.text.TextPaint textPaint = this.f583a;
        return java.util.Objects.hash(java.lang.Float.valueOf(textPaint.getTextSize()), java.lang.Float.valueOf(textPaint.getTextScaleX()), java.lang.Float.valueOf(textPaint.getTextSkewX()), java.lang.Float.valueOf(textPaint.getLetterSpacing()), java.lang.Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), java.lang.Boolean.valueOf(textPaint.isElegantTextHeight()), this.f584b, java.lang.Integer.valueOf(this.f585c), java.lang.Integer.valueOf(this.f586d));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("textSize=");
        android.text.TextPaint textPaint = this.f583a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i3 = android.os.Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i3 >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f584b);
        sb.append(", breakStrategy=" + this.f585c);
        sb.append(", hyphenationFrequency=" + this.f586d);
        sb.append("}");
        return sb.toString();
    }

    public b(android.text.PrecomputedText.Params params) {
        this.f583a = params.getTextPaint();
        this.f584b = params.getTextDirection();
        this.f585c = params.getBreakStrategy();
        this.f586d = params.getHyphenationFrequency();
    }
}
