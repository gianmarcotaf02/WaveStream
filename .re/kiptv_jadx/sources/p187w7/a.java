package p187w7;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends D1.AbstractC0220e0 implements p187w7.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f30471i = 1;
    public final p101l7.e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final N6.InterfaceC0698l f30472k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(N6.InterfaceC0688b interfaceC0688b, C7.AbstractC0191x receiverType, p101l7.e eVar) {
        super(receiverType);
        kotlin.jvm.internal.m.e(receiverType, "receiverType");
        this.f30472k = (Q6.AbstractC0805n) interfaceC0688b;
        this.j = eVar;
    }

    public final p101l7.e E0() {
        switch (this.f30471i) {
            case 0:
                break;
        }
        return this.j;
    }

    public final java.lang.String toString() {
        switch (this.f30471i) {
            case 0:
                return getType() + ": Ctx { " + ((N6.InterfaceC0691e) this.f30472k) + " }";
            default:
                return "Cxt { " + ((Q6.AbstractC0805n) this.f30472k) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(N6.InterfaceC0691e interfaceC0691e, C7.AbstractC0191x receiverType, p101l7.e eVar) {
        super(receiverType);
        kotlin.jvm.internal.m.e(receiverType, "receiverType");
        this.f30472k = interfaceC0691e;
        this.j = eVar;
    }
}
