package D7;

import C7.AbstractC0171c;
import C7.C0181m;
import C7.K;
import C7.a0;
import com.google.crypto.tink.shaded.protobuf.q0;

public abstract class s {

    public static final q f2494h;

    public static final o f2495i;
    public static final r j;

    public static final p f2496k;

    public static final s[] f2497l;

    static {
        q qVar = new q();
        f2494h = qVar;
        o oVar = new o();
        f2495i = oVar;
        r rVar = new r();
        j = rVar;
        p pVar = new p();
        f2496k = pVar;
        s[] sVarArr = {qVar, oVar, rVar, pVar};
        f2497l = sVarArr;
        q0.t(sVarArr);
    }

    public static s b(a0 a0Var) {
        kotlin.jvm.internal.m.e(a0Var, "<this>");
        if (a0Var.v0()) {
            return f2495i;
        }
        if (a0Var instanceof C0181m) {
        }
        return AbstractC0171c.g(g.l(false, null, 24), AbstractC0171c.l(a0Var), K.f1549b) ? f2496k : j;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f2497l.clone();
    }

    public abstract s a(a0 a0Var);
}
