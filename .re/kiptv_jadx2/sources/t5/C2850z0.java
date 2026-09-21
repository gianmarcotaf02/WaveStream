package t5;

public final class C2850z0 {

    public final String f28517a;

    public final String f28518b;

    public C2850z0(String id, String title) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(title, "title");
        this.f28517a = id;
        this.f28518b = title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2850z0)) {
            return false;
        }
        C2850z0 c2850z0 = (C2850z0) obj;
        return kotlin.jvm.internal.m.a(this.f28517a, c2850z0.f28517a) && kotlin.jvm.internal.m.a(this.f28518b, c2850z0.f28518b);
    }

    public final int hashCode() {
        return this.f28518b.hashCode() + (this.f28517a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvMenuOption(id=");
        sb.append(this.f28517a);
        sb.append(", title=");
        return Y6.f.m(sb, this.f28518b, ")");
    }
}
