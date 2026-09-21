package p104m1;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p104m1.p f25182c = new p104m1.p(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f25183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f25184b;

    public p(float f9, float f10) {
        this.f25183a = f9;
        this.f25184b = f10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p104m1.p)) {
            return false;
        }
        p104m1.p pVar = (p104m1.p) obj;
        return this.f25183a == pVar.f25183a && this.f25184b == pVar.f25184b;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f25184b) + (java.lang.Float.hashCode(this.f25183a) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f25183a);
        sb.append(", skewX=");
        return p121o0.p.q(sb, this.f25184b, ')');
    }
}
