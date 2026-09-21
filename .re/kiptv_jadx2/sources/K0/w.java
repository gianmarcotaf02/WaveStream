package K0;

import android.view.MotionEvent;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

public abstract class w {

    public static final C0653a f6735a = new C0653a(1000);

    public static final C0653a f6736b;

    public static final StackTraceElement[] f6737c;

    static {
        new C0653a(AnalyticsListener.EVENT_AUDIO_ENABLED);
        f6736b = new C0653a(AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED);
        new C0653a(1002);
        f6737c = new StackTraceElement[0];
    }

    public static final boolean a(x xVar) {
        return (xVar.b() || xVar.f6744h || !xVar.f6741d) ? false : true;
    }

    public static final boolean b(x xVar) {
        return !xVar.f6744h && xVar.f6741d;
    }

    public static final boolean c(x xVar) {
        return (xVar.b() || !xVar.f6744h || xVar.f6741d) ? false : true;
    }

    public static final boolean d(x xVar) {
        return xVar.f6744h && !xVar.f6741d;
    }

    public static final boolean e(long j, long j9) {
        return j == j9;
    }

    public static final boolean f(x xVar, long j, long j9) {
        int i3 = xVar.f6745i == 1 ? 1 : 0;
        long j10 = xVar.f6740c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float f9 = i3;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j9 >> 32)) * f9;
        float f10 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j9 & 4294967295L)) * f9;
        return (fIntBitsToFloat > f10) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final long g(x xVar, boolean z6) {
        long jF = p181w0.a.f(xVar.f6740c, xVar.g);
        if (z6 || !xVar.b()) {
            return jF;
        }
        return 0L;
    }

    public static final void h(C0667o c0667o, long j, p194x6.j jVar, boolean z6) {
        MotionEvent motionEventA = c0667o.a();
        if (motionEventA == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventA.getAction();
        if (z6) {
            motionEventA.setAction(3);
        }
        int i3 = (int) (j >> 32);
        int i9 = (int) (j & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i3), -Float.intBitsToFloat(i9));
        jVar.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i3), Float.intBitsToFloat(i9));
        motionEventA.setAction(action);
    }

    public static String i(long j) {
        return "PointerId(value=" + j + ')';
    }
}
