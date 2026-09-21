package androidx.media3.common.util;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;

public final class Size {
    private final int height;
    private final int width;
    public static final Size UNKNOWN = new Size(-1, -1);
    public static final Size ZERO = new Size(0, 0);
    private static final String FIELD_WIDTH = Util.intToStringMaxRadix(0);
    private static final String FIELD_HEIGHT = Util.intToStringMaxRadix(1);

    public Size(int i3, int i9) {
        AbstractC1864o0.L((i3 == -1 || i3 >= 0) && (i9 == -1 || i9 >= 0));
        this.width = i3;
        this.height = i9;
    }

    public static Size fromBundle(Bundle bundle) {
        return new Size(bundle.getInt(FIELD_WIDTH, -1), bundle.getInt(FIELD_HEIGHT, -1));
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.width == size.width && this.height == size.height) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i3 = this.height;
        int i9 = this.width;
        return i3 ^ ((i9 >>> 16) | (i9 << 16));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_WIDTH, this.width);
        bundle.putInt(FIELD_HEIGHT, this.height);
        return bundle;
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
