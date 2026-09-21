package Y4;

import java.util.ArrayList;

public final class C1093m {

    public final String f11986a;

    public String f11987b;

    public String f11988c;

    public final ArrayList f11989d;

    public C1093m(String str, String str2, String str3, ArrayList arrayList) {
        this.f11986a = str;
        this.f11987b = str2;
        this.f11988c = str3;
        this.f11989d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1093m)) {
            return false;
        }
        C1093m c1093m = (C1093m) obj;
        return this.f11986a.equals(c1093m.f11986a) && kotlin.jvm.internal.m.a(this.f11987b, c1093m.f11987b) && kotlin.jvm.internal.m.a(this.f11988c, c1093m.f11988c) && this.f11989d.equals(c1093m.f11989d);
    }

    public final int hashCode() {
        int iHashCode = this.f11986a.hashCode() * 31;
        String str = this.f11987b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11988c;
        return this.f11989d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f11987b;
        String str2 = this.f11988c;
        StringBuilder sb = new StringBuilder("SeriesGroup(baseName=");
        B2.a.x(sb, this.f11986a, ", logo=", str, ", groupTitle=");
        sb.append(str2);
        sb.append(", episodes=");
        sb.append(this.f11989d);
        sb.append(")");
        return sb.toString();
    }
}
