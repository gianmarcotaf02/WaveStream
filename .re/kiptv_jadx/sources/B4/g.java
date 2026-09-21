package B4;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.nio.charset.Charset f697a = java.nio.charset.Charset.forName("UTF-8");

    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        if (r7 != 4) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(java.lang.String str) {
        byte[] bytes = str.getBytes(f697a);
        int length = bytes.length;
        int i3 = (length * 3) / 4;
        byte[] bArr = new byte[i3];
        int[] iArr = B4.f.g;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i9 < length) {
            if (i10 == 0) {
                while (true) {
                    int i13 = i9 + 4;
                    if (i13 > length || (i11 = (iArr[bytes[i9] & 255] << 18) | (iArr[bytes[i9 + 1] & 255] << 12) | (iArr[bytes[i9 + 2] & 255] << 6) | iArr[bytes[i9 + 3] & 255]) < 0) {
                        break;
                    }
                    bArr[i12 + 2] = (byte) i11;
                    bArr[i12 + 1] = (byte) (i11 >> 8);
                    bArr[i12] = (byte) (i11 >> 16);
                    i12 += 3;
                    i9 = i13;
                }
                if (i9 >= length) {
                    break;
                }
                throw new java.lang.IllegalArgumentException("bad base-64");
            }
            int i14 = i9 + 1;
            int i15 = iArr[bytes[i9] & 255];
            if (i10 != 0) {
                if (i10 == 1) {
                    if (i15 >= 0) {
                        i15 |= i11 << 6;
                    } else if (i15 != -1) {
                        throw new java.lang.IllegalArgumentException("bad base-64");
                    }
                    i9 = i14;
                } else if (i10 == 2) {
                    if (i15 >= 0) {
                        i15 |= i11 << 6;
                    } else if (i15 == -2) {
                        bArr[i12] = (byte) (i11 >> 4);
                        i10 = 4;
                        i12++;
                    } else if (i15 != -1) {
                        throw new java.lang.IllegalArgumentException("bad base-64");
                    }
                    i9 = i14;
                } else if (i10 == 3) {
                    if (i15 >= 0) {
                        i15 |= i11 << 6;
                        bArr[i12 + 2] = (byte) i15;
                        bArr[i12 + 1] = (byte) (i15 >> 8);
                        bArr[i12] = (byte) (i15 >> 16);
                        i12 += 3;
                        i10 = 0;
                    } else if (i15 == -2) {
                        bArr[i12 + 1] = (byte) (i11 >> 2);
                        bArr[i12] = (byte) (i11 >> 10);
                        i12 += 2;
                        i10 = 5;
                    } else if (i15 != -1) {
                        throw new java.lang.IllegalArgumentException("bad base-64");
                    }
                    i9 = i14;
                } else if (i10 == 4) {
                    if (i15 == -2) {
                        i10++;
                    } else if (i15 != -1) {
                        throw new java.lang.IllegalArgumentException("bad base-64");
                    }
                    i9 = i14;
                } else {
                    if (i10 == 5 && i15 != -1) {
                        throw new java.lang.IllegalArgumentException("bad base-64");
                    }
                    i9 = i14;
                }
                i10++;
            } else {
                if (i15 >= 0) {
                    i10++;
                } else if (i15 != -1) {
                    throw new java.lang.IllegalArgumentException("bad base-64");
                }
                i9 = i14;
            }
            i11 = i15;
            i9 = i14;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                bArr[i12] = (byte) (i11 >> 4);
                i12++;
            } else if (i10 == 3) {
                int i16 = i12 + 1;
                bArr[i12] = (byte) (i11 >> 10);
                i12 += 2;
                bArr[i16] = (byte) (i11 >> 2);
            }
            if (i12 == i3) {
                return bArr;
            }
            byte[] bArr2 = new byte[i12];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, i12);
            return bArr2;
        }
        throw new java.lang.IllegalArgumentException("bad base-64");
    }

    public static byte[] b(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = B4.f.f696h;
        int i3 = (length / 3) * 4;
        if (length % 3 > 0) {
            i3 += 4;
        }
        byte[] bArr3 = new byte[i3];
        int i9 = 0;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            int i12 = i9 + 3;
            if (i12 > length) {
                break;
            }
            int i13 = (bArr[i9 + 2] & 255) | ((bArr[i9] & 255) << 16) | ((bArr[i9 + 1] & 255) << 8);
            bArr3[i11] = bArr2[(i13 >> 18) & 63];
            bArr3[i11 + 1] = bArr2[(i13 >> 12) & 63];
            bArr3[i11 + 2] = bArr2[(i13 >> 6) & 63];
            bArr3[i11 + 3] = bArr2[i13 & 63];
            int i14 = i11 + 4;
            i10--;
            if (i10 == 0) {
                i11 += 5;
                bArr3[i14] = 10;
                i10 = 19;
            } else {
                i11 = i14;
            }
            i9 = i12;
        }
        if (i9 == length - 1) {
            int i15 = (bArr[i9] & 255) << 4;
            bArr3[i11] = bArr2[(i15 >> 6) & 63];
            bArr3[i11 + 1] = bArr2[i15 & 63];
            bArr3[i11 + 2] = 61;
            bArr3[i11 + 3] = 61;
            return bArr3;
        }
        if (i9 == length - 2) {
            int i16 = ((bArr[i9 + 1] & 255) << 2) | ((bArr[i9] & 255) << 10);
            bArr3[i11] = bArr2[(i16 >> 12) & 63];
            bArr3[i11 + 1] = bArr2[(i16 >> 6) & 63];
            bArr3[i11 + 2] = bArr2[i16 & 63];
            bArr3[i11 + 3] = 61;
        }
        return bArr3;
    }
}
