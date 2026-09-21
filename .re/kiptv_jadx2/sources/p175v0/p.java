package p175v0;

import I0.c;
import I3.b;
import N0.a;
import Q0.AbstractC0776j;
import Q0.AbstractC0777k;
import Q0.C0765b0;
import Q0.F;
import R0.C0850u;
import Z.Q;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import p038e0.e;
import p113n1.n;
import p136q.A;
import p136q.D;
import p136q.P;
import p137q0.o;
import p194x6.j;

public final class p implements n {

    public final AndroidComposeView f29080a;

    public final AndroidComposeView f29081b;

    public final k f29083d;

    public A f29085f;

    public F f29086h;

    public final F f29082c = new F(2, null, 14);

    public final o f29084e = new o(this);
    public final D g = new D(1);

    public p(AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.f29080a = androidComposeView;
        this.f29081b = androidComposeView2;
        this.f29083d = new k(this, androidComposeView2);
    }

    public final boolean a(boolean z6) {
        C0765b0 c0765b0;
        if (f() != null) {
            F f9 = f();
            i(null);
            if (f9 != null) {
                f9.O0(D.f29046h, D.j);
                if (!f9.f26475h.f26487u) {
                    a.b("visitAncestors called on an unattached node");
                }
                o oVar = f9.f26475h.f26478l;
                F fT = AbstractC0777k.t(f9);
                while (fT != null) {
                    if ((fT.f8232N.f8391f.f26477k & 1024) != 0) {
                        while (oVar != null) {
                            if ((oVar.j & 1024) != 0) {
                                e eVar = null;
                                o oVarE = oVar;
                                while (oVarE != null) {
                                    if (oVarE instanceof F) {
                                        ((F) oVarE).O0(D.f29047i, D.j);
                                    } else if ((oVarE.j & 1024) != 0 && (oVarE instanceof AbstractC0776j)) {
                                        int i3 = 0;
                                        for (o oVar2 = ((AbstractC0776j) oVarE).f8443w; oVar2 != null; oVar2 = oVar2.f26479m) {
                                            if ((oVar2.j & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    oVarE = oVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new e(new o[16]);
                                                    }
                                                    if (oVarE != null) {
                                                        eVar.c(oVarE);
                                                        oVarE = null;
                                                    }
                                                    eVar.c(oVar2);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    oVarE = AbstractC0777k.e(eVar);
                                }
                            }
                            oVar = oVar.f26478l;
                        }
                    }
                    fT = fT.x();
                    oVar = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
                }
            }
        }
        return true;
    }

    public final boolean b(int i3, boolean z6, boolean z9) {
        int iOrdinal;
        boolean z10 = true;
        if (z6 || (iOrdinal = AbstractC2909d.v(this.f29082c, i3).ordinal()) == 0) {
            a(z6);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new b();
            }
            z10 = false;
        }
        if (z10 && z9) {
            c();
        }
        return z10;
    }

    public final void c() {
        AndroidComposeView androidComposeView = this.f29080a;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            androidComposeView.clearFocus();
        } else if (androidComposeView.hasFocus()) {
            View viewFindFocus = androidComposeView.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            androidComposeView.clearFocus();
        }
    }

    public final boolean d(KeyEvent keyEvent, Function0 function0) {
        o oVar;
        F fT;
        Object obj;
        Object obj2;
        o oVar2;
        C0765b0 c0765b0;
        o oVarE;
        e eVar;
        o oVar3;
        F fT2;
        Object obj3;
        Object obj4;
        C0765b0 c0765b1;
        e eVar2;
        o oVarE2;
        int size;
        C0765b0 c0765b2;
        F f9 = this.f29082c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f29083d.f29077e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!j(keyEvent)) {
                Trace.endSection();
                return false;
            }
            F f10 = AbstractC2909d.f(f9);
            if (f10 != null) {
                if (!f10.f26475h.f26487u) {
                    a.b("visitLocalDescendants called on an unattached node");
                }
                o oVar4 = f10.f26475h;
                if ((oVar4.f26477k & 9216) != 0) {
                    oVar2 = null;
                    for (o oVar5 = oVar4.f26479m; oVar5 != null; oVar5 = oVar5.f26479m) {
                        int i3 = oVar5.j;
                        if ((i3 & 9216) != 0) {
                            if ((i3 & 1024) != 0) {
                                break;
                            }
                            oVar2 = oVar5;
                        }
                    }
                } else {
                    oVar2 = null;
                }
                if (oVar2 == null) {
                    if (f10 == null) {
                        if (!f9.f26475h.f26487u) {
                            a.b("visitAncestors called on an unattached node");
                        }
                        oVar = f9.f26475h.f26478l;
                        fT = AbstractC0777k.t(f9);
                        loop15: while (true) {
                            if (fT != null) {
                                obj = null;
                                break;
                            }
                            if ((fT.f8232N.f8391f.f26477k & 8192) != 0) {
                                while (oVar != null) {
                                    if ((oVar.j & 8192) != 0) {
                                        oVarE = oVar;
                                        eVar = null;
                                        while (oVarE != null) {
                                            if (oVarE instanceof I0.e) {
                                                obj = oVarE;
                                                break loop15;
                                            }
                                            if ((oVarE.j & 8192) == 0) {
                                            }
                                            oVarE = AbstractC0777k.e(eVar);
                                        }
                                    }
                                    oVar = oVar.f26478l;
                                }
                            }
                            fT = fT.x();
                            if (fT != null) {
                            }
                        }
                        obj2 = (I0.e) obj;
                        if (obj2 != null) {
                            oVar2 = ((o) obj2).f26475h;
                        } else {
                            oVar2 = null;
                        }
                    } else {
                        if (!f10.f26475h.f26487u) {
                            a.b("visitAncestors called on an unattached node");
                        }
                        oVar3 = f10.f26475h;
                        fT2 = AbstractC0777k.t(f10);
                        loop11: while (true) {
                            if (fT2 != null) {
                                obj3 = null;
                                break;
                            }
                            if ((fT2.f8232N.f8391f.f26477k & 8192) != 0) {
                                while (oVar3 != null) {
                                    if ((oVar3.j & 8192) != 0) {
                                        eVar2 = null;
                                        oVarE2 = oVar3;
                                        while (oVarE2 != null) {
                                            if (oVarE2 instanceof I0.e) {
                                                obj3 = oVarE2;
                                                break loop11;
                                            }
                                            if ((oVarE2.j & 8192) == 0) {
                                            }
                                            oVarE2 = AbstractC0777k.e(eVar2);
                                        }
                                    }
                                    oVar3 = oVar3.f26478l;
                                }
                            }
                            fT2 = fT2.x();
                            if (fT2 != null) {
                            }
                        }
                        obj4 = (I0.e) obj3;
                        if (obj4 != null) {
                            oVar2 = ((o) obj4).f26475h;
                        } else {
                            if (!f9.f26475h.f26487u) {
                                a.b("visitAncestors called on an unattached node");
                            }
                            oVar = f9.f26475h.f26478l;
                            fT = AbstractC0777k.t(f9);
                            loop15: while (true) {
                                if (fT != null) {
                                    obj = null;
                                    break;
                                }
                                if ((fT.f8232N.f8391f.f26477k & 8192) != 0) {
                                    while (oVar != null) {
                                        if ((oVar.j & 8192) != 0) {
                                            oVarE = oVar;
                                            eVar = null;
                                            while (oVarE != null) {
                                                if (oVarE instanceof I0.e) {
                                                    obj = oVarE;
                                                    break loop15;
                                                }
                                                if ((oVarE.j & 8192) == 0) {
                                                }
                                                oVarE = AbstractC0777k.e(eVar);
                                            }
                                        }
                                        oVar = oVar.f26478l;
                                    }
                                }
                                fT = fT.x();
                                if (fT != null) {
                                }
                            }
                            obj2 = (I0.e) obj;
                            if (obj2 != null) {
                                oVar2 = ((o) obj2).f26475h;
                            } else {
                                oVar2 = null;
                            }
                        }
                    }
                }
            } else if (f10 == null) {
                if (!f9.f26475h.f26487u) {
                    a.b("visitAncestors called on an unattached node");
                }
                oVar = f9.f26475h.f26478l;
                fT = AbstractC0777k.t(f9);
                loop15: while (true) {
                    if (fT != null) {
                        obj = null;
                        break;
                    }
                    if ((fT.f8232N.f8391f.f26477k & 8192) != 0) {
                        while (oVar != null) {
                            if ((oVar.j & 8192) != 0) {
                                oVarE = oVar;
                                eVar = null;
                                while (oVarE != null) {
                                    if (oVarE instanceof I0.e) {
                                        obj = oVarE;
                                        break loop15;
                                    }
                                    if ((oVarE.j & 8192) == 0 && (oVarE instanceof AbstractC0776j)) {
                                        o oVar6 = ((AbstractC0776j) oVarE).f8443w;
                                        int i9 = 0;
                                        while (oVar6 != null) {
                                            if ((oVar6.j & 8192) != 0) {
                                                i9++;
                                                if (i9 == 1) {
                                                    oVarE = oVarE;
                                                    eVar = eVar;
                                                    eVar = eVar;
                                                    oVarE = oVar6;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new e(new o[16]);
                                                    }
                                                    if (oVarE != null) {
                                                        eVar.c(oVarE);
                                                        oVarE = null;
                                                    }
                                                    eVar.c(oVar6);
                                                }
                                            } else {
                                                oVarE = oVarE;
                                                eVar = eVar;
                                            }
                                            oVar6 = oVar6.f26479m;
                                            oVarE = oVarE;
                                            eVar = eVar;
                                        }
                                        if (i9 == 1) {
                                            oVarE = oVarE;
                                            eVar = eVar;
                                        } else {
                                            oVarE = oVarE;
                                            eVar = eVar;
                                        }
                                    }
                                    oVarE = AbstractC0777k.e(eVar);
                                }
                            }
                            oVar = oVar.f26478l;
                        }
                    }
                    fT = fT.x();
                    oVar = (fT != null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
                }
                obj2 = (I0.e) obj;
                if (obj2 != null) {
                    oVar2 = ((o) obj2).f26475h;
                } else {
                    oVar2 = null;
                }
            } else {
                if (!f10.f26475h.f26487u) {
                    a.b("visitAncestors called on an unattached node");
                }
                oVar3 = f10.f26475h;
                fT2 = AbstractC0777k.t(f10);
                loop11: while (true) {
                    if (fT2 != null) {
                        obj3 = null;
                        break;
                    }
                    if ((fT2.f8232N.f8391f.f26477k & 8192) != 0) {
                        while (oVar3 != null) {
                            if ((oVar3.j & 8192) != 0) {
                                eVar2 = null;
                                oVarE2 = oVar3;
                                while (oVarE2 != null) {
                                    if (oVarE2 instanceof I0.e) {
                                        obj3 = oVarE2;
                                        break loop11;
                                    }
                                    if ((oVarE2.j & 8192) == 0 && (oVarE2 instanceof AbstractC0776j)) {
                                        o oVar7 = ((AbstractC0776j) oVarE2).f8443w;
                                        int i10 = 0;
                                        while (oVar7 != null) {
                                            if ((oVar7.j & 8192) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    oVarE2 = oVarE2;
                                                    eVar2 = eVar2;
                                                    eVar2 = eVar2;
                                                    oVarE2 = oVar7;
                                                } else {
                                                    if (eVar2 == null) {
                                                        eVar2 = new e(new o[16]);
                                                    }
                                                    if (oVarE2 != null) {
                                                        eVar2.c(oVarE2);
                                                        oVarE2 = null;
                                                    }
                                                    eVar2.c(oVar7);
                                                }
                                            } else {
                                                oVarE2 = oVarE2;
                                                eVar2 = eVar2;
                                            }
                                            oVar7 = oVar7.f26479m;
                                            oVarE2 = oVarE2;
                                            eVar2 = eVar2;
                                        }
                                        if (i10 == 1) {
                                            oVarE2 = oVarE2;
                                            eVar2 = eVar2;
                                        } else {
                                            oVarE2 = oVarE2;
                                            eVar2 = eVar2;
                                        }
                                    }
                                    oVarE2 = AbstractC0777k.e(eVar2);
                                }
                            }
                            oVar3 = oVar3.f26478l;
                        }
                    }
                    fT2 = fT2.x();
                    oVar3 = (fT2 != null || (c0765b1 = fT2.f8232N) == null) ? null : c0765b1.f8390e;
                }
                obj4 = (I0.e) obj3;
                if (obj4 != null) {
                    oVar2 = ((o) obj4).f26475h;
                } else {
                    if (!f9.f26475h.f26487u) {
                        a.b("visitAncestors called on an unattached node");
                    }
                    oVar = f9.f26475h.f26478l;
                    fT = AbstractC0777k.t(f9);
                    loop15: while (true) {
                        if (fT != null) {
                            obj = null;
                            break;
                        }
                        if ((fT.f8232N.f8391f.f26477k & 8192) != 0) {
                            while (oVar != null) {
                                if ((oVar.j & 8192) != 0) {
                                    oVarE = oVar;
                                    eVar = null;
                                    while (oVarE != null) {
                                        if (oVarE instanceof I0.e) {
                                            obj = oVarE;
                                            break loop15;
                                        }
                                        if ((oVarE.j & 8192) == 0) {
                                        }
                                        oVarE = AbstractC0777k.e(eVar);
                                    }
                                }
                                oVar = oVar.f26478l;
                            }
                        }
                        fT = fT.x();
                        if (fT != null) {
                        }
                    }
                    obj2 = (I0.e) obj;
                    if (obj2 != null) {
                        oVar2 = ((o) obj2).f26475h;
                    } else {
                        oVar2 = null;
                    }
                }
            }
            if (oVar2 != null) {
                if (!oVar2.f26475h.f26487u) {
                    a.b("visitAncestors called on an unattached node");
                }
                o oVar8 = oVar2.f26475h.f26478l;
                F fT3 = AbstractC0777k.t(oVar2);
                ArrayList arrayList = null;
                while (fT3 != null) {
                    if ((fT3.f8232N.f8391f.f26477k & 8192) != 0) {
                        while (oVar8 != null) {
                            if ((oVar8.j & 8192) != 0) {
                                o oVarE3 = oVar8;
                                e eVar3 = null;
                                while (oVarE3 != null) {
                                    if (oVarE3 instanceof I0.e) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(oVarE3);
                                    } else if ((oVarE3.j & 8192) != 0 && (oVarE3 instanceof AbstractC0776j)) {
                                        int i11 = 0;
                                        for (o oVar9 = ((AbstractC0776j) oVarE3).f8443w; oVar9 != null; oVar9 = oVar9.f26479m) {
                                            if ((oVar9.j & 8192) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    oVarE3 = oVar9;
                                                } else {
                                                    if (eVar3 == null) {
                                                        eVar3 = new e(new o[16]);
                                                    }
                                                    if (oVarE3 != null) {
                                                        eVar3.c(oVarE3);
                                                        oVarE3 = null;
                                                    }
                                                    eVar3.c(oVar9);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    oVarE3 = AbstractC0777k.e(eVar3);
                                }
                            }
                            oVar8 = oVar8.f26478l;
                        }
                    }
                    fT3 = fT3.x();
                    oVar8 = (fT3 == null || (c0765b2 = fT3.f8232N) == null) ? null : c0765b2.f8390e;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i12 = size - 1;
                        if (((I0.e) arrayList.get(size)).f(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i12 < 0) {
                            break;
                        }
                        size = i12;
                    }
                }
                ?? E9 = oVar2.f26475h;
                ?? eVar4 = 0;
                while (E9 != 0) {
                    if (E9 instanceof I0.e) {
                        if (((I0.e) E9).f(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((E9.j & 8192) != 0 && (E9 instanceof AbstractC0776j)) {
                        o oVar10 = ((AbstractC0776j) E9).f8443w;
                        int i13 = 0;
                        while (oVar10 != null) {
                            if ((oVar10.j & 8192) != 0) {
                                i13++;
                                if (i13 == 1) {
                                    E9 = E9;
                                    eVar4 = eVar4;
                                    eVar4 = eVar4;
                                    E9 = oVar10;
                                } else {
                                    if (eVar4 == 0) {
                                        eVar4 = new e(new o[16]);
                                    }
                                    if (E9 != 0) {
                                        eVar4.c(E9);
                                        E9 = 0;
                                    }
                                    eVar4.c(oVar10);
                                }
                            } else {
                                E9 = E9;
                                eVar4 = eVar4;
                            }
                            oVar10 = oVar10.f26479m;
                            E9 = E9;
                            eVar4 = eVar4;
                        }
                        if (i13 == 1) {
                            E9 = E9;
                            eVar4 = eVar4;
                        } else {
                            E9 = E9;
                            eVar4 = eVar4;
                        }
                    }
                    E9 = AbstractC0777k.e(eVar4);
                }
                if (((Boolean) function0.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? E10 = oVar2.f26475h;
                ?? eVar5 = 0;
                while (E10 != 0) {
                    if (E10 instanceof I0.e) {
                        if (((I0.e) E10).z(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((E10.j & 8192) != 0 && (E10 instanceof AbstractC0776j)) {
                        o oVar11 = ((AbstractC0776j) E10).f8443w;
                        int i14 = 0;
                        while (oVar11 != null) {
                            if ((oVar11.j & 8192) != 0) {
                                i14++;
                                if (i14 == 1) {
                                    eVar5 = eVar5;
                                    E10 = E10;
                                    eVar5 = eVar5;
                                    E10 = oVar11;
                                } else {
                                    if (eVar5 == 0) {
                                        eVar5 = new e(new o[16]);
                                    }
                                    if (E10 != 0) {
                                        eVar5.c(E10);
                                        E10 = 0;
                                    }
                                    eVar5.c(oVar11);
                                }
                            } else {
                                eVar5 = eVar5;
                                E10 = E10;
                            }
                            oVar11 = oVar11.f26479m;
                            eVar5 = eVar5;
                            E10 = E10;
                        }
                        if (i14 == 1) {
                            eVar5 = eVar5;
                            E10 = E10;
                        } else {
                            eVar5 = eVar5;
                            E10 = E10;
                        }
                    }
                    E10 = AbstractC0777k.e(eVar5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        if (((I0.e) arrayList.get(i15)).z(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final Boolean e(int i3, p181w0.b bVar, j jVar) {
        boolean zA;
        C0765b0 c0765b0;
        y yVar;
        y yVar2;
        F f9 = this.f29082c;
        F f10 = AbstractC2909d.f(f9);
        AndroidComposeView androidComposeView = this.f29081b;
        int i9 = 4;
        F f11 = null;
        boolean zBooleanValue = false;
        if (f10 != null) {
            n layoutDirection = androidComposeView.getLayoutDirection();
            u uVarP0 = f10.P0();
            if (i3 == 1) {
                yVar = uVarP0.f29092b;
            } else if (i3 == 2) {
                yVar = uVarP0.f29093c;
            } else if (i3 == 5) {
                yVar = uVarP0.f29094d;
            } else if (i3 == 6) {
                yVar = uVarP0.f29095e;
            } else if (i3 == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal == 0) {
                    yVar2 = uVarP0.f29097h;
                } else {
                    if (iOrdinal != 1) {
                        throw new b();
                    }
                    yVar2 = uVarP0.f29098i;
                }
                if (yVar2 == y.f29103b) {
                    yVar2 = null;
                }
                if (yVar2 == null) {
                    yVar = uVarP0.f29096f;
                } else {
                    yVar = yVar2;
                }
            } else if (i3 == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    yVar2 = uVarP0.f29098i;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new b();
                    }
                    yVar2 = uVarP0.f29097h;
                }
                if (yVar2 == y.f29103b) {
                    yVar2 = null;
                }
                if (yVar2 == null) {
                    yVar = uVarP0.g;
                } else {
                    yVar = yVar2;
                }
            } else {
                if (i3 != 7 && i3 != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                C2906a c2906a = new C2906a(i3);
                p pVar = (p) AbstractC0777k.u(f10).getFocusOwner();
                F f12 = pVar.f();
                if (i3 == 7) {
                    uVarP0.j.invoke(c2906a);
                } else {
                    uVarP0.f29099k.invoke(c2906a);
                }
                yVar = c2906a.f29061b ? y.f29104c : f12 != pVar.f() ? y.f29105d : y.f29103b;
            }
            y yVar3 = y.f29104c;
            if (!m.a(yVar, yVar3)) {
                if (m.a(yVar, y.f29105d)) {
                    F f13 = AbstractC2909d.f(f9);
                    if (f13 != null) {
                        return (Boolean) jVar.invoke(f13);
                    }
                } else {
                    y yVar4 = y.f29103b;
                    if (!m.a(yVar, yVar4)) {
                        if (yVar == yVar4) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        if (yVar == yVar3) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        e eVar = yVar.f29106a;
                        int i10 = eVar.j;
                        if (i10 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = eVar.f21324h;
                            boolean z6 = false;
                            for (int i11 = 0; i11 < i10; i11++) {
                                o oVar = (o) ((A) objArr[i11]);
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
                                    int i12 = eVar2.j;
                                    if (i12 == 0) {
                                        break;
                                    }
                                    o oVarE = (o) eVar2.m(i12 - 1);
                                    if ((oVarE.f26477k & 1024) == 0) {
                                        AbstractC0777k.b(eVar2, oVarE);
                                    } else {
                                        while (oVarE != null) {
                                            if ((oVarE.j & 1024) != 0) {
                                                e eVar3 = null;
                                                while (oVarE != null) {
                                                    if (oVarE instanceof F) {
                                                        if (((Boolean) jVar.invoke((F) oVarE)).booleanValue()) {
                                                            z6 = true;
                                                            break;
                                                        }
                                                    } else if ((oVarE.j & 1024) != 0 && (oVarE instanceof AbstractC0776j)) {
                                                        int i13 = 0;
                                                        for (o oVar4 = ((AbstractC0776j) oVarE).f8443w; oVar4 != null; oVar4 = oVar4.f26479m) {
                                                            if ((oVar4.j & 1024) != 0) {
                                                                i13++;
                                                                if (i13 == 1) {
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
                                                        if (i13 == 1) {
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
                            zBooleanValue = z6;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        f10 = null;
        n layoutDirection2 = androidComposeView.getLayoutDirection();
        p029d.b bVar2 = new p029d.b(f10, this, jVar);
        if (i3 == 1 || i3 == 2) {
            if (i3 == 1) {
                zA = AbstractC2909d.l(f9, bVar2);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                zA = AbstractC2909d.a(f9, bVar2);
            }
            return Boolean.valueOf(zA);
        }
        if (i3 == 3 || i3 == 4 || i3 == 5 || i3 == 6) {
            return AbstractC2909d.E(i3, bVar2, f9, bVar);
        }
        if (i3 == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    throw new b();
                }
                i9 = 3;
            }
            F f14 = AbstractC2909d.f(f9);
            if (f14 != null) {
                return AbstractC2909d.E(i9, bVar2, f14, bVar);
            }
            return null;
        }
        if (i3 != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) C2911f.a(i3))).toString());
        }
        F f15 = AbstractC2909d.f(f9);
        if (f15 != null) {
            if (!f15.f26475h.f26487u) {
                a.b("visitAncestors called on an unattached node");
            }
            o oVar5 = f15.f26475h.f26478l;
            F fT = AbstractC0777k.t(f15);
            loop5: while (fT != null) {
                if ((fT.f8232N.f8391f.f26477k & 1024) != 0) {
                    while (oVar5 != null) {
                        if ((oVar5.j & 1024) != 0) {
                            o oVarE2 = oVar5;
                            e eVar4 = null;
                            while (oVarE2 != null) {
                                if (oVarE2 instanceof F) {
                                    F f16 = (F) oVarE2;
                                    if (f16.P0().f29091a) {
                                        f11 = f16;
                                        break loop5;
                                    }
                                } else if ((oVarE2.j & 1024) != 0 && (oVarE2 instanceof AbstractC0776j)) {
                                    int i14 = 0;
                                    for (o oVar6 = ((AbstractC0776j) oVarE2).f8443w; oVar6 != null; oVar6 = oVar6.f26479m) {
                                        if ((oVar6.j & 1024) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                oVarE2 = oVar6;
                                            } else {
                                                if (eVar4 == null) {
                                                    eVar4 = new e(new o[16]);
                                                }
                                                if (oVarE2 != null) {
                                                    eVar4.c(oVarE2);
                                                    oVarE2 = null;
                                                }
                                                eVar4.c(oVar6);
                                            }
                                        }
                                    }
                                    if (i14 != 1) {
                                        oVarE2 = AbstractC0777k.e(eVar4);
                                    }
                                }
                                oVarE2 = AbstractC0777k.e(eVar4);
                            }
                        }
                        oVar5 = oVar5.f26478l;
                    }
                }
                fT = fT.x();
                oVar5 = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
            }
        }
        F f17 = f11;
        if (f17 != null && !f17.equals(f9)) {
            zBooleanValue = ((Boolean) bVar2.invoke(f17)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final F f() {
        F f9 = this.f29086h;
        if (f9 == null || !f9.f26487u) {
            return null;
        }
        return f9;
    }

    public final boolean g(int i3, boolean z6) {
        F f9 = f();
        AndroidComposeView androidComposeView = this.f29080a;
        if (f9 == null || !f9.f29050v || !androidComposeView.v(i3)) {
            kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
            a2.f24539h = Boolean.FALSE;
            F f10 = f();
            Boolean boolE = e(i3, androidComposeView.getEmbeddedViewFocusRect(), new Q(a2, i3, 1));
            if (!m.a(boolE, Boolean.TRUE) || f10 == f()) {
                if (boolE != null && a2.f24539h != null) {
                    if (!boolE.booleanValue() || !((Boolean) a2.f24539h).booleanValue()) {
                        if ((i3 == 1 || i3 == 2) && z6 && b(i3, false, false)) {
                            Boolean boolE2 = e(i3, null, new C0850u(i3, 3));
                            if (boolE2 != null ? boolE2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean h(int i3) {
        if (!b(i3, false, false)) {
            return false;
        }
        Boolean boolE = e(i3, null, new C0850u(i3, 2));
        boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
        if (!zBooleanValue) {
            c();
        }
        return zBooleanValue;
    }

    public final void i(F f9) {
        F f10 = this.f29086h;
        this.f29086h = f9;
        D d4 = this.g;
        Object[] objArr = d4.f26303a;
        int i3 = d4.f26304b;
        for (int i9 = 0; i9 < i3; i9++) {
            ((l) objArr[i9]).a(f10, f9);
        }
    }

    public final boolean j(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        boolean z6;
        long j;
        int iNumberOfTrailingZeros2;
        long[] jArr;
        int i3;
        long jB = c.b(keyEvent);
        int iC = c.c(keyEvent);
        boolean z9 = true;
        char c9 = '\b';
        int i9 = 0;
        if (iC != 2) {
            if (iC != 1) {
                return true;
            }
            A a2 = this.f29085f;
            if (a2 == null || !a2.a(jB)) {
                return false;
            }
            A a9 = this.f29085f;
            if (a9 != null) {
                int iHashCode = Long.hashCode(jB) * (-862048943);
                int i10 = iHashCode ^ (iHashCode << 16);
                int i11 = i10 & 127;
                int i12 = a9.f26288c;
                int i13 = i10 >>> 7;
                loop5: while (true) {
                    int i14 = i13 & i12;
                    long[] jArr2 = a9.f26286a;
                    int i15 = i14 >> 3;
                    int i16 = (i14 & 7) << 3;
                    long j9 = ((jArr2[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr2[i15] >>> i16);
                    long j10 = (((long) i11) * 72340172838076673L) ^ j9;
                    for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i12;
                        if (a9.f26287b[iNumberOfTrailingZeros] == jB) {
                            break loop5;
                        }
                    }
                    if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i9 += 8;
                    i13 = i14 + i9;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    a9.f26289d--;
                    long[] jArr3 = a9.f26286a;
                    int i17 = a9.f26288c;
                    int i18 = iNumberOfTrailingZeros >> 3;
                    int i19 = (iNumberOfTrailingZeros & 7) << 3;
                    long j12 = (jArr3[i18] & (~(255 << i19))) | (254 << i19);
                    jArr3[i18] = j12;
                    jArr3[(((iNumberOfTrailingZeros - 7) & i17) + (i17 & 7)) >> 3] = j12;
                    return true;
                }
            }
            return true;
        }
        A a10 = this.f29085f;
        if (a10 == null) {
            a10 = new A(3);
            this.f29085f = a10;
        }
        A a11 = a10;
        int iHashCode2 = Long.hashCode(jB) * (-862048943);
        int i20 = iHashCode2 ^ (iHashCode2 << 16);
        int i21 = i20 >>> 7;
        int i22 = i20 & 127;
        int i23 = a11.f26288c;
        int i24 = i21 & i23;
        int i25 = 0;
        loop0: while (true) {
            long[] jArr4 = a11.f26286a;
            int i26 = i24 >> 3;
            int i27 = (i24 & 7) << 3;
            long j13 = (jArr4[i26] >>> i27) | ((jArr4[i26 + (z9 ? 1 : 0)] << (64 - i27)) & ((-i27) >> 63));
            long j14 = i22;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (j15 - 72340172838076673L) & (~j15) & (-9187201950435737472L);
            while (j16 != 0) {
                iNumberOfTrailingZeros2 = (i24 + (Long.numberOfTrailingZeros(j16) >> 3)) & i23;
                z6 = z9;
                if (a11.f26287b[iNumberOfTrailingZeros2] == jB) {
                    break loop0;
                }
                j16 &= j16 - 1;
                z9 = z6 ? 1 : 0;
            }
            z6 = z9;
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                int iB = a11.b(i21);
                if (a11.f26290e != 0 || ((a11.f26286a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j = 128;
                } else {
                    int i28 = a11.f26288c;
                    if (i28 > 8) {
                        j = 128;
                        if (Long.compare((((long) a11.f26289d) * 32) ^ Long.MIN_VALUE, (((long) i28) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr5 = a11.f26286a;
                            int i29 = a11.f26288c;
                            long[] jArr6 = a11.f26287b;
                            int i30 = 0;
                            for (int i31 = (i29 + 7) >> 3; i30 < i31; i31 = i31) {
                                long j17 = jArr5[i30] & (-9187201950435737472L);
                                jArr5[i30] = ((~j17) + (j17 >>> 7)) & (-72340172838076674L);
                                i30++;
                                jArr6 = jArr6;
                            }
                            long[] jArr7 = jArr6;
                            int iP0 = p078i6.m.p0(jArr5);
                            int i32 = iP0 - 1;
                            jArr5[i32] = (jArr5[i32] & 72057594037927935L) | (-72057594037927936L);
                            jArr5[iP0] = jArr5[0];
                            int i33 = 0;
                            while (i33 != i29) {
                                int i34 = i33 >> 3;
                                int i35 = (i33 & 7) << 3;
                                long j18 = (jArr5[i34] >> i35) & 255;
                                if (j18 != 128 && j18 == 254) {
                                    int iHashCode3 = Long.hashCode(jArr7[i33]) * (-862048943);
                                    int i36 = iHashCode3 ^ (iHashCode3 << 16);
                                    int i37 = i36 >>> 7;
                                    int iB2 = a11.b(i37);
                                    int i38 = i37 & i29;
                                    char c10 = c9;
                                    if (((iB2 - i38) & i29) / 8 == ((i33 - i38) & i29) / 8) {
                                        jArr5[i34] = (jArr5[i34] & (~(255 << i35))) | (((long) (i36 & 127)) << i35);
                                        jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i33++;
                                    } else {
                                        int i39 = i33;
                                        int i40 = iB2 >> 3;
                                        long j19 = jArr5[i40];
                                        int i41 = (iB2 & 7) << 3;
                                        if (((j19 >> i41) & 255) == 128) {
                                            jArr5[i40] = (j19 & (~(255 << i41))) | (((long) (i36 & 127)) << i41);
                                            jArr5[i34] = (jArr5[i34] & (~(255 << i35))) | (128 << i35);
                                            jArr7[iB2] = jArr7[i39];
                                            jArr7[i39] = 0;
                                            i3 = i39;
                                        } else {
                                            jArr5[i40] = (((long) (i36 & 127)) << i41) | (j19 & (~(255 << i41)));
                                            long j20 = jArr7[iB2];
                                            jArr7[iB2] = jArr7[i39];
                                            jArr7[i39] = j20;
                                            i3 = i39 - 1;
                                        }
                                        jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i33 = i3 + 1;
                                    }
                                    c9 = c10;
                                } else {
                                    i33++;
                                }
                            }
                            a11.f26290e = P.a(a11.f26288c) - a11.f26289d;
                        }
                        iB = a11.b(i21);
                    } else {
                        j = 128;
                    }
                    int iB3 = P.b(a11.f26288c);
                    long[] jArr8 = a11.f26286a;
                    long[] jArr9 = a11.f26287b;
                    a11.c(iB3);
                    long[] jArr10 = a11.f26286a;
                    long[] jArr11 = a11.f26287b;
                    int i42 = a11.f26288c;
                    int i43 = 0;
                    for (int i44 = a11.f26288c; i43 < i44; i44 = i44) {
                        if (((jArr8[i43 >> 3] >> ((i43 & 7) << 3)) & 255) < j) {
                            long j21 = jArr9[i43];
                            int iHashCode4 = Long.hashCode(j21) * (-862048943);
                            int i45 = iHashCode4 ^ (iHashCode4 << 16);
                            jArr = jArr10;
                            int iB4 = a11.b(i45 >>> 7);
                            int i46 = iB4 >> 3;
                            int i47 = (iB4 & 7) << 3;
                            long j22 = (jArr[i46] & (~(255 << i47))) | (((long) (i45 & 127)) << i47);
                            jArr[i46] = j22;
                            jArr[(((iB4 - 7) & i42) + (i42 & 7)) >> 3] = j22;
                            jArr11[iB4] = j21;
                        } else {
                            jArr = jArr10;
                        }
                        i43++;
                        jArr9 = jArr9;
                        jArr10 = jArr;
                    }
                    iB = a11.b(i21);
                }
                iNumberOfTrailingZeros2 = iB;
                a11.f26289d++;
                int i48 = a11.f26290e;
                long[] jArr12 = a11.f26286a;
                int i49 = iNumberOfTrailingZeros2 >> 3;
                long j23 = jArr12[i49];
                int i50 = (iNumberOfTrailingZeros2 & 7) << 3;
                a11.f26290e = i48 - (((j23 >> i50) & 255) == j ? z6 ? 1 : 0 : 0);
                int i51 = a11.f26288c;
                long j24 = (j23 & (~(255 << i50))) | (j14 << i50);
                jArr12[i49] = j24;
                jArr12[(((iNumberOfTrailingZeros2 - 7) & i51) + (i51 & 7)) >> 3] = j24;
                break;
            }
            i25 += 8;
            i24 = (i24 + i25) & i23;
            z9 = z6 ? 1 : 0;
        }
        a11.f26287b[iNumberOfTrailingZeros2] = jB;
        return z6;
    }
}
