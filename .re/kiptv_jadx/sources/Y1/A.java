package Y1;

/* JADX INFO: loaded from: classes.dex */
public final class A implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<Y1.A> CREATOR = new T3.G(20);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.String f11150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11151i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeString(this.f11150h);
        parcel.writeInt(this.f11151i);
    }
}
