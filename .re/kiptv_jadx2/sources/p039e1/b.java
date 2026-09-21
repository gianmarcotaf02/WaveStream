package p039e1;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class b extends MetricAffectingSpan {

    public final int f21338a;

    public final Object f21339b;

    public b(int i3, Object obj) {
        this.f21338a = i3;
        this.f21339b = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f21338a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f21339b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f21339b);
                break;
        }
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f21338a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f21339b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f21339b);
                break;
        }
    }
}
