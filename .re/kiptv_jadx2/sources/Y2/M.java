package Y2;

import android.os.Parcel;
import com.google.android.gms.internal.play_billing.J1;

public final class M extends X3.g {

    public final J1 f11390d;

    public M(J1 j9) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 4);
        this.f11390d = j9;
    }

    @Override
    public final boolean X(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        int i9 = parcel.readInt();
        X3.g.a0(parcel);
        this.f11390d.a(Integer.valueOf(i9));
        return true;
    }
}
