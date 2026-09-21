package p107m4;

import java.util.Arrays;

public abstract class c {

    public static final byte[] f25395a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i3 = 0; i3 < 10; i3++) {
            bArr[i3 + 48] = (byte) i3;
        }
        for (int i9 = 0; i9 < 26; i9++) {
            byte b9 = (byte) (i9 + 10);
            bArr[i9 + 65] = b9;
            bArr[i9 + 97] = b9;
        }
        f25395a = bArr;
    }
}
