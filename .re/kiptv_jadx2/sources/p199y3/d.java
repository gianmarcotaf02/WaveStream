package p199y3;

import E6.G;
import I3.a;
import android.os.Parcel;
import android.os.Parcelable;
import p184w3.D;

public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new D(22);

    public final String f31818h;

    public final int f31819i;
    public final String j;

    public d(String str, int i3, String str2) {
        this.f31818h = str;
        this.f31819i = i3;
        this.j = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.Z(parcel, 2, this.f31818h);
        G.e0(parcel, 3, 4);
        parcel.writeInt(this.f31819i);
        G.Z(parcel, 4, this.j);
        G.g0(parcel, iF0);
    }
}
