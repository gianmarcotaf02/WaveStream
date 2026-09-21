package p005a5;

import S7.C0895k;
import com.revenuecat.purchases.PurchasesError;
import kotlin.jvm.internal.m;
import p070h6.A;
import p194x6.j;

public final class C1249d2 implements j {

    public final int f14347h;

    public final C1379q2 f14348i;
    public final C0895k j;

    public C1249d2(C1379q2 c1379q2, C0895k c0895k, int i3) {
        this.f14347h = i3;
        this.f14348i = c1379q2;
        this.j = c0895k;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f14347h) {
            case 0:
                PurchasesError err = (PurchasesError) obj;
                m.e(err, "err");
                C1379q2.a(this.f14348i, this.j, err);
                break;
            case 1:
                PurchasesError err2 = (PurchasesError) obj;
                m.e(err2, "err");
                C1379q2.a(this.f14348i, this.j, err2);
                break;
            case 2:
                PurchasesError err3 = (PurchasesError) obj;
                m.e(err3, "err");
                C1379q2.a(this.f14348i, this.j, err3);
                break;
            default:
                PurchasesError err4 = (PurchasesError) obj;
                m.e(err4, "err");
                C1379q2.a(this.f14348i, this.j, err4);
                break;
        }
        return A.f22523a;
    }
}
