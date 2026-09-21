package X3;

import android.util.Base64;
import java.security.SecureRandom;

public abstract class f {

    public static final SecureRandom f10850a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f10850a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
