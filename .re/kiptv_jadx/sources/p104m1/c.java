package p104m1;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p104m1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25159a;

    public c(long j) {
        this.f25159a = j;
        if (j != 16) {
            return;
        }
        p065h1.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // p104m1.o
    public final float a() {
        return p188x0.C3098s.e(this.f25159a);
    }

    @Override // p104m1.o
    public final long b() {
        return this.f25159a;
    }

    @Override // p104m1.o
    public final p188x0.AbstractC3095o c() {
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p104m1.c) && p188x0.C3098s.d(this.f25159a, ((p104m1.c) obj).f25159a);
    }

    public final int hashCode() {
        int i3 = p188x0.C3098s.f31128h;
        return java.lang.Long.hashCode(this.f25159a);
    }

    public final java.lang.String toString() {
        return "ColorStyle(value=" + ((java.lang.Object) p188x0.C3098s.j(this.f25159a)) + ')';
    }
}
