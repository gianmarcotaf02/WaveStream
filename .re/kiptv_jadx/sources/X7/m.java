package X7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T7.e f10930a;

    static {
        java.lang.String property;
        int i3 = X7.s.f10935a;
        java.lang.Object next = null;
        try {
            property = java.lang.System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (java.lang.SecurityException unused) {
            property = null;
        }
        if (property != null) {
            java.lang.Boolean.parseBoolean(property);
        }
        try {
            java.util.Iterator it = N7.o.s0(N7.o.g0(java.util.Arrays.asList(new T7.a()).iterator())).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    ((T7.a) next).getClass();
                    do {
                        ((T7.a) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((T7.a) next) == null) {
                throw new java.lang.IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            if (mainLooper == null) {
                throw new java.lang.IllegalStateException("The main looper is not available");
            }
            f10930a = new T7.e(T7.f.a(mainLooper));
        } catch (java.lang.Throwable th) {
            throw new java.util.ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
