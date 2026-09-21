package W7;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends W7.i {
    public j(V7.InterfaceC0981g interfaceC0981g, Z7.d dVar, int i3, U7.EnumC0955c enumC0955c, int i9) {
        super(interfaceC0981g, (i9 & 2) != 0 ? p100l6.i.f24820h : dVar, (i9 & 4) != 0 ? -3 : i3, (i9 & 8) != 0 ? U7.EnumC0955c.f10175h : enumC0955c);
    }

    @Override // W7.g
    public final W7.g d(p100l6.h hVar, int i3, U7.EnumC0955c enumC0955c) {
        return new W7.j(this.f10743k, hVar, i3, enumC0955c);
    }

    @Override // W7.g
    public final V7.InterfaceC0981g e() {
        return this.f10743k;
    }

    @Override // W7.i
    public final java.lang.Object g(V7.InterfaceC0982h interfaceC0982h, p100l6.c cVar) {
        java.lang.Object objCollect = this.f10743k.collect(interfaceC0982h, cVar);
        return objCollect == p109m6.a.f25430h ? objCollect : p070h6.A.f22523a;
    }
}
