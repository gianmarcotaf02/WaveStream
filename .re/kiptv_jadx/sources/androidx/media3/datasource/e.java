package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ android.net.http.NetworkException f(java.lang.Object obj) {
        return (android.net.http.NetworkException) obj;
    }

    public static /* synthetic */ android.text.GraphemeClusterSegmentFinder j(java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        return new android.text.GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ android.text.SegmentFinder k(java.lang.Object obj) {
        return (android.text.SegmentFinder) obj;
    }

    public static /* synthetic */ android.window.SurfaceSyncGroup l() {
        return new android.window.SurfaceSyncGroup("exo-sync-b-334901521");
    }

    public static /* synthetic */ void n() {
    }

    public static /* bridge */ /* synthetic */ boolean z(java.lang.Object obj) {
        return obj instanceof android.net.http.NetworkException;
    }
}
