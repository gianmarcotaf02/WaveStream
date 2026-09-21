package p110m7;

public abstract class D {

    public static final B f25446a = new B();

    public static final C f25447b = new C();

    public static int a(int i3, int i9) {
        if (i3 > -12 || i9 > -65) {
            return -1;
        }
        return i3 ^ (i9 << 8);
    }

    public static int b(byte[] bArr, int i3, int i9) {
        byte b9 = bArr[i3 - 1];
        int i10 = i9 - i3;
        if (i10 == 0) {
            if (b9 > -12) {
                return -1;
            }
            return b9;
        }
        if (i10 == 1) {
            return a(b9, bArr[i3]);
        }
        if (i10 != 2) {
            throw new AssertionError();
        }
        byte b10 = bArr[i3];
        byte b11 = bArr[i3 + 1];
        if (b9 > -12 || b10 > -65 || b11 > -65) {
            return -1;
        }
        return (b11 << 16) ^ ((b10 << 8) ^ b9);
    }

    public static int c(byte[] bArr, int i3, int i9) {
        while (i3 < i9 && bArr[i3] >= 0) {
            i3++;
        }
        if (i3 >= i9) {
            return 0;
        }
        while (i3 < i9) {
            int i10 = i3 + 1;
            byte b9 = bArr[i3];
            if (b9 >= 0) {
                i3 = i10;
            } else if (b9 < -32) {
                if (i10 >= i9) {
                    return b9;
                }
                if (b9 < -62) {
                    return -1;
                }
                i3 += 2;
                if (bArr[i10] > -65) {
                    return -1;
                }
            } else if (b9 < -16) {
                if (i10 >= i9 - 1) {
                    return b(bArr, i10, i9);
                }
                int i11 = i3 + 2;
                byte b10 = bArr[i10];
                if (b10 > -65) {
                    return -1;
                }
                if (b9 == -32 && b10 < -96) {
                    return -1;
                }
                if (b9 == -19 && b10 >= -96) {
                    return -1;
                }
                i3 += 3;
                if (bArr[i11] > -65) {
                    return -1;
                }
            } else {
                if (i10 >= i9 - 2) {
                    return b(bArr, i10, i9);
                }
                int i12 = i3 + 2;
                byte b11 = bArr[i10];
                if (b11 > -65) {
                    return -1;
                }
                if ((((b11 + 112) + (b9 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i13 = i3 + 3;
                if (bArr[i12] > -65) {
                    return -1;
                }
                i3 += 4;
                if (bArr[i13] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
