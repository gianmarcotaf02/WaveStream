package C5;

public final class C0102d0 extends AbstractC0108f0 {

    public final int f1299a;

    public final boolean f1300b;

    public C0102d0(int i3, boolean z6) {
        this.f1299a = i3;
        this.f1300b = z6;
    }

    @Override
    public final boolean a() {
        return this.f1300b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0102d0)) {
            return false;
        }
        C0102d0 c0102d0 = (C0102d0) obj;
        return this.f1299a == c0102d0.f1299a && this.f1300b == c0102d0.f1300b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1300b) + (Integer.hashCode(this.f1299a) * 31);
    }

    public final String toString() {
        return "Movie(streamId=" + this.f1299a + ", forceRestart=" + this.f1300b + ")";
    }
}
