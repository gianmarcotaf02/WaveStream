package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public final class p implements android.os.Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15613a;

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.f15613a) {
            case 0:
                android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f15565h = (android.os.ResultReceiver) android.os.ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 1:
                return new android.support.v4.media.session.MediaSessionCompat$QueueItem(parcel);
            case 2:
                return new android.support.v4.media.session.MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 3:
                android.support.v4.media.session.ParcelableVolumeInfo parcelableVolumeInfo = new android.support.v4.media.session.ParcelableVolumeInfo();
                parcelableVolumeInfo.f15569h = parcel.readInt();
                parcelableVolumeInfo.j = parcel.readInt();
                parcelableVolumeInfo.f15571k = parcel.readInt();
                parcelableVolumeInfo.f15572l = parcel.readInt();
                parcelableVolumeInfo.f15570i = parcel.readInt();
                return parcelableVolumeInfo;
            default:
                return new android.support.v4.media.session.PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i3) {
        switch (this.f15613a) {
            case 0:
                return new android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper[i3];
            case 1:
                return new android.support.v4.media.session.MediaSessionCompat$QueueItem[i3];
            case 2:
                return new android.support.v4.media.session.MediaSessionCompat$Token[i3];
            case 3:
                return new android.support.v4.media.session.ParcelableVolumeInfo[i3];
            default:
                return new android.support.v4.media.session.PlaybackStateCompat[i3];
        }
    }
}
