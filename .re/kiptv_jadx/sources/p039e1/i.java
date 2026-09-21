package p039e1;

/* JADX INFO: loaded from: classes.dex */
public final class i extends android.text.style.ReplacementSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.graphics.Paint.FontMetricsInt f21354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21357d;

    public final android.graphics.Paint.FontMetricsInt a() {
        android.graphics.Paint.FontMetricsInt fontMetricsInt = this.f21354a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        kotlin.jvm.internal.m.k("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f21357d) {
            p065h1.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f21356c;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i3, int i9, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        this.f21357d = true;
        paint.getTextSize();
        this.f21354a = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            p065h1.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f21355b = (int) java.lang.Math.ceil(0.0f);
        this.f21356c = (int) java.lang.Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = java.lang.Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = java.lang.Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.f21357d) {
            p065h1.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f21355b;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i3, int i9, float f9, int i10, int i11, int i12, android.graphics.Paint paint) {
    }
}
