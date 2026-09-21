package Y;

import S7.C0901q;
import com.google.common.util.concurrent.P;
import p020c0.AbstractC1703s;
import p020c0.C1681g0;
import p163t.AbstractC2750d;
import p163t.C2748c;

public final class p {

    public p181w0.a f10996a;

    public final float f10997b;

    public final boolean f10998c;

    public Float f10999d;

    public p181w0.a f11000e;

    public final C2748c f11001f = AbstractC2750d.a(0.0f);
    public final C2748c g = AbstractC2750d.a(0.0f);

    public final C2748c f11002h = AbstractC2750d.a(0.0f);

    public final C0901q f11003i;
    public final C1681g0 j;

    public final C1681g0 f11004k;

    public p(p181w0.a aVar, float f9, boolean z6) {
        this.f10996a = aVar;
        this.f10997b = f9;
        this.f10998c = z6;
        C0901q c0901q = new C0901q(true);
        c0901q.G(null);
        this.f11003i = c0901q;
        Boolean bool = Boolean.FALSE;
        this.j = AbstractC1703s.y(bool);
        this.f11004k = AbstractC1703s.y(bool);
    }

    public final Object a(p117n6.c cVar) {
        i iVar;
        p pVar;
        Object objM;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i3 = iVar.f10983k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.f10983k = i3 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj = iVar.f10982i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = iVar.f10983k;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            P.u0(obj);
            iVar.f10981h = this;
            iVar.f10983k = 1;
            Object objM2 = S7.C.m(new m(this, null), iVar);
            if (objM2 != aVar) {
                objM2 = a2;
            }
            if (objM2 != aVar) {
                pVar = this;
            }
            return aVar;
        }
        if (i9 == 1) {
            pVar = iVar.f10981h;
            P.u0(obj);
        } else {
            if (i9 != 2) {
                if (i9 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(obj);
                return a2;
            }
            pVar = iVar.f10981h;
            P.u0(obj);
        }
        iVar.f10981h = null;
        iVar.f10983k = 3;
        pVar.getClass();
        objM = S7.C.m(new o(pVar, null), iVar);
        if (objM != aVar) {
            objM = a2;
        }
        if (objM != aVar) {
            return aVar;
        }
        return a2;
        pVar.j.setValue(Boolean.TRUE);
        iVar.f10981h = pVar;
        iVar.f10983k = 2;
        if (pVar.f11003i.k(iVar) != aVar) {
            iVar.f10981h = null;
            iVar.f10983k = 3;
            pVar.getClass();
            objM = S7.C.m(new o(pVar, null), iVar);
            if (objM != aVar) {
                objM = a2;
            }
            if (objM != aVar) {
                return a2;
            }
        }
        return aVar;
    }
}
