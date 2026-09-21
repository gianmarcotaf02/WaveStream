package Q6;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends Q6.AbstractC0804m implements N6.K {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ E6.u[] f8702o;
    public final Q6.A j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p101l7.c f8703k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final B7.i f8704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final B7.i f8705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p180v7.k f8706n;

    static {
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u(Q6.w.class, "fragments", "getFragments()Ljava/util/List;", 0);
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        f8702o = new E6.u[]{c9.h(uVar), B2.a.e(Q6.w.class, "empty", "getEmpty()Z", 0, c9)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w(Q6.A module, p101l7.c fqName, B7.m storageManager) {
        kotlin.jvm.internal.m.e(module, "module");
        kotlin.jvm.internal.m.e(fqName, "fqName");
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        O6.f fVar = O6.g.f7987a;
        p101l7.d dVar = fqName.f24829a;
        super(fVar, dVar.c() ? p101l7.d.f24831e : dVar.f());
        this.j = module;
        this.f8703k = fqName;
        this.f8704l = new B7.i(storageManager, new Q6.v(this, 0));
        this.f8705m = new B7.i(storageManager, new Q6.v(this, 1));
        this.f8706n = new p180v7.k(storageManager, new Q6.v(this, 2));
    }

    @Override // N6.InterfaceC0697k
    public final java.lang.Object B(N6.InterfaceC0699m interfaceC0699m, java.lang.Object obj) {
        return interfaceC0699m.x(this, obj);
    }

    public final boolean equals(java.lang.Object obj) {
        N6.K k9 = obj instanceof N6.K ? (N6.K) obj : null;
        if (k9 == null) {
            return false;
        }
        Q6.w wVar = (Q6.w) k9;
        return kotlin.jvm.internal.m.a(this.f8703k, wVar.f8703k) && kotlin.jvm.internal.m.a(this.j, wVar.j);
    }

    @Override // N6.InterfaceC0697k
    public final N6.InterfaceC0697k h() {
        p101l7.c cVar = this.f8703k;
        if (cVar.f24829a.c()) {
            return null;
        }
        return this.j.a0(cVar.b());
    }

    public final int hashCode() {
        return this.f8703k.hashCode() + (this.j.hashCode() * 31);
    }
}
