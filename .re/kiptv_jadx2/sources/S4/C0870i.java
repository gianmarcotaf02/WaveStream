package S4;

public final class C0870i {

    public final double f9399a;

    public final String f9400b;

    public C0870i(double d4, String text) {
        kotlin.jvm.internal.m.e(text, "text");
        this.f9399a = d4;
        this.f9400b = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0870i)) {
            return false;
        }
        C0870i c0870i = (C0870i) obj;
        return Double.compare(this.f9399a, c0870i.f9399a) == 0 && kotlin.jvm.internal.m.a(this.f9400b, c0870i.f9400b);
    }

    public final int hashCode() {
        return this.f9400b.hashCode() + (Double.hashCode(this.f9399a) * 31);
    }

    public final String toString() {
        return "ContentVariantProgress(fraction=" + this.f9399a + ", text=" + this.f9400b + ")";
    }
}
