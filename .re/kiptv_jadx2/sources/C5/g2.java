package C5;

public final class g2 {

    public final String f1336a;

    public final String f1337b;

    public g2(String id, String name) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(name, "name");
        this.f1336a = id;
        this.f1337b = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return kotlin.jvm.internal.m.a(this.f1336a, g2Var.f1336a) && kotlin.jvm.internal.m.a(this.f1337b, g2Var.f1337b);
    }

    public final int hashCode() {
        return this.f1337b.hashCode() + (this.f1336a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvZapCategoryUi(id=");
        sb.append(this.f1336a);
        sb.append(", name=");
        return Y6.f.m(sb, this.f1337b, ")");
    }
}
