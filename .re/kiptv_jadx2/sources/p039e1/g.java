package p039e1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

public final class g implements LineHeightSpan {

    public final float f21343a;

    public g(float f9) {
        this.f21343a = f9;
    }

    @Override
    public final void chooseHeight(CharSequence charSequence, int i3, int i9, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        int i12 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i12 <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.f21343a);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / i12)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
