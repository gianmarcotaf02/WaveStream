package p039e1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class j extends CharacterStyle {

    public final int f21358a;

    public final float f21359b;

    public final float f21360c;

    public final float f21361d;

    public j(int i3, float f9, float f10, float f11) {
        this.f21358a = i3;
        this.f21359b = f9;
        this.f21360c = f10;
        this.f21361d = f11;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f21361d, this.f21359b, this.f21360c, this.f21358a);
    }
}
