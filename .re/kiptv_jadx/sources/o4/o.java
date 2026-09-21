package o4;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f26135a = 0;

    static {
        java.nio.charset.Charset.forName("UTF-8");
    }

    public static A4.k0 a(A4.g0 g0Var) {
        A4.h0 h0VarZ = A4.k0.z();
        int iB = g0Var.B();
        h0VarZ.e();
        A4.k0.w((A4.k0) h0VarZ.f19594i, iB);
        for (A4.f0 f0Var : g0Var.A()) {
            A4.i0 i0VarB = A4.j0.B();
            java.lang.String strB = f0Var.A().B();
            i0VarB.e();
            A4.j0.w((A4.j0) i0VarB.f19594i, strB);
            A4.Z zD = f0Var.D();
            i0VarB.e();
            A4.j0.y((A4.j0) i0VarB.f19594i, zD);
            A4.r0 r0VarC = f0Var.C();
            i0VarB.e();
            A4.j0.x((A4.j0) i0VarB.f19594i, r0VarC);
            int iB2 = f0Var.B();
            i0VarB.e();
            A4.j0.z((A4.j0) i0VarB.f19594i, iB2);
            A4.j0 j0Var = (A4.j0) i0VarB.b();
            h0VarZ.e();
            A4.k0.x((A4.k0) h0VarZ.f19594i, j0Var);
        }
        return (A4.k0) h0VarZ.b();
    }
}
