package E8;

/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile E8.n f3326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.logging.Logger f3327b;

    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[PHI: r1
  0x0071: PHI (r1v3 E8.n) = (r1v1 E8.n), (r1v4 E8.n) binds: [B:65:0x0154, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0158  */
    static {
        E8.n nVar;
        java.lang.String jvmVersion;
        E8.n jVar = null;
        if (B3.o.o()) {
            for (java.util.Map.Entry entry : F8.c.f3723b.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.String str2 = (java.lang.String) entry.getValue();
                java.util.logging.Logger logger = java.util.logging.Logger.getLogger(str);
                if (F8.c.f3722a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(android.util.Log.isLoggable(str2, 3) ? java.util.logging.Level.FINE : android.util.Log.isLoggable(str2, 4) ? java.util.logging.Level.INFO : java.util.logging.Level.WARNING);
                    logger.addHandler(F8.d.f3724a);
                }
            }
            nVar = E8.a.f3285d ? new E8.a() : null;
            if (nVar == null) {
                jVar = E8.c.f3289e ? new E8.c() : null;
                kotlin.jvm.internal.m.b(jVar);
                nVar = jVar;
            }
        } else if ("Conscrypt".equals(java.security.Security.getProviders()[0].getName())) {
            nVar = E8.h.f3305d ? new E8.h() : null;
            if (nVar == null) {
                if (!"BC".equals(java.security.Security.getProviders()[0].getName())) {
                    if (E8.e.f3302d) {
                        nVar = new E8.e();
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        if ("OpenJSSE".equals(java.security.Security.getProviders()[0].getName())) {
                            if (E8.m.f3324d) {
                                nVar = new E8.m();
                            } else {
                                nVar = null;
                            }
                            if (nVar == null) {
                                if (E8.k.f3314c) {
                                    nVar = new E8.k();
                                } else {
                                    nVar = null;
                                }
                                if (nVar == null) {
                                    jvmVersion = java.lang.System.getProperty("java.specification.version", "unknown");
                                    kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                                    if (java.lang.Integer.parseInt(jvmVersion) < 9) {
                                        java.lang.Class<?> cls = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        java.lang.Class<?> cls2 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                        java.lang.Class<?> clientProviderClass = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                        java.lang.Class<?> serverProviderClass = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                        java.lang.reflect.Method putMethod = cls.getMethod("put", javax.net.ssl.SSLSocket.class, cls2);
                                        java.lang.reflect.Method getMethod = cls.getMethod("get", javax.net.ssl.SSLSocket.class);
                                        java.lang.reflect.Method removeMethod = cls.getMethod("remove", javax.net.ssl.SSLSocket.class);
                                        kotlin.jvm.internal.m.d(putMethod, "putMethod");
                                        kotlin.jvm.internal.m.d(getMethod, "getMethod");
                                        kotlin.jvm.internal.m.d(removeMethod, "removeMethod");
                                        kotlin.jvm.internal.m.d(clientProviderClass, "clientProviderClass");
                                        kotlin.jvm.internal.m.d(serverProviderClass, "serverProviderClass");
                                        jVar = new E8.j(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
                                    }
                                    if (jVar != null) {
                                        nVar = jVar;
                                    } else {
                                        nVar = new E8.n();
                                    }
                                }
                            }
                        } else {
                            if (E8.k.f3314c) {
                                nVar = new E8.k();
                            } else {
                                nVar = null;
                            }
                            if (nVar == null) {
                                jvmVersion = java.lang.System.getProperty("java.specification.version", "unknown");
                                kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                                if (java.lang.Integer.parseInt(jvmVersion) < 9) {
                                    java.lang.Class<?> cls3 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    java.lang.Class<?> cls4 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    java.lang.Class<?> clientProviderClass2 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    java.lang.Class<?> serverProviderClass2 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    java.lang.reflect.Method putMethod2 = cls3.getMethod("put", javax.net.ssl.SSLSocket.class, cls4);
                                    java.lang.reflect.Method getMethod2 = cls3.getMethod("get", javax.net.ssl.SSLSocket.class);
                                    java.lang.reflect.Method removeMethod2 = cls3.getMethod("remove", javax.net.ssl.SSLSocket.class);
                                    kotlin.jvm.internal.m.d(putMethod2, "putMethod");
                                    kotlin.jvm.internal.m.d(getMethod2, "getMethod");
                                    kotlin.jvm.internal.m.d(removeMethod2, "removeMethod");
                                    kotlin.jvm.internal.m.d(clientProviderClass2, "clientProviderClass");
                                    kotlin.jvm.internal.m.d(serverProviderClass2, "serverProviderClass");
                                    jVar = new E8.j(putMethod2, getMethod2, removeMethod2, clientProviderClass2, serverProviderClass2);
                                }
                                if (jVar != null) {
                                    nVar = jVar;
                                } else {
                                    nVar = new E8.n();
                                }
                            }
                        }
                    }
                } else if ("OpenJSSE".equals(java.security.Security.getProviders()[0].getName())) {
                    if (E8.k.f3314c) {
                        nVar = new E8.k();
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        jvmVersion = java.lang.System.getProperty("java.specification.version", "unknown");
                        kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                        if (java.lang.Integer.parseInt(jvmVersion) < 9) {
                            java.lang.Class<?> cls5 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            java.lang.Class<?> cls6 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            java.lang.Class<?> clientProviderClass3 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            java.lang.Class<?> serverProviderClass3 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            java.lang.reflect.Method putMethod3 = cls5.getMethod("put", javax.net.ssl.SSLSocket.class, cls6);
                            java.lang.reflect.Method getMethod3 = cls5.getMethod("get", javax.net.ssl.SSLSocket.class);
                            java.lang.reflect.Method removeMethod3 = cls5.getMethod("remove", javax.net.ssl.SSLSocket.class);
                            kotlin.jvm.internal.m.d(putMethod3, "putMethod");
                            kotlin.jvm.internal.m.d(getMethod3, "getMethod");
                            kotlin.jvm.internal.m.d(removeMethod3, "removeMethod");
                            kotlin.jvm.internal.m.d(clientProviderClass3, "clientProviderClass");
                            kotlin.jvm.internal.m.d(serverProviderClass3, "serverProviderClass");
                            jVar = new E8.j(putMethod3, getMethod3, removeMethod3, clientProviderClass3, serverProviderClass3);
                        }
                        if (jVar != null) {
                            nVar = jVar;
                        } else {
                            nVar = new E8.n();
                        }
                    }
                } else {
                    if (E8.m.f3324d) {
                        nVar = new E8.m();
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        if (E8.k.f3314c) {
                            nVar = new E8.k();
                        } else {
                            nVar = null;
                        }
                        if (nVar == null) {
                            jvmVersion = java.lang.System.getProperty("java.specification.version", "unknown");
                            kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                            if (java.lang.Integer.parseInt(jvmVersion) < 9) {
                                java.lang.Class<?> cls7 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                java.lang.Class<?> cls8 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                java.lang.Class<?> clientProviderClass4 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                java.lang.Class<?> serverProviderClass4 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                java.lang.reflect.Method putMethod4 = cls7.getMethod("put", javax.net.ssl.SSLSocket.class, cls8);
                                java.lang.reflect.Method getMethod4 = cls7.getMethod("get", javax.net.ssl.SSLSocket.class);
                                java.lang.reflect.Method removeMethod4 = cls7.getMethod("remove", javax.net.ssl.SSLSocket.class);
                                kotlin.jvm.internal.m.d(putMethod4, "putMethod");
                                kotlin.jvm.internal.m.d(getMethod4, "getMethod");
                                kotlin.jvm.internal.m.d(removeMethod4, "removeMethod");
                                kotlin.jvm.internal.m.d(clientProviderClass4, "clientProviderClass");
                                kotlin.jvm.internal.m.d(serverProviderClass4, "serverProviderClass");
                                jVar = new E8.j(putMethod4, getMethod4, removeMethod4, clientProviderClass4, serverProviderClass4);
                            }
                            if (jVar != null) {
                                nVar = jVar;
                            } else {
                                nVar = new E8.n();
                            }
                        }
                    }
                }
            }
        } else if (!"BC".equals(java.security.Security.getProviders()[0].getName())) {
            if (E8.e.f3302d) {
                nVar = new E8.e();
            } else {
                nVar = null;
            }
            if (nVar == null) {
                if ("OpenJSSE".equals(java.security.Security.getProviders()[0].getName())) {
                    if (E8.k.f3314c) {
                        nVar = new E8.k();
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        jvmVersion = java.lang.System.getProperty("java.specification.version", "unknown");
                        kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                        if (java.lang.Integer.parseInt(jvmVersion) < 9) {
                            java.lang.Class<?> cls9 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            java.lang.Class<?> cls10 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            java.lang.Class<?> clientProviderClass5 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            java.lang.Class<?> serverProviderClass5 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            java.lang.reflect.Method putMethod5 = cls9.getMethod("put", javax.net.ssl.SSLSocket.class, cls10);
                            java.lang.reflect.Method getMethod5 = cls9.getMethod("get", javax.net.ssl.SSLSocket.class);
                            java.lang.reflect.Method removeMethod5 = cls9.getMethod("remove", javax.net.ssl.SSLSocket.class);
                            kotlin.jvm.internal.m.d(putMethod5, "putMethod");
                            kotlin.jvm.internal.m.d(getMethod5, "getMethod");
                            kotlin.jvm.internal.m.d(removeMethod5, "removeMethod");
                            kotlin.jvm.internal.m.d(clientProviderClass5, "clientProviderClass");
                            kotlin.jvm.internal.m.d(serverProviderClass5, "serverProviderClass");
                            jVar = new E8.j(putMethod5, getMethod5, removeMethod5, clientProviderClass5, serverProviderClass5);
                        }
                        if (jVar != null) {
                            nVar = jVar;
                        } else {
                            nVar = new E8.n();
                        }
                    }
                } else {
                    if (E8.m.f3324d) {
                        nVar = new E8.m();
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        if (E8.k.f3314c) {
                            nVar = new E8.k();
                        } else {
                            nVar = null;
                        }
                        if (nVar == null) {
                            jvmVersion = java.lang.System.getProperty("java.specification.version", "unknown");
                            kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                            if (java.lang.Integer.parseInt(jvmVersion) < 9) {
                                java.lang.Class<?> cls11 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                java.lang.Class<?> cls12 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                java.lang.Class<?> clientProviderClass6 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                java.lang.Class<?> serverProviderClass6 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                java.lang.reflect.Method putMethod6 = cls11.getMethod("put", javax.net.ssl.SSLSocket.class, cls12);
                                java.lang.reflect.Method getMethod6 = cls11.getMethod("get", javax.net.ssl.SSLSocket.class);
                                java.lang.reflect.Method removeMethod6 = cls11.getMethod("remove", javax.net.ssl.SSLSocket.class);
                                kotlin.jvm.internal.m.d(putMethod6, "putMethod");
                                kotlin.jvm.internal.m.d(getMethod6, "getMethod");
                                kotlin.jvm.internal.m.d(removeMethod6, "removeMethod");
                                kotlin.jvm.internal.m.d(clientProviderClass6, "clientProviderClass");
                                kotlin.jvm.internal.m.d(serverProviderClass6, "serverProviderClass");
                                jVar = new E8.j(putMethod6, getMethod6, removeMethod6, clientProviderClass6, serverProviderClass6);
                            }
                            if (jVar != null) {
                                nVar = jVar;
                            } else {
                                nVar = new E8.n();
                            }
                        }
                    }
                }
            }
        } else if ("OpenJSSE".equals(java.security.Security.getProviders()[0].getName())) {
            if (E8.k.f3314c) {
                nVar = new E8.k();
            } else {
                nVar = null;
            }
            if (nVar == null) {
                jvmVersion = java.lang.System.getProperty("java.specification.version", "unknown");
                try {
                    kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                    if (java.lang.Integer.parseInt(jvmVersion) < 9) {
                        try {
                            java.lang.Class<?> cls13 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            java.lang.Class<?> cls14 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            java.lang.Class<?> clientProviderClass7 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            java.lang.Class<?> serverProviderClass7 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            java.lang.reflect.Method putMethod7 = cls13.getMethod("put", javax.net.ssl.SSLSocket.class, cls14);
                            java.lang.reflect.Method getMethod7 = cls13.getMethod("get", javax.net.ssl.SSLSocket.class);
                            java.lang.reflect.Method removeMethod7 = cls13.getMethod("remove", javax.net.ssl.SSLSocket.class);
                            kotlin.jvm.internal.m.d(putMethod7, "putMethod");
                            kotlin.jvm.internal.m.d(getMethod7, "getMethod");
                            kotlin.jvm.internal.m.d(removeMethod7, "removeMethod");
                            kotlin.jvm.internal.m.d(clientProviderClass7, "clientProviderClass");
                            kotlin.jvm.internal.m.d(serverProviderClass7, "serverProviderClass");
                            jVar = new E8.j(putMethod7, getMethod7, removeMethod7, clientProviderClass7, serverProviderClass7);
                        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
                        }
                    }
                } catch (java.lang.NumberFormatException unused2) {
                }
                if (jVar != null) {
                    nVar = jVar;
                } else {
                    nVar = new E8.n();
                }
            }
        } else {
            if (E8.m.f3324d) {
                nVar = new E8.m();
            } else {
                nVar = null;
            }
            if (nVar == null) {
                if (E8.k.f3314c) {
                    nVar = new E8.k();
                } else {
                    nVar = null;
                }
                if (nVar == null) {
                    jvmVersion = java.lang.System.getProperty("java.specification.version", "unknown");
                    kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                    if (java.lang.Integer.parseInt(jvmVersion) < 9) {
                        java.lang.Class<?> cls15 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        java.lang.Class<?> cls16 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        java.lang.Class<?> clientProviderClass8 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        java.lang.Class<?> serverProviderClass8 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        java.lang.reflect.Method putMethod8 = cls15.getMethod("put", javax.net.ssl.SSLSocket.class, cls16);
                        java.lang.reflect.Method getMethod8 = cls15.getMethod("get", javax.net.ssl.SSLSocket.class);
                        java.lang.reflect.Method removeMethod8 = cls15.getMethod("remove", javax.net.ssl.SSLSocket.class);
                        kotlin.jvm.internal.m.d(putMethod8, "putMethod");
                        kotlin.jvm.internal.m.d(getMethod8, "getMethod");
                        kotlin.jvm.internal.m.d(removeMethod8, "removeMethod");
                        kotlin.jvm.internal.m.d(clientProviderClass8, "clientProviderClass");
                        kotlin.jvm.internal.m.d(serverProviderClass8, "serverProviderClass");
                        jVar = new E8.j(putMethod8, getMethod8, removeMethod8, clientProviderClass8, serverProviderClass8);
                    }
                    if (jVar != null) {
                        nVar = jVar;
                    } else {
                        nVar = new E8.n();
                    }
                }
            }
        }
        f3326a = nVar;
        f3327b = java.util.logging.Logger.getLogger(w8.s.class.getName());
    }

    public static void i(java.lang.String message, java.lang.Throwable th, int i3) {
        kotlin.jvm.internal.m.e(message, "message");
        f3327b.log(i3 == 5 ? java.util.logging.Level.WARNING : java.util.logging.Level.INFO, message, th);
    }

    public N3.a b(javax.net.ssl.X509TrustManager x509TrustManager) {
        return new J8.a(c(x509TrustManager));
    }

    public J8.d c(javax.net.ssl.X509TrustManager x509TrustManager) {
        java.security.cert.X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        kotlin.jvm.internal.m.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new J8.b((java.security.cert.X509Certificate[]) java.util.Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
    }

    public void e(java.net.Socket socket, java.net.InetSocketAddress address, int i3) throws java.io.IOException {
        kotlin.jvm.internal.m.e(address, "address");
        socket.connect(address, i3);
    }

    public java.lang.String f(javax.net.ssl.SSLSocket sSLSocket) {
        return null;
    }

    public java.lang.Object g() {
        if (f3327b.isLoggable(java.util.logging.Level.FINE)) {
            return new java.lang.Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(java.lang.String hostname) {
        kotlin.jvm.internal.m.e(hostname, "hostname");
        return true;
    }

    public void j(java.lang.Object obj, java.lang.String message) {
        kotlin.jvm.internal.m.e(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(message, (java.lang.Throwable) obj, 5);
    }

    public javax.net.ssl.SSLContext k() throws java.security.NoSuchAlgorithmException {
        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
        kotlin.jvm.internal.m.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public javax.net.ssl.SSLSocketFactory l(javax.net.ssl.X509TrustManager x509TrustManager) {
        try {
            javax.net.ssl.SSLContext sSLContextK = k();
            sSLContextK.init(null, new javax.net.ssl.TrustManager[]{x509TrustManager}, null);
            javax.net.ssl.SSLSocketFactory socketFactory = sSLContextK.getSocketFactory();
            kotlin.jvm.internal.m.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (java.security.GeneralSecurityException e6) {
            throw new java.lang.AssertionError("No System TLS: " + e6, e6);
        }
    }

    public javax.net.ssl.X509TrustManager m() throws java.security.NoSuchAlgorithmException, java.security.KeyStoreException {
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((java.security.KeyStore) null);
        javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.m.b(trustManagers);
        if (trustManagers.length == 1) {
            javax.net.ssl.TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                kotlin.jvm.internal.m.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (javax.net.ssl.X509TrustManager) trustManager;
            }
        }
        java.lang.String string = java.util.Arrays.toString(trustManagers);
        kotlin.jvm.internal.m.d(string, "toString(this)");
        throw new java.lang.IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }

    public final java.lang.String toString() {
        return getClass().getSimpleName();
    }

    public void a(javax.net.ssl.SSLSocket sSLSocket) {
    }
}
