package Y1;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1534p;
import androidx.lifecycle.C1542y;
import androidx.lifecycle.EnumC1533o;
import androidx.lifecycle.InterfaceC1528j;
import androidx.lifecycle.InterfaceC1540w;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p077i5.C2237d;

public abstract class AbstractComponentCallbacksC1029n implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1540w, k0, InterfaceC1528j, p165t2.e {

    public static final Object f11294Y = new Object();

    public AbstractComponentCallbacksC1029n f11296B;

    public int f11297C;

    public int f11298D;

    public String f11299E;

    public boolean f11300F;

    public boolean f11301G;
    public boolean H;

    public boolean f11303J;

    public ViewGroup f11304K;

    public boolean f11305L;

    public C1028m f11307N;

    public boolean f11308O;

    public boolean f11309P;

    public String f11310Q;

    public EnumC1533o f11311R;

    public C1542y f11312S;

    public final androidx.lifecycle.G f11313T;

    public a0 f11314U;
    public p079i7.f V;
    public final ArrayList W;
    public final C1026k X;

    public Bundle f11316i;
    public SparseArray j;

    public Bundle f11317k;

    public Bundle f11319m;

    public AbstractComponentCallbacksC1029n f11320n;

    public int f11322p;

    public boolean f11324r;

    public boolean f11325s;

    public boolean f11326t;

    public boolean f11327u;

    public boolean f11328v;

    public boolean f11329w;

    public int f11330x;
    public D y;

    public q f11331z;

    public int f11315h = -1;

    public String f11318l = UUID.randomUUID().toString();

    public String f11321o = null;

    public Boolean f11323q = null;

    public D f11295A = new D();

    public final boolean f11302I = true;

    public boolean f11306M = true;

    public AbstractComponentCallbacksC1029n() {
        new B3.r(7, this);
        this.f11311R = EnumC1533o.f16367l;
        this.f11313T = new androidx.lifecycle.G();
        new AtomicInteger();
        this.W = new ArrayList();
        this.X = new C1026k(this);
        o();
    }

    public void A() {
        this.f11303J = true;
    }

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D();

    public void E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f11295A.M();
        this.f11329w = true;
        e();
    }

    public final Context F() {
        q qVar = this.f11331z;
        SignInHubActivity signInHubActivity = qVar == null ? null : qVar.f11337s;
        if (signInHubActivity != null) {
            return signInHubActivity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
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

    @Override
    public final g0 c() {
        Application application;
        if (this.y == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f11314U == null) {
            Context applicationContext = F().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && D.G(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + F().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f11314U = new a0(application, this, this.f11319m);
        }
        return this.f11314U;
    }

    @Override
    public final p040e2.d d() {
        Application application;
        Context applicationContext = F().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && D.G(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + F().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        p040e2.d dVar = new p040e2.d(0);
        LinkedHashMap linkedHashMap = dVar.f21365a;
        if (application != null) {
            linkedHashMap.put(f0.f16355d, application);
        }
        linkedHashMap.put(X.f16322a, this);
        linkedHashMap.put(X.f16323b, this);
        Bundle bundle = this.f11319m;
        if (bundle != null) {
            linkedHashMap.put(X.f16324c, bundle);
        }
        return dVar;
    }

    @Override
    public final j0 e() {
        if (this.y == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        int iM = m();
        EnumC1533o enumC1533o = EnumC1533o.f16364h;
        if (iM == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.y.f11164L.f11200d;
        j0 j0Var = (j0) map.get(this.f11318l);
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0();
        map.put(this.f11318l, j0Var2);
        return j0Var2;
    }

    @Override
    public final p079i7.f g() {
        return (p079i7.f) this.V.j;
    }

    @Override
    public final AbstractC1534p getLifecycle() {
        return this.f11312S;
    }

    public E8.l i() {
        return new C1027l(this);
    }

    public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f11297C));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f11298D));
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
        AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029nW = this.f11320n;
        if (abstractComponentCallbacksC1029nW == null) {
            D d4 = this.y;
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
        C1028m c1028m = this.f11307N;
        printWriter.println(c1028m == null ? false : c1028m.f11286a);
        C1028m c1028m2 = this.f11307N;
        if ((c1028m2 == null ? 0 : c1028m2.f11287b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            C1028m c1028m3 = this.f11307N;
            printWriter.println(c1028m3 == null ? 0 : c1028m3.f11287b);
        }
        C1028m c1028m4 = this.f11307N;
        if ((c1028m4 == null ? 0 : c1028m4.f11288c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            C1028m c1028m5 = this.f11307N;
            printWriter.println(c1028m5 == null ? 0 : c1028m5.f11288c);
        }
        C1028m c1028m6 = this.f11307N;
        if ((c1028m6 == null ? 0 : c1028m6.f11289d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            C1028m c1028m7 = this.f11307N;
            printWriter.println(c1028m7 == null ? 0 : c1028m7.f11289d);
        }
        C1028m c1028m8 = this.f11307N;
        if ((c1028m8 == null ? 0 : c1028m8.f11290e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            C1028m c1028m9 = this.f11307N;
            printWriter.println(c1028m9 != null ? c1028m9.f11290e : 0);
        }
        if (this.f11304K != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f11304K);
        }
        q qVar = this.f11331z;
        if ((qVar != null ? qVar.f11337s : null) != null) {
            new S2.a(this, e()).y(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f11295A + ":");
        this.f11295A.v(p121o0.p.o(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final C1028m k() {
        if (this.f11307N == null) {
            C1028m c1028m = new C1028m();
            Object obj = f11294Y;
            c1028m.f11291f = obj;
            c1028m.g = obj;
            c1028m.f11292h = obj;
            c1028m.f11293i = null;
            this.f11307N = c1028m;
        }
        return this.f11307N;
    }

    public final D l() {
        if (this.f11331z != null) {
            return this.f11295A;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final int m() {
        EnumC1533o enumC1533o = this.f11311R;
        return (enumC1533o == EnumC1533o.f16365i || this.f11296B == null) ? enumC1533o.ordinal() : Math.min(enumC1533o.ordinal(), this.f11296B.m());
    }

    public final D n() {
        D d4 = this.y;
        if (d4 != null) {
            return d4;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void o() {
        this.f11312S = new C1542y(this);
        this.V = new p079i7.f(new p177v2.a(this, new C2237d(23, this)));
        this.f11314U = null;
        ArrayList arrayList = this.W;
        C1026k c1026k = this.X;
        if (arrayList.contains(c1026k)) {
            return;
        }
        if (this.f11315h < 0) {
            arrayList.add(c1026k);
            return;
        }
        AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = c1026k.f11284a;
        abstractComponentCallbacksC1029n.V.O0();
        X.c(abstractComponentCallbacksC1029n);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        this.f11303J = true;
    }

    @Override
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        q qVar = this.f11331z;
        SignInHubActivity signInHubActivity = qVar == null ? null : qVar.f11336r;
        if (signInHubActivity != null) {
            signInHubActivity.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override
    public final void onLowMemory() {
        this.f11303J = true;
    }

    public final void p() {
        o();
        this.f11310Q = this.f11318l;
        this.f11318l = UUID.randomUUID().toString();
        this.f11324r = false;
        this.f11325s = false;
        this.f11326t = false;
        this.f11327u = false;
        this.f11328v = false;
        this.f11330x = 0;
        this.y = null;
        this.f11295A = new D();
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
        D d4 = this.y;
        if (d4 != null) {
            AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = this.f11296B;
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

    public final void startActivityForResult(Intent intent, int i3) {
        if (this.f11331z == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        D dN = n();
        if (dN.f11188z == null) {
            q qVar = dN.f11183t;
            if (i3 == -1) {
                qVar.f11337s.startActivity(intent, null);
                return;
            } else {
                qVar.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
        String str = this.f11318l;
        A a2 = new A();
        a2.f11150h = str;
        a2.f11151i = i3;
        dN.f11156C.addLast(a2);
        dN.f11188z.F(intent);
    }

    public void t(int i3, int i9, Intent intent) {
        if (D.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i3 + " resultCode: " + i9 + " data: " + intent);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f11318l);
        if (this.f11297C != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f11297C));
        }
        if (this.f11299E != null) {
            sb.append(" tag=");
            sb.append(this.f11299E);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(SignInHubActivity signInHubActivity) {
        this.f11303J = true;
        q qVar = this.f11331z;
        if ((qVar == null ? null : qVar.f11336r) != null) {
            this.f11303J = true;
        }
    }

    public abstract void v(Bundle bundle);

    public void w() {
        this.f11303J = true;
    }

    public void x() {
        this.f11303J = true;
    }

    public void y() {
        this.f11303J = true;
    }

    public LayoutInflater z(Bundle bundle) {
        q qVar = this.f11331z;
        if (qVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        SignInHubActivity signInHubActivity = qVar.f11340v;
        LayoutInflater layoutInflaterCloneInContext = signInHubActivity.getLayoutInflater().cloneInContext(signInHubActivity);
        layoutInflaterCloneInContext.setFactory2(this.f11295A.f11171f);
        return layoutInflaterCloneInContext;
    }
}
