package Z2;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Z2.N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f12948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Z2.v0 f12951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12953f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12954h;

    public u0(Z2.C0 c9, Z2.M m8) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f12948a = arrayList;
        this.f12951d = null;
        this.f12952e = false;
        this.f12953f = true;
        this.g = -1;
        if (m8 == null) {
            return;
        }
        m8.x(this);
        if (this.f12954h) {
            this.f12951d.b((Z2.v0) arrayList.get(this.g));
            arrayList.set(this.g, this.f12951d);
            this.f12954h = false;
        }
        Z2.v0 v0Var = this.f12951d;
        if (v0Var != null) {
            arrayList.add(v0Var);
        }
    }

    @Override // Z2.N
    public final void a(float f9, float f10, float f11, float f12) {
        this.f12951d.a(f9, f10);
        this.f12948a.add(this.f12951d);
        this.f12951d = new Z2.v0(f11, f12, f11 - f9, f12 - f10);
        this.f12954h = false;
    }

    @Override // Z2.N
    public final void b(float f9, float f10) {
        boolean z6 = this.f12954h;
        java.util.ArrayList arrayList = this.f12948a;
        if (z6) {
            this.f12951d.b((Z2.v0) arrayList.get(this.g));
            arrayList.set(this.g, this.f12951d);
            this.f12954h = false;
        }
        Z2.v0 v0Var = this.f12951d;
        if (v0Var != null) {
            arrayList.add(v0Var);
        }
        this.f12949b = f9;
        this.f12950c = f10;
        this.f12951d = new Z2.v0(f9, f10, 0.0f, 0.0f);
        this.g = arrayList.size();
    }

    @Override // Z2.N
    public final void c(float f9, float f10, float f11, float f12, float f13, float f14) {
        if (this.f12953f || this.f12952e) {
            this.f12951d.a(f9, f10);
            this.f12948a.add(this.f12951d);
            this.f12952e = false;
        }
        this.f12951d = new Z2.v0(f13, f14, f13 - f11, f14 - f12);
        this.f12954h = false;
    }

    @Override // Z2.N
    public final void close() {
        this.f12948a.add(this.f12951d);
        e(this.f12949b, this.f12950c);
        this.f12954h = true;
    }

    @Override // Z2.N
    public final void d(float f9, float f10, float f11, boolean z6, boolean z9, float f12, float f13) {
        this.f12952e = true;
        this.f12953f = false;
        Z2.v0 v0Var = this.f12951d;
        Z2.C0.a(v0Var.f12956a, v0Var.f12957b, f9, f10, f11, z6, z9, f12, f13, this);
        this.f12953f = true;
        this.f12954h = false;
    }

    @Override // Z2.N
    public final void e(float f9, float f10) {
        this.f12951d.a(f9, f10);
        this.f12948a.add(this.f12951d);
        Z2.v0 v0Var = this.f12951d;
        this.f12951d = new Z2.v0(f9, f10, f9 - v0Var.f12956a, f10 - v0Var.f12957b);
        this.f12954h = false;
    }
}
