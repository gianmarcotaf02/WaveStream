package p146r1;

/* JADX INFO: loaded from: classes.dex */
public final class A extends R0.AbstractC0813b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p020c0.C1681g0 f26697A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p113n1.l f26698B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p020c0.F f26699C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final android.graphics.Rect f26700D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final p121o0.r f26701E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public p019c.q f26702F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final p020c0.C1681g0 f26703G;
    public boolean H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int[] f26704I;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public kotlin.jvm.functions.Function0 f26705p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p146r1.F f26706q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public java.lang.String f26707r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final android.view.View f26708s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f26709t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p146r1.D f26710u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final android.view.WindowManager f26711v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final android.view.WindowManager.LayoutParams f26712w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p146r1.E f26713x;
    public p113n1.n y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p020c0.C1681g0 f26714z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(kotlin.jvm.functions.Function0 function0, p146r1.F f9, java.lang.String str, android.view.View view, p113n1.c cVar, p146r1.E e6, java.util.UUID uuid, boolean z6) {
        super(view.getContext());
        p146r1.D c9 = android.os.Build.VERSION.SDK_INT >= 29 ? new p146r1.C() : new p146r1.D();
        this.f26705p = function0;
        this.f26706q = f9;
        this.f26707r = str;
        this.f26708s = view;
        this.f26709t = z6;
        this.f26710u = c9;
        java.lang.Object systemService = view.getContext().getSystemService("window");
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f26711v = (android.view.WindowManager) systemService;
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        p146r1.F f10 = this.f26706q;
        boolean zC = p146r1.p.c(view);
        boolean z9 = f10.f26716b;
        int i3 = f10.f26715a;
        if (z9 && zC) {
            i3 |= 8192;
        } else if (z9 && !zC) {
            i3 &= -8193;
        }
        layoutParams.flags = i3;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(com.kiptv.tv.R.string.default_popup_window_title));
        this.f26712w = layoutParams;
        this.f26713x = e6;
        this.y = p113n1.n.f25566h;
        this.f26714z = p020c0.AbstractC1703s.y(null);
        this.f26697A = p020c0.AbstractC1703s.y(null);
        this.f26699C = p020c0.AbstractC1703s.r(new A8.m(22, this));
        this.f26700D = new android.graphics.Rect();
        this.f26701E = new p121o0.r(new p146r1.l(this, 2));
        setId(android.R.id.content);
        androidx.lifecycle.X.i(this, androidx.lifecycle.X.d(view));
        setTag(com.kiptv.tv.R.id.view_tree_view_model_store_owner, androidx.lifecycle.X.e(view));
        com.google.common.util.concurrent.AbstractC1903s.H(this, com.google.common.util.concurrent.AbstractC1903s.v(view));
        setTag(com.kiptv.tv.R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(cVar.Y((float) 8));
        setOutlineProvider(new A0.o(3));
        this.f26703G = p020c0.AbstractC1703s.y(p146r1.v.f26776a);
        this.f26704I = new int[2];
    }

    private final p194x6.m getContent() {
        return (p194x6.m) this.f26703G.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O0.InterfaceC0732v getParentLayoutCoordinates() {
        return (O0.InterfaceC0732v) this.f26697A.getValue();
    }

    private final p113n1.l getVisibleDisplayBounds() {
        this.f26710u.getClass();
        android.view.View view = this.f26708s;
        android.graphics.Rect rect = this.f26700D;
        view.getWindowVisibleDisplayFrame(rect);
        return new p113n1.l(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(p194x6.m mVar) {
        this.f26703G.setValue(mVar);
    }

    private final void setParentLayoutCoordinates(O0.InterfaceC0732v interfaceC0732v) {
        this.f26697A.setValue(interfaceC0732v);
    }

    @Override // R0.AbstractC0813b
    public final void a(int i3, p020c0.C1700q c1700q) {
        c1700q.e0(-857613600);
        int i9 = (c1700q.h(this) ? 4 : 2) | i3;
        if (c1700q.T(i9 & 1, (i9 & 3) != 2)) {
            getContent().invoke(c1700q, 0);
        } else {
            c1700q.W();
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new R0.C0811a(this, i3, 6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (!this.f26706q.f26717c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            android.view.KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                kotlin.jvm.functions.Function0 function0 = this.f26705p;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // R0.AbstractC0813b
    public final void e(int i3, int i9, boolean z6, int i10, int i11) {
        super.e(i3, i9, z6, i10, i11);
        this.f26706q.getClass();
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        android.view.WindowManager.LayoutParams layoutParams = this.f26712w;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f26710u.getClass();
        this.f26711v.updateViewLayout(this, layoutParams);
    }

    @Override // R0.AbstractC0813b
    public final void f(int i3, int i9) {
        this.f26706q.getClass();
        p113n1.l visibleDisplayBounds = getVisibleDisplayBounds();
        super.f(android.view.View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.f25563c - visibleDisplayBounds.f25561a, Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.f25564d - visibleDisplayBounds.f25562b, Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((java.lang.Boolean) this.f26699C.getValue()).booleanValue();
    }

    public final android.view.WindowManager.LayoutParams getParams$ui() {
        return this.f26712w;
    }

    public final p113n1.n getParentLayoutDirection() {
        return this.y;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final p113n1.m m522getPopupContentSizebOM6tXw() {
        return (p113n1.m) this.f26714z.getValue();
    }

    public final p146r1.E getPositionProvider() {
        return this.f26713x;
    }

    @Override // R0.AbstractC0813b
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.H;
    }

    public final java.lang.String getTestTag() {
        return this.f26707r;
    }

    public /* bridge */ /* synthetic */ android.view.View getViewRoot() {
        return null;
    }

    public final void i(p020c0.AbstractC1709v abstractC1709v, p194x6.m mVar) {
        setParentCompositionContext(abstractC1709v);
        setContent(mVar);
        this.H = true;
    }

    public final void j(kotlin.jvm.functions.Function0 function0, p146r1.F f9, java.lang.String str, p113n1.n nVar) {
        int i3;
        this.f26705p = function0;
        this.f26707r = str;
        if (!kotlin.jvm.internal.m.a(this.f26706q, f9)) {
            f9.getClass();
            android.view.WindowManager.LayoutParams layoutParams = this.f26712w;
            this.f26706q = f9;
            boolean zC = p146r1.p.c(this.f26708s);
            boolean z6 = f9.f26716b;
            int i9 = f9.f26715a;
            if (z6 && zC) {
                i9 |= 8192;
            } else if (z6 && !zC) {
                i9 &= -8193;
            }
            layoutParams.flags = i9;
            this.f26710u.getClass();
            this.f26711v.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = nVar.ordinal();
        if (iOrdinal != 0) {
            i3 = 1;
            if (iOrdinal != 1) {
                throw new I3.b();
            }
        } else {
            i3 = 0;
        }
        super.setLayoutDirection(i3);
    }

    public final void k() {
        O0.InterfaceC0732v parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.i()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jK = parentLayoutCoordinates.k();
            long jA = this.f26709t ? parentLayoutCoordinates.A(0L) : parentLayoutCoordinates.f(0L);
            long jRound = (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jA >> 32)))) << 32) | (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jA & 4294967295L)))) & 4294967295L);
            int i3 = (int) (jRound >> 32);
            int i9 = (int) (jRound & 4294967295L);
            p113n1.l lVar = new p113n1.l(i3, i9, ((int) (jK >> 32)) + i3, ((int) (jK & 4294967295L)) + i9);
            if (lVar.equals(this.f26698B)) {
                return;
            }
            this.f26698B = lVar;
            m();
        }
    }

    public final void l(O0.InterfaceC0732v interfaceC0732v) {
        setParentLayoutCoordinates(interfaceC0732v);
        k();
    }

    public final void m() {
        p113n1.m mVarM522getPopupContentSizebOM6tXw;
        p113n1.l lVar = this.f26698B;
        if (lVar == null || (mVarM522getPopupContentSizebOM6tXw = m522getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        p113n1.l visibleDisplayBounds = getVisibleDisplayBounds();
        long j = (((long) (visibleDisplayBounds.f25564d - visibleDisplayBounds.f25562b)) & 4294967295L) | (((long) (visibleDisplayBounds.f25563c - visibleDisplayBounds.f25561a)) << 32);
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        zVar.f24556h = 0L;
        this.f26701E.d(this, p146r1.C2681d.f26733n, new p146r1.z(zVar, this, lVar, j, mVarM522getPopupContentSizebOM6tXw.f25565a));
        android.view.WindowManager.LayoutParams layoutParams = this.f26712w;
        long j9 = zVar.f24556h;
        layoutParams.x = (int) (j9 >> 32);
        layoutParams.y = (int) (j9 & 4294967295L);
        boolean z6 = this.f26706q.f26719e;
        p146r1.D d4 = this.f26710u;
        if (z6) {
            d4.a(this, (int) (j >> 32), (int) (j & 4294967295L));
        }
        d4.getClass();
        this.f26711v.updateViewLayout(this, layoutParams);
    }

    @Override // R0.AbstractC0813b, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26701E.e();
        if (!this.f26706q.f26717c || android.os.Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f26702F == null) {
            this.f26702F = new p019c.q(3, this.f26705p);
        }
        E1.e.f(this, this.f26702F);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p121o0.r rVar = this.f26701E;
        k3.h hVar = rVar.f26020h;
        if (hVar != null) {
            hVar.a();
        }
        rVar.a();
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            E1.e.g(this, this.f26702F);
        }
        this.f26702F = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f26706q.f26718d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            kotlin.jvm.functions.Function0 function0 = this.f26705p;
            if (function0 != null) {
                function0.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            kotlin.jvm.functions.Function0 function1 = this.f26705p;
            if (function1 != null) {
                function1.invoke();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(p113n1.n nVar) {
        this.y = nVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m523setPopupContentSizefhxjrPA(p113n1.m mVar) {
        this.f26714z.setValue(mVar);
    }

    public final void setPositionProvider(p146r1.E e6) {
        this.f26713x = e6;
    }

    public final void setTestTag(java.lang.String str) {
        this.f26707r = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public R0.AbstractC0813b getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i3) {
    }
}
