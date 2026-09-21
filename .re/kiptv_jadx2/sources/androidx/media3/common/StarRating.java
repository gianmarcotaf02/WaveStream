package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.Objects;

public final class StarRating extends Rating {
    private static final String FIELD_MAX_STARS = Util.intToStringMaxRadix(1);
    private static final String FIELD_STAR_RATING = Util.intToStringMaxRadix(2);
    private static final int MAX_STARS_DEFAULT = 5;
    private static final int TYPE = 2;
    private final int maxStars;
    private final float starRating;

    public StarRating(int i3) {
        AbstractC1864o0.M(i3 > 0, "maxStars must be a positive integer");
        this.maxStars = i3;
        this.starRating = -1.0f;
    }

    public static StarRating fromBundle(Bundle bundle) {
        AbstractC1864o0.L(bundle.getInt(Rating.FIELD_RATING_TYPE, -1) == 2);
        int i3 = bundle.getInt(FIELD_MAX_STARS, 5);
        float f9 = bundle.getFloat(FIELD_STAR_RATING, -1.0f);
        return f9 == -1.0f ? new StarRating(i3) : new StarRating(i3, f9);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        return this.maxStars == starRating.maxStars && this.starRating == starRating.starRating;
    }

    public int getMaxStars() {
        return this.maxStars;
    }

    public float getStarRating() {
        return this.starRating;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.maxStars), Float.valueOf(this.starRating));
    }

    @Override
    public boolean isRated() {
        return this.starRating != -1.0f;
    }

    @Override
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Rating.FIELD_RATING_TYPE, 2);
        bundle.putInt(FIELD_MAX_STARS, this.maxStars);
        bundle.putFloat(FIELD_STAR_RATING, this.starRating);
        return bundle;
    }

    public StarRating(int i3, float f9) {
        boolean z6 = false;
        AbstractC1864o0.M(i3 > 0, "maxStars must be a positive integer");
        if (f9 >= 0.0f && f9 <= i3) {
            z6 = true;
        }
        AbstractC1864o0.M(z6, "starRating is out of range [0, maxStars]");
        this.maxStars = i3;
        this.starRating = f9;
    }
}
