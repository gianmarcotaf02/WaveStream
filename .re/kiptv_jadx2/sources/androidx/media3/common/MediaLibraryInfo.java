package androidx.media3.common;

import java.util.HashSet;

public final class MediaLibraryInfo {
    public static final int INTERFACE_VERSION = 9;
    public static final String TAG = "AndroidXMedia3";
    public static final boolean TRACE_ENABLED = true;
    public static final String VERSION = "1.10.1";
    public static final int VERSION_INT = 1010001300;
    public static final String VERSION_SLASHY = "AndroidXMedia3/1.10.1";
    private static final HashSet<String> registeredModules = new HashSet<>();
    private static String registeredModulesString = "media3.common";

    private MediaLibraryInfo() {
    }

    public static synchronized void registerModule(String str) {
        if (registeredModules.add(str)) {
            registeredModulesString += ", " + str;
        }
    }

    public static synchronized String registeredModules() {
        return registeredModulesString;
    }
}
