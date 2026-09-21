package p205z2;

/* JADX INFO: renamed from: z2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3173i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p205z2.C3173i f32254c = new p205z2.C3173i(p188x0.C3098s.f31127f, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f32256b;

    public C3173i(long j, float f9) {
        this.f32255a = j;
        this.f32256b = f9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p205z2.C3173i.class != obj.getClass()) {
            return false;
        }
        p205z2.C3173i c3173i = (p205z2.C3173i) obj;
        return p188x0.C3098s.d(this.f32255a, c3173i.f32255a) && p113n1.f.c(this.f32256b, c3173i.f32256b);
    }

    public final int hashCode() {
        int i3 = p188x0.C3098s.f31128h;
        return java.lang.Float.hashCode(this.f32256b) + (java.lang.Long.hashCode(this.f32255a) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Glow(elevationColor=");
        p121o0.p.x(this.f32255a, ", elevation=", sb);
        sb.append((java.lang.Object) p113n1.f.d(this.f32256b));
        sb.append(')');
        return sb.toString();
    }
}
