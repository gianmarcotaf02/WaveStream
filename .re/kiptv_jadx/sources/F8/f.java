package F8;

/* JADX INFO: loaded from: classes4.dex */
public class f implements F8.n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final F8.e f3725f = new F8.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Class f3726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f3727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f3728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f3729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Method f3730e;

    public f(java.lang.Class cls) throws java.lang.NoSuchMethodException {
        this.f3726a = cls;
        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", java.lang.Boolean.TYPE);
        kotlin.jvm.internal.m.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f3727b = declaredMethod;
        this.f3728c = cls.getMethod("setHostname", java.lang.String.class);
        this.f3729d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f3730e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // F8.n
    public final boolean a(javax.net.ssl.SSLSocket sSLSocket) {
        return this.f3726a.isInstance(sSLSocket);
    }

    @Override // F8.n
    public final boolean b() {
        boolean z6 = E8.c.f3289e;
        return E8.c.f3289e;
    }

    @Override // F8.n
    public final java.lang.String c(javax.net.ssl.SSLSocket sSLSocket) {
        if (this.f3726a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f3729d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new java.lang.String(bArr, O7.a.f8024b);
                }
            } catch (java.lang.IllegalAccessException e6) {
                throw new java.lang.AssertionError(e6);
            } catch (java.lang.reflect.InvocationTargetException e9) {
                java.lang.Throwable cause = e9.getCause();
                if (!(cause instanceof java.lang.NullPointerException) || !kotlin.jvm.internal.m.a(((java.lang.NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new java.lang.AssertionError(e9);
                }
            }
        }
        return null;
    }

    @Override // F8.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        if (this.f3726a.isInstance(sSLSocket)) {
            try {
                this.f3727b.invoke(sSLSocket, java.lang.Boolean.TRUE);
                if (str != null) {
                    this.f3728c.invoke(sSLSocket, str);
                }
                java.lang.reflect.Method method = this.f3730e;
                E8.n nVar = E8.n.f3326a;
                method.invoke(sSLSocket, B3.o.h(protocols));
            } catch (java.lang.IllegalAccessException e6) {
                throw new java.lang.AssertionError(e6);
            } catch (java.lang.reflect.InvocationTargetException e9) {
                throw new java.lang.AssertionError(e9);
            }
        }
    }
}
