package C5;

import java.util.List;

public final class d2 {

    public final String f1303a;

    public final List f1304b;

    public d2(String str, List programs) {
        kotlin.jvm.internal.m.e(programs, "programs");
        this.f1303a = str;
        this.f1304b = programs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return kotlin.jvm.internal.m.a(this.f1303a, d2Var.f1303a) && kotlin.jvm.internal.m.a(this.f1304b, d2Var.f1304b);
    }

    public final int hashCode() {
        return this.f1304b.hashCode() + (this.f1303a.hashCode() * 31);
    }

    public final String toString() {
        return "TvReplayDayUi(label=" + this.f1303a + ", programs=" + this.f1304b + ")";
    }
}
