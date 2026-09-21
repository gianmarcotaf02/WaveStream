package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class Size {
    private final int height;
    private final int width;
    public static final androidx.media3.common.util.Size UNKNOWN = new androidx.media3.common.util.Size(-1, -1);
    public static final androidx.media3.common.util.Size ZERO = new androidx.media3.common.util.Size(0, 0);
    private static final java.lang.String FIELD_WIDTH = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_HEIGHT = androidx.media3.common.util.Util.intToStringMaxRadix(1);

    public Size(int i3, int i9) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L((i3 == -1 || i3 >= 0) && (i9 == -1 || i9 >= 0));
        this.width = i3;
        this.height = i9;
    }

    public static androidx.media3.common.util.Size fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.util.Size(bundle.getInt(FIELD_WIDTH, -1), bundle.getInt(FIELD_HEIGHT, -1));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.media3.common.util.Size) {
            androidx.media3.common.util.Size size = (androidx.media3.common.util.Size) obj;
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

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_WIDTH, this.width);
        bundle.putInt(FIELD_HEIGHT, this.height);
        return bundle;
    }

    public java.lang.String toString() {
        return this.width + "x" + this.height;
    }
}
