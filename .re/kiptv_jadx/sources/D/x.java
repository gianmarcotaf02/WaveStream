package D;

/* JADX INFO: loaded from: classes.dex */
public final class x implements x.InterfaceC3076x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1786c;

    public /* synthetic */ x(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f1784a = i3;
        this.f1786c = obj2;
        this.f1785b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static int b(D.x xVar, int i3) {
        java.lang.Object obj;
        D.t tVarH = ((D.D) xVar.f1786c).h();
        if (!tVarH.f1754k.isEmpty()) {
            int iC = xVar.c();
            if (i3 > xVar.d() || iC > i3) {
                return ((i3 - xVar.c()) * C2.a.c0(tVarH)) - ((D.D) xVar.f1786c).f1646e.f1780c.g();
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
                if (((D.u) obj).f1761a == i3) {
                    break;
                }
                i9++;
            }
            D.u uVar = (D.u) obj;
            if (uVar != null) {
                return uVar.f1770l;
            }
        }
        return 0;
    }

    @Override // x.InterfaceC3076x0
    public final float a(float f9) {
        switch (this.f1784a) {
            case 0:
                return ((x.InterfaceC3076x0) this.f1785b).a(f9);
            default:
                float fAbs = java.lang.Math.abs(f9);
                x.W0 w6 = (x.W0) this.f1785b;
                if (fAbs != 0.0f && !((java.lang.Boolean) w6.f30825h.invoke()).booleanValue()) {
                    throw new v.o0("The fling animation was cancelled", 0);
                }
                return w6.d(w6.g(((x.T0) this.f1786c).a(2, w6.e(w6.h(f9)))));
        }
    }

    public int c() {
        return ((D.D) this.f1786c).f1646e.f1779b.g();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    public int d() {
        D.u uVar = (D.u) p078i6.o.s1(((D.D) this.f1786c).h().f1754k);
        if (uVar != null) {
            return uVar.f1761a;
        }
        return 0;
    }
}
