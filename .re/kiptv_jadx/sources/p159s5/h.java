package p159s5;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f27284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p159s5.w f27285i;
    public final /* synthetic */ p159s5.AbstractC2743d j;

    public /* synthetic */ h(p159s5.w wVar, p159s5.AbstractC2743d abstractC2743d, int i3) {
        this.f27284h = i3;
        this.f27285i = wVar;
        this.j = abstractC2743d;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f27284h) {
            case 0:
                p020c0.I DisposableEffect = (p020c0.I) obj;
                kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                p159s5.w wVar = this.f27285i;
                p159s5.AbstractC2743d abstractC2743d = this.j;
                if (!(abstractC2743d instanceof p159s5.C2740a)) {
                    wVar.f27350o.c(abstractC2743d, false);
                }
                return new p159s5.g(wVar, abstractC2743d, 0);
            default:
                p020c0.I DisposableEffect2 = (p020c0.I) obj;
                kotlin.jvm.internal.m.e(DisposableEffect2, "$this$DisposableEffect");
                p159s5.w wVar2 = this.f27285i;
                p159s5.AbstractC2743d abstractC2743d2 = this.j;
                if (!(abstractC2743d2 instanceof p159s5.C2740a)) {
                    wVar2.f27353r.c(abstractC2743d2, false);
                }
                return new p159s5.g(wVar2, abstractC2743d2, 1);
        }
    }
}
