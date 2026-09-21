package p043e5;

import B2.a;
import java.util.List;
import kotlin.jvm.internal.m;

public final class e {

    public final String f21430a;

    public final List f21431b;

    public final f f21432c;

    public e(String version, List list, f fVar) {
        m.e(version, "version");
        this.f21430a = version;
        this.f21431b = list;
        this.f21432c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m.a(this.f21430a, eVar.f21430a) && m.a(this.f21431b, eVar.f21431b) && m.a(this.f21432c, eVar.f21432c);
    }

    public final int hashCode() {
        int iB = a.b(this.f21430a.hashCode() * 31, 31, this.f21431b);
        f fVar = this.f21432c;
        return iB + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        return "WhatsNewEntry(version=" + this.f21430a + ", bullets=" + this.f21431b + ", headline=" + this.f21432c + ")";
    }
}
