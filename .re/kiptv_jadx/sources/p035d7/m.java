package p035d7;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p035d7.r f21277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f21278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f21279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p035d7.m f21280d;

    public m(p035d7.r rVar, java.util.ArrayList arrayList, java.lang.String str) {
        this.f21277a = rVar;
        this.f21278b = arrayList;
        this.f21279c = str;
        p035d7.m mVar = null;
        if (str != null) {
            p035d7.r rVarA = rVar != null ? rVar.a() : null;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p035d7.r rVar2 = (p035d7.r) it.next();
                arrayList2.add(rVar2 != null ? rVar2.a() : null);
            }
            mVar = new p035d7.m(rVarA, arrayList2, null);
        }
        this.f21280d = mVar;
    }
}
