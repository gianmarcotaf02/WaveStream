package I5;

/* JADX INFO: renamed from: I5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0460g implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S4.C0871j f5115i;
    public final /* synthetic */ p194x6.j j;

    public /* synthetic */ C0460g(S4.C0871j c0871j, p194x6.j jVar, int i3) {
        this.f5114h = i3;
        this.f5115i = c0871j;
        this.j = jVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        switch (this.f5114h) {
            case 0:
                int iIntValue = num.intValue();
                S4.C0871j c0871j = this.f5115i;
                if (c0871j == null || iIntValue != c0871j.f9401a) {
                    this.j.invoke(num);
                }
                break;
            default:
                int iIntValue2 = num.intValue();
                S4.C0871j c0871j2 = this.f5115i;
                if (c0871j2 == null || iIntValue2 != c0871j2.f9401a) {
                    this.j.invoke(num);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
