package p078i6;

import B2.a;
import kotlin.jvm.internal.m;

public final class z {

    public final int f23208a;

    public final Object f23209b;

    public z(int i3, Object obj) {
        this.f23208a = i3;
        this.f23209b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f23208a == zVar.f23208a && m.a(this.f23209b, zVar.f23209b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f23208a) * 31;
        Object obj = this.f23209b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexedValue(index=");
        sb.append(this.f23208a);
        sb.append(", value=");
        return a.n(sb, this.f23209b, ')');
    }
}
