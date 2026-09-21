package p099l5;

import kotlin.jvm.internal.m;

public final class p extends v {

    public final String f24790i;
    public final Integer j;

    public p(String str, Integer num) {
        super(str);
        this.f24790i = str;
        this.j = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return m.a(this.f24790i, pVar.f24790i) && m.a(this.j, pVar.j);
    }

    public final int hashCode() {
        int iHashCode = this.f24790i.hashCode() * 31;
        Integer num = this.j;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override
    public final String toString() {
        return "NetworkError(msg=" + this.f24790i + ", statusCode=" + this.j + ")";
    }
}
