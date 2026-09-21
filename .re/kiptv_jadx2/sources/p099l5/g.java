package p099l5;

import kotlin.jvm.internal.m;

public final class g extends m {

    public final v f24782a;

    public g(v vVar) {
        this.f24782a = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && m.a(this.f24782a, ((g) obj).f24782a);
    }

    public final int hashCode() {
        return this.f24782a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f24782a + ")";
    }
}
