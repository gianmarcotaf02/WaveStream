package p159s5;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f27286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p159s5.w f27287i;
    public final /* synthetic */ java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f27288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p159s5.AbstractC2743d f27289l;

    public /* synthetic */ i(p159s5.w wVar, java.lang.String str, p194x6.j jVar, p159s5.AbstractC2743d abstractC2743d, int i3) {
        this.f27286h = i3;
        this.f27287i = wVar;
        this.j = str;
        this.f27288k = jVar;
        this.f27289l = abstractC2743d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f27286h) {
            case 0:
                this.f27287i.g = this.j;
                this.f27288k.invoke(java.lang.Integer.valueOf(((p159s5.C2741b) this.f27289l).f27272a.f20725d));
                break;
            default:
                this.f27287i.g = this.j;
                this.f27288k.invoke(java.lang.Integer.valueOf(((p159s5.C2742c) this.f27289l).f27273a.f20684c));
                break;
        }
        return p070h6.A.f22523a;
    }
}
