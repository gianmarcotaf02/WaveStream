package p163t;

/* JADX INFO: renamed from: t.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2773q extends p163t.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f27669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f27670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f27671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f27672d;

    public C2773q(float f9, float f10, float f11, float f12) {
        this.f27669a = f9;
        this.f27670b = f10;
        this.f27671c = f11;
        this.f27672d = f12;
    }

    @Override // p163t.r
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f27669a;
        }
        if (i3 == 1) {
            return this.f27670b;
        }
        if (i3 == 2) {
            return this.f27671c;
        }
        if (i3 != 3) {
            return 0.0f;
        }
        return this.f27672d;
    }

    @Override // p163t.r
    public final int b() {
        return 4;
    }

    @Override // p163t.r
    public final p163t.r c() {
        return new p163t.C2773q(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p163t.r
    public final void d() {
        this.f27669a = 0.0f;
        this.f27670b = 0.0f;
        this.f27671c = 0.0f;
        this.f27672d = 0.0f;
    }

    @Override // p163t.r
    public final void e(float f9, int i3) {
        if (i3 == 0) {
            this.f27669a = f9;
            return;
        }
        if (i3 == 1) {
            this.f27670b = f9;
        } else if (i3 == 2) {
            this.f27671c = f9;
        } else {
            if (i3 != 3) {
                return;
            }
            this.f27672d = f9;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p163t.C2773q)) {
            return false;
        }
        p163t.C2773q c2773q = (p163t.C2773q) obj;
        return c2773q.f27669a == this.f27669a && c2773q.f27670b == this.f27670b && c2773q.f27671c == this.f27671c && c2773q.f27672d == this.f27672d;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f27672d) + p121o0.p.c(this.f27671c, p121o0.p.c(this.f27670b, java.lang.Float.hashCode(this.f27669a) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        return "AnimationVector4D: v1 = " + this.f27669a + ", v2 = " + this.f27670b + ", v3 = " + this.f27671c + ", v4 = " + this.f27672d;
    }
}
