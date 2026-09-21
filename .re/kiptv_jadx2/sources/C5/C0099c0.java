package C5;

public final class C0099c0 extends AbstractC0108f0 {

    public final int f1227a;

    public C0099c0(int i3) {
        this.f1227a = i3;
    }

    @Override
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0099c0) && this.f1227a == ((C0099c0) obj).f1227a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1227a);
    }

    public final String toString() {
        return Y6.f.k(new StringBuilder("Live(streamId="), this.f1227a, ")");
    }
}
