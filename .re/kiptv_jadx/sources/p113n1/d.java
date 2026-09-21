package p113n1;

/* JADX INFO: loaded from: classes.dex */
public final class d implements p113n1.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f25548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f25549i;

    public d(float f9, float f10) {
        this.f25548h = f9;
        this.f25549i = f10;
    }

    @Override // p113n1.c
    public final float S() {
        return this.f25549i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p113n1.d)) {
            return false;
        }
        p113n1.d dVar = (p113n1.d) obj;
        return java.lang.Float.compare(this.f25548h, dVar.f25548h) == 0 && java.lang.Float.compare(this.f25549i, dVar.f25549i) == 0;
    }

    @Override // p113n1.c
    public final float getDensity() {
        return this.f25548h;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f25549i) + (java.lang.Float.hashCode(this.f25548h) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DensityImpl(density=");
        sb.append(this.f25548h);
        sb.append(", fontScale=");
        return p121o0.p.q(sb, this.f25549i, ')');
    }
}
