package N2;

import E2.l;
import java.util.Map;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class b {

    public final l f7302a;

    public final Map f7303b;

    public b(l lVar, Map map) {
        this.f7302a = lVar;
        this.f7303b = P3.e.n0(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f7302a, bVar.f7302a) && m.a(this.f7303b, bVar.f7303b);
    }

    public final int hashCode() {
        return this.f7303b.hashCode() + (this.f7302a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Value(image=");
        sb.append(this.f7302a);
        sb.append(", extras=");
        return p.r(sb, this.f7303b, ')');
    }
}
