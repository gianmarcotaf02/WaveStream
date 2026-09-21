package Z;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function0 f12351i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(int i3, kotlin.jvm.functions.Function0 function0) {
        super(0);
        this.f12350h = i3;
        this.f12351i = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f12350h) {
            case 0:
                return java.lang.Float.valueOf(O7.r.r(((java.lang.Number) this.f12351i.invoke()).floatValue(), 0.0f, 1.0f));
            default:
                this.f12351i.invoke();
                return java.lang.Boolean.TRUE;
        }
    }
}
