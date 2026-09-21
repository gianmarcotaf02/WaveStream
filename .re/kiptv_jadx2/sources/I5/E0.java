package I5;

import java.util.ArrayList;
import java.util.List;

public final class E0 {

    public final String f4721a;

    public final String f4722b;

    public final ArrayList f4723c;

    public E0(String tagKey, String title, ArrayList arrayList) {
        kotlin.jvm.internal.m.e(tagKey, "tagKey");
        kotlin.jvm.internal.m.e(title, "title");
        this.f4721a = tagKey;
        this.f4722b = title;
        this.f4723c = arrayList;
    }

    public final List a() {
        return this.f4723c;
    }

    public final String b() {
        return this.f4722b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e6 = (E0) obj;
        return kotlin.jvm.internal.m.a(this.f4721a, e6.f4721a) && kotlin.jvm.internal.m.a(this.f4722b, e6.f4722b) && this.f4723c.equals(e6.f4723c);
    }

    public final int hashCode() {
        return this.f4723c.hashCode() + B2.a.a(this.f4721a.hashCode() * 31, 31, this.f4722b);
    }

    public final String toString() {
        return "TvSeriesMyListSection(tagKey=" + this.f4721a + ", title=" + this.f4722b + ", items=" + this.f4723c + ")";
    }
}
