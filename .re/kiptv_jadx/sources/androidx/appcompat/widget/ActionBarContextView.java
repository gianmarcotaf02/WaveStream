package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends android.view.ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f15670A;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Y2.C1038h f15671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.content.Context f15672i;
    public androidx.appcompat.widget.ActionMenuView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p103m.C2570j f15673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public D1.C0216c0 f15675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.lang.CharSequence f15678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public java.lang.CharSequence f15679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public android.view.View f15680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public android.view.View f15681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public android.view.View f15682t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f15683u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public android.widget.TextView f15684v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public android.widget.TextView f15685w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f15686x;
    public final int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f15687z;

    public ActionBarContextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, com.kiptv.tv.R.attr.actionModeStyle);
        Y2.C1038h c1038h = new Y2.C1038h();
        c1038h.f11470c = this;
        c1038h.f11469b = false;
        this.f15671h = c1038h;
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!context.getTheme().resolveAttribute(com.kiptv.tv.R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f15672i = context;
        } else {
            this.f15672i = new android.view.ContextThemeWrapper(context, typedValue.resourceId);
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f22408d, com.kiptv.tv.R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : com.google.common.util.concurrent.AbstractC1903s.y(context, resourceId));
        this.f15686x = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.y = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f15674l = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f15670A = typedArrayObtainStyledAttributes.getResourceId(2, com.kiptv.tv.R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(android.view.View view, int i3, int i9) {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i9);
        return java.lang.Math.max(0, i3 - view.getMeasuredWidth());
    }

    public static int g(android.view.View view, int i3, int i9, int i10, boolean z6) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = ((i10 - measuredHeight) / 2) + i9;
        if (z6) {
            view.layout(i3 - measuredWidth, i11, i3, measuredHeight + i11);
        } else {
            view.layout(i3, i11, i3 + measuredWidth, measuredHeight + i11);
        }
        return z6 ? -measuredWidth : measuredWidth;
    }

    public final void c(N6.i0 i0Var) {
        android.view.View view = this.f15680r;
        if (view == null) {
            android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(this.f15670A, (android.view.ViewGroup) this, false);
            this.f15680r = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f15680r);
        }
        android.view.View viewFindViewById = this.f15680r.findViewById(com.kiptv.tv.R.id.action_mode_close_button);
        this.f15681s = viewFindViewById;
        viewFindViewById.setOnClickListener(new p072i.ViewOnClickListenerC2181a(1, i0Var));
        p095l.l lVarE = i0Var.e();
        p103m.C2570j c2570j = this.f15673k;
        if (c2570j != null) {
            c2570j.e();
            p103m.C2562f c2562f = c2570j.f25049A;
            if (c2562f != null && c2562f.b()) {
                c2562f.f24705i.dismiss();
            }
        }
        p103m.C2570j c2570j2 = new p103m.C2570j(getContext());
        this.f15673k = c2570j2;
        c2570j2.f25063s = true;
        c2570j2.f25064t = true;
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-2, -1);
        lVarE.b(this.f15673k, this.f15672i);
        p103m.C2570j c2570j3 = this.f15673k;
        p095l.z zVar = c2570j3.f25059o;
        if (zVar == null) {
            p095l.z zVar2 = (p095l.z) c2570j3.f25055k.inflate(c2570j3.f25057m, (android.view.ViewGroup) this, false);
            c2570j3.f25059o = zVar2;
            zVar2.b(c2570j3.j);
            c2570j3.f();
        }
        p095l.z zVar3 = c2570j3.f25059o;
        if (zVar != zVar3) {
            ((androidx.appcompat.widget.ActionMenuView) zVar3).setPresenter(c2570j3);
        }
        androidx.appcompat.widget.ActionMenuView actionMenuView = (androidx.appcompat.widget.ActionMenuView) zVar3;
        this.j = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.j, layoutParams);
    }

    public final void d() {
        if (this.f15683u == null) {
            android.view.LayoutInflater.from(getContext()).inflate(com.kiptv.tv.R.layout.abc_action_bar_title_item, this);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) getChildAt(getChildCount() - 1);
            this.f15683u = linearLayout;
            this.f15684v = (android.widget.TextView) linearLayout.findViewById(com.kiptv.tv.R.id.action_bar_title);
            this.f15685w = (android.widget.TextView) this.f15683u.findViewById(com.kiptv.tv.R.id.action_bar_subtitle);
            int i3 = this.f15686x;
            if (i3 != 0) {
                this.f15684v.setTextAppearance(getContext(), i3);
            }
            int i9 = this.y;
            if (i9 != 0) {
                this.f15685w.setTextAppearance(getContext(), i9);
            }
        }
        this.f15684v.setText(this.f15678p);
        this.f15685w.setText(this.f15679q);
        boolean zIsEmpty = android.text.TextUtils.isEmpty(this.f15678p);
        boolean zIsEmpty2 = android.text.TextUtils.isEmpty(this.f15679q);
        this.f15685w.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f15683u.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f15683u.getParent() == null) {
            addView(this.f15683u);
        }
    }

    public final void e() {
        removeAllViews();
        this.f15682t = null;
        this.j = null;
        this.f15673k = null;
        android.view.View view = this.f15681s;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f15675m != null ? this.f15671h.f11468a : getVisibility();
    }

    public int getContentHeight() {
        return this.f15674l;
    }

    public java.lang.CharSequence getSubtitle() {
        return this.f15679q;
    }

    public java.lang.CharSequence getTitle() {
        return this.f15678p;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i3) {
        if (i3 != getVisibility()) {
            D1.C0216c0 c0216c0 = this.f15675m;
            if (c0216c0 != null) {
                c0216c0.b();
            }
            super.setVisibility(i3);
        }
    }

    public final D1.C0216c0 i(int i3, long j) {
        D1.C0216c0 c0216c0 = this.f15675m;
        if (c0216c0 != null) {
            c0216c0.b();
        }
        Y2.C1038h c1038h = this.f15671h;
        if (i3 != 0) {
            D1.C0216c0 c0216c0A = D1.U.a(this);
            c0216c0A.a(0.0f);
            c0216c0A.c(j);
            ((androidx.appcompat.widget.ActionBarContextView) c1038h.f11470c).f15675m = c0216c0A;
            c1038h.f11468a = i3;
            c0216c0A.d(c1038h);
            return c0216c0A;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        D1.C0216c0 c0216c0A2 = D1.U.a(this);
        c0216c0A2.a(1.0f);
        c0216c0A2.c(j);
        ((androidx.appcompat.widget.ActionBarContextView) c1038h.f11470c).f15675m = c0216c0A2;
        c1038h.f11468a = i3;
        c0216c0A2.d(c1038h);
        return c0216c0A2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        int i3;
        super.onConfigurationChanged(configuration);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, h.a.f22405a, com.kiptv.tv.R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        p103m.C2570j c2570j = this.f15673k;
        if (c2570j != null) {
            android.content.res.Configuration configuration2 = c2570j.f25054i.getResources().getConfiguration();
            int i9 = configuration2.screenWidthDp;
            int i10 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i9 > 600 || ((i9 > 960 && i10 > 720) || (i9 > 720 && i10 > 960))) {
                i3 = 5;
            } else if (i9 >= 500 || ((i9 > 640 && i10 > 480) || (i9 > 480 && i10 > 640))) {
                i3 = 4;
            } else {
                i3 = i9 >= 360 ? 3 : 2;
            }
            c2570j.f25067w = i3;
            p095l.l lVar = c2570j.j;
            if (lVar != null) {
                lVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p103m.C2570j c2570j = this.f15673k;
        if (c2570j != null) {
            c2570j.e();
            p103m.C2562f c2562f = this.f15673k.f25049A;
            if (c2562f == null || !c2562f.b()) {
                return;
            }
            c2562f.f24705i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f15677o = false;
        }
        if (!this.f15677o) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f15677o = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f15677o = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        boolean z9 = p103m.g1.f25041a;
        boolean z10 = getLayoutDirection() == 1;
        int paddingRight = z10 ? (i10 - i3) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i11 - i9) - getPaddingTop()) - getPaddingBottom();
        android.view.View view = this.f15680r;
        if (view != null && view.getVisibility() != 8) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f15680r.getLayoutParams();
            int i12 = z10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i13 = z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i14 = z10 ? paddingRight - i12 : paddingRight + i12;
            int iG = g(this.f15680r, i14, paddingTop, paddingTop2, z10) + i14;
            paddingRight = z10 ? iG - i13 : iG + i13;
        }
        android.widget.LinearLayout linearLayout = this.f15683u;
        if (linearLayout != null && this.f15682t == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f15683u, paddingRight, paddingTop, paddingTop2, z10);
        }
        android.view.View view2 = this.f15682t;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z10);
        }
        int paddingLeft = z10 ? getPaddingLeft() : (i10 - i3) - getPaddingRight();
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.j;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i9) {
        if (android.view.View.MeasureSpec.getMode(i3) != 1073741824) {
            throw new java.lang.IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (android.view.View.MeasureSpec.getMode(i9) == 0) {
            throw new java.lang.IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = android.view.View.MeasureSpec.getSize(i3);
        int size2 = this.f15674l;
        if (size2 <= 0) {
            size2 = android.view.View.MeasureSpec.getSize(i9);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        android.view.View view = this.f15680r;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f15680r.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.j;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.j, paddingLeft, iMakeMeasureSpec);
        }
        android.widget.LinearLayout linearLayout = this.f15683u;
        if (linearLayout != null && this.f15682t == null) {
            if (this.f15687z) {
                this.f15683u.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f15683u.getMeasuredWidth();
                boolean z6 = measuredWidth <= paddingLeft;
                if (z6) {
                    paddingLeft -= measuredWidth;
                }
                this.f15683u.setVisibility(z6 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        android.view.View view2 = this.f15682t;
        if (view2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = i10 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i10 >= 0) {
                paddingLeft = java.lang.Math.min(i10, paddingLeft);
            }
            int i12 = layoutParams.height;
            int i13 = i12 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i12 >= 0) {
                iMin = java.lang.Math.min(i12, iMin);
            }
            this.f15682t.measure(android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, i11), android.view.View.MeasureSpec.makeMeasureSpec(iMin, i13));
        }
        if (this.f15674l > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            int measuredHeight = getChildAt(i15).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i14) {
                i14 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i14);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f15676n = false;
        }
        if (!this.f15676n) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f15676n = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f15676n = false;
        return true;
    }

    public void setContentHeight(int i3) {
        this.f15674l = i3;
    }

    public void setCustomView(android.view.View view) {
        android.widget.LinearLayout linearLayout;
        android.view.View view2 = this.f15682t;
        if (view2 != null) {
            removeView(view2);
        }
        this.f15682t = view;
        if (view != null && (linearLayout = this.f15683u) != null) {
            removeView(linearLayout);
            this.f15683u = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.f15679q = charSequence;
        d();
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.f15678p = charSequence;
        d();
        D1.U.k(this, charSequence);
    }

    public void setTitleOptional(boolean z6) {
        if (z6 != this.f15687z) {
            requestLayout();
        }
        this.f15687z = z6;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
