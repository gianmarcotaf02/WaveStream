package p011b1;

import Y6.f;
import kotlin.jvm.internal.m;

public final class C1655l extends AbstractC1656m {

    public final String f17822a;

    public final K f17823b;

    public C1655l(String str, K k9) {
        this.f17822a = str;
        this.f17823b = k9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1655l)) {
            return false;
        }
        C1655l c1655l = (C1655l) obj;
        if (!m.a(this.f17822a, c1655l.f17822a)) {
            return false;
        }
        if (!m.a(this.f17823b, c1655l.f17823b)) {
            return false;
        }
        c1655l.getClass();
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f17822a.hashCode() * 31;
        K k9 = this.f17823b;
        return (iHashCode + (k9 != null ? k9.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return f.l(new StringBuilder("LinkAnnotation.Url(url="), this.f17822a, ')');
    }
}
