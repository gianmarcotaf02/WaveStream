package p138q1;

import N0.a;
import Q0.AbstractC0776j;
import Q0.AbstractC0777k;
import Q0.o0;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import p038e0.e;
import p137q0.o;
import p175v0.AbstractC2909d;
import p175v0.F;
import p175v0.n;
import p175v0.p;
import p175v0.r;
import p175v0.w;

public final class t extends o implements w, ViewTreeObserver.OnGlobalFocusChangeListener {

    public View f26567v;

    public ViewTreeObserver f26568w;

    public final s f26569x = new s(this, 0);
    public final s y = new s(this, 1);

    @Override
    public final void F0() {
        ViewTreeObserver viewTreeObserver = AbstractC0777k.v(this).getViewTreeObserver();
        this.f26568w = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override
    public final void G0() {
        ViewTreeObserver viewTreeObserver = this.f26568w;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f26568w = null;
        AbstractC0777k.v(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f26567v = null;
    }

    public final F N0() {
        if (!this.f26475h.f26487u) {
            a.b("visitLocalDescendants called on an unattached node");
        }
        o oVar = this.f26475h;
        if ((oVar.f26477k & 1024) != 0) {
            boolean z6 = false;
            for (o oVar2 = oVar.f26479m; oVar2 != null; oVar2 = oVar2.f26479m) {
                if ((oVar2.j & 1024) != 0) {
                    o oVarE = oVar2;
                    e eVar = null;
                    while (oVarE != null) {
                        if (oVarE instanceof F) {
                            F f9 = (F) oVarE;
                            if (z6) {
                                return f9;
                            }
                            z6 = true;
                        } else if ((oVarE.j & 1024) != 0 && (oVarE instanceof AbstractC0776j)) {
                            int i3 = 0;
                            for (o oVar3 = ((AbstractC0776j) oVarE).f8443w; oVar3 != null; oVar3 = oVar3.f26479m) {
                                if ((oVar3.j & 1024) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        oVarE = oVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new e(new o[16]);
                                        }
                                        if (oVarE != null) {
                                            eVar.c(oVarE);
                                            oVarE = null;
                                        }
                                        eVar.c(oVar3);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        oVarE = AbstractC0777k.e(eVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z6;
        if (AbstractC0777k.t(this).f8254v == null) {
            return;
        }
        View viewC = k.c(this);
        n focusOwner = AbstractC0777k.u(this).getFocusOwner();
        o0 o0VarU = AbstractC0777k.u(this);
        boolean z9 = true;
        if (view != null && !view.equals(o0VarU)) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    z6 = false;
                    break;
                } else {
                    if (parent == viewC.getParent()) {
                        z6 = true;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        } else {
            z6 = false;
            break;
        }
        if (view2 != null && !view2.equals(o0VarU)) {
            ViewParent parent2 = view2.getParent();
            while (true) {
                if (parent2 == null) {
                    z9 = false;
                    break;
                } else if (parent2 == viewC.getParent()) {
                    break;
                } else {
                    parent2 = parent2.getParent();
                }
            }
        } else {
            z9 = false;
            break;
        }
        if (z6 && z9) {
            this.f26567v = view2;
            return;
        }
        if (z9) {
            this.f26567v = view2;
            F fN0 = N0();
            if (fN0.S0().a()) {
                return;
            }
            AbstractC2909d.y(fN0);
            return;
        }
        if (!z6) {
            this.f26567v = null;
            return;
        }
        this.f26567v = null;
        if (N0().S0().b()) {
            ((p) focusOwner).b(8, false, false);
        }
    }

    @Override
    public final void p(r rVar) {
        rVar.e(false);
        rVar.c(this.f26569x);
        rVar.a(this.y);
    }
}
