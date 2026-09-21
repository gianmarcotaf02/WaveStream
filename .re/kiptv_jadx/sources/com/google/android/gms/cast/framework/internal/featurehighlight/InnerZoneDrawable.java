package com.google.android.gms.cast.framework.internal.featurehighlight;

/* JADX INFO: loaded from: classes.dex */
class InnerZoneDrawable extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18667b;

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        if (this.f18667b > 0.0f) {
            throw null;
        }
        canvas.drawCircle(0.0f, 0.0f, this.f18666a * 0.0f, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
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
