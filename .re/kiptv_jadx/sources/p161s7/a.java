package p161s7;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements L7.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p161s7.a f27377i = new p161s7.a(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f27378h;

    public /* synthetic */ a(int i3) {
        this.f27378h = i3;
    }

    @Override // L7.b
    public final java.lang.Iterable a(java.lang.Object obj) {
        java.util.Collection collectionI;
        switch (this.f27378h) {
            case 0:
                int i3 = p161s7.d.f27382a;
                java.util.Collection collectionI2 = ((Q6.S) obj).i();
                java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(collectionI2, 10));
                java.util.Iterator it = ((java.util.ArrayList) collectionI2).iterator();
                while (it.hasNext()) {
                    arrayList.add(((Q6.S) it.next()).a());
                }
                return arrayList;
            default:
                N6.InterfaceC0689c interfaceC0689c = (N6.InterfaceC0689c) obj;
                return (interfaceC0689c == null || (collectionI = interfaceC0689c.i()) == null) ? p078i6.w.f23205h : collectionI;
        }
    }
}
