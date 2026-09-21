package p163t;

/* JADX INFO: renamed from: t.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2770n extends p163t.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f27648a;

    public C2770n(float f9) {
        this.f27648a = f9;
    }

    @Override // p163t.r
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f27648a;
        }
        return 0.0f;
    }

    @Override // p163t.r
    public final int b() {
        return 1;
    }

    @Override // p163t.r
    public final p163t.r c() {
        return new p163t.C2770n(0.0f);
    }

    @Override // p163t.r
    public final void d() {
        this.f27648a = 0.0f;
    }

    @Override // p163t.r
    public final void e(float f9, int i3) {
        if (i3 == 0) {
            this.f27648a = f9;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof p163t.C2770n) && ((p163t.C2770n) obj).f27648a == this.f27648a;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f27648a);
    }

    public final java.lang.String toString() {
        return "AnimationVector1D: value = " + this.f27648a;
    }
}
