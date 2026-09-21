package J0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p137q0.o implements Q0.C0, J0.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public J0.a f5992v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public J0.d f5993w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public J0.i f5994x;
    public final java.lang.String y = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public i(J0.a aVar, J0.d dVar) {
        this.f5992v = aVar;
        this.f5993w = dVar;
    }

    @Override // p137q0.o
    public final void F0() {
        J0.d dVar = this.f5993w;
        dVar.f5980a = this;
        dVar.f5981b = null;
        this.f5994x = null;
        dVar.f5982c = new A8.m(3, this);
        dVar.f5983d = B0();
    }

    @Override // p137q0.o
    public final void G0() {
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        Q0.AbstractC0777k.x(this, new J0.j(a2, 0));
        J0.i iVar = (J0.i) ((Q0.C0) a2.f24539h);
        this.f5994x = iVar;
        J0.d dVar = this.f5993w;
        dVar.f5981b = iVar;
        if (dVar.f5980a == this) {
            dVar.f5980a = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // J0.a
    public final long H(int i3, long j) {
        Q0.C0765b0 c0765b0;
        boolean z6 = this.f26487u;
        J0.i iVar = null;
        Q0.C0 c9 = null;
        iVar = null;
        if (z6 && z6) {
            if (!this.f26475h.f26487u) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            p137q0.o oVar = this.f26475h.f26478l;
            Q0.F fT = Q0.AbstractC0777k.t(this);
            loop0: while (fT != null) {
                if ((fT.f8232N.f8391f.f26477k & 262144) != 0) {
                    while (oVar != null) {
                        if ((oVar.j & 262144) != 0) {
                            ?? E9 = oVar;
                            ?? eVar = 0;
                            while (E9 != 0) {
                                if (E9 instanceof Q0.C0) {
                                    Q0.C0 c10 = (Q0.C0) E9;
                                    if (kotlin.jvm.internal.m.a(g(), c10.g()) && J0.i.class == c10.getClass()) {
                                        c9 = c10;
                                        break loop0;
                                    }
                                } else if ((E9.j & 262144) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                                    p137q0.o oVar2 = ((Q0.AbstractC0776j) E9).f8443w;
                                    int i9 = 0;
                                    E9 = E9;
                                    eVar = eVar;
                                    while (oVar2 != null) {
                                        if ((oVar2.j & 262144) != 0) {
                                            i9++;
                                            if (i9 == 1) {
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
                                        }
                                        oVar2 = oVar2.f26479m;
                                        E9 = E9;
                                        eVar = eVar;
                                    }
                                    if (i9 == 1) {
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
            iVar = (J0.i) c9;
        }
        long jH = iVar != null ? iVar.H(i3, j) : 0L;
        return p181w0.a.g(jH, this.f5992v.H(i3, p181w0.a.f(j, jH)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final S7.A N0() {
        J0.i iVar;
        Q0.C0 c9;
        Q0.C0765b0 c0765b0;
        if (this.f26487u) {
            if (!this.f26475h.f26487u) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            p137q0.o oVar = this.f26475h.f26478l;
            Q0.F fT = Q0.AbstractC0777k.t(this);
            loop0: while (true) {
                if (fT == null) {
                    c9 = null;
                    break;
                }
                if ((fT.f8232N.f8391f.f26477k & 262144) != 0) {
                    while (oVar != null) {
                        if ((oVar.j & 262144) != 0) {
                            ?? E9 = oVar;
                            ?? eVar = 0;
                            while (E9 != 0) {
                                if (E9 instanceof Q0.C0) {
                                    c9 = (Q0.C0) E9;
                                    if (kotlin.jvm.internal.m.a(g(), c9.g()) && J0.i.class == c9.getClass()) {
                                        break loop0;
                                    }
                                } else if ((E9.j & 262144) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                                    p137q0.o oVar2 = ((Q0.AbstractC0776j) E9).f8443w;
                                    int i3 = 0;
                                    while (oVar2 != null) {
                                        if ((oVar2.j & 262144) != 0) {
                                            i3++;
                                            if (i3 == 1) {
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
                                    if (i3 == 1) {
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
            iVar = (J0.i) c9;
        } else {
            iVar = null;
        }
        S7.A aN0 = iVar != null ? iVar.N0() : null;
        if (aN0 != null && S7.C.x(aN0)) {
            return aN0;
        }
        S7.A a2 = this.f5993w.f5983d;
        if (a2 != null) {
            return a2;
        }
        throw new java.lang.IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // Q0.C0
    public final java.lang.Object g() {
        return this.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [J0.i] */
    /* JADX WARN: Type inference failed for: r3v10, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // J0.a
    public final long g0(int i3, long j, long j9) {
        Q0.C0765b0 c0765b0;
        long jG0 = this.f5992v.g0(i3, j, j9);
        boolean z6 = this.f26487u;
        Q0.C0 c9 = null;
        if (z6 && z6) {
            if (!this.f26475h.f26487u) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            p137q0.o oVar = this.f26475h.f26478l;
            Q0.F fT = Q0.AbstractC0777k.t(this);
            loop0: while (fT != null) {
                if ((fT.f8232N.f8391f.f26477k & 262144) != 0) {
                    while (oVar != null) {
                        if ((oVar.j & 262144) != 0) {
                            ?? E9 = oVar;
                            ?? eVar = 0;
                            while (E9 != 0) {
                                if (E9 instanceof Q0.C0) {
                                    Q0.C0 c10 = (Q0.C0) E9;
                                    if (kotlin.jvm.internal.m.a(g(), c10.g()) && J0.i.class == c10.getClass()) {
                                        c9 = c10;
                                        break loop0;
                                    }
                                } else if ((E9.j & 262144) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                                    p137q0.o oVar2 = ((Q0.AbstractC0776j) E9).f8443w;
                                    int i9 = 0;
                                    E9 = E9;
                                    eVar = eVar;
                                    while (oVar2 != null) {
                                        if ((oVar2.j & 262144) != 0) {
                                            i9++;
                                            if (i9 == 1) {
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
                                        }
                                        oVar2 = oVar2.f26479m;
                                        E9 = E9;
                                        eVar = eVar;
                                    }
                                    if (i9 == 1) {
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
            c9 = (J0.i) c9;
        }
        ?? r9 = c9;
        return p181w0.a.g(jG0, r9 != 0 ? r9.g0(i3, p181w0.a.g(j, jG0), p181w0.a.f(j9, jG0)) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r7v12 */
    @Override // J0.a
    public final java.lang.Object h0(long j, long j9, p100l6.c cVar) {
        J0.g gVar;
        long j10;
        long j11;
        long j12;
        J0.i iVar;
        long j13;
        long j14;
        Q0.C0 c9;
        Q0.C0765b0 c0765b0;
        int i3;
        ?? r16;
        ?? E9;
        int i9;
        if (cVar instanceof J0.g) {
            gVar = (J0.g) cVar;
            int i10 = gVar.f5988l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f5988l = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new J0.g(this, (p117n6.c) cVar);
            }
        } else {
            gVar = new J0.g(this, (p117n6.c) cVar);
        }
        J0.g gVar2 = gVar;
        java.lang.Object objH0 = gVar2.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = gVar2.f5988l;
        int i12 = 1;
        if (i11 == 0) {
            com.google.common.util.concurrent.P.u0(objH0);
            J0.a aVar2 = this.f5992v;
            gVar2.f5985h = j;
            gVar2.f5986i = j9;
            gVar2.f5988l = 1;
            objH0 = aVar2.h0(j, j9, gVar2);
            if (objH0 != aVar) {
                j10 = j;
                j11 = j9;
            }
            return aVar;
        }
        if (i11 == 1) {
            j11 = gVar2.f5986i;
            j10 = gVar2.f5985h;
            com.google.common.util.concurrent.P.u0(objH0);
        } else {
            if (i11 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j14 = gVar2.f5985h;
            com.google.common.util.concurrent.P.u0(objH0);
        }
        j13 = ((p113n1.r) objH0).f25573a;
        j12 = j14;
        return new p113n1.r(p113n1.r.e(j12, j13));
        j12 = ((p113n1.r) objH0).f25573a;
        boolean z6 = this.f26487u;
        if (!z6) {
            iVar = this.f5994x;
        } else if (z6 && z6) {
            if (!this.f26475h.f26487u) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            p137q0.o oVar = this.f26475h.f26478l;
            Q0.F fT = Q0.AbstractC0777k.t(this);
            loop0: while (true) {
                if (fT == null) {
                    c9 = null;
                    break;
                }
                int i13 = 262144;
                if ((fT.f8232N.f8391f.f26477k & 262144) != 0) {
                    while (oVar != null) {
                        if ((oVar.j & i13) != 0) {
                            ?? r14 = oVar;
                            ?? r17 = 0;
                            while (r14 != 0) {
                                if (r14 instanceof Q0.C0) {
                                    Q0.C0 c10 = (Q0.C0) r14;
                                    i3 = i13;
                                    if (kotlin.jvm.internal.m.a(g(), c10.g()) && J0.i.class == c10.getClass()) {
                                        c9 = c10;
                                        break loop0;
                                    }
                                } else {
                                    i3 = i13;
                                    if ((r14.j & i3) != 0 && (r14 instanceof Q0.AbstractC0776j)) {
                                        p137q0.o oVar2 = ((Q0.AbstractC0776j) r14).f8443w;
                                        int i14 = 0;
                                        while (oVar2 != null) {
                                            if ((oVar2.j & i3) != 0) {
                                                i14++;
                                                if (i14 == i12) {
                                                    E9 = r14;
                                                    r16 = r17;
                                                    E9 = oVar2;
                                                } else {
                                                    ?? eVar = r16 == 0 ? new p038e0.e(new p137q0.o[16]) : r16;
                                                    if (E9 != 0) {
                                                        eVar.c(E9);
                                                        E9 = 0;
                                                    }
                                                    eVar.c(oVar2);
                                                    r16 = eVar;
                                                }
                                            } else {
                                                E9 = r14;
                                                r16 = r17;
                                            }
                                            oVar2 = oVar2.f26479m;
                                            i12 = 1;
                                            E9 = E9;
                                            r16 = r16;
                                        }
                                        E9 = r14;
                                        r16 = r17;
                                        i9 = i12;
                                        r16 = r16;
                                        if (i14 == i9) {
                                        }
                                        i13 = i3;
                                        i12 = i9;
                                        r14 = E9;
                                        r17 = r16;
                                    }
                                    E9 = Q0.AbstractC0777k.e(r16);
                                    i13 = i3;
                                    i12 = i9;
                                    r14 = E9;
                                    r17 = r16;
                                }
                                i9 = i12;
                                r16 = r17;
                                E9 = Q0.AbstractC0777k.e(r16);
                                i13 = i3;
                                i12 = i9;
                                r14 = E9;
                                r17 = r16;
                            }
                        }
                        oVar = oVar.f26478l;
                        i13 = i13;
                        i12 = i12;
                    }
                }
                int i15 = i12;
                fT = fT.x();
                oVar = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
                i12 = i15;
            }
            iVar = (J0.i) c9;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            long jE = p113n1.r.e(j10, j12);
            long jD = p113n1.r.d(j11, j12);
            gVar2.f5985h = j12;
            gVar2.f5988l = 2;
            objH0 = iVar.h0(jE, jD, gVar2);
            if (objH0 != aVar) {
                j14 = j12;
                j13 = ((p113n1.r) objH0).f25573a;
                j12 = j14;
            }
            return aVar;
        }
        j13 = 0;
        return new p113n1.r(p113n1.r.e(j12, j13));
    }

    /* JADX WARN: Code duplicated, block: B:75:0x010d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f2, code lost:
    
        if (r3 == r5) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v7 */
    @Override // J0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object i(long j, p100l6.c cVar) {
        J0.h hVar;
        long j9;
        Q0.C0765b0 c0765b0;
        long j10;
        long j11 = j;
        if (cVar instanceof J0.h) {
            hVar = (J0.h) cVar;
            int i3 = hVar.f5991k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.f5991k = i3 - Integer.MIN_VALUE;
            } else {
                hVar = new J0.h(this, (p117n6.c) cVar);
            }
        } else {
            hVar = new J0.h(this, (p117n6.c) cVar);
        }
        java.lang.Object objI = hVar.f5990i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = hVar.f5991k;
        if (i9 != 0) {
            if (i9 == 1) {
                j11 = hVar.f5989h;
                com.google.common.util.concurrent.P.u0(objI);
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = hVar.f5989h;
                com.google.common.util.concurrent.P.u0(objI);
            }
            return new p113n1.r(p113n1.r.e(j10, ((p113n1.r) objI).f25573a));
        }
        com.google.common.util.concurrent.P.u0(objI);
        boolean z6 = this.f26487u;
        J0.i iVar = null;
        Q0.C0 c9 = null;
        iVar = null;
        if (z6 && z6) {
            if (!this.f26475h.f26487u) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            p137q0.o oVar = this.f26475h.f26478l;
            Q0.F fT = Q0.AbstractC0777k.t(this);
            loop0: while (fT != null) {
                if ((fT.f8232N.f8391f.f26477k & 262144) != 0) {
                    while (oVar != null) {
                        if ((oVar.j & 262144) != 0) {
                            ?? E9 = oVar;
                            ?? eVar = 0;
                            while (E9 != 0) {
                                if (E9 instanceof Q0.C0) {
                                    Q0.C0 c10 = (Q0.C0) E9;
                                    if (kotlin.jvm.internal.m.a(g(), c10.g()) && J0.i.class == c10.getClass()) {
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
            iVar = (J0.i) c9;
        }
        if (iVar != null) {
            hVar.f5989h = j11;
            hVar.f5991k = 1;
            objI = iVar.i(j11, hVar);
        } else {
            j9 = 0;
            J0.a aVar2 = this.f5992v;
            long jD = p113n1.r.d(j11, j9);
            hVar.f5989h = j9;
            hVar.f5991k = 2;
            objI = aVar2.i(jD, hVar);
            if (objI != aVar) {
                j10 = j9;
                return new p113n1.r(p113n1.r.e(j10, ((p113n1.r) objI).f25573a));
            }
        }
        return aVar;
        j9 = ((p113n1.r) objI).f25573a;
        J0.a aVar3 = this.f5992v;
        long jD2 = p113n1.r.d(j11, j9);
        hVar.f5989h = j9;
        hVar.f5991k = 2;
        objI = aVar3.i(jD2, hVar);
        if (objI != aVar) {
            j10 = j9;
            return new p113n1.r(p113n1.r.e(j10, ((p113n1.r) objI).f25573a));
        }
        return aVar;
    }
}
