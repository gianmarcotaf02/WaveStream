package p205z2;

/* JADX INFO: loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f32334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p188x0.O f32335i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(float f9, p188x0.O o8) {
        super(1);
        this.f32334h = f9;
        this.f32335i = o8;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p188x0.L l2 = (p188x0.L) obj;
        l2.b(this.f32334h);
        l2.p(this.f32335i);
        l2.g(true);
        return p070h6.A.f22523a;
    }
}
