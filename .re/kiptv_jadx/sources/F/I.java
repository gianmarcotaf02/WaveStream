package F;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f3343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F.K f3344b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public F.I f3347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3348f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3345c = -1;
    public final p020c0.C1681g0 g = p020c0.AbstractC1703s.y(null);

    public I(java.lang.Object obj, F.K k9) {
        this.f3343a = obj;
        this.f3344b = k9;
    }

    public final F.I a() {
        if (this.f3348f) {
            A.b.c("Pin should not be called on an already disposed item ");
        }
        if (this.f3346d == 0) {
            this.f3344b.f3354h.add(this);
            F.I i3 = (F.I) this.g.getValue();
            if (i3 != null) {
                i3.a();
            } else {
                i3 = null;
            }
            this.f3347e = i3;
        }
        this.f3346d++;
        return this;
    }

    public final void b() {
        if (this.f3348f) {
            return;
        }
        if (this.f3346d <= 0) {
            A.b.c("Release should only be called once");
        }
        int i3 = this.f3346d - 1;
        this.f3346d = i3;
        if (i3 == 0) {
            this.f3344b.f3354h.remove(this);
            F.I i9 = this.f3347e;
            if (i9 != null) {
                i9.b();
            }
            this.f3347e = null;
        }
    }
}
