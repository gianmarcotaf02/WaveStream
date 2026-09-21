package E8;

import O7.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p078i6.q;
import w8.t;

public final class k extends n {

    public static final boolean f3314c;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numZ0 = property != null ? x.z0(property) : null;
        boolean z6 = false;
        if (numZ0 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z6 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numZ0.intValue() >= 9) {
            z6 = true;
        }
        f3314c = z6;
    }

    @Override
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
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
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override
    public final String f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
