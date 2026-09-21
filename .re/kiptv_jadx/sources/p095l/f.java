package p095l;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p095l.t implements android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f24600A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f24602C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public p095l.w f24603D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public android.view.ViewTreeObserver f24604E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public p095l.u f24605F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f24606G;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.content.Context f24607i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f24608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f24609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final android.os.Handler f24610m;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public android.view.View f24618u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public android.view.View f24619v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f24620w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f24621x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f24622z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f24611n = new java.util.ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f24612o = new java.util.ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p095l.ViewTreeObserverOnGlobalLayoutListenerC2547d f24613p = new p095l.ViewTreeObserverOnGlobalLayoutListenerC2547d(0, this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final R0.T0 f24614q = new R0.T0(2, this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p008a8.c f24615r = new p008a8.c(9, this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f24616s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f24617t = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f24601B = false;

    public f(android.content.Context context, android.view.View view, int i3, boolean z6) {
        this.f24607i = context;
        this.f24618u = view;
        this.f24608k = i3;
        this.f24609l = z6;
        this.f24620w = view.getLayoutDirection() != 1 ? 1 : 0;
        android.content.res.Resources resources = context.getResources();
        this.j = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.kiptv.tv.R.dimen.abc_config_prefDialogWidth));
        this.f24610m = new android.os.Handler();
    }

    @Override // p095l.B
    public final boolean a() {
        java.util.ArrayList arrayList = this.f24612o;
        return arrayList.size() > 0 && ((p095l.e) arrayList.get(0)).f24597a.f24884F.isShowing();
    }

    @Override // p095l.x
    public final void c(p095l.l lVar, boolean z6) {
        java.util.ArrayList arrayList = this.f24612o;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (lVar == ((p095l.e) arrayList.get(i3)).f24598b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            return;
        }
        int i9 = i3 + 1;
        if (i9 < arrayList.size()) {
            ((p095l.e) arrayList.get(i9)).f24598b.c(false);
        }
        p095l.e eVar = (p095l.e) arrayList.remove(i3);
        eVar.f24598b.r(this);
        boolean z9 = this.f24606G;
        p103m.G0 g9 = eVar.f24597a;
        if (z9) {
            p103m.D0.b(g9.f24884F, null);
            g9.f24884F.setAnimationStyle(0);
        }
        g9.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f24620w = ((p095l.e) arrayList.get(size2 - 1)).f24599c;
        } else {
            this.f24620w = this.f24618u.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z6) {
                ((p095l.e) arrayList.get(0)).f24598b.c(false);
                return;
            }
            return;
        }
        dismiss();
        p095l.w wVar = this.f24603D;
        if (wVar != null) {
            wVar.c(lVar, true);
        }
        android.view.ViewTreeObserver viewTreeObserver = this.f24604E;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f24604E.removeGlobalOnLayoutListener(this.f24613p);
            }
            this.f24604E = null;
        }
        this.f24619v.removeOnAttachStateChangeListener(this.f24614q);
        this.f24605F.onDismiss();
    }

    @Override // p095l.x
    public final boolean d() {
        return false;
    }

    @Override // p095l.B
    public final void dismiss() {
        java.util.ArrayList arrayList = this.f24612o;
        int size = arrayList.size();
        if (size > 0) {
            p095l.e[] eVarArr = (p095l.e[]) arrayList.toArray(new p095l.e[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                p095l.e eVar = eVarArr[i3];
                if (eVar.f24597a.f24884F.isShowing()) {
                    eVar.f24597a.dismiss();
                }
            }
        }
    }

    @Override // p095l.B
    public final void e() {
        if (a()) {
            return;
        }
        java.util.ArrayList arrayList = this.f24611n;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((p095l.l) it.next());
        }
        arrayList.clear();
        android.view.View view = this.f24618u;
        this.f24619v = view;
        if (view != null) {
            boolean z6 = this.f24604E == null;
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f24604E = viewTreeObserver;
            if (z6) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f24613p);
            }
            this.f24619v.addOnAttachStateChangeListener(this.f24614q);
        }
    }

    @Override // p095l.x
    public final void f() {
        java.util.Iterator it = this.f24612o.iterator();
        while (it.hasNext()) {
            android.widget.ListAdapter adapter = ((p095l.e) it.next()).f24597a.j.getAdapter();
            if (adapter instanceof android.widget.HeaderViewListAdapter) {
                adapter = ((android.widget.HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((p095l.i) adapter).notifyDataSetChanged();
        }
    }

    @Override // p095l.x
    public final void g(p095l.w wVar) {
        this.f24603D = wVar;
    }

    @Override // p095l.B
    public final p103m.C2581o0 h() {
        java.util.ArrayList arrayList = this.f24612o;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((p095l.e) com.google.android.gms.internal.play_billing.M0.j(1, arrayList)).f24597a.j;
    }

    @Override // p095l.x
    public final boolean j(p095l.D d4) {
        for (p095l.e eVar : this.f24612o) {
            if (d4 == eVar.f24598b) {
                eVar.f24597a.j.requestFocus();
                return true;
            }
        }
        if (!d4.hasVisibleItems()) {
            return false;
        }
        l(d4);
        p095l.w wVar = this.f24603D;
        if (wVar != null) {
            wVar.j(d4);
        }
        return true;
    }

    @Override // p095l.t
    public final void l(p095l.l lVar) {
        lVar.b(this, this.f24607i);
        if (a()) {
            v(lVar);
        } else {
            this.f24611n.add(lVar);
        }
    }

    @Override // p095l.t
    public final void n(android.view.View view) {
        if (this.f24618u != view) {
            this.f24618u = view;
            this.f24617t = android.view.Gravity.getAbsoluteGravity(this.f24616s, view.getLayoutDirection());
        }
    }

    @Override // p095l.t
    public final void o(boolean z6) {
        this.f24601B = z6;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        p095l.e eVar;
        java.util.ArrayList arrayList = this.f24612o;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                eVar = null;
                break;
            }
            eVar = (p095l.e) arrayList.get(i3);
            if (!eVar.f24597a.f24884F.isShowing()) {
                break;
            } else {
                i3++;
            }
        }
        if (eVar != null) {
            eVar.f24598b.c(false);
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
        if (this.f24616s != i3) {
            this.f24616s = i3;
            this.f24617t = android.view.Gravity.getAbsoluteGravity(i3, this.f24618u.getLayoutDirection());
        }
    }

    @Override // p095l.t
    public final void q(int i3) {
        this.f24621x = true;
        this.f24622z = i3;
    }

    @Override // p095l.t
    public final void r(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f24605F = (p095l.u) onDismissListener;
    }

    @Override // p095l.t
    public final void s(boolean z6) {
        this.f24602C = z6;
    }

    @Override // p095l.t
    public final void t(int i3) {
        this.y = true;
        this.f24600A = i3;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:56:0x0137  */
    /* JADX WARN: Code duplicated, block: B:58:0x0143  */
    /* JADX WARN: Code duplicated, block: B:60:0x0146  */
    /* JADX WARN: Code duplicated, block: B:61:0x0148  */
    /* JADX WARN: Code duplicated, block: B:65:0x0150  */
    /* JADX WARN: Code duplicated, block: B:66:0x0152  */
    /* JADX WARN: Code duplicated, block: B:69:0x015c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0161  */
    /* JADX WARN: Code duplicated, block: B:72:0x0174  */
    /* JADX WARN: Code duplicated, block: B:76:0x0199 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x019b  */
    /* JADX WARN: Code duplicated, block: B:78:0x019d  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a1 A[PHI: r5
  0x01a1: PHI (r5v13 int) = (r5v5 int), (r5v14 int) binds: [B:80:0x01a3, B:78:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x01a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d0  */
    public final void v(p095l.l lVar) {
        int i3;
        p095l.e eVar;
        android.view.View childAt;
        android.graphics.Rect rect;
        android.graphics.Rect rect2;
        int i9;
        p103m.C2599y c2599y;
        p103m.C2581o0 c2581o0;
        int[] iArr;
        android.graphics.Rect rect3;
        int i10;
        boolean z6;
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        int width;
        java.lang.reflect.Method method;
        android.view.MenuItem item;
        p095l.i iVar;
        int headersCount;
        int firstVisiblePosition;
        android.content.Context context = this.f24607i;
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        p095l.i iVar2 = new p095l.i(lVar, layoutInflaterFrom, this.f24609l, com.kiptv.tv.R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f24601B) {
            iVar2.f24632c = true;
        } else if (a()) {
            iVar2.f24632c = p095l.t.u(lVar);
        }
        int iM = p095l.t.m(iVar2, context, this.j);
        p103m.G0 g9 = new p103m.G0(context, null, this.f24608k);
        g9.f24914I = this.f24615r;
        g9.f24899w = this;
        g9.f24884F.setOnDismissListener(this);
        g9.f24898v = this.f24618u;
        g9.f24895s = this.f24617t;
        g9.f24883E = true;
        g9.f24884F.setFocusable(true);
        g9.f24884F.setInputMethodMode(2);
        g9.o(iVar2);
        g9.q(iM);
        g9.f24895s = this.f24617t;
        java.util.ArrayList arrayList = this.f24612o;
        if (arrayList.size() > 0) {
            eVar = (p095l.e) com.google.android.gms.internal.play_billing.M0.j(1, arrayList);
            p095l.l lVar2 = eVar.f24598b;
            int size = lVar2.f24641f.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    item = null;
                    break;
                }
                item = lVar2.getItem(i13);
                if (item.hasSubMenu() && lVar == item.getSubMenu()) {
                    break;
                } else {
                    i13++;
                }
            }
            if (item == null) {
                i3 = 1;
                childAt = null;
            } else {
                p103m.C2581o0 c2581o1 = eVar.f24597a.j;
                android.widget.ListAdapter adapter = c2581o1.getAdapter();
                if (adapter instanceof android.widget.HeaderViewListAdapter) {
                    android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    iVar = (p095l.i) headerViewListAdapter.getWrappedAdapter();
                } else {
                    iVar = (p095l.i) adapter;
                    headersCount = 0;
                }
                int count = iVar.getCount();
                i3 = 1;
                int i14 = 0;
                while (true) {
                    if (i14 >= count) {
                        i14 = -1;
                        break;
                    } else if (item == iVar.getItem(i14)) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 != -1 && (firstVisiblePosition = (i14 + headersCount) - c2581o1.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c2581o1.getChildCount()) {
                    childAt = c2581o1.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                i9 = android.os.Build.VERSION.SDK_INT;
                c2599y = g9.f24884F;
                if (i9 <= 28) {
                    method = p103m.G0.f24913J;
                    if (method != null) {
                        try {
                            method.invoke(c2599y, java.lang.Boolean.FALSE);
                        } catch (java.lang.Exception unused) {
                            android.util.Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    p103m.E0.a(c2599y, false);
                }
                p103m.D0.a(g9.f24884F, null);
                c2581o0 = ((p095l.e) arrayList.get(arrayList.size() - 1)).f24597a.j;
                iArr = new int[2];
                c2581o0.getLocationOnScreen(iArr);
                rect3 = new android.graphics.Rect();
                this.f24619v.getWindowVisibleDisplayFrame(rect3);
                if (this.f24620w == i3) {
                    if (c2581o0.getWidth() + iArr[0] + iM > rect3.right) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                } else if (iArr[0] - iM < 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i10 == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.f24620w = i10;
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    g9.f24898v = childAt;
                    i12 = 0;
                    i11 = 0;
                } else {
                    iArr2 = new int[2];
                    this.f24618u.getLocationOnScreen(iArr2);
                    iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.f24617t & 7) == 5) {
                        iArr2[0] = this.f24618u.getWidth() + iArr2[0];
                        iArr3[0] = childAt.getWidth() + iArr3[0];
                    }
                    i11 = iArr3[0] - iArr2[0];
                    i12 = iArr3[1] - iArr2[1];
                }
                if ((this.f24617t & 5) == 5) {
                    if (z6) {
                        width = i11 + iM;
                    } else {
                        iM = childAt.getWidth();
                        width = i11 - iM;
                    }
                } else if (z6) {
                    width = i11 + childAt.getWidth();
                } else {
                    width = i11 - iM;
                }
                g9.f24889m = width;
                g9.f24894r = true;
                g9.f24893q = true;
                g9.k(i12);
            } else {
                if (this.f24621x) {
                    g9.f24889m = this.f24622z;
                }
                if (this.y) {
                    g9.k(this.f24600A);
                }
                rect = this.f24696h;
                if (rect != null) {
                    rect2 = new android.graphics.Rect(rect);
                } else {
                    rect2 = null;
                }
                g9.f24882D = rect2;
            }
            arrayList.add(new p095l.e(g9, lVar, this.f24620w));
            g9.e();
            p103m.C2581o0 c2581o2 = g9.j;
            c2581o2.setOnKeyListener(this);
            if (eVar == null || !this.f24602C || lVar.f24646m == null) {
                return;
            }
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) layoutInflaterFrom.inflate(com.kiptv.tv.R.layout.abc_popup_menu_header_item_layout, (android.view.ViewGroup) c2581o2, false);
            android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(lVar.f24646m);
            c2581o2.addHeaderView(frameLayout, null, false);
            g9.e();
            return;
        }
        i3 = 1;
        eVar = null;
        childAt = null;
        if (childAt != null) {
            i9 = android.os.Build.VERSION.SDK_INT;
            c2599y = g9.f24884F;
            if (i9 <= 28) {
                method = p103m.G0.f24913J;
                if (method != null) {
                    method.invoke(c2599y, java.lang.Boolean.FALSE);
                }
            } else {
                p103m.E0.a(c2599y, false);
            }
            p103m.D0.a(g9.f24884F, null);
            c2581o0 = ((p095l.e) arrayList.get(arrayList.size() - 1)).f24597a.j;
            iArr = new int[2];
            c2581o0.getLocationOnScreen(iArr);
            rect3 = new android.graphics.Rect();
            this.f24619v.getWindowVisibleDisplayFrame(rect3);
            if (this.f24620w == i3) {
                if (c2581o0.getWidth() + iArr[0] + iM > rect3.right) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
            } else if (iArr[0] - iM < 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (i10 == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.f24620w = i10;
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                g9.f24898v = childAt;
                i12 = 0;
                i11 = 0;
            } else {
                iArr2 = new int[2];
                this.f24618u.getLocationOnScreen(iArr2);
                iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f24617t & 7) == 5) {
                    iArr2[0] = this.f24618u.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                i11 = iArr3[0] - iArr2[0];
                i12 = iArr3[1] - iArr2[1];
            }
            if ((this.f24617t & 5) == 5) {
                if (z6) {
                    width = i11 + iM;
                } else {
                    iM = childAt.getWidth();
                    width = i11 - iM;
                }
            } else if (z6) {
                width = i11 + childAt.getWidth();
            } else {
                width = i11 - iM;
            }
            g9.f24889m = width;
            g9.f24894r = true;
            g9.f24893q = true;
            g9.k(i12);
        } else {
            if (this.f24621x) {
                g9.f24889m = this.f24622z;
            }
            if (this.y) {
                g9.k(this.f24600A);
            }
            rect = this.f24696h;
            if (rect != null) {
                rect2 = new android.graphics.Rect(rect);
            } else {
                rect2 = null;
            }
            g9.f24882D = rect2;
        }
        arrayList.add(new p095l.e(g9, lVar, this.f24620w));
        g9.e();
        p103m.C2581o0 c2581o3 = g9.j;
        c2581o3.setOnKeyListener(this);
        if (eVar == null) {
        }
    }
}
