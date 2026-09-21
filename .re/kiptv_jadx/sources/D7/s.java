package D7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final D7.q f2494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final D7.o f2495i;
    public static final D7.r j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final D7.p f2496k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ D7.s[] f2497l;

    static {
        D7.q qVar = new D7.q();
        f2494h = qVar;
        D7.o oVar = new D7.o();
        f2495i = oVar;
        D7.r rVar = new D7.r();
        j = rVar;
        D7.p pVar = new D7.p();
        f2496k = pVar;
        D7.s[] sVarArr = {qVar, oVar, rVar, pVar};
        f2497l = sVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(sVarArr);
    }

    public static D7.s b(C7.a0 a0Var) {
        kotlin.jvm.internal.m.e(a0Var, "<this>");
        if (a0Var.v0()) {
            return f2495i;
        }
        if (a0Var instanceof C7.C0181m) {
        }
        return C7.AbstractC0171c.g(D7.g.l(false, null, 24), C7.AbstractC0171c.l(a0Var), C7.K.f1549b) ? f2496k : j;
    }

    public static D7.s valueOf(java.lang.String str) {
        return (D7.s) java.lang.Enum.valueOf(D7.s.class, str);
    }

    public static D7.s[] values() {
        return (D7.s[]) f2497l.clone();
    }

    public abstract D7.s a(C7.a0 a0Var);
}
