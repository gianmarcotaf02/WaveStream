package androidx.media3.ui;

import android.graphics.Color;
import androidx.media3.common.util.Util;

final class HtmlUtils {
    private HtmlUtils() {
    }

    public static String cssAllClassDescendantsSelector(String str) {
        return Y6.f.i(".", str, ",.", str, " *");
    }

    public static String toCssRgba(int i3) {
        return Util.formatInvariant("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i3)), Integer.valueOf(Color.green(i3)), Integer.valueOf(Color.blue(i3)), Double.valueOf(((double) Color.alpha(i3)) / 255.0d));
    }
}
