package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements java.security.PrivilegedExceptionAction {
    public static sun.misc.Unsafe a() throws java.lang.IllegalAccessException {
        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (sun.misc.Unsafe.class.isInstance(obj)) {
                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
            }
        }
        return null;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ java.lang.Object run() {
        return a();
    }
}
