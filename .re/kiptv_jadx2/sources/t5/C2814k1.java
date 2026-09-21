package t5;

public final class C2814k1 {

    public final String f28249a;

    public final String f28250b;

    public final Integer f28251c;

    public C2814k1(String id, String title, Integer num) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(title, "title");
        this.f28249a = id;
        this.f28250b = title;
        this.f28251c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2814k1)) {
            return false;
        }
        C2814k1 c2814k1 = (C2814k1) obj;
        return kotlin.jvm.internal.m.a(this.f28249a, c2814k1.f28249a) && kotlin.jvm.internal.m.a(this.f28250b, c2814k1.f28250b) && kotlin.jvm.internal.m.a(this.f28251c, c2814k1.f28251c);
    }

    public final int hashCode() {
        int iA = B2.a.a(this.f28249a.hashCode() * 31, 31, this.f28250b);
        Integer num = this.f28251c;
        return iA + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "TvSidebarEntry(id=" + this.f28249a + ", title=" + this.f28250b + ", count=" + this.f28251c + ")";
    }
}
