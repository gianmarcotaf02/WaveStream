package t8;

public final class C2861k {

    public static final char[] f28625a = new char[117];

    public static final byte[] f28626b = new byte[126];

    static {
        int i3 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        while (true) {
            byte[] bArr = f28626b;
            if (i3 >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i3] = 127;
            i3++;
        }
    }

    public static void a(char c9, int i3) {
        if (c9 != 'u') {
            f28625a[c9] = (char) i3;
        }
    }
}
