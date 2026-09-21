package Y2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.play_billing.AbstractC1831d;
import com.google.android.gms.internal.play_billing.AbstractC1872t;
import com.google.android.gms.internal.play_billing.o1;
import org.json.JSONException;

public final class I extends X3.g {

    public final com.revenuecat.purchases.google.usecase.b f11381d;

    public final S2.a f11382e;

    public final int f11383f;

    public I(com.revenuecat.purchases.google.usecase.b bVar, S2.a aVar, int i3) {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback", 4);
        this.f11381d = bVar;
        this.f11382e = aVar;
        this.f11383f = i3;
    }

    @Override
    public final boolean X(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) AbstractC1831d.a(parcel);
        X3.g.a0(parcel);
        o1 o1Var = o1.BROADCAST_ACTION_UNSPECIFIED;
        int i9 = this.f11383f;
        S2.a aVar = this.f11382e;
        com.revenuecat.purchases.google.usecase.b bVar = this.f11381d;
        if (bundle == null) {
            C1040j c1040j = S.f11409h;
            aVar.U(P.b(63, 13, c1040j, null, o1Var), i9);
            bVar.a(c1040j, null);
        } else {
            int iA = AbstractC1872t.a("BillingClient", bundle);
            String strF = AbstractC1872t.f("BillingClient", bundle);
            D8.x xVarA = C1040j.a();
            xVarA.f2609i = iA;
            xVarA.f2610k = strF;
            if (iA != 0) {
                AbstractC1872t.h("BillingClient", "getBillingConfig() failed. Response code: " + iA);
                C1040j c1040jP = xVarA.p();
                aVar.U(P.b(23, 13, c1040jP, null, o1Var), i9);
                bVar.a(c1040jP, null);
            } else if (bundle.containsKey("BILLING_CONFIG")) {
                try {
                    bVar.a(xVarA.p(), new C1035e(bundle.getString("BILLING_CONFIG")));
                } catch (JSONException e6) {
                    AbstractC1872t.i("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e6);
                    C1040j c1040j2 = S.f11409h;
                    aVar.U(P.b(65, 13, c1040j2, null, o1Var), i9);
                    bVar.a(c1040j2, null);
                }
            } else {
                AbstractC1872t.h("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                xVarA.f2609i = 6;
                C1040j c1040jP2 = xVarA.p();
                aVar.U(P.b(64, 13, c1040jP2, null, o1Var), i9);
                bVar.a(c1040jP2, null);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
