package D;

/* JADX INFO: renamed from: D.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0194a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f1668e;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    public static int a(E.p pVar, boolean z6) {
        return z6 ? ((E.q) p078i6.o.q1(pVar.f2675m)).f2682a + 1 : ((E.q) p078i6.o.h1(pVar.f2675m)).f2682a - 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    public static int b(D.t tVar, boolean z6) {
        return z6 ? ((D.u) p078i6.o.q1(tVar.f1754k)).f1761a + 1 : ((D.u) p078i6.o.h1(tVar.f1754k)).f1761a - 1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    public static int c(E.p pVar, boolean z6) {
        if (z6) {
            E.q qVar = (E.q) p078i6.o.q1(pVar.f2675m);
            return (pVar.f2679q == x.EnumC3061p0.f30978h ? qVar.f2695p : qVar.f2696q) + 1;
        }
        E.q qVar2 = (E.q) p078i6.o.h1(pVar.f2675m);
        return (pVar.f2679q == x.EnumC3061p0.f30978h ? qVar2.f2695p : qVar2.f2696q) - 1;
    }
}
