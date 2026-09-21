package androidx.appcompat.widget;

import E2.m;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.kiptv.tv.R;
import h.a;
import p103m.L0;

public class ActionBarContainer extends FrameLayout {

    public boolean f15662h;

    public View f15663i;
    public View j;

    public Drawable f15664k;

    public Drawable f15665l;

    public Drawable f15666m;

    public final boolean f15667n;

    public boolean f15668o;

    public final int f15669p;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new m(1, this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f22405a);
        boolean z6 = false;
        this.f15664k = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f15665l = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f15669p = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f15667n = true;
            this.f15666m = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f15667n ? !(this.f15664k != null || this.f15665l != null) : this.f15666m == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f15664k;
        if (drawable != null && drawable.isStateful()) {
            this.f15664k.setState(getDrawableState());
        }
        Drawable drawable2 = this.f15665l;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f15665l.setState(getDrawableState());
        }
        Drawable drawable3 = this.f15666m;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f15666m.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f15664k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f15665l;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f15666m;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f15663i = findViewById(R.id.action_bar);
        this.j = findViewById(R.id.action_context_bar);
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f15662h || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        super.onLayout(z6, i3, i9, i10, i11);
        boolean z9 = true;
        if (this.f15667n) {
            Drawable drawable = this.f15666m;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z9 = false;
            }
        } else {
            if (this.f15664k == null) {
                z9 = false;
            } else if (this.f15663i.getVisibility() == 0) {
                this.f15664k.setBounds(this.f15663i.getLeft(), this.f15663i.getTop(), this.f15663i.getRight(), this.f15663i.getBottom());
            } else {
                View view = this.j;
                if (view == null || view.getVisibility() != 0) {
                    this.f15664k.setBounds(0, 0, 0, 0);
                } else {
                    this.f15664k.setBounds(this.j.getLeft(), this.j.getTop(), this.j.getRight(), this.j.getBottom());
                }
            }
            this.f15668o = false;
        }
        if (z9) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i3, int i9) {
        int i10;
        if (this.f15663i == null && View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE && (i10 = this.f15669p) >= 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(Math.min(i10, View.MeasureSpec.getSize(i9)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i9);
        if (this.f15663i == null) {
            return;
        }
        View.MeasureSpec.getMode(i9);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f15664k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f15664k);
        }
        this.f15664k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f15663i;
            if (view != null) {
                this.f15664k.setBounds(view.getLeft(), this.f15663i.getTop(), this.f15663i.getRight(), this.f15663i.getBottom());
            }
        }
        boolean z6 = false;
        if (!this.f15667n ? !(this.f15664k != null || this.f15665l != null) : this.f15666m == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f15666m;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f15666m);
        }
        this.f15666m = drawable;
        boolean z6 = this.f15667n;
        boolean z9 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z6 && (drawable2 = this.f15666m) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z6 ? !(this.f15664k != null || this.f15665l != null) : this.f15666m == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f15665l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f15665l);
        }
        this.f15665l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f15668o && this.f15665l != null) {
                throw null;
            }
        }
        boolean z6 = false;
        if (!this.f15667n ? !(this.f15664k != null || this.f15665l != null) : this.f15666m == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z6) {
        this.f15662h = z6;
        setDescendantFocusability(z6 ? 393216 : 262144);
    }

    @Override
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z6 = i3 == 0;
        Drawable drawable = this.f15664k;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
        Drawable drawable2 = this.f15665l;
        if (drawable2 != null) {
            drawable2.setVisible(z6, false);
        }
        Drawable drawable3 = this.f15666m;
        if (drawable3 != null) {
            drawable3.setVisible(z6, false);
        }
    }

    @Override
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f15664k;
        boolean z6 = this.f15667n;
        if (drawable == drawable2 && !z6) {
            return true;
        }
        if (drawable == this.f15665l && this.f15668o) {
            return true;
        }
        return (drawable == this.f15666m && z6) || super.verifyDrawable(drawable);
    }

    @Override
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }

    public void setTabContainer(L0 l2) {
    }
}
