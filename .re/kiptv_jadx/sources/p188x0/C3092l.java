package p188x0;

/* JADX INFO: renamed from: x0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3092l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.ColorFilter f31116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31118c;

    public C3092l(long j, int i3) {
        android.graphics.ColorFilter porterDuffColorFilter;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            p188x0.AbstractC3081a.d();
            porterDuffColorFilter = p188x0.AbstractC3081a.c(p188x0.z.H(j), p188x0.z.E(i3));
        } else {
            porterDuffColorFilter = new android.graphics.PorterDuffColorFilter(p188x0.z.H(j), p188x0.z.L(i3));
        }
        this.f31116a = porterDuffColorFilter;
        this.f31117b = j;
        this.f31118c = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p188x0.C3092l)) {
            return false;
        }
        p188x0.C3092l c3092l = (p188x0.C3092l) obj;
        if (p188x0.C3098s.d(this.f31117b, c3092l.f31117b)) {
            return this.f31118c == c3092l.f31118c;
        }
        return false;
    }

    public final int hashCode() {
        int i3 = p188x0.C3098s.f31128h;
        return java.lang.Integer.hashCode(this.f31118c) + (java.lang.Long.hashCode(this.f31117b) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BlendModeColorFilter(color=");
        p121o0.p.x(this.f31117b, ", blendMode=", sb);
        sb.append((java.lang.Object) p188x0.z.M(this.f31118c));
        sb.append(')');
        return sb.toString();
    }
}
