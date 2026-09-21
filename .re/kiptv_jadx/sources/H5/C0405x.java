package H5;

/* JADX INFO: renamed from: H5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0405x implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H5.K f4330i;
    public final /* synthetic */ java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f4331k;

    public /* synthetic */ C0405x(H5.K k9, java.lang.String str, p194x6.j jVar, int i3) {
        this.f4329h = i3;
        this.f4330i = k9;
        this.j = str;
        this.f4331k = jVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f4329h) {
            case 0:
                int iIntValue = ((java.lang.Number) obj).intValue();
                this.f4330i.f4100f = this.j;
                this.f4331k.invoke(java.lang.Integer.valueOf(iIntValue));
                break;
            default:
                int iIntValue2 = ((java.lang.Number) obj).intValue();
                this.f4330i.f4100f = this.j;
                this.f4331k.invoke(java.lang.Integer.valueOf(iIntValue2));
                break;
        }
        return p070h6.A.f22523a;
    }
}
