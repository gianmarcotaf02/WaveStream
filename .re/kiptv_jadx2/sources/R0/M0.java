package R0;

import Q0.AbstractC0777k;
import androidx.compose.ui.platform.AndroidComposeView;
import p020c0.AbstractC1703s;

public abstract class M0 {

    public static final p020c0.f1 f8826a = new p020c0.f1(J0.f8791i);

    public static final void a(S.s sVar, S.c cVar, p117n6.c cVar2) {
        K0 k1;
        if (cVar2 instanceof K0) {
            k1 = (K0) cVar2;
            int i3 = k1.f8795i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k1.f8795i = i3 - Integer.MIN_VALUE;
            } else {
                k1 = new K0(cVar2);
            }
        } else {
            k1 = new K0(cVar2);
        }
        Object obj = k1.f8794h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = k1.f8795i;
        if (i9 != 0) {
            if (i9 == 1) {
                throw B2.a.f(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.google.common.util.concurrent.P.u0(obj);
        if (!sVar.f26475h.f26487u) {
            throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
        }
        Q0.o0 o0VarU = AbstractC0777k.u(sVar);
        p089k0.j jVar = (p089k0.j) AbstractC0777k.t(sVar).f8228J;
        jVar.getClass();
        if (AbstractC1703s.C(jVar, f8826a) != null) {
            throw new ClassCastException();
        }
        k1.f8795i = 1;
        b(o0VarU, cVar, k1);
    }

    public static final void b(Q0.o0 o0Var, S.c cVar, p117n6.c cVar2) {
        L0 l2;
        if (cVar2 instanceof L0) {
            l2 = (L0) cVar2;
            int i3 = l2.f8798i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l2.f8798i = i3 - Integer.MIN_VALUE;
            } else {
                l2 = new L0(cVar2);
            }
        } else {
            l2 = new L0(cVar2);
        }
        Object obj = l2.f8797h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = l2.f8798i;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            l2.f8798i = 1;
            ((AndroidComposeView) o0Var).J(cVar, l2);
        } else {
            if (i9 == 1) {
                throw B2.a.f(obj);
            }
            if (i9 == 2) {
                throw B2.a.f(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
