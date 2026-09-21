package Z;

/* JADX INFO: renamed from: Z.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1154k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12438a = 280;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12439b = 560;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12440c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f12441d = 12;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B.S f12442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final B.S f12443f;
    public static final B.S g;

    static {
        float f9 = 24;
        f12442e = new B.S(f9, f9, f9, f9);
        float f10 = 16;
        B.AbstractC0065c.c(0.0f, 0.0f, 0.0f, f10, 7);
        f12443f = B.AbstractC0065c.c(0.0f, 0.0f, 0.0f, f10, 7);
        g = B.AbstractC0065c.c(0.0f, 0.0f, 0.0f, f9, 7);
    }

    public static final void a(p089k0.e eVar, p137q0.m mVar, p089k0.e eVar2, p089k0.e eVar3, p188x0.O o8, long j, float f9, long j9, long j10, long j11, long j12, p020c0.C1700q c1700q, int i3) {
        p137q0.m mVar2;
        c1700q.e0(1522575799);
        int i9 = i3 | 48 | (c1700q.h(null) ? 256 : 128) | (c1700q.h(eVar2) ? 2048 : 1024) | (c1700q.h(eVar3) ? 16384 : 8192) | (c1700q.f(o8) ? 131072 : 65536) | (c1700q.e(j) ? 1048576 : 524288) | (c1700q.c(f9) ? 8388608 : 4194304) | (c1700q.e(j9) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432) | (c1700q.e(j10) ? androidx.media3.common.C.BUFFER_FLAG_LAST_SAMPLE : 268435456);
        int i10 = (c1700q.e(j11) ? (char) 4 : (char) 2) | (c1700q.e(j12) ? ' ' : (char) 16);
        if ((i9 & 306783379) == 306783378 && (i10 & 19) == 18 && c1700q.F()) {
            c1700q.W();
            mVar2 = mVar;
        } else {
            p137q0.m mVar3 = p137q0.m.f26474b;
            int i11 = i9 >> 12;
            Z.E0.a(mVar3, o8, j, 0L, f9, 0.0f, p089k0.f.d(-2126308228, new Z.C1138c(eVar2, eVar3, j10, j11, j12, j9, eVar), c1700q), c1700q, (i11 & 896) | (i11 & 112) | 12582918 | ((i9 >> 9) & 57344), 104);
            mVar2 = mVar3;
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new Z.C1140d(eVar, mVar2, eVar2, eVar3, o8, j, f9, j9, j10, j11, j12, i3);
        }
    }

    public static final void b(p089k0.e eVar, p020c0.C1700q c1700q, int i3) {
        c1700q.e0(586821353);
        if ((i3 & 147) == 146 && c1700q.F()) {
            c1700q.W();
        } else {
            java.lang.Object objQ = c1700q.Q();
            if (objQ == p020c0.C1690l.f18284a) {
                objQ = new Z.C1144f(0);
                c1700q.n0(objQ);
            }
            O0.S s9 = (O0.S) objQ;
            p137q0.m mVar = p137q0.m.f26474b;
            int iHashCode = java.lang.Long.hashCode(c1700q.f18323T);
            p020c0.InterfaceC1691l0 interfaceC1691l0L = c1700q.l();
            p137q0.p pVarC = p137q0.a.c(c1700q, mVar);
            Q0.InterfaceC0773g.f8436c.getClass();
            Q0.C0790y c0790y = Q0.C0772f.f8424b;
            c1700q.g0();
            if (c1700q.f18322S) {
                c1700q.k(c0790y);
            } else {
                c1700q.q0();
            }
            p020c0.AbstractC1703s.H(c1700q, s9, Q0.C0772f.f8427e);
            p020c0.AbstractC1703s.H(c1700q, interfaceC1691l0L, Q0.C0772f.f8426d);
            Q0.C0770e c0770e = Q0.C0772f.f8428f;
            if (c1700q.f18322S || !kotlin.jvm.internal.m.a(c1700q.Q(), java.lang.Integer.valueOf(iHashCode))) {
                Z.AbstractC1149h0.b(iHashCode, c1700q, iHashCode, c0770e);
            }
            p020c0.AbstractC1703s.H(c1700q, pVarC, Q0.C0772f.f8425c);
            eVar.invoke(c1700q, 6);
            c1700q.p(true);
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new Z.C1136b(i3, eVar);
        }
    }

    public static final void c(kotlin.jvm.functions.Function0 function0, p089k0.e eVar, p137q0.m mVar, p089k0.e eVar2, p089k0.e eVar3, p089k0.e eVar4, p188x0.O o8, long j, long j9, long j10, long j11, float f9, p146r1.x xVar, p020c0.C1700q c1700q, int i3, int i9) {
        int i10;
        p089k0.e eVar5;
        p089k0.e eVar6;
        int i11;
        c1700q.e0(-919826268);
        if ((i3 & 6) == 0) {
            i10 = (c1700q.h(function0) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            eVar5 = eVar;
            i10 |= c1700q.h(eVar5) ? 32 : 16;
        } else {
            eVar5 = eVar;
        }
        if ((i3 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i10 |= c1700q.f(mVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            eVar6 = eVar2;
            i10 |= c1700q.h(eVar6) ? 2048 : 1024;
        } else {
            eVar6 = eVar2;
        }
        if ((i3 & 24576) == 0) {
            i10 |= c1700q.h(null) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i10 |= c1700q.h(eVar3) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i10 |= c1700q.h(eVar4) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i10 |= c1700q.f(o8) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i10 |= c1700q.e(j) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i10 |= c1700q.e(j9) ? androidx.media3.common.C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        if ((i9 & 6) == 0) {
            i11 = i9 | (c1700q.e(j10) ? 4 : 2);
        } else {
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= c1700q.e(j11) ? 32 : 16;
        }
        if ((i9 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i11 |= c1700q.c(f9) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i11 |= c1700q.f(xVar) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i10 & 306783379) == 306783378 && (i12 & 1171) == 1170 && c1700q.F()) {
            c1700q.W();
        } else {
            d(function0, mVar, xVar, p089k0.f.d(-1852840226, new Z.C1148h(eVar3, eVar4, o8, j, f9, j9, j10, j11, eVar6, eVar5), c1700q), c1700q, (i10 & 14) | 3072 | ((i10 >> 3) & 112) | ((i12 >> 3) & 896));
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new Z.C1150i(function0, eVar, mVar, eVar2, eVar3, eVar4, o8, j, j9, j10, j11, f9, xVar, i3, i9, 0);
        }
    }

    public static final void d(kotlin.jvm.functions.Function0 function0, p137q0.m mVar, p146r1.x xVar, p089k0.e eVar, p020c0.C1700q c1700q, int i3) {
        int i9;
        c1700q.e0(-1922902937);
        if ((i3 & 6) == 0) {
            i9 = (c1700q.h(function0) ? 4 : 2) | i3;
        } else {
            i9 = i3;
        }
        if ((i3 & 48) == 0) {
            i9 |= c1700q.f(mVar) ? 32 : 16;
        }
        if ((i3 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i9 |= c1700q.f(xVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i9 |= c1700q.h(eVar) ? 2048 : 1024;
        }
        if ((i9 & 1171) == 1170 && c1700q.F()) {
            c1700q.W();
        } else {
            com.google.android.gms.internal.play_billing.AbstractC1853k0.c(function0, xVar, p089k0.f.d(905289008, new O0.M(mVar, eVar, 4), c1700q), c1700q, (i9 & 14) | androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK | ((i9 >> 3) & 112), 0);
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new Z.C1152j(function0, mVar, xVar, eVar, i3, 0);
        }
    }
}
