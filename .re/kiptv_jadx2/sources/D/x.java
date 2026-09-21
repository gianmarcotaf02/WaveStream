package D;

import v.o0;
import x.InterfaceC3076x0;
import x.T0;
import x.W0;

public final class x implements InterfaceC3076x0 {

    public final int f1784a;

    public final Object f1785b;

    public final Object f1786c;

    public x(Object obj, Object obj2, int i3) {
        this.f1784a = i3;
        this.f1786c = obj2;
        this.f1785b = obj;
    }

    public static int b(x xVar, int i3) {
        Object obj;
        t tVarH = ((D) xVar.f1786c).h();
        if (!tVarH.f1754k.isEmpty()) {
            int iC = xVar.c();
            if (i3 > xVar.d() || iC > i3) {
                return ((i3 - xVar.c()) * C2.a.c0(tVarH)) - ((D) xVar.f1786c).f1646e.f1780c.g();
            }
            ?? r9 = tVarH.f1754k;
            int size = r9.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    obj = null;
                    break;
                }
                obj = r9.get(i9);
                if (((u) obj).f1761a == i3) {
                    break;
                }
                i9++;
            }
            u uVar = (u) obj;
            if (uVar != null) {
                return uVar.f1770l;
            }
        }
        return 0;
    }

    @Override
    public final float a(float f9) {
        switch (this.f1784a) {
            case 0:
                return ((InterfaceC3076x0) this.f1785b).a(f9);
            default:
                float fAbs = Math.abs(f9);
                W0 w6 = (W0) this.f1785b;
                if (fAbs != 0.0f && !((Boolean) w6.f30825h.invoke()).booleanValue()) {
                    throw new o0("The fling animation was cancelled", 0);
                }
                return w6.d(w6.g(((T0) this.f1786c).a(2, w6.e(w6.h(f9)))));
        }
    }

    public int c() {
        return ((D) this.f1786c).f1646e.f1779b.g();
    }

    public int d() {
        u uVar = (u) p078i6.o.s1(((D) this.f1786c).h().f1754k);
        if (uVar != null) {
            return uVar.f1761a;
        }
        return 0;
    }
}
