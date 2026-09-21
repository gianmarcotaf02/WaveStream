package B5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B5.y f778i;
    public final /* synthetic */ com.kiptv.core.model.TMDBPersonCreditEntry j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f779k;

    public /* synthetic */ s(B5.y yVar, com.kiptv.core.model.TMDBPersonCreditEntry tMDBPersonCreditEntry, p194x6.j jVar, int i3) {
        this.f777h = i3;
        this.f778i = yVar;
        this.j = tMDBPersonCreditEntry;
        this.f779k = jVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i3 = this.f777h;
        java.lang.Integer num = (java.lang.Integer) obj;
        num.getClass();
        switch (i3) {
            case 0:
                this.f778i.f809f = com.google.android.gms.internal.play_billing.M0.l(this.j.f20222a, "tv-");
                this.f779k.invoke(num);
                break;
            default:
                this.f778i.f809f = com.google.android.gms.internal.play_billing.M0.l(this.j.f20222a, "m-");
                this.f779k.invoke(num);
                break;
        }
        return p070h6.A.f22523a;
    }
}
