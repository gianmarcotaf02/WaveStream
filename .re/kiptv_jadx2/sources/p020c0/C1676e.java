package p020c0;

import D1.C0223h;
import V7.n0;
import kotlin.jvm.internal.m;
import p047f0.b;
import p064h0.c;
import p064h0.k;
import p073i0.a;
import p100l6.g;

public final class C1676e implements g, S0 {

    public static final C0223h f18239i = new C0223h(22);
    public static final C1676e j = new C1676e(1);

    public static final C1676e f18240k = new C1676e(2);

    public static final C1676e f18241l = new C1676e(3);

    public static final C1676e f18242m = new C1676e(4);

    public static final C1676e f18243n = new C1676e(5);

    public final int f18244h;

    public C1676e(int i3) {
        this.f18244h = i3;
    }

    public static final void b(C1676e c1676e) {
        n0 n0Var;
        b bVar;
        p073i0.b bVar2;
        n0 n0Var2 = C1718z0.f18428z;
        do {
            n0Var = C1718z0.f18428z;
            bVar = (b) n0Var.getValue();
            bVar2 = (p073i0.b) bVar;
            c cVarA = bVar2.j;
            a aVar = (a) cVarA.get(c1676e);
            if (aVar != null) {
                int iHashCode = c1676e != null ? c1676e.hashCode() : 0;
                k kVar = cVarA.f22432h;
                k kVarV = kVar.v(iHashCode, c1676e, 0);
                if (kVar != kVarV) {
                    cVarA = kVarV == null ? c.j : new c(kVarV, cVarA.f22433i - 1);
                }
                p081j0.b bVar3 = p081j0.b.f23868a;
                Object obj = aVar.f22741a;
                boolean z6 = obj != bVar3;
                Object obj2 = aVar.f22742b;
                if (z6) {
                    Object obj3 = cVarA.get(obj);
                    m.b(obj3);
                    cVarA = cVarA.a(obj, new a(((a) obj3).f22741a, obj2));
                }
                if (obj2 != bVar3) {
                    Object obj4 = cVarA.get(obj2);
                    m.b(obj4);
                    cVarA = cVarA.a(obj2, new a(obj, ((a) obj4).f22742b));
                }
                Object obj5 = obj != bVar3 ? bVar2.f22744h : obj2;
                if (obj2 != bVar3) {
                    obj = bVar2.f22745i;
                }
                bVar2 = new p073i0.b(obj5, obj, cVarA);
            }
            if (bVar == bVar2) {
                return;
            }
        } while (!n0Var.g(bVar, bVar2));
    }

    @Override
    public boolean a(Object obj, Object obj2) {
        switch (this.f18244h) {
            case 2:
                return false;
            case 3:
                return obj == obj2;
            default:
                return m.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f18244h) {
            case 2:
                return "NeverEqualPolicy";
            case 3:
                return "ReferentialEqualityPolicy";
            case 4:
            case 6:
            default:
                return super.toString();
            case 5:
                return "StructuralEqualityPolicy";
            case 7:
                return "Empty";
        }
    }
}
