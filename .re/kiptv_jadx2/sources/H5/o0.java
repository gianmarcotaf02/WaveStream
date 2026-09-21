package H5;

public final class o0 {

    public final String f4272a;

    public final p0 f4273b;

    public final boolean f4274c;

    public final M f4275d;

    public o0(String query, p0 results, boolean z6, M filter) {
        kotlin.jvm.internal.m.e(query, "query");
        kotlin.jvm.internal.m.e(results, "results");
        kotlin.jvm.internal.m.e(filter, "filter");
        this.f4272a = query;
        this.f4273b = results;
        this.f4274c = z6;
        this.f4275d = filter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.m.a(this.f4272a, o0Var.f4272a) && kotlin.jvm.internal.m.a(this.f4273b, o0Var.f4273b) && this.f4274c == o0Var.f4274c && this.f4275d == o0Var.f4275d;
    }

    public final int hashCode() {
        return this.f4275d.hashCode() + p121o0.p.f((this.f4273b.hashCode() + (this.f4272a.hashCode() * 31)) * 31, 31, this.f4274c);
    }

    public final String toString() {
        return "QueryState(query=" + this.f4272a + ", results=" + this.f4273b + ", searching=" + this.f4274c + ", filter=" + this.f4275d + ")";
    }
}
