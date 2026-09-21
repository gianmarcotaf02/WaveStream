package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new p(3);

    public int f15569h;

    public int f15570i;
    public int j;

    public int f15571k;

    public int f15572l;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f15569h);
        parcel.writeInt(this.j);
        parcel.writeInt(this.f15571k);
        parcel.writeInt(this.f15572l);
        parcel.writeInt(this.f15570i);
    }
}
