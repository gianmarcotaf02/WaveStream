package p070h6;

import kotlin.jvm.internal.m;

public final class g implements Comparable {

    public static final g f22532l = new g(2, 1, 20);

    public final int f22533h;

    public final int f22534i;
    public final int j;

    public final int f22535k;

    public g(int i3, int i9, int i10) {
        this.f22533h = i3;
        this.f22534i = i9;
        this.j = i10;
        if (i3 >= 0 && i3 < 256 && i9 >= 0 && i9 < 256 && i10 >= 0 && i10 < 256) {
            this.f22535k = (i3 << 16) + (i9 << 8) + i10;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i3 + '.' + i9 + '.' + i10).toString());
    }

    @Override
    public final int compareTo(Object obj) {
        g other = (g) obj;
        m.e(other, "other");
        return this.f22535k - other.f22535k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        g gVar = obj instanceof g ? (g) obj : null;
        return gVar != null && this.f22535k == gVar.f22535k;
    }

    public final int hashCode() {
        return this.f22535k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22533h);
        sb.append('.');
        sb.append(this.f22534i);
        sb.append('.');
        sb.append(this.j);
        return sb.toString();
    }
}
