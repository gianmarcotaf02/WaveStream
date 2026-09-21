package Y0;

public final class h {

    public static final h f11035c = new h(0.0f, new D6.d(0.0f, 0.0f));

    public final float f11036a;

    public final D6.d f11037b;

    public h(float f9, D6.d dVar) {
        this.f11036a = f9;
        this.f11037b = dVar;
        if (Float.isNaN(f9)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final D6.d a() {
        return this.f11037b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f11036a == hVar.f11036a && this.f11037b.equals(hVar.f11037b);
    }

    public final int hashCode() {
        return (this.f11037b.hashCode() + (Float.hashCode(this.f11036a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.f11036a + ", range=" + this.f11037b + ", steps=0)";
    }
}
