package p193x5;

/* JADX INFO: loaded from: classes4.dex */
public final class O implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f31346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p194x6.m f31347i;
    public final /* synthetic */ S4.p j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p193x5.C3113e f31348k;

    public /* synthetic */ O(p194x6.m mVar, S4.p pVar, p193x5.C3113e c3113e, int i3) {
        this.f31346h = i3;
        this.f31347i = mVar;
        this.j = pVar;
        this.f31348k = c3113e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f31346h) {
            case 0:
                this.f31347i.invoke(this.j, this.f31348k.f31449c);
                break;
            default:
                this.f31347i.invoke(this.j, this.f31348k);
                break;
        }
        return p070h6.A.f22523a;
    }
}
