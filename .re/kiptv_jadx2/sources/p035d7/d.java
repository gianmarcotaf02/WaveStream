package p035d7;

import p121o0.p;
import v5.L;

public final class d {

    public static final d f21254e = new d(null, false);

    public final g f21255a;

    public final e f21256b;

    public final boolean f21257c;

    public final boolean f21258d;

    public d(g gVar, e eVar, boolean z6, boolean z9) {
        this.f21255a = gVar;
        this.f21256b = eVar;
        this.f21257c = z6;
        this.f21258d = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f21255a == dVar.f21255a && this.f21256b == dVar.f21256b && this.f21257c == dVar.f21257c && this.f21258d == dVar.f21258d;
    }

    public final int hashCode() {
        g gVar = this.f21255a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        e eVar = this.f21256b;
        return Boolean.hashCode(this.f21258d) + p.f((iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 31, 31, this.f21257c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.f21255a);
        sb.append(", mutability=");
        sb.append(this.f21256b);
        sb.append(", definitelyNotNull=");
        sb.append(this.f21257c);
        sb.append(", isNullabilityQualifierForWarning=");
        return L.a(sb, this.f21258d, ')');
    }

    public d(g gVar, boolean z6) {
        this(gVar, null, z6, false);
    }
}
