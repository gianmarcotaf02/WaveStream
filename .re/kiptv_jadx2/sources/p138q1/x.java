package p138q1;

import android.view.View;
import p137q0.o;
import p175v0.j;
import p175v0.r;
import p175v0.w;

public final class x extends o implements w {
    @Override
    public final void p(r rVar) {
        View viewC = k.c(this);
        rVar.e(this.f26475h.f26487u && k.c(this).hasFocusable());
        View viewFindFocus = viewC.findFocus();
        if (viewFindFocus != null) {
            rVar.f(j.a(viewFindFocus, viewC));
        }
    }
}
