package p011b1;

import Y6.f;
import kotlin.jvm.internal.m;

public final class C1654k extends AbstractC1656m {

    public final String f17820a;

    public final K f17821b;

    public C1654k(String str, K k9) {
        this.f17820a = str;
        this.f17821b = k9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1654k)) {
            return false;
        }
        C1654k c1654k = (C1654k) obj;
        if (!m.a(this.f17820a, c1654k.f17820a)) {
            return false;
        }
        if (!m.a(this.f17821b, c1654k.f17821b)) {
            return false;
        }
        c1654k.getClass();
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f17820a.hashCode() * 31;
        K k9 = this.f17821b;
        return (iHashCode + (k9 != null ? k9.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return f.l(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f17820a, ')');
    }
}
