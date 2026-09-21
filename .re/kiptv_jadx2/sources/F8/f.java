package F8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

public class f implements n {

    public static final e f3725f = new e();

    public final Class f3726a;

    public final Method f3727b;

    public final Method f3728c;

    public final Method f3729d;

    public final Method f3730e;

    public f(Class cls) throws NoSuchMethodException {
        this.f3726a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        kotlin.jvm.internal.m.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f3727b = declaredMethod;
        this.f3728c = cls.getMethod("setHostname", String.class);
        this.f3729d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f3730e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override
    public final boolean a(SSLSocket sSLSocket) {
        return this.f3726a.isInstance(sSLSocket);
    }

    @Override
    public final boolean b() {
        boolean z6 = E8.c.f3289e;
        return E8.c.f3289e;
    }

    @Override
    public final String c(SSLSocket sSLSocket) {
        if (this.f3726a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f3729d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, O7.a.f8024b);
                }
            } catch (IllegalAccessException e6) {
                throw new AssertionError(e6);
            } catch (InvocationTargetException e9) {
                Throwable cause = e9.getCause();
                if (!(cause instanceof NullPointerException) || !kotlin.jvm.internal.m.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e9);
                }
            }
        }
        return null;
    }

    @Override
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        if (this.f3726a.isInstance(sSLSocket)) {
            try {
                this.f3727b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f3728c.invoke(sSLSocket, str);
                }
                Method method = this.f3730e;
                E8.n nVar = E8.n.f3326a;
                method.invoke(sSLSocket, B3.o.h(protocols));
            } catch (IllegalAccessException e6) {
                throw new AssertionError(e6);
            } catch (InvocationTargetException e9) {
                throw new AssertionError(e9);
            }
        }
    }
}
