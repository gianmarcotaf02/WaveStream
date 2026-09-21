package p129p0;

import kotlin.jvm.internal.m;

public final class i {

    public final int f26178a;

    public final Integer f26179b;

    public i(int i3, Integer num) {
        this.f26178a = i3;
        this.f26179b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f26178a == iVar.f26178a && m.a(this.f26179b, iVar.f26179b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f26178a) * 31;
        Integer num = this.f26179b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f26178a + ", dataOffset=" + this.f26179b + ')';
    }
}
