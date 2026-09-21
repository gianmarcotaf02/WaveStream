package Y2;

/* JADX INFO: loaded from: classes.dex */
public final class N implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y2.O f11391h;

    public /* synthetic */ N(Y2.O o8) {
        java.util.Objects.requireNonNull(o8);
        this.f11391h = o8;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.google.android.gms.internal.play_billing.InterfaceC1840g c1834e;
        com.google.android.gms.internal.play_billing.AbstractC1872t.g("BillingClientTesting", "Billing Override Service connected.");
        Y2.O o8 = this.f11391h;
        int i3 = com.google.android.gms.internal.play_billing.AbstractBinderC1837f.f19322d;
        if (iBinder == null) {
            c1834e = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
            c1834e = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.InterfaceC1840g ? (com.google.android.gms.internal.play_billing.InterfaceC1840g) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.C1834e(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 4);
        }
        o8.f11393J = c1834e;
        o8.f11392I = 2;
        o8.S(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClientTesting", "Billing Override Service disconnected.");
        Y2.O o8 = this.f11391h;
        o8.f11393J = null;
        o8.f11392I = 0;
    }
}
