package V4;

/* JADX INFO: loaded from: classes.dex */
public final class I implements V7.InterfaceC0981g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V7.InterfaceC0981g f10273i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f10274k;

    public /* synthetic */ I(V7.InterfaceC0981g interfaceC0981g, com.kiptv.core.model.z0 z0Var, V4.P p2, int i3) {
        this.f10272h = i3;
        this.f10273i = interfaceC0981g;
        this.j = z0Var;
        this.f10274k = p2;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [n6.i, x6.n] */
    @Override // V7.InterfaceC0981g
    public final java.lang.Object collect(V7.InterfaceC0982h interfaceC0982h, p100l6.c cVar) {
        int i3 = 1;
        int i9 = 0;
        p070h6.A a2 = p070h6.A.f22523a;
        java.lang.Object obj = this.f10274k;
        java.lang.Object obj2 = this.j;
        V7.InterfaceC0981g interfaceC0981g = this.f10273i;
        switch (this.f10272h) {
            case 0:
                java.lang.Object objCollect = interfaceC0981g.collect(new V4.H(interfaceC0982h, (com.kiptv.core.model.z0) obj2, (V4.P) obj, i9), cVar);
                return objCollect == p109m6.a.f25430h ? objCollect : a2;
            case 1:
                java.lang.Object objCollect2 = interfaceC0981g.collect(new V4.H(interfaceC0982h, (com.kiptv.core.model.z0) obj2, (V4.P) obj, i3), cVar);
                return objCollect2 == p109m6.a.f25430h ? objCollect2 : a2;
            default:
                java.lang.Object objA = W7.AbstractC1009c.a(interfaceC0982h, V7.S.f10417h, cVar, new V7.P((p194x6.n) obj, (p100l6.c) null), new V7.InterfaceC0981g[]{interfaceC0981g, (V7.W) obj2});
                return objA == p109m6.a.f25430h ? objA : a2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I(V7.InterfaceC0981g interfaceC0981g, V7.W w6, p194x6.n nVar) {
        this.f10272h = 2;
        this.f10273i = interfaceC0981g;
        this.j = w6;
        this.f10274k = (p117n6.i) nVar;
    }
}
