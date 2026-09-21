package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public final class u implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        return new PlaybackStateCompat.CustomAction(parcel);
    }

    @Override
    public final Object[] newArray(int i3) {
        return new PlaybackStateCompat.CustomAction[i3];
    }
}
