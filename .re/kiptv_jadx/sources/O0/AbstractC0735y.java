package O0;

/* JADX INFO: renamed from: O0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0735y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O0.Y f7712a = new O0.Y(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f7713b = new java.lang.Object();

    public static final void a(O0.q0 q0Var, p137q0.p pVar, p194x6.m mVar, p020c0.C1700q c1700q, int i3) {
        int i9;
        c1700q.e0(-511989831);
        if ((i3 & 6) == 0) {
            i9 = (c1700q.h(q0Var) ? 4 : 2) | i3;
        } else {
            i9 = i3;
        }
        if ((i3 & 48) == 0) {
            i9 |= c1700q.f(pVar) ? 32 : 16;
        }
        if ((i3 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i9 |= c1700q.h(mVar) ? 256 : 128;
        }
        if (c1700q.T(i9 & 1, (i9 & 147) != 146)) {
            int iHashCode = java.lang.Long.hashCode(c1700q.f18323T);
            p020c0.C1696o c1696oE = p020c0.AbstractC1703s.E(c1700q);
            p137q0.p pVarC = p137q0.a.c(c1700q, pVar);
            p020c0.InterfaceC1691l0 interfaceC1691l0L = c1700q.l();
            Q0.C0790y c0790y = Q0.C0790y.f8489h;
            c1700q.g0();
            if (c1700q.f18322S) {
                c1700q.k(c0790y);
            } else {
                c1700q.q0();
            }
            p020c0.AbstractC1703s.H(c1700q, q0Var, q0Var.f7681c);
            p020c0.AbstractC1703s.H(c1700q, c1696oE, q0Var.f7682d);
            p020c0.AbstractC1703s.H(c1700q, mVar, q0Var.f7683e);
            Q0.InterfaceC0773g.f8436c.getClass();
            p020c0.AbstractC1703s.H(c1700q, interfaceC1691l0L, Q0.C0772f.f8426d);
            p020c0.AbstractC1703s.D(c1700q, Q0.C0772f.g);
            p020c0.AbstractC1703s.H(c1700q, pVarC, Q0.C0772f.f8425c);
            p020c0.AbstractC1703s.w(c1700q, java.lang.Integer.valueOf(iHashCode), Q0.C0772f.f8428f);
            c1700q.p(true);
            if (c1700q.F()) {
                c1700q.c0(-1266202711);
            } else {
                c1700q.c0(-1259244916);
                boolean zH = c1700q.h(q0Var);
                java.lang.Object objQ = c1700q.Q();
                if (zH || objQ == p020c0.C1690l.f18284a) {
                    objQ = new A8.m(5, q0Var);
                    c1700q.n0(objQ);
                }
                p020c0.AbstractC1703s.i((kotlin.jvm.functions.Function0) objQ, c1700q);
            }
            c1700q.p(false);
        } else {
            c1700q.W();
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new O0.n0(q0Var, pVar, mVar, i3);
        }
    }

    public static final void b(p137q0.m mVar, p194x6.m mVar2, p020c0.C1700q c1700q, int i3) {
        c1700q.e0(-1298353104);
        int i9 = i3 | 6 | (c1700q.h(mVar2) ? 32 : 16);
        if (c1700q.T(i9 & 1, (i9 & 19) != 18)) {
            mVar = p137q0.m.f26474b;
            java.lang.Object objQ = c1700q.Q();
            if (objQ == p020c0.C1690l.f18284a) {
                objQ = new O0.q0(O0.Y.f7619i);
                c1700q.n0(objQ);
            }
            a((O0.q0) objQ, mVar, mVar2, c1700q, (i9 << 3) & androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED);
        } else {
            c1700q.W();
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new O0.M(mVar, mVar2, i3, 1);
        }
    }

    public static final float c(long j, long j9) {
        return java.lang.Math.min(java.lang.Float.intBitsToFloat((int) (j9 >> 32)) / java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float d(O0.f0 f0Var, boolean z6, O0.C0725n[] c0725nArr, float f9) {
        float f10 = Float.NaN;
        for (O0.C0725n c0725n : c0725nArr) {
            float fB = f0Var.b(c0725n);
            if (java.lang.Float.isNaN(f10)) {
                f10 = fB;
            } else if (z6 == (fB > f10)) {
                f10 = fB;
            }
        }
        return java.lang.Float.isNaN(f10) ? f9 : f10;
    }

    public static final p181w0.b e(O0.InterfaceC0732v interfaceC0732v) {
        O0.InterfaceC0732v interfaceC0732vF = interfaceC0732v.F();
        return interfaceC0732vF != null ? interfaceC0732vF.J(interfaceC0732v, true) : new p181w0.b(0.0f, 0.0f, (int) (interfaceC0732v.k() >> 32), (int) (interfaceC0732v.k() & 4294967295L));
    }

    public static final p181w0.b f(O0.InterfaceC0732v interfaceC0732v, boolean z6) {
        O0.InterfaceC0732v interfaceC0732vH = h(interfaceC0732v);
        float fK = (int) (interfaceC0732vH.k() >> 32);
        float fK2 = (int) (interfaceC0732vH.k() & 4294967295L);
        p181w0.b bVarJ = interfaceC0732vH.J(interfaceC0732v, z6);
        float f9 = bVarJ.f29746a;
        if (z6) {
            if (f9 < 0.0f) {
                f9 = 0.0f;
            }
            if (f9 > fK) {
                f9 = fK;
            }
        }
        float f10 = bVarJ.f29747b;
        if (z6) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            if (f10 > fK2) {
                f10 = fK2;
            }
        }
        float f11 = bVarJ.f29748c;
        if (z6) {
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            if (f11 <= fK) {
                fK = f11;
            }
            f11 = fK;
        }
        float f12 = bVarJ.f29749d;
        if (z6) {
            float f13 = f12 >= 0.0f ? f12 : 0.0f;
            if (f13 <= fK2) {
                fK2 = f13;
            }
            f12 = fK2;
        }
        if (f9 == f11 || f10 == f12) {
            return p181w0.b.f29745e;
        }
        long jF = interfaceC0732vH.f((((long) java.lang.Float.floatToRawIntBits(f9)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L));
        long jF2 = interfaceC0732vH.f((((long) java.lang.Float.floatToRawIntBits(f11)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L));
        long jF3 = interfaceC0732vH.f((((long) java.lang.Float.floatToRawIntBits(f11)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f12)) & 4294967295L));
        long jF4 = interfaceC0732vH.f((((long) java.lang.Float.floatToRawIntBits(f12)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(f9)) << 32));
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jF >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jF2 >> 32));
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (jF4 >> 32));
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (jF3 >> 32));
        float fMin = java.lang.Math.min(fIntBitsToFloat, java.lang.Math.min(fIntBitsToFloat2, java.lang.Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = java.lang.Math.max(fIntBitsToFloat, java.lang.Math.max(fIntBitsToFloat2, java.lang.Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = java.lang.Float.intBitsToFloat((int) (jF & 4294967295L));
        float fIntBitsToFloat6 = java.lang.Float.intBitsToFloat((int) (jF2 & 4294967295L));
        float fIntBitsToFloat7 = java.lang.Float.intBitsToFloat((int) (jF4 & 4294967295L));
        float fIntBitsToFloat8 = java.lang.Float.intBitsToFloat((int) (jF3 & 4294967295L));
        return new p181w0.b(fMin, java.lang.Math.min(fIntBitsToFloat5, java.lang.Math.min(fIntBitsToFloat6, java.lang.Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, java.lang.Math.max(fIntBitsToFloat5, java.lang.Math.max(fIntBitsToFloat6, java.lang.Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final boolean g(long j, long j9) {
        return j == j9;
    }

    public static final O0.InterfaceC0732v h(O0.InterfaceC0732v interfaceC0732v) {
        O0.InterfaceC0732v interfaceC0732v2;
        O0.InterfaceC0732v interfaceC0732vF = interfaceC0732v.F();
        while (true) {
            O0.InterfaceC0732v interfaceC0732v3 = interfaceC0732vF;
            interfaceC0732v2 = interfaceC0732v;
            interfaceC0732v = interfaceC0732v3;
            if (interfaceC0732v == null) {
                break;
            }
            interfaceC0732vF = interfaceC0732v.F();
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = interfaceC0732v2 instanceof androidx.compose.ui.node.NodeCoordinator ? (androidx.compose.ui.node.NodeCoordinator) interfaceC0732v2 : null;
        if (nodeCoordinator == null) {
            return interfaceC0732v2;
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = nodeCoordinator.f15863x;
        while (true) {
            androidx.compose.ui.node.NodeCoordinator nodeCoordinator3 = nodeCoordinator2;
            androidx.compose.ui.node.NodeCoordinator nodeCoordinator4 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator3;
            if (nodeCoordinator == null) {
                return nodeCoordinator4;
            }
            nodeCoordinator2 = nodeCoordinator.f15863x;
        }
    }

    public static final java.lang.Object i(O0.Q q9) {
        java.lang.Object objE = q9.E();
        O0.C0736z c0736z = objE instanceof O0.C0736z ? (O0.C0736z) objE : null;
        if (c0736z != null) {
            return c0736z.f7716v;
        }
        return null;
    }

    public static final Q0.O j(Q0.O o8) {
        Q0.F f9 = o8.f8306v.f15861v;
        while (true) {
            Q0.F fX = f9.x();
            Q0.F f10 = null;
            if ((fX != null ? fX.f8248p : null) == null) {
                Q0.O oS0 = f9.f8232N.f8389d.S0();
                kotlin.jvm.internal.m.b(oS0);
                return oS0;
            }
            Q0.F fX2 = f9.x();
            if (fX2 != null) {
                f10 = fX2.f8248p;
            }
            kotlin.jvm.internal.m.b(f10);
            Q0.F fX3 = f9.x();
            kotlin.jvm.internal.m.b(fX3);
            f9 = fX3.f8248p;
            kotlin.jvm.internal.m.b(f9);
        }
    }

    public static final p137q0.p k(p137q0.p pVar, p194x6.n nVar) {
        return pVar.d(new O0.C0733w(nVar));
    }

    public static final p137q0.p l(java.lang.String str) {
        return new O0.C0734x(str);
    }

    public static final p137q0.p m(p137q0.p pVar, p194x6.j jVar) {
        return pVar.d(new O0.Z(jVar));
    }

    public static final p137q0.p n(p137q0.p pVar, p194x6.j jVar) {
        return pVar.d(new O0.b0(jVar));
    }

    public static final long o(long j, long j9) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j9 >> 32)) * java.lang.Float.intBitsToFloat((int) (j >> 32));
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L)) * java.lang.Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
