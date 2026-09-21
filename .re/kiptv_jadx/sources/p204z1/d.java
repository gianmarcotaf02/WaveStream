package p204z1;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f32142a = 0;

    static {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            try {
                android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                java.lang.Class cls = java.lang.Long.TYPE;
                android.os.Trace.class.getMethod("isTagEnabled", cls);
                java.lang.Class cls2 = java.lang.Integer.TYPE;
                android.os.Trace.class.getMethod("asyncTraceBegin", cls, java.lang.String.class, cls2);
                android.os.Trace.class.getMethod("asyncTraceEnd", cls, java.lang.String.class, cls2);
                android.os.Trace.class.getMethod("traceCounter", cls, java.lang.String.class, cls2);
            } catch (java.lang.Exception e6) {
                android.util.Log.i("TraceCompat", "Unable to initialize via reflection.", e6);
            }
        }
    }
}
