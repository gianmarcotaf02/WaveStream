package J;

/* JADX INFO: loaded from: classes.dex */
public abstract class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D8.x f5623a = new D8.x(g1.p.f21833a, 0, 0);

    public static final g1.D a(g1.F f9, p011b1.C1650g c1650g) {
        g1.q qVar;
        g1.D dA = f9.a(c1650g);
        int length = c1650g.f17809i.length();
        p011b1.C1650g c1650g2 = dA.f21786a;
        int length2 = c1650g2.f17809i.length();
        int iMin = java.lang.Math.min(length, 100);
        int i3 = 0;
        while (true) {
            qVar = dA.f21787b;
            if (i3 >= iMin) {
                break;
            }
            b(qVar.n(i3), length2, i3);
            i3++;
        }
        b(qVar.n(length), length2, length);
        int iMin2 = java.lang.Math.min(length2, 100);
        for (int i9 = 0; i9 < iMin2; i9++) {
            c(qVar.i(i9), length, i9);
        }
        c(qVar.i(length2), length, length2);
        return new g1.D(c1650g2, new D8.x(qVar, c1650g.f17809i.length(), c1650g2.f17809i.length()));
    }

    public static final void b(int i3, int i9, int i10) {
        boolean z6 = false;
        if (i3 >= 0 && i3 <= i9) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        java.lang.StringBuilder sbS = p121o0.p.s(i10, i3, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbS.append(i9);
        sbS.append(']');
        A.b.c(sbS.toString());
    }

    public static final void c(int i3, int i9, int i10) {
        boolean z6 = false;
        if (i3 >= 0 && i3 <= i9) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        java.lang.StringBuilder sbS = p121o0.p.s(i10, i3, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbS.append(i9);
        sbS.append(']');
        A.b.c(sbS.toString());
    }
}
