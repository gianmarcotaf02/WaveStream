package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class i implements O1.InterfaceC0737a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M8.w f8519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M8.A f8520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O1.X f8521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q1.e f8522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Q1.a f8523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p028c8.d f8524f;

    public i(M8.w fileSystem, M8.A path, O1.X coordinator, Q1.e eVar) {
        kotlin.jvm.internal.m.e(fileSystem, "fileSystem");
        kotlin.jvm.internal.m.e(path, "path");
        kotlin.jvm.internal.m.e(coordinator, "coordinator");
        this.f8519a = fileSystem;
        this.f8520b = path;
        this.f8521c = coordinator;
        this.f8522d = eVar;
        this.f8523e = new Q1.a();
        this.f8524f = new p028c8.d();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007d, blocks: (B:33:0x007c, B:42:0x008d, B:41:0x008a, B:38:0x0085), top: B:57:0x0020, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [Q1.i] */
    /* JADX WARN: Type inference failed for: r0v13, types: [Q1.i] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [Q1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [Q1.i] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [O1.q] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final java.lang.Object a(O1.C0753q c0753q, p117n6.c cVar) throws java.lang.Throwable {
        ?? gVar;
        java.lang.Throwable th;
        Q1.c cVar2;
        ?? r9;
        ?? r10;
        if (cVar instanceof Q1.g) {
            Q1.g gVar2 = (Q1.g) cVar;
            int i3 = gVar2.f8512m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar2.f8512m = i3 - Integer.MIN_VALUE;
                gVar = gVar2;
            } else {
                gVar = new Q1.g(this, cVar);
            }
        } else {
            gVar = new Q1.g(this, cVar);
        }
        java.lang.Object obj = gVar.f8510k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = gVar.f8512m;
        try {
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0753q = gVar.j;
                cVar2 = gVar.f8509i;
                gVar = gVar.f8508h;
                try {
                    com.google.common.util.concurrent.P.u0(obj);
                    r10 = gVar;
                    r9 = c0753q;
                    try {
                        cVar2.close();
                        th = null;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r9 != 0) {
                        r10.f8524f.g(null);
                    }
                    return obj;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    try {
                        cVar2.close();
                    } catch (java.lang.Throwable th4) {
                        com.google.common.util.concurrent.AbstractC1903s.j(th, th4);
                    }
                    throw th;
                }
            }
            com.google.common.util.concurrent.P.u0(obj);
            if (this.f8523e.f8491a.get()) {
                throw new java.lang.IllegalStateException("StorageConnection has already been disposed.");
            }
            boolean zF = this.f8524f.f();
            try {
                Q1.c cVar3 = new Q1.c(this.f8519a, this.f8520b);
                try {
                    java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zF);
                    gVar.f8508h = this;
                    gVar.f8509i = cVar3;
                    gVar.j = zF;
                    gVar.f8512m = 1;
                    java.lang.Object objInvoke = c0753q.invoke(cVar3, boolValueOf, gVar);
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                    obj = objInvoke;
                    r9 = zF;
                    r10 = this;
                    cVar2 = cVar3;
                    cVar2.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r9 != 0) {
                        r10.f8524f.g(null);
                    }
                    return obj;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    c0753q = zF;
                    gVar = this;
                    cVar2 = cVar3;
                    cVar2.close();
                    throw th;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                c0753q = zF;
                gVar = this;
                if (c0753q != 0) {
                    gVar.f8524f.g(null);
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (c0753q != 0) {
                gVar.f8524f.g(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b9 A[Catch: all -> 0x00c9, IOException -> 0x00cc, TRY_ENTER, TryCatch #9 {IOException -> 0x00cc, all -> 0x00c9, blocks: (B:40:0x00b9, B:42:0x00c1, B:50:0x00d8, B:57:0x00e6, B:56:0x00e3, B:53:0x00de), top: B:86:0x0023, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1 A[Catch: all -> 0x00c9, IOException -> 0x00cc, TRY_LEAVE, TryCatch #9 {IOException -> 0x00cc, all -> 0x00c9, blocks: (B:40:0x00b9, B:42:0x00c1, B:50:0x00d8, B:57:0x00e6, B:56:0x00e3, B:53:0x00de), top: B:86:0x0023, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8 A[Catch: all -> 0x00c9, IOException -> 0x00cc, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x00cc, all -> 0x00c9, blocks: (B:40:0x00b9, B:42:0x00c1, B:50:0x00d8, B:57:0x00e6, B:56:0x00e3, B:53:0x00de), top: B:86:0x0023, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [M8.A] */
    /* JADX WARN: Type inference failed for: r0v4, types: [M8.A] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [M8.A] */
    /* JADX WARN: Type inference failed for: r0v7, types: [M8.A] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v19, types: [M8.q, M8.w] */
    /* JADX WARN: Type inference failed for: r10v22, types: [M8.w] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v8, types: [x6.m] */
    /* JADX WARN: Type inference failed for: r11v15, types: [c8.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v10, types: [Q1.i] */
    /* JADX WARN: Type inference failed for: r1v11, types: [Q1.i] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [Q1.h, java.lang.Object, l6.c] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [M8.q, M8.w] */
    /* JADX WARN: Type inference failed for: r1v6, types: [M8.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, m6.a] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9, types: [c8.a] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [Q1.i] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [Q1.i] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [M8.w] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final java.lang.Object b(O1.M m8, p117n6.c cVar) throws java.lang.Throwable {
        ?? hVar;
        ?? r11;
        ?? r9;
        M8.A aC;
        ?? r10;
        ?? r12;
        Q1.k kVar;
        java.lang.Throwable th;
        O1.InterfaceC0737a interfaceC0737a;
        ?? r13;
        ?? r14;
        ?? r15;
        ?? E9 = com.revenuecat.purchases.common.networking.ETagPayloadStore.TEMP_SUFFIX;
        if (cVar instanceof Q1.h) {
            Q1.h hVar2 = (Q1.h) cVar;
            int i3 = hVar2.f8518n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar2.f8518n = i3 - Integer.MIN_VALUE;
                hVar = hVar2;
            } else {
                hVar = new Q1.h(this, cVar);
            }
        } else {
            hVar = new Q1.h(this, cVar);
        }
        java.lang.Object obj = hVar.f8516l;
        ?? r16 = p109m6.a.f25430h;
        int i9 = hVar.f8518n;
        try {
            try {
                try {
                    try {
                        if (i9 == 0) {
                            com.google.common.util.concurrent.P.u0(obj);
                            if (this.f8523e.f8491a.get()) {
                                throw new java.lang.IllegalStateException("StorageConnection has already been disposed.");
                            }
                            aC = this.f8520b.c();
                            if (aC == null) {
                                throw new java.lang.IllegalStateException("must have a parent path");
                            }
                            this.f8519a.b(aC);
                            hVar.f8513h = this;
                            hVar.f8514i = m8;
                            hVar.j = aC;
                            ?? r17 = this.f8524f;
                            hVar.f8515k = r17;
                            hVar.f8518n = 1;
                            if (r17.e(hVar) != r16) {
                                r9 = this;
                                r10 = m8;
                                r11 = r17;
                            }
                            return r16;
                        }
                        if (i9 != 1) {
                            if (i9 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0737a = (O1.InterfaceC0737a) hVar.f8515k;
                            E9 = hVar.j;
                            r16 = (p028c8.a) hVar.f8514i;
                            hVar = hVar.f8513h;
                            try {
                                com.google.common.util.concurrent.P.u0(obj);
                                r15 = E9;
                                r14 = hVar;
                                r13 = r16;
                                try {
                                    interfaceC0737a.close();
                                    th = null;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (r14.f8519a.t(r15)) {
                                    r14.f8519a.P(r15, r14.f8520b);
                                }
                                ((p028c8.d) r13).g(null);
                                return p070h6.A.f22523a;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                try {
                                    interfaceC0737a.close();
                                } catch (java.lang.Throwable th4) {
                                    com.google.common.util.concurrent.AbstractC1903s.j(th, th4);
                                }
                                throw th;
                            }
                        }
                        p028c8.a aVar = (p028c8.a) hVar.f8515k;
                        aC = hVar.j;
                        p194x6.m mVar = (p194x6.m) hVar.f8514i;
                        Q1.i iVar = hVar.f8513h;
                        com.google.common.util.concurrent.P.u0(obj);
                        r11 = aVar;
                        r10 = mVar;
                        r9 = iVar;
                        hVar.f8513h = r9;
                        hVar.f8514i = r11;
                        hVar.j = E9;
                        hVar.f8515k = kVar;
                        hVar.f8518n = 2;
                        if (r10.invoke(kVar, hVar) != r16) {
                            r13 = r11;
                            interfaceC0737a = kVar;
                            r14 = r9;
                            r15 = E9;
                            interfaceC0737a.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (r14.f8519a.t(r15)) {
                                r14.f8519a.P(r15, r14.f8520b);
                            }
                            ((p028c8.d) r13).g(null);
                            return p070h6.A.f22523a;
                        }
                        return r16;
                    } catch (java.lang.Throwable th5) {
                        r16 = r11;
                        hVar = r9;
                        th = th5;
                        interfaceC0737a = kVar;
                        interfaceC0737a.close();
                        throw th;
                    }
                    r12.i(E9);
                    kVar = new Q1.k(r12, E9);
                } catch (java.io.IOException e6) {
                    e = e6;
                    if (r9.f8519a.t(E9)) {
                        try {
                            ?? r18 = r9.f8519a;
                            r18.getClass();
                            r18.i(E9);
                        } catch (java.io.IOException unused) {
                        }
                    }
                    throw e;
                }
                M8.A a2 = r9.f8520b;
                r12 = r9.f8519a;
                E9 = aC.e(a2.b().concat(com.revenuecat.purchases.common.networking.ETagPayloadStore.TEMP_SUFFIX));
            } catch (java.lang.Throwable th6) {
                th = th6;
                ((p028c8.d) r11).g(null);
                throw th;
            }
        } catch (java.io.IOException e9) {
            e = e9;
            r9 = hVar;
            r11 = r16;
            if (r9.f8519a.t(E9)) {
                ?? r19 = r9.f8519a;
                r19.getClass();
                r19.i(E9);
            }
            throw e;
        } catch (java.lang.Throwable th7) {
            th = th7;
            r11 = r16;
            ((p028c8.d) r11).g(null);
            throw th;
        }
    }

    @Override // O1.InterfaceC0737a
    public final void close() {
        this.f8523e.f8491a.set(true);
        this.f8522d.invoke();
    }
}
