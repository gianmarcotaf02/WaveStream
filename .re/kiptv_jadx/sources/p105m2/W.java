package p105m2;

/* JADX INFO: loaded from: classes.dex */
public final class W extends p105m2.AbstractC2620s implements p105m2.U {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f25243f;
    public boolean g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25245i;
    public p105m2.T j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p105m2.Y f25247l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25244h = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25246k = -1;

    public W(p105m2.Y y, java.lang.String str) {
        this.f25247l = y;
        this.f25243f = str;
    }

    @Override // p105m2.U
    public final void a(p105m2.T t9) {
        p105m2.V v6 = new p105m2.V(this);
        this.j = t9;
        int i3 = t9.f25238e;
        t9.f25238e = i3 + 1;
        int i9 = t9.f25237d;
        t9.f25237d = i9 + 1;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("memberRouteId", this.f25243f);
        t9.b(11, i9, i3, null, bundle);
        t9.f25240h.put(i9, v6);
        this.f25246k = i3;
        if (this.g) {
            t9.a(i3);
            int i10 = this.f25244h;
            if (i10 >= 0) {
                t9.c(this.f25246k, i10);
                this.f25244h = -1;
            }
            int i11 = this.f25245i;
            if (i11 != 0) {
                t9.d(this.f25246k, i11);
                this.f25245i = 0;
            }
        }
    }

    @Override // p105m2.U
    public final int b() {
        return this.f25246k;
    }

    @Override // p105m2.U
    public final void c() {
        p105m2.T t9 = this.j;
        if (t9 != null) {
            int i3 = this.f25246k;
            int i9 = t9.f25237d;
            t9.f25237d = i9 + 1;
            t9.b(4, i9, i3, null, null);
            this.j = null;
            this.f25246k = 0;
        }
    }

    @Override // p105m2.AbstractC2621t
    public final void d() {
        p105m2.Y y = this.f25247l;
        y.f25258r.remove(this);
        c();
        y.m();
    }

    @Override // p105m2.AbstractC2621t
    public final void e() {
        this.g = true;
        p105m2.T t9 = this.j;
        if (t9 != null) {
            t9.a(this.f25246k);
        }
    }

    @Override // p105m2.AbstractC2621t
    public final void f(int i3) {
        p105m2.T t9 = this.j;
        if (t9 != null) {
            t9.c(this.f25246k, i3);
        } else {
            this.f25244h = i3;
            this.f25245i = 0;
        }
    }

    @Override // p105m2.AbstractC2621t
    public final void g() {
        h(0);
    }

    @Override // p105m2.AbstractC2621t
    public final void h(int i3) {
        this.g = false;
        p105m2.T t9 = this.j;
        if (t9 != null) {
            int i9 = this.f25246k;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("unselectReason", i3);
            int i10 = t9.f25237d;
            t9.f25237d = i10 + 1;
            t9.b(6, i10, i9, null, bundle);
        }
    }

    @Override // p105m2.AbstractC2621t
    public final void i(int i3) {
        p105m2.T t9 = this.j;
        if (t9 != null) {
            t9.d(this.f25246k, i3);
        } else {
            this.f25245i += i3;
        }
    }
}
