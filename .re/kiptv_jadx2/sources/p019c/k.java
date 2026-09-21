package p019c;

import R0.C0849t0;
import Y1.w;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.support.v4.media.session.q;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.app.AbstractActivityC1484d;
import androidx.core.app.C1486f;
import androidx.core.app.L;
import androidx.lifecycle.AbstractC1534p;
import androidx.lifecycle.C1542y;
import androidx.lifecycle.EnumC1532n;
import androidx.lifecycle.EnumC1533o;
import androidx.lifecycle.InterfaceC1528j;
import androidx.lifecycle.InterfaceC1538u;
import androidx.lifecycle.InterfaceC1540w;
import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import androidx.lifecycle.X;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.common.util.concurrent.AbstractC1903s;
import com.google.common.util.concurrent.D;
import com.google.crypto.tink.shaded.protobuf.AbstractC1911f;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.kiptv.tv.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import p019c.i;
import p037e.a;
import p040e2.d;
import p046f.g;
import p070h6.p;
import p077i5.C2237d;
import p079i7.f;
import p165t2.b;
import p165t2.e;

public abstract class k extends AbstractActivityC1484d implements k0, InterfaceC1528j, e, v {

    public static final int f18049A = 0;
    private static final f Companion = new f();

    public final a f18050i = new a();
    public final q j = new q(new c(this, 0));

    public final f f18051k;

    public j0 f18052l;

    public final h f18053m;

    public final p f18054n;

    public final AtomicInteger f18055o;

    public final i f18056p;

    public final CopyOnWriteArrayList f18057q;

    public final CopyOnWriteArrayList f18058r;

    public final CopyOnWriteArrayList f18059s;

    public final CopyOnWriteArrayList f18060t;

    public final CopyOnWriteArrayList f18061u;

    public final CopyOnWriteArrayList f18062v;

    public boolean f18063w;

    public boolean f18064x;
    public final p y;

    public final p f18065z;

    public k() {
        f fVar = new f(new p177v2.a(this, new C2237d(23, this)));
        this.f18051k = fVar;
        this.f18053m = new h(this);
        this.f18054n = D.B(new j(this, 2));
        this.f18055o = new AtomicInteger();
        this.f18056p = new i(this);
        this.f18057q = new CopyOnWriteArrayList();
        this.f18058r = new CopyOnWriteArrayList();
        this.f18059s = new CopyOnWriteArrayList();
        this.f18060t = new CopyOnWriteArrayList();
        this.f18061u = new CopyOnWriteArrayList();
        this.f18062v = new CopyOnWriteArrayList();
        C1542y c1542y = this.f16022h;
        if (c1542y == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i3 = 0;
        c1542y.a(new InterfaceC1538u(this) {

            public final k f18033i;

            {
                this.f18033i = this;
            }

            @Override
            public final void b(InterfaceC1540w interfaceC1540w, EnumC1532n enumC1532n) {
                Window window;
                View viewPeekDecorView;
                switch (i3) {
                    case 0:
                        if (enumC1532n == EnumC1532n.ON_STOP && (window = this.f18033i.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        k kVar = this.f18033i;
                        if (enumC1532n == EnumC1532n.ON_DESTROY) {
                            kVar.f18050i.f21315b = null;
                            if (!kVar.isChangingConfigurations()) {
                                kVar.e().a();
                            }
                            h hVar = kVar.f18053m;
                            k kVar2 = hVar.f18039k;
                            kVar2.getWindow().getDecorView().removeCallbacks(hVar);
                            kVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(hVar);
                        }
                        break;
                }
            }
        });
        final int i9 = 1;
        this.f16022h.a(new InterfaceC1538u(this) {

            public final k f18033i;

            {
                this.f18033i = this;
            }

            @Override
            public final void b(InterfaceC1540w interfaceC1540w, EnumC1532n enumC1532n) {
                Window window;
                View viewPeekDecorView;
                switch (i9) {
                    case 0:
                        if (enumC1532n == EnumC1532n.ON_STOP && (window = this.f18033i.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        k kVar = this.f18033i;
                        if (enumC1532n == EnumC1532n.ON_DESTROY) {
                            kVar.f18050i.f21315b = null;
                            if (!kVar.isChangingConfigurations()) {
                                kVar.e().a();
                            }
                            h hVar = kVar.f18053m;
                            k kVar2 = hVar.f18039k;
                            kVar2.getWindow().getDecorView().removeCallbacks(hVar);
                            kVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(hVar);
                        }
                        break;
                }
            }
        });
        this.f16022h.a(new b(2, this));
        fVar.O0();
        X.c(this);
        ((f) fVar.j).R0("android:support:activity-result", new C0849t0(3, this));
        j(new Y1.p(this, 1));
        this.y = D.B(new j(this, 0));
        this.f18065z = D.B(new j(this, 3));
    }

    @Override
    public final u a() {
        return (u) this.f18065z.getValue();
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        View decorView = getWindow().getDecorView();
        m.d(decorView, "window.decorView");
        this.f18053m.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override
    public g0 c() {
        return (g0) this.y.getValue();
    }

    @Override
    public final d d() {
        d dVar = new d(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dVar.f21365a;
        if (application != null) {
            V1.b bVar = f0.f16355d;
            Application application2 = getApplication();
            m.d(application2, "application");
            linkedHashMap.put(bVar, application2);
        }
        linkedHashMap.put(X.f16322a, this);
        linkedHashMap.put(X.f16323b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(X.f16324c, extras);
        }
        return dVar;
    }

    @Override
    public final j0 e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f18052l == null) {
            g gVar = (g) getLastNonConfigurationInstance();
            if (gVar != null) {
                this.f18052l = gVar.f18036a;
            }
            if (this.f18052l == null) {
                this.f18052l = new j0();
            }
        }
        j0 j0Var = this.f18052l;
        m.b(j0Var);
        return j0Var;
    }

    @Override
    public final f g() {
        return (f) this.f18051k.j;
    }

    @Override
    public final AbstractC1534p getLifecycle() {
        return this.f16022h;
    }

    public final void i(C1.a listener) {
        m.e(listener, "listener");
        this.f18057q.add(listener);
    }

    public final void j(p037e.b bVar) {
        a aVar = this.f18050i;
        aVar.getClass();
        k kVar = aVar.f21315b;
        if (kVar != null) {
            bVar.a(kVar);
        }
        aVar.f21314a.add(bVar);
    }

    public final void k() {
        View decorView = getWindow().getDecorView();
        m.d(decorView, "window.decorView");
        X.i(decorView, this);
        View decorView2 = getWindow().getDecorView();
        m.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        m.d(decorView3, "window.decorView");
        AbstractC1903s.H(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        m.d(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        m.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final g l(final AbstractC1911f abstractC1911f, final p046f.b bVar) {
        final i registry = this.f18056p;
        m.e(registry, "registry");
        final String key = "activity_rq#" + this.f18055o.getAndIncrement();
        m.e(key, "key");
        C1542y c1542y = this.f16022h;
        if (c1542y.f16379d.compareTo(EnumC1533o.f16366k) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + c1542y.f16379d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        registry.d(key);
        LinkedHashMap linkedHashMap = registry.f18042c;
        p046f.e eVar = (p046f.e) linkedHashMap.get(key);
        if (eVar == null) {
            eVar = new p046f.e(c1542y);
        }
        InterfaceC1538u interfaceC1538u = new InterfaceC1538u() {
            @Override
            public final void b(InterfaceC1540w interfaceC1540w, EnumC1532n enumC1532n) {
                EnumC1532n enumC1532n2 = EnumC1532n.ON_START;
                String str = key;
                i iVar = registry;
                if (enumC1532n2 != enumC1532n) {
                    if (EnumC1532n.ON_STOP == enumC1532n) {
                        iVar.f18044e.remove(str);
                        return;
                    } else {
                        if (EnumC1532n.ON_DESTROY == enumC1532n) {
                            iVar.e(str);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = iVar.f18044e;
                b bVar2 = bVar;
                AbstractC1911f abstractC1911f2 = abstractC1911f;
                linkedHashMap2.put(str, new d(abstractC1911f2, bVar2));
                LinkedHashMap linkedHashMap3 = iVar.f18045f;
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    bVar2.d(obj);
                }
                Bundle bundle = iVar.g;
                a aVar = (a) q0.x(str, bundle);
                if (aVar != null) {
                    bundle.remove(str);
                    bVar2.d(abstractC1911f2.B(aVar.f21607i, aVar.f21606h));
                }
            }
        };
        eVar.f21613a.a(interfaceC1538u);
        eVar.f21614b.add(interfaceC1538u);
        linkedHashMap.put(key, eVar);
        return new g(registry, key, abstractC1911f, 0);
    }

    @Override
    public void onActivityResult(int i3, int i9, Intent intent) {
        if (this.f18056p.a(i3, i9, intent)) {
            return;
        }
        super.onActivityResult(i3, i9, intent);
    }

    @Override
    public final void onBackPressed() {
        a().c();
    }

    @Override
    public final void onConfigurationChanged(Configuration newConfig) {
        m.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator it = this.f18057q.iterator();
        while (it.hasNext()) {
            ((C1.a) it.next()).accept(newConfig);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.f18051k.P0(bundle);
        a aVar = this.f18050i;
        aVar.getClass();
        aVar.f21315b = this;
        Iterator it = aVar.f21314a.iterator();
        while (it.hasNext()) {
            ((p037e.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i3 = T.f16316i;
        Q.b(this);
    }

    @Override
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        m.e(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i3, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.j.j).iterator();
        while (it.hasNext()) {
            ((w) it.next()).f11351a.j();
        }
        return true;
    }

    @Override
    public boolean onMenuItemSelected(int i3, MenuItem item) {
        m.e(item, "item");
        if (super.onMenuItemSelected(i3, item)) {
            return true;
        }
        if (i3 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.j.j).iterator();
            while (it.hasNext()) {
                if (((w) it.next()).f11351a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void onMultiWindowModeChanged(boolean z6) {
        if (this.f18063w) {
            return;
        }
        Iterator it = this.f18060t.iterator();
        while (it.hasNext()) {
            ((C1.a) it.next()).accept(new C1486f(z6));
        }
    }

    @Override
    public final void onNewIntent(Intent intent) {
        m.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f18059s.iterator();
        while (it.hasNext()) {
            ((C1.a) it.next()).accept(intent);
        }
    }

    @Override
    public final void onPanelClosed(int i3, Menu menu) {
        m.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.j.j).iterator();
        while (it.hasNext()) {
            ((w) it.next()).f11351a.p();
        }
        super.onPanelClosed(i3, menu);
    }

    @Override
    public final void onPictureInPictureModeChanged(boolean z6) {
        if (this.f18064x) {
            return;
        }
        Iterator it = this.f18061u.iterator();
        while (it.hasNext()) {
            ((C1.a) it.next()).accept(new L(z6));
        }
    }

    @Override
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        m.e(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onPreparePanel(i3, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.j.j).iterator();
        while (it.hasNext()) {
            ((w) it.next()).f11351a.s();
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int i3, String[] permissions, int[] grantResults) {
        m.e(permissions, "permissions");
        m.e(grantResults, "grantResults");
        if (this.f18056p.a(i3, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i3, permissions, grantResults);
    }

    @Override
    public final Object onRetainNonConfigurationInstance() {
        g gVar;
        j0 j0Var = this.f18052l;
        if (j0Var == null && (gVar = (g) getLastNonConfigurationInstance()) != null) {
            j0Var = gVar.f18036a;
        }
        if (j0Var == null) {
            return null;
        }
        g gVar2 = new g();
        gVar2.f18036a = j0Var;
        return gVar2;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        m.e(outState, "outState");
        C1542y c1542y = this.f16022h;
        if (c1542y != null) {
            c1542y.g(EnumC1533o.j);
        }
        super.onSaveInstanceState(outState);
        this.f18051k.Q0(outState);
    }

    @Override
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        Iterator it = this.f18058r.iterator();
        while (it.hasNext()) {
            ((C1.a) it.next()).accept(Integer.valueOf(i3));
        }
    }

    @Override
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f18062v.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override
    public final void reportFullyDrawn() {
        try {
            if (AbstractC1833d1.C()) {
                AbstractC1833d1.h("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            m mVar = (m) this.f18054n.getValue();
            synchronized (mVar.f18069b) {
                try {
                    mVar.f18070c = true;
                    Iterator it = mVar.f18071d.iterator();
                    while (it.hasNext()) {
                        ((Function0) it.next()).invoke();
                    }
                    mVar.f18071d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override
    public final void setContentView(int i3) {
        k();
        View decorView = getWindow().getDecorView();
        m.d(decorView, "window.decorView");
        this.f18053m.a(decorView);
        super.setContentView(i3);
    }

    @Override
    public final void startActivityForResult(Intent intent, int i3) {
        m.e(intent, "intent");
        super.startActivityForResult(intent, i3);
    }

    @Override
    public final void startIntentSenderForResult(IntentSender intent, int i3, Intent intent2, int i9, int i10, int i11) throws IntentSender.SendIntentException {
        m.e(intent, "intent");
        super.startIntentSenderForResult(intent, i3, intent2, i9, i10, i11);
    }

    @Override
    public final void startActivityForResult(Intent intent, int i3, Bundle bundle) {
        m.e(intent, "intent");
        super.startActivityForResult(intent, i3, bundle);
    }

    @Override
    public final void startIntentSenderForResult(IntentSender intent, int i3, Intent intent2, int i9, int i10, int i11, Bundle bundle) throws IntentSender.SendIntentException {
        m.e(intent, "intent");
        super.startIntentSenderForResult(intent, i3, intent2, i9, i10, i11, bundle);
    }

    @Override
    public final void onMultiWindowModeChanged(boolean z6, Configuration newConfig) {
        m.e(newConfig, "newConfig");
        this.f18063w = true;
        try {
            super.onMultiWindowModeChanged(z6, newConfig);
            this.f18063w = false;
            Iterator it = this.f18060t.iterator();
            while (it.hasNext()) {
                ((C1.a) it.next()).accept(new C1486f(z6));
            }
        } catch (Throwable th) {
            this.f18063w = false;
            throw th;
        }
    }

    @Override
    public final void onPictureInPictureModeChanged(boolean z6, Configuration newConfig) {
        m.e(newConfig, "newConfig");
        this.f18064x = true;
        try {
            super.onPictureInPictureModeChanged(z6, newConfig);
            this.f18064x = false;
            Iterator it = this.f18061u.iterator();
            while (it.hasNext()) {
                ((C1.a) it.next()).accept(new L(z6));
            }
        } catch (Throwable th) {
            this.f18064x = false;
            throw th;
        }
    }

    @Override
    public void setContentView(View view) {
        k();
        View decorView = getWindow().getDecorView();
        m.d(decorView, "window.decorView");
        this.f18053m.a(decorView);
        super.setContentView(view);
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        View decorView = getWindow().getDecorView();
        m.d(decorView, "window.decorView");
        this.f18053m.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
