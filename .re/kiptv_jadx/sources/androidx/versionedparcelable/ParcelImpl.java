package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = new B3.e(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2.d f17525h;

    public ParcelImpl(C2.d dVar) {
        this.f17525h = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        new C2.c(parcel).l(this.f17525h);
    }

    public ParcelImpl(android.os.Parcel parcel) {
        this.f17525h = new C2.c(parcel).h();
    }
}
