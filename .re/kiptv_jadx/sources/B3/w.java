package B3;

/* JADX INFO: loaded from: classes.dex */
public final class w extends X3.g implements B3.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p059g4.d f674e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i3, p059g4.d dVar) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 3);
        this.f673d = i3;
        this.f674e = dVar;
    }

    @Override // B3.g
    public final void K(android.os.Bundle bundle) {
        switch (this.f673d) {
            case 0:
                this.f674e.b(bundle);
                break;
            case 1:
                this.f674e.b(bundle);
                break;
            default:
                this.f674e.b(bundle);
                break;
        }
    }

    @Override // X3.g
    public final boolean c0(int i3, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.cast.AbstractC1818z.a(parcel, android.os.Bundle.CREATOR);
        com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
        K(bundle);
        return true;
    }
}
