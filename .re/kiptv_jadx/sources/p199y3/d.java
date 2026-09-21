package p199y3;

/* JADX INFO: loaded from: classes.dex */
public final class d extends I3.a {
    public static final android.os.Parcelable.Creator<p199y3.d> CREATOR = new p184w3.D(22);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f31818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f31819i;
    public final java.lang.String j;

    public d(java.lang.String str, int i3, java.lang.String str2) {
        this.f31818h = str;
        this.f31819i = i3;
        this.j = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.Z(parcel, 2, this.f31818h);
        E6.G.e0(parcel, 3, 4);
        parcel.writeInt(this.f31819i);
        E6.G.Z(parcel, 4, this.j);
        E6.G.g0(parcel, iF0);
    }
}
