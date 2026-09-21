package U7;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S7.C0895k f10229i;

    public /* synthetic */ y(S7.C0895k c0895k, int i3) {
        this.f10228h = i3;
        this.f10229i = c0895k;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f10228h) {
            case 0:
                p070h6.A a2 = p070h6.A.f22523a;
                this.f10229i.resumeWith(a2);
                return a2;
            case 1:
                com.revenuecat.purchases.CustomerInfo info = (com.revenuecat.purchases.CustomerInfo) obj;
                kotlin.jvm.internal.m.e(info, "info");
                this.f10229i.resumeWith(info);
                return p070h6.A.f22523a;
            case 2:
                com.revenuecat.purchases.Offerings offerings = (com.revenuecat.purchases.Offerings) obj;
                kotlin.jvm.internal.m.e(offerings, "offerings");
                com.revenuecat.purchases.Offering current = offerings.getCurrent();
                java.util.List<com.revenuecat.purchases.Package> availablePackages = current != null ? current.getAvailablePackages() : null;
                if (availablePackages == null) {
                    availablePackages = p078i6.w.f23205h;
                }
                this.f10229i.resumeWith(availablePackages);
                return p070h6.A.f22523a;
            default:
                com.revenuecat.purchases.CustomerInfo info2 = (com.revenuecat.purchases.CustomerInfo) obj;
                kotlin.jvm.internal.m.e(info2, "info");
                this.f10229i.resumeWith(info2);
                return p070h6.A.f22523a;
        }
    }
}
