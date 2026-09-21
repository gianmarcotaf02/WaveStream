package p166t3;

import X3.g;
import X3.h;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class f extends g implements j {

    public final int f27778d;

    public final g f27779e;

    public f(g gVar, int i3) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 0);
        this.f27778d = i3;
        this.f27779e = gVar;
    }

    @Override
    public void A(Status status) {
        switch (this.f27778d) {
            case 1:
                this.f27779e.n0(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void G(Status status) {
        switch (this.f27778d) {
            case 0:
                this.f27779e.n0(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final boolean b0(int i3, Parcel parcel, Parcel parcel2) {
        switch (i3) {
            case 101:
                h.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) h.a(parcel, Status.CREATOR);
                h.b(parcel);
                G(status);
                break;
            case 103:
                Status status2 = (Status) h.a(parcel, Status.CREATOR);
                h.b(parcel);
                A(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
