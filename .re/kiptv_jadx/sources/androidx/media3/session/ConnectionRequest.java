package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class ConnectionRequest {
    public final android.os.Bundle connectionHints;
    public final int controllerInterfaceVersion;
    public final int libraryVersion;
    public final int maxCommandsForMediaItems;
    public final java.lang.String packageName;
    public final int pid;
    private static final java.lang.String FIELD_LIBRARY_VERSION = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_PACKAGE_NAME = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_PID = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_CONNECTION_HINTS = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_CONTROLLER_INTERFACE_VERSION = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String FIELD_MAX_COMMANDS_FOR_MEDIA_ITEM = androidx.media3.common.util.Util.intToStringMaxRadix(5);

    public ConnectionRequest(java.lang.String str, int i3, android.os.Bundle bundle, int i9) {
        this(androidx.media3.common.MediaLibraryInfo.VERSION_INT, 9, str, i3, new android.os.Bundle(bundle), i9);
    }

    public static androidx.media3.session.ConnectionRequest fromBundle(android.os.Bundle bundle) {
        int i3 = bundle.getInt(FIELD_LIBRARY_VERSION, 0);
        int i9 = bundle.getInt(FIELD_CONTROLLER_INTERFACE_VERSION, 0);
        java.lang.String string = bundle.getString(FIELD_PACKAGE_NAME);
        string.getClass();
        java.lang.String str = FIELD_PID;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(bundle.containsKey(str));
        int i10 = bundle.getInt(str);
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_CONNECTION_HINTS);
        int i11 = bundle.getInt(FIELD_MAX_COMMANDS_FOR_MEDIA_ITEM, 0);
        if (bundle2 == null) {
            bundle2 = android.os.Bundle.EMPTY;
        }
        return new androidx.media3.session.ConnectionRequest(i3, i9, string, i10, bundle2, i11);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_LIBRARY_VERSION, this.libraryVersion);
        bundle.putString(FIELD_PACKAGE_NAME, this.packageName);
        bundle.putInt(FIELD_PID, this.pid);
        bundle.putBundle(FIELD_CONNECTION_HINTS, this.connectionHints);
        bundle.putInt(FIELD_CONTROLLER_INTERFACE_VERSION, this.controllerInterfaceVersion);
        bundle.putInt(FIELD_MAX_COMMANDS_FOR_MEDIA_ITEM, this.maxCommandsForMediaItems);
        return bundle;
    }

    private ConnectionRequest(int i3, int i9, java.lang.String str, int i10, android.os.Bundle bundle, int i11) {
        this.libraryVersion = i3;
        this.controllerInterfaceVersion = i9;
        this.packageName = str;
        this.pid = i10;
        this.connectionHints = bundle;
        this.maxCommandsForMediaItems = i11;
    }
}
