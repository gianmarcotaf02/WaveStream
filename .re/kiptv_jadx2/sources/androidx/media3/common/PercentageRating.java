package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.Objects;

public final class PercentageRating extends Rating {
    private static final String FIELD_PERCENT = Util.intToStringMaxRadix(1);
    private static final int TYPE = 1;
    private final float percent;

    public PercentageRating() {
        this.percent = -1.0f;
    }

    public static PercentageRating fromBundle(Bundle bundle) {
        AbstractC1864o0.L(bundle.getInt(Rating.FIELD_RATING_TYPE, -1) == 1);
        float f9 = bundle.getFloat(FIELD_PERCENT, -1.0f);
        return f9 == -1.0f ? new PercentageRating() : new PercentageRating(f9);
    }

    public boolean equals(Object obj) {
        return (obj instanceof PercentageRating) && this.percent == ((PercentageRating) obj).percent;
    }

    public float getPercent() {
        return this.percent;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.percent));
    }

    @Override
    public boolean isRated() {
        return this.percent != -1.0f;
    }

    @Override
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Rating.FIELD_RATING_TYPE, 1);
        bundle.putFloat(FIELD_PERCENT, this.percent);
        return bundle;
    }

    public PercentageRating(float f9) {
        AbstractC1864o0.M(f9 >= 0.0f && f9 <= 100.0f, "percent must be in the range of [0, 100]");
        this.percent = f9;
    }
}
