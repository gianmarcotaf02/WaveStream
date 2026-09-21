package Q0;

public final class C0778l {

    public final float f8446a;

    public final float f8447b;

    public final float f8448c;

    public final float f8449d;

    public C0778l(float f9, float f10, float f11, float f12) {
        this.f8446a = f9;
        this.f8447b = f10;
        this.f8448c = f11;
        this.f8449d = f12;
        if (f9 < 0.0f) {
            N0.a.a("Left must be non-negative");
        }
        if (f10 < 0.0f) {
            N0.a.a("Top must be non-negative");
        }
        if (f11 < 0.0f) {
            N0.a.a("Right must be non-negative");
        }
        if (f12 >= 0.0f) {
            return;
        }
        N0.a.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0778l)) {
            return false;
        }
        C0778l c0778l = (C0778l) obj;
        return p113n1.f.c(this.f8446a, c0778l.f8446a) && p113n1.f.c(this.f8447b, c0778l.f8447b) && p113n1.f.c(this.f8448c, c0778l.f8448c) && p113n1.f.c(this.f8449d, c0778l.f8449d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + p121o0.p.c(this.f8449d, p121o0.p.c(this.f8448c, p121o0.p.c(this.f8447b, Float.hashCode(this.f8446a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) p113n1.f.d(this.f8446a)) + ", top=" + ((Object) p113n1.f.d(this.f8447b)) + ", end=" + ((Object) p113n1.f.d(this.f8448c)) + ", bottom=" + ((Object) p113n1.f.d(this.f8449d)) + ", isLayoutDirectionAware=true)";
    }
}
