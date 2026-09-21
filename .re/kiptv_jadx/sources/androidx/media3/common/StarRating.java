package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class StarRating extends androidx.media3.common.Rating {
    private static final java.lang.String FIELD_MAX_STARS = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_STAR_RATING = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final int MAX_STARS_DEFAULT = 5;
    private static final int TYPE = 2;
    private final int maxStars;
    private final float starRating;

    public StarRating(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(i3 > 0, "maxStars must be a positive integer");
        this.maxStars = i3;
        this.starRating = -1.0f;
    }

    public static androidx.media3.common.StarRating fromBundle(android.os.Bundle bundle) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(bundle.getInt(androidx.media3.common.Rating.FIELD_RATING_TYPE, -1) == 2);
        int i3 = bundle.getInt(FIELD_MAX_STARS, 5);
        float f9 = bundle.getFloat(FIELD_STAR_RATING, -1.0f);
        return f9 == -1.0f ? new androidx.media3.common.StarRating(i3) : new androidx.media3.common.StarRating(i3, f9);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media3.common.StarRating)) {
            return false;
        }
        androidx.media3.common.StarRating starRating = (androidx.media3.common.StarRating) obj;
        return this.maxStars == starRating.maxStars && this.starRating == starRating.starRating;
    }

    public int getMaxStars() {
        return this.maxStars;
    }

    public float getStarRating() {
        return this.starRating;
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.maxStars), java.lang.Float.valueOf(this.starRating));
    }

    @Override // androidx.media3.common.Rating
    public boolean isRated() {
        return this.starRating != -1.0f;
    }

    @Override // androidx.media3.common.Rating
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(androidx.media3.common.Rating.FIELD_RATING_TYPE, 2);
        bundle.putInt(FIELD_MAX_STARS, this.maxStars);
        bundle.putFloat(FIELD_STAR_RATING, this.starRating);
        return bundle;
    }

    public StarRating(int i3, float f9) {
        boolean z6 = false;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(i3 > 0, "maxStars must be a positive integer");
        if (f9 >= 0.0f && f9 <= i3) {
            z6 = true;
        }
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(z6, "starRating is out of range [0, maxStars]");
        this.maxStars = i3;
        this.starRating = f9;
    }
}
