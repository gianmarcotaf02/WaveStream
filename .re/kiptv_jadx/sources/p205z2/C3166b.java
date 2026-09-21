package p205z2;

/* JADX INFO: renamed from: z2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3166b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p205z2.C3166b f32217c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v.C f32218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f32219b;

    static {
        float f9 = 0;
        f32217c = new p205z2.C3166b(new v.C(f9, new p188x0.S(p188x0.C3098s.f31127f)), f9);
    }

    public C3166b(v.C c9, float f9) {
        this.f32218a = c9;
        this.f32219b = f9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p205z2.C3166b.class != obj.getClass()) {
            return false;
        }
        p205z2.C3166b c3166b = (p205z2.C3166b) obj;
        if (!this.f32218a.equals(c3166b.f32218a) || !p113n1.f.c(this.f32219b, c3166b.f32219b)) {
            return false;
        }
        java.lang.Object obj2 = p188x0.z.f31141b;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return p188x0.z.f31141b.hashCode() + p121o0.p.c(this.f32219b, this.f32218a.hashCode() * 31, 31);
    }

    public final java.lang.String toString() {
        return "Border(border=" + this.f32218a + ", inset=" + ((java.lang.Object) p113n1.f.d(this.f32219b)) + ", shape=" + p188x0.z.f31141b + ')';
    }
}
