package N6;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends N6.V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f7360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Map f7361b;

    public C(java.util.ArrayList arrayList) {
        this.f7360a = arrayList;
        java.util.Map mapX0 = p078i6.C.X0(arrayList);
        if (mapX0.size() != arrayList.size()) {
            throw new java.lang.IllegalArgumentException("Some properties have the same names");
        }
        this.f7361b = mapX0;
    }

    @Override // N6.V
    public final boolean a(p101l7.e eVar) {
        return this.f7361b.containsKey(eVar);
    }

    public final java.lang.String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f7360a + ')';
    }
}
