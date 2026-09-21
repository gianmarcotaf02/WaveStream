package G;

import kotlin.jvm.internal.m;
import p137q0.o;

public final class e extends o {

    public c f3746v;

    @Override
    public final boolean C0() {
        return false;
    }

    @Override
    public final void F0() {
        c cVar = this.f3746v;
        if (cVar != null) {
            cVar.f3745a.l(this);
        }
        if (cVar != null) {
            cVar.f3745a.c(this);
        }
        this.f3746v = cVar;
    }

    @Override
    public final void G0() {
        c cVar = this.f3746v;
        if (cVar != null) {
            m.c(cVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            cVar.f3745a.l(this);
        }
    }
}
