package K0;

/* JADX INFO: renamed from: K0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0656d extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f6692i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0656d(java.lang.Object obj, java.lang.Object obj2, int i3) {
        super(0);
        this.f6691h = i3;
        this.f6692i = obj;
        this.j = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r4v11 */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        Y0.p pVar;
        Q0.F f9;
        p181w0.b bVar;
        p020c0.C1715y c1715y;
        switch (this.f6691h) {
            case 0:
                ((K0.C0657e) this.f6692i).d((p137q0.o) this.j);
                return p070h6.A.f22523a;
            case 1:
                ((java.util.concurrent.Executor) this.f6692i).execute(new D1.RunnableC0239y(1, (kotlin.jvm.internal.A) this.j));
                return p070h6.A.f22523a;
            case 2:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("During clear credential sign out failed with ");
                java.lang.Exception exc = (java.lang.Exception) this.f6692i;
                sb.append(exc);
                android.util.Log.w("PlayServicesImpl", sb.toString());
                ((java.util.concurrent.Executor) this.j).execute(new D1.RunnableC0239y(2, exc));
                return p070h6.A.f22523a;
            case 3:
                Q0.C0765b0 c0765b0 = ((Q0.F) this.f6692i).f8232N;
                if ((c0765b0.f8391f.f26477k & 8) != 0) {
                    for (p137q0.o oVar = c0765b0.f8390e; oVar != null; oVar = oVar.f26478l) {
                        if ((oVar.j & 8) != 0) {
                            ?? E9 = oVar;
                            ?? eVar = 0;
                            while (E9 != 0) {
                                if (E9 instanceof Q0.x0) {
                                    Q0.x0 x0Var = (Q0.x0) E9;
                                    boolean zE = x0Var.E();
                                    kotlin.jvm.internal.A a2 = (kotlin.jvm.internal.A) this.j;
                                    if (zE) {
                                        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = new androidx.compose.ui.semantics.SemanticsConfiguration();
                                        a2.f24539h = semanticsConfiguration;
                                        semanticsConfiguration.f15962k = true;
                                    }
                                    if (x0Var.x0()) {
                                        ((androidx.compose.ui.semantics.SemanticsConfiguration) a2.f24539h).j = true;
                                    }
                                    x0Var.j0((Y0.x) a2.f24539h);
                                } else if ((E9.j & 8) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                                    p137q0.o oVar2 = ((Q0.AbstractC0776j) E9).f8443w;
                                    int i3 = 0;
                                    while (oVar2 != null) {
                                        if ((oVar2.j & 8) != 0) {
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
                    }
                }
                return p070h6.A.f22523a;
            case 4:
                p188x0.L l2 = androidx.compose.ui.node.NodeCoordinator.f15841T;
                ((p194x6.j) this.f6692i).invoke(l2);
                androidx.compose.ui.node.NodeCoordinator nodeCoordinator = (androidx.compose.ui.node.NodeCoordinator) this.j;
                p188x0.O o8 = nodeCoordinator.f15852K;
                p188x0.O o9 = l2.f31069u;
                boolean z6 = o8 != o9;
                boolean z9 = nodeCoordinator.f15853L;
                boolean z10 = l2.f31070v;
                boolean z11 = z9 != z10;
                if (z6 || z11) {
                    nodeCoordinator.f15852K = o9;
                    nodeCoordinator.f15853L = z10;
                    if (nodeCoordinator.f15854M && (z11 || (z10 && z6))) {
                        nodeCoordinator.f15861v.I();
                    }
                }
                nodeCoordinator.f15854M = true;
                l2.f31056B = l2.f31069u.a(l2.f31072x, l2.f31073z, l2.y);
                return p070h6.A.f22523a;
            case 5:
                return java.lang.Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((android.view.KeyEvent) this.j));
            case 6:
                return java.lang.Boolean.valueOf(super/*android.view.View*/.dispatchGenericMotionEvent((android.view.MotionEvent) this.j));
            case 7:
                R0.N0 n3 = (R0.N0) this.f6692i;
                Y0.j jVar = n3.f8833l;
                Y0.j jVar2 = n3.f8834m;
                java.lang.Float f10 = n3.j;
                java.lang.Float f11 = n3.f8832k;
                float fFloatValue = (jVar == null || f10 == null) ? 0.0f : ((java.lang.Number) jVar.f11039a.invoke()).floatValue() - f10.floatValue();
                float fFloatValue2 = (jVar2 == null || f11 == null) ? 0.0f : ((java.lang.Number) jVar2.f11039a.invoke()).floatValue() - f11.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int i9 = n3.f8830h;
                    R0.D d4 = (R0.D) this.j;
                    int iA = d4.A(i9);
                    Y0.q qVar = (Y0.q) d4.s().b(d4.f8771s);
                    if (qVar != null) {
                        try {
                            E1.f fVar = d4.f8773u;
                            if (fVar != null) {
                                fVar.f2755a.setBoundsInScreen(d4.k(qVar));
                            }
                            break;
                        } catch (java.lang.IllegalStateException unused) {
                        }
                    }
                    Y0.q qVar2 = (Y0.q) d4.s().b(d4.f8772t);
                    if (qVar2 != null) {
                        try {
                            E1.f fVar2 = d4.f8774v;
                            if (fVar2 != null) {
                                fVar2.f2755a.setBoundsInScreen(d4.k(qVar2));
                            }
                            break;
                        } catch (java.lang.IllegalStateException unused2) {
                        }
                    }
                    d4.f8763k.invalidate();
                    Y0.q qVar3 = (Y0.q) d4.s().b(iA);
                    if (qVar3 != null && (pVar = qVar3.f11097a) != null && (f9 = pVar.f11093c) != null) {
                        if (jVar != null) {
                            d4.f8776x.h(iA, jVar);
                        }
                        if (jVar2 != null) {
                            d4.y.h(iA, jVar2);
                        }
                        d4.w(f9);
                    }
                }
                if (jVar != null) {
                    n3.j = (java.lang.Float) jVar.f11039a.invoke();
                }
                if (jVar2 != null) {
                    n3.f8832k = (java.lang.Float) jVar2.f11039a.invoke();
                }
                return p070h6.A.f22523a;
            case 8:
                android.content.Context applicationContext = (android.content.Context) this.f6692i;
                kotlin.jvm.internal.m.d(applicationContext, "applicationContext");
                java.lang.String name = ((R1.b) this.j).f9037h;
                kotlin.jvm.internal.m.e(name, "name");
                java.lang.String fileName = name.concat(".preferences_pb");
                kotlin.jvm.internal.m.e(fileName, "fileName");
                return new java.io.File(applicationContext.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
            case 9:
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) this.f6692i;
                if (function0 != null && (bVar = (p181w0.b) function0.invoke()) != null) {
                    return bVar;
                }
                androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = (androidx.compose.ui.node.NodeCoordinator) this.j;
                if (!nodeCoordinator2.U0().f26487u) {
                    nodeCoordinator2 = null;
                }
                if (nodeCoordinator2 != null) {
                    return com.google.android.gms.internal.play_billing.V0.c(0L, com.google.common.util.concurrent.AbstractC1903s.K(nodeCoordinator2.j));
                }
                return null;
            case 10:
                Z.D d6 = (Z.D) this.j;
                java.lang.Object obj = d6.f12196a;
                Z.C1165p0 c1165p0 = (Z.C1165p0) this.f6692i;
                if (!kotlin.jvm.internal.m.a(c1165p0, obj)) {
                    p078i6.u.Q0(d6.f12197b, new Z.C1151i0(c1165p0, 1));
                    p020c0.C1701q0 c1701q0 = d6.f12198c;
                    if (c1701q0 != null && (c1715y = c1701q0.f18348a) != null) {
                        c1715y.s(c1701q0, null);
                    }
                }
                return p070h6.A.f22523a;
            case 11:
                return "Only found " + ((kotlin.jvm.internal.y) this.f6692i).f24555h + " digits in a row, but need to parse " + ((p080i8.h) this.j).b();
            case 12:
                ((kotlin.jvm.internal.A) this.f6692i).f24539h = Q0.AbstractC0777k.h((p138q1.v) this.j, O0.e0.f7632a);
                return p070h6.A.f22523a;
            case 13:
                ((p171u0.b) this.f6692i).f28651x.invoke((p171u0.c) this.j);
                return p070h6.A.f22523a;
            default:
                ((kotlin.jvm.internal.A) this.f6692i).f24539h = ((p175v0.F) this.j).P0();
                return p070h6.A.f22523a;
        }
    }
}
