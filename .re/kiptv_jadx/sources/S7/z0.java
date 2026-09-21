package S7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f9629a = new java.lang.ThreadLocal();

    public static S7.X a() {
        java.lang.ThreadLocal threadLocal = f9629a;
        S7.X x9 = (S7.X) threadLocal.get();
        if (x9 != null) {
            return x9;
        }
        S7.C0888g c0888g = new S7.C0888g(java.lang.Thread.currentThread());
        threadLocal.set(c0888g);
        return c0888g;
    }
}
