package p043e5;

import B2.a;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m;

public final class f {

    public final String f21433a;

    public final List f21434b;

    public final Set f21435c;

    public f(List list) {
        Set platforms = g.f21436a;
        m.e(platforms, "platforms");
        this.f21433a = "whatsNew.v3_0.headline.title";
        this.f21434b = list;
        this.f21435c = platforms;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return m.a(this.f21433a, fVar.f21433a) && m.a(this.f21434b, fVar.f21434b) && m.a(this.f21435c, fVar.f21435c);
    }

    public final int hashCode() {
        return this.f21435c.hashCode() + a.b(this.f21433a.hashCode() * 31, 31, this.f21434b);
    }

    public final String toString() {
        return "WhatsNewHeadline(titleKey=" + this.f21433a + ", subtitleKeys=" + this.f21434b + ", platforms=" + this.f21435c + ")";
    }
}
