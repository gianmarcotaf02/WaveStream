package D1;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Method f1985a;

    static {
        if (android.os.Build.VERSION.SDK_INT == 25) {
            try {
                f1985a = android.view.ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (java.lang.Exception unused) {
                android.util.Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    public static float a(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        java.lang.reflect.Method method;
        if (android.os.Build.VERSION.SDK_INT >= 25 && (method = f1985a) != null) {
            try {
                return ((java.lang.Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (java.lang.Exception unused) {
                android.util.Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
