package C5;

/* JADX INFO: loaded from: classes4.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f1337b;

    public g2(java.lang.String id, java.lang.String name) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(name, "name");
        this.f1336a = id;
        this.f1337b = name;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5.g2)) {
            return false;
        }
        C5.g2 g2Var = (C5.g2) obj;
        return kotlin.jvm.internal.m.a(this.f1336a, g2Var.f1336a) && kotlin.jvm.internal.m.a(this.f1337b, g2Var.f1337b);
    }

    public final int hashCode() {
        return this.f1337b.hashCode() + (this.f1336a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvZapCategoryUi(id=");
        sb.append(this.f1336a);
        sb.append(", name=");
        return Y6.f.m(sb, this.f1337b, ")");
    }
}
