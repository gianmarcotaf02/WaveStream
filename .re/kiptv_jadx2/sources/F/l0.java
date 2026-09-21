package F;

import android.os.Build;
import java.util.Locale;

public abstract class l0 {

    public static final k0 f3473a;

    static {
        k0 k0Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            if (lowerCase.equals("robolectric")) {
                k0Var = new k0();
            } else {
                k0Var = null;
            }
        } else {
            k0Var = null;
        }
        f3473a = k0Var;
    }
}
