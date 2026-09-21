package io.ktor.client.engine;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p194x6.m f23332i;

    public /* synthetic */ c(int i3, p194x6.m mVar) {
        this.f23331h = i3;
        this.f23332i = mVar;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        p112n0.g gVar;
        p194x6.m mVar = this.f23332i;
        switch (this.f23331h) {
            case 0:
                return io.ktor.client.engine.UtilsKt.mergeHeaders$lambda$2(mVar, (java.lang.String) obj, (java.util.List) obj2);
            case 1:
                return io.ktor.util.StringValuesKt.flattenForEach$lambda$6(mVar, (java.lang.String) obj, (java.util.List) obj2);
            case 2:
                p112n0.b bVar = (p112n0.b) obj;
                java.util.List list = (java.util.List) mVar.invoke(bVar, obj2);
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    java.lang.Object obj3 = list.get(i3);
                    if (obj3 != null && (gVar = bVar.f25528i) != null && !gVar.b(obj3)) {
                        throw new java.lang.IllegalArgumentException(("item at index " + i3 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new java.util.ArrayList(list);
            default:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.getClass();
                java.lang.Boolean bool2 = (java.lang.Boolean) obj2;
                bool2.getClass();
                E5.C0310q0 c0310q0 = E5.C0310q0.f3129a;
                E5.C0310q0.a();
                mVar.invoke(bool, bool2);
                return p070h6.A.f22523a;
        }
    }
}
