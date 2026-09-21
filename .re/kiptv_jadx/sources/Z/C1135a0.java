package Z;

/* JADX INFO: renamed from: Z.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1135a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12361a = p188x0.C3098s.g;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Z.C1135a0) {
            return p188x0.C3098s.d(this.f12361a, ((Z.C1135a0) obj).f12361a);
        }
        return false;
    }

    public final int hashCode() {
        int i3 = p188x0.C3098s.f31128h;
        return java.lang.Long.hashCode(this.f12361a) * 31;
    }

    public final java.lang.String toString() {
        return "RippleConfiguration(color=" + ((java.lang.Object) p188x0.C3098s.j(this.f12361a)) + ", rippleAlpha=null)";
    }
}
