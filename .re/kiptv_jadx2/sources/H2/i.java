package H2;

import v5.L;

public final class i {

    public final E2.l f3890a;

    public final boolean f3891b;

    public i(E2.l lVar, boolean z6) {
        this.f3890a = lVar;
        this.f3891b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.f3890a, iVar.f3890a) && this.f3891b == iVar.f3891b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3891b) + (this.f3890a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecodeResult(image=");
        sb.append(this.f3890a);
        sb.append(", isSampled=");
        return L.a(sb, this.f3891b, ')');
    }
}
