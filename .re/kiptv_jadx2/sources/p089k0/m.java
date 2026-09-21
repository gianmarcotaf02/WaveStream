package p089k0;

import android.os.Looper;

public abstract class m {

    public static final long f24435a;

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        f24435a = id;
    }
}
