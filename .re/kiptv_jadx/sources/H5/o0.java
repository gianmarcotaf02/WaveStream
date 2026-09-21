package H5;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f4272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H5.p0 f4273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H5.M f4275d;

    public o0(java.lang.String query, H5.p0 results, boolean z6, H5.M filter) {
        kotlin.jvm.internal.m.e(query, "query");
        kotlin.jvm.internal.m.e(results, "results");
        kotlin.jvm.internal.m.e(filter, "filter");
        this.f4272a = query;
        this.f4273b = results;
        this.f4274c = z6;
        this.f4275d = filter;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H5.o0)) {
            return false;
        }
        H5.o0 o0Var = (H5.o0) obj;
        return kotlin.jvm.internal.m.a(this.f4272a, o0Var.f4272a) && kotlin.jvm.internal.m.a(this.f4273b, o0Var.f4273b) && this.f4274c == o0Var.f4274c && this.f4275d == o0Var.f4275d;
    }

    public final int hashCode() {
        return this.f4275d.hashCode() + p121o0.p.f((this.f4273b.hashCode() + (this.f4272a.hashCode() * 31)) * 31, 31, this.f4274c);
    }

    public final java.lang.String toString() {
        return "QueryState(query=" + this.f4272a + ", results=" + this.f4273b + ", searching=" + this.f4274c + ", filter=" + this.f4275d + ")";
    }
}
