package R4;

import kotlin.jvm.internal.m;
import p121o0.p;

public final class e {

    public final String f9062a;

    public final String f9063b;

    public final String f9064c;

    public final long f9065d;

    public final Long f9066e;

    public final f f9067f;
    public final String g;

    public final String f9068h;

    public e(String id, String str, String str2, long j, Long l2, f status, String str3, String str4) {
        m.e(id, "id");
        m.e(status, "status");
        this.f9062a = id;
        this.f9063b = str;
        this.f9064c = str2;
        this.f9065d = j;
        this.f9066e = l2;
        this.f9067f = status;
        this.g = str3;
        this.f9068h = str4;
    }

    public static e a(e eVar, Long l2, f fVar, String str, String str2, int i3) {
        String str3 = eVar.f9063b;
        String str4 = eVar.f9064c;
        if ((i3 & 64) != 0) {
            str = eVar.g;
        }
        String str5 = str;
        if ((i3 & 128) != 0) {
            str2 = eVar.f9068h;
        }
        String id = eVar.f9062a;
        m.e(id, "id");
        return new e(id, str3, str4, eVar.f9065d, l2, fVar, str5, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m.a(this.f9062a, eVar.f9062a) && m.a(this.f9063b, eVar.f9063b) && m.a(this.f9064c, eVar.f9064c) && this.f9065d == eVar.f9065d && m.a(this.f9066e, eVar.f9066e) && this.f9067f == eVar.f9067f && m.a(this.g, eVar.g) && m.a(this.f9068h, eVar.f9068h);
    }

    public final int hashCode() {
        int iE = p.e(B2.a.a(B2.a.a(this.f9062a.hashCode() * 31, 31, this.f9063b), 31, this.f9064c), 31, this.f9065d);
        Long l2 = this.f9066e;
        int iHashCode = (this.f9067f.hashCode() + ((iE + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31;
        String str = this.g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9068h;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadingOperation(id=");
        sb.append(this.f9062a);
        sb.append(", name=");
        sb.append(this.f9063b);
        sb.append(", icon=");
        sb.append(this.f9064c);
        sb.append(", startTime=");
        sb.append(this.f9065d);
        sb.append(", endTime=");
        sb.append(this.f9066e);
        sb.append(", status=");
        sb.append(this.f9067f);
        sb.append(", detail=");
        sb.append(this.g);
        sb.append(", errorMessage=");
        return Y6.f.m(sb, this.f9068h, ")");
    }
}
