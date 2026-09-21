package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m {
    public static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void b(java.lang.Object obj) {
        if (obj != null) {
            return;
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException();
        i(nullPointerException, kotlin.jvm.internal.m.class.getName());
        throw nullPointerException;
    }

    public static void c(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException(str);
        i(nullPointerException, kotlin.jvm.internal.m.class.getName());
        throw nullPointerException;
    }

    public static void d(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException(str.concat(" must not be null"));
        i(nullPointerException, kotlin.jvm.internal.m.class.getName());
        throw nullPointerException;
    }

    public static void e(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            java.lang.String name = kotlin.jvm.internal.m.class.getName();
            int i3 = 0;
            while (!stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            while (stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            java.lang.StackTraceElement stackTraceElement = stackTrace[i3];
            java.lang.StringBuilder sbO = Y6.f.o("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            sbO.append(str);
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException(sbO.toString());
            i(nullPointerException, kotlin.jvm.internal.m.class.getName());
            throw nullPointerException;
        }
    }

    public static int f(int i3, int i9) {
        if (i3 < i9) {
            return -1;
        }
        return i3 == i9 ? 0 : 1;
    }

    public static int g(long j, long j9) {
        if (j < j9) {
            return -1;
        }
        return j == j9 ? 0 : 1;
    }

    public static final D1.X h(java.lang.Object[] array) {
        e(array, "array");
        return new D1.X(array);
    }

    public static void i(java.lang.RuntimeException runtimeException, java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i3 = -1;
        for (int i9 = 0; i9 < length; i9++) {
            if (str.equals(stackTrace[i9].getClassName())) {
                i3 = i9;
            }
        }
        runtimeException.setStackTrace((java.lang.StackTraceElement[]) java.util.Arrays.copyOfRange(stackTrace, i3 + 1, length));
    }

    public static void j() {
        throw new java.lang.UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void k(java.lang.String str) {
        I3.b bVar = new I3.b(Y6.f.h("lateinit property ", str, " has not been initialized"));
        i(bVar, kotlin.jvm.internal.m.class.getName());
        throw bVar;
    }
}
