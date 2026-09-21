package N7;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements N7.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f7457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f7458c;

    public /* synthetic */ l(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f7456a = i3;
        this.f7457b = obj;
        this.f7458c = obj2;
    }

    @Override // N7.m
    public final java.util.Iterator iterator() {
        switch (this.f7456a) {
            case 0:
                return new N7.k(this);
            case 1:
                N7.m mVar = (N7.m) this.f7457b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = mVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                p078i6.t.L0((java.util.Comparator) this.f7458c, arrayList);
                return arrayList.iterator();
            default:
                return new p160s6.h(this);
        }
    }

    public l(java.io.File start) {
        this.f7456a = 2;
        p160s6.j jVar = p160s6.j.f27373h;
        kotlin.jvm.internal.m.e(start, "start");
        this.f7457b = start;
        this.f7458c = jVar;
    }
}
