package B;

import O0.g0;
import Q0.C0772f;
import Q0.C0790y;
import Q0.D0;
import Q0.InterfaceC0773g;
import androidx.media3.common.util.Log;
import java.util.List;
import p020c0.AbstractC1703s;
import p020c0.C1700q;
import p020c0.InterfaceC1691l0;

public abstract class AbstractC0065c {

    public static final C0064b f517a = new C0064b(0);

    public static final C0064b f518b = new C0064b(1);

    public static S a(float f9, float f10, int i3) {
        if ((i3 & 1) != 0) {
            f9 = 0;
        }
        if ((i3 & 2) != 0) {
            f10 = 0;
        }
        return new S(f9, f10, f9, f10);
    }

    public static final S b(float f9, float f10, float f11, float f12) {
        return new S(f9, f10, f11, f12);
    }

    public static S c(float f9, float f10, float f11, float f12, int i3) {
        if ((i3 & 1) != 0) {
            f9 = 0;
        }
        if ((i3 & 2) != 0) {
            f10 = 0;
        }
        if ((i3 & 4) != 0) {
            f11 = 0;
        }
        if ((i3 & 8) != 0) {
            f12 = 0;
        }
        return new S(f9, f10, f11, f12);
    }

    public static final void d(C1700q c1700q, p137q0.p pVar) {
        C0078p c0078p = C0078p.f553c;
        int iHashCode = Long.hashCode(c1700q.f18323T);
        p137q0.p pVarC = p137q0.a.c(c1700q, pVar);
        InterfaceC1691l0 interfaceC1691l0L = c1700q.l();
        InterfaceC0773g.f8436c.getClass();
        C0790y c0790y = C0772f.f8424b;
        D0 d4 = c1700q.f18325a;
        c1700q.g0();
        if (c1700q.f18322S) {
            c1700q.k(c0790y);
        } else {
            c1700q.q0();
        }
        AbstractC1703s.H(c1700q, c0078p, C0772f.f8427e);
        AbstractC1703s.H(c1700q, interfaceC1691l0L, C0772f.f8426d);
        AbstractC1703s.D(c1700q, C0772f.g);
        AbstractC1703s.H(c1700q, pVarC, C0772f.f8425c);
        AbstractC1703s.w(c1700q, Integer.valueOf(iHashCode), C0772f.f8428f);
        c1700q.p(true);
    }

    public static p137q0.p e(p137q0.p pVar, float f9) {
        return pVar.d(new C0072j(f9));
    }

    public static final W f(O0.Q q9) {
        Object objE = q9.E();
        if (objE instanceof W) {
            return (W) objE;
        }
        return null;
    }

    public static final float g(W w6) {
        if (w6 != null) {
            return w6.f500a;
        }
        return 0.0f;
    }

    public static final boolean h(int i3, int i9, long j) {
        int iJ = p113n1.a.j(j);
        if (i3 > p113n1.a.h(j) || iJ > i3) {
            return false;
        }
        return i9 <= p113n1.a.g(j) && p113n1.a.i(j) <= i9;
    }

    public static O0.T i(V v6, int i3, int i9, int i10, int i11, int i12, O0.U u6, List list, g0[] g0VarArr, int i13) {
        int i14;
        float f9;
        int i15;
        int i16;
        int i17;
        List list2 = list;
        long j = i12;
        int[] iArr = new int[i13];
        int iMax = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int iMin = 0;
        float f10 = 0.0f;
        while (i18 < i13) {
            O0.Q q9 = (O0.Q) list2.get(i18);
            float fG = g(f(q9));
            if (fG > 0.0f) {
                f10 += fG;
                i19++;
                i15 = i18;
            } else {
                int i21 = i10 - i20;
                g0 g0VarC = g0VarArr[i18];
                if (g0VarC == null) {
                    if (i10 == Integer.MAX_VALUE) {
                        i15 = i18;
                        i16 = i19;
                        i17 = Log.LOG_LEVEL_OFF;
                    } else {
                        i15 = i18;
                        i16 = i19;
                        i17 = i21 < 0 ? 0 : i21;
                    }
                    g0VarC = q9.C(v6.f(false, 0, i17, i11));
                } else {
                    i15 = i18;
                    i16 = i19;
                }
                g0 g0Var = g0VarC;
                int i22 = v6.i(g0Var);
                int iH = v6.h(g0Var);
                iArr[i15] = i22;
                int i23 = i21 - i22;
                if (i23 < 0) {
                    i23 = 0;
                }
                iMin = Math.min(i12, i23);
                i20 += i22 + iMin;
                iMax = Math.max(iMax, iH);
                g0VarArr[i15] = g0Var;
                i19 = i16;
            }
            i18 = i15 + 1;
            j = j;
        }
        long j9 = j;
        int i24 = i19;
        if (i24 == 0) {
            i20 -= iMin;
            i14 = 0;
        } else {
            long j10 = ((long) (i24 - 1)) * j9;
            long jRound = ((long) ((i10 != Integer.MAX_VALUE ? i10 : i3) - i20)) - j10;
            if (jRound < 0) {
                jRound = 0;
            }
            float f11 = jRound / f10;
            for (int i25 = 0; i25 < i13; i25++) {
                jRound -= (long) Math.round(g(f((O0.Q) list2.get(i25))) * f11);
            }
            int i26 = iMax;
            int i27 = 0;
            int i28 = 0;
            while (i27 < i13) {
                if (g0VarArr[i27] == null) {
                    O0.Q q10 = (O0.Q) list2.get(i27);
                    W wF = f(q10);
                    float fG2 = g(wF);
                    if (fG2 <= 0.0f) {
                        C.a.b("All weights <= 0 should have placeables");
                    }
                    f9 = f11;
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(fG2 * f9) + iSignum);
                    g0 g0VarC2 = q10.C(v6.f(true, (!(wF != null ? wF.f501b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i11));
                    int i29 = v6.i(g0VarC2);
                    int iH2 = v6.h(g0VarC2);
                    iArr[i27] = i29;
                    i28 += i29;
                    int iMax3 = Math.max(i26, iH2);
                    g0VarArr[i27] = g0VarC2;
                    i26 = iMax3;
                } else {
                    f9 = f11;
                }
                i27++;
                list2 = list;
                f11 = f9;
            }
            i14 = (int) (((long) i28) + j10);
            int i30 = i10 - i20;
            if (i14 < 0) {
                i14 = 0;
            }
            if (i14 > i30) {
                i14 = i30;
            }
            iMax = i26;
        }
        int i31 = i14 + i20;
        if (i31 < 0) {
            i31 = 0;
        }
        int iMax4 = Math.max(i31, i3);
        int iMax5 = Math.max(iMax, Math.max(i9, 0));
        int[] iArr2 = new int[i13];
        v6.j(iMax4, u6, iArr, iArr2);
        return v6.e(g0VarArr, u6, iArr2, iMax4, iMax5);
    }

    public static final p137q0.p j(p137q0.p pVar, p194x6.j jVar) {
        return pVar.d(new M(jVar));
    }

    public static final p137q0.p k(p137q0.p pVar, float f9, float f10) {
        return pVar.d(new J(f9, f10));
    }

    public static p137q0.p l(p137q0.p pVar, float f9, float f10, int i3) {
        if ((i3 & 1) != 0) {
            f9 = 0;
        }
        if ((i3 & 2) != 0) {
            f10 = 0;
        }
        return k(pVar, f9, f10);
    }

    public static final p137q0.p m(p137q0.p pVar, S s9) {
        return pVar.d(new Q(s9));
    }

    public static final p137q0.p n(p137q0.p pVar, float f9) {
        return pVar.d(new O(f9, f9, f9, f9));
    }

    public static final p137q0.p o(p137q0.p pVar, float f9, float f10) {
        return pVar.d(new O(f9, f10, f9, f10));
    }

    public static p137q0.p p(p137q0.p pVar, float f9, float f10, int i3) {
        if ((i3 & 1) != 0) {
            f9 = 0;
        }
        if ((i3 & 2) != 0) {
            f10 = 0;
        }
        return o(pVar, f9, f10);
    }

    public static final p137q0.p q(p137q0.p pVar, float f9, float f10, float f11, float f12) {
        return pVar.d(new O(f9, f10, f11, f12));
    }

    public static p137q0.p r(p137q0.p pVar, float f9, float f10, float f11, float f12, int i3) {
        if ((i3 & 1) != 0) {
            f9 = 0;
        }
        if ((i3 & 2) != 0) {
            f10 = 0;
        }
        if ((i3 & 4) != 0) {
            f11 = 0;
        }
        if ((i3 & 8) != 0) {
            f12 = 0;
        }
        return q(pVar, f9, f10, f11, f12);
    }

    public static final p137q0.p s(p137q0.p pVar) {
        E e6 = E.f465h;
        return pVar.d(new F());
    }
}
