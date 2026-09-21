package p138q1;

/* JADX INFO: loaded from: classes.dex */
public final class x extends p137q0.o implements p175v0.w {
    @Override // p175v0.w
    public final void p(p175v0.r rVar) {
        android.view.View viewC = p138q1.k.c(this);
        rVar.e(this.f26475h.f26487u && p138q1.k.c(this).hasFocusable());
        android.view.View viewFindFocus = viewC.findFocus();
        if (viewFindFocus != null) {
            rVar.f(p175v0.j.a(viewFindFocus, viewC));
        }
    }
}
