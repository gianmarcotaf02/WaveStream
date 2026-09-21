package E8;

import B3.o;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import w8.s;

public class n {

    public static volatile n f3326a;

    public static final Logger f3327b;

    static {
        n nVar;
        String jvmVersion;
        n jVar = null;
        if (o.o()) {
            for (Map.Entry entry : F8.c.f3723b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (F8.c.f3722a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(F8.d.f3724a);
                }
            }
            nVar = a.f3285d ? new a() : null;
            if (nVar == null) {
                jVar = c.f3289e ? new c() : null;
                kotlin.jvm.internal.m.b(jVar);
                nVar = jVar;
            }
        } else if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
            nVar = h.f3305d ? new h() : null;
            if (nVar == null) {
                if (!"BC".equals(Security.getProviders()[0].getName())) {
                    if (e.f3302d) {
                        nVar = new e();
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                            if (m.f3324d) {
                                nVar = new m();
                            } else {
                                nVar = null;
                            }
                            if (nVar == null) {
                                if (k.f3314c) {
                                    nVar = new k();
                                } else {
                                    nVar = null;
                                }
                                if (nVar == null) {
                                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                                    kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                                    if (Integer.parseInt(jvmVersion) < 9) {
                                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                        Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                        Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                        Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                                        Method getMethod = cls.getMethod("get", SSLSocket.class);
                                        Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                                        kotlin.jvm.internal.m.d(putMethod, "putMethod");
                                        kotlin.jvm.internal.m.d(getMethod, "getMethod");
                                        kotlin.jvm.internal.m.d(removeMethod, "removeMethod");
                                        kotlin.jvm.internal.m.d(clientProviderClass, "clientProviderClass");
                                        kotlin.jvm.internal.m.d(serverProviderClass, "serverProviderClass");
                                        jVar = new j(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
                                    }
                                    if (jVar != null) {
                                        nVar = jVar;
                                    } else {
                                        nVar = new n();
                                    }
                                }
                            }
                        } else {
                            if (k.f3314c) {
                                nVar = new k();
                            } else {
                                nVar = null;
                            }
                            if (nVar == null) {
                                jvmVersion = System.getProperty("java.specification.version", "unknown");
                                kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                                if (Integer.parseInt(jvmVersion) < 9) {
                                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    Class<?> clientProviderClass2 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    Class<?> serverProviderClass2 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    Method putMethod2 = cls3.getMethod("put", SSLSocket.class, cls4);
                                    Method getMethod2 = cls3.getMethod("get", SSLSocket.class);
                                    Method removeMethod2 = cls3.getMethod("remove", SSLSocket.class);
                                    kotlin.jvm.internal.m.d(putMethod2, "putMethod");
                                    kotlin.jvm.internal.m.d(getMethod2, "getMethod");
                                    kotlin.jvm.internal.m.d(removeMethod2, "removeMethod");
                                    kotlin.jvm.internal.m.d(clientProviderClass2, "clientProviderClass");
                                    kotlin.jvm.internal.m.d(serverProviderClass2, "serverProviderClass");
                                    jVar = new j(putMethod2, getMethod2, removeMethod2, clientProviderClass2, serverProviderClass2);
                                }
                                if (jVar != null) {
                                    nVar = jVar;
                                } else {
                                    nVar = new n();
                                }
                            }
                        }
                    }
                } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    if (k.f3314c) {
                        nVar = new k();
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls6 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod3 = cls5.getMethod("put", SSLSocket.class, cls6);
                            Method getMethod3 = cls5.getMethod("get", SSLSocket.class);
                            Method removeMethod3 = cls5.getMethod("remove", SSLSocket.class);
                            kotlin.jvm.internal.m.d(putMethod3, "putMethod");
                            kotlin.jvm.internal.m.d(getMethod3, "getMethod");
                            kotlin.jvm.internal.m.d(removeMethod3, "removeMethod");
                            kotlin.jvm.internal.m.d(clientProviderClass3, "clientProviderClass");
                            kotlin.jvm.internal.m.d(serverProviderClass3, "serverProviderClass");
                            jVar = new j(putMethod3, getMethod3, removeMethod3, clientProviderClass3, serverProviderClass3);
                        }
                        if (jVar != null) {
                            nVar = jVar;
                        } else {
                            nVar = new n();
                        }
                    }
                } else {
                    if (m.f3324d) {
                        nVar = new m();
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        if (k.f3314c) {
                            nVar = new k();
                        } else {
                            nVar = null;
                        }
                        if (nVar == null) {
                            jvmVersion = System.getProperty("java.specification.version", "unknown");
                            kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                            if (Integer.parseInt(jvmVersion) < 9) {
                                Class<?> cls7 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls8 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                Class<?> clientProviderClass4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                Class<?> serverProviderClass4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                Method putMethod4 = cls7.getMethod("put", SSLSocket.class, cls8);
                                Method getMethod4 = cls7.getMethod("get", SSLSocket.class);
                                Method removeMethod4 = cls7.getMethod("remove", SSLSocket.class);
                                kotlin.jvm.internal.m.d(putMethod4, "putMethod");
                                kotlin.jvm.internal.m.d(getMethod4, "getMethod");
                                kotlin.jvm.internal.m.d(removeMethod4, "removeMethod");
                                kotlin.jvm.internal.m.d(clientProviderClass4, "clientProviderClass");
                                kotlin.jvm.internal.m.d(serverProviderClass4, "serverProviderClass");
                                jVar = new j(putMethod4, getMethod4, removeMethod4, clientProviderClass4, serverProviderClass4);
                            }
                            if (jVar != null) {
                                nVar = jVar;
                            } else {
                                nVar = new n();
                            }
                        }
                    }
                }
            }
        } else if (!"BC".equals(Security.getProviders()[0].getName())) {
            if (e.f3302d) {
                nVar = new e();
            } else {
                nVar = null;
            }
            if (nVar == null) {
                if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    if (k.f3314c) {
                        nVar = new k();
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls9 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls10 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass5 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass5 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod5 = cls9.getMethod("put", SSLSocket.class, cls10);
                            Method getMethod5 = cls9.getMethod("get", SSLSocket.class);
                            Method removeMethod5 = cls9.getMethod("remove", SSLSocket.class);
                            kotlin.jvm.internal.m.d(putMethod5, "putMethod");
                            kotlin.jvm.internal.m.d(getMethod5, "getMethod");
                            kotlin.jvm.internal.m.d(removeMethod5, "removeMethod");
                            kotlin.jvm.internal.m.d(clientProviderClass5, "clientProviderClass");
                            kotlin.jvm.internal.m.d(serverProviderClass5, "serverProviderClass");
                            jVar = new j(putMethod5, getMethod5, removeMethod5, clientProviderClass5, serverProviderClass5);
                        }
                        if (jVar != null) {
                            nVar = jVar;
                        } else {
                            nVar = new n();
                        }
                    }
                } else {
                    if (m.f3324d) {
                        nVar = new m();
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        if (k.f3314c) {
                            nVar = new k();
                        } else {
                            nVar = null;
                        }
                        if (nVar == null) {
                            jvmVersion = System.getProperty("java.specification.version", "unknown");
                            kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                            if (Integer.parseInt(jvmVersion) < 9) {
                                Class<?> cls11 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls12 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                Class<?> clientProviderClass6 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                Class<?> serverProviderClass6 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                Method putMethod6 = cls11.getMethod("put", SSLSocket.class, cls12);
                                Method getMethod6 = cls11.getMethod("get", SSLSocket.class);
                                Method removeMethod6 = cls11.getMethod("remove", SSLSocket.class);
                                kotlin.jvm.internal.m.d(putMethod6, "putMethod");
                                kotlin.jvm.internal.m.d(getMethod6, "getMethod");
                                kotlin.jvm.internal.m.d(removeMethod6, "removeMethod");
                                kotlin.jvm.internal.m.d(clientProviderClass6, "clientProviderClass");
                                kotlin.jvm.internal.m.d(serverProviderClass6, "serverProviderClass");
                                jVar = new j(putMethod6, getMethod6, removeMethod6, clientProviderClass6, serverProviderClass6);
                            }
                            if (jVar != null) {
                                nVar = jVar;
                            } else {
                                nVar = new n();
                            }
                        }
                    }
                }
            }
        } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
            if (k.f3314c) {
                nVar = new k();
            } else {
                nVar = null;
            }
            if (nVar == null) {
                jvmVersion = System.getProperty("java.specification.version", "unknown");
                try {
                    kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        try {
                            Class<?> cls13 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls14 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod7 = cls13.getMethod("put", SSLSocket.class, cls14);
                            Method getMethod7 = cls13.getMethod("get", SSLSocket.class);
                            Method removeMethod7 = cls13.getMethod("remove", SSLSocket.class);
                            kotlin.jvm.internal.m.d(putMethod7, "putMethod");
                            kotlin.jvm.internal.m.d(getMethod7, "getMethod");
                            kotlin.jvm.internal.m.d(removeMethod7, "removeMethod");
                            kotlin.jvm.internal.m.d(clientProviderClass7, "clientProviderClass");
                            kotlin.jvm.internal.m.d(serverProviderClass7, "serverProviderClass");
                            jVar = new j(putMethod7, getMethod7, removeMethod7, clientProviderClass7, serverProviderClass7);
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
                if (jVar != null) {
                    nVar = jVar;
                } else {
                    nVar = new n();
                }
            }
        } else {
            if (m.f3324d) {
                nVar = new m();
            } else {
                nVar = null;
            }
            if (nVar == null) {
                if (k.f3314c) {
                    nVar = new k();
                } else {
                    nVar = null;
                }
                if (nVar == null) {
                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                    kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        Class<?> cls15 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls16 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> clientProviderClass8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> serverProviderClass8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method putMethod8 = cls15.getMethod("put", SSLSocket.class, cls16);
                        Method getMethod8 = cls15.getMethod("get", SSLSocket.class);
                        Method removeMethod8 = cls15.getMethod("remove", SSLSocket.class);
                        kotlin.jvm.internal.m.d(putMethod8, "putMethod");
                        kotlin.jvm.internal.m.d(getMethod8, "getMethod");
                        kotlin.jvm.internal.m.d(removeMethod8, "removeMethod");
                        kotlin.jvm.internal.m.d(clientProviderClass8, "clientProviderClass");
                        kotlin.jvm.internal.m.d(serverProviderClass8, "serverProviderClass");
                        jVar = new j(putMethod8, getMethod8, removeMethod8, clientProviderClass8, serverProviderClass8);
                    }
                    if (jVar != null) {
                        nVar = jVar;
                    } else {
                        nVar = new n();
                    }
                }
            }
        }
        f3326a = nVar;
        f3327b = Logger.getLogger(s.class.getName());
    }

    public static void i(String message, Throwable th, int i3) {
        kotlin.jvm.internal.m.e(message, "message");
        f3327b.log(i3 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public N3.a b(X509TrustManager x509TrustManager) {
        return new J8.a(c(x509TrustManager));
    }

    public J8.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        kotlin.jvm.internal.m.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new J8.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
    }

    public void e(Socket socket, InetSocketAddress address, int i3) throws IOException {
        kotlin.jvm.internal.m.e(address, "address");
        socket.connect(address, i3);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f3327b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String hostname) {
        kotlin.jvm.internal.m.e(hostname, "hostname");
        return true;
    }

    public void j(Object obj, String message) {
        kotlin.jvm.internal.m.e(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(message, (Throwable) obj, 5);
    }

    public SSLContext k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        kotlin.jvm.internal.m.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextK = k();
            sSLContextK.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextK.getSocketFactory();
            kotlin.jvm.internal.m.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e6) {
            throw new AssertionError("No System TLS: " + e6, e6);
        }
    }

    public X509TrustManager m() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.m.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                kotlin.jvm.internal.m.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        kotlin.jvm.internal.m.d(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
