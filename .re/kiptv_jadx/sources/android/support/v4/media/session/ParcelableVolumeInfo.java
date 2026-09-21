package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.ParcelableVolumeInfo> CREATOR = new android.support.v4.media.session.p(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15570i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15572l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeInt(this.f15569h);
        parcel.writeInt(this.j);
        parcel.writeInt(this.f15571k);
        parcel.writeInt(this.f15572l);
        parcel.writeInt(this.f15570i);
    }
}
