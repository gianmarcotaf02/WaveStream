package p020c0;

/* JADX INFO: renamed from: c0.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1697o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p020c0.U f18296a;

    public AbstractC1697o0(kotlin.jvm.functions.Function0 function0) {
        this.f18296a = new p020c0.U(function0);
    }

    public abstract p020c0.C1699p0 a(java.lang.Object obj);

    public p020c0.h1 b() {
        return this.f18296a;
    }

    public final p020c0.h1 c(p020c0.C1699p0 c1699p0, p020c0.h1 h1Var) {
        p020c0.J j;
        p020c0.h1 h1Var2 = null;
        h1Var2 = null;
        h1Var2 = null;
        h1Var2 = null;
        h1Var2 = null;
        h1Var2 = null;
        if (h1Var instanceof p020c0.J) {
            if (c1699p0.f18300b) {
                j = (p020c0.J) h1Var;
                j.f18121a.setValue(c1699p0.c());
            }
        } else if (h1Var instanceof p020c0.g1) {
            if ((c1699p0.f18299a || c1699p0.f18304f != null) && !c1699p0.f18300b) {
                p020c0.g1 g1Var = (p020c0.g1) h1Var;
                if (kotlin.jvm.internal.m.a(c1699p0.c(), g1Var.f18248a)) {
                    h1Var2 = g1Var;
                }
            }
        } else if (h1Var instanceof p020c0.D) {
            c1699p0.getClass();
            p194x6.j jVar = ((p020c0.D) h1Var).f18103a;
        }
        if (h1Var2 != null) {
            h1Var2 = j;
            return h1Var2;
        }
        if (!c1699p0.f18300b) {
            h1Var2 = j;
            return new p020c0.g1(c1699p0.c());
        }
        p020c0.S0 s9 = (p020c0.S0) c1699p0.f18303e;
        if (s9 == null) {
            h1Var2 = j;
            s9 = p020c0.C1676e.f18243n;
        }
        h1Var2 = j;
        return new p020c0.J(new p020c0.C1681g0(c1699p0.f18304f, s9));
    }
}
