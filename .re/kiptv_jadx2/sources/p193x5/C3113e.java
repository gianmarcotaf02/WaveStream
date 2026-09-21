package p193x5;

import B2.a;
import java.util.List;
import kotlin.jvm.internal.m;

public final class C3113e {

    public final String f31447a;

    public final String f31448b;

    public final List f31449c;

    public C3113e(String id, String title, List groups) {
        m.e(id, "id");
        m.e(title, "title");
        m.e(groups, "groups");
        this.f31447a = id;
        this.f31448b = title;
        this.f31449c = groups;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3113e)) {
            return false;
        }
        C3113e c3113e = (C3113e) obj;
        return m.a(this.f31447a, c3113e.f31447a) && m.a(this.f31448b, c3113e.f31448b) && m.a(this.f31449c, c3113e.f31449c);
    }

    public final int hashCode() {
        return this.f31449c.hashCode() + a.a(this.f31447a.hashCode() * 31, 31, this.f31448b);
    }

    public final String toString() {
        return "LiveCarouselRow(id=" + this.f31447a + ", title=" + this.f31448b + ", groups=" + this.f31449c + ")";
    }
}
