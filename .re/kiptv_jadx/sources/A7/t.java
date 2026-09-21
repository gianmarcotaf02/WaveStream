package A7;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f347i;

    public /* synthetic */ t(int i3, kotlin.jvm.functions.Function0 function0) {
        this.f346h = i3;
        this.f347i = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f346h) {
            case 0:
                return p078i6.o.R1((java.lang.Iterable) this.f347i.invoke());
            default:
                p180v7.o oVar = (p180v7.o) this.f347i.invoke();
                return oVar instanceof p180v7.k ? ((p180v7.k) oVar).h() : oVar;
        }
    }
}
