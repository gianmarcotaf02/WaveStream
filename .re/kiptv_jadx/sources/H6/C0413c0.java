package H6;

/* JADX INFO: renamed from: H6.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0413c0 implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final H6.e0 f4429i;

    public /* synthetic */ C0413c0(H6.e0 e0Var, int i3) {
        this.f4428h = i3;
        this.f4429i = e0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f4428h) {
            case 0:
                return new H6.d0(this.f4429i);
            default:
                return this.f4429i.r();
        }
    }
}
