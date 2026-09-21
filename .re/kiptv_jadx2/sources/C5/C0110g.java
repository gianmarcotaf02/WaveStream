package C5;

public final class C0110g {

    public final AbstractC0108f0 f1332a;

    public C0110g(AbstractC0108f0 args) {
        kotlin.jvm.internal.m.e(args, "args");
        this.f1332a = args;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0110g) && kotlin.jvm.internal.m.a(this.f1332a, ((C0110g) obj).f1332a);
    }

    public final int hashCode() {
        return this.f1332a.hashCode();
    }

    public final String toString() {
        return "OpenFullscreen(args=" + this.f1332a + ")";
    }
}
