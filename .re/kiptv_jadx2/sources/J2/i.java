package J2;

import H2.q;
import kotlin.jvm.internal.m;

public final class i implements e {

    public final q f6009a;

    public final String f6010b;

    public final H2.h f6011c;

    public i(q qVar, String str, H2.h hVar) {
        this.f6009a = qVar;
        this.f6010b = str;
        this.f6011c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return m.a(this.f6009a, iVar.f6009a) && m.a(this.f6010b, iVar.f6010b) && this.f6011c == iVar.f6011c;
    }

    public final int hashCode() {
        int iHashCode = this.f6009a.hashCode() * 31;
        String str = this.f6010b;
        return this.f6011c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.f6009a + ", mimeType=" + this.f6010b + ", dataSource=" + this.f6011c + ')';
    }
}
