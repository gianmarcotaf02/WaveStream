package p105m2;

/* JADX INFO: loaded from: classes.dex */
public final class X extends p105m2.AbstractC2621t implements p105m2.U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f25248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f25249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25251d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p105m2.T f25253f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p105m2.Y f25254h;

    public X(p105m2.Y y, java.lang.String str, java.lang.String str2) {
        this.f25254h = y;
        this.f25248a = str;
        this.f25249b = str2;
    }

    @Override // p105m2.U
    public final void a(p105m2.T t9) {
        this.f25253f = t9;
        int i3 = t9.f25238e;
        t9.f25238e = i3 + 1;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("routeId", this.f25248a);
        bundle.putString("routeGroupId", this.f25249b);
        int i9 = t9.f25237d;
        t9.f25237d = i9 + 1;
        t9.b(3, i9, i3, null, bundle);
        this.g = i3;
        if (this.f25250c) {
            t9.a(i3);
            int i10 = this.f25251d;
            if (i10 >= 0) {
                t9.c(this.g, i10);
                this.f25251d = -1;
            }
            int i11 = this.f25252e;
            if (i11 != 0) {
                t9.d(this.g, i11);
                this.f25252e = 0;
            }
        }
    }

    @Override // p105m2.U
    public final int b() {
        return this.g;
    }

    @Override // p105m2.U
    public final void c() {
        p105m2.T t9 = this.f25253f;
        if (t9 != null) {
            int i3 = this.g;
            int i9 = t9.f25237d;
            t9.f25237d = i9 + 1;
            t9.b(4, i9, i3, null, null);
            this.f25253f = null;
            this.g = 0;
        }
    }

    @Override // p105m2.AbstractC2621t
    public final void d() {
        p105m2.Y y = this.f25254h;
        y.f25258r.remove(this);
        c();
        y.m();
    }

    @Override // p105m2.AbstractC2621t
    public final void e() {
        this.f25250c = true;
        p105m2.T t9 = this.f25253f;
        if (t9 != null) {
            t9.a(this.g);
        }
    }

    @Override // p105m2.AbstractC2621t
    public final void f(int i3) {
        p105m2.T t9 = this.f25253f;
        if (t9 != null) {
            t9.c(this.g, i3);
        } else {
            this.f25251d = i3;
            this.f25252e = 0;
        }
    }

    @Override // p105m2.AbstractC2621t
    public final void g() {
        h(0);
    }

    @Override // p105m2.AbstractC2621t
    public final void h(int i3) {
        this.f25250c = false;
        p105m2.T t9 = this.f25253f;
        if (t9 != null) {
            int i9 = this.g;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("unselectReason", i3);
            int i10 = t9.f25237d;
            t9.f25237d = i10 + 1;
            t9.b(6, i10, i9, null, bundle);
        }
    }

    @Override // p105m2.AbstractC2621t
    public final void i(int i3) {
        p105m2.T t9 = this.f25253f;
        if (t9 != null) {
            t9.d(this.g, i3);
        } else {
            this.f25252e += i3;
        }
    }
}
