package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class N extends I3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.cast.N> CREATOR = new com.google.android.gms.internal.cast.D(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f18798i;
    public final java.util.ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f18799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f18800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f18801m;

    public N(int i3, boolean z6, java.util.ArrayList arrayList, int i9, java.lang.String str, boolean z9) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
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

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
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
