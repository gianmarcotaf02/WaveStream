package J;

import R0.C0845r0;
import R0.P0;

public final class U {

    public final P0 f5710a;

    public V f5711b;

    public p175v0.n f5712c;

    public U(P0 p2) {
        this.f5710a = p2;
    }

    public final V a() {
        V v6 = this.f5711b;
        if (v6 != null) {
            return v6;
        }
        kotlin.jvm.internal.m.k("keyboardActions");
        throw null;
    }

    public final boolean b(int i3) {
        p194x6.j jVar;
        P0 p2;
        if (i3 == 7) {
            jVar = a().f5714a;
        } else {
            if (i3 == 2 || i3 == 6 || i3 == 5 || i3 == 3 || i3 == 4) {
                a();
            } else if (i3 != 1 && i3 != 0) {
                throw new IllegalStateException("invalid ImeAction");
            }
            jVar = null;
        }
        if (jVar != null) {
            jVar.invoke(this);
            return true;
        }
        if (i3 == 6) {
            p175v0.n nVar = this.f5712c;
            if (nVar != null) {
                ((p175v0.p) nVar).g(1, true);
                return true;
            }
            kotlin.jvm.internal.m.k("focusManager");
            throw null;
        }
        if (i3 != 5) {
            if (i3 != 7 || (p2 = this.f5710a) == null) {
                return false;
            }
            ((C0845r0) p2).a();
            return true;
        }
        p175v0.n nVar2 = this.f5712c;
        if (nVar2 != null) {
            ((p175v0.p) nVar2).g(2, true);
            return true;
        }
        kotlin.jvm.internal.m.k("focusManager");
        throw null;
    }
}
