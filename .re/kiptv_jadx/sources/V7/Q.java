package V7;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements V7.InterfaceC0981g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10415h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V7.InterfaceC0981g[] f10416i;
    public final /* synthetic */ p117n6.i j;

    /* JADX WARN: Multi-variable type inference failed */
    public Q(V7.InterfaceC0981g[] interfaceC0981gArr, p194x6.o oVar) {
        this.f10416i = interfaceC0981gArr;
        this.j = (p117n6.i) oVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [n6.i, x6.o] */
    /* JADX WARN: Type inference failed for: r2v2, types: [n6.i, x6.p] */
    /* JADX WARN: Type inference failed for: r2v4, types: [n6.i, x6.q] */
    @Override // V7.InterfaceC0981g
    public final java.lang.Object collect(V7.InterfaceC0982h interfaceC0982h, p100l6.c cVar) {
        switch (this.f10415h) {
            case 0:
                java.lang.Object objA = W7.AbstractC1009c.a(interfaceC0982h, V7.S.f10417h, cVar, new V7.P((p194x6.o) this.j, (p100l6.c) null), this.f10416i);
                return objA == p109m6.a.f25430h ? objA : p070h6.A.f22523a;
            case 1:
                java.lang.Object objA2 = W7.AbstractC1009c.a(interfaceC0982h, V7.S.f10417h, cVar, new V7.P((p194x6.p) this.j, (p100l6.c) null), this.f10416i);
                return objA2 == p109m6.a.f25430h ? objA2 : p070h6.A.f22523a;
            default:
                java.lang.Object objA3 = W7.AbstractC1009c.a(interfaceC0982h, V7.S.f10417h, cVar, new V7.P((p100l6.c) null, (p194x6.q) this.j), this.f10416i);
                return objA3 == p109m6.a.f25430h ? objA3 : p070h6.A.f22523a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q(V7.InterfaceC0981g[] interfaceC0981gArr, p194x6.p pVar) {
        this.f10416i = interfaceC0981gArr;
        this.j = (p117n6.i) pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q(V7.InterfaceC0981g[] interfaceC0981gArr, p194x6.q qVar) {
        this.f10416i = interfaceC0981gArr;
        this.j = (p117n6.i) qVar;
    }
}
