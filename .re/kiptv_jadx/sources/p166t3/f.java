package p166t3;

/* JADX INFO: loaded from: classes.dex */
public final class f extends X3.g implements p166t3.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p166t3.g f27779e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p166t3.g gVar, int i3) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 0);
        this.f27778d = i3;
        this.f27779e = gVar;
    }

    @Override // p166t3.j
    public void A(com.google.android.gms.common.api.Status status) {
        switch (this.f27778d) {
            case 1:
                this.f27779e.n0(status);
                return;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // p166t3.j
    public void G(com.google.android.gms.common.api.Status status) {
        switch (this.f27778d) {
            case 0:
                this.f27779e.n0(status);
                return;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // X3.g
    public final boolean b0(int i3, android.os.Parcel parcel, android.os.Parcel parcel2) {
        switch (i3) {
            case 101:
                X3.h.b(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 102:
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) X3.h.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                X3.h.b(parcel);
                G(status);
                break;
            case 103:
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) X3.h.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                X3.h.b(parcel);
                A(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
