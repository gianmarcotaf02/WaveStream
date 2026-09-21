package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1638u implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.C1638u> CREATOR = new T3.G(28);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17518i;
    public boolean j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeInt(this.f17517h);
        parcel.writeInt(this.f17518i);
        parcel.writeInt(this.j ? 1 : 0);
    }
}
