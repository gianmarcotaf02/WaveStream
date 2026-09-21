package P4;

import p121o0.p;

public final class a {

    public final int f8130a;

    public final int f8131b;

    public final int f8132c;

    public a(int i3, int i9, int i10) {
        this.f8130a = i3;
        this.f8131b = i9;
        this.f8132c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8130a == aVar.f8130a && this.f8131b == aVar.f8131b && this.f8132c == aVar.f8132c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8132c) + p.d(this.f8131b, Integer.hashCode(this.f8130a) * 31, 31);
    }

    public final String toString() {
        return this.f8130a + "/" + this.f8132c + "MB free=" + this.f8131b + "MB";
    }
}
