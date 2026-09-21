package H3;

/* JADX INFO: renamed from: H3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0377f extends I3.a {
    public static final android.os.Parcelable.Creator<H3.C0377f> CREATOR = new B3.e(11);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3965i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f3966k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f3967l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f3968m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f3969n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3970o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f3971p;

    public C0377f(int i3, int i9, int i10, long j, long j9, java.lang.String str, java.lang.String str2, int i11, int i12) {
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

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.e0(parcel, 1, 4);
        parcel.writeInt(this.f3964h);
        E6.G.e0(parcel, 2, 4);
        parcel.writeInt(this.f3965i);
        E6.G.e0(parcel, 3, 4);
        parcel.writeInt(this.j);
        E6.G.e0(parcel, 4, 8);
        parcel.writeLong(this.f3966k);
        E6.G.e0(parcel, 5, 8);
        parcel.writeLong(this.f3967l);
        E6.G.Z(parcel, 6, this.f3968m);
        E6.G.Z(parcel, 7, this.f3969n);
        E6.G.e0(parcel, 8, 4);
        parcel.writeInt(this.f3970o);
        E6.G.e0(parcel, 9, 4);
        parcel.writeInt(this.f3971p);
        E6.G.g0(parcel, iF0);
    }
}
