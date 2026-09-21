package K0;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K0.C0653a f6735a = new K0.C0653a(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K0.C0653a f6736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.StackTraceElement[] f6737c;

    static {
        new K0.C0653a(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_ENABLED);
        f6736b = new K0.C0653a(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED);
        new K0.C0653a(1002);
        f6737c = new java.lang.StackTraceElement[0];
    }

    public static final boolean a(K0.x xVar) {
        return (xVar.b() || xVar.f6744h || !xVar.f6741d) ? false : true;
    }

    public static final boolean b(K0.x xVar) {
        return !xVar.f6744h && xVar.f6741d;
    }

    public static final boolean c(K0.x xVar) {
        return (xVar.b() || !xVar.f6744h || xVar.f6741d) ? false : true;
    }

    public static final boolean d(K0.x xVar) {
        return xVar.f6744h && !xVar.f6741d;
    }

    public static final boolean e(long j, long j9) {
        return j == j9;
    }

    public static final boolean f(K0.x xVar, long j, long j9) {
        int i3 = xVar.f6745i == 1 ? 1 : 0;
        long j10 = xVar.f6740c;
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j10 & 4294967295L));
        float f9 = i3;
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j9 >> 32)) * f9;
        float f10 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L)) * f9;
        return (fIntBitsToFloat > f10) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final long g(K0.x xVar, boolean z6) {
        long jF = p181w0.a.f(xVar.f6740c, xVar.g);
        if (z6 || !xVar.b()) {
            return jF;
        }
        return 0L;
    }

    public static final void h(K0.C0667o c0667o, long j, p194x6.j jVar, boolean z6) {
        android.view.MotionEvent motionEventA = c0667o.a();
        if (motionEventA == null) {
            throw new java.lang.IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventA.getAction();
        if (z6) {
            motionEventA.setAction(3);
        }
        int i3 = (int) (j >> 32);
        int i9 = (int) (j & 4294967295L);
        motionEventA.offsetLocation(-java.lang.Float.intBitsToFloat(i3), -java.lang.Float.intBitsToFloat(i9));
        jVar.invoke(motionEventA);
        motionEventA.offsetLocation(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i9));
        motionEventA.setAction(action);
    }

    public static java.lang.String i(long j) {
        return "PointerId(value=" + j + ')';
    }
}
