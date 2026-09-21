package p088k;

/* JADX INFO: loaded from: classes.dex */
public final class e implements android.view.MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.Class[] f24353c = {android.view.MenuItem.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Object f24354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.reflect.Method f24355b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.reflect.Method method = this.f24355b;
        try {
            java.lang.Class<?> returnType = method.getReturnType();
            java.lang.Class<?> cls = java.lang.Boolean.TYPE;
            java.lang.Object obj = this.f24354a;
            if (returnType == cls) {
                return ((java.lang.Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (java.lang.Exception e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }
}
