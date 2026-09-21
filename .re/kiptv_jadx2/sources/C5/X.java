package C5;

public final class X {

    public final int f1164a;

    public final String f1165b;

    public final String f1166c;

    public final String f1167d;

    public X(int i3, String name, String str, String str2) {
        kotlin.jvm.internal.m.e(name, "name");
        this.f1164a = i3;
        this.f1165b = name;
        this.f1166c = str;
        this.f1167d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x9 = (X) obj;
        return this.f1164a == x9.f1164a && kotlin.jvm.internal.m.a(this.f1165b, x9.f1165b) && kotlin.jvm.internal.m.a(this.f1166c, x9.f1166c) && kotlin.jvm.internal.m.a(this.f1167d, x9.f1167d);
    }

    public final int hashCode() {
        int iA = B2.a.a(Integer.hashCode(this.f1164a) * 31, 31, this.f1165b);
        String str = this.f1166c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1167d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvPanelCastUi(personId=");
        sb.append(this.f1164a);
        sb.append(", name=");
        sb.append(this.f1165b);
        sb.append(", character=");
        sb.append(this.f1166c);
        sb.append(", imageUrl=");
        return Y6.f.m(sb, this.f1167d, ")");
    }
}
