package M8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q implements java.io.Closeable, java.lang.AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final M8.w f7275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final M8.A f7276i;

    static {
        M8.w wVar;
        try {
            java.lang.Class.forName("java.nio.file.Files");
            wVar = new M8.x();
        } catch (java.lang.ClassNotFoundException unused) {
            wVar = new M8.w();
        }
        f7275h = wVar;
        java.lang.String str = M8.A.f7207i;
        java.lang.String property = java.lang.System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.m.d(property, "getProperty(...)");
        f7276i = B3.o.k(property, false);
        java.lang.ClassLoader classLoader = N8.f.class.getClassLoader();
        kotlin.jvm.internal.m.d(classLoader, "getClassLoader(...)");
        new N8.f(classLoader);
    }

    public abstract M8.v B(M8.A a2);

    public abstract M8.I G(M8.A a2, boolean z6);

    public abstract M8.K N(M8.A a2);

    public final void b(M8.A a2) {
        p078i6.l lVar = new p078i6.l();
        while (a2 != null && !t(a2)) {
            lVar.addFirst(a2);
            a2 = a2.c();
        }
        java.util.Iterator<E> it = lVar.iterator();
        while (it.hasNext()) {
            e((M8.A) it.next());
        }
    }

    public abstract void e(M8.A a2);

    public abstract void i(M8.A a2);

    public final void j(M8.A path) {
        kotlin.jvm.internal.m.e(path, "path");
        i(path);
    }

    public final boolean t(M8.A path) {
        kotlin.jvm.internal.m.e(path, "path");
        return z(path) != null;
    }

    public abstract java.util.List u(M8.A a2);

    public final M8.p v(M8.A path) throws java.io.FileNotFoundException {
        kotlin.jvm.internal.m.e(path, "path");
        M8.p pVarZ = z(path);
        if (pVarZ != null) {
            return pVarZ;
        }
        throw new java.io.FileNotFoundException("no such file: " + path);
    }

    public abstract M8.p z(M8.A a2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
