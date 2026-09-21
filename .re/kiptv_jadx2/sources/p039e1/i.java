package p039e1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.m;
import p065h1.a;

public final class i extends ReplacementSpan {

    public Paint.FontMetricsInt f21354a;

    public int f21355b;

    public int f21356c;

    public boolean f21357d;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f21354a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        m.k("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f21357d) {
            a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f21356c;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i9, Paint.FontMetricsInt fontMetricsInt) {
        this.f21357d = true;
        paint.getTextSize();
        this.f21354a = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f21355b = (int) Math.ceil(0.0f);
        this.f21356c = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.f21357d) {
            a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f21355b;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i9, float f9, int i10, int i11, int i12, Paint paint) {
    }
}
