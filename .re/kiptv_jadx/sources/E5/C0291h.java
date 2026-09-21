package E5;

/* JADX INFO: renamed from: E5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0291h implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E5.X0 f3053i;
    public final /* synthetic */ kotlin.jvm.functions.Function0 j;

    public /* synthetic */ C0291h(E5.X0 x9, kotlin.jvm.functions.Function0 function0, int i3) {
        this.f3052h = i3;
        this.f3053i = x9;
        this.j = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f3052h) {
            case 0:
                this.f3053i.g();
                this.j.invoke();
                break;
            case 1:
                this.f3053i.g();
                this.j.invoke();
                break;
            default:
                if (this.f3053i.f()) {
                    this.j.invoke();
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
