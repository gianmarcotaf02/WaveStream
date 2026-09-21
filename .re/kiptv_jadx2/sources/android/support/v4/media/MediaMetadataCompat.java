package android.support.v4.media;

import T3.G;
import Y6.f;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.q;
import p136q.C2661e;

public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final C2661e j;

    public final Bundle f15558h;

    public MediaMetadata f15559i;

    static {
        C2661e c2661e = new C2661e(0);
        j = c2661e;
        f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_TITLE, 1, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ARTIST);
        f.r(0, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DURATION, 1, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ALBUM);
        f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_AUTHOR, 1, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_WRITER);
        f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_COMPOSER, 1, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_COMPILATION);
        f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DATE, 0, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_YEAR);
        f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_GENRE, 0, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER);
        f.r(0, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, 0, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISC_NUMBER);
        f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, 2, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ART);
        f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ART_URI, 2, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ALBUM_ART);
        f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, 3, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_USER_RATING);
        f.r(3, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_RATING, 1, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
        f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, 1, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION);
        f.r(2, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, 1, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI);
        f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_MEDIA_ID, 0, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE);
        f.r(1, c2661e, androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_MEDIA_URI, 0, "android.media.metadata.ADVERTISEMENT");
        c2661e.put(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DOWNLOAD_STATUS, 0);
        CREATOR = new G(25);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f15558h = bundle2;
        q.p(bundle2);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeBundle(this.f15558h);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f15558h = parcel.readBundle(q.class.getClassLoader());
    }
}
