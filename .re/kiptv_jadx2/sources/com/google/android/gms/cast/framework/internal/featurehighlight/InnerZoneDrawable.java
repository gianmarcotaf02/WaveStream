package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class InnerZoneDrawable extends Drawable {

    public float f18666a;

    public float f18667b;

    @Override
    public final void draw(Canvas canvas) {
        if (this.f18667b > 0.0f) {
            throw null;
        }
        canvas.drawCircle(0.0f, 0.0f, this.f18666a * 0.0f, null);
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

    public void setPulseAlpha(float f9) {
        this.f18667b = f9;
        invalidateSelf();
    }

    public void setPulseScale(float f9) {
        invalidateSelf();
    }

    public void setScale(float f9) {
        this.f18666a = f9;
        invalidateSelf();
    }
}
