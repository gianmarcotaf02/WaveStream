package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

public final class p implements Parcelable.Creator {

    public final int f15613a;

    public p(int i3) {
        this.f15613a = i3;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f15613a) {
            case 0:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f15565h = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 1:
                return new MediaSessionCompat$QueueItem(parcel);
            case 2:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 3:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f15569h = parcel.readInt();
                parcelableVolumeInfo.j = parcel.readInt();
                parcelableVolumeInfo.f15571k = parcel.readInt();
                parcelableVolumeInfo.f15572l = parcel.readInt();
                parcelableVolumeInfo.f15570i = parcel.readInt();
                return parcelableVolumeInfo;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override
    public final Object[] newArray(int i3) {
        switch (this.f15613a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i3];
            case 1:
                return new MediaSessionCompat$QueueItem[i3];
            case 2:
                return new MediaSessionCompat$Token[i3];
            case 3:
                return new ParcelableVolumeInfo[i3];
            default:
                return new PlaybackStateCompat[i3];
        }
    }
}
