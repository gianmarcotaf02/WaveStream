package P3;

import android.os.Parcelable;
import android.os.SharedMemory;
import dalvik.system.DelegateLastClassLoader;

public abstract class a {
    public static SharedMemory c(Parcelable parcelable) {
        return (SharedMemory) parcelable;
    }

    public static DelegateLastClassLoader d(ClassLoader classLoader, String str) {
        return new DelegateLastClassLoader(str, classLoader);
    }

    public static void f() {
    }
}
