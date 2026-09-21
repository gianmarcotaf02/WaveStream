package v;

/* JADX INFO: renamed from: v.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2899t {
    public static android.widget.EdgeEffect a(android.content.Context context) {
        try {
            return new android.widget.EdgeEffect(context, null);
        } catch (java.lang.Throwable unused) {
            return new android.widget.EdgeEffect(context);
        }
    }

    public static float b(android.widget.EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (java.lang.Throwable unused) {
            return 0.0f;
        }
    }

    public static float c(android.widget.EdgeEffect edgeEffect, float f9, float f10) {
        try {
            return edgeEffect.onPullDistance(f9, f10);
        } catch (java.lang.Throwable unused) {
            edgeEffect.onPull(f9, f10);
            return 0.0f;
        }
    }
}
