package android.support.v4.media;

/* JADX INFO: loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.MediaBrowserCompat$MediaItem> CREATOR = new T3.G(23);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.support.v4.media.MediaDescriptionCompat f15549i;

    public MediaBrowserCompat$MediaItem(android.os.Parcel parcel) {
        this.f15548h = parcel.readInt();
        this.f15549i = android.support.v4.media.MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return "MediaItem{mFlags=" + this.f15548h + ", mDescription=" + this.f15549i + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeInt(this.f15548h);
        this.f15549i.writeToParcel(parcel, i3);
    }
}
