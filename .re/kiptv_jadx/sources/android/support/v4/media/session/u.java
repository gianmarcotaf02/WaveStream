package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public final class u implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new android.support.v4.media.session.PlaybackStateCompat.CustomAction(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i3) {
        return new android.support.v4.media.session.PlaybackStateCompat.CustomAction[i3];
    }
}
