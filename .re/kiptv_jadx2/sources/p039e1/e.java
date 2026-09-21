package p039e1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class e extends MetricAffectingSpan {

    public final float f21341a;

    public e(float f9) {
        this.f21341a = f9;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f21341a);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f21341a);
    }
}
