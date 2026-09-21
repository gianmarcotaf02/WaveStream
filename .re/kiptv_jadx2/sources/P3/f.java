package P3;

import dalvik.system.PathClassLoader;

public final class f extends PathClassLoader {
    @Override
    public final Class loadClass(String str, boolean z6) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z6);
    }
}
