package p039e1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class k extends CharacterStyle {

    public final boolean f21362a;

    public final boolean f21363b;

    public k(boolean z6, boolean z9) {
        this.f21362a = z6;
        this.f21363b = z9;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f21362a);
        textPaint.setStrikeThruText(this.f21363b);
    }
}
