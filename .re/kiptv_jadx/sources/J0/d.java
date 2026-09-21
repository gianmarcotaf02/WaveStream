package J0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public J0.i f5980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public J0.i f5981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.o f5982c = new A8.m(2, this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public S7.A f5983d;

    /* JADX WARN: Code duplicated, block: B:78:0x0114  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01c5, code lost:
    
        if (r1 == r2) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01c7, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010a, code lost:
    
        if (r1 == r2) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r14v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(long j, long j9, p117n6.c cVar) {
        J0.b bVar;
        int i3;
        J0.i iVar;
        J0.i iVar2;
        Q0.C0 c9;
        Q0.C0765b0 c0765b0;
        long j10;
        Q0.C0 c10;
        Q0.C0765b0 c0765b1;
        ?? E9;
        if (cVar instanceof J0.b) {
            bVar = (J0.b) cVar;
            int i9 = bVar.j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.j = i9 - Integer.MIN_VALUE;
            } else {
                bVar = new J0.b(this, cVar);
            }
        } else {
            bVar = new J0.b(this, cVar);
        }
        J0.b bVar2 = bVar;
        java.lang.Object objH0 = bVar2.f5976h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = bVar2.j;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(objH0);
            J0.i iVar3 = this.f5980a;
            int i11 = 262144;
            if (iVar3 == null || !iVar3.f26487u) {
                i3 = 262144;
                iVar = null;
            } else {
                if (!iVar3.f26475h.f26487u) {
                    N0.a.b("visitAncestors called on an unattached node");
                }
                p137q0.o oVar = iVar3.f26475h.f26478l;
                Q0.F fT = Q0.AbstractC0777k.t(iVar3);
                loop0: while (true) {
                    if (fT == null) {
                        i3 = i11;
                        c10 = null;
                        break;
                    }
                    if ((fT.f8232N.f8391f.f26477k & i11) != 0) {
                        while (oVar != null) {
                            if ((oVar.j & i11) != 0) {
                                ?? r14 = oVar;
                                ?? eVar = 0;
                                while (r14 != 0) {
                                    if (r14 instanceof Q0.C0) {
                                        c10 = (Q0.C0) r14;
                                        i3 = i11;
                                        if (kotlin.jvm.internal.m.a(iVar3.g(), c10.g()) && J0.i.class == c10.getClass()) {
                                            break loop0;
                                        }
                                    } else {
                                        i3 = i11;
                                        if ((r14.j & i3) != 0 && (r14 instanceof Q0.AbstractC0776j)) {
                                            p137q0.o oVar2 = ((Q0.AbstractC0776j) r14).f8443w;
                                            int i12 = 0;
                                            while (oVar2 != null) {
                                                if ((oVar2.j & i3) != 0) {
                                                    i12++;
                                                    if (i12 == 1) {
                                                        E9 = r14;
                                                        eVar = eVar;
                                                        eVar = eVar;
                                                        E9 = oVar2;
                                                    } else {
                                                        if (eVar == 0) {
                                                            eVar = new p038e0.e(new p137q0.o[16]);
                                                        }
                                                        if (E9 != 0) {
                                                            eVar.c(E9);
                                                            E9 = 0;
                                                        }
                                                        eVar.c(oVar2);
                                                    }
                                                } else {
                                                    E9 = r14;
                                                    eVar = eVar;
                                                }
                                                oVar2 = oVar2.f26479m;
                                                E9 = E9;
                                                eVar = eVar;
                                            }
                                            if (i12 == 1) {
                                                E9 = r14;
                                                eVar = eVar;
                                            }
                                        }
                                        i11 = i3;
                                        r14 = E9;
                                        eVar = eVar;
                                    }
                                    E9 = r14;
                                    eVar = eVar;
                                    E9 = Q0.AbstractC0777k.e(eVar);
                                    i11 = i3;
                                    r14 = E9;
                                    eVar = eVar;
                                }
                            }
                            oVar = oVar.f26478l;
                            i11 = i11;
                        }
                    }
                    int i13 = i11;
                    fT = fT.x();
                    oVar = (fT == null || (c0765b1 = fT.f8232N) == null) ? null : c0765b1.f8390e;
                    i11 = i13;
                }
                iVar = (J0.i) c10;
            }
            if (iVar == null) {
                J0.i iVar4 = this.f5981b;
                if (iVar4 != null) {
                    bVar2.j = 1;
                    objH0 = iVar4.h0(j, j9, bVar2);
                } else {
                    j10 = 0;
                }
            } else {
                J0.i iVar5 = this.f5980a;
                if (iVar5 == null || !iVar5.f26487u) {
                    iVar2 = null;
                } else {
                    if (!iVar5.f26475h.f26487u) {
                        N0.a.b("visitAncestors called on an unattached node");
                    }
                    p137q0.o oVar3 = iVar5.f26475h.f26478l;
                    Q0.F fT2 = Q0.AbstractC0777k.t(iVar5);
                    loop3: while (true) {
                        if (fT2 == null) {
                            c9 = null;
                            break;
                        }
                        if ((fT2.f8232N.f8391f.f26477k & i3) != 0) {
                            while (oVar3 != null) {
                                if ((oVar3.j & i3) != 0) {
                                    ?? E10 = oVar3;
                                    ?? eVar2 = 0;
                                    while (E10 != 0) {
                                        if (E10 instanceof Q0.C0) {
                                            Q0.C0 c11 = (Q0.C0) E10;
                                            if (kotlin.jvm.internal.m.a(iVar5.g(), c11.g()) && J0.i.class == c11.getClass()) {
                                                c9 = c11;
                                                break loop3;
                                            }
                                        } else if ((E10.j & i3) != 0 && (E10 instanceof Q0.AbstractC0776j)) {
                                            p137q0.o oVar4 = ((Q0.AbstractC0776j) E10).f8443w;
                                            int i14 = 0;
                                            while (oVar4 != null) {
                                                if ((oVar4.j & i3) != 0) {
                                                    i14++;
                                                    if (i14 == 1) {
                                                        E10 = E10;
                                                        eVar2 = eVar2;
                                                        eVar2 = eVar2;
                                                        E10 = oVar4;
                                                    } else {
                                                        if (eVar2 == 0) {
                                                            eVar2 = new p038e0.e(new p137q0.o[16]);
                                                        }
                                                        if (E10 != 0) {
                                                            eVar2.c(E10);
                                                            E10 = 0;
                                                        }
                                                        eVar2.c(oVar4);
                                                    }
                                                } else {
                                                    E10 = E10;
                                                    eVar2 = eVar2;
                                                }
                                                oVar4 = oVar4.f26479m;
                                                E10 = E10;
                                                eVar2 = eVar2;
                                            }
                                            if (i14 == 1) {
                                                E10 = E10;
                                                eVar2 = eVar2;
                                            } else {
                                                E10 = E10;
                                                eVar2 = eVar2;
                                            }
                                        }
                                        E10 = Q0.AbstractC0777k.e(eVar2);
                                    }
                                }
                                oVar3 = oVar3.f26478l;
                            }
                        }
                        fT2 = fT2.x();
                        oVar3 = (fT2 == null || (c0765b0 = fT2.f8232N) == null) ? null : c0765b0.f8390e;
                    }
                    iVar2 = (J0.i) c9;
                }
                if (iVar2 != null) {
                    bVar2.j = 2;
                    objH0 = iVar2.h0(j, j9, bVar2);
                } else {
                    j10 = 0;
                }
            }
        } else if (i10 == 1) {
            com.google.common.util.concurrent.P.u0(objH0);
            j10 = ((p113n1.r) objH0).f25573a;
        } else {
            if (i10 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objH0);
            j10 = ((p113n1.r) objH0).f25573a;
        }
        return new p113n1.r(j10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final java.lang.Object b(long j, p117n6.c cVar) {
        J0.c cVar2;
        long j9;
        Q0.C0765b0 c0765b0;
        if (cVar instanceof J0.c) {
            cVar2 = (J0.c) cVar;
            int i3 = cVar2.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar2.j = i3 - Integer.MIN_VALUE;
            } else {
                cVar2 = new J0.c(this, cVar);
            }
        } else {
            cVar2 = new J0.c(this, cVar);
        }
        java.lang.Object objI = cVar2.f5978h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = cVar2.j;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objI);
            J0.i iVar = this.f5980a;
            J0.i iVar2 = null;
            Q0.C0 c9 = null;
            iVar2 = null;
            if (iVar != null && iVar.f26487u) {
                if (!iVar.f26475h.f26487u) {
                    N0.a.b("visitAncestors called on an unattached node");
                }
                p137q0.o oVar = iVar.f26475h.f26478l;
                Q0.F fT = Q0.AbstractC0777k.t(iVar);
                loop0: while (fT != null) {
                    if ((fT.f8232N.f8391f.f26477k & 262144) != 0) {
                        while (oVar != null) {
                            if ((oVar.j & 262144) != 0) {
                                ?? eVar = 0;
                                ?? E9 = oVar;
                                while (E9 != 0) {
                                    if (E9 instanceof Q0.C0) {
                                        Q0.C0 c10 = (Q0.C0) E9;
                                        if (kotlin.jvm.internal.m.a(iVar.g(), c10.g()) && J0.i.class == c10.getClass()) {
                                            c9 = c10;
                                            break loop0;
                                        }
                                    } else if ((E9.j & 262144) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                                        p137q0.o oVar2 = ((Q0.AbstractC0776j) E9).f8443w;
                                        int i10 = 0;
                                        while (oVar2 != null) {
                                            if ((oVar2.j & 262144) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    E9 = E9;
                                                    eVar = eVar;
                                                    eVar = eVar;
                                                    E9 = oVar2;
                                                } else {
                                                    if (eVar == 0) {
                                                        eVar = new p038e0.e(new p137q0.o[16]);
                                                    }
                                                    if (E9 != 0) {
                                                        eVar.c(E9);
                                                        E9 = 0;
                                                    }
                                                    eVar.c(oVar2);
                                                }
                                            } else {
                                                E9 = E9;
                                                eVar = eVar;
                                            }
                                            oVar2 = oVar2.f26479m;
                                            E9 = E9;
                                            eVar = eVar;
                                        }
                                        if (i10 == 1) {
                                            E9 = E9;
                                            eVar = eVar;
                                        } else {
                                            E9 = E9;
                                            eVar = eVar;
                                        }
                                    }
                                    E9 = Q0.AbstractC0777k.e(eVar);
                                }
                            }
                            oVar = oVar.f26478l;
                        }
                    }
                    fT = fT.x();
                    oVar = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
                }
                iVar2 = (J0.i) c9;
            }
            if (iVar2 != null) {
                cVar2.j = 1;
                objI = iVar2.i(j, cVar2);
                if (objI == aVar) {
                    return aVar;
                }
            } else {
                j9 = 0;
            }
            return new p113n1.r(j9);
        }
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.google.common.util.concurrent.P.u0(objI);
        j9 = ((p113n1.r) objI).f25573a;
        return new p113n1.r(j9);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.o] */
    public final S7.A c() {
        S7.A a2 = (S7.A) this.f5982c.invoke();
        if (a2 != null) {
            return a2;
        }
        throw new java.lang.IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
