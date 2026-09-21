package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.media3.session.legacy.RatingCompat> CREATOR = new android.os.Parcelable.Creator<androidx.media3.session.legacy.RatingCompat>() { // from class: androidx.media3.session.legacy.RatingCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.session.legacy.RatingCompat createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.session.legacy.RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.session.legacy.RatingCompat[] newArray(int i3) {
            return new androidx.media3.session.legacy.RatingCompat[i3];
        }
    };
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    private static final float RATING_NOT_RATED = -1.0f;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;
    private static final java.lang.String TAG = "Rating";
    private java.lang.Object ratingObj;
    private final int ratingStyle;
    private final float ratingValue;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StarStyle {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Style {
    }

    public RatingCompat(int i3, float f9) {
        this.ratingStyle = i3;
        this.ratingValue = f9;
    }

    public static androidx.media3.session.legacy.RatingCompat fromRating(java.lang.Object obj) {
        androidx.media3.session.legacy.RatingCompat ratingCompatNewUnratedRating = null;
        if (obj != null) {
            android.media.Rating rating = (android.media.Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompatNewUnratedRating = newHeartRating(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompatNewUnratedRating = newThumbRating(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompatNewUnratedRating = newStarRating(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompatNewUnratedRating = newPercentageRating(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompatNewUnratedRating = newUnratedRating(ratingStyle);
            }
            ratingCompatNewUnratedRating.getClass();
            ratingCompatNewUnratedRating.ratingObj = obj;
        }
        return ratingCompatNewUnratedRating;
    }

    public static androidx.media3.session.legacy.RatingCompat newHeartRating(boolean z6) {
        return new androidx.media3.session.legacy.RatingCompat(1, z6 ? 1.0f : 0.0f);
    }

    public static androidx.media3.session.legacy.RatingCompat newPercentageRating(float f9) {
        if (f9 >= 0.0f && f9 <= 100.0f) {
            return new androidx.media3.session.legacy.RatingCompat(6, f9);
        }
        androidx.media3.common.util.Log.e(TAG, "Invalid percentage-based rating value");
        return null;
    }

    public static androidx.media3.session.legacy.RatingCompat newStarRating(int i3, float f9) {
        float f10;
        if (i3 == 3) {
            f10 = 3.0f;
        } else if (i3 == 4) {
            f10 = 4.0f;
        } else {
            if (i3 != 5) {
                androidx.media3.common.util.Log.e(TAG, "Invalid rating style (" + i3 + ") for a star rating");
                return null;
            }
            f10 = 5.0f;
        }
        if (f9 >= 0.0f && f9 <= f10) {
            return new androidx.media3.session.legacy.RatingCompat(i3, f9);
        }
        androidx.media3.common.util.Log.e(TAG, "Trying to set out of range star-based rating");
        return null;
    }

    public static androidx.media3.session.legacy.RatingCompat newThumbRating(boolean z6) {
        return new androidx.media3.session.legacy.RatingCompat(2, z6 ? 1.0f : 0.0f);
    }

    public static androidx.media3.session.legacy.RatingCompat newUnratedRating(int i3) {
        switch (i3) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new androidx.media3.session.legacy.RatingCompat(i3, RATING_NOT_RATED);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.ratingStyle;
    }

    public float getPercentRating() {
        return (this.ratingStyle == 6 && isRated()) ? this.ratingValue : RATING_NOT_RATED;
    }

    public java.lang.Object getRating() {
        if (this.ratingObj == null) {
            if (isRated()) {
                int i3 = this.ratingStyle;
                switch (i3) {
                    case 1:
                        this.ratingObj = android.media.Rating.newHeartRating(hasHeart());
                        break;
                    case 2:
                        this.ratingObj = android.media.Rating.newThumbRating(isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.ratingObj = android.media.Rating.newStarRating(i3, getStarRating());
                        break;
                    case 6:
                        this.ratingObj = android.media.Rating.newPercentageRating(getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                this.ratingObj = android.media.Rating.newUnratedRating(this.ratingStyle);
            }
        }
        return this.ratingObj;
    }

    public int getRatingStyle() {
        return this.ratingStyle;
    }

    public float getStarRating() {
        int i3 = this.ratingStyle;
        return ((i3 == 3 || i3 == 4 || i3 == 5) && isRated()) ? this.ratingValue : RATING_NOT_RATED;
    }

    public boolean hasHeart() {
        return this.ratingStyle == 1 && this.ratingValue == 1.0f;
    }

    public boolean isRated() {
        return this.ratingValue >= 0.0f;
    }

    public boolean isThumbUp() {
        return this.ratingStyle == 2 && this.ratingValue == 1.0f;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Rating:style=");
        sb.append(this.ratingStyle);
        sb.append(" rating=");
        float f9 = this.ratingValue;
        sb.append(f9 < 0.0f ? "unrated" : java.lang.String.valueOf(f9));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeInt(this.ratingStyle);
        parcel.writeFloat(this.ratingValue);
    }
}
