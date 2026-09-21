package Y2;

/* JADX INFO: loaded from: classes.dex */
public final class M extends X3.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.J1 f11390d;

    public M(com.google.android.gms.internal.play_billing.J1 j9) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 4);
        this.f11390d = j9;
    }

    @Override // X3.g
    public final boolean X(int i3, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        int i9 = parcel.readInt();
        X3.g.a0(parcel);
        this.f11390d.a(java.lang.Integer.valueOf(i9));
        return true;
    }
}
