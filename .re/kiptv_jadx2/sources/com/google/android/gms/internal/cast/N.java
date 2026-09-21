package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class N extends I3.a {
    public static final Parcelable.Creator<N> CREATOR = new D(4);

    public final int f18797h;

    public final boolean f18798i;
    public final ArrayList j;

    public final int f18799k;

    public final String f18800l;

    public final boolean f18801m;

    public N(int i3, boolean z6, ArrayList arrayList, int i9, String str, boolean z9) {
        ArrayList arrayList2 = new ArrayList();
        this.j = arrayList2;
        this.f18797h = i3;
        this.f18798i = z6;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.f18799k = i9;
        this.f18800l = str;
        this.f18801m = z9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.e0(parcel, 2, 4);
        parcel.writeInt(this.f18797h);
        E6.G.e0(parcel, 3, 4);
        parcel.writeInt(this.f18798i ? 1 : 0);
        E6.G.a0(parcel, this.j, 4);
        E6.G.e0(parcel, 5, 4);
        parcel.writeInt(this.f18799k);
        E6.G.Z(parcel, 6, this.f18800l);
        E6.G.e0(parcel, 7, 4);
        parcel.writeInt(this.f18801m ? 1 : 0);
        E6.G.g0(parcel, iF0);
    }
}
