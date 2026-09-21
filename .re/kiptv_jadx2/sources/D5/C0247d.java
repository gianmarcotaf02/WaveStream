package D5;

public final class C0247d extends AbstractC0253g {

    public final C0254h f2276a;

    public C0247d(C0254h c0254h) {
        this.f2276a = c0254h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0247d) && kotlin.jvm.internal.m.a(this.f2276a, ((C0247d) obj).f2276a);
    }

    public final int hashCode() {
        return this.f2276a.hashCode();
    }

    public final String toString() {
        return "Option(option=" + this.f2276a + ")";
    }
}
