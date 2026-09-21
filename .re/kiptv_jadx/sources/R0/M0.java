package R0;

/* JADX INFO: loaded from: classes.dex */
public abstract class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p020c0.f1 f8826a = new p020c0.f1(R0.J0.f8791i);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(S.s sVar, S.c cVar, p117n6.c cVar2) {
        R0.K0 k1;
        if (cVar2 instanceof R0.K0) {
            k1 = (R0.K0) cVar2;
            int i3 = k1.f8795i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k1.f8795i = i3 - Integer.MIN_VALUE;
            } else {
                k1 = new R0.K0(cVar2);
            }
        } else {
            k1 = new R0.K0(cVar2);
        }
        java.lang.Object obj = k1.f8794h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = k1.f8795i;
        if (i9 != 0) {
            if (i9 == 1) {
                throw B2.a.f(obj);
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.google.common.util.concurrent.P.u0(obj);
        if (!sVar.f26475h.f26487u) {
            throw new java.lang.IllegalArgumentException("establishTextInputSession called from an unattached node");
        }
        Q0.o0 o0VarU = Q0.AbstractC0777k.u(sVar);
        p089k0.j jVar = (p089k0.j) Q0.AbstractC0777k.t(sVar).f8228J;
        jVar.getClass();
        if (p020c0.AbstractC1703s.C(jVar, f8826a) != null) {
            throw new java.lang.ClassCastException();
        }
        k1.f8795i = 1;
        b(o0VarU, cVar, k1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(Q0.o0 o0Var, S.c cVar, p117n6.c cVar2) {
        R0.L0 l2;
        if (cVar2 instanceof R0.L0) {
            l2 = (R0.L0) cVar2;
            int i3 = l2.f8798i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l2.f8798i = i3 - Integer.MIN_VALUE;
            } else {
                l2 = new R0.L0(cVar2);
            }
        } else {
            l2 = new R0.L0(cVar2);
        }
        java.lang.Object obj = l2.f8797h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = l2.f8798i;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            l2.f8798i = 1;
            ((androidx.compose.ui.platform.AndroidComposeView) o0Var).J(cVar, l2);
        } else {
            if (i9 == 1) {
                throw B2.a.f(obj);
            }
            if (i9 == 2) {
                throw B2.a.f(obj);
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
