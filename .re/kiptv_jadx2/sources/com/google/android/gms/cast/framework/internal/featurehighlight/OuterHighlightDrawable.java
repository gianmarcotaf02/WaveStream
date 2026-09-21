package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class OuterHighlightDrawable extends Drawable {

    public float f18668a;

    public float f18669b;

    public float f18670c;

    @Override
    public final void draw(Canvas canvas) {
        canvas.drawCircle(this.f18669b + 0.0f, this.f18670c + 0.0f, 0.0f * this.f18668a, null);
    }

    @Override
    public final int getAlpha() {
        throw null;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i3) {
        throw null;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    public void setScale(float f9) {
        this.f18668a = f9;
        invalidateSelf();
    }

    public void setTranslationX(float f9) {
        this.f18669b = f9;
        invalidateSelf();
    }

    public void setTranslationY(float f9) {
        this.f18670c = f9;
        invalidateSelf();
    }
}
