package p188x0;

/* JADX INFO: loaded from: classes.dex */
public final class S extends p188x0.AbstractC3095o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31093a;

    public S(long j) {
        this.f31093a = j;
    }

    @Override // p188x0.AbstractC3095o
    public final void a(float f9, long j, F3.C0371k c0371k) {
        c0371k.h(1.0f);
        long jC = this.f31093a;
        if (f9 != 1.0f) {
            jC = p188x0.C3098s.c(jC, p188x0.C3098s.e(jC) * f9);
        }
        c0371k.j(jC);
        if (((android.graphics.Shader) c0371k.f3602c) != null) {
            c0371k.n(null);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p188x0.S) {
            return p188x0.C3098s.d(this.f31093a, ((p188x0.S) obj).f31093a);
        }
        return false;
    }

    public final int hashCode() {
        int i3 = p188x0.C3098s.f31128h;
        return java.lang.Long.hashCode(this.f31093a);
    }

    public final java.lang.String toString() {
        return "SolidColor(value=" + ((java.lang.Object) p188x0.C3098s.j(this.f31093a)) + ')';
    }
}
