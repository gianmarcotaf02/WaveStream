package p142q7;

import kotlin.jvm.internal.m;
import p101l7.b;

public final class f {

    public final b f26654a;

    public final int f26655b;

    public f(b bVar, int i3) {
        this.f26654a = bVar;
        this.f26655b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return m.a(this.f26654a, fVar.f26654a) && this.f26655b == fVar.f26655b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26655b) + (this.f26654a.hashCode() * 31);
    }

    public final String toString() {
        int i3;
        StringBuilder sb = new StringBuilder();
        int i9 = 0;
        while (true) {
            i3 = this.f26655b;
            if (i9 >= i3) {
                break;
            }
            sb.append("kotlin/Array<");
            i9++;
        }
        sb.append(this.f26654a);
        for (int i10 = 0; i10 < i3; i10++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
