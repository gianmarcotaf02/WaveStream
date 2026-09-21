package android.support.v4.media;

/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadataCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.MediaMetadataCompat> CREATOR;
    public static final p136q.C2661e j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.os.Bundle f15558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public android.media.MediaMetadata f15559i;

    static {
        p136q.C2661e c2661e = new p136q.C2661e(0);
        j = c2661e;
        Y6.f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_TITLE, 1, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ARTIST);
        Y6.f.r(0, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DURATION, 1, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ALBUM);
        Y6.f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_AUTHOR, 1, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_WRITER);
        Y6.f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_COMPOSER, 1, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_COMPILATION);
        Y6.f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DATE, 0, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_YEAR);
        Y6.f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_GENRE, 0, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER);
        Y6.f.r(0, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, 0, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISC_NUMBER);
        Y6.f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, 2, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ART);
        Y6.f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ART_URI, 2, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ALBUM_ART);
        Y6.f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, 3, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_USER_RATING);
        Y6.f.r(3, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_RATING, 1, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
        Y6.f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, 1, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION);
        Y6.f.r(2, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, 1, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI);
        Y6.f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_MEDIA_ID, 0, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE);
        Y6.f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_MEDIA_URI, 0, "android.media.metadata.ADVERTISEMENT");
        c2661e.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DOWNLOAD_STATUS, 0);
        CREATOR = new T3.G(25);
    }

    public MediaMetadataCompat(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        this.f15558h = bundle2;
        android.support.v4.media.session.q.p(bundle2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeBundle(this.f15558h);
    }

    public MediaMetadataCompat(android.os.Parcel parcel) {
        this.f15558h = parcel.readBundle(android.support.v4.media.session.q.class.getClassLoader());
    }
}
