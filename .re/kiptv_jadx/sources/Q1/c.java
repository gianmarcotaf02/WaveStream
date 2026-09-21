package Q1;

/* JADX INFO: loaded from: classes.dex */
public class c implements O1.InterfaceC0737a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M8.w f8496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M8.A f8497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q1.a f8498c;

    public c(M8.w fileSystem, M8.A path) {
        kotlin.jvm.internal.m.e(fileSystem, "fileSystem");
        kotlin.jvm.internal.m.e(path, "path");
        this.f8496a = fileSystem;
        this.f8497b = path;
        this.f8498c = new Q1.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b8, code lost:
    
        if (r9 == r1) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [Q1.c] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [Q1.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v4, types: [Q1.c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.Closeable] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object a(Q1.c cVar, p117n6.c cVar2) throws java.lang.Throwable {
        Q1.b bVar;
        M8.E e6;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        if (cVar2 instanceof Q1.b) {
            bVar = (Q1.b) cVar2;
            int i3 = bVar.f8495l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.f8495l = i3 - Integer.MIN_VALUE;
            } else {
                bVar = new Q1.b(cVar, cVar2);
            }
        } else {
            bVar = new Q1.b(cVar, cVar2);
        }
        java.lang.Object objA = bVar.j;
        p109m6.a aVar = p109m6.a.f25430h;
        ?? r9 = bVar.f8495l;
        S1.i iVar = S1.i.f9209a;
        boolean z6 = true;
        java.lang.Throwable th3 = null;
        try {
            try {
                if (r9 == 0) {
                    com.google.common.util.concurrent.P.u0(objA);
                    if (cVar.f8498c.f8491a.get()) {
                        throw new java.lang.IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        M8.E eC = M8.AbstractC0674b.c(cVar.f8496a.N(cVar.f8497b));
                        try {
                            bVar.f8492h = cVar;
                            bVar.f8493i = eC;
                            bVar.f8495l = 1;
                            S1.b bVarA = iVar.a(eC);
                            if (bVarA != aVar) {
                                e6 = eC;
                                objA = bVarA;
                                if (e6 != null) {
                                    e6.close();
                                }
                                th2 = null;
                            }
                        } catch (java.lang.Throwable th4) {
                            r9 = cVar;
                            e6 = eC;
                            th = th4;
                            if (e6 != null) {
                                e6.close();
                            }
                            th2 = th;
                            objA = null;
                        }
                    } catch (java.io.FileNotFoundException unused) {
                        M8.w wVar = cVar.f8496a;
                        M8.A a2 = cVar.f8497b;
                        if (!wVar.t(a2)) {
                            return new S1.b(z6);
                        }
                        M8.E eC2 = M8.AbstractC0674b.c(cVar.f8496a.N(a2));
                        bVar.f8492h = eC2;
                        bVar.f8493i = null;
                        bVar.f8495l = 2;
                        objA = iVar.a(eC2);
                        cVar = eC2;
                    }
                    return aVar;
                }
                if (r9 != 1) {
                    if (r9 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.io.Closeable closeable = (java.io.Closeable) bVar.f8492h;
                    com.google.common.util.concurrent.P.u0(objA);
                    cVar = closeable;
                    if (cVar != 0) {
                        try {
                            cVar.close();
                        } catch (java.lang.Throwable th5) {
                            th3 = th5;
                        }
                    }
                    if (th3 != null) {
                        throw th3;
                    }
                    kotlin.jvm.internal.m.b(objA);
                    return objA;
                }
                e6 = bVar.f8493i;
                r9 = (Q1.c) bVar.f8492h;
                try {
                    com.google.common.util.concurrent.P.u0(objA);
                    if (e6 != null) {
                        try {
                            e6.close();
                        } catch (java.lang.Throwable th6) {
                            th2 = th6;
                        }
                    }
                    th2 = null;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    if (e6 != null) {
                        try {
                            e6.close();
                        } catch (java.lang.Throwable th8) {
                            com.google.common.util.concurrent.AbstractC1903s.j(th, th8);
                        }
                    }
                    th2 = th;
                    objA = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                kotlin.jvm.internal.m.b(objA);
                return objA;
            } catch (java.lang.Throwable th9) {
                if (cVar != 0) {
                    try {
                        cVar.close();
                    } catch (java.lang.Throwable th10) {
                        com.google.common.util.concurrent.AbstractC1903s.j(th9, th10);
                    }
                }
                th3 = th9;
                objA = null;
            }
        } catch (java.io.FileNotFoundException unused2) {
            cVar = r9;
        }
    }

    @Override // O1.InterfaceC0737a
    public final void close() {
        this.f8498c.f8491a.set(true);
    }
}
