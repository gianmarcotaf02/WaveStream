package J5;

public final class P0 {

    public final String f6229a;

    public final String f6230b;

    public final String f6231c;

    public P0(String str, String str2, String str3) {
        this.f6229a = str;
        this.f6230b = str2;
        this.f6231c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P0)) {
            return false;
        }
        P0 p2 = (P0) obj;
        return kotlin.jvm.internal.m.a(this.f6229a, p2.f6229a) && kotlin.jvm.internal.m.a(this.f6230b, p2.f6230b) && kotlin.jvm.internal.m.a(this.f6231c, p2.f6231c);
    }

    public final int hashCode() {
        return this.f6231c.hashCode() + B2.a.a(this.f6229a.hashCode() * 31, 31, this.f6230b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvInfoLink(titleKey=");
        sb.append(this.f6229a);
        sb.append(", hintKey=");
        sb.append(this.f6230b);
        sb.append(", url=");
        return Y6.f.m(sb, this.f6231c, ")");
    }
}
