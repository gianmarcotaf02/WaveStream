package W6;

import java.util.Collection;
import v5.L;

public final class m {

    public final p035d7.h f10660a;

    public final Collection f10661b;

    public final boolean f10662c;

    public m(p035d7.h hVar, Collection qualifierApplicabilityTypes, boolean z6) {
        kotlin.jvm.internal.m.e(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f10660a = hVar;
        this.f10661b = qualifierApplicabilityTypes;
        this.f10662c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.f10660a, mVar.f10660a) && kotlin.jvm.internal.m.a(this.f10661b, mVar.f10661b) && this.f10662c == mVar.f10662c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10662c) + ((this.f10661b.hashCode() + (this.f10660a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.f10660a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.f10661b);
        sb.append(", definitelyNotNull=");
        return L.a(sb, this.f10662c, ')');
    }

    public m(p035d7.h hVar, Collection collection) {
        this(hVar, collection, hVar.f21265a == p035d7.g.j);
    }
}
