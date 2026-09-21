package p154s;

/* JADX INFO: loaded from: classes.dex */
public final class I extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f27065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function0 f27066i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(boolean z6, kotlin.jvm.functions.Function0 function0) {
        super(1);
        this.f27065h = z6;
        this.f27066i = function0;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        ((p188x0.L) obj).g(!this.f27065h && ((java.lang.Boolean) this.f27066i.invoke()).booleanValue());
        return p070h6.A.f22523a;
    }
}
