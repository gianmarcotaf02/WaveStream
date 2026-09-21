package u5;

/* JADX INFO: renamed from: u5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2867c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f28711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f28712b;

    public C2867c(java.lang.String id, java.lang.String name) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(name, "name");
        this.f28711a = id;
        this.f28712b = name;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5.C2867c)) {
            return false;
        }
        u5.C2867c c2867c = (u5.C2867c) obj;
        return kotlin.jvm.internal.m.a(this.f28711a, c2867c.f28711a) && kotlin.jvm.internal.m.a(this.f28712b, c2867c.f28712b);
    }

    public final int hashCode() {
        return this.f28712b.hashCode() + (this.f28711a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvCmNamedId(id=");
        sb.append(this.f28711a);
        sb.append(", name=");
        return Y6.f.m(sb, this.f28712b, ")");
    }
}
