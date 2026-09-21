package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements android.os.Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final android.os.Parcelable.Creator<androidx.media3.session.legacy.MediaDescriptionCompat> CREATOR = new android.os.Parcelable.Creator<androidx.media3.session.legacy.MediaDescriptionCompat>() { // from class: androidx.media3.session.legacy.MediaDescriptionCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.session.legacy.MediaDescriptionCompat createFromParcel(android.os.Parcel parcel) {
            return androidx.media3.session.legacy.MediaDescriptionCompat.fromMediaDescription((android.media.MediaDescription) android.media.MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.session.legacy.MediaDescriptionCompat[] newArray(int i3) {
            return new androidx.media3.session.legacy.MediaDescriptionCompat[i3];
        }
    };
    public static final java.lang.String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
    public static final java.lang.String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final java.lang.String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final java.lang.String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;
    private static final java.lang.String TAG = "MediaDescriptionCompat";
    private byte[] compressedIcon;
    private final java.lang.CharSequence description;
    private android.media.MediaDescription descriptionFwk;
    private final android.os.Bundle extras;
    private final android.graphics.Bitmap icon;
    private final android.net.Uri iconUri;
    private final java.lang.String mediaId;
    private final android.net.Uri mediaUri;
    private final java.lang.CharSequence subtitle;
    private final java.lang.CharSequence title;

    public static final class Builder {
        private java.lang.CharSequence description;
        private android.os.Bundle extras;
        private android.graphics.Bitmap icon;
        private android.net.Uri iconUri;
        private java.lang.String mediaId;
        private android.net.Uri mediaUri;
        private java.lang.CharSequence subtitle;
        private java.lang.CharSequence title;

        public androidx.media3.session.legacy.MediaDescriptionCompat build() {
            return new androidx.media3.session.legacy.MediaDescriptionCompat(this.mediaId, this.title, this.subtitle, this.description, this.icon, this.iconUri, this.extras, this.mediaUri);
        }

        public androidx.media3.session.legacy.MediaDescriptionCompat.Builder setDescription(java.lang.CharSequence charSequence) {
            this.description = charSequence;
            return this;
        }

        public androidx.media3.session.legacy.MediaDescriptionCompat.Builder setExtras(android.os.Bundle bundle) {
            this.extras = bundle;
            return this;
        }

        public androidx.media3.session.legacy.MediaDescriptionCompat.Builder setIconBitmap(android.graphics.Bitmap bitmap) {
            this.icon = bitmap;
            return this;
        }

        public androidx.media3.session.legacy.MediaDescriptionCompat.Builder setIconUri(android.net.Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public androidx.media3.session.legacy.MediaDescriptionCompat.Builder setMediaId(java.lang.String str) {
            this.mediaId = str;
            return this;
        }

        public androidx.media3.session.legacy.MediaDescriptionCompat.Builder setMediaUri(android.net.Uri uri) {
            this.mediaUri = uri;
            return this;
        }

        public androidx.media3.session.legacy.MediaDescriptionCompat.Builder setSubtitle(java.lang.CharSequence charSequence) {
            this.subtitle = charSequence;
            return this;
        }

        public androidx.media3.session.legacy.MediaDescriptionCompat.Builder setTitle(java.lang.CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(java.lang.String str, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, android.graphics.Bitmap bitmap, android.net.Uri uri, android.os.Bundle bundle, android.net.Uri uri2) {
        this.mediaId = str;
        this.title = charSequence;
        this.subtitle = charSequence2;
        this.description = charSequence3;
        this.icon = bitmap;
        this.iconUri = uri;
        this.extras = bundle;
        this.mediaUri = uri2;
    }

    public static androidx.media3.session.legacy.MediaDescriptionCompat fromMediaDescription(android.media.MediaDescription mediaDescription) {
        androidx.media3.session.legacy.MediaDescriptionCompat.Builder builder = new androidx.media3.session.legacy.MediaDescriptionCompat.Builder();
        builder.setMediaId(mediaDescription.getMediaId());
        builder.setTitle(mediaDescription.getTitle());
        builder.setSubtitle(mediaDescription.getSubtitle());
        builder.setDescription(mediaDescription.getDescription());
        builder.setIconBitmap(mediaDescription.getIconBitmap());
        builder.setIconUri(mediaDescription.getIconUri());
        android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(mediaDescription.getExtras());
        if (bundleConvertToNullIfInvalid != null) {
            bundleConvertToNullIfInvalid = new android.os.Bundle(bundleConvertToNullIfInvalid);
        }
        android.net.Uri uri = null;
        if (bundleConvertToNullIfInvalid != null) {
            android.net.Uri uri2 = (android.net.Uri) bundleConvertToNullIfInvalid.getParcelable(DESCRIPTION_KEY_MEDIA_URI);
            if (uri2 != null) {
                if (bundleConvertToNullIfInvalid.containsKey(DESCRIPTION_KEY_NULL_BUNDLE_FLAG) && bundleConvertToNullIfInvalid.size() == 2) {
                    bundleConvertToNullIfInvalid = null;
                } else {
                    bundleConvertToNullIfInvalid.remove(DESCRIPTION_KEY_MEDIA_URI);
                    bundleConvertToNullIfInvalid.remove(DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
                }
            }
            uri = uri2;
        }
        builder.setExtras(bundleConvertToNullIfInvalid);
        if (uri != null) {
            builder.setMediaUri(uri);
        } else {
            builder.setMediaUri(mediaDescription.getMediaUri());
        }
        androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompatBuild = builder.build();
        mediaDescriptionCompatBuild.descriptionFwk = mediaDescription;
        return mediaDescriptionCompatBuild;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.CharSequence getDescription() {
        return this.description;
    }

    public android.os.Bundle getExtras() {
        return this.extras;
    }

    public android.graphics.Bitmap getIconBitmap() {
        return this.icon;
    }

    public byte[] getIconBitmapData() {
        if (this.icon == null) {
            return null;
        }
        if (this.compressedIcon == null) {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    this.icon.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    this.compressedIcon = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.io.IOException e6) {
                androidx.media3.common.util.Log.w(TAG, "Failed to compress MediaDescriptionCompat artwork", e6);
            }
        }
        return this.compressedIcon;
    }

    public android.net.Uri getIconUri() {
        return this.iconUri;
    }

    public android.media.MediaDescription getMediaDescription() {
        android.media.MediaDescription mediaDescription = this.descriptionFwk;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        android.media.MediaDescription.Builder builder = new android.media.MediaDescription.Builder();
        builder.setMediaId(this.mediaId);
        builder.setTitle(this.title);
        builder.setSubtitle(this.subtitle);
        builder.setDescription(this.description);
        builder.setIconBitmap(this.icon);
        builder.setIconUri(this.iconUri);
        builder.setExtras(this.extras);
        builder.setMediaUri(this.mediaUri);
        android.media.MediaDescription mediaDescriptionBuild = builder.build();
        this.descriptionFwk = mediaDescriptionBuild;
        return mediaDescriptionBuild;
    }

    public java.lang.String getMediaId() {
        return this.mediaId;
    }

    public android.net.Uri getMediaUri() {
        return this.mediaUri;
    }

    public java.lang.CharSequence getSubtitle() {
        return this.subtitle;
    }

    public java.lang.CharSequence getTitle() {
        return this.title;
    }

    public void preserveIconBitmapData(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        if (mediaDescriptionCompat.compressedIcon == null || (bitmap = this.icon) == null || (bitmap2 = mediaDescriptionCompat.icon) == null || !bitmap.sameAs(bitmap2)) {
            return;
        }
        this.compressedIcon = mediaDescriptionCompat.compressedIcon;
    }

    public java.lang.String toString() {
        return ((java.lang.Object) this.title) + ", " + ((java.lang.Object) this.subtitle) + ", " + ((java.lang.Object) this.description);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i3) {
        getMediaDescription().writeToParcel(parcel, i3);
    }
}
