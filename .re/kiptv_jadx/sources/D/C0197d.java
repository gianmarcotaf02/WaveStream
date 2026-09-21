package D;

/* JADX INFO: renamed from: D.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0197d implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ D.D f1683i;

    public /* synthetic */ C0197d(D.D d4, int i3) {
        this.f1682h = i3;
        this.f1683i = d4;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Iterable, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f1682h) {
            case 0:
                return java.lang.Integer.valueOf(this.f1683i.h().f1757n);
            default:
                ?? r9 = this.f1683i.h().f1754k;
                java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(r9, 10));
                java.util.Iterator it = r9.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Integer.valueOf(((D.u) it.next()).f1761a));
                }
                return arrayList;
        }
    }
}
