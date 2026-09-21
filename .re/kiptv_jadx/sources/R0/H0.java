package R0;

/* JADX INFO: loaded from: classes.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R0.H0 f8788a = new R0.H0();

    public final boolean a(android.view.MotionEvent motionEvent, int i3) {
        return (java.lang.Float.floatToRawIntBits(motionEvent.getRawX(i3)) & androidx.media3.common.util.Log.LOG_LEVEL_OFF) < 2139095040 && (java.lang.Float.floatToRawIntBits(motionEvent.getRawY(i3)) & androidx.media3.common.util.Log.LOG_LEVEL_OFF) < 2139095040;
    }
}
