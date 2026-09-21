package kotlin.jvm.internal;

public final class t implements InterfaceC2539d {

    public final Class f24552h;

    public t(Class jClass) {
        m.e(jClass, "jClass");
        this.f24552h = jClass;
    }

    @Override
    public final Class b() {
        return this.f24552h;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return m.a(this.f24552h, ((t) obj).f24552h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24552h.hashCode();
    }

    public final String toString() {
        return this.f24552h + " (Kotlin reflection is not available)";
    }
}
