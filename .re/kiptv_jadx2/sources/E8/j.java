package E8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p078i6.q;
import w8.t;

public final class j extends n {

    public final Method f3310c;

    public final Method f3311d;

    public final Method f3312e;

    public final Class f3313f;
    public final Class g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f3310c = method;
        this.f3311d = method2;
        this.f3312e = method3;
        this.f3313f = cls;
        this.g = cls2;
    }

    @Override
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f3312e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e6) {
            throw new AssertionError("failed to remove ALPN", e6);
        } catch (InvocationTargetException e9) {
            throw new AssertionError("failed to remove ALPN", e9);
        }
    }

    @Override
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((t) obj) != t.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q.I0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((t) it.next()).f30653h);
        }
        try {
            this.f3310c.invoke(null, sSLSocket, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f3313f, this.g}, new i(arrayList2)));
        } catch (IllegalAccessException e6) {
            throw new AssertionError("failed to set ALPN", e6);
        } catch (InvocationTargetException e9) {
            throw new AssertionError("failed to set ALPN", e9);
        }
    }

    @Override
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f3311d.invoke(null, sSLSocket));
            kotlin.jvm.internal.m.c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            i iVar = (i) invocationHandler;
            boolean z6 = iVar.f3308b;
            if (!z6 && iVar.f3309c == null) {
                n.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null, 4);
                return null;
            }
            if (z6) {
                return null;
            }
            return iVar.f3309c;
        } catch (IllegalAccessException e6) {
            throw new AssertionError("failed to get ALPN selected protocol", e6);
        } catch (InvocationTargetException e9) {
            throw new AssertionError("failed to get ALPN selected protocol", e9);
        }
    }
}
