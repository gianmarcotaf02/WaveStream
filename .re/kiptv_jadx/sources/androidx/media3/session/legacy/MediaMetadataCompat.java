package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadataCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.media3.session.legacy.MediaMetadataCompat> CREATOR;
    static final p136q.C2661e METADATA_KEYS_TYPE;
    public static final java.lang.String METADATA_KEY_ADVERTISEMENT = "android.media.metadata.ADVERTISEMENT";
    public static final java.lang.String METADATA_KEY_ALBUM = "android.media.metadata.ALBUM";
    public static final java.lang.String METADATA_KEY_ALBUM_ART = "android.media.metadata.ALBUM_ART";
    public static final java.lang.String METADATA_KEY_ALBUM_ARTIST = "android.media.metadata.ALBUM_ARTIST";
    public static final java.lang.String METADATA_KEY_ALBUM_ART_URI = "android.media.metadata.ALBUM_ART_URI";
    public static final java.lang.String METADATA_KEY_ART = "android.media.metadata.ART";
    public static final java.lang.String METADATA_KEY_ARTIST = "android.media.metadata.ARTIST";
    public static final java.lang.String METADATA_KEY_ART_URI = "android.media.metadata.ART_URI";
    public static final java.lang.String METADATA_KEY_AUTHOR = "android.media.metadata.AUTHOR";
    public static final java.lang.String METADATA_KEY_BT_FOLDER_TYPE = "android.media.metadata.BT_FOLDER_TYPE";
    public static final java.lang.String METADATA_KEY_COMPILATION = "android.media.metadata.COMPILATION";
    public static final java.lang.String METADATA_KEY_COMPOSER = "android.media.metadata.COMPOSER";
    public static final java.lang.String METADATA_KEY_DATE = "android.media.metadata.DATE";
    public static final java.lang.String METADATA_KEY_DISC_NUMBER = "android.media.metadata.DISC_NUMBER";
    public static final java.lang.String METADATA_KEY_DISPLAY_DESCRIPTION = "android.media.metadata.DISPLAY_DESCRIPTION";
    public static final java.lang.String METADATA_KEY_DISPLAY_ICON = "android.media.metadata.DISPLAY_ICON";
    public static final java.lang.String METADATA_KEY_DISPLAY_ICON_URI = "android.media.metadata.DISPLAY_ICON_URI";
    public static final java.lang.String METADATA_KEY_DISPLAY_SUBTITLE = "android.media.metadata.DISPLAY_SUBTITLE";
    public static final java.lang.String METADATA_KEY_DISPLAY_TITLE = "android.media.metadata.DISPLAY_TITLE";
    public static final java.lang.String METADATA_KEY_DOWNLOAD_STATUS = "android.media.metadata.DOWNLOAD_STATUS";
    public static final java.lang.String METADATA_KEY_DURATION = "android.media.metadata.DURATION";
    public static final java.lang.String METADATA_KEY_GENRE = "android.media.metadata.GENRE";
    public static final java.lang.String METADATA_KEY_MEDIA_ID = "android.media.metadata.MEDIA_ID";
    public static final java.lang.String METADATA_KEY_MEDIA_URI = "android.media.metadata.MEDIA_URI";
    public static final java.lang.String METADATA_KEY_NUM_TRACKS = "android.media.metadata.NUM_TRACKS";
    public static final java.lang.String METADATA_KEY_RATING = "android.media.metadata.RATING";
    public static final java.lang.String METADATA_KEY_TITLE = "android.media.metadata.TITLE";
    public static final java.lang.String METADATA_KEY_TRACK_NUMBER = "android.media.metadata.TRACK_NUMBER";
    public static final java.lang.String METADATA_KEY_USER_RATING = "android.media.metadata.USER_RATING";
    public static final java.lang.String METADATA_KEY_WRITER = "android.media.metadata.WRITER";
    public static final java.lang.String METADATA_KEY_YEAR = "android.media.metadata.YEAR";
    static final int METADATA_TYPE_BITMAP = 2;
    static final int METADATA_TYPE_LONG = 0;
    static final int METADATA_TYPE_RATING = 3;
    static final int METADATA_TYPE_TEXT = 1;
    public static final java.lang.String[] PREFERRED_DESCRIPTION_ORDER;
    private static final java.lang.String TAG = "MediaMetadata";
    private final android.os.Bundle bundle;
    private byte[] compressedArtworkData;
    private android.media.MediaMetadata metadataFwk;

    public static final class Builder {
        private final android.os.Bundle bundle = new android.os.Bundle();

        public androidx.media3.session.legacy.MediaMetadataCompat build() {
            return new androidx.media3.session.legacy.MediaMetadataCompat(this.bundle);
        }

        public androidx.media3.session.legacy.MediaMetadataCompat.Builder putBitmap(java.lang.String str, android.graphics.Bitmap bitmap) {
            java.lang.Integer num = (java.lang.Integer) androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEYS_TYPE.get(str);
            if (num != null && num.intValue() != 2) {
                throw new java.lang.IllegalArgumentException(Y6.f.h("The ", str, " key cannot be used to put a Bitmap"));
            }
            this.bundle.putParcelable(str, bitmap);
            return this;
        }

        public androidx.media3.session.legacy.MediaMetadataCompat.Builder putLong(java.lang.String str, long j) {
            java.lang.Integer num = (java.lang.Integer) androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEYS_TYPE.get(str);
            if (num != null && num.intValue() != 0) {
                throw new java.lang.IllegalArgumentException(Y6.f.h("The ", str, " key cannot be used to put a long"));
            }
            this.bundle.putLong(str, j);
            return this;
        }

        public androidx.media3.session.legacy.MediaMetadataCompat.Builder putRating(java.lang.String str, androidx.media3.session.legacy.RatingCompat ratingCompat) {
            java.lang.Integer num = (java.lang.Integer) androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEYS_TYPE.get(str);
            if (num != null && num.intValue() != 3) {
                throw new java.lang.IllegalArgumentException(Y6.f.h("The ", str, " key cannot be used to put a Rating"));
            }
            this.bundle.putParcelable(str, (android.os.Parcelable) ratingCompat.getRating());
            return this;
        }

        public androidx.media3.session.legacy.MediaMetadataCompat.Builder putString(java.lang.String str, java.lang.String str2) {
            java.lang.Integer num = (java.lang.Integer) androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEYS_TYPE.get(str);
            if (num != null && num.intValue() != 1) {
                throw new java.lang.IllegalArgumentException(Y6.f.h("The ", str, " key cannot be used to put a String"));
            }
            this.bundle.putCharSequence(str, str2);
            return this;
        }

        public androidx.media3.session.legacy.MediaMetadataCompat.Builder putText(java.lang.String str, java.lang.CharSequence charSequence) {
            java.lang.Integer num = (java.lang.Integer) androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEYS_TYPE.get(str);
            if (num != null && num.intValue() != 1) {
                throw new java.lang.IllegalArgumentException(Y6.f.h("The ", str, " key cannot be used to put a CharSequence"));
            }
            this.bundle.putCharSequence(str, charSequence);
            return this;
        }
    }

    static {
        p136q.C2661e c2661e = new p136q.C2661e(0);
        METADATA_KEYS_TYPE = c2661e;
        Y6.f.r(1, c2661e, METADATA_KEY_TITLE, 1, METADATA_KEY_ARTIST);
        Y6.f.r(0, c2661e, METADATA_KEY_DURATION, 1, METADATA_KEY_ALBUM);
        Y6.f.r(1, c2661e, METADATA_KEY_AUTHOR, 1, METADATA_KEY_WRITER);
        Y6.f.r(1, c2661e, METADATA_KEY_COMPOSER, 1, METADATA_KEY_COMPILATION);
        Y6.f.r(1, c2661e, METADATA_KEY_DATE, 0, METADATA_KEY_YEAR);
        Y6.f.r(1, c2661e, METADATA_KEY_GENRE, 0, METADATA_KEY_TRACK_NUMBER);
        Y6.f.r(0, c2661e, METADATA_KEY_NUM_TRACKS, 0, METADATA_KEY_DISC_NUMBER);
        Y6.f.r(1, c2661e, METADATA_KEY_ALBUM_ARTIST, 2, METADATA_KEY_ART);
        Y6.f.r(1, c2661e, METADATA_KEY_ART_URI, 2, METADATA_KEY_ALBUM_ART);
        Y6.f.r(1, c2661e, METADATA_KEY_ALBUM_ART_URI, 3, METADATA_KEY_USER_RATING);
        Y6.f.r(3, c2661e, METADATA_KEY_RATING, 1, METADATA_KEY_DISPLAY_TITLE);
        Y6.f.r(1, c2661e, METADATA_KEY_DISPLAY_SUBTITLE, 1, METADATA_KEY_DISPLAY_DESCRIPTION);
        Y6.f.r(2, c2661e, METADATA_KEY_DISPLAY_ICON, 1, METADATA_KEY_DISPLAY_ICON_URI);
        Y6.f.r(1, c2661e, METADATA_KEY_MEDIA_ID, 0, METADATA_KEY_BT_FOLDER_TYPE);
        Y6.f.r(1, c2661e, METADATA_KEY_MEDIA_URI, 0, "android.media.metadata.ADVERTISEMENT");
        c2661e.put(METADATA_KEY_DOWNLOAD_STATUS, 0);
        PREFERRED_DESCRIPTION_ORDER = new java.lang.String[]{METADATA_KEY_TITLE, METADATA_KEY_ARTIST, METADATA_KEY_ALBUM, METADATA_KEY_ALBUM_ARTIST, METADATA_KEY_WRITER, METADATA_KEY_AUTHOR, METADATA_KEY_COMPOSER, METADATA_KEY_DISPLAY_SUBTITLE, METADATA_KEY_DISPLAY_DESCRIPTION};
        CREATOR = new android.os.Parcelable.Creator<androidx.media3.session.legacy.MediaMetadataCompat>() { // from class: androidx.media3.session.legacy.MediaMetadataCompat.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.session.legacy.MediaMetadataCompat createFromParcel(android.os.Parcel parcel) {
                return new androidx.media3.session.legacy.MediaMetadataCompat(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.session.legacy.MediaMetadataCompat[] newArray(int i3) {
                return new androidx.media3.session.legacy.MediaMetadataCompat[i3];
            }
        };
    }

    public MediaMetadataCompat(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        this.bundle = bundle2;
        androidx.media3.session.legacy.MediaSessionCompat.ensureClassLoader(bundle2);
    }

    public static androidx.media3.session.legacy.MediaMetadataCompat fromMediaMetadata(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.media.MediaMetadata mediaMetadata = (android.media.MediaMetadata) obj;
        mediaMetadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.metadataFwk = mediaMetadata;
        return mediaMetadataCompatCreateFromParcel;
    }

    private android.graphics.Bitmap getBitmap(java.lang.String str) {
        try {
            return (android.graphics.Bitmap) this.bundle.getParcelable(str);
        } catch (java.lang.Exception e6) {
            androidx.media3.common.util.Log.w(TAG, "Failed to retrieve a key as Bitmap.", e6);
            return null;
        }
    }

    private android.graphics.Bitmap getFirstBitmap(java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (containsKey(str)) {
                return getBitmap(str);
            }
        }
        return null;
    }

    private java.lang.String getFirstString(java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (containsKey(str)) {
                return getString(str);
            }
        }
        return null;
    }

    private android.graphics.Bitmap getMostRelevantArtworkBitmap() {
        return getFirstBitmap(METADATA_KEY_DISPLAY_ICON, METADATA_KEY_ALBUM_ART, METADATA_KEY_ART);
    }

    public boolean containsKey(java.lang.String str) {
        return this.bundle.containsKey(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public android.os.Bundle getBundle() {
        return new android.os.Bundle(this.bundle);
    }

    public long getLong(java.lang.String str) {
        return this.bundle.getLong(str, 0L);
    }

    public android.media.MediaMetadata getMediaMetadata() {
        if (this.metadataFwk == null) {
            android.media.MediaMetadata.Builder builder = new android.media.MediaMetadata.Builder();
            for (java.lang.String str : this.bundle.keySet()) {
                java.lang.Integer num = (java.lang.Integer) METADATA_KEYS_TYPE.get(str);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.putLong(str, this.bundle.getLong(str));
                } else if (iIntValue == 1) {
                    builder.putText(str, this.bundle.getCharSequence(str));
                } else if (iIntValue == 2) {
                    builder.putBitmap(str, (android.graphics.Bitmap) this.bundle.getParcelable(str));
                } else if (iIntValue != 3) {
                    java.lang.Object obj = this.bundle.get(str);
                    if (obj == null || (obj instanceof java.lang.CharSequence)) {
                        builder.putText(str, (java.lang.CharSequence) obj);
                    } else if (obj instanceof java.lang.Long) {
                        builder.putLong(str, ((java.lang.Long) obj).longValue());
                    }
                } else {
                    builder.putRating(str, (android.media.Rating) this.bundle.getParcelable(str));
                }
            }
            this.metadataFwk = builder.build();
        }
        return this.metadataFwk;
    }

    public byte[] getMostRelevantArtworkBitmapData() {
        android.graphics.Bitmap mostRelevantArtworkBitmap = getMostRelevantArtworkBitmap();
        if (mostRelevantArtworkBitmap == null) {
            return null;
        }
        if (this.compressedArtworkData == null) {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    mostRelevantArtworkBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    this.compressedArtworkData = byteArrayOutputStream.toByteArray();
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
                androidx.media3.common.util.Log.w(TAG, "Failed to compress MediaMetadataCompat artwork", e6);
            }
        }
        return this.compressedArtworkData;
    }

    public android.net.Uri getMostRelevantArtworkUri() {
        java.lang.String firstString = getFirstString(METADATA_KEY_DISPLAY_ICON_URI, METADATA_KEY_ALBUM_ART_URI, METADATA_KEY_ART_URI);
        if (firstString != null) {
            return android.net.Uri.parse(firstString);
        }
        return null;
    }

    public androidx.media3.session.legacy.RatingCompat getRating(java.lang.String str) {
        try {
            return androidx.media3.session.legacy.RatingCompat.fromRating(this.bundle.getParcelable(str));
        } catch (java.lang.Exception e6) {
            androidx.media3.common.util.Log.w(TAG, "Failed to retrieve a key as Rating.", e6);
            return null;
        }
    }

    public java.lang.String getString(java.lang.String str) {
        java.lang.CharSequence charSequence = this.bundle.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public java.lang.CharSequence getText(java.lang.String str) {
        return this.bundle.getCharSequence(str);
    }

    public void preserveArtworkBitmapData(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat) {
        android.graphics.Bitmap mostRelevantArtworkBitmap;
        android.graphics.Bitmap mostRelevantArtworkBitmap2;
        if (mediaMetadataCompat.compressedArtworkData == null || (mostRelevantArtworkBitmap = getMostRelevantArtworkBitmap()) == null || (mostRelevantArtworkBitmap2 = mediaMetadataCompat.getMostRelevantArtworkBitmap()) == null || !mostRelevantArtworkBitmap.sameAs(mostRelevantArtworkBitmap2)) {
            return;
        }
        this.compressedArtworkData = mediaMetadataCompat.compressedArtworkData;
    }

    public int size() {
        return this.bundle.size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeBundle(this.bundle);
    }

    public MediaMetadataCompat(android.os.Parcel parcel) {
        android.os.Bundle bundle = parcel.readBundle(androidx.media3.session.legacy.MediaSessionCompat.class.getClassLoader());
        bundle.getClass();
        this.bundle = bundle;
    }
}
