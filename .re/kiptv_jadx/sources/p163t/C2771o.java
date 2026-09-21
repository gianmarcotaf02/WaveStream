package p163t;

/* JADX INFO: renamed from: t.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2771o extends p163t.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f27654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f27655b;

    public C2771o(float f9, float f10) {
        this.f27654a = f9;
        this.f27655b = f10;
    }

    @Override // p163t.r
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f27654a;
        }
        if (i3 != 1) {
            return 0.0f;
        }
        return this.f27655b;
    }

    @Override // p163t.r
    public final int b() {
        return 2;
    }

    @Override // p163t.r
    public final p163t.r c() {
        return new p163t.C2771o(0.0f, 0.0f);
    }

    @Override // p163t.r
    public final void d() {
        this.f27654a = 0.0f;
        this.f27655b = 0.0f;
    }

    @Override // p163t.r
    public final void e(float f9, int i3) {
        if (i3 == 0) {
            this.f27654a = f9;
        } else {
            if (i3 != 1) {
                return;
            }
            this.f27655b = f9;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p163t.C2771o)) {
            return false;
        }
        p163t.C2771o c2771o = (p163t.C2771o) obj;
        return c2771o.f27654a == this.f27654a && c2771o.f27655b == this.f27655b;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f27655b) + (java.lang.Float.hashCode(this.f27654a) * 31);
    }

    public final java.lang.String toString() {
        return "AnimationVector2D: v1 = " + this.f27654a + ", v2 = " + this.f27655b;
    }
}
