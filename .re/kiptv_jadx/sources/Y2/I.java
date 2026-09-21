package Y2;

/* JADX INFO: loaded from: classes.dex */
public final class I extends X3.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.revenuecat.purchases.google.usecase.b f11381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S2.a f11382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11383f;

    public I(com.revenuecat.purchases.google.usecase.b bVar, S2.a aVar, int i3) {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback", 4);
        this.f11381d = bVar;
        this.f11382e = aVar;
        this.f11383f = i3;
    }

    @Override // X3.g
    public final boolean X(int i3, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        android.os.Parcelable.Creator creator = android.os.Bundle.CREATOR;
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.play_billing.AbstractC1831d.a(parcel);
        X3.g.a0(parcel);
        com.google.android.gms.internal.play_billing.o1 o1Var = com.google.android.gms.internal.play_billing.o1.BROADCAST_ACTION_UNSPECIFIED;
        int i9 = this.f11383f;
        S2.a aVar = this.f11382e;
        com.revenuecat.purchases.google.usecase.b bVar = this.f11381d;
        if (bundle == null) {
            Y2.C1040j c1040j = Y2.S.f11409h;
            aVar.U(Y2.P.b(63, 13, c1040j, null, o1Var), i9);
            bVar.a(c1040j, null);
        } else {
            int iA = com.google.android.gms.internal.play_billing.AbstractC1872t.a("BillingClient", bundle);
            java.lang.String strF = com.google.android.gms.internal.play_billing.AbstractC1872t.f("BillingClient", bundle);
            D8.x xVarA = Y2.C1040j.a();
            xVarA.f2609i = iA;
            xVarA.f2610k = strF;
            if (iA != 0) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "getBillingConfig() failed. Response code: " + iA);
                Y2.C1040j c1040jP = xVarA.p();
                aVar.U(Y2.P.b(23, 13, c1040jP, null, o1Var), i9);
                bVar.a(c1040jP, null);
            } else if (bundle.containsKey("BILLING_CONFIG")) {
                try {
                    bVar.a(xVarA.p(), new Y2.C1035e(bundle.getString("BILLING_CONFIG")));
                } catch (org.json.JSONException e6) {
                    com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e6);
                    Y2.C1040j c1040j2 = Y2.S.f11409h;
                    aVar.U(Y2.P.b(65, 13, c1040j2, null, o1Var), i9);
                    bVar.a(c1040j2, null);
                }
            } else {
                com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                xVarA.f2609i = 6;
                Y2.C1040j c1040jP2 = xVarA.p();
                aVar.U(Y2.P.b(64, 13, c1040jP2, null, o1Var), i9);
                bVar.a(c1040jP2, null);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
