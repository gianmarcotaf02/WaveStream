package T;

import kotlin.jvm.internal.m;
import p121o0.p;
import v5.L;

public final class f {

    public final String f9660a;

    public String f9661b;

    public boolean f9662c = false;

    public d f9663d = null;

    public f(String str, String str2) {
        this.f9660a = str;
        this.f9661b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return m.a(this.f9660a, fVar.f9660a) && m.a(this.f9661b, fVar.f9661b) && this.f9662c == fVar.f9662c && m.a(this.f9663d, fVar.f9663d);
    }

    public final int hashCode() {
        int iF = p.f(B2.a.a(this.f9660a.hashCode() * 31, 31, this.f9661b), 31, this.f9662c);
        d dVar = this.f9663d;
        return iF + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.f9663d);
        sb.append(", isShowingSubstitution=");
        return L.a(sb, this.f9662c, ')');
    }
}
