package p011b1;

import Y6.f;
import kotlin.jvm.internal.m;

public final class N implements InterfaceC1645b {

    public final String f17789a;

    public N(String str) {
        this.f17789a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof N) {
            return m.a(this.f17789a, ((N) obj).f17789a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17789a.hashCode();
    }

    public final String toString() {
        return f.l(new StringBuilder("UrlAnnotation(url="), this.f17789a, ')');
    }
}
