package F5;

import D0.C0205f;
import java.util.List;

public final class c {

    public final String f3675a;

    public final C0205f f3676b;

    public final List f3677c;

    public c(String str, C0205f c0205f, List list) {
        this.f3675a = str;
        this.f3676b = c0205f;
        this.f3677c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.f3675a, cVar.f3675a) && kotlin.jvm.internal.m.a(this.f3676b, cVar.f3676b) && kotlin.jvm.internal.m.a(this.f3677c, cVar.f3677c);
    }

    public final int hashCode() {
        return this.f3677c.hashCode() + ((this.f3676b.hashCode() + (this.f3675a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TvBenefitCategory(id=" + this.f3675a + ", icon=" + this.f3676b + ", benefitIds=" + this.f3677c + ")";
    }
}
