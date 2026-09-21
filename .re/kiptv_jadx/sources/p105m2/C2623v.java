package p105m2;

/* JADX INFO: renamed from: m2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2623v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p105m2.C2623v f25370c = new p105m2.C2623v(new android.os.Bundle(), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Bundle f25371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.util.List f25372b;

    public C2623v(android.os.Bundle bundle, java.util.ArrayList arrayList) {
        this.f25371a = bundle;
        this.f25372b = arrayList;
    }

    public final void a() {
        if (this.f25372b == null) {
            java.util.ArrayList<java.lang.String> stringArrayList = this.f25371a.getStringArrayList("controlCategories");
            this.f25372b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f25372b = java.util.Collections.EMPTY_LIST;
            }
        }
    }

    public final java.util.ArrayList b() {
        a();
        return new java.util.ArrayList(this.f25372b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p105m2.C2623v)) {
            return false;
        }
        p105m2.C2623v c2623v = (p105m2.C2623v) obj;
        a();
        c2623v.a();
        return this.f25372b.equals(c2623v.f25372b);
    }

    public final int hashCode() {
        a();
        return this.f25372b.hashCode();
    }

    public final java.lang.String toString() {
        return "MediaRouteSelector{ controlCategories=" + java.util.Arrays.toString(b().toArray()) + " }";
    }
}
