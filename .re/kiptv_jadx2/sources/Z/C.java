package Z;

public final class C {

    public final C1165p0 f12189a;

    public final p089k0.e f12190b;

    public C(C1165p0 c1165p0, p089k0.e eVar) {
        this.f12189a = c1165p0;
        this.f12190b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c9 = (C) obj;
        return kotlin.jvm.internal.m.a(this.f12189a, c9.f12189a) && this.f12190b.equals(c9.f12190b);
    }

    public final int hashCode() {
        C1165p0 c1165p0 = this.f12189a;
        return this.f12190b.hashCode() + ((c1165p0 == null ? 0 : c1165p0.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f12189a + ", transition=" + this.f12190b + ')';
    }
}
