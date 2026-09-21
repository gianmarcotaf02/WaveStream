package p103m;

/* JADX INFO: renamed from: m.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2577m0 extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f25080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25081i;

    public final void a(android.graphics.Canvas canvas) {
        this.f25080h.draw(canvas);
    }

    public final void b(float f9, float f10) {
        this.f25080h.setHotspot(f9, f10);
    }

    public final void c(int i3, int i9, int i10, int i11) {
        this.f25080h.setHotspotBounds(i3, i9, i10, i11);
    }

    public final boolean d(boolean z6, boolean z9) {
        return super.setVisible(z6, z9) || this.f25080h.setVisible(z6, z9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        if (this.f25081i) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f25080h.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable getCurrent() {
        return this.f25080h.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f25080h.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f25080h.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f25080h.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f25080h.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f25080h.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect rect) {
        return this.f25080h.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f25080h.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.Region getTransparentRegion() {
        return this.f25080h.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f25080h.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f25080h.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f25080h.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect rect) {
        this.f25080h.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        return this.f25080h.setLevel(i3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.f25080h.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        this.f25080h.setAutoMirrored(z6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i3) {
        this.f25080h.setChangingConfigurations(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f25080h.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z6) {
        this.f25080h.setDither(z6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z6) {
        this.f25080h.setFilterBitmap(z6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f9, float f10) {
        if (this.f25081i) {
            b(f9, f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i3, int i9, int i10, int i11) {
        if (this.f25081i) {
            c(i3, i9, i10, i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f25081i) {
            return this.f25080h.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        this.f25080h.setTint(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        this.f25080h.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f25080h.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z9) {
        if (this.f25081i) {
            return d(z6, z9);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
