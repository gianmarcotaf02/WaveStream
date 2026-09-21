package androidx.media3.datasource;

import android.net.http.NetworkException;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.window.SurfaceSyncGroup;

public abstract class e {
    public static NetworkException f(Object obj) {
        return (NetworkException) obj;
    }

    public static GraphemeClusterSegmentFinder j(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static SegmentFinder k(Object obj) {
        return (SegmentFinder) obj;
    }

    public static SurfaceSyncGroup l() {
        return new SurfaceSyncGroup("exo-sync-b-334901521");
    }

    public static void n() {
    }

    public static boolean z(Object obj) {
        return obj instanceof NetworkException;
    }
}
