package H6;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final H6.h0 f4437i;

    public /* synthetic */ f0(H6.h0 h0Var, int i3) {
        this.f4436h = i3;
        this.f4437i = h0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f4436h) {
            case 0:
                return new H6.g0(this.f4437i);
            default:
                return this.f4437i.r();
        }
    }
}
