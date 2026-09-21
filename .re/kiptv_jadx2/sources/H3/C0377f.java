package H3;

import E6.G;
import android.os.Parcel;
import android.os.Parcelable;

public final class C0377f extends I3.a {
    public static final Parcelable.Creator<C0377f> CREATOR = new B3.e(11);

    public final int f3964h;

    public final int f3965i;
    public final int j;

    public final long f3966k;

    public final long f3967l;

    public final String f3968m;

    public final String f3969n;

    public final int f3970o;

    public final int f3971p;

    public C0377f(int i3, int i9, int i10, long j, long j9, String str, String str2, int i11, int i12) {
        this.f3964h = i3;
        this.f3965i = i9;
        this.j = i10;
        this.f3966k = j;
        this.f3967l = j9;
        this.f3968m = str;
        this.f3969n = str2;
        this.f3970o = i11;
        this.f3971p = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.e0(parcel, 1, 4);
        parcel.writeInt(this.f3964h);
        G.e0(parcel, 2, 4);
        parcel.writeInt(this.f3965i);
        G.e0(parcel, 3, 4);
        parcel.writeInt(this.j);
        G.e0(parcel, 4, 8);
        parcel.writeLong(this.f3966k);
        G.e0(parcel, 5, 8);
        parcel.writeLong(this.f3967l);
        G.Z(parcel, 6, this.f3968m);
        G.Z(parcel, 7, this.f3969n);
        G.e0(parcel, 8, 4);
        parcel.writeInt(this.f3970o);
        G.e0(parcel, 9, 4);
        parcel.writeInt(this.f3971p);
        G.g0(parcel, iF0);
    }
}
