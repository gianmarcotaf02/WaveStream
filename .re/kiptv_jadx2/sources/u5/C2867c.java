package u5;

public final class C2867c {

    public final String f28711a;

    public final String f28712b;

    public C2867c(String id, String name) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(name, "name");
        this.f28711a = id;
        this.f28712b = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2867c)) {
            return false;
        }
        C2867c c2867c = (C2867c) obj;
        return kotlin.jvm.internal.m.a(this.f28711a, c2867c.f28711a) && kotlin.jvm.internal.m.a(this.f28712b, c2867c.f28712b);
    }

    public final int hashCode() {
        return this.f28712b.hashCode() + (this.f28711a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvCmNamedId(id=");
        sb.append(this.f28711a);
        sb.append(", name=");
        return Y6.f.m(sb, this.f28712b, ")");
    }
}
