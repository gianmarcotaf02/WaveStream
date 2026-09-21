package X4;

import Y6.f;

public final class d {

    public final String f10866a;

    public final int f10867b;

    public d(String str, int i3) {
        this.f10866a = str;
        this.f10867b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f10866a.equals(dVar.f10866a) && this.f10867b == dVar.f10867b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10867b) + (this.f10866a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RatingStep(certification=");
        sb.append(this.f10866a);
        sb.append(", minimumAge=");
        return f.k(sb, this.f10867b, ")");
    }
}
