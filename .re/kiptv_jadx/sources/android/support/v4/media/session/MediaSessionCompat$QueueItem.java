package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat$QueueItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> CREATOR = new android.support.v4.media.session.p(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.support.v4.media.MediaDescriptionCompat f15563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f15564i;

    public MediaSessionCompat$QueueItem(android.os.Parcel parcel) {
        this.f15563h = android.support.v4.media.MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f15564i = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.f15563h);
        sb.append(", Id=");
        return Y6.f.g(this.f15564i, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        this.f15563h.writeToParcel(parcel, i3);
        parcel.writeLong(this.f15564i);
    }
}
