package R0;

/* JADX INFO: renamed from: R0.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0851u0 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f8996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p079i7.f f8997i;
    public final /* synthetic */ java.lang.String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0851u0(boolean z6, p079i7.f fVar, java.lang.String str) {
        super(0);
        this.f8996h = z6;
        this.f8997i = fVar;
        this.j = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        if (this.f8996h) {
            p079i7.f fVar = this.f8997i;
            java.lang.String str = this.j;
            p177v2.a aVar = (p177v2.a) fVar.f23253i;
            synchronized (aVar.f29150c) {
            }
        }
        return p070h6.A.f22523a;
    }
}
