package x;

/* JADX INFO: loaded from: classes.dex */
public final class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x.Q0 f30819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v.C2897q f30820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x.C3050k f30821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x.EnumC3061p0 f30822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public J0.d f30824f;
    public final x.P0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x.H0 f30825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f30826i;
    public int j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x.InterfaceC3076x0 f30827k = x.F0.f30718b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x.T0 f30828l = new x.T0(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x.C3079z f30829m = new x.C3079z(1, this);

    public W0(x.Q0 q9, v.C2897q c2897q, x.C3050k c3050k, x.EnumC3061p0 enumC3061p0, boolean z6, J0.d dVar, x.P0 p2, x.H0 h9) {
        this.f30819a = q9;
        this.f30820b = c2897q;
        this.f30821c = c3050k;
        this.f30822d = enumC3061p0;
        this.f30823e = z6;
        this.f30824f = dVar;
        this.g = p2;
        this.f30825h = h9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(long j, p117n6.c cVar) throws java.lang.Throwable {
        x.R0 r9;
        x.W0 w6;
        java.lang.Throwable th;
        kotlin.jvm.internal.z zVar;
        if (cVar instanceof x.R0) {
            r9 = (x.R0) cVar;
            int i3 = r9.f30796k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r9.f30796k = i3 - Integer.MIN_VALUE;
            } else {
                r9 = new x.R0(this, cVar);
            }
        } else {
            r9 = new x.R0(this, cVar);
        }
        java.lang.Object obj = r9.f30795i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = r9.f30796k;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = r9.f30794h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
                w6 = this;
                w6.f30826i = false;
                return new p113n1.r(zVar.f24556h);
            } catch (java.lang.Throwable th2) {
                th = th2;
                w6 = this;
                w6.f30826i = false;
                throw th;
            }
        }
        com.google.common.util.concurrent.P.u0(obj);
        kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
        zVar2.f24556h = j;
        this.f30826i = true;
        try {
            v.n0 n0Var = v.n0.f28974h;
            w6 = this;
            try {
                x.S0 s9 = new x.S0(w6, zVar2, j, null);
                r9.f30794h = zVar2;
                r9.f30796k = 1;
                if (f(n0Var, s9, r9) == aVar) {
                    return aVar;
                }
                zVar = zVar2;
                w6.f30826i = false;
                return new p113n1.r(zVar.f24556h);
            } catch (java.lang.Throwable th3) {
                th = th3;
                th = th;
                w6.f30826i = false;
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            w6 = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:6:0x000a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0011  */
    public final java.lang.Object b(long j, boolean z6, p117n6.i iVar) {
        int i3;
        long jA;
        v.C2897q c2897q;
        java.lang.Object objInvokeSuspend;
        p070h6.A a2 = p070h6.A.f22523a;
        if (z6) {
            x.C3050k c3050k = this.f30821c;
            v5.C2921d c2921d = x.F0.f30717a;
            if (c3050k == null) {
                if (this.f30822d == x.EnumC3061p0.f30979i) {
                    i3 = 1;
                } else {
                    i3 = 2;
                }
                jA = p113n1.r.a(j, 0.0f, 0.0f, i3);
                x.U0 u1 = new x.U0(this, null);
                c2897q = this.f30820b;
                if (c2897q == null && (this.f30819a.d() || this.f30819a.b())) {
                    java.lang.Object objB = c2897q.b(jA, u1, iVar);
                    if (objB == p109m6.a.f25430h) {
                        return objB;
                    }
                } else {
                    x.U0 u6 = new x.U0(this, iVar);
                    u6.j = jA;
                    objInvokeSuspend = u6.invokeSuspend(a2);
                    if (objInvokeSuspend == p109m6.a.f25430h) {
                        return objInvokeSuspend;
                    }
                }
            }
        } else {
            if (this.f30822d == x.EnumC3061p0.f30979i) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            jA = p113n1.r.a(j, 0.0f, 0.0f, i3);
            x.U0 u7 = new x.U0(this, null);
            c2897q = this.f30820b;
            if (c2897q == null) {
                x.U0 u8 = new x.U0(this, iVar);
                u8.j = jA;
                objInvokeSuspend = u8.invokeSuspend(a2);
                if (objInvokeSuspend == p109m6.a.f25430h) {
                    return objInvokeSuspend;
                }
            } else {
                x.U0 u9 = new x.U0(this, iVar);
                u9.j = jA;
                objInvokeSuspend = u9.invokeSuspend(a2);
                if (objInvokeSuspend == p109m6.a.f25430h) {
                    return objInvokeSuspend;
                }
            }
        }
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    public final long c(x.InterfaceC3076x0 interfaceC3076x0, long j, int i3) {
        int i9;
        J0.i iVar;
        J0.i iVar2;
        long j9;
        long jG0;
        Q0.C0 c9;
        Q0.C0765b0 c0765b0;
        ?? eVar;
        ?? E9;
        int i10;
        Q0.C0 c10;
        Q0.C0765b0 c0765b1;
        ?? eVar2;
        ?? E10;
        int i11;
        J0.i iVar3 = this.f30824f.f5980a;
        int i12 = 262144;
        java.lang.Object obj = null;
        int i13 = 1;
        if (iVar3 == null || !iVar3.f26487u) {
            i9 = 262144;
            iVar = null;
        } else {
            if (!iVar3.f26475h.f26487u) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            p137q0.o oVar = iVar3.f26475h.f26478l;
            Q0.F fT = Q0.AbstractC0777k.t(iVar3);
            loop0: while (true) {
                if (fT == null) {
                    c10 = null;
                    break;
                }
                if ((fT.f8232N.f8391f.f26477k & i12) != 0) {
                    while (oVar != null) {
                        if ((oVar.j & i12) != 0) {
                            ?? r14 = 0;
                            ?? r13 = oVar;
                            while (r13 != 0) {
                                if (r13 instanceof Q0.C0) {
                                    c10 = (Q0.C0) r13;
                                    if (kotlin.jvm.internal.m.a(iVar3.g(), c10.g()) && J0.i.class == c10.getClass()) {
                                        break loop0;
                                    }
                                } else {
                                    if ((r13.j & i12) != 0 && (r13 instanceof Q0.AbstractC0776j)) {
                                        p137q0.o oVar2 = ((Q0.AbstractC0776j) r13).f8443w;
                                        int i14 = 0;
                                        while (oVar2 != null) {
                                            int i15 = i12;
                                            if ((oVar2.j & i15) != 0) {
                                                i14++;
                                                if (i14 == 1) {
                                                    E10 = r13;
                                                    eVar2 = r14;
                                                    eVar2 = eVar2;
                                                    E10 = oVar2;
                                                } else {
                                                    if (eVar2 == 0) {
                                                        eVar2 = new p038e0.e(new p137q0.o[16]);
                                                    }
                                                    if (E10 != 0) {
                                                        eVar2.c(E10);
                                                        E10 = 0;
                                                    }
                                                    eVar2.c(oVar2);
                                                }
                                            } else {
                                                E10 = r13;
                                                eVar2 = r14;
                                            }
                                            oVar2 = oVar2.f26479m;
                                            i12 = i15;
                                            E10 = E10;
                                            eVar2 = eVar2;
                                        }
                                        E10 = r13;
                                        eVar2 = r14;
                                        i11 = i12;
                                        eVar2 = eVar2;
                                        if (i14 == 1) {
                                        }
                                        i12 = i11;
                                        r13 = E10;
                                        r14 = eVar2;
                                    }
                                    E10 = Q0.AbstractC0777k.e(eVar2);
                                    i12 = i11;
                                    r13 = E10;
                                    r14 = eVar2;
                                }
                                i11 = i12;
                                eVar2 = r14;
                                E10 = Q0.AbstractC0777k.e(eVar2);
                                i12 = i11;
                                r13 = E10;
                                r14 = eVar2;
                            }
                        }
                        oVar = oVar.f26478l;
                        i12 = i12;
                    }
                }
                int i16 = i12;
                fT = fT.x();
                oVar = (fT == null || (c0765b1 = fT.f8232N) == null) ? null : c0765b1.f8390e;
                i12 = i16;
            }
            i9 = i12;
            iVar = (J0.i) c10;
        }
        long jH = iVar != null ? iVar.H(i3, j) : 0L;
        long jF = p181w0.a.f(j, jH);
        long jE = e(h(interfaceC3076x0.a(g(e(this.f30822d == x.EnumC3061p0.f30979i ? p181w0.a.a(1, jF, 0.0f) : p181w0.a.a(2, jF, 0.0f))))));
        x.P0 p2 = this.g;
        if (p2.f26487u) {
            android.view.ViewTreeObserver viewTreeObserver = ((androidx.compose.ui.platform.AndroidComposeView) Q0.AbstractC0777k.u(p2)).getViewTreeObserver();
            try {
                if (androidx.compose.ui.platform.AndroidComposeView.f15874W0 == null) {
                    java.lang.reflect.Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    androidx.compose.ui.platform.AndroidComposeView.f15874W0 = declaredMethod;
                }
                java.lang.reflect.Method method = androidx.compose.ui.platform.AndroidComposeView.f15874W0;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        long jF2 = p181w0.a.f(jF, jE);
        J0.i iVar4 = this.f30824f.f5980a;
        if (iVar4 == null || !iVar4.f26487u) {
            iVar2 = null;
        } else {
            if (!iVar4.f26475h.f26487u) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            p137q0.o oVar3 = iVar4.f26475h.f26478l;
            Q0.F fT2 = Q0.AbstractC0777k.t(iVar4);
            loop3: while (true) {
                if (fT2 == null) {
                    c9 = null;
                    break;
                }
                if ((fT2.f8232N.f8391f.f26477k & i9) != 0) {
                    while (oVar3 != null) {
                        if ((oVar3.j & i9) != 0) {
                            ?? r9 = oVar3;
                            ?? r10 = obj;
                            while (r9 != 0) {
                                if (r9 instanceof Q0.C0) {
                                    Q0.C0 c11 = (Q0.C0) r9;
                                    if (kotlin.jvm.internal.m.a(iVar4.g(), c11.g()) && J0.i.class == c11.getClass()) {
                                        c9 = c11;
                                        break loop3;
                                    }
                                } else {
                                    if ((r9.j & i9) != 0 && (r9 instanceof Q0.AbstractC0776j)) {
                                        p137q0.o oVar4 = ((Q0.AbstractC0776j) r9).f8443w;
                                        int i17 = 0;
                                        while (oVar4 != null) {
                                            if ((oVar4.j & i9) == 0) {
                                                E9 = r9;
                                                eVar = r10;
                                                E9 = E9;
                                            } else {
                                                i17++;
                                                if (i17 == i13) {
                                                    E9 = r9;
                                                    eVar = r10;
                                                    E9 = E9;
                                                    E9 = oVar4;
                                                    E9 = r9;
                                                    eVar = r10;
                                                    E9 = E9;
                                                } else {
                                                    eVar = eVar == 0 ? new p038e0.e(new p137q0.o[16]) : eVar;
                                                    if (E9 != 0) {
                                                        eVar.c(E9);
                                                        E9 = 0;
                                                    }
                                                    eVar.c(oVar4);
                                                }
                                            }
                                            oVar4 = oVar4.f26479m;
                                            i13 = 1;
                                            E9 = E9;
                                            eVar = eVar;
                                        }
                                        E9 = r9;
                                        eVar = r10;
                                        i10 = i13;
                                        eVar = eVar;
                                        if (i17 == i10) {
                                        }
                                        i13 = i10;
                                        r9 = E9;
                                        r10 = eVar;
                                    }
                                    E9 = Q0.AbstractC0777k.e(eVar);
                                    i13 = i10;
                                    r9 = E9;
                                    r10 = eVar;
                                }
                                i10 = i13;
                                eVar = r10;
                                E9 = Q0.AbstractC0777k.e(eVar);
                                i13 = i10;
                                r9 = E9;
                                r10 = eVar;
                            }
                        }
                        oVar3 = oVar3.f26478l;
                        i13 = i13;
                        obj = null;
                    }
                }
                int i18 = i13;
                fT2 = fT2.x();
                oVar3 = (fT2 == null || (c0765b0 = fT2.f8232N) == null) ? null : c0765b0.f8390e;
                i13 = i18;
                obj = null;
            }
            iVar2 = (J0.i) c9;
        }
        if (iVar2 != null) {
            jG0 = iVar2.g0(i3, jE, jF2);
            j9 = jE;
        } else {
            j9 = jE;
            jG0 = 0;
        }
        return p181w0.a.g(p181w0.a.g(jH, j9), jG0);
    }

    public final float d(float f9) {
        return this.f30823e ? f9 * (-1) : f9;
    }

    public final long e(long j) {
        return this.f30823e ? p181w0.a.h(j, -1.0f) : j;
    }

    public final java.lang.Object f(v.n0 n0Var, p194x6.m mVar, p117n6.c cVar) {
        java.lang.Object objC = this.f30819a.c(n0Var, new x.V0(this, mVar, null), cVar);
        return objC == p109m6.a.f25430h ? objC : p070h6.A.f22523a;
    }

    public final float g(long j) {
        return java.lang.Float.intBitsToFloat((int) (this.f30822d == x.EnumC3061p0.f30979i ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f9) {
        long jFloatToRawIntBits;
        long j;
        if (f9 == 0.0f) {
            return 0L;
        }
        if (this.f30822d == x.EnumC3061p0.f30979i) {
            long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f9);
            jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f9);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (jFloatToRawIntBits & 4294967295L);
    }

    public final float i(long j) {
        int i3 = (int) (4294967295L & j);
        int i9 = (int) (j >> 32);
        if (((float) java.lang.Math.atan2(java.lang.Math.abs(java.lang.Float.intBitsToFloat(i3)), java.lang.Math.abs(java.lang.Float.intBitsToFloat(i9)))) >= 0.7853981633974483d) {
            if (this.f30822d == x.EnumC3061p0.f30978h) {
                return java.lang.Float.intBitsToFloat(i3);
            }
            return 0.0f;
        }
        if (this.f30822d == x.EnumC3061p0.f30979i) {
            return java.lang.Float.intBitsToFloat(i9);
        }
        return 0.0f;
    }
}
