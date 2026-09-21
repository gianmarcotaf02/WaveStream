package p209z7;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static java.io.InputStream a(java.lang.String path) throws java.io.IOException {
        kotlin.jvm.internal.m.e(path, "path");
        java.lang.ClassLoader classLoader = p209z7.d.class.getClassLoader();
        if (classLoader == null) {
            return java.lang.ClassLoader.getSystemResourceAsStream(path);
        }
        java.net.URL resource = classLoader.getResource(path);
        if (resource == null) {
            return null;
        }
        java.net.URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }
}
