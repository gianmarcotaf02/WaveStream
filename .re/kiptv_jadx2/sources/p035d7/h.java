package p035d7;

import kotlin.jvm.internal.m;
import v5.L;

public final class h {

    public final g f21265a;

    public final boolean f21266b;

    public h(g gVar) {
        this.f21265a = gVar;
        this.f21266b = false;
    }

    public static h a(h hVar, g qualifier, boolean z6, int i3) {
        if ((i3 & 1) != 0) {
            qualifier = hVar.f21265a;
        }
        if ((i3 & 2) != 0) {
            z6 = hVar.f21266b;
        }
        hVar.getClass();
        m.e(qualifier, "qualifier");
        return new h(qualifier, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f21265a == hVar.f21265a && this.f21266b == hVar.f21266b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21266b) + (this.f21265a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.f21265a);
        sb.append(", isForWarningOnly=");
        return L.a(sb, this.f21266b, ')');
    }

    public h(g gVar, boolean z6) {
        this.f21265a = gVar;
        this.f21266b = z6;
    }
}
