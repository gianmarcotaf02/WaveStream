package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class PercentageRating extends androidx.media3.common.Rating {
    private static final java.lang.String FIELD_PERCENT = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final int TYPE = 1;
    private final float percent;

    public PercentageRating() {
        this.percent = -1.0f;
    }

    public static androidx.media3.common.PercentageRating fromBundle(android.os.Bundle bundle) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(bundle.getInt(androidx.media3.common.Rating.FIELD_RATING_TYPE, -1) == 1);
        float f9 = bundle.getFloat(FIELD_PERCENT, -1.0f);
        return f9 == -1.0f ? new androidx.media3.common.PercentageRating() : new androidx.media3.common.PercentageRating(f9);
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof androidx.media3.common.PercentageRating) && this.percent == ((androidx.media3.common.PercentageRating) obj).percent;
    }

    public float getPercent() {
        return this.percent;
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Float.valueOf(this.percent));
    }

    @Override // androidx.media3.common.Rating
    public boolean isRated() {
        return this.percent != -1.0f;
    }

    @Override // androidx.media3.common.Rating
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(androidx.media3.common.Rating.FIELD_RATING_TYPE, 1);
        bundle.putFloat(FIELD_PERCENT, this.percent);
        return bundle;
    }

    public PercentageRating(float f9) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(f9 >= 0.0f && f9 <= 100.0f, "percent must be in the range of [0, 100]");
        this.percent = f9;
    }
}
