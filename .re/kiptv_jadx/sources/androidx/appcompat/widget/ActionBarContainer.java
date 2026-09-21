package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public android.view.View f15663i;
    public android.view.View j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public android.graphics.drawable.Drawable f15664k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public android.graphics.drawable.Drawable f15665l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f15666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f15667n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15668o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f15669p;

    public ActionBarContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new E2.m(1, this));
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f22405a);
        boolean z6 = false;
        this.f15664k = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f15665l = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f15669p = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == com.kiptv.tv.R.id.split_action_bar) {
            this.f15667n = true;
            this.f15666m = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f15667n ? !(this.f15664k != null || this.f15665l != null) : this.f15666m == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.f15664k;
        if (drawable != null && drawable.isStateful()) {
            this.f15664k.setState(getDrawableState());
        }
        android.graphics.drawable.Drawable drawable2 = this.f15665l;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f15665l.setState(getDrawableState());
        }
        android.graphics.drawable.Drawable drawable3 = this.f15666m;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f15666m.setState(getDrawableState());
    }

    public android.view.View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.f15664k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable2 = this.f15665l;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable3 = this.f15666m;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f15663i = findViewById(com.kiptv.tv.R.id.action_bar);
        this.j = findViewById(com.kiptv.tv.R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.f15662h || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        super.onLayout(z6, i3, i9, i10, i11);
        boolean z9 = true;
        if (this.f15667n) {
            android.graphics.drawable.Drawable drawable = this.f15666m;
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
                android.view.View view = this.j;
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

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i9) {
        int i10;
        if (this.f15663i == null && android.view.View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE && (i10 = this.f15669p) >= 0) {
            i9 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i10, android.view.View.MeasureSpec.getSize(i9)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i9);
        if (this.f15663i == null) {
            return;
        }
        android.view.View.MeasureSpec.getMode(i9);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f15664k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f15664k);
        }
        this.f15664k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            android.view.View view = this.f15663i;
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

    public void setSplitBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3 = this.f15666m;
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

    public void setStackedBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f15665l;
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

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z6 = i3 == 0;
        android.graphics.drawable.Drawable drawable = this.f15664k;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
        android.graphics.drawable.Drawable drawable2 = this.f15665l;
        if (drawable2 != null) {
            drawable2.setVisible(z6, false);
        }
        android.graphics.drawable.Drawable drawable3 = this.f15666m;
        if (drawable3 != null) {
            drawable3.setVisible(z6, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ActionMode startActionModeForChild(android.view.View view, android.view.ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f15664k;
        boolean z6 = this.f15667n;
        if (drawable == drawable2 && !z6) {
            return true;
        }
        if (drawable == this.f15665l && this.f15668o) {
            return true;
        }
        return (drawable == this.f15666m && z6) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ActionMode startActionModeForChild(android.view.View view, android.view.ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }

    public void setTabContainer(p103m.L0 l2) {
    }
}
