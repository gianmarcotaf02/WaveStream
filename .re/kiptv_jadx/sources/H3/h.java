package H3;

/* JADX INFO: loaded from: classes.dex */
public final class h extends I3.a {
    public static final android.os.Parcelable.Creator<H3.h> CREATOR = new B3.e(14);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3976i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f3977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3978l;

    public h(int i3, int i9, int i10, boolean z6, boolean z9) {
        this.f3975h = i3;
        this.f3976i = z6;
        this.j = z9;
        this.f3977k = i9;
        this.f3978l = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.e0(parcel, 1, 4);
        parcel.writeInt(this.f3975h);
        E6.G.e0(parcel, 2, 4);
        parcel.writeInt(this.f3976i ? 1 : 0);
        E6.G.e0(parcel, 3, 4);
        parcel.writeInt(this.j ? 1 : 0);
        E6.G.e0(parcel, 4, 4);
        parcel.writeInt(this.f3977k);
        E6.G.e0(parcel, 5, 4);
        parcel.writeInt(this.f3978l);
        E6.G.g0(parcel, iF0);
    }
}
