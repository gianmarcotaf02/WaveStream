package J5;

/* JADX INFO: renamed from: J5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0629s implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f6556i;
    public final /* synthetic */ kotlin.jvm.functions.Function0 j;

    public /* synthetic */ C0629s(boolean z6, kotlin.jvm.functions.Function0 function0, int i3) {
        this.f6555h = i3;
        this.f6556i = z6;
        this.j = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f6555h) {
            case 0:
                if (!this.f6556i) {
                    this.j.invoke();
                }
                break;
            default:
                if (this.f6556i) {
                    this.j.invoke();
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
