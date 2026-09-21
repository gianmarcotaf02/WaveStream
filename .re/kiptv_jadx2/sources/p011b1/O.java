package p011b1;

import Y6.f;
import kotlin.jvm.internal.m;

public final class O implements InterfaceC1645b {

    public final String f17790a;

    public O(String str) {
        this.f17790a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O) {
            return m.a(this.f17790a, ((O) obj).f17790a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17790a.hashCode();
    }

    public final String toString() {
        return f.l(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f17790a, ')');
    }
}
