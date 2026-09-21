package O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O.i f7517i;
    public final /* synthetic */ Q.e j;

    public /* synthetic */ b(O.i iVar, Q.e eVar, int i3) {
        this.f7516h = i3;
        this.f7517i = iVar;
        this.j = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f7516h) {
            case 0:
                O.i iVar = this.f7517i;
                O.a aVar = iVar.f7538f;
                D5.C0261o c0261o = new D5.C0261o(13, this.j);
                kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
                iVar.f7537e.d("dataBuilder", aVar, new C5.C0119j(a2, c0261o, 20));
                java.lang.Object obj = a2.f24539h;
                if (obj != null) {
                    return (M.c) obj;
                }
                kotlin.jvm.internal.m.k("result");
                throw null;
            case 1:
                O.i iVar2 = this.f7517i;
                O.a aVar2 = iVar2.g;
                O.b bVar = new O.b(iVar2, this.j, 2);
                kotlin.jvm.internal.A a9 = new kotlin.jvm.internal.A();
                iVar2.f7537e.d("positioner", aVar2, new C5.C0119j(a9, bVar, 20));
                java.lang.Object obj2 = a9.f24539h;
                if (obj2 != null) {
                    return (p181w0.b) obj2;
                }
                kotlin.jvm.internal.m.k("result");
                throw null;
            default:
                java.lang.Object objInvoke = this.f7517i.f7535c.invoke();
                if (!((O0.InterfaceC0732v) objInvoke).i()) {
                    objInvoke = null;
                }
                O0.InterfaceC0732v interfaceC0732v = (O0.InterfaceC0732v) objInvoke;
                return interfaceC0732v == null ? p181w0.b.f29745e : this.j.i0(interfaceC0732v).i(interfaceC0732v.R(0L));
        }
    }
}
