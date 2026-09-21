package p137q0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements p137q0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f26468b;

    public h(float f9, float f10) {
        this.f26467a = f9;
        this.f26468b = f10;
    }

    @Override // p137q0.d
    public final long a(long j, long j9, p113n1.n nVar) {
        float f9 = (((int) (j9 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f10 = (((int) (j9 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        p113n1.n nVar2 = p113n1.n.f25566h;
        float f11 = this.f26467a;
        if (nVar != nVar2) {
            f11 *= -1;
        }
        float f12 = 1;
        float f13 = (f11 + f12) * f9;
        return (((long) java.lang.Math.round((f12 + this.f26468b) * f10)) & 4294967295L) | (((long) java.lang.Math.round(f13)) << 32);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p137q0.h)) {
            return false;
        }
        p137q0.h hVar = (p137q0.h) obj;
        return java.lang.Float.compare(this.f26467a, hVar.f26467a) == 0 && java.lang.Float.compare(this.f26468b, hVar.f26468b) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f26468b) + (java.lang.Float.hashCode(this.f26467a) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f26467a);
        sb.append(", verticalBias=");
        return p121o0.p.q(sb, this.f26468b, ')');
    }
}
