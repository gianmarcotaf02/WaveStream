package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements android.view.View.OnLongClickListener, android.view.View.OnHoverListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static p103m.b1 f25007r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static p103m.b1 f25008s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.view.View f25009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.CharSequence f25010i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p103m.a1 f25011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p103m.a1 f25012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25014n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p103m.c1 f25015o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25016p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f25017q;

    /* JADX WARN: Type inference failed for: r0v0, types: [m.a1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m.a1] */
    public b1(android.view.View view, java.lang.CharSequence charSequence) {
        final int i3 = 0;
        this.f25011k = new java.lang.Runnable(this) { // from class: m.a1

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p103m.b1 f25004i;

            {
                this.f25004i = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f25004i.c(false);
                        break;
                    default:
                        this.f25004i.a();
                        break;
                }
            }
        };
        final int i9 = 1;
        this.f25012l = new java.lang.Runnable(this) { // from class: m.a1

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p103m.b1 f25004i;

            {
                this.f25004i = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        this.f25004i.c(false);
                        break;
                    default:
                        this.f25004i.a();
                        break;
                }
            }
        };
        this.f25009h = view;
        this.f25010i = charSequence;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(view.getContext());
        java.lang.reflect.Method method = D1.V.f1985a;
        this.j = android.os.Build.VERSION.SDK_INT >= 28 ? D1.AbstractC0225j.n(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f25017q = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(p103m.b1 b1Var) {
        p103m.b1 b1Var2 = f25007r;
        if (b1Var2 != null) {
            b1Var2.f25009h.removeCallbacks(b1Var2.f25011k);
        }
        f25007r = b1Var;
        if (b1Var != null) {
            b1Var.f25009h.postDelayed(b1Var.f25011k, android.view.ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        p103m.b1 b1Var = f25008s;
        android.view.View view = this.f25009h;
        if (b1Var == this) {
            f25008s = null;
            p103m.c1 c1Var = this.f25015o;
            if (c1Var != null) {
                android.view.View view2 = (android.view.View) c1Var.f25019i;
                if (view2.getParent() != null) {
                    ((android.view.WindowManager) ((android.content.Context) c1Var.f25018h).getSystemService("window")).removeView(view2);
                }
                this.f25015o = null;
                this.f25017q = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                android.util.Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f25007r == this) {
            b(null);
        }
        view.removeCallbacks(this.f25012l);
    }

    public final void c(boolean z6) {
        int height;
        int i3;
        int i9;
        int i10;
        long longPressTimeout;
        long j;
        long j9;
        android.view.View view = this.f25009h;
        if (view.isAttachedToWindow()) {
            b(null);
            p103m.b1 b1Var = f25008s;
            if (b1Var != null) {
                b1Var.a();
            }
            f25008s = this;
            this.f25016p = z6;
            android.content.Context context = view.getContext();
            p103m.c1 c1Var = new p103m.c1();
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
            c1Var.f25020k = layoutParams;
            c1Var.f25021l = new android.graphics.Rect();
            c1Var.f25022m = new int[2];
            c1Var.f25023n = new int[2];
            c1Var.f25018h = context;
            android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(com.kiptv.tv.R.layout.abc_tooltip, (android.view.ViewGroup) null);
            c1Var.f25019i = viewInflate;
            c1Var.j = (android.widget.TextView) viewInflate.findViewById(com.kiptv.tv.R.id.message);
            layoutParams.setTitle(p103m.c1.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = com.kiptv.tv.R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            this.f25015o = c1Var;
            int width = this.f25013m;
            int i11 = this.f25014n;
            boolean z9 = this.f25016p;
            android.view.View view2 = (android.view.View) c1Var.f25019i;
            android.view.ViewParent parent = view2.getParent();
            android.content.Context context2 = (android.content.Context) c1Var.f25018h;
            if (parent != null && view2.getParent() != null) {
                ((android.view.WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((android.widget.TextView) c1Var.j).setText(this.f25010i);
            android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) c1Var.f25020k;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(com.kiptv.tv.R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(com.kiptv.tv.R.dimen.tooltip_precise_anchor_extra_offset);
                height = i11 + dimensionPixelOffset2;
                i3 = i11 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i3 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z9 ? com.kiptv.tv.R.dimen.tooltip_y_offset_touch : com.kiptv.tv.R.dimen.tooltip_y_offset_non_touch);
            android.view.View rootView = view.getRootView();
            android.view.ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            if (!(layoutParams3 instanceof android.view.WindowManager.LayoutParams) || ((android.view.WindowManager.LayoutParams) layoutParams3).type != 2) {
                for (android.content.Context context3 = view.getContext(); context3 instanceof android.content.ContextWrapper; context3 = ((android.content.ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof android.app.Activity) {
                        rootView = ((android.app.Activity) context3).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                android.util.Log.e("TooltipPopup", "Cannot find app view");
                i10 = 1;
            } else {
                android.graphics.Rect rect = (android.graphics.Rect) c1Var.f25021l;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i9 = 0;
                    i10 = 1;
                } else {
                    android.content.res.Resources resources = context2.getResources();
                    i10 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", com.revenuecat.purchases.common.events.BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i9 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) c1Var.f25023n;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) c1Var.f25022m;
                view.getLocationOnScreen(iArr2);
                int i12 = iArr2[i9] - iArr[i9];
                iArr2[i9] = i12;
                iArr2[i10] = iArr2[i10] - iArr[i10];
                layoutParams2.x = (i12 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i9, i9);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i13 = iArr2[i10];
                int i14 = ((i13 + i3) - dimensionPixelOffset3) - measuredHeight;
                int i15 = i13 + height + dimensionPixelOffset3;
                if (z9) {
                    if (i14 >= 0) {
                        layoutParams2.y = i14;
                    } else {
                        layoutParams2.y = i15;
                    }
                } else if (measuredHeight + i15 <= rect.height()) {
                    layoutParams2.y = i15;
                } else {
                    layoutParams2.y = i14;
                }
            }
            ((android.view.WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f25016p) {
                j9 = 2500;
            } else {
                java.util.WeakHashMap weakHashMap = D1.U.f1980a;
                if ((view.getWindowSystemUiVisibility() & 1) == i10) {
                    longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                    j = androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
                } else {
                    longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j9 = j - longPressTimeout;
            }
            p103m.a1 a1Var = this.f25012l;
            view.removeCallbacks(a1Var);
            view.postDelayed(a1Var, j9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.f25015o == null || !this.f25016p) {
            android.view.View view2 = this.f25009h;
            android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f25017q = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f25015o == null) {
                    int x9 = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (this.f25017q) {
                        this.f25013m = x9;
                        this.f25014n = y;
                        this.f25017q = false;
                        b(this);
                    } else {
                        int iAbs = java.lang.Math.abs(x9 - this.f25013m);
                        int i3 = this.j;
                        if (iAbs > i3 || java.lang.Math.abs(y - this.f25014n) > i3) {
                            this.f25013m = x9;
                            this.f25014n = y;
                            this.f25017q = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        this.f25013m = view.getWidth() / 2;
        this.f25014n = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }
}
