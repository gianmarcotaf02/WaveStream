package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
final class MediaSessionCompat$ResultReceiverWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper> CREATOR = new android.support.v4.media.session.p(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.os.ResultReceiver f15565h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        this.f15565h.writeToParcel(parcel, i3);
    }
}
