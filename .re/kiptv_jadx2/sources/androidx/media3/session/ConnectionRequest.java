package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;

class ConnectionRequest {
    public final Bundle connectionHints;
    public final int controllerInterfaceVersion;
    public final int libraryVersion;
    public final int maxCommandsForMediaItems;
    public final String packageName;
    public final int pid;
    private static final String FIELD_LIBRARY_VERSION = Util.intToStringMaxRadix(0);
    private static final String FIELD_PACKAGE_NAME = Util.intToStringMaxRadix(1);
    private static final String FIELD_PID = Util.intToStringMaxRadix(2);
    private static final String FIELD_CONNECTION_HINTS = Util.intToStringMaxRadix(3);
    private static final String FIELD_CONTROLLER_INTERFACE_VERSION = Util.intToStringMaxRadix(4);
    private static final String FIELD_MAX_COMMANDS_FOR_MEDIA_ITEM = Util.intToStringMaxRadix(5);

    public ConnectionRequest(String str, int i3, Bundle bundle, int i9) {
        this(MediaLibraryInfo.VERSION_INT, 9, str, i3, new Bundle(bundle), i9);
    }

    public static ConnectionRequest fromBundle(Bundle bundle) {
        int i3 = bundle.getInt(FIELD_LIBRARY_VERSION, 0);
        int i9 = bundle.getInt(FIELD_CONTROLLER_INTERFACE_VERSION, 0);
        String string = bundle.getString(FIELD_PACKAGE_NAME);
        string.getClass();
        String str = FIELD_PID;
        AbstractC1864o0.L(bundle.containsKey(str));
        int i10 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(FIELD_CONNECTION_HINTS);
        int i11 = bundle.getInt(FIELD_MAX_COMMANDS_FOR_MEDIA_ITEM, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new ConnectionRequest(i3, i9, string, i10, bundle2, i11);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_LIBRARY_VERSION, this.libraryVersion);
        bundle.putString(FIELD_PACKAGE_NAME, this.packageName);
        bundle.putInt(FIELD_PID, this.pid);
        bundle.putBundle(FIELD_CONNECTION_HINTS, this.connectionHints);
        bundle.putInt(FIELD_CONTROLLER_INTERFACE_VERSION, this.controllerInterfaceVersion);
        bundle.putInt(FIELD_MAX_COMMANDS_FOR_MEDIA_ITEM, this.maxCommandsForMediaItems);
        return bundle;
    }

    private ConnectionRequest(int i3, int i9, String str, int i10, Bundle bundle, int i11) {
        this.libraryVersion = i3;
        this.controllerInterfaceVersion = i9;
        this.packageName = str;
        this.pid = i10;
        this.connectionHints = bundle;
        this.maxCommandsForMediaItems = i11;
    }
}
