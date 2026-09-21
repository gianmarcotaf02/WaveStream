package p113n1;

public final class f implements Comparable {

    public final float f25552h;

    public f(float f9) {
        this.f25552h = f9;
    }

    public static final f a(float f9) {
        return new f(f9);
    }

    public static int b(float f9, float f10) {
        if (Float.isNaN(f9) || Float.isNaN(f10)) {
            return 0;
        }
        return Float.compare(f9, f10);
    }

    public static final boolean c(float f9, float f10) {
        return Float.compare(f9, f10) == 0;
    }

    public static String d(float f9) {
        if (Float.isNaN(f9)) {
            return "Dp.Unspecified";
        }
        return f9 + ".dp";
    }

    @Override
    public final int compareTo(Object obj) {
        return b(this.f25552h, ((f) obj).f25552h);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f25552h, ((f) obj).f25552h) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25552h);
    }

    public final String toString() {
        return d(this.f25552h);
    }
}
