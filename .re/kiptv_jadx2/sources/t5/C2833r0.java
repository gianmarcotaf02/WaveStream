package t5;

public final class C2833r0 {

    public final String f28334a;

    public final String f28335b;

    public final String f28336c;

    public C2833r0(String id, String str, String title) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(title, "title");
        this.f28334a = id;
        this.f28335b = str;
        this.f28336c = title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2833r0)) {
            return false;
        }
        C2833r0 c2833r0 = (C2833r0) obj;
        return kotlin.jvm.internal.m.a(this.f28334a, c2833r0.f28334a) && kotlin.jvm.internal.m.a(this.f28335b, c2833r0.f28335b) && kotlin.jvm.internal.m.a(this.f28336c, c2833r0.f28336c);
    }

    public final int hashCode() {
        return this.f28336c.hashCode() + B2.a.a(this.f28334a.hashCode() * 31, 31, this.f28335b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvHeroUpcoming(id=");
        sb.append(this.f28334a);
        sb.append(", startTimeText=");
        sb.append(this.f28335b);
        sb.append(", title=");
        return Y6.f.m(sb, this.f28336c, ")");
    }
}
