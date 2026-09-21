package T7;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends p100l6.a implements S7.InterfaceC0908y {
    private volatile java.lang.Object _preHandler;

    public b() {
        super(S7.C0907x.f9625h);
        this._preHandler = this;
    }

    @Override // S7.InterfaceC0908y
    public final void handleException(p100l6.h hVar, java.lang.Throwable th) {
        java.lang.reflect.Method declaredMethod;
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (26 > i3 || i3 >= 28) {
            return;
        }
        java.lang.Object obj = this._preHandler;
        if (obj != this) {
            declaredMethod = (java.lang.reflect.Method) obj;
        } else {
            try {
                declaredMethod = java.lang.Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                if (!java.lang.reflect.Modifier.isPublic(declaredMethod.getModifiers()) || !java.lang.reflect.Modifier.isStatic(declaredMethod.getModifiers())) {
                    declaredMethod = null;
                }
            } catch (java.lang.Throwable unused) {
            }
            this._preHandler = declaredMethod;
        }
        java.lang.Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, null) : null;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof java.lang.Thread.UncaughtExceptionHandler ? (java.lang.Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(java.lang.Thread.currentThread(), th);
        }
    }
}
