package p138q1;

/* JADX INFO: loaded from: classes.dex */
public final class t extends p137q0.o implements p175v0.w, android.view.ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public android.view.View f26567v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public android.view.ViewTreeObserver f26568w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p138q1.s f26569x = new p138q1.s(this, 0);
    public final p138q1.s y = new p138q1.s(this, 1);

    @Override // p137q0.o
    public final void F0() {
        android.view.ViewTreeObserver viewTreeObserver = Q0.AbstractC0777k.v(this).getViewTreeObserver();
        this.f26568w = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // p137q0.o
    public final void G0() {
        android.view.ViewTreeObserver viewTreeObserver = this.f26568w;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f26568w = null;
        Q0.AbstractC0777k.v(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f26567v = null;
    }

    public final p175v0.F N0() {
        if (!this.f26475h.f26487u) {
            N0.a.b("visitLocalDescendants called on an unattached node");
        }
        p137q0.o oVar = this.f26475h;
        if ((oVar.f26477k & 1024) != 0) {
            boolean z6 = false;
            for (p137q0.o oVar2 = oVar.f26479m; oVar2 != null; oVar2 = oVar2.f26479m) {
                if ((oVar2.j & 1024) != 0) {
                    p137q0.o oVarE = oVar2;
                    p038e0.e eVar = null;
                    while (oVarE != null) {
                        if (oVarE instanceof p175v0.F) {
                            p175v0.F f9 = (p175v0.F) oVarE;
                            if (z6) {
                                return f9;
                            }
                            z6 = true;
                        } else if ((oVarE.j & 1024) != 0 && (oVarE instanceof Q0.AbstractC0776j)) {
                            int i3 = 0;
                            for (p137q0.o oVar3 = ((Q0.AbstractC0776j) oVarE).f8443w; oVar3 != null; oVar3 = oVar3.f26479m) {
                                if ((oVar3.j & 1024) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        oVarE = oVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new p038e0.e(new p137q0.o[16]);
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
                        oVarE = Q0.AbstractC0777k.e(eVar);
                    }
                }
            }
        }
        throw new java.lang.IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(android.view.View view, android.view.View view2) {
        boolean z6;
        if (Q0.AbstractC0777k.t(this).f8254v == null) {
            return;
        }
        android.view.View viewC = p138q1.k.c(this);
        p175v0.n focusOwner = Q0.AbstractC0777k.u(this).getFocusOwner();
        Q0.o0 o0VarU = Q0.AbstractC0777k.u(this);
        boolean z9 = true;
        if (view != null && !view.equals(o0VarU)) {
            android.view.ViewParent parent = view.getParent();
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
            android.view.ViewParent parent2 = view2.getParent();
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
            p175v0.F fN0 = N0();
            if (fN0.S0().a()) {
                return;
            }
            p175v0.AbstractC2909d.y(fN0);
            return;
        }
        if (!z6) {
            this.f26567v = null;
            return;
        }
        this.f26567v = null;
        if (N0().S0().b()) {
            ((p175v0.p) focusOwner).b(8, false, false);
        }
    }

    @Override // p175v0.w
    public final void p(p175v0.r rVar) {
        rVar.e(false);
        rVar.c(this.f26569x);
        rVar.a(this.y);
    }
}
