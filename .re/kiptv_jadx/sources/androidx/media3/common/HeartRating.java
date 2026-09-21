package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class HeartRating extends androidx.media3.common.Rating {
    private static final int TYPE = 0;
    private final boolean isHeart;
    private final boolean rated;
    private static final java.lang.String FIELD_RATED = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_IS_HEART = androidx.media3.common.util.Util.intToStringMaxRadix(2);

    public HeartRating() {
        this.rated = false;
        this.isHeart = false;
    }

    public static androidx.media3.common.HeartRating fromBundle(android.os.Bundle bundle) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(bundle.getInt(androidx.media3.common.Rating.FIELD_RATING_TYPE, -1) == 0);
        return bundle.getBoolean(FIELD_RATED, false) ? new androidx.media3.common.HeartRating(bundle.getBoolean(FIELD_IS_HEART, false)) : new androidx.media3.common.HeartRating();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media3.common.HeartRating)) {
            return false;
        }
        androidx.media3.common.HeartRating heartRating = (androidx.media3.common.HeartRating) obj;
        return this.isHeart == heartRating.isHeart && this.rated == heartRating.rated;
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Boolean.valueOf(this.rated), java.lang.Boolean.valueOf(this.isHeart));
    }

    public boolean isHeart() {
        return this.isHeart;
    }

    @Override // androidx.media3.common.Rating
    public boolean isRated() {
        return this.rated;
    }

    @Override // androidx.media3.common.Rating
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(androidx.media3.common.Rating.FIELD_RATING_TYPE, 0);
        bundle.putBoolean(FIELD_RATED, this.rated);
        bundle.putBoolean(FIELD_IS_HEART, this.isHeart);
        return bundle;
    }

    public HeartRating(boolean z6) {
        this.rated = true;
        this.isHeart = z6;
    }
}
