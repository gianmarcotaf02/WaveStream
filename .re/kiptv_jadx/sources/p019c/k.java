package p019c;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends androidx.core.app.AbstractActivityC1484d implements androidx.lifecycle.k0, androidx.lifecycle.InterfaceC1528j, p165t2.e, p019c.v {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f18049A = 0;
    private static final p019c.f Companion = new p019c.f();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p037e.a f18050i = new p037e.a();
    public final android.support.v4.media.session.q j = new android.support.v4.media.session.q(new p019c.c(this, 0));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p079i7.f f18051k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.lifecycle.j0 f18052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p019c.h f18053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p070h6.p f18054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f18055o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p019c.i f18056p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f18057q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f18058r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f18059s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f18060t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f18061u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f18062v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18063w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f18064x;
    public final p070h6.p y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p070h6.p f18065z;

    public k() {
        p079i7.f fVar = new p079i7.f(new p177v2.a(this, new p077i5.C2237d(23, this)));
        this.f18051k = fVar;
        this.f18053m = new p019c.h(this);
        this.f18054n = com.google.common.util.concurrent.D.B(new p019c.j(this, 2));
        this.f18055o = new java.util.concurrent.atomic.AtomicInteger();
        this.f18056p = new p019c.i(this);
        this.f18057q = new java.util.concurrent.CopyOnWriteArrayList();
        this.f18058r = new java.util.concurrent.CopyOnWriteArrayList();
        this.f18059s = new java.util.concurrent.CopyOnWriteArrayList();
        this.f18060t = new java.util.concurrent.CopyOnWriteArrayList();
        this.f18061u = new java.util.concurrent.CopyOnWriteArrayList();
        this.f18062v = new java.util.concurrent.CopyOnWriteArrayList();
        androidx.lifecycle.C1542y c1542y = this.f16022h;
        if (c1542y == null) {
            throw new java.lang.IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i3 = 0;
        c1542y.a(new androidx.lifecycle.InterfaceC1538u(this) { // from class: c.d

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p019c.k f18033i;

            {
                this.f18033i = this;
            }

            @Override // androidx.lifecycle.InterfaceC1538u
            public final void b(androidx.lifecycle.InterfaceC1540w interfaceC1540w, androidx.lifecycle.EnumC1532n enumC1532n) {
                android.view.Window window;
                android.view.View viewPeekDecorView;
                switch (i3) {
                    case 0:
                        if (enumC1532n == androidx.lifecycle.EnumC1532n.ON_STOP && (window = this.f18033i.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        p019c.k kVar = this.f18033i;
                        if (enumC1532n == androidx.lifecycle.EnumC1532n.ON_DESTROY) {
                            kVar.f18050i.f21315b = null;
                            if (!kVar.isChangingConfigurations()) {
                                kVar.e().a();
                            }
                            p019c.h hVar = kVar.f18053m;
                            p019c.k kVar2 = hVar.f18039k;
                            kVar2.getWindow().getDecorView().removeCallbacks(hVar);
                            kVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(hVar);
                        }
                        break;
                }
            }
        });
        final int i9 = 1;
        this.f16022h.a(new androidx.lifecycle.InterfaceC1538u(this) { // from class: c.d

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p019c.k f18033i;

            {
                this.f18033i = this;
            }

            @Override // androidx.lifecycle.InterfaceC1538u
            public final void b(androidx.lifecycle.InterfaceC1540w interfaceC1540w, androidx.lifecycle.EnumC1532n enumC1532n) {
                android.view.Window window;
                android.view.View viewPeekDecorView;
                switch (i9) {
                    case 0:
                        if (enumC1532n == androidx.lifecycle.EnumC1532n.ON_STOP && (window = this.f18033i.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        p019c.k kVar = this.f18033i;
                        if (enumC1532n == androidx.lifecycle.EnumC1532n.ON_DESTROY) {
                            kVar.f18050i.f21315b = null;
                            if (!kVar.isChangingConfigurations()) {
                                kVar.e().a();
                            }
                            p019c.h hVar = kVar.f18053m;
                            p019c.k kVar2 = hVar.f18039k;
                            kVar2.getWindow().getDecorView().removeCallbacks(hVar);
                            kVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(hVar);
                        }
                        break;
                }
            }
        });
        this.f16022h.a(new p165t2.b(2, this));
        fVar.O0();
        androidx.lifecycle.X.c(this);
        ((p079i7.f) fVar.j).R0("android:support:activity-result", new R0.C0849t0(3, this));
        j(new Y1.p(this, 1));
        this.y = com.google.common.util.concurrent.D.B(new p019c.j(this, 0));
        this.f18065z = com.google.common.util.concurrent.D.B(new p019c.j(this, 3));
    }

    @Override // p019c.v
    public final p019c.u a() {
        return (p019c.u) this.f18065z.getValue();
    }

    @Override // android.app.Activity
    public final void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        k();
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        this.f18053m.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.InterfaceC1528j
    public androidx.lifecycle.g0 c() {
        return (androidx.lifecycle.g0) this.y.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC1528j
    public final p040e2.d d() {
        p040e2.d dVar = new p040e2.d(0);
        android.app.Application application = getApplication();
        java.util.LinkedHashMap linkedHashMap = dVar.f21365a;
        if (application != null) {
            V1.b bVar = androidx.lifecycle.f0.f16355d;
            android.app.Application application2 = getApplication();
            kotlin.jvm.internal.m.d(application2, "application");
            linkedHashMap.put(bVar, application2);
        }
        linkedHashMap.put(androidx.lifecycle.X.f16322a, this);
        linkedHashMap.put(androidx.lifecycle.X.f16323b, this);
        android.content.Intent intent = getIntent();
        android.os.Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(androidx.lifecycle.X.f16324c, extras);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.k0
    public final androidx.lifecycle.j0 e() {
        if (getApplication() == null) {
            throw new java.lang.IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f18052l == null) {
            p019c.g gVar = (p019c.g) getLastNonConfigurationInstance();
            if (gVar != null) {
                this.f18052l = gVar.f18036a;
            }
            if (this.f18052l == null) {
                this.f18052l = new androidx.lifecycle.j0();
            }
        }
        androidx.lifecycle.j0 j0Var = this.f18052l;
        kotlin.jvm.internal.m.b(j0Var);
        return j0Var;
    }

    @Override // p165t2.e
    public final p079i7.f g() {
        return (p079i7.f) this.f18051k.j;
    }

    @Override // androidx.lifecycle.InterfaceC1540w
    public final androidx.lifecycle.AbstractC1534p getLifecycle() {
        return this.f16022h;
    }

    public final void i(C1.a listener) {
        kotlin.jvm.internal.m.e(listener, "listener");
        this.f18057q.add(listener);
    }

    public final void j(p037e.b bVar) {
        p037e.a aVar = this.f18050i;
        aVar.getClass();
        p019c.k kVar = aVar.f21315b;
        if (kVar != null) {
            bVar.a(kVar);
        }
        aVar.f21314a.add(bVar);
    }

    public final void k() {
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        androidx.lifecycle.X.i(decorView, this);
        android.view.View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView2, "window.decorView");
        decorView2.setTag(com.kiptv.tv.R.id.view_tree_view_model_store_owner, this);
        android.view.View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView3, "window.decorView");
        com.google.common.util.concurrent.AbstractC1903s.H(decorView3, this);
        android.view.View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView4, "window.decorView");
        decorView4.setTag(com.kiptv.tv.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        android.view.View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView5, "window.decorView");
        decorView5.setTag(com.kiptv.tv.R.id.report_drawn, this);
    }

    public final p046f.g l(final com.google.crypto.tink.shaded.protobuf.AbstractC1911f abstractC1911f, final p046f.b bVar) {
        final p019c.i registry = this.f18056p;
        kotlin.jvm.internal.m.e(registry, "registry");
        final java.lang.String key = "activity_rq#" + this.f18055o.getAndIncrement();
        kotlin.jvm.internal.m.e(key, "key");
        androidx.lifecycle.C1542y c1542y = this.f16022h;
        if (c1542y.f16379d.compareTo(androidx.lifecycle.EnumC1533o.f16366k) >= 0) {
            throw new java.lang.IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + c1542y.f16379d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        registry.d(key);
        java.util.LinkedHashMap linkedHashMap = registry.f18042c;
        p046f.e eVar = (p046f.e) linkedHashMap.get(key);
        if (eVar == null) {
            eVar = new p046f.e(c1542y);
        }
        androidx.lifecycle.InterfaceC1538u interfaceC1538u = new androidx.lifecycle.InterfaceC1538u() { // from class: f.c
            @Override // androidx.lifecycle.InterfaceC1538u
            public final void b(androidx.lifecycle.InterfaceC1540w interfaceC1540w, androidx.lifecycle.EnumC1532n enumC1532n) {
                androidx.lifecycle.EnumC1532n enumC1532n2 = androidx.lifecycle.EnumC1532n.ON_START;
                java.lang.String str = key;
                p019c.i iVar = registry;
                if (enumC1532n2 != enumC1532n) {
                    if (androidx.lifecycle.EnumC1532n.ON_STOP == enumC1532n) {
                        iVar.f18044e.remove(str);
                        return;
                    } else {
                        if (androidx.lifecycle.EnumC1532n.ON_DESTROY == enumC1532n) {
                            iVar.e(str);
                            return;
                        }
                        return;
                    }
                }
                java.util.LinkedHashMap linkedHashMap2 = iVar.f18044e;
                p046f.b bVar2 = bVar;
                com.google.crypto.tink.shaded.protobuf.AbstractC1911f abstractC1911f2 = abstractC1911f;
                linkedHashMap2.put(str, new p046f.d(abstractC1911f2, bVar2));
                java.util.LinkedHashMap linkedHashMap3 = iVar.f18045f;
                if (linkedHashMap3.containsKey(str)) {
                    java.lang.Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    bVar2.d(obj);
                }
                android.os.Bundle bundle = iVar.g;
                p046f.a aVar = (p046f.a) com.google.crypto.tink.shaded.protobuf.q0.x(str, bundle);
                if (aVar != null) {
                    bundle.remove(str);
                    bVar2.d(abstractC1911f2.B(aVar.f21607i, aVar.f21606h));
                }
            }
        };
        eVar.f21613a.a(interfaceC1538u);
        eVar.f21614b.add(interfaceC1538u);
        linkedHashMap.put(key, eVar);
        return new p046f.g(registry, key, abstractC1911f, 0);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i3, int i9, android.content.Intent intent) {
        if (this.f18056p.a(i3, i9, intent)) {
            return;
        }
        super.onActivityResult(i3, i9, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.m.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        java.util.Iterator it = this.f18057q.iterator();
        while (it.hasNext()) {
            ((C1.a) it.next()).accept(newConfig);
        }
    }

    @Override // androidx.core.app.AbstractActivityC1484d, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f18051k.P0(bundle);
        p037e.a aVar = this.f18050i;
        aVar.getClass();
        aVar.f21315b = this;
        java.util.Iterator it = aVar.f21314a.iterator();
        while (it.hasNext()) {
            ((p037e.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i3 = androidx.lifecycle.T.f16316i;
        androidx.lifecycle.Q.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i3, android.view.Menu menu) {
        kotlin.jvm.internal.m.e(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i3, menu);
        getMenuInflater();
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.j.j).iterator();
        while (it.hasNext()) {
            ((Y1.w) it.next()).f11351a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i3, android.view.MenuItem item) {
        kotlin.jvm.internal.m.e(item, "item");
        if (super.onMenuItemSelected(i3, item)) {
            return true;
        }
        if (i3 == 0) {
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.j.j).iterator();
            while (it.hasNext()) {
                if (((Y1.w) it.next()).f11351a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z6) {
        if (this.f18063w) {
            return;
        }
        java.util.Iterator it = this.f18060t.iterator();
        while (it.hasNext()) {
            ((C1.a) it.next()).accept(new androidx.core.app.C1486f(z6));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.onNewIntent(intent);
        java.util.Iterator it = this.f18059s.iterator();
        while (it.hasNext()) {
            ((C1.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i3, android.view.Menu menu) {
        kotlin.jvm.internal.m.e(menu, "menu");
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.j.j).iterator();
        while (it.hasNext()) {
            ((Y1.w) it.next()).f11351a.p();
        }
        super.onPanelClosed(i3, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z6) {
        if (this.f18064x) {
            return;
        }
        java.util.Iterator it = this.f18061u.iterator();
        while (it.hasNext()) {
            ((C1.a) it.next()).accept(new androidx.core.app.L(z6));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i3, android.view.View view, android.view.Menu menu) {
        kotlin.jvm.internal.m.e(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onPreparePanel(i3, view, menu);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.j.j).iterator();
        while (it.hasNext()) {
            ((Y1.w) it.next()).f11351a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i3, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.m.e(permissions, "permissions");
        kotlin.jvm.internal.m.e(grantResults, "grantResults");
        if (this.f18056p.a(i3, -1, new android.content.Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i3, permissions, grantResults);
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
        p019c.g gVar;
        androidx.lifecycle.j0 j0Var = this.f18052l;
        if (j0Var == null && (gVar = (p019c.g) getLastNonConfigurationInstance()) != null) {
            j0Var = gVar.f18036a;
        }
        if (j0Var == null) {
            return null;
        }
        p019c.g gVar2 = new p019c.g();
        gVar2.f18036a = j0Var;
        return gVar2;
    }

    @Override // androidx.core.app.AbstractActivityC1484d, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.m.e(outState, "outState");
        androidx.lifecycle.C1542y c1542y = this.f16022h;
        if (c1542y != null) {
            c1542y.g(androidx.lifecycle.EnumC1533o.j);
        }
        super.onSaveInstanceState(outState);
        this.f18051k.Q0(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        java.util.Iterator it = this.f18058r.iterator();
        while (it.hasNext()) {
            ((C1.a) it.next()).accept(java.lang.Integer.valueOf(i3));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        java.util.Iterator it = this.f18062v.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (com.google.android.gms.internal.play_billing.AbstractC1833d1.C()) {
                com.google.android.gms.internal.play_billing.AbstractC1833d1.h("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            p019c.m mVar = (p019c.m) this.f18054n.getValue();
            synchronized (mVar.f18069b) {
                try {
                    mVar.f18070c = true;
                    java.util.Iterator it = mVar.f18071d.iterator();
                    while (it.hasNext()) {
                        ((kotlin.jvm.functions.Function0) it.next()).invoke();
                    }
                    mVar.f18071d.clear();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th2) {
            android.os.Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i3) {
        k();
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        this.f18053m.a(decorView);
        super.setContentView(i3);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(android.content.Intent intent, int i3) {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.startActivityForResult(intent, i3);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(android.content.IntentSender intent, int i3, android.content.Intent intent2, int i9, int i10, int i11) throws android.content.IntentSender.SendIntentException {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.startIntentSenderForResult(intent, i3, intent2, i9, i10, i11);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(android.content.Intent intent, int i3, android.os.Bundle bundle) {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.startActivityForResult(intent, i3, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(android.content.IntentSender intent, int i3, android.content.Intent intent2, int i9, int i10, int i11, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.startIntentSenderForResult(intent, i3, intent2, i9, i10, i11, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z6, android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.m.e(newConfig, "newConfig");
        this.f18063w = true;
        try {
            super.onMultiWindowModeChanged(z6, newConfig);
            this.f18063w = false;
            java.util.Iterator it = this.f18060t.iterator();
            while (it.hasNext()) {
                ((C1.a) it.next()).accept(new androidx.core.app.C1486f(z6));
            }
        } catch (java.lang.Throwable th) {
            this.f18063w = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z6, android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.m.e(newConfig, "newConfig");
        this.f18064x = true;
        try {
            super.onPictureInPictureModeChanged(z6, newConfig);
            this.f18064x = false;
            java.util.Iterator it = this.f18061u.iterator();
            while (it.hasNext()) {
                ((C1.a) it.next()).accept(new androidx.core.app.L(z6));
            }
        } catch (java.lang.Throwable th) {
            this.f18064x = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View view) {
        k();
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        this.f18053m.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        k();
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        this.f18053m.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
