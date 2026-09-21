package p019c;

import E1.e;
import E5.C0313s0;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1534p;
import androidx.lifecycle.C1542y;
import androidx.lifecycle.EnumC1533o;
import androidx.lifecycle.InterfaceC1540w;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.m;
import p078i6.l;

public final class u {

    public final Runnable f18090a;

    public final l f18091b = new l();

    public n f18092c;

    public final OnBackInvokedCallback f18093d;

    public OnBackInvokedDispatcher f18094e;

    public boolean f18095f;
    public boolean g;

    public u(Runnable runnable) {
        this.f18090a = runnable;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            this.f18093d = i3 >= 34 ? new r(new o(this, 0), new o(this, 1), new p(this, 0), new p(this, 1)) : new q(0, new p(this, 2));
        }
    }

    public final void a(InterfaceC1540w owner, n onBackPressedCallback) {
        m.e(owner, "owner");
        m.e(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1534p lifecycle = owner.getLifecycle();
        if (((C1542y) lifecycle).f16379d == EnumC1533o.f16364h) {
            return;
        }
        onBackPressedCallback.f18073b.add(new s(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.f18074c = new C0313s0(0, this, u.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 9);
    }

    public final void b() {
        Object objPrevious;
        n nVar = this.f18092c;
        if (nVar == null) {
            l lVar = this.f18091b;
            ListIterator<E> listIterator = lVar.listIterator(lVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((n) objPrevious).f18072a);
            nVar = (n) objPrevious;
        }
        this.f18092c = null;
        if (nVar != null) {
            nVar.a();
        }
    }

    public final void c() {
        Object objPrevious;
        n nVar = this.f18092c;
        if (nVar == null) {
            l lVar = this.f18091b;
            ListIterator listIterator = lVar.listIterator(lVar.d());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((n) objPrevious).f18072a);
            nVar = (n) objPrevious;
        }
        this.f18092c = null;
        if (nVar != null) {
            nVar.b();
        } else {
            this.f18090a.run();
        }
    }

    public final void d(boolean z6) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f18094e;
        OnBackInvokedCallback onBackInvokedCallback = this.f18093d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z6 && !this.f18095f) {
            e.h(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f18095f = true;
        } else {
            if (z6 || !this.f18095f) {
                return;
            }
            e.i(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f18095f = false;
        }
    }

    public final void e() {
        boolean z6 = this.g;
        boolean z9 = false;
        l lVar = this.f18091b;
        if (lVar == null || !lVar.isEmpty()) {
            Iterator it = lVar.iterator();
            while (it.hasNext()) {
                if (((n) it.next()).f18072a) {
                    z9 = true;
                    break;
                }
            }
        }
        this.g = z9;
        if (z9 == z6 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z9);
    }
}
