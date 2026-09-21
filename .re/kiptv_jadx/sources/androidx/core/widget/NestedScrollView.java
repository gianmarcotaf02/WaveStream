package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends android.widget.FrameLayout implements D1.InterfaceC0232q, androidx.core.view.ScrollingView {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final float f16086J = (float) (java.lang.Math.log(0.78d) / java.lang.Math.log(0.9d));

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final H1.e f16087K = new H1.e();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int[] f16088L = {android.R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int[] f16089A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int[] f16090B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f16091C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f16092D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public H1.h f16093E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final D1.r f16094F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final D1.C0230o f16095G;
    public float H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final D1.C0224i f16096I;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f16097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f16098i;
    public final android.graphics.Rect j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final android.widget.OverScroller f16099k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final android.widget.EdgeEffect f16100l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final android.widget.EdgeEffect f16101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public D1.C0238x f16102n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16103o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public android.view.View f16106r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16107s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public android.view.VelocityTracker f16108t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16109u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16110v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f16111w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f16112x;
    public final int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f16113z;

    public NestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.kiptv.tv.R.attr.nestedScrollViewStyle);
        this.j = new android.graphics.Rect();
        this.f16104p = true;
        this.f16105q = false;
        this.f16106r = null;
        this.f16107s = false;
        this.f16110v = true;
        this.f16113z = -1;
        this.f16089A = new int[2];
        this.f16090B = new int[2];
        this.f16096I = new D1.C0224i(getContext(), new A.a(11, this));
        int i3 = android.os.Build.VERSION.SDK_INT;
        this.f16100l = i3 >= 31 ? H1.c.a(context, attributeSet) : new android.widget.EdgeEffect(context);
        this.f16101m = i3 >= 31 ? H1.c.a(context, attributeSet) : new android.widget.EdgeEffect(context);
        this.f16097h = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f16099k = new android.widget.OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        this.f16111w = viewConfiguration.getScaledTouchSlop();
        this.f16112x = viewConfiguration.getScaledMinimumFlingVelocity();
        this.y = viewConfiguration.getScaledMaximumFlingVelocity();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f16088L, com.kiptv.tv.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f16094F = new D1.r();
        this.f16095G = new D1.C0230o(this);
        setNestedScrollingEnabled(true);
        D1.U.j(this, f16087K);
    }

    private D1.C0238x getScrollFeedbackProvider() {
        if (this.f16102n == null) {
            this.f16102n = new D1.C0238x(this);
        }
        return this.f16102n;
    }

    public static boolean m(android.view.View view, androidx.core.widget.NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        java.lang.Object parent = view.getParent();
        return (parent instanceof android.view.ViewGroup) && m((android.view.View) parent, nestedScrollView);
    }

    @Override // D1.InterfaceC0231p
    public final void a(android.view.ViewGroup viewGroup, int i3, int i9, int i10, int i11, int i12) {
        o(i11, i12, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view) {
        if (getChildCount() > 0) {
            throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final boolean b(int i3) {
        android.view.View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        android.view.View view = viewFindFocus;
        android.view.View viewFindNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, view, i3);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !n(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i3 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i3 == 130 && getChildCount() > 0) {
                android.view.View childAt = getChildAt(0);
                maxScrollAmount = java.lang.Math.min((childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i3 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            android.graphics.Rect rect = this.j;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            t(d(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i3);
        }
        if (view != null && view.isFocused() && !n(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // D1.InterfaceC0232q
    public final void c(android.view.ViewGroup viewGroup, int i3, int i9, int i10, int i11, int i12, int[] iArr) {
        o(i11, i12, iArr);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i3;
        int scrollRange;
        int i9;
        int overScrollMode;
        if (this.f16099k.isFinished()) {
            return;
        }
        this.f16099k.computeScrollOffset();
        int currY = this.f16099k.getCurrY();
        int i10 = currY - this.f16092D;
        int height = getHeight();
        android.widget.EdgeEffect edgeEffect = this.f16101m;
        android.widget.EdgeEffect edgeEffect2 = this.f16100l;
        if (i10 <= 0 || E8.d.P(edgeEffect2) == 0.0f) {
            if (i10 < 0 && E8.d.P(edgeEffect) != 0.0f) {
                float f9 = height;
                iRound = java.lang.Math.round(E8.d.U(edgeEffect, (i10 * 4.0f) / f9, 0.5f) * (f9 / 4.0f));
                if (iRound != i10) {
                    edgeEffect.finish();
                }
            }
            this.f16092D = currY;
            iArr = this.f16090B;
            iArr[1] = 0;
            i(0, i10, 1, iArr, null);
            i3 = i10 - iArr[1];
            scrollRange = getScrollRange();
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                H1.f.a(this, java.lang.Math.abs(this.f16099k.getCurrVelocity()));
            }
            if (i3 != 0) {
                int scrollY = getScrollY();
                q(i3, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i11 = i3 - scrollY2;
                iArr[1] = 0;
                i9 = 1;
                this.f16095G.d(0, scrollY2, 0, i11, this.f16089A, 1, iArr);
                i3 = i11 - iArr[1];
            } else {
                i9 = 1;
            }
            if (i3 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == i9 && scrollRange > 0)) {
                    if (i3 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f16099k.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f16099k.getCurrVelocity());
                    }
                }
                this.f16099k.abortAnimation();
                y(i9);
            }
            if (this.f16099k.isFinished()) {
                y(i9);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = java.lang.Math.round(E8.d.U(edgeEffect2, ((-i10) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i10) {
            edgeEffect2.finish();
        }
        i10 -= iRound;
        this.f16092D = currY;
        iArr = this.f16090B;
        iArr[1] = 0;
        i(0, i10, 1, iArr, null);
        i3 = i10 - iArr[1];
        scrollRange = getScrollRange();
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            H1.f.a(this, java.lang.Math.abs(this.f16099k.getCurrVelocity()));
        }
        if (i3 != 0) {
            int scrollY3 = getScrollY();
            q(i3, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i12 = i3 - scrollY4;
            iArr[1] = 0;
            i9 = 1;
            this.f16095G.d(0, scrollY4, 0, i12, this.f16089A, 1, iArr);
            i3 = i12 - iArr[1];
        } else {
            i9 = 1;
        }
        if (i3 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i3 < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f16099k.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f16099k.getCurrVelocity());
                }
            } else if (i3 < 0) {
                if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f16099k.getCurrVelocity());
                }
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb((int) this.f16099k.getCurrVelocity());
            }
            this.f16099k.abortAnimation();
            y(i9);
        }
        if (this.f16099k.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            y(i9);
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        return java.lang.Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        android.view.View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = java.lang.Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    public final int d(android.graphics.Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i9 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i10 = rect.bottom;
        if (i10 > i9 && rect.top > scrollY) {
            return java.lang.Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i9, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || i10 >= i9) {
            return 0;
        }
        return java.lang.Math.max(rect.height() > height ? 0 - (i9 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f9, float f10, boolean z6) {
        return this.f16095G.a(f9, f10, z6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f9, float f10) {
        return this.f16095G.b(f9, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i9, int[] iArr, int[] iArr2) {
        return this.f16095G.c(i3, i9, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i9, int i10, int i11, int[] iArr) {
        return this.f16095G.d(i3, i9, i10, i11, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        android.widget.EdgeEffect edgeEffect = this.f16100l;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = java.lang.Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        android.widget.EdgeEffect edgeEffect2 = this.f16101m;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = java.lang.Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // D1.InterfaceC0231p
    public final void e(int i3, android.view.View view) {
        D1.r rVar = this.f16094F;
        if (i3 == 1) {
            rVar.f2054b = 0;
        } else {
            rVar.f2053a = 0;
        }
        y(i3);
    }

    @Override // D1.InterfaceC0231p
    public final void f(int i3, int i9, int i10, int[] iArr) {
        i(i3, i9, i10, iArr, null);
    }

    @Override // D1.InterfaceC0231p
    public final boolean g(android.view.View view, android.view.View view2, int i3, int i9) {
        return (i3 & 2) != 0;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        D1.r rVar = this.f16094F;
        return rVar.f2054b | rVar.f2053a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        return java.lang.Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.H == 0.0f) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            android.content.Context context = getContext();
            if (!context.getTheme().resolveAttribute(android.R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new java.lang.IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.H = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.H;
    }

    @Override // D1.InterfaceC0231p
    public final void h(android.view.View view, android.view.View view2, int i3, int i9) {
        D1.r rVar = this.f16094F;
        if (i9 == 1) {
            rVar.f2054b = i3;
        } else {
            rVar.f2053a = i3;
        }
        w(2, i9);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f16095G.f(0);
    }

    public final boolean i(int i3, int i9, int i10, int[] iArr, int[] iArr2) {
        return this.f16095G.c(i3, i9, i10, iArr, null);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f16095G.f2050d;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    public final boolean j(android.view.KeyEvent keyEvent) {
        android.view.View viewFindFocus;
        android.view.View viewFindNextFocus;
        this.j.setEmpty();
        int childCount = getChildCount();
        int i3 = androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        if (childCount > 0) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? l(33) : b(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? l(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_HDMV_DTS) : b(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    }
                    if (keyCode == 62) {
                        if (keyEvent.isShiftPressed()) {
                            i3 = 33;
                        }
                        r(i3);
                        return false;
                    }
                    if (keyCode == 92) {
                        return l(33);
                    }
                    if (keyCode == 93) {
                        return l(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    }
                    if (keyCode == 122) {
                        r(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        r(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, viewFindFocus, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_HDMV_DTS)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, viewFindFocus, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    public final void k(int i3) {
        if (getChildCount() > 0) {
            this.f16099k.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, androidx.media3.common.util.Log.LOG_LEVEL_OFF, 0, 0);
            w(2, 1);
            this.f16092D = getScrollY();
            postInvalidateOnAnimation();
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                H1.f.a(this, java.lang.Math.abs(this.f16099k.getCurrVelocity()));
            }
        }
    }

    public final boolean l(int i3) {
        int childCount;
        boolean z6 = i3 == 130;
        int height = getHeight();
        android.graphics.Rect rect = this.j;
        rect.top = 0;
        rect.bottom = height;
        if (z6 && (childCount = getChildCount()) > 0) {
            android.view.View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i3, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(android.view.View view, int i3, int i9) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(android.view.ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft(), layoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(android.view.View view, int i3, int i9, int i10, int i11) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(android.view.ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(android.view.View view, int i3, int i9) {
        android.graphics.Rect rect = this.j;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i3 >= getScrollY() && rect.top - i3 <= getScrollY() + i9;
    }

    public final void o(int i3, int i9, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i3);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f16095G.d(0, scrollY2, 0, i3 - scrollY2, null, i9, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16105q = false;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x0110  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        float f9;
        int i3;
        int width;
        int i9;
        int i10;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z6;
        android.view.VelocityTracker velocityTracker;
        float yVelocity;
        float f10;
        long j;
        float f11;
        float fSqrt;
        int i11;
        int i12;
        if (motionEvent.getAction() != 8 || this.f16107s) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
            i3 = 9;
            f9 = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            f9 = axisValue2;
            i3 = 26;
        } else {
            f9 = 0.0f;
            i3 = 0;
            width = 0;
        }
        if (f9 == 0.0f) {
            return false;
        }
        t(-((int) (getVerticalScrollFactorCompat() * f9)), i3, motionEvent, width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i3 != 0) {
            D1.C0224i c0224i = this.f16096I;
            c0224i.getClass();
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i13 = c0224i.f2026f;
            int[] iArr = c0224i.f2027h;
            int i14 = 1;
            if (i13 == source && c0224i.g == deviceId && c0224i.f2025e == i3) {
                z6 = false;
                i9 = 20;
                i10 = 0;
            } else {
                android.content.Context context = c0224i.f2021a;
                android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
                i9 = 20;
                int deviceId2 = motionEvent.getDeviceId();
                int source2 = motionEvent.getSource();
                i10 = 0;
                int i15 = android.os.Build.VERSION.SDK_INT;
                if (i15 >= 34) {
                    java.lang.reflect.Method method = D1.V.f1985a;
                    scaledMinimumFlingVelocity = D1.C.f(viewConfiguration, deviceId2, i3, source2);
                } else {
                    java.lang.reflect.Method method2 = D1.V.f1985a;
                    android.view.InputDevice device = android.view.InputDevice.getDevice(deviceId2);
                    if (device == null || device.getMotionRange(i3, source2) == null) {
                        scaledMinimumFlingVelocity = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
                    } else {
                        android.content.res.Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i3 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", com.revenuecat.purchases.common.events.BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM) : -1;
                        java.util.Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                            scaledMinimumFlingVelocity = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
                        }
                    }
                }
                iArr[0] = scaledMinimumFlingVelocity;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i15 >= 34) {
                    scaledMaximumFlingVelocity = D1.C.e(viewConfiguration, deviceId3, i3, source3);
                } else {
                    android.view.InputDevice device2 = android.view.InputDevice.getDevice(deviceId3);
                    if ((device2 == null || device2.getMotionRange(i3, source3) == null) ? false : true) {
                        android.content.res.Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i3 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", com.revenuecat.purchases.common.events.BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM) : -1;
                        java.util.Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                            scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                        }
                    } else {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                c0224i.f2026f = source;
                c0224i.g = deviceId;
                c0224i.f2025e = i3;
                z6 = true;
            }
            if (iArr[i10] == Integer.MAX_VALUE) {
                android.view.VelocityTracker velocityTracker2 = c0224i.f2023c;
                if (velocityTracker2 == null) {
                    return true;
                }
                velocityTracker2.recycle();
                c0224i.f2023c = null;
                return true;
            }
            if (c0224i.f2023c == null) {
                c0224i.f2023c = android.view.VelocityTracker.obtain();
            }
            android.view.VelocityTracker velocityTracker3 = c0224i.f2023c;
            java.util.Map map = D1.D.f1960a;
            velocityTracker3.addMovement(motionEvent);
            if (android.os.Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                java.util.Map map2 = D1.D.f1960a;
                if (!map2.containsKey(velocityTracker3)) {
                    map2.put(velocityTracker3, new D1.E());
                }
                D1.E e6 = (D1.E) map2.get(velocityTracker3);
                e6.getClass();
                long eventTime = motionEvent.getEventTime();
                int i16 = e6.f1964d;
                long[] jArr = e6.f1962b;
                if (i16 != 0 && eventTime - jArr[e6.f1965e] > 40) {
                    e6.f1964d = i10;
                    e6.f1963c = 0.0f;
                }
                int i17 = (e6.f1965e + 1) % 20;
                e6.f1965e = i17;
                int i18 = e6.f1964d;
                if (i18 != i9) {
                    e6.f1964d = i18 + 1;
                }
                e6.f1961a[i17] = motionEvent.getAxisValue(26);
                jArr[e6.f1965e] = eventTime;
            }
            float f12 = Float.MAX_VALUE;
            velocityTracker3.computeCurrentVelocity(1000, Float.MAX_VALUE);
            D1.E e9 = (D1.E) D1.D.f1960a.get(velocityTracker3);
            if (e9 != null) {
                int i19 = e9.f1964d;
                if (i19 < 2) {
                    velocityTracker = velocityTracker3;
                    f11 = Float.MAX_VALUE;
                    i11 = 1000;
                    fSqrt = 0.0f;
                } else {
                    int i20 = e9.f1965e;
                    int i21 = ((i20 + 20) - (i19 - 1)) % 20;
                    long[] jArr2 = e9.f1962b;
                    long j9 = jArr2[i20];
                    while (true) {
                        j = jArr2[i21];
                        if (j9 - j <= 100) {
                            break;
                        }
                        e9.f1964d--;
                        i21 = (i21 + 1) % 20;
                    }
                    int i22 = e9.f1964d;
                    if (i22 < 2) {
                        velocityTracker = velocityTracker3;
                        f11 = Float.MAX_VALUE;
                        i11 = 1000;
                        fSqrt = 0.0f;
                    } else {
                        float[] fArr = e9.f1961a;
                        if (i22 == 2) {
                            int i23 = (i21 + 1) % 20;
                            long j10 = jArr2[i23];
                            if (j == j10) {
                                velocityTracker = velocityTracker3;
                                f11 = Float.MAX_VALUE;
                                i11 = 1000;
                                fSqrt = 0.0f;
                            } else {
                                velocityTracker = velocityTracker3;
                                f11 = Float.MAX_VALUE;
                                i11 = 1000;
                                fSqrt = fArr[i23] / (j10 - j);
                            }
                        } else {
                            float f13 = 0.0f;
                            int i24 = 0;
                            int i25 = 0;
                            while (true) {
                                if (i24 >= e9.f1964d - 1) {
                                    break;
                                }
                                int i26 = i24 + i21;
                                long j11 = jArr2[i26 % 20];
                                int i27 = (i26 + 1) % 20;
                                if (jArr2[i27] == j11) {
                                    i12 = i14;
                                } else {
                                    i25++;
                                    float fSqrt2 = (f13 < 0.0f ? -1.0f : 1.0f) * ((float) java.lang.Math.sqrt(java.lang.Math.abs(f13) * 2.0f));
                                    float f14 = fArr[i27] / (jArr2[i27] - j11);
                                    float fAbs = (java.lang.Math.abs(f14) * (f14 - fSqrt2)) + f13;
                                    i12 = i14;
                                    if (i25 == i12) {
                                        fAbs *= 0.5f;
                                    }
                                    f13 = fAbs;
                                }
                                i24 += i12;
                                f12 = f12;
                                i14 = i12;
                                velocityTracker3 = velocityTracker3;
                            }
                            velocityTracker = velocityTracker3;
                            f11 = f12;
                            fSqrt = ((float) java.lang.Math.sqrt(java.lang.Math.abs(f13) * 2.0f)) * (f13 < 0.0f ? -1.0f : 1.0f);
                            i11 = 1000;
                        }
                    }
                }
                float f15 = fSqrt * i11;
                e9.f1963c = f15;
                if (f15 < (-java.lang.Math.abs(f11))) {
                    e9.f1963c = -java.lang.Math.abs(f11);
                } else if (e9.f1963c > java.lang.Math.abs(f11)) {
                    e9.f1963c = java.lang.Math.abs(f11);
                }
            } else {
                velocityTracker = velocityTracker3;
            }
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                yVelocity = D1.C.b(velocityTracker, i3);
            } else {
                android.view.VelocityTracker velocityTracker4 = velocityTracker;
                if (i3 == 0) {
                    yVelocity = velocityTracker4.getXVelocity();
                } else if (i3 == 1) {
                    yVelocity = velocityTracker4.getYVelocity();
                } else {
                    D1.E e10 = (D1.E) D1.D.f1960a.get(velocityTracker4);
                    yVelocity = (e10 == null || i3 != 26) ? 0.0f : e10.f1963c;
                }
            }
            androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) c0224i.f2022b.f9i;
            float f16 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = java.lang.Math.signum(f16);
            if (z6 || (fSignum != java.lang.Math.signum(c0224i.f2024d) && fSignum != 0.0f)) {
                nestedScrollView.f16099k.abortAnimation();
            }
            if (java.lang.Math.abs(f16) >= iArr[0]) {
                int i28 = iArr[1];
                float fMax = java.lang.Math.max(-i28, java.lang.Math.min(f16, i28));
                if (fMax == 0.0f) {
                    f10 = 0.0f;
                } else {
                    nestedScrollView.f16099k.abortAnimation();
                    nestedScrollView.k((int) fMax);
                    f10 = fMax;
                }
                c0224i.f2024d = f10;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x012d  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.VelocityTracker velocityTracker;
        android.view.VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action == 2 && this.f16107s) {
            return true;
        }
        int i3 = action & 255;
        if (i3 == 0) {
            int y = (int) motionEvent.getY();
            int x9 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                android.view.View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x9 < childAt.getLeft() || x9 >= childAt.getRight()) {
                    if (!x(motionEvent) && this.f16099k.isFinished()) {
                        z6 = false;
                    }
                    this.f16107s = z6;
                    velocityTracker = this.f16108t;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f16108t = null;
                    }
                } else {
                    this.f16103o = y;
                    this.f16113z = motionEvent.getPointerId(0);
                    android.view.VelocityTracker velocityTracker3 = this.f16108t;
                    if (velocityTracker3 == null) {
                        this.f16108t = android.view.VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f16108t.addMovement(motionEvent);
                    this.f16099k.computeScrollOffset();
                    if (!x(motionEvent) && this.f16099k.isFinished()) {
                        z6 = false;
                    }
                    this.f16107s = z6;
                    w(2, 0);
                }
            } else {
                if (!x(motionEvent)) {
                    z6 = false;
                }
                this.f16107s = z6;
                velocityTracker = this.f16108t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f16108t = null;
                }
            }
        } else if (i3 == 1) {
            this.f16107s = false;
            this.f16113z = -1;
            velocityTracker2 = this.f16108t;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f16108t = null;
            }
            if (this.f16099k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else if (i3 == 2) {
            int i9 = this.f16113z;
            if (i9 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i9);
                if (iFindPointerIndex == -1) {
                    android.util.Log.e("NestedScrollView", "Invalid pointerId=" + i9 + " in onInterceptTouchEvent");
                } else {
                    int y9 = (int) motionEvent.getY(iFindPointerIndex);
                    if (java.lang.Math.abs(y9 - this.f16103o) > this.f16111w && (2 & getNestedScrollAxes()) == 0) {
                        this.f16107s = true;
                        this.f16103o = y9;
                        if (this.f16108t == null) {
                            this.f16108t = android.view.VelocityTracker.obtain();
                        }
                        this.f16108t.addMovement(motionEvent);
                        this.f16091C = 0;
                        android.view.ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i3 == 3) {
            this.f16107s = false;
            this.f16113z = -1;
            velocityTracker2 = this.f16108t;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f16108t = null;
            }
            if (this.f16099k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else if (i3 == 6) {
            p(motionEvent);
        }
        return this.f16107s;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        int measuredHeight;
        super.onLayout(z6, i3, i9, i10, i11);
        int i12 = 0;
        this.f16104p = false;
        android.view.View view = this.f16106r;
        if (view != null && m(view, this)) {
            android.view.View view2 = this.f16106r;
            android.graphics.Rect rect = this.j;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iD = d(rect);
            if (iD != 0) {
                scrollBy(0, iD);
            }
        }
        this.f16106r = null;
        if (!this.f16105q) {
            if (this.f16093E != null) {
                scrollTo(getScrollX(), this.f16093E.f3865h);
                this.f16093E = null;
            }
            if (getChildCount() > 0) {
                android.view.View childAt = getChildAt(0);
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i11 - i9) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i12 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i12 != scrollY) {
                scrollTo(getScrollX(), i12);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f16105q = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i9) {
        super.onMeasure(i3, i9);
        if (this.f16109u && android.view.View.MeasureSpec.getMode(i9) != 0 && getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(android.view.ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View view, float f9, float f10, boolean z6) {
        if (z6) {
            return false;
        }
        dispatchNestedFling(0.0f, f10, true);
        k((int) f10);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View view, float f9, float f10) {
        return this.f16095G.b(f9, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View view, int i3, int i9, int[] iArr) {
        i(i3, i9, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View view, int i3, int i9, int i10, int i11) {
        o(i11, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i3) {
        h(view, view2, i3, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i3, int i9, boolean z6, boolean z9) {
        super.scrollTo(i3, i9);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, android.graphics.Rect rect) {
        if (i3 == 2) {
            i3 = androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        } else if (i3 == 1) {
            i3 = 33;
        }
        android.view.View viewFindNextFocus = rect == null ? android.view.FocusFinder.getInstance().findNextFocus(this, null, i3) : android.view.FocusFinder.getInstance().findNextFocusFromRect(this, rect, i3);
        if (viewFindNextFocus != null && n(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i3, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof H1.h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        H1.h hVar = (H1.h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        this.f16093E = hVar;
        requestLayout();
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        H1.h hVar = new H1.h(super.onSaveInstanceState());
        hVar.f3865h = getScrollY();
        return hVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i3, int i9, int i10, int i11) {
        super.onScrollChanged(i3, i9, i10, i11);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i9, int i10, int i11) {
        super.onSizeChanged(i3, i9, i10, i11);
        android.view.View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !n(viewFindFocus, 0, i11)) {
            return;
        }
        android.graphics.Rect rect = this.j;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iD = d(rect);
        if (iD != 0) {
            if (this.f16110v) {
                v(0, iD, false);
            } else {
                scrollBy(0, iD);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i3) {
        return g(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View view) {
        e(0, view);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0121  */
    /* JADX WARN: Code duplicated, block: B:56:0x0137  */
    /* JADX WARN: Code duplicated, block: B:59:0x013e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0142  */
    /* JADX WARN: Code duplicated, block: B:63:0x0149  */
    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.ViewParent parent;
        float fU;
        int iRound;
        int i3;
        android.view.ViewParent parent2;
        if (this.f16108t == null) {
            this.f16108t = android.view.VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f16091C = 0;
        }
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
        float f9 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f16091C);
        if (actionMasked != 0) {
            android.widget.EdgeEffect edgeEffect = this.f16101m;
            android.widget.EdgeEffect edgeEffect2 = this.f16100l;
            if (actionMasked == 1) {
                android.view.VelocityTracker velocityTracker = this.f16108t;
                velocityTracker.computeCurrentVelocity(1000, this.y);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f16113z);
                if (java.lang.Math.abs(yVelocity) >= this.f16112x) {
                    if (E8.d.P(edgeEffect2) != 0.0f) {
                        if (u(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (E8.d.P(edgeEffect) != 0.0f) {
                        int i9 = -yVelocity;
                        if (u(edgeEffect, i9)) {
                            edgeEffect.onAbsorb(i9);
                        } else {
                            k(i9);
                        }
                    } else {
                        int i10 = -yVelocity;
                        float f10 = i10;
                        if (!this.f16095G.b(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            k(i10);
                        }
                    }
                } else if (this.f16099k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f16113z = -1;
                this.f16107s = false;
                android.view.VelocityTracker velocityTracker2 = this.f16108t;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f16108t = null;
                }
                y(0);
                this.f16100l.onRelease();
                this.f16101m.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f16113z);
                if (iFindPointerIndex == -1) {
                    android.util.Log.e("NestedScrollView", "Invalid pointerId=" + this.f16113z + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i11 = this.f16103o - y;
                    float x9 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i11 / getHeight();
                    if (E8.d.P(edgeEffect2) != 0.0f) {
                        fU = -E8.d.U(edgeEffect2, -height, x9);
                        if (E8.d.P(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else if (E8.d.P(edgeEffect) != 0.0f) {
                        fU = E8.d.U(edgeEffect, height, 1.0f - x9);
                        if (E8.d.P(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        iRound = java.lang.Math.round(f9 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i3 = i11 - iRound;
                        if (!this.f16107s && java.lang.Math.abs(i3) > this.f16111w) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f16107s = true;
                            if (i3 > 0) {
                                i3 -= this.f16111w;
                            } else {
                                i3 += this.f16111w;
                            }
                        }
                        if (this.f16107s) {
                            int iT = t(i3, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f16103o = y - iT;
                            this.f16091C += iT;
                        }
                    }
                    f9 = fU;
                    iRound = java.lang.Math.round(f9 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i3 = i11 - iRound;
                    if (!this.f16107s) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f16107s = true;
                        if (i3 > 0) {
                            i3 -= this.f16111w;
                        } else {
                            i3 += this.f16111w;
                        }
                    }
                    if (this.f16107s) {
                        int iT2 = t(i3, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f16103o = y - iT2;
                        this.f16091C += iT2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f16107s && getChildCount() > 0 && this.f16099k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f16113z = -1;
                this.f16107s = false;
                android.view.VelocityTracker velocityTracker3 = this.f16108t;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f16108t = null;
                }
                y(0);
                this.f16100l.onRelease();
                this.f16101m.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f16103o = (int) motionEvent.getY(actionIndex);
                this.f16113z = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                p(motionEvent);
                this.f16103o = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f16113z));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f16107s && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f16099k.isFinished()) {
                this.f16099k.abortAnimation();
                y(1);
            }
            int y9 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f16103o = y9;
            this.f16113z = pointerId;
            w(2, 0);
        }
        android.view.VelocityTracker velocityTracker4 = this.f16108t;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f16113z) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f16103o = (int) motionEvent.getY(i3);
            this.f16113z = motionEvent.getPointerId(i3);
            android.view.VelocityTracker velocityTracker = this.f16108t;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i3, int i9, int i10, int i11) {
        int i12;
        boolean z6;
        int i13;
        boolean z9;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i14 = i10 + i3;
        if (i9 <= 0 && i9 >= 0) {
            i12 = i9;
            z6 = false;
        } else {
            i12 = 0;
            z6 = true;
        }
        if (i14 <= i11) {
            if (i14 < 0) {
                i13 = 0;
            } else {
                i13 = i14;
                z9 = false;
            }
            if (z9 && !this.f16095G.f(1)) {
                this.f16099k.springBack(i12, i13, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i12, i13);
            return !z6 || z9;
        }
        i13 = i11;
        z9 = true;
        if (z9) {
            this.f16099k.springBack(i12, i13, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i12, i13);
        if (z6) {
        }
    }

    public final void r(int i3) {
        boolean z6 = i3 == 130;
        int height = getHeight();
        android.graphics.Rect rect = this.j;
        if (z6) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                android.view.View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i9 = rect.top;
        int i10 = height + i9;
        rect.bottom = i10;
        s(i3, i9, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(android.view.View view, android.view.View view2) {
        if (this.f16104p) {
            this.f16106r = view2;
        } else {
            android.graphics.Rect rect = this.j;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iD = d(rect);
            if (iD != 0) {
                scrollBy(0, iD);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z6) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iD = d(rect);
        boolean z9 = iD != 0;
        if (z9) {
            if (z6) {
                scrollBy(0, iD);
                return z9;
            }
            v(0, iD, false);
        }
        return z9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        android.view.VelocityTracker velocityTracker;
        if (z6 && (velocityTracker = this.f16108t) != null) {
            velocityTracker.recycle();
            this.f16108t = null;
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f16104p = true;
        super.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean s(int i3, int i9, int i10) {
        boolean z6;
        int height = getHeight();
        int scrollY = getScrollY();
        int i11 = height + scrollY;
        boolean z9 = i3 == 33;
        java.util.ArrayList<android.view.View> focusables = getFocusables(2);
        int size = focusables.size();
        android.view.View view = null;
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            android.view.View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i9 < bottom && top < i10) {
                boolean z11 = i9 < top && bottom < i10;
                if (view == null) {
                    view = view2;
                    z10 = z11;
                } else {
                    boolean z12 = (z9 && top < view.getTop()) || (!z9 && bottom > view.getBottom());
                    if (z10) {
                        if (z11 && z12) {
                            view = view2;
                        }
                    } else if (z11) {
                        view = view2;
                        z10 = true;
                    } else if (z12) {
                        view = view2;
                    }
                }
            }
        }
        android.view.View view3 = view == null ? this : view;
        if (i9 < scrollY || i10 > i11) {
            t(z9 ? i9 - scrollY : i10 - i11, -1, null, 0, 1, true);
            z6 = true;
        } else {
            z6 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i3);
        }
        return z6;
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i9) {
        if (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i3 < 0) {
                i3 = 0;
            } else if (width + i3 > width2) {
                i3 = width2 - width;
            }
            if (height >= height2 || i9 < 0) {
                i9 = 0;
            } else if (height + i9 > height2) {
                i9 = height2 - height;
            }
            if (i3 == getScrollX() && i9 == getScrollY()) {
                return;
            }
            super.scrollTo(i3, i9);
        }
    }

    public void setFillViewport(boolean z6) {
        if (z6 != this.f16109u) {
            this.f16109u = z6;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        D1.C0230o c0230o = this.f16095G;
        if (c0230o.f2050d) {
            java.util.WeakHashMap weakHashMap = D1.U.f1980a;
            D1.L.i(c0230o.f2049c);
        }
        c0230o.f2050d = z6;
    }

    public void setSmoothScrollingEnabled(boolean z6) {
        this.f16110v = z6;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return this.f16095G.g(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        y(0);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    /* JADX WARN: Code duplicated, block: B:59:0x0127  */
    public final int t(int i3, int i9, android.view.MotionEvent motionEvent, int i10, int i11, boolean z6) {
        int i12;
        int i13;
        boolean z9;
        boolean z10;
        android.view.VelocityTracker velocityTracker;
        if (i11 == 1) {
            w(2, i11);
        }
        boolean zC = this.f16095G.c(0, i3, i11, this.f16090B, this.f16089A);
        int[] iArr = this.f16090B;
        int[] iArr2 = this.f16089A;
        if (zC) {
            i12 = i3 - iArr[1];
            i13 = iArr2[1];
        } else {
            i12 = i3;
            i13 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z11 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z6;
        boolean z12 = q(i12, 0, scrollY, scrollRange) && !this.f16095G.f(i11);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f2073a.b(motionEvent.getDeviceId(), motionEvent.getSource(), i9, scrollY2);
        }
        iArr[1] = 0;
        this.f16095G.d(0, scrollY2, 0, i12 - scrollY2, this.f16089A, i11, iArr);
        int i14 = i13 + iArr2[1];
        int i15 = i12 - iArr[1];
        int i16 = scrollY + i15;
        android.widget.EdgeEffect edgeEffect = this.f16101m;
        android.widget.EdgeEffect edgeEffect2 = this.f16100l;
        if (i16 >= 0) {
            if (i16 > scrollRange && z11) {
                E8.d.U(edgeEffect, i15 / getHeight(), 1.0f - (i10 / getWidth()));
                if (motionEvent != null) {
                    z9 = false;
                    getScrollFeedbackProvider().f2073a.a(false, motionEvent.getDeviceId(), motionEvent.getSource(), i9);
                } else {
                    z9 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z10 = z9;
            } else {
                z10 = z12;
            }
            if (z10 && i11 == 0 && (velocityTracker = this.f16108t) != null) {
                velocityTracker.clear();
            }
            if (i11 == 1) {
                y(i11);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i14;
        }
        if (z11) {
            E8.d.U(edgeEffect2, (-i15) / getHeight(), i10 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().f2073a.a(true, motionEvent.getDeviceId(), motionEvent.getSource(), i9);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z9 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z10 = z9;
        } else {
            postInvalidateOnAnimation();
            z10 = z9;
        }
        if (z10) {
            velocityTracker.clear();
        }
        if (i11 == 1) {
            y(i11);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i14;
    }

    public final boolean u(android.widget.EdgeEffect edgeEffect, int i3) {
        if (i3 > 0) {
            return true;
        }
        float fP = E8.d.P(edgeEffect) * getHeight();
        float fAbs = java.lang.Math.abs(-i3) * 0.35f;
        float f9 = this.f16097h * 0.015f;
        double dLog = java.lang.Math.log(fAbs / f9);
        double d4 = f16086J;
        return ((float) (java.lang.Math.exp((d4 / (d4 - 1.0d)) * dLog) * ((double) f9))) < fP;
    }

    public final void v(int i3, int i9, boolean z6) {
        if (getChildCount() == 0) {
            return;
        }
        if (android.view.animation.AnimationUtils.currentAnimationTimeMillis() - this.f16098i > 250) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f16099k.startScroll(getScrollX(), scrollY, 0, java.lang.Math.max(0, java.lang.Math.min(i9 + scrollY, java.lang.Math.max(0, height - height2))) - scrollY, 250);
            if (z6) {
                w(2, 1);
            } else {
                y(1);
            }
            this.f16092D = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f16099k.isFinished()) {
                this.f16099k.abortAnimation();
                y(1);
            }
            scrollBy(i3, i9);
        }
        this.f16098i = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
    }

    public final void w(int i3, int i9) {
        this.f16095G.g(2, i9);
    }

    public final boolean x(android.view.MotionEvent motionEvent) {
        boolean z6;
        android.widget.EdgeEffect edgeEffect = this.f16100l;
        if (E8.d.P(edgeEffect) != 0.0f) {
            E8.d.U(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z6 = true;
        } else {
            z6 = false;
        }
        android.widget.EdgeEffect edgeEffect2 = this.f16101m;
        if (E8.d.P(edgeEffect2) == 0.0f) {
            return z6;
        }
        E8.d.U(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void y(int i3) {
        this.f16095G.h(i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i3) {
        if (getChildCount() <= 0) {
            super.addView(view, i3);
            return;
        }
        throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i3, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(H1.g gVar) {
    }
}
