package com.google.android.gms.cast.framework.internal.featurehighlight;

/* JADX INFO: loaded from: classes.dex */
class OuterHighlightDrawable extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18670c;

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        canvas.drawCircle(this.f18669b + 0.0f, this.f18670c + 0.0f, 0.0f * this.f18668a, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        throw null;
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
