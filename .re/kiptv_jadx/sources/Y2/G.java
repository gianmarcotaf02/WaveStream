package Y2;

/* JADX INFO: loaded from: classes.dex */
public final class G extends android.os.ResultReceiver {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.revenuecat.purchases.google.c f11377h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Y2.C1033c c1033c, android.os.Handler handler, com.revenuecat.purchases.google.c cVar) {
        super(handler);
        this.f11377h = cVar;
        java.util.Objects.requireNonNull(c1033c);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i3, android.os.Bundle bundle) {
        Y2.C1042l c1042l;
        int i9 = com.google.android.gms.internal.play_billing.AbstractC1872t.f19388a;
        if (bundle == null) {
            c1042l = new Y2.C1042l(0);
        } else {
            int i10 = bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
            bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
            c1042l = new Y2.C1042l(i10);
        }
        this.f11377h.a(c1042l);
    }
}
