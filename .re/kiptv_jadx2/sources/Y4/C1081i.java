package Y4;

public final class C1081i {

    public final com.kiptv.core.model.M f11930a;

    public final EnumC1087k f11931b;

    public final String f11932c;

    public C1081i(com.kiptv.core.model.M m8, EnumC1087k enumC1087k, String reason) {
        kotlin.jvm.internal.m.e(reason, "reason");
        this.f11930a = m8;
        this.f11931b = enumC1087k;
        this.f11932c = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1081i)) {
            return false;
        }
        C1081i c1081i = (C1081i) obj;
        return kotlin.jvm.internal.m.a(this.f11930a, c1081i.f11930a) && this.f11931b == c1081i.f11931b && kotlin.jvm.internal.m.a(this.f11932c, c1081i.f11932c);
    }

    public final int hashCode() {
        return this.f11932c.hashCode() + ((this.f11931b.hashCode() + (this.f11930a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedEntry(entry=");
        sb.append(this.f11930a);
        sb.append(", type=");
        sb.append(this.f11931b);
        sb.append(", reason=");
        return Y6.f.m(sb, this.f11932c, ")");
    }
}
