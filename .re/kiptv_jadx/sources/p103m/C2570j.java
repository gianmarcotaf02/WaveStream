package p103m;

/* JADX INFO: renamed from: m.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2570j implements p095l.x {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public p103m.C2562f f25049A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p103m.RunnableC2566h f25050B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public p103m.C2564g f25051C;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.content.Context f25053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public android.content.Context f25054i;
    public p095l.l j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final android.view.LayoutInflater f25055k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p095l.w f25056l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p095l.z f25059o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p103m.C2568i f25060p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public android.graphics.drawable.Drawable f25061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f25062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f25063s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f25064t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f25065u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f25066v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f25067w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f25068x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p103m.C2562f f25069z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f25057m = com.kiptv.tv.R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f25058n = com.kiptv.tv.R.layout.abc_action_menu_item_layout;
    public final android.util.SparseBooleanArray y = new android.util.SparseBooleanArray();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final p008a8.c f25052D = new p008a8.c(10, this);

    public C2570j(android.content.Context context) {
        this.f25053h = context;
        this.f25055k = android.view.LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View a(p095l.n nVar, android.view.View view, android.view.ViewGroup viewGroup) {
        p095l.y yVar;
        android.view.View actionView = nVar.getActionView();
        if (actionView == null || nVar.e()) {
            if (view instanceof p095l.y) {
                yVar = (p095l.y) view;
            } else {
                yVar = (p095l.y) this.f25055k.inflate(this.f25058n, viewGroup, false);
            }
            yVar.b(nVar);
            androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = (androidx.appcompat.view.menu.ActionMenuItemView) yVar;
            actionMenuItemView.setItemInvoker((androidx.appcompat.widget.ActionMenuView) this.f25059o);
            if (this.f25051C == null) {
                this.f25051C = new p103m.C2564g(this);
            }
            actionMenuItemView.setPopupCallback(this.f25051C);
            actionView = (android.view.View) yVar;
        }
        actionView.setVisibility(nVar.f24662C ? 8 : 0);
        android.view.ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((androidx.appcompat.widget.ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof p103m.C2574l)) {
            actionView.setLayoutParams(androidx.appcompat.widget.ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // p095l.x
    public final boolean b(p095l.n nVar) {
        return false;
    }

    @Override // p095l.x
    public final void c(p095l.l lVar, boolean z6) {
        e();
        p103m.C2562f c2562f = this.f25049A;
        if (c2562f != null && c2562f.b()) {
            c2562f.f24705i.dismiss();
        }
        p095l.w wVar = this.f25056l;
        if (wVar != null) {
            wVar.c(lVar, z6);
        }
    }

    @Override // p095l.x
    public final boolean d() {
        int size;
        java.util.ArrayList arrayListL;
        int i3;
        boolean z6;
        p103m.C2570j c2570j = this;
        p095l.l lVar = c2570j.j;
        if (lVar != null) {
            arrayListL = lVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i9 = c2570j.f25067w;
        int i10 = c2570j.f25066v;
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) c2570j.f25059o;
        int i11 = 0;
        boolean z9 = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i3 = 2;
            z6 = true;
            if (i11 >= size) {
                break;
            }
            p095l.n nVar = (p095l.n) arrayListL.get(i11);
            int i14 = nVar.y;
            if ((i14 & 2) == 2) {
                i12++;
            } else if ((i14 & 1) == 1) {
                i13++;
            } else {
                z9 = true;
            }
            if (c2570j.f25068x && nVar.f24662C) {
                i9 = 0;
            }
            i11++;
        }
        if (c2570j.f25063s && (z9 || i13 + i12 > i9)) {
            i9--;
        }
        int i15 = i9 - i12;
        android.util.SparseBooleanArray sparseBooleanArray = c2570j.y;
        sparseBooleanArray.clear();
        int i16 = 0;
        int i17 = 0;
        while (i16 < size) {
            p095l.n nVar2 = (p095l.n) arrayListL.get(i16);
            int i18 = nVar2.y;
            boolean z10 = (i18 & 2) == i3 ? z6 : false;
            int i19 = nVar2.f24664b;
            if (z10) {
                android.view.View viewA = c2570j.a(nVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i10 -= measuredWidth;
                if (i17 == 0) {
                    i17 = measuredWidth;
                }
                if (i19 != 0) {
                    sparseBooleanArray.put(i19, z6);
                }
                nVar2.f(z6);
            } else {
                if ((i18 & 1) == z6) {
                    boolean z11 = sparseBooleanArray.get(i19);
                    boolean z12 = ((i15 > 0 || z11) && i10 > 0) ? z6 : false;
                    if (z12) {
                        android.view.View viewA2 = c2570j.a(nVar2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i10 -= measuredWidth2;
                        if (i17 == 0) {
                            i17 = measuredWidth2;
                        }
                        z12 &= i10 + i17 > 0;
                    }
                    if (z12 && i19 != 0) {
                        sparseBooleanArray.put(i19, true);
                    } else if (z11) {
                        sparseBooleanArray.put(i19, false);
                        for (int i20 = 0; i20 < i16; i20++) {
                            p095l.n nVar3 = (p095l.n) arrayListL.get(i20);
                            if (nVar3.f24664b == i19) {
                                if ((nVar3.f24684x & 32) == 32) {
                                    i15++;
                                }
                                nVar3.f(false);
                            }
                        }
                    }
                    if (z12) {
                        i15--;
                    }
                    nVar2.f(z12);
                } else {
                    nVar2.f(false);
                }
                i16++;
                i3 = 2;
                c2570j = this;
                z6 = true;
            }
            i16++;
            i3 = 2;
            c2570j = this;
            z6 = true;
        }
        return z6;
    }

    public final boolean e() {
        java.lang.Object obj;
        p103m.RunnableC2566h runnableC2566h = this.f25050B;
        if (runnableC2566h != null && (obj = this.f25059o) != null) {
            ((android.view.View) obj).removeCallbacks(runnableC2566h);
            this.f25050B = null;
            return true;
        }
        p103m.C2562f c2562f = this.f25069z;
        if (c2562f == null) {
            return false;
        }
        if (c2562f.b()) {
            c2562f.f24705i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p095l.x
    public final void f() {
        int i3;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f25059o;
        java.util.ArrayList arrayList = null;
        boolean z6 = false;
        if (viewGroup != null) {
            p095l.l lVar = this.j;
            if (lVar != null) {
                lVar.i();
                java.util.ArrayList arrayListL = this.j.l();
                int size = arrayListL.size();
                i3 = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    p095l.n nVar = (p095l.n) arrayListL.get(i9);
                    if ((nVar.f24684x & 32) == 32) {
                        android.view.View childAt = viewGroup.getChildAt(i3);
                        p095l.n itemData = childAt instanceof p095l.y ? ((p095l.y) childAt).getItemData() : null;
                        android.view.View viewA = a(nVar, childAt, viewGroup);
                        if (nVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((android.view.ViewGroup) this.f25059o).addView(viewA, i3);
                        }
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            while (i3 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i3) == this.f25060p) {
                    i3++;
                } else {
                    viewGroup.removeViewAt(i3);
                }
            }
        }
        ((android.view.View) this.f25059o).requestLayout();
        p095l.l lVar2 = this.j;
        if (lVar2 != null) {
            lVar2.i();
            java.util.ArrayList arrayList2 = lVar2.f24643i;
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                p095l.o oVar = ((p095l.n) arrayList2.get(i10)).f24660A;
            }
        }
        p095l.l lVar3 = this.j;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.j;
        }
        if (this.f25063s && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z6 = !((p095l.n) arrayList.get(0)).f24662C;
            } else if (size3 > 0) {
                z6 = true;
            }
        }
        if (z6) {
            if (this.f25060p == null) {
                this.f25060p = new p103m.C2568i(this, this.f25053h);
            }
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) this.f25060p.getParent();
            if (viewGroup3 != this.f25059o) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f25060p);
                }
                androidx.appcompat.widget.ActionMenuView actionMenuView = (androidx.appcompat.widget.ActionMenuView) this.f25059o;
                p103m.C2568i c2568i = this.f25060p;
                actionMenuView.getClass();
                p103m.C2574l c2574lI = androidx.appcompat.widget.ActionMenuView.i();
                c2574lI.f25074a = true;
                actionMenuView.addView(c2568i, c2574lI);
            }
        } else {
            p103m.C2568i c2568i2 = this.f25060p;
            if (c2568i2 != null) {
                java.lang.Object parent = c2568i2.getParent();
                java.lang.Object obj = this.f25059o;
                if (parent == obj) {
                    ((android.view.ViewGroup) obj).removeView(this.f25060p);
                }
            }
        }
        ((androidx.appcompat.widget.ActionMenuView) this.f25059o).setOverflowReserved(this.f25063s);
    }

    @Override // p095l.x
    public final void g(p095l.w wVar) {
        throw null;
    }

    public final boolean h() {
        p103m.C2562f c2562f = this.f25069z;
        return c2562f != null && c2562f.b();
    }

    @Override // p095l.x
    public final void i(android.content.Context context, p095l.l lVar) {
        this.f25054i = context;
        android.view.LayoutInflater.from(context);
        this.j = lVar;
        android.content.res.Resources resources = context.getResources();
        if (!this.f25064t) {
            this.f25063s = true;
        }
        int i3 = 2;
        this.f25065u = context.getResources().getDisplayMetrics().widthPixels / 2;
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        int i9 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i9 > 600 || ((i9 > 960 && i10 > 720) || (i9 > 720 && i10 > 960))) {
            i3 = 5;
        } else if (i9 >= 500 || ((i9 > 640 && i10 > 480) || (i9 > 480 && i10 > 640))) {
            i3 = 4;
        } else if (i9 >= 360) {
            i3 = 3;
        }
        this.f25067w = i3;
        int measuredWidth = this.f25065u;
        if (this.f25063s) {
            if (this.f25060p == null) {
                p103m.C2568i c2568i = new p103m.C2568i(this, this.f25053h);
                this.f25060p = c2568i;
                if (this.f25062r) {
                    c2568i.setImageDrawable(this.f25061q);
                    this.f25061q = null;
                    this.f25062r = false;
                }
                int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f25060p.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f25060p.getMeasuredWidth();
        } else {
            this.f25060p = null;
        }
        this.f25066v = measuredWidth;
        float f9 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p095l.x
    public final boolean j(p095l.D d4) {
        boolean z6;
        if (d4.hasVisibleItems()) {
            p095l.D d6 = d4;
            while (true) {
                p095l.l lVar = d6.f24578z;
                if (lVar == this.j) {
                    break;
                }
                d6 = (p095l.D) lVar;
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f25059o;
            android.view.View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    android.view.View childAt = viewGroup.getChildAt(i3);
                    if ((childAt instanceof p095l.y) && ((p095l.y) childAt).getItemData() == d6.f24577A) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                d4.f24577A.getClass();
                int size = d4.f24641f.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        z6 = false;
                        break;
                    }
                    android.view.MenuItem item = d4.getItem(i9);
                    if (item.isVisible() && item.getIcon() != null) {
                        z6 = true;
                        break;
                    }
                    i9++;
                }
                p103m.C2562f c2562f = new p103m.C2562f(this, this.f25054i, d4, view);
                this.f25049A = c2562f;
                c2562f.g = z6;
                p095l.t tVar = c2562f.f24705i;
                if (tVar != null) {
                    tVar.o(z6);
                }
                p103m.C2562f c2562f2 = this.f25049A;
                if (!c2562f2.b()) {
                    if (c2562f2.f24702e == null) {
                        throw new java.lang.IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c2562f2.d(0, 0, false, false);
                }
                p095l.w wVar = this.f25056l;
                if (wVar != null) {
                    wVar.j(d4);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p095l.x
    public final boolean k(p095l.n nVar) {
        return false;
    }

    public final boolean l() {
        p095l.l lVar;
        if (!this.f25063s || h() || (lVar = this.j) == null || this.f25059o == null || this.f25050B != null) {
            return false;
        }
        lVar.i();
        if (lVar.j.isEmpty()) {
            return false;
        }
        p103m.RunnableC2566h runnableC2566h = new p103m.RunnableC2566h(this, new p103m.C2562f(this, this.f25054i, this.j, this.f25060p));
        this.f25050B = runnableC2566h;
        ((android.view.View) this.f25059o).post(runnableC2566h);
        return true;
    }
}
