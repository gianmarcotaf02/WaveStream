package R0;

import android.view.MotionEvent;
import androidx.media3.common.util.Log;

public final class H0 {

    public static final H0 f8788a = new H0();

    public final boolean a(MotionEvent motionEvent, int i3) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i3)) & Log.LOG_LEVEL_OFF) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i3)) & Log.LOG_LEVEL_OFF) < 2139095040;
    }
}
