package J5;

public final class C0609m {

    public final float f6499a;

    public final float f6500b;

    public C0609m(float f9, float f10) {
        this.f6499a = f9;
        this.f6500b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0609m)) {
            return false;
        }
        C0609m c0609m = (C0609m) obj;
        return Float.compare(this.f6499a, c0609m.f6499a) == 0 && Float.compare(this.f6500b, c0609m.f6500b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6500b) + (Float.hashCode(this.f6499a) * 31);
    }

    public final String toString() {
        return "PreviewOverflow(top=" + this.f6499a + ", bottom=" + this.f6500b + ")";
    }
}
