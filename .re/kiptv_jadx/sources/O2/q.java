package O2;

/* JADX INFO: loaded from: classes.dex */
public final class q implements J2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f7930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S2.o f7931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p070h6.p f7932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p070h6.p f7933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p070h6.p f7934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O2.e f7935f;

    public q(java.lang.String str, S2.o oVar, p070h6.p pVar, p070h6.p pVar2, p070h6.p pVar3, O2.e eVar) {
        this.f7930a = str;
        this.f7931b = oVar;
        this.f7932c = pVar;
        this.f7933d = pVar2;
        this.f7934e = pVar3;
        this.f7935f = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object b(O2.q qVar, O2.v vVar, p117n6.c cVar) {
        O2.o oVar;
        M8.C0682j c0682j;
        if (cVar instanceof O2.o) {
            oVar = (O2.o) cVar;
            int i3 = oVar.f7924l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oVar.f7924l = i3 - Integer.MIN_VALUE;
            } else {
                oVar = new O2.o(qVar, cVar);
            }
        } else {
            oVar = new O2.o(qVar, cVar);
        }
        java.lang.Object obj = oVar.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = oVar.f7924l;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            c0682j = new M8.C0682j();
            oVar.f7921h = qVar;
            oVar.f7922i = c0682j;
            oVar.f7924l = 1;
            vVar.f7949h.k(c0682j);
            if (p070h6.A.f22523a == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            M8.C0682j c0682j2 = oVar.f7922i;
            O2.q qVar2 = oVar.f7921h;
            com.google.common.util.concurrent.P.u0(obj);
            c0682j = c0682j2;
            qVar = qVar2;
        }
        return new H2.s(c0682j, qVar.e(), null);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0214  */
    /* JADX WARN: Code duplicated, block: B:112:0x0225 A[Catch: Exception -> 0x004b, TryCatch #2 {Exception -> 0x004b, blocks: (B:13:0x0044, B:106:0x020b, B:107:0x0213, B:110:0x0222, B:112:0x0225, B:116:0x0230, B:117:0x0231, B:109:0x0215), top: B:139:0x0044, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x022c  */
    /* JADX WARN: Code duplicated, block: B:132:0x024c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0246 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x023c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0194  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24 */
    public static final java.lang.Object c(O2.q qVar, I2.g gVar, O2.u uVar, O2.u uVar2, p117n6.c cVar) {
        O2.p pVar;
        O2.q qVar2;
        I2.f fVar;
        O2.u uVar3;
        ?? th;
        ?? th2;
        F.i0 i0VarE;
        O2.v vVar;
        O2.v vVar2;
        F.i0 i0Var;
        I2.e eVar;
        I2.b bVarI;
        I2.g gVar2 = gVar;
        O2.u uVar4 = uVar2;
        qVar.getClass();
        if (cVar instanceof O2.p) {
            pVar = (O2.p) cVar;
            int i3 = pVar.f7929m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pVar.f7929m = i3 - Integer.MIN_VALUE;
            } else {
                pVar = new O2.p(qVar, cVar);
            }
        } else {
            pVar = new O2.p(qVar, cVar);
        }
        java.lang.Object bVar = pVar.f7927k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = pVar.f7929m;
        I2.f fVar2 = null;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(bVar);
            if (!qVar.f7931b.f9290h.f9215i) {
                if (gVar2 != null) {
                    try {
                        com.google.android.gms.internal.play_billing.M0.v(gVar2);
                        return null;
                    } catch (java.lang.RuntimeException e6) {
                        throw e6;
                    } catch (java.lang.Exception unused) {
                    }
                }
                return null;
            }
            O2.c cVar2 = (O2.c) qVar.f7934e.getValue();
            pVar.f7925h = qVar;
            pVar.f7926i = gVar2;
            pVar.j = uVar4;
            pVar.f7929m = 1;
            ((P2.a) cVar2).getClass();
            if (uVar4.f7943a != 304 || uVar == null) {
                bVar = new O2.b(uVar4);
            } else {
                O2.s sVar = uVar.f7946d;
                sVar.getClass();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : sVar.f7938a.entrySet()) {
                    linkedHashMap.put(entry.getKey(), p078i6.o.O1((java.util.Collection) entry.getValue()));
                }
                for (java.util.Map.Entry entry2 : uVar4.f7946d.f7938a.entrySet()) {
                    java.lang.String str = (java.lang.String) entry2.getKey();
                    java.util.List list = (java.util.List) entry2.getValue();
                    java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                    linkedHashMap.put(lowerCase, p078i6.o.O1(list));
                }
                bVar = new O2.b(new O2.u(uVar4.f7943a, uVar4.f7944b, uVar4.f7945c, new O2.s(p078i6.C.Y0(linkedHashMap)), null, uVar4.f7948f));
            }
            if (bVar == aVar) {
                return aVar;
            }
            qVar2 = qVar;
        } else {
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar = (I2.f) pVar.j;
                uVar3 = (O2.u) pVar.f7926i;
                uVar4 = (O2.u) pVar.f7925h;
                try {
                    com.google.common.util.concurrent.P.u0(bVar);
                    fVar2 = null;
                    i0Var = fVar.f4600a;
                    eVar = (I2.e) i0Var.f3467d;
                    synchronized (eVar.f4590o) {
                        i0Var.d(true);
                        bVarI = eVar.i(((I2.a) i0Var.f3465b).f4573a);
                    }
                    return bVarI != null ? new I2.g(bVarI) : fVar2;
                } catch (java.lang.Exception e9) {
                    e = e9;
                    try {
                        fVar.f4600a.d(false);
                    } catch (java.lang.Exception unused2) {
                    }
                    vVar = uVar4.f7947e;
                    if (vVar != null) {
                        try {
                            com.google.android.gms.internal.play_billing.M0.v(vVar);
                        } catch (java.lang.RuntimeException e10) {
                            throw e10;
                        } catch (java.lang.Exception unused3) {
                        }
                    }
                    vVar2 = uVar3.f7947e;
                    if (vVar2 != null) {
                        throw e;
                    }
                    try {
                        com.google.android.gms.internal.play_billing.M0.v(vVar2);
                        throw e;
                    } catch (java.lang.RuntimeException e11) {
                        throw e11;
                    } catch (java.lang.Exception unused4) {
                        throw e;
                    }
                }
            }
            O2.u uVar5 = (O2.u) pVar.j;
            gVar2 = (I2.g) pVar.f7926i;
            qVar2 = (O2.q) pVar.f7925h;
            com.google.common.util.concurrent.P.u0(bVar);
            uVar4 = uVar5;
            fVar2 = null;
        }
        O2.u uVar6 = ((O2.b) bVar).f7886a;
        if (uVar6 == null) {
            return fVar2;
        }
        if (gVar2 != null) {
            I2.b bVar2 = gVar2.f4601h;
            I2.e eVar2 = bVar2.j;
            synchronized (eVar2.f4590o) {
                bVar2.close();
                i0VarE = eVar2.e(bVar2.f4581h.f4573a);
            }
            if (i0VarE != null) {
                fVar = new I2.f(i0VarE);
            } else {
                fVar = fVar2;
            }
        } else {
            I2.h hVar = (I2.h) qVar2.f7933d.getValue();
            if (hVar == null) {
                fVar = fVar2;
            } else {
                java.lang.String str2 = qVar2.f7931b.f9288e;
                if (str2 == null) {
                    str2 = qVar2.f7930a;
                }
                I2.e eVar3 = hVar.f4603b;
                M8.C0685m c0685m = M8.C0685m.f7261k;
                F.i0 i0VarE2 = eVar3.e(B3.o.j(str2).c("SHA-256").e());
                if (i0VarE2 != null) {
                    fVar = new I2.f(i0VarE2);
                } else {
                    fVar = fVar2;
                }
            }
        }
        if (fVar == null) {
            return fVar2;
        }
        try {
            M8.D dB = M8.AbstractC0674b.b(qVar2.e().G(fVar.f4600a.f(0), false));
            try {
                N3.a.G(uVar6, dB);
                try {
                    dB.close();
                    th = fVar2;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            } catch (java.lang.Throwable th4) {
                try {
                    dB.close();
                } catch (java.lang.Throwable th5) {
                    com.google.common.util.concurrent.AbstractC1903s.j(th4, th5);
                }
                th = th4;
            }
            if (th != 0) {
                throw th;
            }
            O2.v vVar3 = uVar6.f7947e;
            if (vVar3 != null) {
                M8.q qVarE = qVar2.e();
                M8.A aF = fVar.f4600a.f(1);
                pVar.f7925h = uVar4;
                pVar.f7926i = uVar6;
                pVar.j = fVar;
                pVar.f7929m = 2;
                M8.InterfaceC0684l interfaceC0684l = vVar3.f7949h;
                M8.D dB2 = M8.AbstractC0674b.b(qVarE.G(aF, false));
                try {
                    p117n6.f.b(interfaceC0684l.k(dB2));
                    try {
                        dB2.close();
                        th2 = fVar2;
                    } catch (java.lang.Throwable th6) {
                        th2 = th6;
                    }
                } catch (java.lang.Throwable th7) {
                    try {
                        dB2.close();
                    } catch (java.lang.Throwable th8) {
                        com.google.common.util.concurrent.AbstractC1903s.j(th7, th8);
                    }
                    th2 = th7;
                }
                if (th2 != 0) {
                    throw th2;
                }
                if (p070h6.A.f22523a == aVar) {
                    return aVar;
                }
            }
            uVar3 = uVar6;
            i0Var = fVar.f4600a;
            eVar = (I2.e) i0Var.f3467d;
            synchronized (eVar.f4590o) {
                i0Var.d(true);
                bVarI = eVar.i(((I2.a) i0Var.f3465b).f4573a);
                if (bVarI != null) {
                }
            }
        } catch (java.lang.Exception e12) {
            e = e12;
            uVar3 = uVar6;
            fVar.f4600a.d(false);
            vVar = uVar4.f7947e;
            if (vVar != null) {
                com.google.android.gms.internal.play_billing.M0.v(vVar);
            }
            vVar2 = uVar3.f7947e;
            if (vVar2 != null) {
                throw e;
            }
            com.google.android.gms.internal.play_billing.M0.v(vVar2);
            throw e;
        }
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2) {
        java.lang.String strE;
        if ((str2 == null || O7.x.x0(str2, "text/plain", false)) && (strE = O7.r.E(str)) != null) {
            return strE;
        }
        if (str2 != null) {
            return O7.q.l1(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:73:0x0172  */
    /* JADX WARN: Code duplicated, block: B:76:0x0178 A[Catch: Exception -> 0x004d, TRY_LEAVE, TryCatch #2 {Exception -> 0x004d, blocks: (B:21:0x0048, B:74:0x0174, B:76:0x0178), top: B:97:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x018e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a4  */
    @Override // J2.g
    public final java.lang.Object a(p100l6.c cVar) throws java.lang.Exception {
        O2.l lVar;
        I2.g gVar;
        kotlin.jvm.internal.A a2;
        kotlin.jvm.internal.A a9;
        O2.q qVar;
        kotlin.jvm.internal.A a10;
        kotlin.jvm.internal.A a11;
        O2.q qVar2;
        I2.h hVar;
        java.lang.Exception exc;
        kotlin.jvm.internal.A a12;
        O2.q qVar3;
        J2.i iVar;
        I2.g gVar2;
        if (cVar instanceof O2.l) {
            lVar = (O2.l) cVar;
            int i3 = lVar.f7912m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lVar.f7912m = i3 - Integer.MIN_VALUE;
            } else {
                lVar = new O2.l(this, (p117n6.c) cVar);
            }
        } else {
            lVar = new O2.l(this, (p117n6.c) cVar);
        }
        java.lang.Object objD = lVar.f7910k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = lVar.f7912m;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objD);
            kotlin.jvm.internal.A a13 = new kotlin.jvm.internal.A();
            S2.o oVar = this.f7931b;
            boolean z6 = oVar.f9290h.f9214h;
            java.lang.String str = this.f7930a;
            if (!z6 || (hVar = (I2.h) this.f7933d.getValue()) == null) {
                gVar = null;
            } else {
                java.lang.String str2 = oVar.f9288e;
                if (str2 == null) {
                    str2 = str;
                }
                M8.C0685m c0685m = M8.C0685m.f7261k;
                I2.b bVarI = hVar.f4603b.i(B3.o.j(str2).c("SHA-256").e());
                if (bVarI != null) {
                    gVar = new I2.g(bVarI);
                } else {
                    gVar = null;
                }
            }
            a13.f24539h = gVar;
            try {
                a9 = new kotlin.jvm.internal.A();
                try {
                    if (gVar != null) {
                        M8.q qVarE = e();
                        I2.b bVar = ((I2.g) a13.f24539h).f4601h;
                        if (bVar.f4582i) {
                            throw new java.lang.IllegalStateException("snapshot is closed");
                        }
                        java.lang.Long l2 = qVarE.v((M8.A) bVar.f4581h.f4575c.get(0)).f7271d;
                        if (l2 != null && l2.longValue() == 0) {
                            return new J2.i(h((I2.g) a13.f24539h), f(str, null), H2.h.j);
                        }
                        O2.u uVarI = i((I2.g) a13.f24539h);
                        a9.f24539h = uVarI;
                        if (uVarI != null) {
                            O2.c cVar2 = (O2.c) this.f7934e.getValue();
                            O2.u uVar = (O2.u) a9.f24539h;
                            g();
                            lVar.f7908h = this;
                            lVar.f7909i = a13;
                            lVar.j = a9;
                            lVar.f7912m = 1;
                            ((P2.a) cVar2).getClass();
                            O2.a aVar2 = new O2.a(uVar);
                            if (aVar2 != aVar) {
                                a11 = a13;
                                objD = aVar2;
                                qVar2 = this;
                            }
                        }
                        return aVar;
                    }
                    O2.t tVarG = qVar.g();
                    O2.n nVar = new O2.n(a10, qVar, a, tVarG, null);
                    lVar.f7908h = qVar;
                    lVar.f7909i = a10;
                    lVar.j = null;
                    lVar.f7912m = 2;
                    objD = qVar.d(tVarG, nVar, lVar);
                    if (objD != aVar) {
                        a12 = a10;
                        qVar3 = qVar;
                        iVar = (J2.i) objD;
                        if (iVar != null) {
                            return iVar;
                        }
                        O2.t tVarG2 = qVar3.g();
                        O2.m mVar = new O2.m(qVar3, null);
                        lVar.f7908h = a12;
                        lVar.f7909i = null;
                        lVar.f7912m = 3;
                        objD = qVar3.d(tVarG2, mVar, lVar);
                        if (objD != aVar) {
                            a2 = a12;
                            return (J2.i) objD;
                        }
                    }
                    return aVar;
                } catch (java.lang.Exception e6) {
                    exc = e6;
                    a2 = a10;
                    gVar2 = (I2.g) a2.f24539h;
                    if (gVar2 == null) {
                        throw exc;
                    }
                    com.google.android.gms.internal.play_billing.M0.v(gVar2);
                    throw exc;
                }
                qVar = this;
                a10 = a13;
                kotlin.jvm.internal.A a14 = a9;
            } catch (java.lang.Exception e9) {
                e = e9;
                a2 = a13;
                exc = e;
                gVar2 = (I2.g) a2.f24539h;
                if (gVar2 == null) {
                    throw exc;
                }
                com.google.android.gms.internal.play_billing.M0.v(gVar2);
                throw exc;
            }
        } else {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a2 = (kotlin.jvm.internal.A) lVar.f7908h;
                    try {
                        com.google.common.util.concurrent.P.u0(objD);
                        return (J2.i) objD;
                    } catch (java.lang.Exception e10) {
                        e = e10;
                        exc = e;
                        gVar2 = (I2.g) a2.f24539h;
                        if (gVar2 == null) {
                            throw exc;
                        }
                        try {
                            com.google.android.gms.internal.play_billing.M0.v(gVar2);
                            throw exc;
                        } catch (java.lang.RuntimeException e11) {
                            throw e11;
                        } catch (java.lang.Exception unused) {
                            throw exc;
                        }
                    }
                }
                a12 = lVar.f7909i;
                qVar3 = (O2.q) lVar.f7908h;
                try {
                    com.google.common.util.concurrent.P.u0(objD);
                    iVar = (J2.i) objD;
                    if (iVar != null) {
                        return iVar;
                    }
                    O2.t tVarG3 = qVar3.g();
                    O2.m mVar2 = new O2.m(qVar3, null);
                    lVar.f7908h = a12;
                    lVar.f7909i = null;
                    lVar.f7912m = 3;
                    objD = qVar3.d(tVarG3, mVar2, lVar);
                    if (objD != aVar) {
                        a2 = a12;
                        return (J2.i) objD;
                    }
                    return aVar;
                } catch (java.lang.Exception e12) {
                    exc = e12;
                    a2 = a12;
                    gVar2 = (I2.g) a2.f24539h;
                    if (gVar2 == null) {
                        throw exc;
                    }
                    com.google.android.gms.internal.play_billing.M0.v(gVar2);
                    throw exc;
                }
            }
            a9 = lVar.j;
            a11 = lVar.f7909i;
            qVar2 = (O2.q) lVar.f7908h;
            try {
                com.google.common.util.concurrent.P.u0(objD);
            } catch (java.lang.Exception e13) {
                exc = e13;
                a2 = a11;
                gVar2 = (I2.g) a2.f24539h;
                if (gVar2 == null) {
                    throw exc;
                }
                com.google.android.gms.internal.play_billing.M0.v(gVar2);
                throw exc;
            }
        }
        O2.a aVar3 = (O2.a) objD;
        if (aVar3.f7885a != null) {
            return new J2.i(qVar2.h((I2.g) a11.f24539h), f(qVar2.f7930a, aVar3.f7885a.f7946d.a()), H2.h.j);
        }
        a10 = a11;
        qVar = qVar2;
        kotlin.jvm.internal.A a15 = a9;
        O2.t tVarG4 = qVar.g();
        O2.n nVar2 = new O2.n(a10, qVar, a15, tVarG4, null);
        lVar.f7908h = qVar;
        lVar.f7909i = a10;
        lVar.j = null;
        lVar.f7912m = 2;
        objD = qVar.d(tVarG4, nVar2, lVar);
        if (objD != aVar) {
            a12 = a10;
            qVar3 = qVar;
            iVar = (J2.i) objD;
            if (iVar != null) {
                return iVar;
            }
            O2.t tVarG5 = qVar3.g();
            O2.m mVar3 = new O2.m(qVar3, null);
            lVar.f7908h = a12;
            lVar.f7909i = null;
            lVar.f7912m = 3;
            objD = qVar3.d(tVarG5, mVar3, lVar);
            if (objD != aVar) {
                a2 = a12;
                return (J2.i) objD;
            }
        }
        return aVar;
    }

    public final java.lang.Object d(O2.t tVar, p194x6.m mVar, O2.l lVar) {
        if (this.f7931b.f9291i.f9214h && kotlin.jvm.internal.m.a(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new android.os.NetworkOnMainThreadException();
        }
        R2.b bVar = (R2.b) this.f7932c.getValue();
        return R2.b.a(bVar.f9045a, tVar, new O2.k(mVar, null), lVar);
    }

    public final M8.q e() {
        M8.w wVar;
        I2.h hVar = (I2.h) this.f7933d.getValue();
        return (hVar == null || (wVar = hVar.f4602a) == null) ? this.f7931b.f9289f : wVar;
    }

    public final O2.t g() {
        E2.j jVar = O2.h.f7900b;
        S2.o oVar = this.f7931b;
        O2.s sVar = (O2.s) E2.p.e(oVar, jVar);
        sVar.getClass();
        O2.r rVar = new O2.r(sVar);
        S2.c cVar = oVar.f9290h;
        boolean z6 = cVar.f9214h;
        boolean z9 = oVar.f9291i.f9214h && this.f7935f.a();
        if (!z9 && z6) {
            rVar.a("only-if-cached, max-stale=2147483647");
        } else if (!z9 || z6) {
            if (!z9 && !z6) {
                rVar.a("no-cache, only-if-cached");
            }
        } else if (cVar.f9215i) {
            rVar.a(io.ktor.client.utils.CacheControl.NO_CACHE);
        } else {
            rVar.a("no-cache, no-store");
        }
        java.lang.String str = (java.lang.String) E2.p.e(oVar, O2.h.f7899a);
        O2.s sVar2 = new O2.s(p078i6.C.Y0(rVar.f7936a));
        if (E2.p.e(oVar, O2.h.f7901c) == null) {
            return new O2.t(this.f7930a, str, sVar2, oVar.j);
        }
        throw new java.lang.ClassCastException();
    }

    public final H2.p h(I2.g gVar) {
        I2.b bVar = gVar.f4601h;
        if (bVar.f4582i) {
            throw new java.lang.IllegalStateException("snapshot is closed");
        }
        M8.A a2 = (M8.A) bVar.f4581h.f4575c.get(1);
        M8.q qVarE = e();
        java.lang.String str = this.f7931b.f9288e;
        if (str == null) {
            str = this.f7930a;
        }
        return P3.e.e(a2, qVarE, str, gVar, 16);
    }

    public final O2.u i(I2.g gVar) throws java.lang.Throwable {
        java.lang.Throwable th;
        O2.u uVarB;
        try {
            M8.q qVarE = e();
            I2.b bVar = gVar.f4601h;
            if (bVar.f4582i) {
                throw new java.lang.IllegalStateException("snapshot is closed");
            }
            M8.E eC = M8.AbstractC0674b.c(qVarE.N((M8.A) bVar.f4581h.f4575c.get(0)));
            try {
                uVarB = N3.a.B(eC);
                try {
                    eC.close();
                    th = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    eC.close();
                } catch (java.lang.Throwable th4) {
                    com.google.common.util.concurrent.AbstractC1903s.j(th3, th4);
                }
                th = th3;
                uVarB = null;
            }
            if (th == null) {
                return uVarB;
            }
            throw th;
        } catch (java.io.IOException unused) {
            return null;
        }
    }
}
