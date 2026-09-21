package G2;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f3782a = p113n1.b.b(0, 0, 5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3783b = 0;

    public static final T2.i a(O0.InterfaceC0719h interfaceC0719h, p020c0.C1700q c1700q) {
        java.lang.Object obj;
        java.lang.Object obj2;
        boolean zA = kotlin.jvm.internal.m.a(interfaceC0719h, O0.C0718g.f7638d);
        boolean zG = c1700q.g(zA);
        java.lang.Object objQ = c1700q.Q();
        if (zG || objQ == p020c0.C1690l.f18284a) {
            if (zA) {
                obj = T2.i.f9741a;
            } else {
                F2.l lVar = new F2.l();
                lVar.f3543b = f3782a;
                obj = lVar;
            }
            java.lang.Object obj3 = obj;
            c1700q.n0(obj3);
            obj2 = obj3;
        }
        obj2 = objQ;
        return (T2.i) obj2;
    }

    public static void b(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(B2.a.m("Unsupported type: ", str, ". ", Y6.f.h("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }
}
