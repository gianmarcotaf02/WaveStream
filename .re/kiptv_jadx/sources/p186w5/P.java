package p186w5;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f30125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p186w5.W f30126i;
    public final /* synthetic */ java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f30127k;

    public /* synthetic */ P(p186w5.W w6, java.lang.String str, p194x6.j jVar, int i3) {
        this.f30125h = i3;
        this.f30126i = w6;
        this.j = str;
        this.f30127k = jVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f30125h) {
            case 0:
                int iIntValue = ((java.lang.Number) obj).intValue();
                this.f30126i.f30168e = this.j;
                this.f30127k.invoke(java.lang.Integer.valueOf(iIntValue));
                break;
            default:
                int iIntValue2 = ((java.lang.Number) obj).intValue();
                this.f30126i.f30168e = this.j;
                this.f30127k.invoke(java.lang.Integer.valueOf(iIntValue2));
                break;
        }
        return p070h6.A.f22523a;
    }
}
