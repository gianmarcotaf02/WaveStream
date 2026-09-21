package C5;

public final class C0093a0 extends AbstractC0108f0 {

    public final int f1204a;

    public final long f1205b;

    public final long f1206c;

    public C0093a0(int i3, long j, long j9) {
        this.f1204a = i3;
        this.f1205b = j;
        this.f1206c = j9;
    }

    @Override
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0093a0)) {
            return false;
        }
        C0093a0 c0093a0 = (C0093a0) obj;
        return this.f1204a == c0093a0.f1204a && this.f1205b == c0093a0.f1205b && this.f1206c == c0093a0.f1206c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1206c) + p121o0.p.e(Integer.hashCode(this.f1204a) * 31, 31, this.f1205b);
    }

    public final String toString() {
        return "Catchup(streamId=" + this.f1204a + ", startMillis=" + this.f1205b + ", endMillis=" + this.f1206c + ")";
    }
}
