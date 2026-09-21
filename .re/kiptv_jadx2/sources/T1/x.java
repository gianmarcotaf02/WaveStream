package T1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

public final class x extends ReplacementSpan {

    public final w f9725b;

    public TextPaint f9728e;

    public final Paint.FontMetricsInt f9724a = new Paint.FontMetricsInt();

    public short f9726c = -1;

    public float f9727d = 1.0f;

    public x(w wVar) {
        E8.d.K(wVar, "rasterizer cannot be null");
        this.f9725b = wVar;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i9, float f9, int i10, int i11, int i12, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i3, i9, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f9728e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f9728e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f9, i10, f9 + this.f9726c, i12, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        j.a().getClass();
        float f10 = i11;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        w wVar = this.f9725b;
        A7.m mVar = wVar.f9722b;
        Typeface typeface = (Typeface) mVar.f323l;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) mVar.j, wVar.f9721a * 2, 2, f9, f10, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i9, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f9724a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        w wVar = this.f9725b;
        U1.a aVarB = wVar.b();
        int iA = aVarB.a(14);
        this.f9727d = fAbs / (iA != 0 ? ((ByteBuffer) aVarB.f1972k).getShort(iA + aVarB.f1970h) : (short) 0);
        U1.a aVarB2 = wVar.b();
        int iA2 = aVarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) aVarB2.f1972k).getShort(iA2 + aVarB2.f1970h);
        }
        U1.a aVarB3 = wVar.b();
        int iA3 = aVarB3.a(12);
        short s9 = (short) ((iA3 != 0 ? ((ByteBuffer) aVarB3.f1972k).getShort(iA3 + aVarB3.f1970h) : (short) 0) * this.f9727d);
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
