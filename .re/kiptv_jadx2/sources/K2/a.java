package K2;

import E2.l;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class a {

    public final l f6767a;

    public final boolean f6768b;

    public final H2.h f6769c;

    public final String f6770d;

    public a(l lVar, boolean z6, H2.h hVar, String str) {
        this.f6767a = lVar;
        this.f6768b = z6;
        this.f6769c = hVar;
        this.f6770d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f6767a, aVar.f6767a) && this.f6768b == aVar.f6768b && this.f6769c == aVar.f6769c && m.a(this.f6770d, aVar.f6770d);
    }

    public final int hashCode() {
        int iHashCode = (this.f6769c.hashCode() + p.f(this.f6767a.hashCode() * 31, 31, this.f6768b)) * 31;
        String str = this.f6770d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExecuteResult(image=");
        sb.append(this.f6767a);
        sb.append(", isSampled=");
        sb.append(this.f6768b);
        sb.append(", dataSource=");
        sb.append(this.f6769c);
        sb.append(", diskCacheKey=");
        return Y6.f.l(sb, this.f6770d, ')');
    }
}
