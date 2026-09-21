package t5;

public final class C2800g {

    public final int f28181a;

    public final EnumC2803h f28182b;

    public final int f28183c;

    public C2800g(int i3, EnumC2803h enumC2803h, int i9) {
        this.f28181a = i3;
        this.f28182b = enumC2803h;
        this.f28183c = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2800g)) {
            return false;
        }
        C2800g c2800g = (C2800g) obj;
        return this.f28181a == c2800g.f28181a && this.f28182b == c2800g.f28182b && this.f28183c == c2800g.f28183c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28183c) + ((this.f28182b.hashCode() + (Integer.hashCode(this.f28181a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RowConfig(startIndex=");
        sb.append(this.f28181a);
        sb.append(", direction=");
        sb.append(this.f28182b);
        sb.append(", durationMs=");
        return Y6.f.k(sb, this.f28183c, ")");
    }
}
