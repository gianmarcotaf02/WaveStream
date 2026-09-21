package N2;

import java.util.Map;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class a {

    public final String f7300a;

    public final Map f7301b;

    public a(String str, Map map) {
        this.f7300a = str;
        this.f7301b = P3.e.n0(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f7300a, aVar.f7300a) && m.a(this.f7301b, aVar.f7301b);
    }

    public final int hashCode() {
        return this.f7301b.hashCode() + (this.f7300a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(key=");
        sb.append(this.f7300a);
        sb.append(", extras=");
        return p.r(sb, this.f7301b, ')');
    }
}
