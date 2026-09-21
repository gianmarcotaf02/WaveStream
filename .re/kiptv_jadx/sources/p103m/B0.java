package p103m;

/* JADX INFO: loaded from: classes.dex */
public abstract class B0 implements p095l.B {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final java.lang.reflect.Method f24878G;
    public static final java.lang.reflect.Method H;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final android.os.Handler f24880B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public android.graphics.Rect f24882D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f24883E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final p103m.C2599y f24884F;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.content.Context f24885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public android.widget.ListAdapter f24886i;
    public p103m.C2581o0 j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f24890n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f24892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f24893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f24894r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p103m.C2600y0 f24897u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public android.view.View f24898v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f24899w;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f24887k = -2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24888l = -2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f24891o = 1002;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f24895s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f24896t = androidx.media3.common.util.Log.LOG_LEVEL_OFF;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p103m.RunnableC2598x0 f24900x = new p103m.RunnableC2598x0(this, 1);
    public final p103m.A0 y = new p103m.A0(this);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p103m.C2602z0 f24901z = new p103m.C2602z0(this);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p103m.RunnableC2598x0 f24879A = new p103m.RunnableC2598x0(this, 0);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final android.graphics.Rect f24881C = new android.graphics.Rect();

    static {
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            try {
                f24878G = android.widget.PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", java.lang.Boolean.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
                android.util.Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                H = android.widget.PopupWindow.class.getDeclaredMethod("setEpicenterBounds", android.graphics.Rect.class);
            } catch (java.lang.NoSuchMethodException unused2) {
                android.util.Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public B0(android.content.Context context, android.util.AttributeSet attributeSet, int i3) {
        int resourceId;
        this.f24885h = context;
        this.f24880B = new android.os.Handler(context.getMainLooper());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f22417o, i3, 0);
        this.f24889m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f24890n = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f24892p = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        p103m.C2599y c2599y = new p103m.C2599y(context, attributeSet, i3, 0);
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h.a.f22421s, i3, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c2599y.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c2599y.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : com.google.common.util.concurrent.AbstractC1903s.y(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f24884F = c2599y;
        c2599y.setInputMethodMode(1);
    }

    @Override // p095l.B
    public final boolean a() {
        return this.f24884F.isShowing();
    }

    public final int b() {
        return this.f24889m;
    }

    public final void c(int i3) {
        this.f24889m = i3;
    }

    @Override // p095l.B
    public final void dismiss() {
        p103m.C2599y c2599y = this.f24884F;
        c2599y.dismiss();
        c2599y.setContentView(null);
        this.j = null;
        this.f24880B.removeCallbacks(this.f24900x);
    }

    @Override // p095l.B
    public final void e() {
        int i3;
        int iMakeMeasureSpec;
        int paddingBottom;
        p103m.C2581o0 c2581o0;
        p103m.C2581o0 c2581o1 = this.j;
        p103m.C2599y c2599y = this.f24884F;
        android.content.Context context = this.f24885h;
        if (c2581o1 == null) {
            p103m.C2581o0 c2581o0P = p(context, !this.f24883E);
            this.j = c2581o0P;
            c2581o0P.setAdapter(this.f24886i);
            this.j.setOnItemClickListener(this.f24899w);
            this.j.setFocusable(true);
            this.j.setFocusableInTouchMode(true);
            this.j.setOnItemSelectedListener(new p103m.C2592u0(this));
            this.j.setOnScrollListener(this.f24901z);
            c2599y.setContentView(this.j);
        }
        android.graphics.drawable.Drawable background = c2599y.getBackground();
        android.graphics.Rect rect = this.f24881C;
        if (background != null) {
            background.getPadding(rect);
            int i9 = rect.top;
            i3 = rect.bottom + i9;
            if (!this.f24892p) {
                this.f24890n = -i9;
            }
        } else {
            rect.setEmpty();
            i3 = 0;
        }
        int iA = p103m.AbstractC2594v0.a(c2599y, this.f24898v, this.f24890n, c2599y.getInputMethodMode() == 2);
        int i10 = this.f24887k;
        if (i10 == -1) {
            paddingBottom = iA + i3;
        } else {
            int i11 = this.f24888l;
            if (i11 != -2) {
                iMakeMeasureSpec = i11 != -1 ? android.view.View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.j.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.j.getPaddingBottom() + this.j.getPaddingTop() + i3 : 0);
        }
        boolean z6 = this.f24884F.getInputMethodMode() == 2;
        c2599y.setWindowLayoutType(this.f24891o);
        if (c2599y.isShowing()) {
            if (this.f24898v.isAttachedToWindow()) {
                int width = this.f24888l;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f24898v.getWidth();
                }
                if (i10 == -1) {
                    i10 = z6 ? paddingBottom : -1;
                    if (z6) {
                        c2599y.setWidth(this.f24888l == -1 ? -1 : 0);
                        c2599y.setHeight(0);
                    } else {
                        c2599y.setWidth(this.f24888l == -1 ? -1 : 0);
                        c2599y.setHeight(-1);
                    }
                } else if (i10 == -2) {
                    i10 = paddingBottom;
                }
                c2599y.setOutsideTouchable(true);
                android.view.View view = this.f24898v;
                int i12 = this.f24889m;
                int i13 = this.f24890n;
                if (width < 0) {
                    width = -1;
                }
                c2599y.update(view, i12, i13, width, i10 < 0 ? -1 : i10);
                return;
            }
            return;
        }
        int width2 = this.f24888l;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f24898v.getWidth();
        }
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = paddingBottom;
        }
        c2599y.setWidth(width2);
        c2599y.setHeight(i10);
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            java.lang.reflect.Method method = f24878G;
            if (method != null) {
                try {
                    method.invoke(c2599y, java.lang.Boolean.TRUE);
                } catch (java.lang.Exception unused) {
                    android.util.Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            p103m.AbstractC2596w0.b(c2599y, true);
        }
        c2599y.setOutsideTouchable(true);
        c2599y.setTouchInterceptor(this.y);
        if (this.f24894r) {
            c2599y.setOverlapAnchor(this.f24893q);
        }
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            java.lang.reflect.Method method2 = H;
            if (method2 != null) {
                try {
                    method2.invoke(c2599y, this.f24882D);
                } catch (java.lang.Exception e6) {
                    android.util.Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e6);
                }
            }
        } else {
            p103m.AbstractC2596w0.a(c2599y, this.f24882D);
        }
        c2599y.showAsDropDown(this.f24898v, this.f24889m, this.f24890n, this.f24895s);
        this.j.setSelection(-1);
        if ((!this.f24883E || this.j.isInTouchMode()) && (c2581o0 = this.j) != null) {
            c2581o0.setListSelectionHidden(true);
            c2581o0.requestLayout();
        }
        if (this.f24883E) {
            return;
        }
        this.f24880B.post(this.f24879A);
    }

    public final android.graphics.drawable.Drawable f() {
        return this.f24884F.getBackground();
    }

    @Override // p095l.B
    public final p103m.C2581o0 h() {
        return this.j;
    }

    public final void j(android.graphics.drawable.Drawable drawable) {
        this.f24884F.setBackgroundDrawable(drawable);
    }

    public final void k(int i3) {
        this.f24890n = i3;
        this.f24892p = true;
    }

    public final int n() {
        if (this.f24892p) {
            return this.f24890n;
        }
        return 0;
    }

    public void o(android.widget.ListAdapter listAdapter) {
        p103m.C2600y0 c2600y0 = this.f24897u;
        if (c2600y0 == null) {
            this.f24897u = new p103m.C2600y0(this);
        } else {
            android.widget.ListAdapter listAdapter2 = this.f24886i;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c2600y0);
            }
        }
        this.f24886i = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f24897u);
        }
        p103m.C2581o0 c2581o0 = this.j;
        if (c2581o0 != null) {
            c2581o0.setAdapter(this.f24886i);
        }
    }

    public p103m.C2581o0 p(android.content.Context context, boolean z6) {
        return new p103m.C2581o0(context, z6);
    }

    public final void q(int i3) {
        android.graphics.drawable.Drawable background = this.f24884F.getBackground();
        if (background == null) {
            this.f24888l = i3;
            return;
        }
        android.graphics.Rect rect = this.f24881C;
        background.getPadding(rect);
        this.f24888l = rect.left + rect.right + i3;
    }
}
