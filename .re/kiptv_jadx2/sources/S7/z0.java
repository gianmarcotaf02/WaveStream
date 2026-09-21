package S7;

public abstract class z0 {

    public static final ThreadLocal f9629a = new ThreadLocal();

    public static X a() {
        ThreadLocal threadLocal = f9629a;
        X x9 = (X) threadLocal.get();
        if (x9 != null) {
            return x9;
        }
        C0888g c0888g = new C0888g(Thread.currentThread());
        threadLocal.set(c0888g);
        return c0888g;
    }
}
