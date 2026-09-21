package t5;

public final class C2809j {

    public final float f28215a;

    public final float f28216b;

    public final float f28217c;

    public final float f28218d;

    public C2809j(float f9, float f10, float f11, float f12) {
        this.f28215a = f9;
        this.f28216b = f10;
        this.f28217c = f11;
        this.f28218d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2809j)) {
            return false;
        }
        C2809j c2809j = (C2809j) obj;
        return Float.compare(this.f28215a, c2809j.f28215a) == 0 && Float.compare(this.f28216b, c2809j.f28216b) == 0 && Float.compare(this.f28217c, c2809j.f28217c) == 0 && Float.compare(this.f28218d, c2809j.f28218d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f28218d) + p121o0.p.c(this.f28217c, p121o0.p.c(this.f28216b, Float.hashCode(this.f28215a) * 31, 31), 31);
    }

    public final String toString() {
        return "SliverSpec(base=" + this.f28215a + ", slide=" + this.f28216b + ", scaleY=" + this.f28217c + ", alpha=" + this.f28218d + ")";
    }
}
