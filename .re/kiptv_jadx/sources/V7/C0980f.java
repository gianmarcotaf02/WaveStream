package V7;

/* JADX INFO: renamed from: V7.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0980f implements V7.InterfaceC0981g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.InterfaceC0981g f10457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p194x6.m f10458i;

    public C0980f(V7.InterfaceC0981g interfaceC0981g, p194x6.m mVar) {
        this.f10457h = interfaceC0981g;
        this.f10458i = mVar;
    }

    @Override // V7.InterfaceC0981g
    public final java.lang.Object collect(V7.InterfaceC0982h interfaceC0982h, p100l6.c cVar) {
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        a2.f24539h = W7.AbstractC1009c.f10731b;
        java.lang.Object objCollect = this.f10457h.collect(new E5.D0(this, a2, interfaceC0982h, 1), cVar);
        return objCollect == p109m6.a.f25430h ? objCollect : p070h6.A.f22523a;
    }
}
