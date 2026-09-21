package p191x3;

import E6.G;
import I3.a;
import android.os.Parcel;
import android.os.Parcelable;
import p184w3.D;

public final class A extends a {
    public static final Parcelable.Creator<A> CREATOR = new D(18);

    public final int f31150h;

    public A(int i3) {
        this.f31150h = i3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.e0(parcel, 2, 4);
        parcel.writeInt(this.f31150h);
        G.g0(parcel, iF0);
    }
}
