package android.support.v4.media;

import T3.G;
import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new G(23);

    public final int f15548h;

    public final MediaDescriptionCompat f15549i;

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f15548h = parcel.readInt();
        this.f15549i = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f15548h + ", mDescription=" + this.f15549i + '}';
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f15548h);
        this.f15549i.writeToParcel(parcel, i3);
    }
}
