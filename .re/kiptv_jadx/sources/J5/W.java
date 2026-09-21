package J5;

/* JADX INFO: loaded from: classes4.dex */
public final class W implements V7.InterfaceC0981g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V7.W f6290i;

    public /* synthetic */ W(V7.W w6, int i3) {
        this.f6289h = i3;
        this.f6290i = w6;
    }

    @Override // V7.InterfaceC0981g
    public final java.lang.Object collect(V7.InterfaceC0982h interfaceC0982h, p100l6.c cVar) {
        switch (this.f6289h) {
            case 0:
                this.f6290i.collect(new J5.V(interfaceC0982h, 0), cVar);
                break;
            case 1:
                this.f6290i.collect(new J5.V(interfaceC0982h, 5), cVar);
                break;
            case 2:
                this.f6290i.collect(new J5.V(interfaceC0982h, 8), cVar);
                break;
            default:
                this.f6290i.collect(new J5.V(interfaceC0982h, 9), cVar);
                break;
        }
        return p109m6.a.f25430h;
    }
}
