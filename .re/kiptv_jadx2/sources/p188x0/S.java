package p188x0;

import F3.C0371k;
import android.graphics.Shader;

public final class S extends AbstractC3095o {

    public final long f31093a;

    public S(long j) {
        this.f31093a = j;
    }

    @Override
    public final void a(float f9, long j, C0371k c0371k) {
        c0371k.h(1.0f);
        long jC = this.f31093a;
        if (f9 != 1.0f) {
            jC = C3098s.c(jC, C3098s.e(jC) * f9);
        }
        c0371k.j(jC);
        if (((Shader) c0371k.f3602c) != null) {
            c0371k.n(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S) {
            return C3098s.d(this.f31093a, ((S) obj).f31093a);
        }
        return false;
    }

    public final int hashCode() {
        int i3 = C3098s.f31128h;
        return Long.hashCode(this.f31093a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C3098s.j(this.f31093a)) + ')';
    }
}
