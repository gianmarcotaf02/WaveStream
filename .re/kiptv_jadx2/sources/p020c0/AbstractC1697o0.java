package p020c0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import p194x6.j;

public abstract class AbstractC1697o0 {

    public final U f18296a;

    public AbstractC1697o0(Function0 function0) {
        this.f18296a = new U(function0);
    }

    public abstract C1699p0 a(Object obj);

    public h1 b() {
        return this.f18296a;
    }

    public final h1 c(C1699p0 c1699p0, h1 h1Var) {
        J j;
        h1 h1Var2 = null;
        h1Var2 = null;
        h1Var2 = null;
        h1Var2 = null;
        h1Var2 = null;
        h1Var2 = null;
        if (h1Var instanceof J) {
            if (c1699p0.f18300b) {
                j = (J) h1Var;
                j.f18121a.setValue(c1699p0.c());
            }
        } else if (h1Var instanceof g1) {
            if ((c1699p0.f18299a || c1699p0.f18304f != null) && !c1699p0.f18300b) {
                g1 g1Var = (g1) h1Var;
                if (m.a(c1699p0.c(), g1Var.f18248a)) {
                    h1Var2 = g1Var;
                }
            }
        } else if (h1Var instanceof D) {
            c1699p0.getClass();
            j jVar = ((D) h1Var).f18103a;
        }
        if (h1Var2 != null) {
            h1Var2 = j;
            return h1Var2;
        }
        if (!c1699p0.f18300b) {
            h1Var2 = j;
            return new g1(c1699p0.c());
        }
        S0 s9 = (S0) c1699p0.f18303e;
        if (s9 == null) {
            h1Var2 = j;
            s9 = C1676e.f18243n;
        }
        h1Var2 = j;
        return new J(new C1681g0(c1699p0.f18304f, s9));
    }
}
