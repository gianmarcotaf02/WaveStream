package C5;

public final class C0101d {

    public final String f1297a;

    public final String f1298b;

    public C0101d(String str, String str2) {
        this.f1297a = str;
        this.f1298b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0101d)) {
            return false;
        }
        C0101d c0101d = (C0101d) obj;
        return kotlin.jvm.internal.m.a(this.f1297a, c0101d.f1297a) && kotlin.jvm.internal.m.a(this.f1298b, c0101d.f1298b);
    }

    public final int hashCode() {
        return this.f1298b.hashCode() + (this.f1297a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvExternalPlayer(packageName=");
        sb.append(this.f1297a);
        sb.append(", displayName=");
        return Y6.f.m(sb, this.f1298b, ")");
    }
}
