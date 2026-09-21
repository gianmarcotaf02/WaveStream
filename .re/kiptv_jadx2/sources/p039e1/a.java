package p039e1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class a extends MetricAffectingSpan {

    public final int f21336a;

    public final float f21337b;

    public a(float f9, int i3) {
        this.f21336a = i3;
        this.f21337b = f9;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f21336a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f21337b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f21337b);
                break;
        }
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f21336a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f21337b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f21337b);
                break;
        }
    }
}
