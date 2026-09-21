package p011b1;

import Y6.f;
import kotlin.jvm.internal.m;

public final class G implements InterfaceC1645b {

    public final String f17761a;

    public final boolean equals(Object obj) {
        if (obj instanceof G) {
            return m.a(this.f17761a, ((G) obj).f17761a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17761a.hashCode();
    }

    public final String toString() {
        return f.l(new StringBuilder("StringAnnotation(value="), this.f17761a, ')');
    }
}
