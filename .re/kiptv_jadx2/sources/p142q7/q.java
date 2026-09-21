package p142q7;

import kotlin.jvm.internal.m;

public final class q extends r {

    public final f f26666a;

    public q(f fVar) {
        this.f26666a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && m.a(this.f26666a, ((q) obj).f26666a);
    }

    public final int hashCode() {
        return this.f26666a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.f26666a + ')';
    }
}
