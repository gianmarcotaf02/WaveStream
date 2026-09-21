package D5;

public final class C0245c extends AbstractC0253g {

    public final String f2271a;

    public C0245c(String str) {
        this.f2271a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0245c) && kotlin.jvm.internal.m.a(this.f2271a, ((C0245c) obj).f2271a);
    }

    public final int hashCode() {
        return this.f2271a.hashCode();
    }

    public final String toString() {
        return Y6.f.m(new StringBuilder("Header(label="), this.f2271a, ")");
    }
}
