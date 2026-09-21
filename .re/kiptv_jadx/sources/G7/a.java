package G7;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements p194x6.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final G7.a f3829i = new G7.a(0);
    public static final G7.a j = new G7.a(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3830h;

    public /* synthetic */ a(int i3) {
        this.f3830h = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        C7.a0 it = (C7.a0) obj;
        switch (this.f3830h) {
            case 0:
                kotlin.jvm.internal.m.e(it, "it");
                N6.InterfaceC0694h interfaceC0694hH = it.u0().h();
                return java.lang.Boolean.valueOf(interfaceC0694hH != null && (interfaceC0694hH instanceof N6.U) && (((N6.U) interfaceC0694hH).h() instanceof N6.T));
            default:
                kotlin.jvm.internal.m.e(it, "it");
                N6.InterfaceC0694h interfaceC0694hH2 = it.u0().h();
                return java.lang.Boolean.valueOf(interfaceC0694hH2 != null && ((interfaceC0694hH2 instanceof N6.T) || (interfaceC0694hH2 instanceof N6.U)));
        }
    }
}
