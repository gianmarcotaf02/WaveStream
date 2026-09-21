package p103m;

/* JADX INFO: renamed from: m.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2573k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Method f25070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Method f25071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.reflect.Method f25072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f25073d;

    static {
        try {
            java.lang.Class cls = java.lang.Integer.TYPE;
            java.lang.Class cls2 = java.lang.Boolean.TYPE;
            java.lang.Class cls3 = java.lang.Float.TYPE;
            java.lang.reflect.Method declaredMethod = android.widget.AbsListView.class.getDeclaredMethod("positionSelector", cls, android.view.View.class, cls2, cls3, cls3);
            f25070a = declaredMethod;
            declaredMethod.setAccessible(true);
            java.lang.reflect.Method declaredMethod2 = android.widget.AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f25071b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            java.lang.reflect.Method declaredMethod3 = android.widget.AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f25072c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f25073d = true;
        } catch (java.lang.NoSuchMethodException e6) {
            e6.printStackTrace();
        }
    }
}
