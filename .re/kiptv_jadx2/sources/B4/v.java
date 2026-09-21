package B4;

import java.security.SecureRandom;

public abstract class v {

    public static final a f735a = new a(3);

    public static byte[] a(int i3) {
        byte[] bArr = new byte[i3];
        ((SecureRandom) f735a.get()).nextBytes(bArr);
        return bArr;
    }
}
