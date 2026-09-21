package p154s;

/* JADX INFO: renamed from: s.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2721g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f27145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f27146b = 0;

    static {
        long j = Integer.MIN_VALUE;
        f27145a = (j & 4294967295L) | (j << 32);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x0076  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void a(java.lang.Object obj, p137q0.p pVar, p194x6.j jVar, p137q0.h hVar, java.lang.String str, p194x6.j jVar2, p089k0.e eVar, p020c0.C1700q c1700q, int i3, int i9) {
        int i10;
        p137q0.h hVar2;
        int i11;
        boolean z6;
        p137q0.p pVar2;
        p194x6.j jVar3;
        p020c0.C1701q0 c1701q0U;
        p020c0.C1676e c1676e;
        p137q0.h hVar3;
        java.lang.Object objQ;
        int i12;
        int i13;
        c1700q.e0(1501828832);
        if ((i3 & 6) == 0) {
            i10 = ((i3 & 8) == 0 ? c1700q.f(obj) : c1700q.h(obj) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        int i14 = i9 & 2;
        if (i14 != 0) {
            i10 |= 48;
        } else if ((i3 & 48) == 0) {
            i10 |= c1700q.f(pVar) ? 32 : 16;
        }
        if ((i3 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i10 |= c1700q.h(jVar) ? 256 : 128;
        }
        int i15 = i9 & 8;
        if (i15 == 0) {
            if ((i3 & 3072) == 0) {
                hVar2 = hVar;
                i10 |= c1700q.f(hVar2) ? 2048 : 1024;
            }
            if ((i3 & 24576) == 0) {
                if (c1700q.f(str)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i10 |= i13;
            }
            i11 = i10 | 196608;
            if ((1572864 & i3) == 0) {
                if (c1700q.h(eVar)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i11 |= i12;
            }
            if ((599187 & i11) != 599186) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (c1700q.T(i11 & 1, z6)) {
                if (i14 != 0) {
                    pVar = p137q0.m.f26474b;
                }
                c1676e = p020c0.C1690l.f18284a;
                if (i15 != 0) {
                    hVar3 = p137q0.c.f26449h;
                } else {
                    hVar3 = hVar2;
                }
                objQ = c1700q.Q();
                if (objQ == c1676e) {
                    objQ = p154s.C2717c.f27116i;
                    c1700q.n0(objQ);
                }
                p194x6.j jVar4 = (p194x6.j) objQ;
                p163t.y0 y0VarD = p163t.C0.d(obj, str, c1700q, (i11 & 14) | ((i11 >> 9) & 112));
                int i16 = i11 & 8176;
                int i17 = i11 >> 3;
                p137q0.p pVar3 = pVar;
                b(y0VarD, pVar3, jVar, hVar3, jVar4, eVar, c1700q, i16 | (57344 & i17) | (i17 & 458752));
                pVar2 = pVar3;
                hVar2 = hVar3;
                jVar3 = jVar4;
            } else {
                c1700q.W();
                pVar2 = pVar;
                jVar3 = jVar2;
            }
            c1701q0U = c1700q.u();
            if (c1701q0U != null) {
                c1701q0U.f18351d = new p154s.C2718d(obj, pVar2, jVar, hVar2, str, jVar3, eVar, i3, i9);
            }
        }
        i10 |= 3072;
        hVar2 = hVar;
        if ((i3 & 24576) == 0) {
            if (c1700q.f(str)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i10 |= i13;
        }
        i11 = i10 | 196608;
        if ((1572864 & i3) == 0) {
            if (c1700q.h(eVar)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i11 |= i12;
        }
        if ((599187 & i11) != 599186) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (c1700q.T(i11 & 1, z6)) {
            if (i14 != 0) {
                pVar = p137q0.m.f26474b;
            }
            c1676e = p020c0.C1690l.f18284a;
            if (i15 != 0) {
                hVar3 = p137q0.c.f26449h;
            } else {
                hVar3 = hVar2;
            }
            objQ = c1700q.Q();
            if (objQ == c1676e) {
                objQ = p154s.C2717c.f27116i;
                c1700q.n0(objQ);
            }
            p194x6.j jVar5 = (p194x6.j) objQ;
            p163t.y0 y0VarD2 = p163t.C0.d(obj, str, c1700q, (i11 & 14) | ((i11 >> 9) & 112));
            int i18 = i11 & 8176;
            int i19 = i11 >> 3;
            p137q0.p pVar4 = pVar;
            b(y0VarD2, pVar4, jVar, hVar3, jVar5, eVar, c1700q, i18 | (57344 & i19) | (i19 & 458752));
            pVar2 = pVar4;
            hVar2 = hVar3;
            jVar3 = jVar5;
        } else {
            c1700q.W();
            pVar2 = pVar;
            jVar3 = jVar2;
        }
        c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new p154s.C2718d(obj, pVar2, jVar, hVar2, str, jVar3, eVar, i3, i9);
        }
    }

    public static final void b(p163t.y0 y0Var, p137q0.p pVar, p194x6.j jVar, p137q0.d dVar, p194x6.j jVar2, p089k0.e eVar, p020c0.C1700q c1700q, int i3) {
        int i9;
        p194x6.j jVar3;
        p020c0.C1700q c1700q2;
        p121o0.n nVar;
        p154s.C2729o c2729o;
        p163t.r0 r0VarB;
        p020c0.C1700q c1700q3;
        boolean z6;
        p194x6.j jVar4 = jVar;
        c1700q.e0(511725103);
        if ((i3 & 6) == 0) {
            i9 = (c1700q.f(y0Var) ? 4 : 2) | i3;
        } else {
            i9 = i3;
        }
        if ((i3 & 48) == 0) {
            i9 |= c1700q.f(pVar) ? 32 : 16;
        }
        if ((i3 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i9 |= c1700q.h(jVar4) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i9 |= c1700q.f(dVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i9 |= c1700q.h(jVar2) ? 16384 : 8192;
        }
        p089k0.e eVar2 = eVar;
        if ((196608 & i3) == 0) {
            i9 |= c1700q.h(eVar2) ? 131072 : 65536;
        }
        if (c1700q.T(i9 & 1, (74899 & i9) != 74898)) {
            p020c0.C1676e c1676e = p020c0.C1690l.f18284a;
            int i10 = i9 & 14;
            boolean z9 = i10 == 4;
            java.lang.Object objQ = c1700q.Q();
            if (z9 || objQ == c1676e) {
                objQ = new p154s.C2729o(y0Var, dVar);
                c1700q.n0(objQ);
            }
            p154s.C2729o c2729o2 = (p154s.C2729o) objQ;
            boolean z10 = i10 == 4;
            java.lang.Object objQ2 = c1700q.Q();
            java.lang.Object obj = objQ2;
            if (z10 || objQ2 == c1676e) {
                java.lang.Object[] objArr = {y0Var.f27727a.s0()};
                p121o0.n nVar2 = new p121o0.n();
                nVar2.addAll(p078i6.m.E0(objArr));
                c1700q.n0(nVar2);
                obj = nVar2;
            }
            p121o0.n nVar3 = (p121o0.n) obj;
            boolean z11 = i10 == 4;
            java.lang.Object objQ3 = c1700q.Q();
            if (z11 || objQ3 == c1676e) {
                long[] jArr = p136q.P.f26351a;
                objQ3 = new p136q.H();
                c1700q.n0(objQ3);
            }
            p136q.H h9 = (p136q.H) objQ3;
            boolean zContains = nVar3.contains(y0Var.f27727a.s0());
            D1.AbstractC0220e0 abstractC0220e0 = y0Var.f27727a;
            if (!zContains) {
                nVar3.clear();
                nVar3.add(abstractC0220e0.s0());
            }
            java.lang.Object objS0 = abstractC0220e0.s0();
            p020c0.C1681g0 c1681g0 = y0Var.f27730d;
            if (kotlin.jvm.internal.m.a(objS0, c1681g0.getValue())) {
                if (nVar3.size() != 1 || !kotlin.jvm.internal.m.a(nVar3.get(0), abstractC0220e0.s0())) {
                    nVar3.clear();
                    nVar3.add(abstractC0220e0.s0());
                }
                if (h9.f26326e != 1 || h9.c(abstractC0220e0.s0())) {
                    h9.a();
                }
                c2729o2.f27162b = dVar;
            }
            if (!kotlin.jvm.internal.m.a(abstractC0220e0.s0(), c1681g0.getValue()) && !nVar3.contains(c1681g0.getValue())) {
                java.util.ListIterator listIterator = nVar3.listIterator();
                int i11 = 0;
                while (true) {
                    Q0.C0781o c0781o = (Q0.C0781o) listIterator;
                    java.util.ListIterator listIterator2 = listIterator;
                    if (!c0781o.hasNext()) {
                        i11 = -1;
                        break;
                    } else {
                        if (kotlin.jvm.internal.m.a(jVar2.invoke(c0781o.next()), jVar2.invoke(c1681g0.getValue()))) {
                            break;
                        }
                        i11++;
                        listIterator = listIterator2;
                    }
                }
                if (i11 == -1) {
                    nVar3.add(c1681g0.getValue());
                } else {
                    nVar3.set(i11, c1681g0.getValue());
                }
            }
            if (h9.c(c1681g0.getValue()) && h9.c(abstractC0220e0.s0())) {
                c1700q.c0(1925931827);
                c1700q.p(false);
                jVar3 = jVar4;
            } else {
                c1700q.c0(1966410449);
                h9.a();
                int size = nVar3.size();
                int i12 = 0;
                while (i12 < size) {
                    java.lang.Object obj2 = nVar3.get(i12);
                    h9.m(obj2, p089k0.f.d(-23915175, new p154s.C2719e(y0Var, obj2, jVar4, c2729o2, nVar3, eVar2), c1700q));
                    i12++;
                    jVar4 = jVar4;
                    eVar2 = eVar;
                }
                jVar3 = jVar4;
                c1700q.p(false);
            }
            boolean zF = c1700q.f(y0Var.f()) | c1700q.f(c2729o2);
            java.lang.Object objQ4 = c1700q.Q();
            if (zF || objQ4 == c1676e) {
                objQ4 = (p154s.A) jVar3.invoke(c2729o2);
                c1700q.n0(objQ4);
            }
            p154s.A a2 = (p154s.A) objQ4;
            c2729o2.getClass();
            boolean zF2 = c1700q.f(c2729o2);
            java.lang.Object objQ5 = c1700q.Q();
            if (zF2 || objQ5 == c1676e) {
                objQ5 = p020c0.AbstractC1703s.y(java.lang.Boolean.FALSE);
                c1700q.n0(objQ5);
            }
            p020c0.X x9 = (p020c0.X) objQ5;
            p020c0.X xF = p020c0.AbstractC1703s.F(a2.f27034d, c1700q);
            p163t.y0 y0Var2 = c2729o2.f27161a;
            if (kotlin.jvm.internal.m.a(y0Var2.f27727a.s0(), y0Var2.f27730d.getValue())) {
                x9.setValue(java.lang.Boolean.FALSE);
            } else if (xF.getValue() != null) {
                x9.setValue(java.lang.Boolean.TRUE);
            }
            boolean zBooleanValue = ((java.lang.Boolean) x9.getValue()).booleanValue();
            p137q0.p pVarC = p137q0.m.f26474b;
            if (zBooleanValue) {
                c1700q.c0(1353077497);
                nVar = nVar3;
                c2729o = c2729o2;
                p020c0.C1700q c1700q4 = c1700q;
                r0VarB = p163t.C0.b(c2729o2.f27161a, p163t.AbstractC2750d.f27575q, null, c1700q4, 0, 2);
                boolean zF3 = c1700q4.f(r0VarB);
                java.lang.Object objQ6 = c1700q4.Q();
                if (zF3 || objQ6 == c1676e) {
                    p154s.Y y = (p154s.Y) xF.getValue();
                    if (y == null || y.f27104a) {
                        pVarC = p171u0.f.c(pVarC);
                    }
                    c1700q4.n0(pVarC);
                    objQ6 = pVarC;
                }
                pVarC = (p137q0.p) objQ6;
                c1700q4.p(false);
                c1700q3 = c1700q4;
            } else {
                nVar = nVar3;
                p020c0.C1700q c1700q5 = c1700q;
                c2729o = c2729o2;
                c1700q5.c0(1353343539);
                c1700q5.p(false);
                r0VarB = null;
                c1700q3 = c1700q5;
            }
            p137q0.p pVarD = pVar.d(pVarC.d(new p154s.C2726l(r0VarB, xF, c2729o)));
            java.lang.Object objQ7 = c1700q3.Q();
            if (objQ7 == c1676e) {
                objQ7 = new p154s.C2723i(c2729o);
                c1700q3.n0(objQ7);
            }
            p154s.C2723i c2723i = (p154s.C2723i) objQ7;
            int iHashCode = java.lang.Long.hashCode(c1700q3.f18323T);
            p020c0.InterfaceC1691l0 interfaceC1691l0L = c1700q3.l();
            p137q0.p pVarC2 = p137q0.a.c(c1700q3, pVarD);
            Q0.InterfaceC0773g.f8436c.getClass();
            Q0.C0790y c0790y = Q0.C0772f.f8424b;
            c1700q3.g0();
            if (c1700q3.f18322S) {
                c1700q3.k(c0790y);
            } else {
                c1700q3.q0();
            }
            p020c0.AbstractC1703s.H(c1700q3, c2723i, Q0.C0772f.f8427e);
            p020c0.AbstractC1703s.H(c1700q3, interfaceC1691l0L, Q0.C0772f.f8426d);
            p020c0.AbstractC1703s.w(c1700q3, java.lang.Integer.valueOf(iHashCode), Q0.C0772f.f8428f);
            p020c0.AbstractC1703s.D(c1700q3, Q0.C0772f.g);
            p020c0.AbstractC1703s.H(c1700q3, pVarC2, Q0.C0772f.f8425c);
            c1700q3.c0(-860173498);
            int size2 = nVar.size();
            int i13 = 0;
            while (i13 < size2) {
                p121o0.n nVar4 = nVar;
                java.lang.Object obj3 = nVar4.get(i13);
                c1700q3.a0(-2026002954, jVar2.invoke(obj3));
                p194x6.m mVar = (p194x6.m) h9.g(obj3);
                if (mVar == null) {
                    c1700q3.c0(1618454323);
                    z6 = false;
                } else {
                    z6 = false;
                    c1700q3.c0(-2026001778);
                    mVar.invoke(c1700q3, 0);
                }
                c1700q3.p(z6);
                c1700q3.p(z6);
                i13++;
                nVar = nVar4;
            }
            c1700q3.p(false);
            c1700q3.p(true);
            c1700q2 = c1700q3;
        } else {
            jVar3 = jVar4;
            p020c0.C1700q c1700q6 = c1700q;
            c1700q6.W();
            c1700q2 = c1700q6;
        }
        p020c0.C1701q0 c1701q0U = c1700q2.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new p154s.C2720f(y0Var, pVar, jVar3, dVar, jVar2, eVar, i3);
        }
    }

    public static final p154s.A c(p154s.P p2, p154s.Q q9) {
        return new p154s.A(p2, q9, 0.0f, new p154s.Y(true));
    }
}
