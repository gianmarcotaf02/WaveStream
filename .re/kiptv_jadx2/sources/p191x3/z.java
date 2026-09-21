package p191x3;

import E6.G;
import I3.a;
import android.os.Parcel;
import android.os.Parcelable;
import p184w3.D;

public final class z extends a {
    public static final Parcelable.Creator<z> CREATOR = new D(17);

    public final boolean f31208h;

    public z(boolean z6) {
        this.f31208h = z6;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.e0(parcel, 2, 4);
        parcel.writeInt(this.f31208h ? 1 : 0);
        G.g0(parcel, iF0);
    }
}
