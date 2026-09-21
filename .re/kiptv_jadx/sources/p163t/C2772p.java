package p163t;

/* JADX INFO: renamed from: t.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2772p extends p163t.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f27664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f27665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f27666c;

    public C2772p(float f9, float f10, float f11) {
        this.f27664a = f9;
        this.f27665b = f10;
        this.f27666c = f11;
    }

    @Override // p163t.r
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f27664a;
        }
        if (i3 == 1) {
            return this.f27665b;
        }
        if (i3 != 2) {
            return 0.0f;
        }
        return this.f27666c;
    }

    @Override // p163t.r
    public final int b() {
        return 3;
    }

    @Override // p163t.r
    public final p163t.r c() {
        return new p163t.C2772p(0.0f, 0.0f, 0.0f);
    }

    @Override // p163t.r
    public final void d() {
        this.f27664a = 0.0f;
        this.f27665b = 0.0f;
        this.f27666c = 0.0f;
    }

    @Override // p163t.r
    public final void e(float f9, int i3) {
        if (i3 == 0) {
            this.f27664a = f9;
        } else if (i3 == 1) {
            this.f27665b = f9;
        } else {
            if (i3 != 2) {
                return;
            }
            this.f27666c = f9;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p163t.C2772p)) {
            return false;
        }
        p163t.C2772p c2772p = (p163t.C2772p) obj;
        return c2772p.f27664a == this.f27664a && c2772p.f27665b == this.f27665b && c2772p.f27666c == this.f27666c;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f27666c) + p121o0.p.c(this.f27665b, java.lang.Float.hashCode(this.f27664a) * 31, 31);
    }

    public final java.lang.String toString() {
        return "AnimationVector3D: v1 = " + this.f27664a + ", v2 = " + this.f27665b + ", v3 = " + this.f27666c;
    }
}
