package p175v0;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p175v0.y f29103b = new p175v0.y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p175v0.y f29104c = new p175v0.y();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p175v0.y f29105d = new p175v0.y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p038e0.e f29106a = new p038e0.e(new p175v0.A[16]);

    public static boolean a(p175v0.y yVar) {
        yVar.getClass();
        if (yVar == f29103b) {
            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (yVar == f29104c) {
            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        p038e0.e eVar = yVar.f29106a;
        int i3 = eVar.j;
        if (i3 == 0) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        java.lang.Object[] objArr = eVar.f21324h;
        boolean z6 = false;
        for (int i9 = 0; i9 < i3; i9++) {
            p137q0.o oVar = (p137q0.o) ((p175v0.A) objArr[i9]);
            if (!oVar.f26475h.f26487u) {
                N0.a.b("visitChildren called on an unattached node");
            }
            p038e0.e eVar2 = new p038e0.e(new p137q0.o[16]);
            p137q0.o oVar2 = oVar.f26475h;
            p137q0.o oVar3 = oVar2.f26479m;
            if (oVar3 == null) {
                Q0.AbstractC0777k.b(eVar2, oVar2);
            } else {
                eVar2.c(oVar3);
            }
            while (true) {
                int i10 = eVar2.j;
                if (i10 == 0) {
                    break;
                }
                p137q0.o oVarE = (p137q0.o) eVar2.m(i10 - 1);
                if ((oVarE.f26477k & 1024) == 0) {
                    Q0.AbstractC0777k.b(eVar2, oVarE);
                } else {
                    while (oVarE != null) {
                        if ((oVarE.j & 1024) != 0) {
                            p038e0.e eVar3 = null;
                            while (oVarE != null) {
                                if (oVarE instanceof p175v0.F) {
                                    if (((p175v0.F) oVarE).U0(7)) {
                                        z6 = true;
                                        break;
                                    }
                                } else if ((oVarE.j & 1024) != 0 && (oVarE instanceof Q0.AbstractC0776j)) {
                                    int i11 = 0;
                                    for (p137q0.o oVar4 = ((Q0.AbstractC0776j) oVarE).f8443w; oVar4 != null; oVar4 = oVar4.f26479m) {
                                        if ((oVar4.j & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                oVarE = oVar4;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new p038e0.e(new p137q0.o[16]);
                                                }
                                                if (oVarE != null) {
                                                    eVar3.c(oVarE);
                                                    oVarE = null;
                                                }
                                                eVar3.c(oVar4);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                oVarE = Q0.AbstractC0777k.e(eVar3);
                            }
                            break;
                        }
                        oVarE = oVarE.f26479m;
                    }
                }
            }
        }
        return z6;
    }
}
