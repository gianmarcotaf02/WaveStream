package K0;

/* JADX INFO: renamed from: K0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0665m extends K0.C0666n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p137q0.o f6716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y2.L f6717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p136q.r f6718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.compose.ui.node.NodeCoordinator f6719f;
    public K0.C0667o g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6721i;
    public boolean j;

    public C0665m(p137q0.o oVar) {
        this.f6716c = oVar;
        Y2.L l2 = new Y2.L((char) 0, 4);
        l2.j = new long[2];
        this.f6717d = l2;
        this.f6718e = new p136q.r(2);
        this.f6721i = true;
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0304  */
    /* JADX WARN: Code duplicated, block: B:63:0x0166  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r5v1, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // K0.C0666n
    public final boolean a(p136q.r rVar, O0.InterfaceC0732v interfaceC0732v, K0.C0661i c0661i, boolean z6) {
        p136q.r rVar2;
        Y2.L l2;
        java.lang.Object obj;
        boolean z9;
        boolean z10;
        K0.C0667o c0667o;
        int i3;
        int i9;
        boolean z11;
        boolean zA = super.a(rVar, interfaceC0732v, c0661i, z6);
        ?? E9 = this.f6716c;
        boolean z12 = true;
        if (E9.f26487u) {
            ?? eVar = 0;
            while (E9 != 0) {
                if (E9 instanceof Q0.t0) {
                    this.f6719f = Q0.AbstractC0777k.r((Q0.t0) E9, 16);
                } else if ((E9.j & 16) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                    p137q0.o oVar = ((Q0.AbstractC0776j) E9).f8443w;
                    int i10 = 0;
                    while (oVar != null) {
                        if ((oVar.j & 16) != 0) {
                            i10++;
                            if (i10 == 1) {
                                E9 = E9;
                                eVar = eVar;
                                eVar = eVar;
                                E9 = oVar;
                            } else {
                                if (eVar == 0) {
                                    eVar = new p038e0.e(new p137q0.o[16]);
                                }
                                if (E9 != 0) {
                                    eVar.c(E9);
                                    E9 = 0;
                                }
                                eVar.c(oVar);
                            }
                        } else {
                            E9 = E9;
                            eVar = eVar;
                        }
                        oVar = oVar.f26479m;
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
            if (this.f6719f != null) {
                int iF = rVar.f();
                int i11 = 0;
                while (true) {
                    rVar2 = this.f6718e;
                    l2 = this.f6717d;
                    if (i11 >= iF) {
                        break;
                    }
                    long jC = rVar.c(i11);
                    K0.x xVar = (K0.x) rVar.g(i11);
                    if (l2.e(jC)) {
                        boolean z13 = z12;
                        long j = xVar.g;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            long j9 = xVar.f6740c;
                            if ((((j9 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                z11 = z13;
                                java.util.List list = xVar.f6746k;
                                p078i6.w wVar = p078i6.w.f23205h;
                                if (list == null) {
                                    list = wVar;
                                }
                                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                                java.util.List list2 = xVar.f6746k;
                                if (list2 == null) {
                                    list2 = wVar;
                                }
                                int size = list2.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    int i13 = size;
                                    K0.C0655c c0655c = (K0.C0655c) list2.get(i12);
                                    long j10 = jC;
                                    long j11 = c0655c.f6689b;
                                    if ((((j11 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.f6719f;
                                        kotlin.jvm.internal.m.b(nodeCoordinator);
                                        arrayList.add(new K0.C0655c(c0655c.f6688a, nodeCoordinator.H(interfaceC0732v, j11), c0655c.f6690c));
                                    }
                                    i12++;
                                    size = i13;
                                    jC = j10;
                                }
                                long j12 = jC;
                                androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = this.f6719f;
                                kotlin.jvm.internal.m.b(nodeCoordinator2);
                                long jH = nodeCoordinator2.H(interfaceC0732v, j);
                                androidx.compose.ui.node.NodeCoordinator nodeCoordinator3 = this.f6719f;
                                kotlin.jvm.internal.m.b(nodeCoordinator3);
                                K0.x xVar2 = new K0.x(xVar.f6738a, xVar.f6739b, nodeCoordinator3.H(interfaceC0732v, j9), xVar.f6741d, xVar.f6742e, xVar.f6743f, jH, xVar.f6744h, xVar.f6745i, arrayList, xVar.j, xVar.f6747l);
                                K0.x xVar3 = xVar.f6750o;
                                if (xVar3 == null) {
                                    xVar3 = xVar;
                                }
                                xVar2.f6750o = xVar3;
                                K0.x xVar4 = xVar.f6750o;
                                if (xVar4 != null) {
                                    xVar = xVar4;
                                }
                                xVar2.f6750o = xVar;
                                rVar2.d(j12, xVar2);
                            } else {
                                z11 = z13;
                            }
                        } else {
                            z11 = z13;
                        }
                    } else {
                        z11 = z12;
                    }
                    i11++;
                    z12 = z11;
                    zA = zA;
                    iF = iF;
                }
                boolean z14 = zA;
                boolean z15 = z12;
                if (rVar2.f() == 0) {
                    l2.f11389i = 0;
                    this.f6722a.i();
                    return z15;
                }
                int i14 = l2.f11389i;
                while (true) {
                    i14--;
                    byte b9 = -1;
                    if (-1 >= i14) {
                        break;
                    }
                    long j13 = ((long[]) l2.j)[i14];
                    if (rVar.f26415h) {
                        int i15 = rVar.f26417k;
                        long[] jArr = rVar.f26416i;
                        java.lang.Object[] objArr = rVar.j;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < i15) {
                            java.lang.Object obj2 = objArr[i16];
                            byte b10 = b9;
                            if (obj2 != p136q.AbstractC2674s.f26418a) {
                                if (i16 != i17) {
                                    jArr[i17] = jArr[i16];
                                    objArr[i17] = obj2;
                                    objArr[i16] = null;
                                }
                                i17++;
                            }
                            i16++;
                            b9 = b10;
                        }
                        rVar.f26415h = false;
                        rVar.f26417k = i17;
                    }
                    if (p144r.a.b(rVar.f26416i, rVar.f26417k, j13) < 0 && i14 < (i9 = l2.f11389i)) {
                        int i18 = i9 - 1;
                        int i19 = i14;
                        while (i19 < i18) {
                            long[] jArr2 = (long[]) l2.j;
                            int i20 = i19 + 1;
                            jArr2[i19] = jArr2[i20];
                            i19 = i20;
                        }
                        l2.f11389i--;
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(rVar2.f());
                int iF2 = rVar2.f();
                for (int i21 = 0; i21 < iF2; i21++) {
                    arrayList2.add(rVar2.g(i21));
                }
                K0.C0667o c0667o2 = new K0.C0667o(arrayList2, c0661i);
                int size2 = arrayList2.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i22);
                    if (c0661i.b(((K0.x) obj).f6738a)) {
                        break;
                    }
                    i22++;
                }
                K0.x xVar5 = (K0.x) obj;
                if (xVar5 != null) {
                    boolean z16 = xVar5.f6741d;
                    if (z6) {
                        z9 = false;
                        if (!this.f6721i && (z16 || xVar5.f6744h)) {
                            androidx.compose.ui.node.NodeCoordinator nodeCoordinator4 = this.f6719f;
                            kotlin.jvm.internal.m.b(nodeCoordinator4);
                            long j14 = nodeCoordinator4.j;
                            long j15 = xVar5.f6740c;
                            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j15 >> 32));
                            float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j15 & 4294967295L));
                            int i23 = (int) (j14 >> 32);
                            this.f6721i = !((fIntBitsToFloat2 > ((float) ((int) (j14 & 4294967295L))) ? z15 : false) | (fIntBitsToFloat > ((float) i23) ? z15 : false) | (fIntBitsToFloat < 0.0f ? z15 : false) | (fIntBitsToFloat2 < 0.0f ? z15 : false));
                        }
                    } else {
                        z9 = false;
                        this.f6721i = false;
                    }
                    boolean z17 = this.f6721i;
                    boolean z18 = this.f6720h;
                    if (z17 == z18 || !((i3 = c0667o2.f6729f) == 3 || i3 == 4 || i3 == 5)) {
                        int i24 = c0667o2.f6729f;
                        if (i24 == 4 && z18 && !this.j) {
                            c0667o2.f6729f = 3;
                        } else if (i24 == 5 && z17 && z16) {
                            c0667o2.f6729f = 3;
                        }
                    } else {
                        c0667o2.f6729f = z17 ? 4 : 5;
                    }
                } else {
                    z9 = false;
                }
                if (!z14 && c0667o2.f6729f == 3 && (c0667o = this.g) != null) {
                    ?? r9 = c0667o.f6724a;
                    int size3 = r9.size();
                    ?? r10 = c0667o2.f6724a;
                    if (size3 != r10.size()) {
                        z10 = z15;
                        break;
                    }
                    int size4 = r10.size();
                    ?? r11 = z9;
                    while (true) {
                        if (r11 >= size4) {
                            z10 = z9;
                            break;
                        }
                        if (!p181w0.a.b(((K0.x) r9.get(r11)).f6740c, ((K0.x) r10.get(r11)).f6740c)) {
                            z10 = z15;
                            break;
                        }
                        r11++;
                    }
                } else {
                    z10 = z15;
                    break;
                }
                this.g = c0667o2;
                return z10;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // K0.C0666n
    public final void b(K0.C0661i c0661i) {
        super.b(c0661i);
        K0.C0667o c0667o = this.g;
        if (c0667o == null) {
            return;
        }
        this.f6720h = this.f6721i;
        ?? r9 = c0667o.f6724a;
        int size = r9.size();
        for (int i3 = 0; i3 < size; i3++) {
            K0.x xVar = (K0.x) r9.get(i3);
            boolean z6 = xVar.f6741d;
            long j = xVar.f6738a;
            boolean zB = c0661i.b(j);
            boolean z9 = this.f6721i;
            if ((!z6 && !zB) || (!z6 && !z9)) {
                this.f6717d.j(j);
            }
        }
        this.f6721i = false;
        this.j = c0667o.f6729f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void c() {
        p038e0.e eVar = this.f6722a;
        java.lang.Object[] objArr = eVar.f21324h;
        int i3 = eVar.j;
        for (int i9 = 0; i9 < i3; i9++) {
            ((K0.C0665m) objArr[i9]).c();
        }
        ?? E9 = this.f6716c;
        ?? eVar2 = 0;
        while (E9 != 0) {
            if (E9 instanceof Q0.t0) {
                ((Q0.t0) E9).D();
            } else if ((E9.j & 16) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                p137q0.o oVar = ((Q0.AbstractC0776j) E9).f8443w;
                int i10 = 0;
                E9 = E9;
                eVar2 = eVar2;
                while (oVar != null) {
                    if ((oVar.j & 16) != 0) {
                        i10++;
                        if (i10 == 1) {
                            eVar2 = eVar2;
                            E9 = oVar;
                        } else {
                            if (eVar2 == 0) {
                                eVar2 = new p038e0.e(new p137q0.o[16]);
                            }
                            if (E9 != 0) {
                                eVar2.c(E9);
                                E9 = 0;
                            }
                            eVar2.c(oVar);
                        }
                    }
                    oVar = oVar.f26479m;
                    E9 = E9;
                    eVar2 = eVar2;
                }
                if (i10 == 1) {
                }
            }
            E9 = Q0.AbstractC0777k.e(eVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final boolean d(K0.C0661i c0661i) {
        p136q.r rVar = this.f6718e;
        boolean z6 = false;
        z6 = false;
        if (!(rVar.f() == 0)) {
            p137q0.o oVar = this.f6716c;
            if (oVar.f26487u) {
                K0.C0667o c0667o = this.g;
                kotlin.jvm.internal.m.b(c0667o);
                androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.f6719f;
                kotlin.jvm.internal.m.b(nodeCoordinator);
                long j = nodeCoordinator.j;
                ?? E9 = oVar;
                ?? eVar = 0;
                while (E9 != 0) {
                    if (E9 instanceof Q0.t0) {
                        ((Q0.t0) E9).X(c0667o, K0.EnumC0668p.j, j);
                    } else if ((E9.j & 16) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                        p137q0.o oVar2 = ((Q0.AbstractC0776j) E9).f8443w;
                        int i3 = 0;
                        while (oVar2 != null) {
                            if ((oVar2.j & 16) != 0) {
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
                if (oVar.f26487u) {
                    p038e0.e eVar2 = this.f6722a;
                    java.lang.Object[] objArr = eVar2.f21324h;
                    int i9 = eVar2.j;
                    for (int i10 = 0; i10 < i9; i10++) {
                        ((K0.C0665m) objArr[i10]).d(c0661i);
                    }
                }
                z6 = true;
            }
        }
        b(c0661i);
        rVar.a();
        this.f6719f = null;
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r0v5, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean e(K0.C0661i c0661i, boolean z6) {
        if (!(this.f6718e.f() == 0)) {
            ?? E9 = this.f6716c;
            if (E9.f26487u) {
                K0.C0667o c0667o = this.g;
                kotlin.jvm.internal.m.b(c0667o);
                androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.f6719f;
                kotlin.jvm.internal.m.b(nodeCoordinator);
                long j = nodeCoordinator.j;
                ?? E10 = E9;
                ?? eVar = 0;
                while (E10 != 0) {
                    if (E10 instanceof Q0.t0) {
                        ((Q0.t0) E10).X(c0667o, K0.EnumC0668p.f6730h, j);
                    } else if ((E10.j & 16) != 0 && (E10 instanceof Q0.AbstractC0776j)) {
                        p137q0.o oVar = ((Q0.AbstractC0776j) E10).f8443w;
                        int i3 = 0;
                        while (oVar != null) {
                            if ((oVar.j & 16) != 0) {
                                i3++;
                                if (i3 == 1) {
                                    E10 = E10;
                                    eVar = eVar;
                                    eVar = eVar;
                                    E10 = oVar;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new p038e0.e(new p137q0.o[16]);
                                    }
                                    if (E10 != 0) {
                                        eVar.c(E10);
                                        E10 = 0;
                                    }
                                    eVar.c(oVar);
                                }
                            } else {
                                E10 = E10;
                                eVar = eVar;
                            }
                            oVar = oVar.f26479m;
                            E10 = E10;
                            eVar = eVar;
                        }
                        if (i3 == 1) {
                            E10 = E10;
                            eVar = eVar;
                        } else {
                            E10 = E10;
                            eVar = eVar;
                        }
                    }
                    E10 = Q0.AbstractC0777k.e(eVar);
                }
                if (E9.f26487u) {
                    p038e0.e eVar2 = this.f6722a;
                    java.lang.Object[] objArr = eVar2.f21324h;
                    int i9 = eVar2.j;
                    for (int i10 = 0; i10 < i9; i10++) {
                        K0.C0665m c0665m = (K0.C0665m) objArr[i10];
                        kotlin.jvm.internal.m.b(this.f6719f);
                        c0665m.e(c0661i, z6);
                    }
                }
                if (E9.f26487u) {
                    ?? eVar3 = 0;
                    while (E9 != 0) {
                        if (E9 instanceof Q0.t0) {
                            ((Q0.t0) E9).X(c0667o, K0.EnumC0668p.f6731i, j);
                        } else if ((E9.j & 16) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                            p137q0.o oVar2 = ((Q0.AbstractC0776j) E9).f8443w;
                            int i11 = 0;
                            while (oVar2 != null) {
                                if ((oVar2.j & 16) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        E9 = E9;
                                        eVar3 = eVar3;
                                        eVar3 = eVar3;
                                        E9 = oVar2;
                                    } else {
                                        if (eVar3 == 0) {
                                            eVar3 = new p038e0.e(new p137q0.o[16]);
                                        }
                                        if (E9 != 0) {
                                            eVar3.c(E9);
                                            E9 = 0;
                                        }
                                        eVar3.c(oVar2);
                                    }
                                } else {
                                    E9 = E9;
                                    eVar3 = eVar3;
                                }
                                oVar2 = oVar2.f26479m;
                                E9 = E9;
                                eVar3 = eVar3;
                            }
                            if (i11 == 1) {
                                E9 = E9;
                                eVar3 = eVar3;
                            } else {
                                E9 = E9;
                                eVar3 = eVar3;
                            }
                        }
                        E9 = Q0.AbstractC0777k.e(eVar3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, p136q.D d4) {
        Y2.L l2 = this.f6717d;
        if (l2.e(j) && d4.g(this) < 0) {
            l2.j(j);
            this.f6718e.e(j);
        }
        p038e0.e eVar = this.f6722a;
        java.lang.Object[] objArr = eVar.f21324h;
        int i3 = eVar.j;
        for (int i9 = 0; i9 < i3; i9++) {
            ((K0.C0665m) objArr[i9]).f(j, d4);
        }
    }

    public final java.lang.String toString() {
        return "Node(modifierNode=" + this.f6716c + ", children=" + this.f6722a + ", pointerIds=" + this.f6717d + ')';
    }
}
