package p137q0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26465a;

    public f(float f9) {
        this.f26465a = f9;
    }

    public final int a(int i3, int i9, p113n1.n nVar) {
        float f9 = (i9 - i3) / 2.0f;
        p113n1.n nVar2 = p113n1.n.f25566h;
        float f10 = this.f26465a;
        if (nVar != nVar2) {
            f10 *= -1;
        }
        return java.lang.Math.round((1 + f10) * f9);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p137q0.f) && java.lang.Float.compare(this.f26465a, ((p137q0.f) obj).f26465a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f26465a);
    }

    public final java.lang.String toString() {
        return p121o0.p.q(new java.lang.StringBuilder("Horizontal(bias="), this.f26465a, ')');
    }
}
