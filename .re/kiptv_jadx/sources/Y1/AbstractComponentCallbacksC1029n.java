package Y1;

/* JADX INFO: renamed from: Y1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC1029n implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, androidx.lifecycle.InterfaceC1540w, androidx.lifecycle.k0, androidx.lifecycle.InterfaceC1528j, p165t2.e {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final java.lang.Object f11294Y = new java.lang.Object();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Y1.AbstractComponentCallbacksC1029n f11296B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f11297C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f11298D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public java.lang.String f11299E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f11300F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f11301G;
    public boolean H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f11303J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public android.view.ViewGroup f11304K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f11305L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Y1.C1028m f11307N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f11308O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f11309P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public java.lang.String f11310Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public androidx.lifecycle.EnumC1533o f11311R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public androidx.lifecycle.C1542y f11312S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final androidx.lifecycle.G f11313T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public androidx.lifecycle.a0 f11314U;
    public p079i7.f V;
    public final java.util.ArrayList W;
    public final Y1.C1026k X;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public android.os.Bundle f11316i;
    public android.util.SparseArray j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public android.os.Bundle f11317k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public android.os.Bundle f11319m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Y1.AbstractComponentCallbacksC1029n f11320n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11322p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11324r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11325s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11326t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11327u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11328v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11329w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11330x;
    public Y1.D y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Y1.q f11331z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11315h = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.String f11318l = java.util.UUID.randomUUID().toString();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.lang.String f11321o = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public java.lang.Boolean f11323q = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Y1.D f11295A = new Y1.D();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f11302I = true;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f11306M = true;

    public AbstractComponentCallbacksC1029n() {
        new B3.r(7, this);
        this.f11311R = androidx.lifecycle.EnumC1533o.f16367l;
        this.f11313T = new androidx.lifecycle.G();
        new java.util.concurrent.atomic.AtomicInteger();
        this.W = new java.util.ArrayList();
        this.X = new Y1.C1026k(this);
        o();
    }

    public void A() {
        this.f11303J = true;
    }

    public abstract void B(android.os.Bundle bundle);

    public abstract void C();

    public abstract void D();

    public void E(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.f11295A.M();
        this.f11329w = true;
        e();
    }

    public final android.content.Context F() {
        Y1.q qVar = this.f11331z;
        com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity = qVar == null ? null : qVar.f11337s;
        if (signInHubActivity != null) {
            return signInHubActivity;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final void G(int i3, int i9, int i10, int i11) {
        if (this.f11307N == null && i3 == 0 && i9 == 0 && i10 == 0 && i11 == 0) {
            return;
        }
        k().f11287b = i3;
        k().f11288c = i9;
        k().f11289d = i10;
        k().f11290e = i11;
    }

    @Override // androidx.lifecycle.InterfaceC1528j
    public final androidx.lifecycle.g0 c() {
        android.app.Application application;
        if (this.y == null) {
            throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f11314U == null) {
            android.content.Context applicationContext = F().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof android.content.ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof android.app.Application) {
                    application = (android.app.Application) applicationContext;
                    break;
                }
                applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && Y1.D.G(3)) {
                android.util.Log.d("FragmentManager", "Could not find Application instance from Context " + F().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f11314U = new androidx.lifecycle.a0(application, this, this.f11319m);
        }
        return this.f11314U;
    }

    @Override // androidx.lifecycle.InterfaceC1528j
    public final p040e2.d d() {
        android.app.Application application;
        android.content.Context applicationContext = F().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof android.content.ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof android.app.Application) {
                application = (android.app.Application) applicationContext;
                break;
            }
            applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Y1.D.G(3)) {
            android.util.Log.d("FragmentManager", "Could not find Application instance from Context " + F().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        p040e2.d dVar = new p040e2.d(0);
        java.util.LinkedHashMap linkedHashMap = dVar.f21365a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.f0.f16355d, application);
        }
        linkedHashMap.put(androidx.lifecycle.X.f16322a, this);
        linkedHashMap.put(androidx.lifecycle.X.f16323b, this);
        android.os.Bundle bundle = this.f11319m;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.X.f16324c, bundle);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.k0
    public final androidx.lifecycle.j0 e() {
        if (this.y == null) {
            throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
        }
        int iM = m();
        androidx.lifecycle.EnumC1533o enumC1533o = androidx.lifecycle.EnumC1533o.f16364h;
        if (iM == 1) {
            throw new java.lang.IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        java.util.HashMap map = this.y.f11164L.f11200d;
        androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) map.get(this.f11318l);
        if (j0Var != null) {
            return j0Var;
        }
        androidx.lifecycle.j0 j0Var2 = new androidx.lifecycle.j0();
        map.put(this.f11318l, j0Var2);
        return j0Var2;
    }

    @Override // p165t2.e
    public final p079i7.f g() {
        return (p079i7.f) this.V.j;
    }

    @Override // androidx.lifecycle.InterfaceC1540w
    public final androidx.lifecycle.AbstractC1534p getLifecycle() {
        return this.f11312S;
    }

    public E8.l i() {
        return new Y1.C1027l(this);
    }

    public void j(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        java.lang.String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(java.lang.Integer.toHexString(this.f11297C));
        printWriter.print(" mContainerId=#");
        printWriter.print(java.lang.Integer.toHexString(this.f11298D));
        printWriter.print(" mTag=");
        printWriter.println(this.f11299E);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f11315h);
        printWriter.print(" mWho=");
        printWriter.print(this.f11318l);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f11330x);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f11324r);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f11325s);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f11326t);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f11327u);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f11300F);
        printWriter.print(" mDetached=");
        printWriter.print(this.f11301G);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f11302I);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.H);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f11306M);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.y);
        }
        if (this.f11331z != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f11331z);
        }
        if (this.f11296B != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f11296B);
        }
        if (this.f11319m != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f11319m);
        }
        if (this.f11316i != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f11316i);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.j);
        }
        if (this.f11317k != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f11317k);
        }
        Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029nW = this.f11320n;
        if (abstractComponentCallbacksC1029nW == null) {
            Y1.D d4 = this.y;
            abstractComponentCallbacksC1029nW = (d4 == null || (str2 = this.f11321o) == null) ? null : d4.f11168c.w(str2);
        }
        if (abstractComponentCallbacksC1029nW != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(abstractComponentCallbacksC1029nW);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f11322p);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        Y1.C1028m c1028m = this.f11307N;
        printWriter.println(c1028m == null ? false : c1028m.f11286a);
        Y1.C1028m c1028m2 = this.f11307N;
        if ((c1028m2 == null ? 0 : c1028m2.f11287b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            Y1.C1028m c1028m3 = this.f11307N;
            printWriter.println(c1028m3 == null ? 0 : c1028m3.f11287b);
        }
        Y1.C1028m c1028m4 = this.f11307N;
        if ((c1028m4 == null ? 0 : c1028m4.f11288c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            Y1.C1028m c1028m5 = this.f11307N;
            printWriter.println(c1028m5 == null ? 0 : c1028m5.f11288c);
        }
        Y1.C1028m c1028m6 = this.f11307N;
        if ((c1028m6 == null ? 0 : c1028m6.f11289d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            Y1.C1028m c1028m7 = this.f11307N;
            printWriter.println(c1028m7 == null ? 0 : c1028m7.f11289d);
        }
        Y1.C1028m c1028m8 = this.f11307N;
        if ((c1028m8 == null ? 0 : c1028m8.f11290e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            Y1.C1028m c1028m9 = this.f11307N;
            printWriter.println(c1028m9 != null ? c1028m9.f11290e : 0);
        }
        if (this.f11304K != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f11304K);
        }
        Y1.q qVar = this.f11331z;
        if ((qVar != null ? qVar.f11337s : null) != null) {
            new S2.a(this, e()).y(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f11295A + ":");
        this.f11295A.v(p121o0.p.o(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final Y1.C1028m k() {
        if (this.f11307N == null) {
            Y1.C1028m c1028m = new Y1.C1028m();
            java.lang.Object obj = f11294Y;
            c1028m.f11291f = obj;
            c1028m.g = obj;
            c1028m.f11292h = obj;
            c1028m.f11293i = null;
            this.f11307N = c1028m;
        }
        return this.f11307N;
    }

    public final Y1.D l() {
        if (this.f11331z != null) {
            return this.f11295A;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final int m() {
        androidx.lifecycle.EnumC1533o enumC1533o = this.f11311R;
        return (enumC1533o == androidx.lifecycle.EnumC1533o.f16365i || this.f11296B == null) ? enumC1533o.ordinal() : java.lang.Math.min(enumC1533o.ordinal(), this.f11296B.m());
    }

    public final Y1.D n() {
        Y1.D d4 = this.y;
        if (d4 != null) {
            return d4;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void o() {
        this.f11312S = new androidx.lifecycle.C1542y(this);
        this.V = new p079i7.f(new p177v2.a(this, new p077i5.C2237d(23, this)));
        this.f11314U = null;
        java.util.ArrayList arrayList = this.W;
        Y1.C1026k c1026k = this.X;
        if (arrayList.contains(c1026k)) {
            return;
        }
        if (this.f11315h < 0) {
            arrayList.add(c1026k);
            return;
        }
        Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = c1026k.f11284a;
        abstractComponentCallbacksC1029n.V.O0();
        androidx.lifecycle.X.c(abstractComponentCallbacksC1029n);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.f11303J = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        Y1.q qVar = this.f11331z;
        com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity = qVar == null ? null : qVar.f11336r;
        if (signInHubActivity != null) {
            signInHubActivity.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f11303J = true;
    }

    public final void p() {
        o();
        this.f11310Q = this.f11318l;
        this.f11318l = java.util.UUID.randomUUID().toString();
        this.f11324r = false;
        this.f11325s = false;
        this.f11326t = false;
        this.f11327u = false;
        this.f11328v = false;
        this.f11330x = 0;
        this.y = null;
        this.f11295A = new Y1.D();
        this.f11331z = null;
        this.f11297C = 0;
        this.f11298D = 0;
        this.f11299E = null;
        this.f11300F = false;
        this.f11301G = false;
    }

    public final boolean q() {
        if (this.f11300F) {
            return true;
        }
        Y1.D d4 = this.y;
        if (d4 != null) {
            Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = this.f11296B;
            d4.getClass();
            if (abstractComponentCallbacksC1029n == null ? false : abstractComponentCallbacksC1029n.q()) {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        return this.f11330x > 0;
    }

    public void s() {
        this.f11303J = true;
    }

    public final void startActivityForResult(android.content.Intent intent, int i3) {
        if (this.f11331z == null) {
            throw new java.lang.IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        Y1.D dN = n();
        if (dN.f11188z == null) {
            Y1.q qVar = dN.f11183t;
            if (i3 == -1) {
                qVar.f11337s.startActivity(intent, null);
                return;
            } else {
                qVar.getClass();
                throw new java.lang.IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
        java.lang.String str = this.f11318l;
        Y1.A a2 = new Y1.A();
        a2.f11150h = str;
        a2.f11151i = i3;
        dN.f11156C.addLast(a2);
        dN.f11188z.F(intent);
    }

    public void t(int i3, int i9, android.content.Intent intent) {
        if (Y1.D.G(2)) {
            android.util.Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i3 + " resultCode: " + i9 + " data: " + intent);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f11318l);
        if (this.f11297C != 0) {
            sb.append(" id=0x");
            sb.append(java.lang.Integer.toHexString(this.f11297C));
        }
        if (this.f11299E != null) {
            sb.append(" tag=");
            sb.append(this.f11299E);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity) {
        this.f11303J = true;
        Y1.q qVar = this.f11331z;
        if ((qVar == null ? null : qVar.f11336r) != null) {
            this.f11303J = true;
        }
    }

    public abstract void v(android.os.Bundle bundle);

    public void w() {
        this.f11303J = true;
    }

    public void x() {
        this.f11303J = true;
    }

    public void y() {
        this.f11303J = true;
    }

    public android.view.LayoutInflater z(android.os.Bundle bundle) {
        Y1.q qVar = this.f11331z;
        if (qVar == null) {
            throw new java.lang.IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity = qVar.f11340v;
        android.view.LayoutInflater layoutInflaterCloneInContext = signInHubActivity.getLayoutInflater().cloneInContext(signInHubActivity);
        layoutInflaterCloneInContext.setFactory2(this.f11295A.f11171f);
        return layoutInflaterCloneInContext;
    }
}
