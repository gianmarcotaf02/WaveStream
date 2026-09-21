package p175v0;

import N0.a;
import Q0.AbstractC0776j;
import Q0.AbstractC0777k;
import p038e0.e;
import p137q0.o;

public final class y {

    public static final y f29103b = new y();

    public static final y f29104c = new y();

    public static final y f29105d = new y();

    public final e f29106a = new e(new A[16]);

    public static boolean a(y yVar) {
        yVar.getClass();
        if (yVar == f29103b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (yVar == f29104c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        e eVar = yVar.f29106a;
        int i3 = eVar.j;
        if (i3 == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        Object[] objArr = eVar.f21324h;
        boolean z6 = false;
        for (int i9 = 0; i9 < i3; i9++) {
            o oVar = (o) ((A) objArr[i9]);
            if (!oVar.f26475h.f26487u) {
                a.b("visitChildren called on an unattached node");
            }
            e eVar2 = new e(new o[16]);
            o oVar2 = oVar.f26475h;
            o oVar3 = oVar2.f26479m;
            if (oVar3 == null) {
                AbstractC0777k.b(eVar2, oVar2);
            } else {
                eVar2.c(oVar3);
            }
            while (true) {
                int i10 = eVar2.j;
                if (i10 == 0) {
                    break;
                }
                o oVarE = (o) eVar2.m(i10 - 1);
                if ((oVarE.f26477k & 1024) == 0) {
                    AbstractC0777k.b(eVar2, oVarE);
                } else {
                    while (oVarE != null) {
                        if ((oVarE.j & 1024) != 0) {
                            e eVar3 = null;
                            while (oVarE != null) {
                                if (oVarE instanceof F) {
                                    if (((F) oVarE).U0(7)) {
                                        z6 = true;
                                        break;
                                    }
                                } else if ((oVarE.j & 1024) != 0 && (oVarE instanceof AbstractC0776j)) {
                                    int i11 = 0;
                                    for (o oVar4 = ((AbstractC0776j) oVarE).f8443w; oVar4 != null; oVar4 = oVar4.f26479m) {
                                        if ((oVar4.j & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                oVarE = oVar4;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new e(new o[16]);
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
                                oVarE = AbstractC0777k.e(eVar3);
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
