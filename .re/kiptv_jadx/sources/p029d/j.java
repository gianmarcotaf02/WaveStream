package p029d;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p019c.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public S7.A f21094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p194x6.m f21095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public K0.C0661i f21096f;
    public boolean g;

    @Override // p019c.n
    public final void a() {
        K0.C0661i c0661i = this.f21096f;
        if (c0661i != null) {
            c0661i.c();
        }
        K0.C0661i c0661i2 = this.f21096f;
        if (c0661i2 != null) {
            c0661i2.f6706b = false;
        }
        this.g = false;
    }

    @Override // p019c.n
    public final void b() {
        K0.C0661i c0661i = this.f21096f;
        if (c0661i != null && !c0661i.f6706b) {
            c0661i.c();
            this.f21096f = null;
        }
        if (this.f21096f == null) {
            this.f21096f = new K0.C0661i(this.f21094d, false, this.f21095e, this);
        }
        K0.C0661i c0661i2 = this.f21096f;
        if (c0661i2 != null) {
            ((U7.j) c0661i2.f6707c).close(null);
        }
        K0.C0661i c0661i3 = this.f21096f;
        if (c0661i3 != null) {
            c0661i3.f6706b = false;
        }
        this.g = false;
    }

    @Override // p019c.n
    public final void c(p019c.a aVar) {
        super.c(aVar);
        K0.C0661i c0661i = this.f21096f;
        if (c0661i != null) {
            ((U7.j) c0661i.f6707c).mo3trySendJP2dKIU(aVar);
        }
    }

    @Override // p019c.n
    public final void d(p019c.a aVar) {
        super.d(aVar);
        K0.C0661i c0661i = this.f21096f;
        if (c0661i != null) {
            c0661i.c();
        }
        if (this.f18072a) {
            this.f21096f = new K0.C0661i(this.f21094d, true, this.f21095e, this);
        }
        this.g = true;
    }
}
