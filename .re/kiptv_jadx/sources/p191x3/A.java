package p191x3;

/* JADX INFO: loaded from: classes.dex */
public final class A extends I3.a {
    public static final android.os.Parcelable.Creator<p191x3.A> CREATOR = new p184w3.D(18);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f31150h;

    public A(int i3) {
        this.f31150h = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.e0(parcel, 2, 4);
        parcel.writeInt(this.f31150h);
        E6.G.g0(parcel, iF0);
    }
}
