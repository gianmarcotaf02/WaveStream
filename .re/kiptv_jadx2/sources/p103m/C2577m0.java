package p103m;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public final class C2577m0 extends Drawable implements Drawable.Callback {

    public Drawable f25080h;

    public boolean f25081i;

    public final void a(Canvas canvas) {
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

    @Override
    public final void draw(Canvas canvas) {
        if (this.f25081i) {
            a(canvas);
        }
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f25080h.getChangingConfigurations();
    }

    @Override
    public final Drawable getCurrent() {
        return this.f25080h.getCurrent();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f25080h.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f25080h.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f25080h.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f25080h.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f25080h.getOpacity();
    }

    @Override
    public final boolean getPadding(Rect rect) {
        return this.f25080h.getPadding(rect);
    }

    @Override
    public final int[] getState() {
        return this.f25080h.getState();
    }

    @Override
    public final Region getTransparentRegion() {
        return this.f25080h.getTransparentRegion();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f25080h.isAutoMirrored();
    }

    @Override
    public final boolean isStateful() {
        return this.f25080h.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f25080h.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f25080h.setBounds(rect);
    }

    @Override
    public final boolean onLevelChange(int i3) {
        return this.f25080h.setLevel(i3);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override
    public final void setAlpha(int i3) {
        this.f25080h.setAlpha(i3);
    }

    @Override
    public final void setAutoMirrored(boolean z6) {
        this.f25080h.setAutoMirrored(z6);
    }

    @Override
    public final void setChangingConfigurations(int i3) {
        this.f25080h.setChangingConfigurations(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25080h.setColorFilter(colorFilter);
    }

    @Override
    public final void setDither(boolean z6) {
        this.f25080h.setDither(z6);
    }

    @Override
    public final void setFilterBitmap(boolean z6) {
        this.f25080h.setFilterBitmap(z6);
    }

    @Override
    public final void setHotspot(float f9, float f10) {
        if (this.f25081i) {
            b(f9, f10);
        }
    }

    @Override
    public final void setHotspotBounds(int i3, int i9, int i10, int i11) {
        if (this.f25081i) {
            c(i3, i9, i10, i11);
        }
    }

    @Override
    public final boolean setState(int[] iArr) {
        if (this.f25081i) {
            return this.f25080h.setState(iArr);
        }
        return false;
    }

    @Override
    public final void setTint(int i3) {
        this.f25080h.setTint(i3);
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        this.f25080h.setTintList(colorStateList);
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f25080h.setTintMode(mode);
    }

    @Override
    public final boolean setVisible(boolean z6, boolean z9) {
        if (this.f25081i) {
            return d(z6, z9);
        }
        return false;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
