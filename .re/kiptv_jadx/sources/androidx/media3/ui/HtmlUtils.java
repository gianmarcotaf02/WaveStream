package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
final class HtmlUtils {
    private HtmlUtils() {
    }

    public static java.lang.String cssAllClassDescendantsSelector(java.lang.String str) {
        return Y6.f.i(".", str, ",.", str, " *");
    }

    public static java.lang.String toCssRgba(int i3) {
        return androidx.media3.common.util.Util.formatInvariant("rgba(%d,%d,%d,%.3f)", java.lang.Integer.valueOf(android.graphics.Color.red(i3)), java.lang.Integer.valueOf(android.graphics.Color.green(i3)), java.lang.Integer.valueOf(android.graphics.Color.blue(i3)), java.lang.Double.valueOf(((double) android.graphics.Color.alpha(i3)) / 255.0d));
    }
}
