package p072i;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.Class[] f22732b = {android.content.Context.class, android.util.AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f22733c = {android.R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f22734d = {android.R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f22735e = {android.R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f22736f = {android.R.attr.screenReaderFocusable};
    public static final java.lang.String[] g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p136q.S f22737h = new p136q.S(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object[] f22738a = new java.lang.Object[2];

    public final android.view.View a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String strConcat;
        p136q.S s9 = f22737h;
        java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) s9.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (java.lang.Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = java.lang.Class.forName(strConcat, false, context.getClassLoader()).asSubclass(android.view.View.class).getConstructor(f22732b);
            s9.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (android.view.View) constructor.newInstance(this.f22738a);
    }
}
