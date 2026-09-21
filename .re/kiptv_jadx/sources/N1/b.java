package N1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements android.os.Parcelable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.os.Parcelable f7299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final N1.a f7298i = new N1.a();
    public static final android.os.Parcelable.Creator<N1.b> CREATOR = new p121o0.m(1);

    public b() {
        this.f7299h = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeParcelable(this.f7299h, i3);
    }

    public b(android.os.Parcelable parcelable) {
        if (parcelable != null) {
            this.f7299h = parcelable == f7298i ? null : parcelable;
            return;
        }
        throw new java.lang.IllegalArgumentException("superState must not be null");
    }

    public b(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        android.os.Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f7299h = parcelable == null ? f7298i : parcelable;
    }
}
