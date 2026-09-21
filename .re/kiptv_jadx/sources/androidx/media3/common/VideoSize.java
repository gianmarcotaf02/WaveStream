package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class VideoSize {
    private static final int DEFAULT_HEIGHT = 0;
    private static final float DEFAULT_PIXEL_WIDTH_HEIGHT_RATIO = 1.0f;
    private static final int DEFAULT_WIDTH = 0;
    public final int height;
    public final float pixelWidthHeightRatio;

    @java.lang.Deprecated
    public final int unappliedRotationDegrees;
    public final int width;
    public static final androidx.media3.common.VideoSize UNKNOWN = new androidx.media3.common.VideoSize(0, 0);
    private static final java.lang.String FIELD_WIDTH = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_HEIGHT = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_PIXEL_WIDTH_HEIGHT_RATIO = androidx.media3.common.util.Util.intToStringMaxRadix(3);

    public VideoSize(int i3, int i9) {
        this(i3, i9, 1.0f);
    }

    public static androidx.media3.common.VideoSize fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.VideoSize(bundle.getInt(FIELD_WIDTH, 0), bundle.getInt(FIELD_HEIGHT, 0), bundle.getFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, 1.0f));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.media3.common.VideoSize) {
            androidx.media3.common.VideoSize videoSize = (androidx.media3.common.VideoSize) obj;
            if (this.width == videoSize.width && this.height == videoSize.height && this.pixelWidthHeightRatio == videoSize.pixelWidthHeightRatio) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Float.floatToRawIntBits(this.pixelWidthHeightRatio) + ((((217 + this.width) * 31) + this.height) * 31);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
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

    @java.lang.Deprecated
    public VideoSize(int i3, int i9, int i10, float f9) {
        this(i3, i9, f9);
    }
}
