package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new p(1);

    public final MediaDescriptionCompat f15563h;

    public final long f15564i;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f15563h = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f15564i = parcel.readLong();
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.f15563h);
        sb.append(", Id=");
        return Y6.f.g(this.f15564i, " }", sb);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        this.f15563h.writeToParcel(parcel, i3);
        parcel.writeLong(this.f15564i);
    }
}
