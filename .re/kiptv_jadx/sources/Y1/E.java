package Y1;

/* JADX INFO: loaded from: classes.dex */
public final class E implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<Y1.E> CREATOR = new T3.G(21);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f11189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f11190i;
    public Y1.C1017b[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11191k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.String f11192l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f11193m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f11194n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f11195o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeStringList(this.f11189h);
        parcel.writeStringList(this.f11190i);
        parcel.writeTypedArray(this.j, i3);
        parcel.writeInt(this.f11191k);
        parcel.writeString(this.f11192l);
        parcel.writeStringList(this.f11193m);
        parcel.writeTypedList(this.f11194n);
        parcel.writeTypedList(this.f11195o);
    }
}
