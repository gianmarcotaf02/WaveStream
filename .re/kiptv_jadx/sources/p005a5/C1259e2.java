package p005a5;

/* JADX INFO: renamed from: a5.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1259e2 implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S7.C0895k f14391i;

    public /* synthetic */ C1259e2(S7.C0895k c0895k, int i3) {
        this.f14390h = i3;
        this.f14391i = c0895k;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f14390h) {
            case 0:
                com.revenuecat.purchases.CustomerInfo info = (com.revenuecat.purchases.CustomerInfo) obj;
                ((java.lang.Boolean) obj2).getClass();
                kotlin.jvm.internal.m.e(info, "info");
                this.f14391i.resumeWith(info);
                break;
            default:
                com.revenuecat.purchases.CustomerInfo info2 = (com.revenuecat.purchases.CustomerInfo) obj2;
                kotlin.jvm.internal.m.e(info2, "info");
                this.f14391i.resumeWith(info2);
                break;
        }
        return p070h6.A.f22523a;
    }
}
