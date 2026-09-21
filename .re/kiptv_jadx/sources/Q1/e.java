package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Q1.f f8501i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Q1.f fVar, int i3) {
        super(0);
        this.f8500h = i3;
        this.f8501i = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f8500h) {
            case 0:
                Q1.f fVar = this.f8501i;
                M8.A a2 = (M8.A) fVar.f8506c.invoke();
                if (N8.c.a(a2) != -1) {
                    return B3.o.k(a2.f7208h.r(), true);
                }
                throw new java.lang.IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + fVar.f8506c + ", instead got " + a2).toString());
            default:
                B3.o oVar = Q1.f.f8503f;
                Q1.f fVar2 = this.f8501i;
                synchronized (oVar) {
                    Q1.f.f8502e.remove(((M8.A) fVar2.f8507d.getValue()).f7208h.r());
                }
                return p070h6.A.f22523a;
        }
    }
}
