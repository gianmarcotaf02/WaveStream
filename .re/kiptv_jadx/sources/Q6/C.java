package Q6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class C extends Q6.AbstractC0805n implements N6.G {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p101l7.c f8549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f8550m;

    /* JADX WARN: Illegal instructions before constructor call */
    public C(N6.B module, p101l7.c fqName) {
        kotlin.jvm.internal.m.e(module, "module");
        kotlin.jvm.internal.m.e(fqName, "fqName");
        O6.f fVar = O6.g.f7987a;
        p101l7.d dVar = fqName.f24829a;
        super(module, fVar, dVar.c() ? p101l7.d.f24831e : dVar.f(), N6.P.f7377b);
        this.f8549l = fqName;
        this.f8550m = "package " + fqName + " of " + module;
    }

    @Override // N6.InterfaceC0697k
    public final java.lang.Object B(N6.InterfaceC0699m interfaceC0699m, java.lang.Object obj) {
        return interfaceC0699m.t(this, obj);
    }

    @Override // Q6.AbstractC0805n, N6.InterfaceC0697k
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final N6.B h() {
        N6.InterfaceC0697k interfaceC0697kH = super.h();
        kotlin.jvm.internal.m.c(interfaceC0697kH, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (N6.B) interfaceC0697kH;
    }

    @Override // Q6.AbstractC0805n, N6.InterfaceC0698l
    public N6.P d() {
        return N6.P.f7377b;
    }

    @Override // Q6.AbstractC0804m
    public java.lang.String toString() {
        return this.f8550m;
    }
}
