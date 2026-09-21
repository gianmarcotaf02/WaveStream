package p104m1;

import p065h1.a;
import p188x0.AbstractC3095o;
import p188x0.C3098s;

public final class c implements o {

    public final long f25159a;

    public c(long j) {
        this.f25159a = j;
        if (j != 16) {
            return;
        }
        a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override
    public final float a() {
        return C3098s.e(this.f25159a);
    }

    @Override
    public final long b() {
        return this.f25159a;
    }

    @Override
    public final AbstractC3095o c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && C3098s.d(this.f25159a, ((c) obj).f25159a);
    }

    public final int hashCode() {
        int i3 = C3098s.f31128h;
        return Long.hashCode(this.f25159a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C3098s.j(this.f25159a)) + ')';
    }
}
