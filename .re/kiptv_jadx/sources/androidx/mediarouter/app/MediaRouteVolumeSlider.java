package androidx.mediarouter.app;

/* JADX INFO: loaded from: classes.dex */
class MediaRouteVolumeSlider extends p103m.D {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f17183i;
    public android.graphics.drawable.Drawable j;

    public MediaRouteVolumeSlider(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        this.f17183i = context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true) ? typedValue.getFloat() : 0.5f;
    }

    @Override // p103m.D, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i3 = isEnabled() ? 255 : (int) (this.f17183i * 255.0f);
        android.graphics.drawable.Drawable drawable = this.j;
        android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(0, mode);
        this.j.setAlpha(i3);
        android.graphics.drawable.Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof android.graphics.drawable.LayerDrawable) {
            android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) getProgressDrawable();
            android.graphics.drawable.Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.progress);
            layerDrawable.findDrawableByLayerId(android.R.id.background).setColorFilter(0, mode);
            progressDrawable = drawableFindDrawableByLayerId;
        }
        progressDrawable.setColorFilter(0, mode);
        progressDrawable.setAlpha(i3);
    }

    @Override // android.widget.AbsSeekBar
    public final void setThumb(android.graphics.drawable.Drawable drawable) {
        this.j = drawable;
        super.setThumb(drawable);
    }
}
