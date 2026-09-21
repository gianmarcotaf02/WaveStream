package p060g5;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static p060g5.e a(java.lang.String str) {
        java.lang.Object next;
        p126o6.b bVar = p060g5.e.f21884m;
        bVar.getClass();
        D1.X x9 = new D1.X(5, bVar);
        do {
            if (!x9.hasNext()) {
                next = null;
                break;
            }
            next = x9.next();
        } while (!((p060g5.e) next).f21885h.equals(str));
        p060g5.e eVar = (p060g5.e) next;
        return eVar == null ? p060g5.e.f21882k : eVar;
    }
}
