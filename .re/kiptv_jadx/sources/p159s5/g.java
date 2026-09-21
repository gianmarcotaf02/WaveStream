package p159s5;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements p020c0.H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p159s5.w f27282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p159s5.AbstractC2743d f27283c;

    public /* synthetic */ g(p159s5.w wVar, p159s5.AbstractC2743d abstractC2743d, int i3) {
        this.f27281a = i3;
        this.f27282b = wVar;
        this.f27283c = abstractC2743d;
    }

    @Override // p020c0.H
    public final void dispose() {
        switch (this.f27281a) {
            case 0:
                p159s5.w wVar = this.f27282b;
                wVar.getClass();
                p159s5.AbstractC2743d item = this.f27283c;
                kotlin.jvm.internal.m.e(item, "item");
                if (!(item instanceof p159s5.C2740a)) {
                    wVar.f27350o.b(item);
                    break;
                }
                break;
            default:
                p159s5.w wVar2 = this.f27282b;
                wVar2.getClass();
                p159s5.AbstractC2743d item2 = this.f27283c;
                kotlin.jvm.internal.m.e(item2, "item");
                if (!(item2 instanceof p159s5.C2740a)) {
                    wVar2.f27353r.b(item2);
                    break;
                }
                break;
        }
    }
}
