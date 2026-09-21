package v;

/* JADX INFO: renamed from: v.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2890j0 implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f28953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v.l0 f28954i;

    public /* synthetic */ C2890j0(v.l0 l0Var, int i3) {
        this.f28953h = i3;
        this.f28954i = l0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f28953h) {
            case 0:
                this.f28954i.P0();
                return p070h6.A.f22523a;
            case 1:
                return new p181w0.a(this.f28954i.f28964D);
            default:
                O0.InterfaceC0732v interfaceC0732v = (O0.InterfaceC0732v) this.f28954i.f28962B.getValue();
                return new p181w0.a(interfaceC0732v != null ? interfaceC0732v.R(0L) : 9205357640488583168L);
        }
    }
}
