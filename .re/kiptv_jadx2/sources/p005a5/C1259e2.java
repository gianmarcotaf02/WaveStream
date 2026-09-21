package p005a5;

import S7.C0895k;
import com.revenuecat.purchases.CustomerInfo;
import p070h6.A;
import p194x6.m;

public final class C1259e2 implements m {

    public final int f14390h;

    public final C0895k f14391i;

    public C1259e2(C0895k c0895k, int i3) {
        this.f14390h = i3;
        this.f14391i = c0895k;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14390h) {
            case 0:
                CustomerInfo info = (CustomerInfo) obj;
                ((Boolean) obj2).getClass();
                kotlin.jvm.internal.m.e(info, "info");
                this.f14391i.resumeWith(info);
                break;
            default:
                CustomerInfo info2 = (CustomerInfo) obj2;
                kotlin.jvm.internal.m.e(info2, "info");
                this.f14391i.resumeWith(info2);
                break;
        }
        return A.f22523a;
    }
}
