package p103m;

/* JADX INFO: renamed from: m.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2581o0 extends android.widget.ListView {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f25088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25089i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25090k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25091l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25092m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p103m.C2577m0 f25093n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f25094o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f25095p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f25096q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public H1.d f25097r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public B3.r f25098s;

    public C2581o0(android.content.Context context, boolean z6) {
        super(context, null, com.kiptv.tv.R.attr.dropDownListViewStyle);
        this.f25088h = new android.graphics.Rect();
        this.f25089i = 0;
        this.j = 0;
        this.f25090k = 0;
        this.f25091l = 0;
        this.f25095p = z6;
        setCacheColorHint(0);
    }

    public final int a(int i3, int i9) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        android.graphics.drawable.Drawable divider = getDivider();
        android.widget.ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i10 = 0;
        android.view.View view = null;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = adapter.getItemViewType(i11);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i11, view, this);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i12 = layoutParams.height;
            view.measure(i3, i12 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i11 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i9) {
                return i9;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0162  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:88:0x016b  */
    /* JADX WARN: Code duplicated, block: B:90:0x017d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0181  */
    /* JADX WARN: Code duplicated, block: B:94:0x0185  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final boolean b(android.view.MotionEvent motionEvent, int i3) {
        boolean z6;
        boolean zA;
        android.view.View childAt;
        android.view.View childAt2;
        H1.d dVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z9 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z6 = true;
            } else if (actionMasked != 3) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6 || z9) {
                this.f25096q = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f25092m - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z6) {
                if (this.f25097r == null) {
                    this.f25097r = new H1.d(this);
                }
                H1.d dVar2 = this.f25097r;
                boolean z10 = dVar2.f3863w;
                dVar2.f3863w = true;
                dVar2.onTouch(this, motionEvent);
            } else {
                dVar = this.f25097r;
                if (dVar != null) {
                    if (dVar.f3863w) {
                        dVar.d();
                    }
                    dVar.f3863w = false;
                }
            }
            return z6;
        }
        z6 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i3);
        if (iFindPointerIndex < 0) {
            z6 = false;
        } else {
            int x9 = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x9, y);
            if (iPointToPosition == -1) {
                z9 = true;
            } else {
                android.view.View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f9 = x9;
                float f10 = y;
                this.f25096q = true;
                int i9 = android.os.Build.VERSION.SDK_INT;
                p103m.AbstractC2571j0.a(this, f9, f10);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i10 = this.f25092m;
                if (i10 != -1 && (childAt = getChildAt(i10 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f25092m = iPointToPosition;
                p103m.AbstractC2571j0.a(childAt3, f9 - childAt3.getLeft(), f10 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                android.graphics.drawable.Drawable selector = getSelector();
                boolean z11 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z11) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                android.graphics.Rect rect = this.f25088h;
                rect.set(left, top, right, bottom);
                rect.left -= this.f25089i;
                rect.top -= this.j;
                rect.right += this.f25090k;
                rect.bottom += this.f25091l;
                if (i9 >= 33) {
                    zA = p103m.AbstractC2575l0.a(this);
                } else {
                    java.lang.reflect.Field field = p103m.AbstractC2579n0.f25085a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (java.lang.IllegalAccessException e6) {
                            e6.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z12 = !zA;
                    if (android.os.Build.VERSION.SDK_INT >= 33) {
                        p103m.AbstractC2575l0.b(this, z12);
                    } else {
                        java.lang.reflect.Field field2 = p103m.AbstractC2579n0.f25085a;
                        if (field2 != null) {
                            try {
                                field2.set(this, java.lang.Boolean.valueOf(z12));
                            } catch (java.lang.IllegalAccessException e9) {
                                e9.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z11) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                android.graphics.drawable.Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f9, f10);
                }
                p103m.C2577m0 c2577m0 = this.f25093n;
                if (c2577m0 != null) {
                    c2577m0.f25081i = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z6 = true;
                z9 = false;
            }
        }
        if (z6) {
            this.f25096q = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f25092m - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f25096q = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f25092m - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z6) {
            if (this.f25097r == null) {
                this.f25097r = new H1.d(this);
            }
            H1.d dVar3 = this.f25097r;
            boolean z13 = dVar3.f3863w;
            dVar3.f3863w = true;
            dVar3.onTouch(this, motionEvent);
        } else {
            dVar = this.f25097r;
            if (dVar != null) {
                if (dVar.f3863w) {
                    dVar.d();
                }
                dVar.f3863w = false;
            }
        }
        return z6;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable selector;
        android.graphics.Rect rect = this.f25088h;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f25098s != null) {
            return;
        }
        super.drawableStateChanged();
        p103m.C2577m0 c2577m0 = this.f25093n;
        if (c2577m0 != null) {
            c2577m0.f25081i = true;
        }
        android.graphics.drawable.Drawable selector = getSelector();
        if (selector != null && this.f25096q && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f25095p || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f25095p || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f25095p || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f25095p && this.f25094o) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f25098s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f25098s == null) {
            B3.r rVar = new B3.r(12, this);
            this.f25098s = rVar;
            post(rVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            android.view.View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i3 < 30 || !p103m.AbstractC2573k0.f25073d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        p103m.AbstractC2573k0.f25070a.invoke(this, java.lang.Integer.valueOf(iPointToPosition), childAt, java.lang.Boolean.FALSE, -1, -1);
                        p103m.AbstractC2573k0.f25071b.invoke(this, java.lang.Integer.valueOf(iPointToPosition));
                        p103m.AbstractC2573k0.f25072c.invoke(this, java.lang.Integer.valueOf(iPointToPosition));
                    } catch (java.lang.IllegalAccessException e6) {
                        e6.printStackTrace();
                    } catch (java.lang.reflect.InvocationTargetException e9) {
                        e9.printStackTrace();
                    }
                }
            }
            android.graphics.drawable.Drawable selector = getSelector();
            if (selector != null && this.f25096q && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f25092m = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        B3.r rVar = this.f25098s;
        if (rVar != null) {
            p103m.C2581o0 c2581o0 = (p103m.C2581o0) rVar.f657i;
            c2581o0.f25098s = null;
            c2581o0.removeCallbacks(rVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z6) {
        this.f25094o = z6;
    }

    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable drawable) {
        p103m.C2577m0 c2577m0 = null;
        if (drawable != null) {
            p103m.C2577m0 c2577m1 = new p103m.C2577m0();
            android.graphics.drawable.Drawable drawable2 = c2577m1.f25080h;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c2577m1.f25080h = drawable;
            drawable.setCallback(c2577m1);
            c2577m1.f25081i = true;
            c2577m0 = c2577m1;
        }
        this.f25093n = c2577m0;
        super.setSelector(c2577m0);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f25089i = rect.left;
        this.j = rect.top;
        this.f25090k = rect.right;
        this.f25091l = rect.bottom;
    }
}
