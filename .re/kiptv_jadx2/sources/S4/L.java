package S4;

public final class L {

    public final String f9352a;

    public final boolean f9353b;

    public L(String str, boolean z6) {
        this.f9352a = str;
        this.f9353b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l2 = (L) obj;
        return kotlin.jvm.internal.m.a(this.f9352a, l2.f9352a) && this.f9353b == l2.f9353b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9353b) + (this.f9352a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassifiedTerm(text=" + this.f9352a + ", isCompleted=" + this.f9353b + ")";
    }
}
