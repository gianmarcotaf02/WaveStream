package Z2;

/* JADX INFO: loaded from: classes.dex */
public abstract class B extends Z2.AbstractC1179a0 implements Z2.D, Z2.X {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.HashSet f12647i = null;
    public java.lang.String j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.HashSet f12648k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.util.HashSet f12649l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.util.HashSet f12650m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public android.graphics.Matrix f12651n;

    @Override // Z2.X
    public final java.util.Set c() {
        return this.f12648k;
    }

    @Override // Z2.X
    public final java.lang.String d() {
        return this.j;
    }

    @Override // Z2.X
    public final void f(java.util.HashSet hashSet) {
        this.f12647i = hashSet;
    }

    @Override // Z2.X
    public final java.util.Set g() {
        return this.f12647i;
    }

    @Override // Z2.X
    public final void h(java.util.HashSet hashSet) {
        this.f12650m = hashSet;
    }

    @Override // Z2.X
    public final void i(java.lang.String str) {
        this.j = str;
    }

    @Override // Z2.X
    public final void j(java.util.HashSet hashSet) {
        this.f12649l = hashSet;
    }

    @Override // Z2.X
    public final void k(java.util.HashSet hashSet) {
        this.f12648k = hashSet;
    }

    @Override // Z2.D
    public final void l(android.graphics.Matrix matrix) {
        this.f12651n = matrix;
    }

    @Override // Z2.X
    public final java.util.Set m() {
        return this.f12649l;
    }

    @Override // Z2.X
    public final java.util.Set n() {
        return this.f12650m;
    }
}
