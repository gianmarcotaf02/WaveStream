package p182w1;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p182w1.g {
    @Override // p182w1.g
    public final android.graphics.Typeface V(java.lang.Object obj) {
        try {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.g, 1);
            java.lang.reflect.Array.set(objNewInstance, 0, obj);
            return (android.graphics.Typeface) this.f29780m.invoke(null, objNewInstance, androidx.media3.common.C.SANS_SERIF_NAME, -1, -1);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }

    @Override // p182w1.g
    public final java.lang.reflect.Method Z(java.lang.Class cls) throws java.lang.NoSuchMethodException {
        java.lang.Class<?> cls2 = java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1).getClass();
        java.lang.Class cls3 = java.lang.Integer.TYPE;
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, java.lang.String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
