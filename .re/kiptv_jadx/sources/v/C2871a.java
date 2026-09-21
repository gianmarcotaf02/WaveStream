package v;

/* JADX INFO: renamed from: v.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2871a implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f28919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v.F f28920i;

    public /* synthetic */ C2871a(v.F f9, int i3) {
        this.f28919h = i3;
        this.f28920i = f9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        Q0.InterfaceC0775i interfaceC0775i;
        switch (this.f28919h) {
            case 0:
                p020c0.C c9 = v.AbstractC2878d0.f28929a;
                v.F f9 = this.f28920i;
                v.InterfaceC2874b0 interfaceC2874b0 = (v.InterfaceC2874b0) Q0.AbstractC0777k.h(f9, c9);
                if (!(interfaceC2874b0 instanceof v.InterfaceC2886h0)) {
                    A.b.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + interfaceC2874b0);
                }
                v.InterfaceC2886h0 interfaceC2886h0 = f9.f28826F;
                v.InterfaceC2886h0 interfaceC2886h1 = (v.InterfaceC2886h0) interfaceC2874b0;
                f9.f28826F = interfaceC2886h1;
                if (interfaceC2886h0 != null && !kotlin.jvm.internal.m.a(interfaceC2886h1, interfaceC2886h0) && ((interfaceC0775i = f9.f28827G) != null || !f9.f28833N)) {
                    if (interfaceC0775i != null) {
                        f9.O0(interfaceC0775i);
                    }
                    f9.f28827G = null;
                    f9.V0();
                }
                return p070h6.A.f22523a;
            default:
                this.f28920i.f28824D.invoke();
                return java.lang.Boolean.TRUE;
        }
    }
}
