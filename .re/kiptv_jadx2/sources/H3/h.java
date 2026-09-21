package H3;

import E6.G;
import android.os.Parcel;
import android.os.Parcelable;

public final class h extends I3.a {
    public static final Parcelable.Creator<h> CREATOR = new B3.e(14);

    public final int f3975h;

    public final boolean f3976i;
    public final boolean j;

    public final int f3977k;

    public final int f3978l;

    public h(int i3, int i9, int i10, boolean z6, boolean z9) {
        this.f3975h = i3;
        this.f3976i = z6;
        this.j = z9;
        this.f3977k = i9;
        this.f3978l = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.e0(parcel, 1, 4);
        parcel.writeInt(this.f3975h);
        G.e0(parcel, 2, 4);
        parcel.writeInt(this.f3976i ? 1 : 0);
        G.e0(parcel, 3, 4);
        parcel.writeInt(this.j ? 1 : 0);
        G.e0(parcel, 4, 4);
        parcel.writeInt(this.f3977k);
        G.e0(parcel, 5, 4);
        parcel.writeInt(this.f3978l);
        G.g0(parcel, iF0);
    }
}
