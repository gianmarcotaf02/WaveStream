package p005a5;

/* JADX INFO: renamed from: a5.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1249d2 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1379q2 f14348i;
    public final /* synthetic */ S7.C0895k j;

    public /* synthetic */ C1249d2(p005a5.C1379q2 c1379q2, S7.C0895k c0895k, int i3) {
        this.f14347h = i3;
        this.f14348i = c1379q2;
        this.j = c0895k;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f14347h) {
            case 0:
                com.revenuecat.purchases.PurchasesError err = (com.revenuecat.purchases.PurchasesError) obj;
                kotlin.jvm.internal.m.e(err, "err");
                p005a5.C1379q2.a(this.f14348i, this.j, err);
                break;
            case 1:
                com.revenuecat.purchases.PurchasesError err2 = (com.revenuecat.purchases.PurchasesError) obj;
                kotlin.jvm.internal.m.e(err2, "err");
                p005a5.C1379q2.a(this.f14348i, this.j, err2);
                break;
            case 2:
                com.revenuecat.purchases.PurchasesError err3 = (com.revenuecat.purchases.PurchasesError) obj;
                kotlin.jvm.internal.m.e(err3, "err");
                p005a5.C1379q2.a(this.f14348i, this.j, err3);
                break;
            default:
                com.revenuecat.purchases.PurchasesError err4 = (com.revenuecat.purchases.PurchasesError) obj;
                kotlin.jvm.internal.m.e(err4, "err");
                p005a5.C1379q2.a(this.f14348i, this.j, err4);
                break;
        }
        return p070h6.A.f22523a;
    }
}
