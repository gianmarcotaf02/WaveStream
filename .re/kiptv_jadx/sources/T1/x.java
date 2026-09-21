package T1;

/* JADX INFO: loaded from: classes.dex */
public final class x extends android.text.style.ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T1.w f9725b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public android.text.TextPaint f9728e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint.FontMetricsInt f9724a = new android.graphics.Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public short f9726c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9727d = 1.0f;

    public x(T1.w wVar) {
        E8.d.K(wVar, "rasterizer cannot be null");
        this.f9725b = wVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i3, int i9, float f9, int i10, int i11, int i12, android.graphics.Paint paint) {
        android.text.TextPaint textPaint = null;
        if (charSequence instanceof android.text.Spanned) {
            android.text.style.CharacterStyle[] characterStyleArr = (android.text.style.CharacterStyle[]) ((android.text.Spanned) charSequence).getSpans(i3, i9, android.text.style.CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    android.text.TextPaint textPaint2 = this.f9728e;
                    if (textPaint2 == null) {
                        textPaint2 = new android.text.TextPaint();
                        this.f9728e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (android.text.style.CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof android.text.style.MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof android.text.TextPaint) {
                    textPaint = (android.text.TextPaint) paint;
                }
            } else if (paint instanceof android.text.TextPaint) {
                textPaint = (android.text.TextPaint) paint;
            }
        } else if (paint instanceof android.text.TextPaint) {
            textPaint = (android.text.TextPaint) paint;
        }
        android.text.TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            android.graphics.Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawRect(f9, i10, f9 + this.f9726c, i12, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        T1.j.a().getClass();
        float f10 = i11;
        android.graphics.Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        T1.w wVar = this.f9725b;
        A7.m mVar = wVar.f9722b;
        android.graphics.Typeface typeface = (android.graphics.Typeface) mVar.f323l;
        android.graphics.Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) mVar.j, wVar.f9721a * 2, 2, f9, f10, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i3, int i9, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        android.graphics.Paint.FontMetricsInt fontMetricsInt2 = this.f9724a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = java.lang.Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        T1.w wVar = this.f9725b;
        U1.a aVarB = wVar.b();
        int iA = aVarB.a(14);
        this.f9727d = fAbs / (iA != 0 ? ((java.nio.ByteBuffer) aVarB.f1972k).getShort(iA + aVarB.f1970h) : (short) 0);
        U1.a aVarB2 = wVar.b();
        int iA2 = aVarB2.a(14);
        if (iA2 != 0) {
            ((java.nio.ByteBuffer) aVarB2.f1972k).getShort(iA2 + aVarB2.f1970h);
        }
        U1.a aVarB3 = wVar.b();
        int iA3 = aVarB3.a(12);
        short s9 = (short) ((iA3 != 0 ? ((java.nio.ByteBuffer) aVarB3.f1972k).getShort(iA3 + aVarB3.f1970h) : (short) 0) * this.f9727d);
        this.f9726c = s9;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s9;
    }
}
