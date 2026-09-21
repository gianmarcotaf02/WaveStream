package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends p076i4.T {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p076i4.R0 f22826p = new p076i4.R0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient java.lang.Object f22827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient java.lang.Object[] f22828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient int f22829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient int f22830n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient p076i4.R0 f22831o;

    public R0() {
        this.f22827k = null;
        this.f22828l = new java.lang.Object[0];
        this.f22829m = 0;
        this.f22830n = 0;
        this.f22831o = this;
    }

    @Override // p076i4.AbstractC2194f0
    public final p076i4.U0 b() {
        return new p076i4.U0(this, this.f22828l, this.f22829m, this.f22830n);
    }

    @Override // p076i4.AbstractC2194f0
    public final p076i4.V0 c() {
        return new p076i4.V0(this, new p076i4.W0(this.f22828l, this.f22829m, this.f22830n));
    }

    @Override // p076i4.AbstractC2194f0, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Object objK = p076i4.X0.k(this.f22827k, this.f22828l, this.f22830n, this.f22829m, obj);
        if (objK == null) {
            return null;
        }
        return objK;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f22830n;
    }

    public R0(java.lang.Object obj, java.lang.Object[] objArr, int i3, p076i4.R0 r9) {
        this.f22827k = obj;
        this.f22828l = objArr;
        this.f22829m = 1;
        this.f22830n = i3;
        this.f22831o = r9;
    }

    public R0(java.lang.Object[] objArr, int i3) {
        this.f22828l = objArr;
        this.f22830n = i3;
        this.f22829m = 0;
        int iR = i3 >= 2 ? p076i4.AbstractC2214p0.r(i3) : 0;
        java.lang.Object objJ = p076i4.X0.j(objArr, i3, iR, 0);
        if (!(objJ instanceof java.lang.Object[])) {
            this.f22827k = objJ;
            java.lang.Object objJ2 = p076i4.X0.j(objArr, i3, iR, 1);
            if (!(objJ2 instanceof java.lang.Object[])) {
                this.f22831o = new p076i4.R0(objJ2, objArr, i3, this);
                return;
            }
            throw ((p076i4.C2190d0) ((java.lang.Object[]) objJ2)[2]).a();
        }
        throw ((p076i4.C2190d0) ((java.lang.Object[]) objJ)[2]).a();
    }
}
