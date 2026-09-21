package P3;

/* JADX INFO: loaded from: classes.dex */
public final class f extends dalvik.system.PathClassLoader {
    @Override // java.lang.ClassLoader
    public final java.lang.Class loadClass(java.lang.String str, boolean z6) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (java.lang.ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z6);
    }
}
