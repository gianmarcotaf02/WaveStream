package androidx.media3.session.legacy;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() {
        @Override
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override
        public RatingCompat[] newArray(int i3) {
            return new RatingCompat[i3];
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
    private static final String TAG = "Rating";
    private Object ratingObj;
    private final int ratingStyle;
    private final float ratingValue;

    @Retention(RetentionPolicy.SOURCE)
    public @interface StarStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Style {
    }

    public RatingCompat(int i3, float f9) {
        this.ratingStyle = i3;
        this.ratingValue = f9;
    }

    public static RatingCompat fromRating(Object obj) {
        RatingCompat ratingCompatNewUnratedRating = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
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

    public static RatingCompat newHeartRating(boolean z6) {
        return new RatingCompat(1, z6 ? 1.0f : 0.0f);
    }

    public static RatingCompat newPercentageRating(float f9) {
        if (f9 >= 0.0f && f9 <= 100.0f) {
            return new RatingCompat(6, f9);
        }
        Log.e(TAG, "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat newStarRating(int i3, float f9) {
        float f10;
        if (i3 == 3) {
            f10 = 3.0f;
        } else if (i3 == 4) {
            f10 = 4.0f;
        } else {
            if (i3 != 5) {
                Log.e(TAG, "Invalid rating style (" + i3 + ") for a star rating");
                return null;
            }
            f10 = 5.0f;
        }
        if (f9 >= 0.0f && f9 <= f10) {
            return new RatingCompat(i3, f9);
        }
        Log.e(TAG, "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat newThumbRating(boolean z6) {
        return new RatingCompat(2, z6 ? 1.0f : 0.0f);
    }

    public static RatingCompat newUnratedRating(int i3) {
        switch (i3) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i3, RATING_NOT_RATED);
            default:
                return null;
        }
    }

    @Override
    public int describeContents() {
        return this.ratingStyle;
    }

    public float getPercentRating() {
        return (this.ratingStyle == 6 && isRated()) ? this.ratingValue : RATING_NOT_RATED;
    }

    public Object getRating() {
        if (this.ratingObj == null) {
            if (isRated()) {
                int i3 = this.ratingStyle;
                switch (i3) {
                    case 1:
                        this.ratingObj = Rating.newHeartRating(hasHeart());
                        break;
                    case 2:
                        this.ratingObj = Rating.newThumbRating(isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.ratingObj = Rating.newStarRating(i3, getStarRating());
                        break;
                    case 6:
                        this.ratingObj = Rating.newPercentageRating(getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                this.ratingObj = Rating.newUnratedRating(this.ratingStyle);
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

    public String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.ratingStyle);
        sb.append(" rating=");
        float f9 = this.ratingValue;
        sb.append(f9 < 0.0f ? "unrated" : String.valueOf(f9));
        return sb.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.ratingStyle);
        parcel.writeFloat(this.ratingValue);
    }
}
