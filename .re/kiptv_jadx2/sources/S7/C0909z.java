package S7;

public final class C0909z extends p100l6.a {

    public static final C0889g0 f9627i = new C0889g0();

    public final String f9628h;

    public C0909z(String str) {
        super(f9627i);
        this.f9628h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0909z) && kotlin.jvm.internal.m.a(this.f9628h, ((C0909z) obj).f9628h);
    }

    public final int hashCode() {
        return this.f9628h.hashCode();
    }

    public final String toString() {
        return Y6.f.l(new StringBuilder("CoroutineName("), this.f9628h, ')');
    }
}
