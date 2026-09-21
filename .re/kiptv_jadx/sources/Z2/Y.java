package Z2;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y extends Z2.AbstractC1179a0 implements Z2.Z, Z2.X {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f12851i = new java.util.ArrayList();
    public java.util.HashSet j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.String f12852k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.util.HashSet f12853l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.util.HashSet f12854m = null;

    @Override // Z2.Z
    public void a(Z2.AbstractC1185d0 abstractC1185d0) {
        this.f12851i.add(abstractC1185d0);
    }

    @Override // Z2.Z
    public final java.util.List b() {
        return this.f12851i;
    }

    @Override // Z2.X
    public final java.util.Set c() {
        return null;
    }

    @Override // Z2.X
    public final java.lang.String d() {
        return this.f12852k;
    }

    @Override // Z2.X
    public final void f(java.util.HashSet hashSet) {
        this.j = hashSet;
    }

    @Override // Z2.X
    public final java.util.Set g() {
        return this.j;
    }

    @Override // Z2.X
    public final void h(java.util.HashSet hashSet) {
        this.f12854m = hashSet;
    }

    @Override // Z2.X
    public final void i(java.lang.String str) {
        this.f12852k = str;
    }

    @Override // Z2.X
    public final void j(java.util.HashSet hashSet) {
        this.f12853l = hashSet;
    }

    @Override // Z2.X
    public final java.util.Set m() {
        return this.f12853l;
    }

    @Override // Z2.X
    public final java.util.Set n() {
        return this.f12854m;
    }

    @Override // Z2.X
    public final void k(java.util.HashSet hashSet) {
    }
}
