package P5;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements V7.InterfaceC0981g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V7.InterfaceC0981g f8150i;

    public /* synthetic */ d(V7.InterfaceC0981g interfaceC0981g, int i3) {
        this.f8149h = i3;
        this.f8150i = interfaceC0981g;
    }

    @Override // V7.InterfaceC0981g
    public final java.lang.Object collect(V7.InterfaceC0982h interfaceC0982h, p100l6.c cVar) {
        switch (this.f8149h) {
            case 0:
                java.lang.Object objCollect = this.f8150i.collect(new J5.V(interfaceC0982h, 2), cVar);
                return objCollect == p109m6.a.f25430h ? objCollect : p070h6.A.f22523a;
            case 1:
                java.lang.Object objCollect2 = this.f8150i.collect(new J5.V(interfaceC0982h, 3), cVar);
                return objCollect2 == p109m6.a.f25430h ? objCollect2 : p070h6.A.f22523a;
            default:
                java.lang.Object objCollect3 = this.f8150i.collect(new J5.V(interfaceC0982h, 7), cVar);
                return objCollect3 == p109m6.a.f25430h ? objCollect3 : p070h6.A.f22523a;
        }
    }
}
