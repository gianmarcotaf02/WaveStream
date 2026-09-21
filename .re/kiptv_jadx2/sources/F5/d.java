package F5;

public final class d {

    public final String f3678a;

    public final int f3679b;

    public d(String str, int i3) {
        this.f3678a = str;
        this.f3679b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3678a.equals(dVar.f3678a) && this.f3679b == dVar.f3679b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3679b) + (this.f3678a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvPremiumDevice(label=");
        sb.append(this.f3678a);
        sb.append(", iconRes=");
        return Y6.f.k(sb, this.f3679b, ")");
    }
}
