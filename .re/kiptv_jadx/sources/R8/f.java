package R8;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements P8.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f9086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile P8.b f9087i;
    public java.lang.Boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.reflect.Method f9088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Q8.a f9089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f9090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f9091n;

    public f(java.lang.String str, java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue, boolean z6) {
        this.f9086h = str;
        this.f9090m = linkedBlockingQueue;
        this.f9091n = z6;
    }

    @Override // P8.b
    public final boolean a() {
        return k().a();
    }

    @Override // P8.b
    public final boolean b() {
        return k().b();
    }

    @Override // P8.b
    public final void c(java.lang.String str, java.lang.Throwable th) {
        k().c(str, th);
    }

    @Override // P8.b
    public final boolean d() {
        return k().d();
    }

    @Override // P8.b
    public final boolean e() {
        return k().e();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && R8.f.class == obj.getClass() && this.f9086h.equals(((R8.f) obj).f9086h);
    }

    @Override // P8.b
    public final boolean f() {
        return k().f();
    }

    @Override // P8.b
    public final void g(java.lang.String str) {
        k().g(str);
    }

    @Override // P8.b
    public final java.lang.String getName() {
        return this.f9086h;
    }

    @Override // P8.b
    public final void h(java.lang.String str) {
        k().h(str);
    }

    public final int hashCode() {
        return this.f9086h.hashCode();
    }

    @Override // P8.b
    public final void i(java.lang.String str) {
        k().i(str);
    }

    @Override // P8.b
    public final boolean j(int i3) {
        return k().j(i3);
    }

    public final P8.b k() {
        if (this.f9087i != null) {
            return this.f9087i;
        }
        if (this.f9091n) {
            return R8.b.f9080h;
        }
        if (this.f9089l == null) {
            Q8.a aVar = new Q8.a();
            aVar.f8716i = this;
            aVar.f8715h = this.f9086h;
            aVar.j = this.f9090m;
            this.f9089l = aVar;
        }
        return this.f9089l;
    }

    public final boolean l() {
        java.lang.Boolean bool = this.j;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f9088k = this.f9087i.getClass().getMethod("log", Q8.b.class);
            this.j = java.lang.Boolean.TRUE;
        } catch (java.lang.NoSuchMethodException unused) {
            this.j = java.lang.Boolean.FALSE;
        }
        return this.j.booleanValue();
    }
}
