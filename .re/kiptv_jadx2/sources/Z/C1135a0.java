package Z;

import p188x0.C3098s;

public final class C1135a0 {

    public final long f12361a = C3098s.g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1135a0) {
            return C3098s.d(this.f12361a, ((C1135a0) obj).f12361a);
        }
        return false;
    }

    public final int hashCode() {
        int i3 = C3098s.f31128h;
        return Long.hashCode(this.f12361a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C3098s.j(this.f12361a)) + ", rippleAlpha=null)";
    }
}
