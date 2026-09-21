package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class O extends android.widget.Spinner {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f24949p = {android.R.attr.spinnerMode};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q0.w0 f24950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.content.Context f24951i;
    public final p103m.F j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public android.widget.SpinnerAdapter f24952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f24953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p103m.N f24954m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f24955n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final android.graphics.Rect f24956o;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public O(android.content.Context context, android.util.AttributeSet attributeSet) throws java.lang.Throwable {
        android.content.res.TypedArray typedArrayObtainStyledAttributes;
        java.lang.CharSequence[] textArray;
        android.widget.SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.kiptv.tv.R.attr.spinnerStyle);
        this.f24956o = new android.graphics.Rect();
        p103m.N0.a(this, getContext());
        int[] iArr = h.a.f22423u;
        j1.l lVarS = j1.l.s(context, attributeSet, iArr, com.kiptv.tv.R.attr.spinnerStyle);
        this.f24950h = new Q0.w0(this);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) lVarS.j;
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f24951i = new p088k.b(context, resourceId);
        } else {
            this.f24951i = context;
        }
        int i3 = -1;
        android.content.res.TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24949p, com.kiptv.tv.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (java.lang.Exception e6) {
                    e = e6;
                    android.util.Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i3 != 0) {
                        p103m.H h9 = new p103m.H(this);
                        this.f24954m = h9;
                        h9.j = typedArray.getString(2);
                    } else if (i3 == 1) {
                        p103m.L l2 = new p103m.L(this, this.f24951i, attributeSet);
                        j1.l lVarS2 = j1.l.s(this.f24951i, attributeSet, iArr, com.kiptv.tv.R.attr.spinnerStyle);
                        this.f24955n = ((android.content.res.TypedArray) lVarS2.j).getLayoutDimension(3, -2);
                        l2.j(lVarS2.l(1));
                        l2.f24937I = typedArray.getString(2);
                        lVarS2.u();
                        this.f24954m = l2;
                        this.j = new p103m.F(this, this, l2);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(context, android.R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.kiptv.tv.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((android.widget.SpinnerAdapter) arrayAdapter);
                    }
                    lVarS.u();
                    this.f24953l = true;
                    spinnerAdapter = this.f24952k;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f24952k = null;
                    }
                    this.f24950h.k(attributeSet, com.kiptv.tv.R.attr.spinnerStyle);
                }
            } catch (java.lang.Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (java.lang.Exception e9) {
            e = e9;
            typedArrayObtainStyledAttributes = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i3 != 0) {
            p103m.H h10 = new p103m.H(this);
            this.f24954m = h10;
            h10.j = typedArray.getString(2);
        } else if (i3 == 1) {
            p103m.L l9 = new p103m.L(this, this.f24951i, attributeSet);
            j1.l lVarS3 = j1.l.s(this.f24951i, attributeSet, iArr, com.kiptv.tv.R.attr.spinnerStyle);
            this.f24955n = ((android.content.res.TypedArray) lVarS3.j).getLayoutDimension(3, -2);
            l9.j(lVarS3.l(1));
            l9.f24937I = typedArray.getString(2);
            lVarS3.u();
            this.f24954m = l9;
            this.j = new p103m.F(this, this, l9);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            android.widget.ArrayAdapter arrayAdapter2 = new android.widget.ArrayAdapter(context, android.R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.kiptv.tv.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((android.widget.SpinnerAdapter) arrayAdapter2);
        }
        lVarS.u();
        this.f24953l = true;
        spinnerAdapter = this.f24952k;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f24952k = null;
        }
        this.f24950h.k(attributeSet, com.kiptv.tv.R.attr.spinnerStyle);
    }

    public final int a(android.widget.SpinnerAdapter spinnerAdapter, android.graphics.drawable.Drawable drawable) {
        int i3 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = java.lang.Math.max(0, getSelectedItemPosition());
        int iMin = java.lang.Math.min(spinnerAdapter.getCount(), iMax + 15);
        android.view.View view = null;
        int iMax2 = 0;
        for (int iMax3 = java.lang.Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = java.lang.Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        android.graphics.Rect rect = this.f24956o;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Q0.w0 w0Var = this.f24950h;
        if (w0Var != null) {
            w0Var.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        p103m.N n3 = this.f24954m;
        return n3 != null ? n3.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        p103m.N n3 = this.f24954m;
        return n3 != null ? n3.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f24954m != null ? this.f24955n : super.getDropDownWidth();
    }

    public final p103m.N getInternalPopup() {
        return this.f24954m;
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
        p103m.N n3 = this.f24954m;
        return n3 != null ? n3.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
        return this.f24951i;
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
        p103m.N n3 = this.f24954m;
        return n3 != null ? n3.d() : super.getPrompt();
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        Q0.w0 w0Var = this.f24950h;
        if (w0Var != null) {
            return w0Var.h();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        Q0.w0 w0Var = this.f24950h;
        if (w0Var != null) {
            return w0Var.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p103m.N n3 = this.f24954m;
        if (n3 == null || !n3.a()) {
            return;
        }
        n3.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i3, int i9) {
        super.onMeasure(i3, i9);
        if (this.f24954m == null || android.view.View.MeasureSpec.getMode(i3) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(java.lang.Math.min(java.lang.Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i3)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.ViewTreeObserver viewTreeObserver;
        p103m.M m8 = (p103m.M) parcelable;
        super.onRestoreInstanceState(m8.getSuperState());
        if (!m8.f24942h || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new p095l.ViewTreeObserverOnGlobalLayoutListenerC2547d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        p103m.M m8 = new p103m.M(super.onSaveInstanceState());
        p103m.N n3 = this.f24954m;
        m8.f24942h = n3 != null && n3.a();
        return m8;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        p103m.F f9 = this.j;
        if (f9 == null || !f9.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        p103m.N n3 = this.f24954m;
        if (n3 == null) {
            return super.performClick();
        }
        if (n3.a()) {
            return true;
        }
        this.f24954m.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Q0.w0 w0Var = this.f24950h;
        if (w0Var != null) {
            w0Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        Q0.w0 w0Var = this.f24950h;
        if (w0Var != null) {
            w0Var.o(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i3) {
        p103m.N n3 = this.f24954m;
        if (n3 == null) {
            super.setDropDownHorizontalOffset(i3);
        } else {
            n3.l(i3);
            n3.c(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i3) {
        p103m.N n3 = this.f24954m;
        if (n3 != null) {
            n3.k(i3);
        } else {
            super.setDropDownVerticalOffset(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i3) {
        if (this.f24954m != null) {
            this.f24955n = i3;
        } else {
            super.setDropDownWidth(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        p103m.N n3 = this.f24954m;
        if (n3 != null) {
            n3.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i3) {
        setPopupBackgroundDrawable(com.google.common.util.concurrent.AbstractC1903s.y(getPopupContext(), i3));
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence charSequence) {
        p103m.N n3 = this.f24954m;
        if (n3 != null) {
            n3.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        Q0.w0 w0Var = this.f24950h;
        if (w0Var != null) {
            w0Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        Q0.w0 w0Var = this.f24950h;
        if (w0Var != null) {
            w0Var.u(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.SpinnerAdapter spinnerAdapter) {
        if (!this.f24953l) {
            this.f24952k = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        p103m.N n3 = this.f24954m;
        if (n3 != null) {
            android.content.Context context = this.f24951i;
            if (context == null) {
                context = getContext();
            }
            android.content.res.Resources.Theme theme = context.getTheme();
            p103m.I i3 = new p103m.I();
            i3.f24918a = spinnerAdapter;
            if (spinnerAdapter instanceof android.widget.ListAdapter) {
                i3.f24919b = (android.widget.ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter)) {
                p103m.G.a((android.widget.ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            n3.o(i3);
        }
    }
}
