package Y1;

/* JADX INFO: renamed from: Y1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1018c implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<Y1.C1018c> CREATOR = new T3.G(19);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f11259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f11260i;

    public C1018c(android.os.Parcel parcel) {
        this.f11259h = parcel.createStringArrayList();
        this.f11260i = parcel.createTypedArrayList(Y1.C1017b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeStringList(this.f11259h);
        parcel.writeTypedList(this.f11260i);
    }
}
