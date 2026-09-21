package p179v4;

import C4.a;
import I3.b;
import java.nio.charset.Charset;
import java.security.SecureRandom;

public abstract class t {

    public static final int f29193a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static int a() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i3 = 0;
        while (i3 == 0) {
            secureRandom.nextBytes(bArr);
            i3 = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i3;
    }

    public static final a b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new b("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i3] = (byte) cCharAt;
        }
        return a.a(bArr);
    }
}
