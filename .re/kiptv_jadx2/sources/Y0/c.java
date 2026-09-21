package Y0;

public final class c {

    public final int f11028a;

    public final int f11029b;

    public c(int i3, int i9) {
        this.f11028a = i3;
        this.f11029b = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11028a == cVar.f11028a && this.f11029b == cVar.f11029b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11029b) + (Integer.hashCode(this.f11028a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.f11028a);
        sb.append(", columnCount=");
        return Y6.f.j(sb, this.f11029b, ')');
    }
}
