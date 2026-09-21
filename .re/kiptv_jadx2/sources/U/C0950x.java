package U;

public final class C0950x {

    public final p104m1.j f10092a;

    public final int f10093b;

    public final long f10094c;

    public C0950x(p104m1.j jVar, int i3, long j) {
        this.f10092a = jVar;
        this.f10093b = i3;
        this.f10094c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0950x)) {
            return false;
        }
        C0950x c0950x = (C0950x) obj;
        return this.f10092a == c0950x.f10092a && this.f10093b == c0950x.f10093b && this.f10094c == c0950x.f10094c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10094c) + p121o0.p.d(this.f10093b, this.f10092a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f10092a + ", offset=" + this.f10093b + ", selectableId=" + this.f10094c + ')';
    }
}
