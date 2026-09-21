package D5;

public final class C0249e extends AbstractC0253g {

    public final C0241a f2283a;

    public C0249e(C0241a c0241a) {
        this.f2283a = c0241a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0249e) && kotlin.jvm.internal.m.a(this.f2283a, ((C0249e) obj).f2283a);
    }

    public final int hashCode() {
        return this.f2283a.hashCode();
    }

    public final String toString() {
        return "Stepper(control=" + this.f2283a + ")";
    }
}
