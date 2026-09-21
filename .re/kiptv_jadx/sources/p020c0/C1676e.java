package p020c0;

/* JADX INFO: renamed from: c0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1676e implements p100l6.g, p020c0.S0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final D1.C0223h f18239i = new D1.C0223h(22);
    public static final /* synthetic */ p020c0.C1676e j = new p020c0.C1676e(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p020c0.C1676e f18240k = new p020c0.C1676e(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p020c0.C1676e f18241l = new p020c0.C1676e(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p020c0.C1676e f18242m = new p020c0.C1676e(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p020c0.C1676e f18243n = new p020c0.C1676e(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18244h;

    public /* synthetic */ C1676e(int i3) {
        this.f18244h = i3;
    }

    public static final void b(p020c0.C1676e c1676e) {
        V7.n0 n0Var;
        p047f0.b bVar;
        p073i0.b bVar2;
        V7.n0 n0Var2 = p020c0.C1718z0.f18428z;
        do {
            n0Var = p020c0.C1718z0.f18428z;
            bVar = (p047f0.b) n0Var.getValue();
            bVar2 = (p073i0.b) bVar;
            p064h0.c cVarA = bVar2.j;
            p073i0.a aVar = (p073i0.a) cVarA.get(c1676e);
            if (aVar != null) {
                int iHashCode = c1676e != null ? c1676e.hashCode() : 0;
                p064h0.k kVar = cVarA.f22432h;
                p064h0.k kVarV = kVar.v(iHashCode, c1676e, 0);
                if (kVar != kVarV) {
                    cVarA = kVarV == null ? p064h0.c.j : new p064h0.c(kVarV, cVarA.f22433i - 1);
                }
                p081j0.b bVar3 = p081j0.b.f23868a;
                java.lang.Object obj = aVar.f22741a;
                boolean z6 = obj != bVar3;
                java.lang.Object obj2 = aVar.f22742b;
                if (z6) {
                    java.lang.Object obj3 = cVarA.get(obj);
                    kotlin.jvm.internal.m.b(obj3);
                    cVarA = cVarA.a(obj, new p073i0.a(((p073i0.a) obj3).f22741a, obj2));
                }
                if (obj2 != bVar3) {
                    java.lang.Object obj4 = cVarA.get(obj2);
                    kotlin.jvm.internal.m.b(obj4);
                    cVarA = cVarA.a(obj2, new p073i0.a(obj, ((p073i0.a) obj4).f22742b));
                }
                java.lang.Object obj5 = obj != bVar3 ? bVar2.f22744h : obj2;
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

    @Override // p020c0.S0
    public boolean a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f18244h) {
            case 2:
                return false;
            case 3:
                return obj == obj2;
            default:
                return kotlin.jvm.internal.m.a(obj, obj2);
        }
    }

    public java.lang.String toString() {
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
