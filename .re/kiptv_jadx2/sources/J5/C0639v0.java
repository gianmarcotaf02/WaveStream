package J5;

public final class C0639v0 {

    public final String f6586a;

    public final String f6587b;

    public C0639v0(String str) {
        this.f6586a = str;
        this.f6587b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0639v0)) {
            return false;
        }
        C0639v0 c0639v0 = (C0639v0) obj;
        return kotlin.jvm.internal.m.a(this.f6586a, c0639v0.f6586a) && kotlin.jvm.internal.m.a(this.f6587b, c0639v0.f6587b);
    }

    public final int hashCode() {
        int iHashCode = this.f6586a.hashCode() * 31;
        String str = this.f6587b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvCredit(name=");
        sb.append(this.f6586a);
        sb.append(", license=");
        return Y6.f.m(sb, this.f6587b, ")");
    }

    public C0639v0(String str, String str2) {
        this.f6586a = str;
        this.f6587b = str2;
    }
}
