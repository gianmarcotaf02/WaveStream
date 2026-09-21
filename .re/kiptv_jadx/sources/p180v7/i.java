package p180v7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends p180v7.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ E6.u[] f29683d = {kotlin.jvm.internal.B.f24540a.h(new kotlin.jvm.internal.u(p180v7.i.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q6.AbstractC0793b f29684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B7.i f29685c;

    public i(B7.m storageManager, Q6.AbstractC0793b abstractC0793b) {
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        this.f29684b = abstractC0793b;
        this.f29685c = new B7.i(storageManager, new p180v7.g(0, this));
    }

    @Override // p180v7.p, p180v7.q
    public final java.util.Collection a(p180v7.f kindFilter, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        return !kindFilter.a(p180v7.f.f29671n.f29678b) ? p078i6.w.f23205h : (java.util.List) p000a.a.v(this.f29685c, f29683d[0]);
    }

    @Override // p180v7.p, p180v7.o
    public final java.util.Collection b(p101l7.e name, V6.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        java.util.List list = (java.util.List) p000a.a.v(this.f29685c, f29683d[0]);
        if (list.isEmpty()) {
            return p078i6.w.f23205h;
        }
        L7.g gVar = new L7.g();
        for (java.lang.Object obj : list) {
            if ((obj instanceof Q6.L) && kotlin.jvm.internal.m.a(((Q6.L) obj).getName(), name)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    @Override // p180v7.p, p180v7.o
    public final java.util.Collection e(p101l7.e name, V6.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        java.util.List list = (java.util.List) p000a.a.v(this.f29685c, f29683d[0]);
        if (list.isEmpty()) {
            return p078i6.w.f23205h;
        }
        L7.g gVar = new L7.g();
        for (java.lang.Object obj : list) {
            if ((obj instanceof N6.N) && kotlin.jvm.internal.m.a(((N6.N) obj).getName(), name)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    public abstract java.util.List h();
}
