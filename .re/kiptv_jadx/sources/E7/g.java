package E7;

/* JADX INFO: loaded from: classes4.dex */
public class g implements p180v7.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3234b;

    public g(E7.h hVar, java.lang.String... formatParams) {
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(formatParams, formatParams.length);
        this.f3234b = java.lang.String.format(hVar.f3240h, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // p180v7.q
    public java.util.Collection a(p180v7.f kindFilter, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        return p078i6.w.f23205h;
    }

    @Override // p180v7.o
    public java.util.Set c() {
        return p078i6.y.f23207h;
    }

    @Override // p180v7.o
    public java.util.Set d() {
        return p078i6.y.f23207h;
    }

    @Override // p180v7.q
    public N6.InterfaceC0694h f(p101l7.e name, V6.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        E7.b[] bVarArr = E7.b.f3228h;
        return new E7.a(p101l7.e.g(java.lang.String.format("<Error class: %s>", java.util.Arrays.copyOf(new java.lang.Object[]{name}, 1))));
    }

    @Override // p180v7.o
    public java.util.Set g() {
        return p078i6.y.f23207h;
    }

    @Override // p180v7.o
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public java.util.Set b(p101l7.e name, V6.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        E7.a containingDeclaration = E7.l.f3281c;
        kotlin.jvm.internal.m.e(containingDeclaration, "containingDeclaration");
        O6.f fVar = O6.g.f7987a;
        E7.b[] bVarArr = E7.b.f3228h;
        E7.c cVar2 = new E7.c(containingDeclaration, null, fVar, p101l7.e.g("<Error function>"), 1, N6.P.f7377b);
        p078i6.w wVar = p078i6.w.f23205h;
        cVar2.L0(null, null, wVar, wVar, wVar, E7.l.c(E7.k.f3263l, new java.lang.String[0]), N6.EnumC0711z.f7428k, N6.AbstractC0702p.f7406e);
        return com.google.crypto.tink.shaded.protobuf.AbstractC1909d.h0(cVar2);
    }

    @Override // p180v7.o
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public java.util.Set e(p101l7.e name, V6.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return E7.l.f3284f;
    }

    public java.lang.String toString() {
        return Y6.f.l(new java.lang.StringBuilder("ErrorScope{"), this.f3234b, '}');
    }
}
