package p088k;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public java.lang.CharSequence f24356A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public java.lang.CharSequence f24357B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ p088k.g f24360E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.Menu f24361a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24368i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.CharSequence f24369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.CharSequence f24370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f24372n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f24373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f24374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f24375q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f24376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f24377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f24378t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f24379u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f24380v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f24381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public java.lang.String f24382x;
    public java.lang.String y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p095l.o f24383z;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public android.content.res.ColorStateList f24358C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f24359D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24362b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24363c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24364d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24365e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24366f = true;
    public boolean g = true;

    public f(p088k.g gVar, android.view.Menu menu) {
        this.f24360E = gVar;
        this.f24361a = menu;
    }

    public final java.lang.Object a(java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        try {
            java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName(str, false, this.f24360E.f24388c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (java.lang.Exception e6) {
            android.util.Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e6);
            return null;
        }
    }

    public final void b(android.view.MenuItem menuItem) {
        boolean z6 = false;
        menuItem.setChecked(this.f24377s).setVisible(this.f24378t).setEnabled(this.f24379u).setCheckable(this.f24376r >= 1).setTitleCondensed(this.f24370l).setIcon(this.f24371m);
        int i3 = this.f24380v;
        if (i3 >= 0) {
            menuItem.setShowAsAction(i3);
        }
        java.lang.String str = this.y;
        p088k.g gVar = this.f24360E;
        if (str != null) {
            if (gVar.f24388c.isRestricted()) {
                throw new java.lang.IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (gVar.f24389d == null) {
                gVar.f24389d = p088k.g.a(gVar.f24388c);
            }
            java.lang.Object obj = gVar.f24389d;
            java.lang.String str2 = this.y;
            p088k.e eVar = new p088k.e();
            eVar.f24354a = obj;
            java.lang.Class<?> cls = obj.getClass();
            try {
                eVar.f24355b = cls.getMethod(str2, p088k.e.f24353c);
                menuItem.setOnMenuItemClickListener(eVar);
            } catch (java.lang.Exception e6) {
                java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbQ.append(cls.getName());
                android.view.InflateException inflateException = new android.view.InflateException(sbQ.toString());
                inflateException.initCause(e6);
                throw inflateException;
            }
        }
        if (this.f24376r >= 2) {
            if (menuItem instanceof p095l.n) {
                p095l.n nVar = (p095l.n) menuItem;
                nVar.f24684x = (nVar.f24684x & (-5)) | 4;
            } else if (menuItem instanceof p095l.s) {
                p095l.s sVar = (p095l.s) menuItem;
                try {
                    java.lang.reflect.Method method = sVar.f24695d;
                    p197y1.a aVar = sVar.f24694c;
                    if (method == null) {
                        sVar.f24695d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", java.lang.Boolean.TYPE);
                    }
                    sVar.f24695d.invoke(aVar, java.lang.Boolean.TRUE);
                } catch (java.lang.Exception e9) {
                    android.util.Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e9);
                }
            }
        }
        java.lang.String str3 = this.f24382x;
        if (str3 != null) {
            menuItem.setActionView((android.view.View) a(str3, p088k.g.f24384e, gVar.f24386a));
            z6 = true;
        }
        int i9 = this.f24381w;
        if (i9 > 0) {
            if (z6) {
                android.util.Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i9);
            }
        }
        p095l.o oVar = this.f24383z;
        if (oVar != null) {
            if (menuItem instanceof p197y1.a) {
                ((p197y1.a) menuItem).b(oVar);
            } else {
                android.util.Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        java.lang.CharSequence charSequence = this.f24356A;
        boolean z9 = menuItem instanceof p197y1.a;
        if (z9) {
            ((p197y1.a) menuItem).setContentDescription(charSequence);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            D1.AbstractC0229n.m(menuItem, charSequence);
        }
        java.lang.CharSequence charSequence2 = this.f24357B;
        if (z9) {
            ((p197y1.a) menuItem).setTooltipText(charSequence2);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            D1.AbstractC0229n.u(menuItem, charSequence2);
        }
        char c9 = this.f24372n;
        int i10 = this.f24373o;
        if (z9) {
            ((p197y1.a) menuItem).setAlphabeticShortcut(c9, i10);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            D1.AbstractC0229n.j(menuItem, c9, i10);
        }
        char c10 = this.f24374p;
        int i11 = this.f24375q;
        if (z9) {
            ((p197y1.a) menuItem).setNumericShortcut(c10, i11);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            D1.AbstractC0229n.q(menuItem, c10, i11);
        }
        android.graphics.PorterDuff.Mode mode = this.f24359D;
        if (mode != null) {
            if (z9) {
                ((p197y1.a) menuItem).setIconTintMode(mode);
            } else if (android.os.Build.VERSION.SDK_INT >= 26) {
                D1.AbstractC0229n.p(menuItem, mode);
            }
        }
        android.content.res.ColorStateList colorStateList = this.f24358C;
        if (colorStateList != null) {
            if (z9) {
                ((p197y1.a) menuItem).setIconTintList(colorStateList);
            } else if (android.os.Build.VERSION.SDK_INT >= 26) {
                D1.AbstractC0229n.o(menuItem, colorStateList);
            }
        }
    }
}
