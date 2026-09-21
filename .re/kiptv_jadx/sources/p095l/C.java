package p095l;

/* JADX INFO: loaded from: classes.dex */
public final class C extends p095l.t implements android.widget.PopupWindow.OnDismissListener, android.view.View.OnKeyListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f24560A;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.content.Context f24561i;
    public final p095l.l j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p095l.i f24562k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f24563l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f24564m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f24565n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p103m.G0 f24566o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p095l.u f24569r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public android.view.View f24570s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public android.view.View f24571t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p095l.w f24572u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public android.view.ViewTreeObserver f24573v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f24574w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f24575x;
    public int y;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p095l.ViewTreeObserverOnGlobalLayoutListenerC2547d f24567p = new p095l.ViewTreeObserverOnGlobalLayoutListenerC2547d(1, this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final R0.T0 f24568q = new R0.T0(3, this);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f24576z = 0;

    public C(int i3, android.content.Context context, android.view.View view, p095l.l lVar, boolean z6) {
        this.f24561i = context;
        this.j = lVar;
        this.f24563l = z6;
        this.f24562k = new p095l.i(lVar, android.view.LayoutInflater.from(context), z6, com.kiptv.tv.R.layout.abc_popup_menu_item_layout);
        this.f24565n = i3;
        android.content.res.Resources resources = context.getResources();
        this.f24564m = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.kiptv.tv.R.dimen.abc_config_prefDialogWidth));
        this.f24570s = view;
        this.f24566o = new p103m.G0(context, null, i3);
        lVar.b(this, context);
    }

    @Override // p095l.B
    public final boolean a() {
        return !this.f24574w && this.f24566o.f24884F.isShowing();
    }

    @Override // p095l.x
    public final void c(p095l.l lVar, boolean z6) {
        if (lVar != this.j) {
            return;
        }
        dismiss();
        p095l.w wVar = this.f24572u;
        if (wVar != null) {
            wVar.c(lVar, z6);
        }
    }

    @Override // p095l.x
    public final boolean d() {
        return false;
    }

    @Override // p095l.B
    public final void dismiss() {
        if (a()) {
            this.f24566o.dismiss();
        }
    }

    @Override // p095l.B
    public final void e() {
        android.view.View view;
        if (a()) {
            return;
        }
        if (this.f24574w || (view = this.f24570s) == null) {
            throw new java.lang.IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f24571t = view;
        p103m.G0 g9 = this.f24566o;
        g9.f24884F.setOnDismissListener(this);
        g9.f24899w = this;
        g9.f24883E = true;
        g9.f24884F.setFocusable(true);
        android.view.View view2 = this.f24571t;
        boolean z6 = this.f24573v == null;
        android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f24573v = viewTreeObserver;
        if (z6) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f24567p);
        }
        view2.addOnAttachStateChangeListener(this.f24568q);
        g9.f24898v = view2;
        g9.f24895s = this.f24576z;
        boolean z9 = this.f24575x;
        android.content.Context context = this.f24561i;
        p095l.i iVar = this.f24562k;
        if (!z9) {
            this.y = p095l.t.m(iVar, context, this.f24564m);
            this.f24575x = true;
        }
        g9.q(this.y);
        g9.f24884F.setInputMethodMode(2);
        android.graphics.Rect rect = this.f24696h;
        g9.f24882D = rect != null ? new android.graphics.Rect(rect) : null;
        g9.e();
        p103m.C2581o0 c2581o0 = g9.j;
        c2581o0.setOnKeyListener(this);
        if (this.f24560A) {
            p095l.l lVar = this.j;
            if (lVar.f24646m != null) {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.LayoutInflater.from(context).inflate(com.kiptv.tv.R.layout.abc_popup_menu_header_item_layout, (android.view.ViewGroup) c2581o0, false);
                android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(lVar.f24646m);
                }
                frameLayout.setEnabled(false);
                c2581o0.addHeaderView(frameLayout, null, false);
            }
        }
        g9.o(iVar);
        g9.e();
    }

    @Override // p095l.x
    public final void f() {
        this.f24575x = false;
        p095l.i iVar = this.f24562k;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // p095l.x
    public final void g(p095l.w wVar) {
        this.f24572u = wVar;
    }

    @Override // p095l.B
    public final p103m.C2581o0 h() {
        return this.f24566o.j;
    }

    @Override // p095l.x
    public final boolean j(p095l.D d4) {
        if (d4.hasVisibleItems()) {
            android.view.View view = this.f24571t;
            p095l.v vVar = new p095l.v(this.f24565n, this.f24561i, view, d4, this.f24563l);
            p095l.w wVar = this.f24572u;
            vVar.f24704h = wVar;
            p095l.t tVar = vVar.f24705i;
            if (tVar != null) {
                tVar.g(wVar);
            }
            boolean zU = p095l.t.u(d4);
            vVar.g = zU;
            p095l.t tVar2 = vVar.f24705i;
            if (tVar2 != null) {
                tVar2.o(zU);
            }
            vVar.j = this.f24569r;
            this.f24569r = null;
            this.j.c(false);
            p103m.G0 g9 = this.f24566o;
            int width = g9.f24889m;
            int iN = g9.n();
            if ((android.view.Gravity.getAbsoluteGravity(this.f24576z, this.f24570s.getLayoutDirection()) & 7) == 5) {
                width += this.f24570s.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f24702e != null) {
                    vVar.d(width, iN, true, true);
                }
            }
            p095l.w wVar2 = this.f24572u;
            if (wVar2 != null) {
                wVar2.j(d4);
            }
            return true;
        }
        return false;
    }

    @Override // p095l.t
    public final void n(android.view.View view) {
        this.f24570s = view;
    }

    @Override // p095l.t
    public final void o(boolean z6) {
        this.f24562k.f24632c = z6;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f24574w = true;
        this.j.c(true);
        android.view.ViewTreeObserver viewTreeObserver = this.f24573v;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f24573v = this.f24571t.getViewTreeObserver();
            }
            this.f24573v.removeGlobalOnLayoutListener(this.f24567p);
            this.f24573v = null;
        }
        this.f24571t.removeOnAttachStateChangeListener(this.f24568q);
        p095l.u uVar = this.f24569r;
        if (uVar != null) {
            uVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i3, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p095l.t
    public final void p(int i3) {
        this.f24576z = i3;
    }

    @Override // p095l.t
    public final void q(int i3) {
        this.f24566o.f24889m = i3;
    }

    @Override // p095l.t
    public final void r(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f24569r = (p095l.u) onDismissListener;
    }

    @Override // p095l.t
    public final void s(boolean z6) {
        this.f24560A = z6;
    }

    @Override // p095l.t
    public final void t(int i3) {
        this.f24566o.k(i3);
    }

    @Override // p095l.t
    public final void l(p095l.l lVar) {
    }
}
