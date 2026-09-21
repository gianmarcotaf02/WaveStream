package p095l;

/* JADX INFO: loaded from: classes.dex */
public class l implements android.view.Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f24636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.res.Resources f24637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p095l.j f24640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f24641f;
    public final java.util.ArrayList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f24643i;
    public final java.util.ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f24644k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f24646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f24647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public android.view.View f24648o;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p095l.n f24655v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f24657x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24645l = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f24649p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f24650q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f24651r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f24652s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f24653t = new java.util.ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f24654u = new java.util.concurrent.CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f24656w = false;

    public l(android.content.Context context) {
        boolean zT;
        boolean z6 = false;
        this.f24636a = context;
        android.content.res.Resources resources = context.getResources();
        this.f24637b = resources;
        this.f24641f = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        this.f24642h = true;
        this.f24643i = new java.util.ArrayList();
        this.j = new java.util.ArrayList();
        this.f24644k = true;
        if (resources.getConfiguration().keyboard != 1) {
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
            java.lang.reflect.Method method = D1.V.f1985a;
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                zT = D1.AbstractC0225j.t(viewConfiguration);
            } else {
                android.content.res.Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", com.revenuecat.purchases.common.events.BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM);
                zT = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zT) {
                z6 = true;
            }
        }
        this.f24639d = z6;
    }

    public final p095l.n a(int i3, int i9, int i10, java.lang.CharSequence charSequence) {
        int i11;
        int i12 = ((-65536) & i10) >> 16;
        if (i12 < 0 || i12 >= 6) {
            throw new java.lang.IllegalArgumentException("order does not contain a valid category.");
        }
        int i13 = (y[i12] << 16) | (65535 & i10);
        p095l.n nVar = new p095l.n(this, i3, i9, i10, i13, charSequence, this.f24645l);
        java.util.ArrayList arrayList = this.f24641f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((p095l.n) arrayList.get(size)).f24666d <= i13) {
                i11 = size + 1;
                arrayList.add(i11, nVar);
                p(true);
                return nVar;
            }
        }
        i11 = 0;
        arrayList.add(i11, nVar);
        p(true);
        return nVar;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i9, int i10, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i11, android.view.MenuItem[] menuItemArr) {
        int i12;
        android.content.pm.PackageManager packageManager = this.f24636a.getPackageManager();
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i11 & 1) == 0) {
            removeGroup(i3);
        }
        for (int i13 = 0; i13 < size; i13++) {
            android.content.pm.ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i13);
            int i14 = resolveInfo.specificIndex;
            android.content.Intent intent2 = new android.content.Intent(i14 < 0 ? intent : intentArr[i14]);
            android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new android.content.ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            p095l.n nVarA = a(i3, i9, i10, resolveInfo.loadLabel(packageManager));
            nVarA.setIcon(resolveInfo.loadIcon(packageManager));
            nVarA.g = intent2;
            if (menuItemArr != null && (i12 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i12] = nVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(p095l.x xVar, android.content.Context context) {
        this.f24654u.add(new java.lang.ref.WeakReference(xVar));
        xVar.i(context, this);
        this.f24644k = true;
    }

    public final void c(boolean z6) {
        if (this.f24652s) {
            return;
        }
        this.f24652s = true;
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.f24654u;
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            p095l.x xVar = (p095l.x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.c(this, z6);
            }
        }
        this.f24652s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        p095l.n nVar = this.f24655v;
        if (nVar != null) {
            d(nVar);
        }
        this.f24641f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f24647n = null;
        this.f24646m = null;
        this.f24648o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(p095l.n nVar) {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.f24654u;
        boolean zK = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f24655v == nVar) {
            w();
            for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
                p095l.x xVar = (p095l.x) weakReference.get();
                if (xVar != null) {
                    zK = xVar.k(nVar);
                    if (zK) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zK) {
                this.f24655v = null;
            }
        }
        return zK;
    }

    public boolean e(p095l.l lVar, android.view.MenuItem menuItem) {
        p095l.j jVar = this.f24640e;
        return jVar != null && jVar.v(lVar, menuItem);
    }

    public boolean f(p095l.n nVar) {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.f24654u;
        boolean zB = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            p095l.x xVar = (p095l.x) weakReference.get();
            if (xVar != null) {
                zB = xVar.b(nVar);
                if (zB) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zB) {
            this.f24655v = nVar;
        }
        return zB;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem findItem(int i3) {
        android.view.MenuItem menuItemFindItem;
        java.util.ArrayList arrayList = this.f24641f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            p095l.n nVar = (p095l.n) arrayList.get(i9);
            if (nVar.f24663a == i3) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (menuItemFindItem = nVar.f24675o.findItem(i3)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final p095l.n g(int i3, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = this.f24653t;
        arrayList.clear();
        h(arrayList, i3, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (p095l.n) arrayList.get(0);
        }
        boolean zN = n();
        for (int i9 = 0; i9 < size; i9++) {
            p095l.n nVar = (p095l.n) arrayList.get(i9);
            char c9 = zN ? nVar.j : nVar.f24669h;
            char[] cArr = keyData.meta;
            if ((c9 == cArr[0] && (metaState & 2) == 0) || ((c9 == cArr[2] && (metaState & 2) != 0) || (zN && c9 == '\b' && i3 == 67))) {
                return nVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem getItem(int i3) {
        return (android.view.MenuItem) this.f24641f.get(i3);
    }

    public final void h(java.util.ArrayList arrayList, int i3, android.view.KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i3 == 67) {
            java.util.ArrayList arrayList2 = this.f24641f;
            int size = arrayList2.size();
            for (int i9 = 0; i9 < size; i9++) {
                p095l.n nVar = (p095l.n) arrayList2.get(i9);
                if (nVar.hasSubMenu()) {
                    nVar.f24675o.h(arrayList, i3, keyEvent);
                }
                char c9 = zN ? nVar.j : nVar.f24669h;
                if ((modifiers & 69647) == ((zN ? nVar.f24671k : nVar.f24670i) & 69647) && c9 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c9 == cArr[0] || c9 == cArr[2] || (zN && c9 == '\b' && i3 == 67)) && nVar.isEnabled()) {
                        arrayList.add(nVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f24657x) {
            return true;
        }
        java.util.ArrayList arrayList = this.f24641f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((p095l.n) arrayList.get(i3)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        java.util.ArrayList arrayListL = l();
        if (this.f24644k) {
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.f24654u;
            boolean zD = false;
            for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
                p095l.x xVar = (p095l.x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= xVar.d();
                }
            }
            java.util.ArrayList arrayList = this.f24643i;
            java.util.ArrayList arrayList2 = this.j;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i3 = 0; i3 < size; i3++) {
                    p095l.n nVar = (p095l.n) arrayListL.get(i3);
                    if ((nVar.f24684x & 32) == 32) {
                        arrayList.add(nVar);
                    } else {
                        arrayList2.add(nVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f24644k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, android.view.KeyEvent keyEvent) {
        return g(i3, keyEvent) != null;
    }

    public java.lang.String j() {
        return "android:menu:actionviewstates";
    }

    public final java.util.ArrayList l() {
        boolean z6 = this.f24642h;
        java.util.ArrayList arrayList = this.g;
        if (!z6) {
            return arrayList;
        }
        arrayList.clear();
        java.util.ArrayList arrayList2 = this.f24641f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            p095l.n nVar = (p095l.n) arrayList2.get(i3);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.f24642h = false;
        this.f24644k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f24656w;
    }

    public boolean n() {
        return this.f24638c;
    }

    public boolean o() {
        return this.f24639d;
    }

    public final void p(boolean z6) {
        if (this.f24649p) {
            this.f24650q = true;
            if (z6) {
                this.f24651r = true;
                return;
            }
            return;
        }
        if (z6) {
            this.f24642h = true;
            this.f24644k = true;
        }
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.f24654u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            p095l.x xVar = (p095l.x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.f();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i9) {
        return q(findItem(i3), null, i9);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, android.view.KeyEvent keyEvent, int i9) {
        p095l.n nVarG = g(i3, keyEvent);
        boolean zQ = nVarG != null ? q(nVarG, null, i9) : false;
        if ((i9 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ae A[SYNTHETIC] */
    public final boolean q(android.view.MenuItem menuItem, p095l.x xVar, int i3) {
        p095l.o oVar;
        boolean zExpandActionView;
        p095l.o oVar2;
        boolean z6;
        p095l.D d4;
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList;
        p095l.x xVar2;
        p095l.n nVar = (p095l.n) menuItem;
        boolean zJ = false;
        if (nVar == null || !nVar.isEnabled()) {
            return false;
        }
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = nVar.f24676p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(nVar)) {
            p095l.l lVar = nVar.f24674n;
            if (lVar.e(lVar, nVar)) {
                zExpandActionView = true;
            } else {
                android.content.Intent intent = nVar.g;
                if (intent != null) {
                    try {
                        lVar.f24636a.startActivity(intent);
                    } catch (android.content.ActivityNotFoundException e6) {
                        android.util.Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e6);
                        oVar = nVar.f24660A;
                        if (oVar == null) {
                        }
                        zExpandActionView = false;
                        oVar2 = nVar.f24660A;
                        if (oVar2 == null) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (nVar.e()) {
                            zExpandActionView |= nVar.expandActionView();
                            if (zExpandActionView) {
                                c(true);
                            }
                        } else if (nVar.hasSubMenu()) {
                            if ((i3 & 4) == 0) {
                                c(false);
                            }
                            if (!nVar.hasSubMenu()) {
                                p095l.D d6 = new p095l.D(this.f24636a, this, nVar);
                                nVar.f24675o = d6;
                                d6.setHeaderTitle(nVar.f24667e);
                            }
                            d4 = nVar.f24675o;
                            if (z6) {
                                p095l.s sVar = oVar2.f24688c;
                                oVar2.f24687b.onPrepareSubMenu(d4);
                            }
                            copyOnWriteArrayList = this.f24654u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                if (xVar != null) {
                                }
                                for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
                                    xVar2 = (p095l.x) weakReference.get();
                                    if (xVar2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zJ) {
                                        zJ = xVar2.j(d4);
                                    }
                                }
                            }
                            zExpandActionView |= zJ;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        } else {
                            if ((i3 & 4) == 0) {
                                c(false);
                            }
                            if (!nVar.hasSubMenu()) {
                                p095l.D d9 = new p095l.D(this.f24636a, this, nVar);
                                nVar.f24675o = d9;
                                d9.setHeaderTitle(nVar.f24667e);
                            }
                            d4 = nVar.f24675o;
                            if (z6) {
                                p095l.s sVar2 = oVar2.f24688c;
                                oVar2.f24687b.onPrepareSubMenu(d4);
                            }
                            copyOnWriteArrayList = this.f24654u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                zJ = xVar != null ? xVar.j(d4) : false;
                                while (r8.hasNext()) {
                                    xVar2 = (p095l.x) weakReference.get();
                                    if (xVar2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zJ) {
                                        zJ = xVar2.j(d4);
                                    }
                                }
                            }
                            zExpandActionView |= zJ;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    oVar = nVar.f24660A;
                    if (oVar == null && oVar.f24687b.onPerformDefaultAction()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        oVar2 = nVar.f24660A;
        if (oVar2 == null && oVar2.f24687b.hasSubMenu()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (nVar.e()) {
            zExpandActionView |= nVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (nVar.hasSubMenu() || z6) {
            if ((i3 & 4) == 0) {
                c(false);
            }
            if (!nVar.hasSubMenu()) {
                p095l.D d10 = new p095l.D(this.f24636a, this, nVar);
                nVar.f24675o = d10;
                d10.setHeaderTitle(nVar.f24667e);
            }
            d4 = nVar.f24675o;
            if (z6) {
                p095l.s sVar3 = oVar2.f24688c;
                oVar2.f24687b.onPrepareSubMenu(d4);
            }
            copyOnWriteArrayList = this.f24654u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (xVar != null) {
                }
                while (r8.hasNext()) {
                    xVar2 = (p095l.x) weakReference.get();
                    if (xVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zJ) {
                        zJ = xVar2.j(d4);
                    }
                }
            }
            zExpandActionView |= zJ;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i3 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(p095l.x xVar) {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.f24654u;
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            p095l.x xVar2 = (p095l.x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        java.util.ArrayList arrayList = this.f24641f;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((p095l.n) arrayList.get(i10)).f24664b == i3) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            int size2 = arrayList.size() - i10;
            while (true) {
                int i11 = i9 + 1;
                if (i9 >= size2 || ((p095l.n) arrayList.get(i10)).f24664b != i3) {
                    break;
                }
                if (i10 >= 0) {
                    java.util.ArrayList arrayList2 = this.f24641f;
                    if (i10 < arrayList2.size()) {
                        arrayList2.remove(i10);
                    }
                }
                i9 = i11;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        java.util.ArrayList arrayList = this.f24641f;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (((p095l.n) arrayList.get(i9)).f24663a == i3) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            java.util.ArrayList arrayList2 = this.f24641f;
            if (i9 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i9);
            p(true);
        }
    }

    public final void s(android.os.Bundle bundle) {
        android.view.MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        android.util.SparseArray<android.os.Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f24641f.size();
        for (int i3 = 0; i3 < size; i3++) {
            android.view.MenuItem item = getItem(i3);
            android.view.View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((p095l.D) item.getSubMenu()).s(bundle);
            }
        }
        int i9 = bundle.getInt("android:menu:expandedactionview");
        if (i9 <= 0 || (menuItemFindItem = findItem(i9)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z6, boolean z9) {
        java.util.ArrayList arrayList = this.f24641f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            p095l.n nVar = (p095l.n) arrayList.get(i9);
            if (nVar.f24664b == i3) {
                nVar.f24684x = (nVar.f24684x & (-5)) | (z9 ? 4 : 0);
                nVar.setCheckable(z6);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.f24656w = z6;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z6) {
        java.util.ArrayList arrayList = this.f24641f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            p095l.n nVar = (p095l.n) arrayList.get(i9);
            if (nVar.f24664b == i3) {
                nVar.setEnabled(z6);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z6) {
        java.util.ArrayList arrayList = this.f24641f;
        int size = arrayList.size();
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            p095l.n nVar = (p095l.n) arrayList.get(i9);
            if (nVar.f24664b == i3) {
                int i10 = nVar.f24684x;
                int i11 = (i10 & (-9)) | (z6 ? 0 : 8);
                nVar.f24684x = i11;
                if (i10 != i11) {
                    z9 = true;
                }
            }
        }
        if (z9) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f24638c = z6;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f24641f.size();
    }

    public final void t(android.os.Bundle bundle) {
        int size = this.f24641f.size();
        android.util.SparseArray<? extends android.os.Parcelable> sparseArray = null;
        for (int i3 = 0; i3 < size; i3++) {
            android.view.MenuItem item = getItem(i3);
            android.view.View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new android.util.SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((p095l.D) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i3, java.lang.CharSequence charSequence, int i9, android.graphics.drawable.Drawable drawable, android.view.View view) {
        if (view != null) {
            this.f24648o = view;
            this.f24646m = null;
            this.f24647n = null;
        } else {
            if (i3 > 0) {
                this.f24646m = this.f24637b.getText(i3);
            } else if (charSequence != null) {
                this.f24646m = charSequence;
            }
            if (i9 > 0) {
                this.f24647n = this.f24636a.getDrawable(i9);
            } else if (drawable != null) {
                this.f24647n = drawable;
            }
            this.f24648o = null;
        }
        p(false);
    }

    public final void v() {
        this.f24649p = false;
        if (this.f24650q) {
            this.f24650q = false;
            p(this.f24651r);
        }
    }

    public final void w() {
        if (this.f24649p) {
            return;
        }
        this.f24649p = true;
        this.f24650q = false;
        this.f24651r = false;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i3) {
        return a(0, 0, 0, this.f24637b.getString(i3));
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, this.f24637b.getString(i3));
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i3, int i9, int i10, java.lang.CharSequence charSequence) {
        return a(i3, i9, i10, charSequence);
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i3, int i9, int i10, java.lang.CharSequence charSequence) {
        p095l.n nVarA = a(i3, i9, i10, charSequence);
        p095l.D d4 = new p095l.D(this.f24636a, this, nVarA);
        nVarA.f24675o = d4;
        d4.setHeaderTitle(nVarA.f24667e);
        return d4;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i3, int i9, int i10, int i11) {
        return a(i3, i9, i10, this.f24637b.getString(i11));
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i3, int i9, int i10, int i11) {
        return addSubMenu(i3, i9, i10, this.f24637b.getString(i11));
    }

    public p095l.l k() {
        return this;
    }
}
