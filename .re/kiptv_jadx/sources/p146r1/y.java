package p146r1;

/* JADX INFO: loaded from: classes.dex */
public final class y extends p019c.l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public kotlin.jvm.functions.Function0 f26789k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p146r1.x f26790l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final android.view.View f26791m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p146r1.w f26792n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26793o;

    public y(kotlin.jvm.functions.Function0 function0, p146r1.x xVar, android.view.View view, p113n1.n nVar, p113n1.c cVar, java.util.UUID uuid) {
        super(new android.view.ContextThemeWrapper(view.getContext(), xVar.f26787e ? com.kiptv.tv.R.style.DialogWindowTheme : com.kiptv.tv.R.style.FloatingDialogWindowTheme), 0);
        this.f26789k = function0;
        this.f26790l = xVar;
        this.f26791m = view;
        float f9 = 8;
        android.view.Window window = getWindow();
        if (window == null) {
            throw new java.lang.IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        boolean z6 = this.f26790l.f26787e;
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            D1.AbstractC0226k.e(window, z6);
        } else if (i3 >= 30) {
            D1.AbstractC0226k.d(window, z6);
        } else {
            android.view.View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z6 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
        window.setGravity(17);
        if (!this.f26790l.f26787e) {
            window.addFlags(65792);
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            if (i3 >= 28) {
                p146r1.r.f26771a.a(attributes);
            }
            if (i3 >= 30) {
                p146r1.s sVar = p146r1.s.f26772a;
                sVar.b(attributes, 0);
                sVar.c(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        p146r1.w wVar = new p146r1.w(getContext(), window);
        setTitle(this.f26790l.f26788f);
        wVar.setTag(com.kiptv.tv.R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        wVar.setClipChildren(false);
        wVar.setElevation(cVar.Y(f9));
        wVar.setOutlineProvider(new A0.o(2));
        this.f26792n = wVar;
        android.view.View decorView2 = window.getDecorView();
        android.view.ViewGroup viewGroup = decorView2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView2 : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(wVar);
        androidx.lifecycle.X.i(wVar, androidx.lifecycle.X.d(view));
        wVar.setTag(com.kiptv.tv.R.id.view_tree_view_model_store_owner, androidx.lifecycle.X.e(view));
        com.google.common.util.concurrent.AbstractC1903s.H(wVar, com.google.common.util.concurrent.AbstractC1903s.v(view));
        e(this.f26789k, this.f26790l, nVar);
        p019c.u uVar = this.j;
        p146r1.C2679b c2679b = new p146r1.C2679b(this, 1);
        kotlin.jvm.internal.m.e(uVar, "<this>");
        uVar.a(this, new Y1.v(c2679b));
    }

    public static final void d(android.view.ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof p146r1.w) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = viewGroup.getChildAt(i3);
            android.view.ViewGroup viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    public final void e(kotlin.jvm.functions.Function0 function0, p146r1.x xVar, p113n1.n nVar) {
        int i3;
        this.f26789k = function0;
        this.f26790l = xVar;
        p146r1.G g = xVar.f26785c;
        boolean zC = p146r1.p.c(this.f26791m);
        int iOrdinal = g.ordinal();
        int i9 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zC = true;
            } else {
                if (iOrdinal != 2) {
                    throw new I3.b();
                }
                zC = false;
            }
        }
        android.view.Window window = getWindow();
        kotlin.jvm.internal.m.b(window);
        window.setFlags(zC ? 8192 : -8193, 8192);
        int iOrdinal2 = nVar.ordinal();
        if (iOrdinal2 == 0) {
            i3 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new I3.b();
            }
            i3 = 1;
        }
        p146r1.w wVar = this.f26792n;
        wVar.setLayoutDirection(i3);
        boolean z6 = wVar.f26781t;
        boolean z9 = xVar.f26787e;
        boolean z10 = xVar.f26786d;
        boolean z11 = (z6 && z10 == wVar.f26779r && z9 == wVar.f26780s) ? false : true;
        wVar.f26779r = z10;
        wVar.f26780s = z9;
        if (z11) {
            android.view.Window window2 = wVar.f26777p;
            android.view.WindowManager.LayoutParams attributes = window2.getAttributes();
            int i10 = z10 ? -2 : -1;
            if (i10 != attributes.width || !wVar.f26781t) {
                window2.setLayout(i10, -2);
                wVar.f26781t = true;
            }
        }
        setCanceledOnTouchOutside(xVar.f26784b);
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            if (!z9) {
                i9 = android.os.Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i9);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i3, android.view.KeyEvent keyEvent) {
        if (!this.f26790l.f26783a || !keyEvent.isTracking() || keyEvent.isCanceled() || i3 != 111) {
            return super.onKeyUp(i3, keyEvent);
        }
        this.f26789k.invoke();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked;
        android.view.View childAt;
        int iQ;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f26790l.f26784b) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.f26793o = false;
            return zOnTouchEvent;
        }
        p146r1.w wVar = this.f26792n;
        wVar.getClass();
        float x9 = motionEvent.getX();
        if (!java.lang.Float.isInfinite(x9) && !java.lang.Float.isNaN(x9)) {
            float y = motionEvent.getY();
            if (!java.lang.Float.isInfinite(y) && !java.lang.Float.isNaN(y) && (childAt = wVar.getChildAt(0)) != null) {
                int left = childAt.getLeft() + wVar.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + wVar.getTop();
                int height = childAt.getHeight() + top;
                int iQ2 = O7.r.Q(motionEvent.getX());
                if (left <= iQ2 && iQ2 <= width && top <= (iQ = O7.r.Q(motionEvent.getY())) && iQ <= height) {
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                        this.f26793o = false;
                        return zOnTouchEvent;
                    }
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.f26793o = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.f26793o = false;
                return zOnTouchEvent;
            }
        } else if (this.f26793o) {
            this.f26789k.invoke();
            this.f26793o = false;
            return true;
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
