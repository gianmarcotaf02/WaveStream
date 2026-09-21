package V7;

/* JADX INFO: loaded from: classes4.dex */
public final class W implements V7.l0, V7.InterfaceC0981g, W7.v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ V7.U f10419h;

    public W(V7.U u6) {
        this.f10419h = u6;
    }

    @Override // W7.v
    public final V7.InterfaceC0981g a(p100l6.h hVar, int i3, U7.EnumC0955c enumC0955c) {
        return (((i3 < 0 || i3 >= 2) && i3 != -2) || enumC0955c != U7.EnumC0955c.f10176i) ? V7.r.r(this, hVar, i3, enumC0955c) : this;
    }

    @Override // V7.InterfaceC0981g
    public final java.lang.Object collect(V7.InterfaceC0982h interfaceC0982h, p100l6.c cVar) {
        ((V7.n0) this.f10419h).collect(interfaceC0982h, cVar);
        return p109m6.a.f25430h;
    }

    @Override // V7.l0
    public final java.lang.Object getValue() {
        return ((V7.n0) this.f10419h).getValue();
    }
}
