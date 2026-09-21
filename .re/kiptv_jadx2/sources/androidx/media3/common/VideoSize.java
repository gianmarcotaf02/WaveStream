package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.Util;

public final class VideoSize {
    private static final int DEFAULT_HEIGHT = 0;
    private static final float DEFAULT_PIXEL_WIDTH_HEIGHT_RATIO = 1.0f;
    private static final int DEFAULT_WIDTH = 0;
    public final int height;
    public final float pixelWidthHeightRatio;

    @Deprecated
    public final int unappliedRotationDegrees;
    public final int width;
    public static final VideoSize UNKNOWN = new VideoSize(0, 0);
    private static final String FIELD_WIDTH = Util.intToStringMaxRadix(0);
    private static final String FIELD_HEIGHT = Util.intToStringMaxRadix(1);
    private static final String FIELD_PIXEL_WIDTH_HEIGHT_RATIO = Util.intToStringMaxRadix(3);

    public VideoSize(int i3, int i9) {
        this(i3, i9, 1.0f);
    }

    public static VideoSize fromBundle(Bundle bundle) {
        return new VideoSize(bundle.getInt(FIELD_WIDTH, 0), bundle.getInt(FIELD_HEIGHT, 0), bundle.getFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoSize) {
            VideoSize videoSize = (VideoSize) obj;
            if (this.width == videoSize.width && this.height == videoSize.height && this.pixelWidthHeightRatio == videoSize.pixelWidthHeightRatio) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.pixelWidthHeightRatio) + ((((217 + this.width) * 31) + this.height) * 31);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i3 = this.width;
        if (i3 != 0) {
            bundle.putInt(FIELD_WIDTH, i3);
        }
        int i9 = this.height;
        if (i9 != 0) {
            bundle.putInt(FIELD_HEIGHT, i9);
        }
        float f9 = this.pixelWidthHeightRatio;
        if (f9 != 1.0f) {
            bundle.putFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, f9);
        }
        return bundle;
    }

    public VideoSize(int i3, int i9, float f9) {
        this.width = i3;
        this.height = i9;
        this.unappliedRotationDegrees = 0;
        this.pixelWidthHeightRatio = f9;
    }

    @Deprecated
    public VideoSize(int i3, int i9, int i10, float f9) {
        this(i3, i9, f9);
    }
}
