package t5;

public final class D0 {

    public final int f27844a;

    public final String f27845b;

    public D0(int i3, String label) {
        kotlin.jvm.internal.m.e(label, "label");
        this.f27844a = i3;
        this.f27845b = label;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d4 = (D0) obj;
        return this.f27844a == d4.f27844a && kotlin.jvm.internal.m.a(this.f27845b, d4.f27845b);
    }

    public final int hashCode() {
        return this.f27845b.hashCode() + (Integer.hashCode(this.f27844a) * 31);
    }

    public final String toString() {
        return "TvMetadataCandidate(tmdbId=" + this.f27844a + ", label=" + this.f27845b + ")";
    }
}
